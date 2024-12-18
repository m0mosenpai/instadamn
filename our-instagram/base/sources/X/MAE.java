package X;

import com.facebook.avatar.expresso.odr.ODRController;
import com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource;
import com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel;

/* loaded from: classes8.dex */
public final class MAE extends C1Dq {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public final int A0A;
    public final Object A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAE(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A0A = i;
        this.A0B = obj;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof MAE) && ((MAE) obj).A0A == i) {
            return true;
        }
        return false;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A0A;
        this.A09 = obj;
        this.A00 |= Integer.MIN_VALUE;
        switch (i) {
            case 0:
                return ((ODRController) this.A0B).A0A(null, null, null, null, null, this, null);
            case 1:
                return ClipsACRBrowserPagingSource.A02((ClipsACRBrowserPagingSource) this.A0B, null, null, null, this);
            case 2:
                return MagicMediaRemixViewModel.A01(null, null, null, null, null, (MagicMediaRemixViewModel) this.A0B, null, this, 0);
            default:
                return C55214Oeb.A04(null, null, null, (C55214Oeb) this.A0B, this, 0);
        }
    }
}
