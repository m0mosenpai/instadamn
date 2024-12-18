package X;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;

/* loaded from: classes10.dex */
public abstract class SSN {
    public SSN() {
        throw C00O.createAndThrow();
    }

    public static C63270SgU A00() {
        String format;
        ClassLoader classLoader = SSN.class.getClassLoader();
        if (C63270SgU.class.equals(C63270SgU.class)) {
            format = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else if (C63270SgU.class.getPackage().equals(SSN.class.getPackage())) {
            format = String.format("%s.BlazeGenerated%sLoader", C63270SgU.class.getPackage().getName(), C63270SgU.class.getSimpleName());
        } else {
            throw AbstractC166987dD.A12(C63270SgU.class.getName());
        }
        try {
            try {
                try {
                    Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0]);
                    throw AbstractC166987dD.A15("zza");
                } catch (InstantiationException e) {
                    throw new IllegalStateException(e);
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (IllegalAccessException e3) {
                throw new IllegalStateException(e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(SSN.class, classLoader).iterator();
            ArrayList A1E = AbstractC166987dD.A1E();
            while (it.hasNext()) {
                try {
                    it.next();
                    throw AbstractC166987dD.A15("zza");
                    break;
                } catch (ServiceConfigurationError e5) {
                    AbstractC58319PtB.A17(ROC.class).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(String.valueOf(C63270SgU.class.getSimpleName())), (Throwable) e5);
                }
            }
            if (A1E.size() == 1) {
                return (C63270SgU) A1E.get(0);
            }
            if (A1E.size() == 0) {
                return null;
            }
            try {
                return (C63270SgU) C63270SgU.class.getMethod("combine", Collection.class).invoke(null, A1E);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }
}
