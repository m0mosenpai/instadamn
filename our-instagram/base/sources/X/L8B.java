package X;

import android.view.ViewStub;

/* loaded from: classes8.dex */
public final class L8B {
    public long A00;
    public C47557KzS A01;
    public String A02;
    public String A03;
    public final ViewStub A04;
    public final C159807Es A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;

    public L8B(ViewStub viewStub, C159807Es c159807Es) {
        C14360o3.A0B(viewStub, 1);
        this.A04 = viewStub;
        this.A05 = c159807Es;
        this.A07 = C1XM.A00(new MHI(this, 13));
        this.A06 = C1XM.A00(new MHI(this, 12));
        this.A09 = C1XM.A00(new MHI(this, 15));
        this.A08 = C1XM.A00(new MHI(this, 14));
    }

    public final boolean A00() {
        InterfaceC09390do interfaceC09390do = this.A07;
        if (interfaceC09390do.CWa() && AbstractC166987dD.A0d(interfaceC09390do).getVisibility() == 0) {
            return true;
        }
        return false;
    }
}
