package X;

import com.facebook.iabadscontext.IgPromoAdsPromoCode;
import com.instagram.common.session.UserSession;

/* renamed from: X.Swj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63959Swj implements InterfaceC65483Tl0 {
    public final int A00;
    public final Object A01;

    public C63959Swj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r5.length() == 0) goto L10;
     */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.0iw, java.lang.Object] */
    @Override // X.InterfaceC65483Tl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dh2(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63959Swj.Dh2(java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0iw, java.lang.Object] */
    @Override // X.InterfaceC65483Tl0
    public final void onFailure() {
        Long l;
        switch (this.A00) {
            case 0:
                SPI spi = (SPI) this.A01;
                if (!spi.A02) {
                    return;
                }
                C70189WFs.A03(VDH.A02, spi.A01);
                return;
            case 5:
                C58882QEs c58882QEs = (C58882QEs) this.A01;
                UserSession userSession = c58882QEs.A02;
                String str = c58882QEs.A03;
                String str2 = ((IgPromoAdsPromoCode) AbstractC166987dD.A16(c58882QEs.A01.A02)).A00;
                String A01 = c58882QEs.A01();
                String str3 = c58882QEs.A05;
                C14360o3.A0B(A01, 3);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(new Object(), userSession), "ig_promo_ads_autofill_injection_fail");
                if (!A0f.isSampled()) {
                    return;
                }
                AbstractC37301Gc2.A0z(A0f, Long.parseLong(str));
                if (str2 != null) {
                    l = AbstractC25228BEl.A13(str2);
                } else {
                    l = null;
                }
                A0f.A9K("offer_id", l);
                A0f.AAP("promo_code", A01);
                AbstractC37300Gc1.A0o(A0f, str3);
                A0f.Cht();
                return;
            default:
                return;
        }
    }
}
