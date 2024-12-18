package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;

/* loaded from: classes7.dex */
public final class HBW extends AnonymousClass935 {
    public final /* synthetic */ InterfaceC43429JGt A00;
    public final /* synthetic */ C3KX A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HBW(UserSession userSession, InterfaceC43429JGt interfaceC43429JGt, C3KX c3kx, Integer num, String str, boolean z) {
        super(userSession);
        this.A02 = num;
        this.A01 = c3kx;
        this.A04 = z;
        this.A00 = interfaceC43429JGt;
        this.A03 = str;
    }

    @Override // X.AnonymousClass935
    public final void A04(AbstractC115105If abstractC115105If, UserSession userSession) {
        int A03 = C0f9.A03(738205022);
        AbstractC167017dG.A1N(userSession, abstractC115105If);
        if (this.A02 == C05F.A00) {
            C3KX.A07(this.A01, this.A03, userSession.userId, "live_request_failure");
        }
        super.A04(abstractC115105If, userSession);
        C0f9.A0A(-618439778, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        int i;
        Boolean bool;
        Boolean bool2;
        C3PO c3po;
        int A03 = C0f9.A03(1843331511);
        C105824pt c105824pt = (C105824pt) obj;
        int A032 = C0f9.A03(-1220275218);
        AbstractC167017dG.A1N(userSession, c105824pt);
        Integer num = this.A02;
        Integer num2 = C05F.A00;
        EnumC109104va enumC109104va = c105824pt.A06;
        if (enumC109104va == null) {
            enumC109104va = EnumC109104va.A0E;
        }
        boolean A00 = enumC109104va.A00();
        if (num == num2) {
            if (!A00 && c105824pt.A05(userSession) == null) {
                i = 2086648967;
            }
            bool = c105824pt.A0I;
            if ((bool != null || !bool.booleanValue()) && (((bool2 = c105824pt.A0F) == null || !bool2.booleanValue()) && !c105824pt.A07())) {
                i = -1862060148;
            } else {
                c105824pt.A0N = C05F.A01;
                Reel A0G = AbstractC37301Gc2.A0M(userSession).A0G(c105824pt);
                C3KX c3kx = this.A01;
                boolean z = this.A04;
                InterfaceC43429JGt interfaceC43429JGt = this.A00;
                UserSession userSession2 = c3kx.A01;
                if (userSession2 != null && z) {
                    C105824pt c105824pt2 = A0G.A0H;
                    if (c105824pt2 != null) {
                        c3po = c105824pt2.A0A;
                        if (c3po == null) {
                            c3po = C3PO.A08;
                        }
                    } else {
                        c3po = null;
                    }
                    if (c3po != C3PO.A07) {
                        ReelStore A033 = ReelStore.A03(userSession2);
                        C14360o3.A07(A033);
                        A033.A0Y(A0G);
                        A0G.A0R(userSession2);
                    }
                }
                interfaceC43429JGt.D0R(A0G);
                if (num == num2) {
                    C3KX.A07(c3kx, this.A03, userSession.userId, "live_request_success");
                }
                i = 539537684;
            }
        } else {
            if (A00 || c105824pt.A05(userSession) == null) {
                i = 255335614;
            }
            bool = c105824pt.A0I;
            if (bool != null) {
            }
            i = -1862060148;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(-1498297703, A03);
    }
}
