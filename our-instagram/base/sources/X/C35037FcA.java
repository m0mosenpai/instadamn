package X;

/* renamed from: X.FcA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35037FcA {
    public C34384FEa A00;
    public C19280xC A01;
    public AbstractC12990ll A02;

    public static C34384FEa A00(C35037FcA c35037FcA) {
        C34384FEa c34384FEa = c35037FcA.A00;
        if (c34384FEa == null) {
            return new C34384FEa();
        }
        return c34384FEa;
    }

    public static void A01(C35037FcA c35037FcA, boolean z) {
        c35037FcA.A05("is_account_linked", z);
        c35037FcA.A02();
    }

    public final void A02() {
        AbstractC11060iN.A00(this.A02).EHW(this.A01);
    }

    public final void A03(String str, int i) {
        this.A01.A08(Integer.valueOf(i), str);
        synchronized (A00(this)) {
        }
    }

    public final void A04(String str, String str2) {
        this.A01.A0C(str, str2);
        synchronized (A00(this)) {
        }
    }

    public final void A05(String str, boolean z) {
        this.A01.A09(str, Boolean.valueOf(z));
        synchronized (A00(this)) {
        }
    }
}
