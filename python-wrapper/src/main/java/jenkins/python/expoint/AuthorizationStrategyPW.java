package jenkins.python.expoint;


import hudson.DescriptorExtensionList;
import hudson.Extension;
import hudson.ExtensionPoint;
import hudson.model.*;
import hudson.slaves.Cloud;
import hudson.util.DescriptorList;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import jenkins.model.Jenkins;
import net.sf.json.JSONObject;
import org.acegisecurity.Authentication;
import org.acegisecurity.acls.sid.Sid;
import org.kohsuke.stapler.StaplerRequest;
import hudson.security.*;
import hudson.security.AuthorizationStrategy.*;
import hudson.model.AbstractDescribableImpl.*;
import jenkins.python.DataConvertor;
import jenkins.python.PythonExecutor;

/**
 * This class was automatically generated by the PWM tool on 2014/03/21.
 * @see hudson.security.AuthorizationStrategy
 */
public abstract class AuthorizationStrategyPW extends AuthorizationStrategy {
	private transient PythonExecutor pexec;

	private void initPython() {
		if (pexec == null) {
			pexec = new PythonExecutor(this);
			String[] jMethods = new String[2];
			jMethods[0] = "getRootACL";
			jMethods[1] = "getGroups";
			String[] pFuncs = new String[2];
			pFuncs[0] = "get_root_acl";
			pFuncs[1] = "get_groups";
			Class[][] argTypes = new Class[2][];
			argTypes[0] = new Class[0];
			argTypes[1] = new Class[0];
			pexec.checkAbstrMethods(jMethods, pFuncs, argTypes);
			String[] functions = new String[8];
			functions[0] = "get_acl";
			functions[1] = "get_acl";
			functions[2] = "get_acl";
			functions[3] = "get_acl";
			functions[4] = "get_acl";
			functions[5] = "get_acl";
			functions[6] = "get_acl";
			functions[7] = "get_descriptor";
			int[] argsCount = new int[8];
			argsCount[0] = 1;
			argsCount[1] = 1;
			argsCount[2] = 1;
			argsCount[3] = 1;
			argsCount[4] = 1;
			argsCount[5] = 1;
			argsCount[6] = 1;
			argsCount[7] = 0;
			pexec.registerFunctions(functions, argsCount);
		}
	}

	@Override
	public ACL getRootACL() {
		initPython();
		return (ACL) pexec.execPython("get_root_acl");
	}

	@Override
	public Collection<String> getGroups() {
		initPython();
		return (Collection) pexec.execPython("get_groups");
	}

	@Override
	public ACL getACL(Job<?, ?> project) {
		initPython();
		if (pexec.isImplemented(0)) {
			return (ACL) pexec.execPython("get_acl", project);
		} else {
			return super.getACL(project);
		}
	}

	@Override
	public ACL getACL(final View item) {
		initPython();
		if (pexec.isImplemented(1)) {
			return (ACL) pexec.execPython("get_acl", item);
		} else {
			return super.getACL(item);
		}
	}

	@Override
	public ACL getACL(AbstractItem item) {
		initPython();
		if (pexec.isImplemented(2)) {
			return (ACL) pexec.execPython("get_acl", item);
		} else {
			return super.getACL(item);
		}
	}

	@Override
	public ACL getACL(User user) {
		initPython();
		if (pexec.isImplemented(3)) {
			return (ACL) pexec.execPython("get_acl", user);
		} else {
			return super.getACL(user);
		}
	}

	@Override
	public ACL getACL(Computer computer) {
		initPython();
		if (pexec.isImplemented(4)) {
			return (ACL) pexec.execPython("get_acl", computer);
		} else {
			return super.getACL(computer);
		}
	}

	@Override
	public ACL getACL(Cloud cloud) {
		initPython();
		if (pexec.isImplemented(5)) {
			return (ACL) pexec.execPython("get_acl", cloud);
		} else {
			return super.getACL(cloud);
		}
	}

	@Override
	public ACL getACL(Node node) {
		initPython();
		if (pexec.isImplemented(6)) {
			return (ACL) pexec.execPython("get_acl", node);
		} else {
			return super.getACL(node);
		}
	}

	@Override
	public Descriptor<AuthorizationStrategy> getDescriptor() {
		initPython();
		if (pexec.isImplemented(7)) {
			return (Descriptor) pexec.execPython("get_descriptor");
		} else {
			return super.getDescriptor();
		}
	}

	public ACL superGetACL(Job<?, ?> project) {
		return super.getACL(project);
	}

	public ACL superGetACL(final View item) {
		return super.getACL(item);
	}

	public ACL superGetACL(AbstractItem item) {
		return super.getACL(item);
	}

	public ACL superGetACL(User user) {
		return super.getACL(user);
	}

	public ACL superGetACL(Computer computer) {
		return super.getACL(computer);
	}

	public ACL superGetACL(Cloud cloud) {
		return super.getACL(cloud);
	}

	public ACL superGetACL(Node node) {
		return super.getACL(node);
	}

	public Descriptor<AuthorizationStrategy> superGetDescriptor() {
		return super.getDescriptor();
	}

	public Object execPython(String function, Object... params) {
		initPython();
		return pexec.execPython(function, params);
	}

	public byte execPythonByte(String function, Object... params) {
		initPython();
		return pexec.execPythonByte(function, params);
	}

	public short execPythonShort(String function, Object... params) {
		initPython();
		return pexec.execPythonShort(function, params);
	}

	public char execPythonChar(String function, Object... params) {
		initPython();
		return pexec.execPythonChar(function, params);
	}

	public int execPythonInt(String function, Object... params) {
		initPython();
		return pexec.execPythonInt(function, params);
	}

	public long execPythonLong(String function, Object... params) {
		initPython();
		return pexec.execPythonLong(function, params);
	}

	public float execPythonFloat(String function, Object... params) {
		initPython();
		return pexec.execPythonFloat(function, params);
	}

	public double execPythonDouble(String function, Object... params) {
		initPython();
		return pexec.execPythonDouble(function, params);
	}

	public boolean execPythonBool(String function, Object... params) {
		initPython();
		return pexec.execPythonBool(function, params);
	}

	public void execPythonVoid(String function, Object... params) {
		initPython();
		pexec.execPythonVoid(function, params);
	}
}
