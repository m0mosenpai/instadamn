package X;

import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.G5k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36435G5k implements InterfaceC50481MQj {
    public final int A00;
    public final Object A01;
    public final Object A02;

    @Override // X.InterfaceC50481MQj
    public final void D90() {
    }

    @Override // X.InterfaceC50481MQj
    public final void DkO() {
    }

    public C36435G5k(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC50481MQj
    public final void DDM(C148336m3 c148336m3) {
        String str;
        IgSimpleImageView igSimpleImageView;
        int i = this.A00;
        ((C189478aR) this.A01).A0L(null);
        Object obj = this.A02;
        if (i != 0) {
            C33147Ejq c33147Ejq = (C33147Ejq) obj;
            str = c148336m3.A02;
            c33147Ejq.A09 = str;
            igSimpleImageView = c33147Ejq.A03;
        } else {
            ELO elo = (ELO) obj;
            str = c148336m3.A02;
            elo.A04 = str;
            igSimpleImageView = elo.A00;
        }
        if (igSimpleImageView != null) {
            AMo.A07(igSimpleImageView, str);
        }
    }
}
