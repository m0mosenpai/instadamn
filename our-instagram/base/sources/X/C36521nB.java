package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.1nB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36521nB implements C0KV {
    public static final C36521nB A00 = new C36521nB();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(1950890896);
        int A032 = C0f9.A03(-1320747858);
        C14360o3.A0B(userSession, 0);
        C4L3 c4l3 = new C4L3(userSession) { // from class: X.4Lh
            public final UserSession A00;

            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                C14360o3.A0B(map, 0);
                C14360o3.A0B(c125205lR, 2);
                String str = (String) map.get(RealtimeProtocol.USER_ID);
                if (str != null) {
                    String str2 = c125205lR.A02;
                    C14360o3.A06(str2);
                    int parseInt = Integer.parseInt(str2);
                    UserSession userSession2 = this.A00;
                    C18A A002 = AnonymousClass189.A00(userSession2);
                    User A02 = A002.A02(str);
                    if (A02 == null && (A02 = A002.A00(Long.parseLong(str))) == null) {
                        return new C220139nz("ReachabilityStatusDeltaProcessor", "No cached user to update");
                    }
                    A02.A0o(Integer.valueOf(parseInt));
                    A002.A03(A02);
                    AbstractC25651Mw.A00(userSession2).E4s(new C7IB(A02));
                    return C1333660e.A00;
                }
                return C1333860h.A00;
            }

            {
                this.A00 = userSession;
            }
        };
        C0f9.A0A(265270755, A032);
        C0f9.A0A(484785823, A03);
        return c4l3;
    }
}
