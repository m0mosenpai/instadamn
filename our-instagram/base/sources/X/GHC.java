package X;

import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;

/* loaded from: classes6.dex */
public final class GHC implements C7XU {
    public final /* synthetic */ C34726FRp A00;
    public final /* synthetic */ C79983hn A01;
    public final /* synthetic */ C189448aO A02;
    public final /* synthetic */ C7XU A03;
    public final /* synthetic */ C3DN A04;

    public GHC(C34726FRp c34726FRp, C79983hn c79983hn, C189448aO c189448aO, C7XU c7xu, C3DN c3dn) {
        this.A03 = c7xu;
        this.A04 = c3dn;
        this.A00 = c34726FRp;
        this.A02 = c189448aO;
        this.A01 = c79983hn;
    }

    @Override // X.C7XU
    public final void DAy() {
        C34726FRp c34726FRp = this.A00;
        c34726FRp.A08(false);
        DirectShareSheetFragment A00 = c34726FRp.A00();
        C189448aO c189448aO = this.A02;
        c189448aO.A0T = A00;
        AbstractC31173DnH.A1G(this.A01.A00, A00, c189448aO.A00());
    }

    @Override // X.C7XU
    public final void DB3() {
        C7XU c7xu = this.A03;
        if (c7xu != null && ((C3DP) this.A04).A0g) {
            c7xu.DB3();
        }
    }
}
