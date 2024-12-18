package X;

import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.OnFeedMessagesIntf;

/* renamed from: X.WiA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70844WiA implements InterfaceC43071ya {
    public boolean A00;
    public final C65886Tvq A01;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        OnFeedMessagesIntf BUJ;
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = (IGCTMessagingAdsInfoDict) c59062n7.A03;
        String str = c59062n7.A05;
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A00 && !this.A00) {
            boolean z = true;
            this.A00 = A1R;
            if (iGCTMessagingAdsInfoDict != null && (BUJ = iGCTMessagingAdsInfoDict.BUJ()) != null) {
                long A00 = VTE.A00(iGCTMessagingAdsInfoDict);
                C65886Tvq c65886Tvq = this.A01;
                C14360o3.A0A(str);
                String A002 = AbstractC76663cE.A00(BUJ);
                if (BUJ.BGY() == null) {
                    z = false;
                }
                C14360o3.A0B(str, 0);
                C18920wW c18920wW = c65886Tvq.A01;
                InterfaceC02590Ai A003 = c18920wW.A00(c18920wW.A00, "welcome_message_impression");
                if (A003.isSampled()) {
                    C65886Tvq.A01(A003, c65886Tvq, str, A00);
                    A003.AAP("message_destination", A002);
                    A003.A7v("has_image_impression", Boolean.valueOf(z));
                    A003.Cht();
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public C70844WiA(C65886Tvq c65886Tvq) {
        this.A01 = c65886Tvq;
    }
}
