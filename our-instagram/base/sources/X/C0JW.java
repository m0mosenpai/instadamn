package X;

import com.facebook.common.dextricks.classid.ClassId;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0JW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0JW extends ClassLoader {
    public static C0JW A07;
    public ClassLoader A00;
    public ClassLoader A01;
    public ThreadLocal A02;
    public Field A03;
    public Method A04;
    public AtomicReference A05;
    public boolean A06;

    public final synchronized void A01(C0JX c0jx) {
        AtomicReference atomicReference = this.A05;
        ArrayList arrayList = new ArrayList(((ArrayList) atomicReference.get()).size() + 1);
        arrayList.addAll((Collection) atomicReference.get());
        arrayList.add(c0jx);
        atomicReference.set(arrayList);
        if (((ArrayList) atomicReference.get()).size() == 1) {
            try {
                Class.forName(ClassId.class.getName());
            } catch (ClassNotFoundException unused) {
            }
            ClassLoader classLoader = this.A00;
            String obj = classLoader.toString();
            if (classLoader.getParent().toString().startsWith("java.lang.BootClassLoader") && obj.startsWith("dalvik.system.PathClassLoader")) {
                try {
                    this.A03.set(classLoader, this);
                    this.A06 = true;
                    android.util.Log.w("PluginClassLoader", "Installed PluginClassLoader");
                } catch (IllegalAccessException unused2) {
                    android.util.Log.w("PluginClassLoader", "Failed to install PluginClassLoader");
                }
            } else {
                android.util.Log.w("PluginClassLoader", "Non-standard class loader chain. PluginClassLoader not installed");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0JW, java.lang.ClassLoader] */
    public static C0JW A00() {
        if (A07 == null) {
            try {
                ClassLoader classLoader = C0JW.class.getClassLoader();
                ?? classLoader2 = new ClassLoader(classLoader.getParent());
                classLoader2.A00 = classLoader;
                classLoader2.A01 = classLoader.getParent();
                Method declaredMethod = ClassLoader.class.getDeclaredMethod("findClass", String.class);
                classLoader2.A04 = declaredMethod;
                declaredMethod.setAccessible(true);
                Field declaredField = ClassLoader.class.getDeclaredField("parent");
                classLoader2.A03 = declaredField;
                declaredField.setAccessible(true);
                classLoader2.A05 = new AtomicReference(new ArrayList());
                classLoader2.A02 = new ThreadLocal();
                A07 = classLoader2;
            } catch (NoSuchFieldException | NoSuchMethodException e) {
                android.util.Log.w("PluginClassLoader", "PluginClassLoader.get: failed to create instance", e);
            }
        }
        return A07;
    }

    @Override // java.lang.ClassLoader
    public final Class findClass(String str) {
        ThreadLocal threadLocal = this.A02;
        Object obj = threadLocal.get();
        threadLocal.set(Boolean.TRUE);
        Class cls = null;
        try {
            ArrayList arrayList = (ArrayList) this.A05.get();
            if (obj == null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C0JX) it.next()).AHO(str);
                }
            }
            try {
                cls = (Class) this.A04.invoke(this.A00, str);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
            if (cls != null) {
                if (obj == null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((C0JX) it2.next()).AHM(str, cls);
                    }
                }
                return cls;
            }
            if (obj == null) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((C0JX) it3.next()).AHN(str);
                }
            }
            throw new ClassNotFoundException(str);
        } finally {
            if (obj == null) {
                threadLocal.remove();
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PluginClassLoader[");
        sb.append(this.A00);
        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        sb.append(this.A01);
        sb.append("]");
        return sb.toString();
    }
}
