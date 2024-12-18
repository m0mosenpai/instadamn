package X;

import java.lang.reflect.Field;

/* loaded from: classes10.dex */
public final class SVA {
    public static Field A00;
    public static Field A01;
    public static Field A02;
    public static boolean A03;
    public static boolean A04;
    public static boolean A05;

    public static Field A00(String str) {
        try {
            Field declaredField = Class.forName("android.view.ViewRootImpl").getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Exception e) {
            C0K8.A08(SVA.class, "Caught exception when initializing ViewRootImplUtil", e, AbstractC58318PtA.A1b());
            return null;
        }
    }
}
