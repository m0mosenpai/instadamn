package X;

/* renamed from: X.Wfm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70721Wfm implements InterfaceC41501vz {
    public final /* synthetic */ C147886lK A00;

    public C70721Wfm(C147886lK c147886lK) {
        this.A00 = c147886lK;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = C0f9.A03(-118580929);
        VBY vby = (VBY) obj;
        int A0N = AbstractC167017dG.A0N(vby, 1283080246);
        C147886lK c147886lK = this.A00;
        String str = c147886lK.A04;
        if (vby.A02.equals(c147886lK.A02) && !vby.A03.equals(str)) {
            C69714Vu9 c69714Vu9 = c147886lK.A01;
            if (c69714Vu9 != null) {
                C71148Woj c71148Woj = new C71148Woj(vby.A00, vby.A01);
                c69714Vu9.A01(new C71147Woi(new C71146Woh(c71148Woj), c71148Woj));
            }
            i = -587134960;
        } else {
            i = 1993617954;
        }
        C0f9.A0A(i, A0N);
        C0f9.A0A(1263783955, A03);
    }
}
