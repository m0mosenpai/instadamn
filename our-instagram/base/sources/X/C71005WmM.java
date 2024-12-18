package X;

import com.facebook.R;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.WmM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71005WmM implements XLP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ C75113Zb A02;
    public final /* synthetic */ C189478aR A03;
    public final /* synthetic */ WFV A04;
    public final /* synthetic */ String A05;

    @Override // X.XB3
    public final void Cpy(SavedCollection savedCollection) {
    }

    public C71005WmM(C38321qM c38321qM, C75113Zb c75113Zb, C189478aR c189478aR, WFV wfv, String str, int i) {
        this.A03 = c189478aR;
        this.A04 = wfv;
        this.A01 = c38321qM;
        this.A02 = c75113Zb;
        this.A00 = i;
        this.A05 = str;
    }

    @Override // X.XLP
    public final void APe() {
        this.A03.A07();
    }

    @Override // X.XLP
    public final void ARm(int i) {
        C189478aR c189478aR = this.A03;
        C189458aP c189458aP = new C189458aP(null, null, "", 0, 0);
        c189458aP.A02 = R.drawable.instagram_add_pano_outline_24;
        WFV wfv = this.A04;
        c189458aP.A05 = new WMn(this.A01, this.A02, c189478aR, wfv, this.A05, this.A00, i);
        c189458aP.A07 = AbstractC166997dE.A0p(wfv.A00, 2131968437);
        c189478aR.A0K(c189458aP.A00(), true);
    }

    @Override // X.XLP
    public final void Epj() {
        WFV wfv = this.A04;
        C189478aR c189478aR = this.A03;
        WFV.A01(this.A01, this.A02, c189478aR, wfv, this.A05, this.A00, 0, false);
    }
}
