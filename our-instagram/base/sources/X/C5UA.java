package X;

/* renamed from: X.5UA, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5UA {
    public static final Object A00 = new Object();

    public static final C5TR A01(C5Tl c5Tl, Object obj, int i) {
        if (C0fH.A02()) {
            C0fH.A01(634341122, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:628)");
        }
        Object EEc = c5Tl.EEc();
        if (EEc == C5UI.A00) {
            EEc = new C5TR(i, true, obj);
            c5Tl.FBy(EEc);
        }
        C5TR c5tr = (C5TR) EEc;
        c5tr.A0A(obj);
        if (C0fH.A02()) {
            C0fH.A00(222214924);
        }
        return c5tr;
    }

    public static final C5TR A03(Object obj, int i) {
        return new C5TR(i, true, obj);
    }

    public static final C5TR A04(Object obj, int i, boolean z) {
        return new C5TR(i, z, obj);
    }

    public static final boolean A05(C5UV c5uv, C5UV c5uv2) {
        C117595Tu c117595Tu;
        if (c5uv != null) {
            if ((c5uv instanceof C5UU) && (c5uv2 instanceof C5UU)) {
                C5UU c5uu = (C5UU) c5uv;
                if (c5uu.A05 == null || (c117595Tu = c5uu.A04) == null || c117595Tu.A00 == Integer.MIN_VALUE || c5uv.equals(c5uv2) || C14360o3.A0K(c5uu.A04, ((C5UU) c5uv2).A04)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static final C5TR A00(C5Tl c5Tl, Object obj) {
        C5TR c5tr;
        c5Tl.EnY(Integer.rotateLeft(-819894182, 1), A00);
        Object EEc = c5Tl.EEc();
        if (EEc == C5UI.A00) {
            c5tr = new C5TR(-819894182, true, obj);
            c5Tl.FBy(c5tr);
        } else {
            C14360o3.A0C(EEc, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            c5tr = (C5TR) EEc;
            c5tr.A0A(obj);
        }
        C117505Tk.A0I((C117505Tk) c5Tl);
        return c5tr;
    }

    public static final C5TR A02(Object obj) {
        return new C5TR(-632812321, true, obj);
    }
}
