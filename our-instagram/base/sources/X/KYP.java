package X;

/* loaded from: classes8.dex */
public final class KYP extends C33H {
    public final /* synthetic */ C148376m7 A00;
    public final /* synthetic */ String A01;

    public KYP(C148376m7 c148376m7, String str) {
        this.A00 = c148376m7;
        this.A01 = str;
    }

    @Override // X.C33H, X.C33I
    public final void Dtt(C5SW c5sw) {
        InterfaceC19610xo A0j;
        int i;
        C148376m7 c148376m7 = this.A00;
        String str = this.A01;
        if (C14360o3.A0K(str, "story_remix_reply")) {
            A0j = AbstractC43594JPz.A0j(c148376m7.A06);
            i = 4552;
        } else {
            if (!C14360o3.A0K(str, "story_selfie_reply")) {
                return;
            }
            A0j = AbstractC43594JPz.A0j(c148376m7.A06);
            i = 4553;
        }
        A0j.E77(AbstractC111324zv.A00(i), true);
        A0j.apply();
    }
}
