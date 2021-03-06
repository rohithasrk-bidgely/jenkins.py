package jenkins.python.expoint;


import hudson.Extension;
import hudson.ExtensionList;
import hudson.ExtensionPoint;
import jenkins.model.Jenkins;
import java.util.Collection;
import java.util.Collections;
import hudson.model.*;
import hudson.model.TransientBuildActionFactory.*;
import jenkins.python.DataConvertor;
import jenkins.python.PythonExecutor;

/**
 * This class was automatically generated by the PWM tool on 2014/03/21.
 * @see hudson.model.TransientBuildActionFactory
 */
public abstract class TransientBuildActionFactoryPW extends TransientBuildActionFactory {
	private transient PythonExecutor pexec;

	private void initPython() {
		if (pexec == null) {
			pexec = new PythonExecutor(this);
			String[] jMethods = new String[0];
			String[] pFuncs = new String[0];
			Class[][] argTypes = new Class[0][];
			pexec.checkAbstrMethods(jMethods, pFuncs, argTypes);
			String[] functions = new String[2];
			functions[0] = "create_for";
			functions[1] = "create_for";
			int[] argsCount = new int[2];
			argsCount[0] = 1;
			argsCount[1] = 1;
			pexec.registerFunctions(functions, argsCount);
		}
	}

	@Override
	public Collection<? extends Action> createFor(Run target) {
		initPython();
		if (pexec.isImplemented(0)) {
			return (Collection) pexec.execPython("create_for", target);
		} else {
			return super.createFor(target);
		}
	}

	@Override
	public Collection<? extends Action> createFor(AbstractBuild target) {
		initPython();
		if (pexec.isImplemented(1)) {
			return (Collection) pexec.execPython("create_for", target);
		} else {
			return super.createFor(target);
		}
	}

	public Collection<? extends Action> superCreateFor(Run target) {
		return super.createFor(target);
	}

	public Collection<? extends Action> superCreateFor(AbstractBuild target) {
		return super.createFor(target);
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
