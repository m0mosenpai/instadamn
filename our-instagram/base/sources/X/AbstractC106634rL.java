package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.4rL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC106634rL extends C0MA {
    public static Class A00;
    public static Constructor A01;
    public static Method A02;
    public static Method A03;
    public static boolean A04;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Class] */
    public static void A00() {
        ?? r0;
        ?? r5;
        ?? r3;
        if (!A04) {
            A04 = true;
            Constructor<?> constructor = null;
            try {
                r5 = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = r5.getConstructor(new Class[0]);
                Method method = r5.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                constructor = constructor2;
                r0 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) r5, 1).getClass());
                r3 = method;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                android.util.Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                r0 = constructor;
                r5 = constructor;
                r3 = constructor;
            }
            A01 = constructor;
            A00 = r5;
            A02 = r3;
            A03 = r0;
        }
    }

    @Override // X.C0MA
    public Typeface A01(Context context, Resources resources, C72659Xka c72659Xka, int i) {
        A00();
        try {
            Object newInstance = A01.newInstance(new Object[0]);
            for (C72795XnI c72795XnI : c72659Xka.A00) {
                File A002 = AbstractC15460q1.A00(context);
                if (A002 == null) {
                    return null;
                }
                try {
                    if (AbstractC15460q1.A02(resources, A002, c72795XnI.A00)) {
                        String path = A002.getPath();
                        int i2 = c72795XnI.A02;
                        boolean z = c72795XnI.A05;
                        A00();
                        try {
                            if (((Boolean) A02.invoke(newInstance, path, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue()) {
                                A002.delete();
                            }
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    return null;
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    A002.delete();
                }
            }
            A00();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) A00, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) A03.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
