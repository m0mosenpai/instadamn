package X;

import com.facebook.R;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.WmL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71004WmL implements XLP {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C189478aR A01;
    public final /* synthetic */ WFV A02;
    public final /* synthetic */ XB2 A03;
    public final /* synthetic */ XB3 A04;

    public C71004WmL(C38321qM c38321qM, C189478aR c189478aR, WFV wfv, XB2 xb2, XB3 xb3) {
        this.A04 = xb3;
        this.A01 = c189478aR;
        this.A02 = wfv;
        this.A00 = c38321qM;
        this.A03 = xb2;
    }

    @Override // X.XLP
    public final void APe() {
        this.A01.A07();
    }

    @Override // X.XLP
    public final void ARm(int i) {
        C189478aR c189478aR = this.A01;
        C189458aP c189458aP = new C189458aP(null, null, "", 0, 0);
        c189458aP.A02 = R.drawable.instagram_add_pano_outline_24;
        WFV wfv = this.A02;
        c189458aP.A05 = new ViewOnClickListenerC41993IjO(c189478aR, this.A03, wfv, this.A00, i, 4);
        c189458aP.A07 = AbstractC166997dE.A0p(wfv.A00, 2131968437);
        c189478aR.A0K(c189458aP.A00(), true);
    }

    @Override // X.XLP
    public final void Epj() {
        WFV wfv = this.A02;
        XB2 xb2 = this.A03;
        WFV.A02(this.A00, this.A01, wfv, xb2, 0, false);
    }

    @Override // X.XB3
    public final void Cpy(SavedCollection savedCollection) {
        APe();
        this.A04.Cpy(savedCollection);
    }
}
