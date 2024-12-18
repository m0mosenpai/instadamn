package X;

/* loaded from: classes9.dex */
public final class PJA implements InterfaceC58004Pno {
    public final /* synthetic */ C53021Nct A00;

    public PJA(C53021Nct c53021Nct) {
        this.A00 = c53021Nct;
    }

    @Override // X.InterfaceC58004Pno
    public final void Dob() {
        long j;
        C53021Nct c53021Nct = this.A00;
        C56805PIw c56805PIw = c53021Nct.A0a;
        PJG pjg = c53021Nct.A0I;
        long j2 = 0;
        if (pjg != null) {
            j = pjg.C9p();
        } else {
            j = 0;
        }
        PJF pjf = c53021Nct.A0H;
        if (pjf != null) {
            j2 = pjf.A00;
        }
        C25531Mh A03 = C56805PIw.A03(c56805PIw, C05F.A08);
        A03.A0Q("rtmp_duration", Long.valueOf(j));
        A03.A0Q("rtc_duration", Long.valueOf(j2));
        A03.Cht();
    }
}
