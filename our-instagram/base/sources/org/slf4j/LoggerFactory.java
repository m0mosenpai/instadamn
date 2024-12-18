package org.slf4j;

import X.AnonymousClass001;
import X.C4PQ;
import X.C4PR;
import X.C4PS;
import X.C4Pe;
import X.InterfaceC94984Ph;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import org.slf4j.impl.StaticLoggerBinder;

/* loaded from: classes2.dex */
public final class LoggerFactory {
    public static int A00;
    public static C4PQ A02 = new C4PQ();
    public static C4PS A01 = new Object();
    public static final String[] A03 = {"1.6", "1.7"};

    public static InterfaceC94984Ph getLogger(String str) {
        C4PR c4pr;
        String[] strArr;
        Enumeration<URL> resources;
        if (A00 == 0) {
            A00 = 1;
            try {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = LoggerFactory.class.getClassLoader();
                    if (classLoader == null) {
                        resources = ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class");
                    } else {
                        resources = classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    }
                    while (resources.hasMoreElements()) {
                        linkedHashSet.add(resources.nextElement());
                    }
                } catch (IOException e) {
                    System.err.println("Error getting resources from path");
                    System.err.println("Reported exception:");
                    e.printStackTrace();
                }
                if (linkedHashSet.size() > 1) {
                    C4Pe.A00("Class path contains multiple SLF4J bindings.");
                    for (Object obj : linkedHashSet) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Found binding in [");
                        sb.append(obj);
                        sb.append("]");
                        C4Pe.A00(sb.toString());
                    }
                    C4Pe.A00("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
                }
                StaticLoggerBinder.getSingleton();
                A00 = 3;
                if (linkedHashSet.size() > 1) {
                    C4Pe.A00(AnonymousClass001.A0g("Actual binding is of type [", StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr(), "]"));
                }
                C4PQ c4pq = A02;
                ArrayList arrayList = new ArrayList();
                List list = c4pq.A00;
                synchronized (list) {
                    arrayList.addAll(list);
                }
                if (arrayList.size() != 0) {
                    C4Pe.A00("The following loggers will not work because they were created");
                    C4Pe.A00("during the default configuration phase of the underlying logging system.");
                    C4Pe.A00("See also http://www.slf4j.org/codes.html#substituteLogger");
                    for (int i = 0; i < arrayList.size(); i++) {
                        C4Pe.A00((String) arrayList.get(i));
                    }
                }
            } catch (Exception e2) {
                A00 = 2;
                System.err.println("Failed to instantiate SLF4J LoggerFactory");
                System.err.println("Reported exception:");
                e2.printStackTrace();
                throw new IllegalStateException("Unexpected initialization failure", e2);
            } catch (NoClassDefFoundError e3) {
                String message = e3.getMessage();
                if (message != null && (message.indexOf("org/slf4j/impl/StaticLoggerBinder") != -1 || message.indexOf("org.slf4j.impl.StaticLoggerBinder") != -1)) {
                    A00 = 4;
                    C4Pe.A00("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                    C4Pe.A00("Defaulting to no-operation (NOP) logger implementation");
                    C4Pe.A00("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                } else {
                    A00 = 2;
                    System.err.println("Failed to instantiate SLF4J LoggerFactory");
                    System.err.println("Reported exception:");
                    e3.printStackTrace();
                    throw e3;
                }
            } catch (NoSuchMethodError e4) {
                String message2 = e4.getMessage();
                if (message2 != null && message2.indexOf("org.slf4j.impl.StaticLoggerBinder.getSingleton()") != -1) {
                    A00 = 2;
                    C4Pe.A00("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                    C4Pe.A00("Your binding is version 1.5.5 or earlier.");
                    C4Pe.A00("Upgrade your binding to version 1.6.x.");
                }
                throw e4;
            }
            if (A00 == 3) {
                try {
                    String str2 = StaticLoggerBinder.REQUESTED_API_VERSION;
                    int i2 = 0;
                    boolean z = false;
                    while (true) {
                        strArr = A03;
                        if (i2 >= 2) {
                            break;
                        }
                        if (str2.startsWith(strArr[i2])) {
                            z = true;
                        }
                        i2++;
                    }
                    if (!z) {
                        C4Pe.A00(AnonymousClass001.A0u("The requested version ", str2, " by your slf4j binding is not compatible with ", Arrays.asList(strArr).toString()));
                        C4Pe.A00("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
                    }
                } catch (NoSuchFieldError unused) {
                } catch (Throwable th) {
                    System.err.println("Unexpected problem occured during version sanity check");
                    System.err.println("Reported exception:");
                    th.printStackTrace();
                }
            }
        }
        int i3 = A00;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        c4pr = A01;
                    } else {
                        throw new IllegalStateException("Unreachable code");
                    }
                } else {
                    c4pr = StaticLoggerBinder.getSingleton().getLoggerFactory();
                }
            } else {
                throw new IllegalStateException("org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
            }
        } else {
            c4pr = A02;
        }
        return c4pr.BOi(str);
    }
}
