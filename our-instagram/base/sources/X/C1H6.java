package X;

import android.content.Context;

/* renamed from: X.1H6, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1H6 {
    public static InterfaceC08830cm A00;
    public static InterfaceC19630xq A01;
    public static int[] A02;

    public static InterfaceC19630xq A00() {
        InterfaceC19630xq interfaceC19630xq = A01;
        if (interfaceC19630xq == null) {
            C17320tT A012 = AbstractC19750y3.A01("ig_device_theme");
            A01 = A012;
            return A012;
        }
        return interfaceC19630xq;
    }

    public static void A01(Context context) {
        InterfaceC08830cm interfaceC08830cm = A00;
        int[] iArr = A02;
        if (iArr == null && interfaceC08830cm != null) {
            iArr = (int[]) interfaceC08830cm.get();
            A02 = iArr;
        }
        if (iArr != null) {
            for (int i : iArr) {
                context.getTheme().applyStyle(i, true);
            }
        }
    }

    public static boolean A03() {
        int A002 = AbstractC19730y1.A00(AbstractC12960li.A00).A00();
        if (A002 != 2) {
            if (A002 == -1 && (A00().getInt("KEY_CONFIG_CURRENT_SYSTEM_UI_MODE", -1) & 48) == 32) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static void A02(Context context, int i) {
        if (i != A00().getInt("KEY_CONFIG_UI_MODE", -1)) {
            A01(context);
            C41451vu.A01.A01(new C2W4(context));
            InterfaceC19610xo ARD = A00().ARD();
            ARD.E7D("KEY_CONFIG_UI_MODE", i);
            ARD.apply();
        }
    }
}
