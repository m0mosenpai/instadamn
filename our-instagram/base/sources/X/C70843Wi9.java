package X;

import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.IceBreakerMessageIntf;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import java.util.HashSet;

/* renamed from: X.Wi9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70843Wi9 implements InterfaceC43071ya {
    public final C65886Tvq A00;
    public final java.util.Set A01 = new HashSet();

    public C70843Wi9(C65886Tvq c65886Tvq) {
        this.A00 = c65886Tvq;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        AbstractC167017dG.A1N(c59062n7, interfaceC57162jr);
        IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = (IGCTMessagingAdsInfoDict) c59062n7.A03;
        String str = (String) c59062n7.A04;
        String str2 = c59062n7.A05;
        C14360o3.A06(str2);
        int parseInt = Integer.parseInt(str2);
        if (iGCTMessagingAdsInfoDict != null && str != null) {
            OnFeedMessagesIntf BUJ = iGCTMessagingAdsInfoDict.BUJ();
            if (BUJ != null) {
                String BSz = ((IceBreakerMessageIntf) AbstractC76673cF.A01(BUJ).get(parseInt)).BSz();
                if (interfaceC57162jr.CFq(c59062n7) == C05F.A00 && this.A01.add(Integer.valueOf(parseInt))) {
                    C65886Tvq c65886Tvq = this.A00;
                    long A00 = VTE.A00(iGCTMessagingAdsInfoDict);
                    long j = parseInt;
                    String A002 = AbstractC76663cE.A00(BUJ);
                    C18920wW c18920wW = c65886Tvq.A01;
                    InterfaceC02590Ai A003 = c18920wW.A00(c18920wW.A00, "icebreaker_impression");
                    if (A003.isSampled()) {
                        AbstractC37301Gc2.A0z(A003, Long.parseLong(str));
                        A003.A9K("page_id", Long.valueOf(A00));
                        A003.A9K("position", Long.valueOf(j));
                        A003.AAP(AbstractC37307Gc9.A00(), c65886Tvq.A02);
                        C65886Tvq.A02(A003, c65886Tvq, "icebreaker_message_key", BSz, A002);
                        return;
                    }
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
