package X;

import com.instagram.react.modules.product.IgReactBoostPostModule;

/* loaded from: classes11.dex */
public final class Wx6 implements Runnable {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ IgReactBoostPostModule A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public Wx6(AbstractC59962oe abstractC59962oe, IgReactBoostPostModule igReactBoostPostModule, String str, String str2) {
        this.A01 = igReactBoostPostModule;
        this.A00 = abstractC59962oe;
        this.A03 = str;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC59962oe abstractC59962oe = this.A00;
        if (abstractC59962oe != null && abstractC59962oe.isAdded()) {
            C1Y6 A00 = AbstractC69888VxF.A00();
            C1Y5 A002 = VRF.A00();
            String str = this.A03;
            String str2 = this.A02;
            IgReactBoostPostModule igReactBoostPostModule = this.A01;
            A00.A06(abstractC59962oe, A002.A00(igReactBoostPostModule.getCurrentActivity(), igReactBoostPostModule.mUserSession, str, str2), abstractC59962oe);
        }
    }
}
