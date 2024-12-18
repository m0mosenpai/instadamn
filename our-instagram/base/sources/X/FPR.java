package X;

/* loaded from: classes6.dex */
public final class FPR {
    public final /* synthetic */ C33234ElT A00;

    public final void A00(String str, String str2, String str3) {
        C33234ElT c33234ElT = this.A00;
        C33115EjJ c33115EjJ = new C33115EjJ(c33234ElT.A01, this, str2, str, str3);
        AbstractC35091Fd2.A02(c33234ElT.A02, "notifications", AnonymousClass001.A0R(str2, "_setting_changed"));
        c33234ElT.A04.A01(str2, str, "radio");
        C1ON A01 = FXB.A01(c33234ElT.A02, str2, str);
        A01.A00 = c33115EjJ;
        c33234ElT.schedule(A01);
    }

    public FPR(C33234ElT c33234ElT) {
        this.A00 = c33234ElT;
    }
}
