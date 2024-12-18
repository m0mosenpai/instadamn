package X;

import com.facebookpay.offsite.base.CheckoutHandler;

/* loaded from: classes11.dex */
public final class WbT implements InterfaceC71903X9n {
    public final /* synthetic */ VEJ A00;
    public final /* synthetic */ CheckoutHandler A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public WbT(VEJ vej, CheckoutHandler checkoutHandler, String str, String str2, String str3, String str4) {
        this.A00 = vej;
        this.A01 = checkoutHandler;
        this.A05 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = str4;
    }

    @Override // X.InterfaceC71903X9n
    public final void DZy() {
        if (this.A00 == VEJ.A05) {
            Wad wad = this.A01.A0S;
            Integer num = C05F.A01;
            String str = this.A05;
            String str2 = this.A03;
            wad.CJa(new SIL(null, str, str2, this.A02, this.A04), C70189WFs.A00(str, str2), num);
        }
    }
}
