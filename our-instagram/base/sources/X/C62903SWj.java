package X;

import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.W3CCardDetail;
import java.util.Iterator;

/* renamed from: X.SWj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62903SWj {
    public C62678SLr A00;
    public C62678SLr A01;
    public final String A02;
    public final String A03;

    public static final C62678SLr A00(C62903SWj c62903SWj) {
        C62678SLr c62678SLr;
        Throwable th;
        C62678SLr c62678SLr2 = c62903SWj.A00;
        if ((c62678SLr2 != null && (th = c62678SLr2.A02) != null) || ((c62678SLr = c62903SWj.A01) != null && (th = c62678SLr.A02) != null)) {
            return SSG.A01(th);
        }
        Object obj = null;
        if (c62678SLr2 == null || c62678SLr == null) {
            return null;
        }
        Object obj2 = c62678SLr2.A01;
        C14360o3.A0A(obj2);
        Iterator it = ((Iterable) obj2).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (C14360o3.A0K(((W3CCardDetail) next).A00.A08, c62903SWj.A02)) {
                obj = next;
                break;
            }
        }
        W3CCardDetail w3CCardDetail = (W3CCardDetail) obj;
        if (w3CCardDetail != null) {
            C62678SLr c62678SLr3 = c62903SWj.A01;
            C14360o3.A0A(c62678SLr3);
            Object obj3 = c62678SLr3.A01;
            C14360o3.A0A(obj3);
            String str = (String) obj3;
            String str2 = c62903SWj.A03;
            C14360o3.A0B(str, 1);
            CardDetails cardDetails = w3CCardDetail.A00;
            CardDetails cardDetails2 = new CardDetails(cardDetails.A00, null, null, cardDetails.A03, cardDetails.A04, cardDetails.A05, cardDetails.A06, str, cardDetails.A08, str2, null);
            boolean z = w3CCardDetail.A05;
            String str3 = w3CCardDetail.A02;
            AbstractC63311ShH.A04(str3, "latestBoundDevice");
            return SSG.A00(new W3CCardDetail(cardDetails2, null, str3, w3CCardDetail.A03, w3CCardDetail.A04, z));
        }
        return SSG.A01(AbstractC166987dD.A18(AnonymousClass001.A0g("Card id ", c62903SWj.A02, " is not found.")));
    }

    public C62903SWj(String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
    }
}
