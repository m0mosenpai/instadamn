package X;

import java.util.List;

/* renamed from: X.3ci, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC76963ci {
    public static final C2WF A00(C2Z0 c2z0) {
        return new C2WF(null, null, null, c2z0.A01, false);
    }

    public static final C2WF A01(C2Z0 c2z0, C2Z1 c2z1, C51722Yv c51722Yv) {
        return A06(c2z0, c2z1, c51722Yv, null, EnumC77683ds.CENTER, null, false);
    }

    public static final C2WF A02(C2Z0 c2z0, C2Z1 c2z1, C51722Yv c51722Yv) {
        return A06(c2z0, c2z1, c51722Yv, null, null, C3e8.FLEX_END, false);
    }

    public static final C2WF A03(C2Z0 c2z0, C2Z1 c2z1, C51722Yv c51722Yv) {
        return A06(c2z0, c2z1, c51722Yv, null, null, null, false);
    }

    public static final C2WF A04(C2Z0 c2z0, C2Z1 c2z1, C51722Yv c51722Yv) {
        return A06(c2z0, c2z1, c51722Yv, null, null, C3e8.CENTER, false);
    }

    public static final C2WF A05(C2Z0 c2z0, C2Z1 c2z1, C51722Yv c51722Yv) {
        return A06(c2z0, c2z1, c51722Yv, null, EnumC77683ds.CENTER, C3e8.CENTER, false);
    }

    public static final C2WF A06(C2Z0 c2z0, C2Z1 c2z1, C51722Yv c51722Yv, EnumC77683ds enumC77683ds, EnumC77683ds enumC77683ds2, C3e8 c3e8, boolean z) {
        C2WF c2wf = new C2WF(enumC77683ds, enumC77683ds2, c3e8, c2z0 != null ? c2z0.A01 : null, z);
        if (c51722Yv != null) {
            c51722Yv.A01(c2wf.A0a(), c2z1.ArD());
        }
        return c2wf;
    }

    public static final C2WF A07(C2Z0 c2z0, C2Z1 c2z1, C51722Yv c51722Yv, EnumC77683ds enumC77683ds, C3e8 c3e8) {
        return A06(c2z0, c2z1, c51722Yv, null, enumC77683ds, c3e8, false);
    }

    public static final C2WF A08(C2Z0 c2z0, C2Z1 c2z1, C51722Yv c51722Yv, C3e8 c3e8) {
        return A06(c2z0, c2z1, c51722Yv, null, EnumC77683ds.CENTER, c3e8, false);
    }

    public static final C2WF A09(C2Z1 c2z1, C51722Yv c51722Yv) {
        return A06(null, c2z1, c51722Yv, null, null, null, false);
    }

    public static final C2WH A0A(C2Z0 c2z0, C2Z1 c2z1) {
        return A0J(c2z0, c2z1, null, null, null, null, null, null, false);
    }

    public static final C2WH A0B(C2Z0 c2z0, C2Z1 c2z1, C51722Yv c51722Yv) {
        return A0J(c2z0, c2z1, c51722Yv, null, null, null, C3e8.FLEX_END, null, false);
    }

    public static final C2WH A0C(C2Z0 c2z0, C2Z1 c2z1, C51722Yv c51722Yv) {
        return A0J(c2z0, c2z1, c51722Yv, null, null, EnumC77683ds.CENTER, C3e8.FLEX_START, null, false);
    }

    public static final C2WH A0D(C2Z0 c2z0, C2Z1 c2z1, C51722Yv c51722Yv) {
        return A0J(c2z0, c2z1, c51722Yv, null, null, EnumC77683ds.FLEX_START, null, null, false);
    }

    public static final C2WH A0E(C2Z0 c2z0, C2Z1 c2z1, C51722Yv c51722Yv) {
        return A0J(c2z0, c2z1, c51722Yv, null, null, EnumC77683ds.FLEX_END, null, null, false);
    }

    public static final C2WH A0F(C2Z0 c2z0, C2Z1 c2z1, C51722Yv c51722Yv) {
        return A0J(c2z0, c2z1, c51722Yv, null, null, null, C3e8.CENTER, null, false);
    }

    public static final C2WH A0G(C2Z0 c2z0, C2Z1 c2z1, C51722Yv c51722Yv) {
        return A0J(c2z0, c2z1, c51722Yv, null, null, EnumC77683ds.CENTER, C3e8.CENTER, null, false);
    }

    public static final C2WH A0H(C2Z0 c2z0, C2Z1 c2z1, C51722Yv c51722Yv) {
        return A0J(c2z0, c2z1, c51722Yv, null, null, EnumC77683ds.CENTER, null, null, false);
    }

    public static final C2WH A0I(C2Z0 c2z0, C2Z1 c2z1, C51722Yv c51722Yv) {
        return A0J(c2z0, c2z1, c51722Yv, null, null, null, null, null, false);
    }

    public static final C2WH A0J(C2Z0 c2z0, C2Z1 c2z1, C51722Yv c51722Yv, C2Z3 c2z3, EnumC77683ds enumC77683ds, EnumC77683ds enumC77683ds2, C3e8 c3e8, EnumC115945Mk enumC115945Mk, boolean z) {
        Integer num;
        C14360o3.A0B(c2z1, 0);
        List list = null;
        if (c2z3 != null) {
            num = Integer.valueOf(C2Z3.A00(c2z1.BoZ(), c2z3.A00));
        } else {
            num = null;
        }
        if (c2z0 != null) {
            list = c2z0.A01;
        }
        C2WH c2wh = new C2WH(enumC77683ds, enumC77683ds2, c3e8, enumC115945Mk, num, list, z);
        if (c51722Yv != null) {
            c51722Yv.A01(c2wh.A0a(), c2z1.ArD());
        }
        return c2wh;
    }

    public static final C2WH A0K(C2Z0 c2z0, C2Z1 c2z1, C51722Yv c51722Yv, EnumC77683ds enumC77683ds, C3e8 c3e8) {
        return A0J(c2z0, c2z1, c51722Yv, null, null, enumC77683ds, c3e8, null, false);
    }

    public static final C2WH A0L(C2Z0 c2z0, C2Z1 c2z1, C51722Yv c51722Yv, C3e8 c3e8) {
        return A0J(c2z0, c2z1, c51722Yv, null, null, EnumC77683ds.CENTER, c3e8, null, false);
    }

    public static final C2WH A0M(C2Z1 c2z1, C51722Yv c51722Yv) {
        return A0J(null, c2z1, c51722Yv, null, null, null, null, null, false);
    }
}
