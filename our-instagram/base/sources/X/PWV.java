package X;

import com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel;
import com.instagram.pendingmedia.service.impl.SharePostThreadHelper;

/* loaded from: classes9.dex */
public final class PWV extends C1Dq {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;
    public final Object A08;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A07;
        this.A06 = obj;
        this.A02 |= Integer.MIN_VALUE;
        switch (i) {
            case 0:
                return MagicMediaRemixViewModel.A03(null, null, (MagicMediaRemixViewModel) this.A08, null, null, null, null, this, 0, 0);
            case 1:
                return ((SharePostThreadHelper) this.A08).A00(null, this, null);
            default:
                return ((C57113PVc) this.A08).A00(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWV(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A07 = i;
        this.A08 = obj;
    }
}
