package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.1mm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36281mm implements C0KV {
    public static final C36281mm A00 = new C36281mm();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(-28253714);
        int A032 = C0f9.A03(-1026327958);
        C14360o3.A0B(userSession, 0);
        C4L3 c4l3 = new C4L3(userSession) { // from class: X.4LG
            public final UserSession A00;

            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                String str;
                C14360o3.A0B(map, 0);
                C14360o3.A0B(c125205lR, 2);
                String str2 = (String) map.get(RealtimeProtocol.USER_ID);
                Boolean A002 = AbstractC22717A0n.A00(c125205lR.A02);
                if (str2 != null && A002 != null && "replace".equals(c125205lR.A00)) {
                    UserSession userSession2 = this.A00;
                    boolean booleanValue = A002.booleanValue();
                    if (booleanValue) {
                        str = "restrict";
                    } else {
                        str = "unrestrict";
                    }
                    AbstractC34867FYc.A01(userSession2, str);
                    User A02 = AnonymousClass189.A00(userSession2).A02(str2);
                    if (A02 == null) {
                        return new C220139nz("RestrictingUsersDeltaProcessor", "No cached user to update");
                    }
                    Long BTC = A02.BTC();
                    if (BTC != null) {
                        C131225wA.A01.A02(new C50267MHw(BTC.longValue(), 0, booleanValue), userSession2);
                    }
                    A02.A1B(booleanValue);
                    AbstractC25651Mw.A00(userSession2).E4s(new C121285eR(A02));
                    return C1333660e.A00;
                }
                return C1333860h.A00;
            }

            {
                this.A00 = userSession;
            }
        };
        C0f9.A0A(107948082, A032);
        C0f9.A0A(-639694336, A03);
        return c4l3;
    }
}
