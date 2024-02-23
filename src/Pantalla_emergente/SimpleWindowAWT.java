/*
package Pantalla_emergente;

public class SimpleWindowAWT {
    public static void main(String[] args) throws Exception {
        // Create a window
        Object frame = createObject("java.awt.Frame");
        invokeMethod(frame, "setTitle", "Text Input Window");
        invokeMethod(frame, "setSize", 400, 150);
        invokeMethod(frame, "setLayout", createObject("java.awt.FlowLayout"));

        // Create text field
        Object textField = createObject("java.awt.TextField", 20);

        // Create button
        Object sendButton = createObject("java.awt.Button", "Send");

        // Add components to the frame
        invokeMethod(frame, "add", textField);
        invokeMethod(frame, "add", sendButton);

        // Set up action listener
        invokeMethod(sendButton, "addActionListener", createProxy("java.awt.event.ActionListener",
                (proxy, method, args1) -> {
                    String userInput = (String) invokeMethod(textField, "getText");
                    System.out.println("User Input: " + userInput);
                    return null;
                }));

        // Make the frame visible
        invokeMethod(frame, "setVisible", true);
    }

    private static Object createObject(String className, Object... args) throws Exception {
        Class<?> clazz = Class.forName(className);
        if (args.length == 0) {
            return clazz.getDeclaredConstructor().newInstance();
        } else {
            Class<?>[] parameterTypes = new Class[args.length];
            for (int i = 0; i < args.length; i++) {
                parameterTypes[i] = args[i].getClass();
            }
            return clazz.getDeclaredConstructor(parameterTypes).newInstance(args);
        }
    }

    private static Object createProxy(String interfaceName, InvocationHandler handler) {
        return java.lang.reflect.Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                new Class<?>[]{Class.forName(interfaceName)},
                handler);
    }

    private static void invokeMethod(Object obj, String methodName, Object... args) throws Exception {
        Class<?>[] parameterTypes = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            parameterTypes[i] = args[i].getClass();
        }
        java.lang.reflect.Method method = obj.getClass().getMethod(methodName, parameterTypes);
        method.invoke(obj, args);
    }
}

 */