package X;

/* renamed from: X.IqX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42430IqX implements InterfaceC43409JFz {
    public final int A00;
    public final Object A01;

    public C42430IqX(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC43409JFz
    public final C19260xA E6Z(AbstractC127945qN abstractC127945qN, C38321qM c38321qM) {
        C11520jB E6P;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c38321qM, 0);
                E6P = ((V1R) this.A01).E6P();
                break;
            case 1:
                E6P = ((V1B) this.A01).E6Q(c38321qM);
                break;
            case 2:
                C14360o3.A0B(c38321qM, 0);
                E6P = ((AbstractC67878V0j) this.A01).E6Q(c38321qM);
                IS4.A01(E6P, abstractC127945qN);
                break;
            default:
                C14360o3.A0B(c38321qM, 0);
                E6P = ((C38934HCh) this.A01).E6Q(c38321qM);
                IS4.A01(E6P, abstractC127945qN);
                break;
        }
        return E6P.A00();
    }
}
