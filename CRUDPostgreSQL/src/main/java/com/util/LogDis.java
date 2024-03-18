package com.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.clientpostgreslrestapi.controller.PersonaRestDisController;


/**
 * 
 * @author Luis Zavala
 * @version 0.0.1
 * */
public class LogDis {

	private static String getTrace() {
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		String pila = stackTrace[3].getClassName();
		int line = stackTrace[3].getLineNumber();

		String metodo = getCurrentOperation();
		return "[" + metodo + "]" + pila + ":" + line + " - ";
	}

	static Class<?> claseController;

	private static String getCurrentOperation() {
		String method = null;
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

		for (int i = 0; i < stackTrace.length; i++) {
			StackTraceElement stackTraceElement = stackTrace[i];

			if (stackTraceElement.getClassName().equals(claseController.getCanonicalName())) {
				method = stackTraceElement.getMethodName();
			}
		}
		return method;
	}

	private static void setClassController(Class<?> clase) {
		claseController = clase;
	}

	private static Logger getLogginInternal() {
		setClassController(PersonaRestDisController.class);
		String metodo = getCurrentOperation();
		org.slf4j.Logger log = null;

		if (metodo.equals("listar")) {
			log = LoggerFactory.getLogger("listarPersonas");

		} else if (metodo.equals("insertar")) {
			log = LoggerFactory.getLogger("insertar");
		} else if (metodo.equals("modificar")) {
			log = LoggerFactory.getLogger("modificar");
		} else if (metodo.equals("eliminar")) {
			log = LoggerFactory.getLogger("eliminar");
		} else {
			log = LoggerFactory.getLogger(LogDis.class);
		}
		return log;
	}

	public static void info(String msg) {
		Logger logger = getLogginInternal();
		logger.info(getTrace() + msg);
	}

	public static void trace(String msg) {
		Logger logger = getLogginInternal();
		logger.trace(getTrace() + msg);
	}

	public static void trace(String format, Object arg) {
		Logger logger = getLogginInternal();
		logger.trace(getTrace() + format, arg);
	}

	public static void trace(String format, Object arg1, Object arg2) {
		Logger logger = getLogginInternal();
		logger.trace(getTrace() + format, arg1, arg2);
	}

	public static void trace(String format, Object... arguments) {
		Logger logger = getLogginInternal();
		logger.trace(getTrace() + format, arguments);
	}

	public static void trace(String msg, Throwable t) {
		Logger logger = getLogginInternal();
		logger.trace(getTrace() + msg, t);
	}

	public static void debug(String msg) {
		Logger logger = getLogginInternal();
		logger.debug(getTrace() + msg);
	}

	public static void debug(String format, Object arg) {
		Logger logger = getLogginInternal();
		logger.debug(getTrace() + format, arg);
	}

	public static void debug(String format, Object arg1, Object arg2) {
		Logger logger = getLogginInternal();
		logger.debug(getTrace() + format, arg1, arg2);
	}

	public static void debug(String format, Object... arguments) {
		Logger logger = getLogginInternal();
		logger.debug(getTrace() + format, arguments);
	}

	public static void debug(String msg, Throwable t) {
		Logger logger = getLogginInternal();
		logger.debug(getTrace() + msg, t);
	}

	public static void info(String format, Object arg) {
		Logger logger = getLogginInternal();
		logger.info(getTrace() + format, arg);
	}

	public static void info(String format, Object arg1, Object arg2) {
		Logger logger = getLogginInternal();
		logger.info(getTrace() + format, arg1, arg2);
	}

	public static void info(String format, Object... arguments) {
		Logger logger = getLogginInternal();
		logger.info(getTrace() + format, arguments);
	}

	public static void info(String msg, Throwable t) {
		Logger logger = getLogginInternal();
		logger.info(getTrace() + msg, t);
	}

	public static void warn(String msg) {
		Logger logger = getLogginInternal();
		logger.warn(getTrace() + msg);
	}

	public static void warn(String format, Object arg) {
		Logger logger = getLogginInternal();
		logger.warn(getTrace() + format, arg);
	}

	public static void warn(String format, Object... arguments) {
		Logger logger = getLogginInternal();
		logger.warn(getTrace() + format, arguments);
	}

	public static void warn(String format, Object arg1, Object arg2) {
		Logger logger = getLogginInternal();
		logger.warn(getTrace() + format, arg1, arg2);
	}

	public static void warn(String msg, Throwable t) {
		Logger logger = getLogginInternal();
		logger.warn(getTrace() + msg, t);
	}

	public static void error(String msg) {
		Logger logger = getLogginInternal();
		logger.error(getTrace() + msg);
	}

	public static void error(String format, Object arg) {
		Logger logger = getLogginInternal();
		logger.error(getTrace() + format, arg);
	}

	public static void error(String format, Object arg1, Object arg2) {
		Logger logger = getLogginInternal();
		logger.error(getTrace() + format, arg1, arg2);
	}

	public static void error(String format, Object... arguments) {
		Logger logger = getLogginInternal();
		logger.error(getTrace() + format, arguments);
	}

	public static void error(String msg, Throwable t) {
		Logger logger = getLogginInternal();
		logger.error(getTrace() + msg, t);
	}
}
//System.out.println("[" + i + "] " + stackTraceElement.getLineNumber() + " " + stackTraceElement.getFileName() + " " + stackTraceElement.getClassName() + " getMethodName:" + stackTraceElement.getMethodName());