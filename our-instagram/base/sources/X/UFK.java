package X;

import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.logging.LoggingContext;

/* loaded from: classes11.dex */
public final class UFK extends AbstractC52922bZ {
    public ECPHandler A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(X3g.A00);
    public final C2GS A06 = new C2GS();
    public final C2GS A05 = new C2GS();

    public final void A00(LoggingContext loggingContext, Integer num) {
        String str;
        if (num == C05F.A00) {
            C2FP.A01().A04.A0V(loggingContext, "url_loading_screen", null);
        }
        ECPHandler eCPHandler = this.A00;
        if (eCPHandler != null) {
            String str2 = this.A04;
            if (str2 == null) {
                str = "sessionId";
            } else {
                String str3 = this.A02;
                if (str3 == null) {
                    str = "productId";
                } else {
                    String str4 = this.A01;
                    if (str4 == null) {
                        str = "orderId";
                    } else {
                        String str5 = this.A03;
                        if (str5 == null) {
                            str = "receiverId";
                        } else {
                            eCPHandler.CJa(new SIL(null, str2, str3, str4, str5), loggingContext, num);
                            return;
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }
}
