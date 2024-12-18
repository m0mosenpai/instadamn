package X;

import com.facebookpay.offsite.base.CheckoutHandler;

/* loaded from: classes11.dex */
public final class WbS implements InterfaceC71903X9n {
    public final /* synthetic */ CheckoutHandler A00;
    public final /* synthetic */ REZ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public WbS(CheckoutHandler checkoutHandler, REZ rez, String str, String str2) {
        this.A01 = rez;
        this.A00 = checkoutHandler;
        this.A03 = str;
        this.A02 = str2;
    }

    @Override // X.InterfaceC71903X9n
    public final void DZy() {
        int i = this.A01.A00;
        if (i != 2992005 && i != 4447002 && i != 4447012) {
            return;
        }
        CheckoutHandler checkoutHandler = this.A00;
        Wad wad = checkoutHandler.A0S;
        Integer num = C05F.A0j;
        String str = this.A03;
        String str2 = this.A02;
        wad.CJa(new SIL(null, str, str2, null, null), C70189WFs.A00(str, str2), num);
        C69641Vsi c69641Vsi = (C69641Vsi) checkoutHandler.A0Y.getValue();
        if (c69641Vsi == null) {
            return;
        }
        try {
            C67729Uwv c67729Uwv = c69641Vsi.A06.A00;
            if (c67729Uwv == null) {
                return;
            }
            c67729Uwv.A0L(num);
        } catch (Exception unused) {
        }
    }
}
