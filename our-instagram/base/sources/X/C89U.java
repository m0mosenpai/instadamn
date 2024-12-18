package X;

/* renamed from: X.89U, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C89U {
    public static final void A00(C07T c07t, AbstractC52922bZ abstractC52922bZ, C08U c08u) {
        C14360o3.A0B(abstractC52922bZ, 0);
        C14360o3.A0B(c08u, 1);
        C14360o3.A0B(c07t, 2);
        C89V c89v = (C89V) abstractC52922bZ.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (c89v != null && !c89v.A00) {
            c89v.A00(c07t, c08u);
            A01(c07t, c08u);
        }
    }

    public static final void A01(C07T c07t, C08U c08u) {
        C07S A07 = c07t.A07();
        if (A07 != C07S.INITIALIZED && !A07.A00(C07S.STARTED)) {
            c07t.A09(new AU6(c07t, c08u));
        } else {
            c08u.A04(AUW.class);
        }
    }
}
