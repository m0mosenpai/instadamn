package X;

/* renamed from: X.858, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass858 extends AbstractC52922bZ {
    public static final C9CB A02 = new C9CB(AnonymousClass859.A08, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
    public final C05A A01 = C10E.A00(A02);
    public final C05A A00 = new C008002u(new C85D(C85B.A03));

    public final C9CB A00(AnonymousClass859 anonymousClass859) {
        C14360o3.A0B(anonymousClass859, 0);
        C9CB c9cb = (C9CB) this.A01.getValue();
        if (C14360o3.A0K(c9cb, A02) || c9cb.A01 != anonymousClass859) {
            return new C9CB(anonymousClass859, "FOR_YOU");
        }
        return c9cb;
    }

    public final boolean A02(String str) {
        C14360o3.A0B(str, 0);
        C85D c85d = (C85D) this.A00.getValue();
        if (c85d instanceof C189118Zc) {
            return C14360o3.A0K(((C189118Zc) c85d).A02, str);
        }
        return false;
    }

    public final void A01(C85B c85b) {
        this.A00.Egh(new C85D(c85b));
    }
}
