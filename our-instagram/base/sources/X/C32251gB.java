package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1gB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32251gB implements InterfaceC29301b7 {
    public static final C0KV A01 = new C0KV() { // from class: X.1gC
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(1507032946);
            int A032 = C0f9.A03(-435242984);
            C32251gB c32251gB = new C32251gB(userSession);
            C0f9.A0A(-601081734, A032);
            C0f9.A0A(1353249097, A03);
            return c32251gB;
        }
    };
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C81663kb A0N;
        C1g9 c1g9 = (C1g9) c1ow;
        String str = c1g9.C7Q().A00;
        Long l = null;
        if (str != null && (A0N = ((C2DU) AbstractC28761aE.A00(this.A00)).A0N(str)) != null) {
            C83403nh BLX = A0N.BLX();
            if (BLX != null) {
                l = Long.valueOf(TimeUnit.MICROSECONDS.toMillis(BLX.C8i()));
            }
            Long C7O = A0N.C7O();
            if (!C2ED.A00.equals(C7O)) {
                C14120nc.A00().ATO(new KMH(this, l, C7O));
            } else {
                C0K8.A0C("DirectDeleteThreadMutationProcessor", "cannot find threadJid: ${threadJid}");
            }
        }
        UserSession userSession = this.A00;
        K8Y k8y = new K8Y(AbstractC46987Kq6.A00(userSession, interfaceC37261GbE), userSession, this, c1g9);
        DirectThreadKey C7Q = c1g9.C7Q();
        boolean z = c1g9.A02.A06;
        C14360o3.A0B(userSession, 0);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0L("direct_v2/threads/%s/hide/", C7Q.A00);
        c25621Ms.A0I("should_move_future_requests_to_spam", z);
        if (l != null) {
            c25621Ms.A0E("last_message_timestamp_ms_for_instamadillo", l.longValue());
        }
        c25621Ms.A0R(C40781ul.class, C55702hA.class);
        C1ON A0N2 = c25621Ms.A0N();
        A0N2.A00 = k8y;
        C1GJ.A03(A0N2);
    }

    public C32251gB(UserSession userSession) {
        this.A00 = userSession;
    }
}
