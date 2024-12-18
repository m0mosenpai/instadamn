package X;

/* renamed from: X.Mgi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51034Mgi extends AbstractC52922bZ {
    public final C152406tQ A00;
    public final InterfaceC19390xP A01;
    public final C05A A02;

    public C51034Mgi(C152406tQ c152406tQ) {
        C14360o3.A0B(c152406tQ, 1);
        this.A00 = c152406tQ;
        C008002u A0y = MSZ.A0y();
        this.A02 = A0y;
        this.A01 = AbstractC208910l.A02(A0y);
    }

    public static final void A01(C51034Mgi c51034Mgi) {
        boolean A1a;
        C05A c05a = c51034Mgi.A02;
        C152406tQ c152406tQ = c51034Mgi.A00;
        Boolean A0e = AbstractC50522MSa.A0e(c152406tQ, "IS_PROMO_VIDEO");
        if (A0e != null) {
            A1a = A0e.booleanValue();
        } else {
            Object A00 = c152406tQ.A00("IS_ORIGINAL_MEDIA_PROMO_VIDEO");
            if (A00 != null) {
                A1a = AbstractC166987dD.A1a(A00);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        AbstractC166997dE.A1Y(c05a, A1a);
    }

    public static C152406tQ A00(InterfaceC09390do interfaceC09390do) {
        return ((C51034Mgi) interfaceC09390do.getValue()).A00;
    }
}
