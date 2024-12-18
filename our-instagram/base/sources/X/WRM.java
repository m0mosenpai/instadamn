package X;

/* loaded from: classes11.dex */
public final class WRM implements XE1 {
    public final WFa A00 = new WFa(4);
    public final WRR A01 = new WRR(-1, -1, "image/heif");

    @Override // X.XE1
    public final /* synthetic */ XE1 CCR() {
        return this;
    }

    @Override // X.XE1
    public final boolean EmK(XGj xGj) {
        xGj.AB0(4);
        WFa wFa = this.A00;
        wFa.A0M(4);
        xGj.E3s(wFa.A02, 0, 4);
        if (wFa.A0C() == 1718909296) {
            wFa.A0M(4);
            xGj.E3s(wFa.A02, 0, 4);
            if (wFa.A0C() == 1751476579) {
                return true;
            }
        }
        return false;
    }

    @Override // X.XE1
    public final void CNe(InterfaceC72026XFo interfaceC72026XFo) {
        this.A01.CNe(interfaceC72026XFo);
    }

    @Override // X.XE1
    public final int E7l(XGj xGj, VZk vZk) {
        return this.A01.E7l(xGj, vZk);
    }

    @Override // X.XE1
    public final void EMc(long j, long j2) {
        this.A01.EMc(j, j2);
    }
}
