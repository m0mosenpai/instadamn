package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class N2Z extends C3DB implements InterfaceC74303Vl {
    public C54375O1h A00;
    public Boolean A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public String A05;
    public List A06;

    @Override // X.InterfaceC74303Vl
    public final boolean CQG() {
        return AbstractC167007dF.A1W(this.A05);
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQT() {
        return false;
    }

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        List list = this.A06;
        C14360o3.A0A(list);
        C54375O1h c54375O1h = this.A00;
        C14360o3.A0A(c54375O1h);
        C14360o3.A0A(this.A01);
        C14360o3.A0A(this.A02);
        return new O74(c54375O1h, list);
    }

    @Override // X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return this.A05;
    }
}
