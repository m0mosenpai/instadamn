package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.1mp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36311mp implements C0KV {
    public static final C36311mp A00 = new C36311mp();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(2014645761);
        int A032 = C0f9.A03(-208004071);
        C14360o3.A0B(userSession, 0);
        C4L3 c4l3 = new C4L3(userSession) { // from class: X.4LJ
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
                        str = "pseudoblock";
                    } else {
                        str = "pseudounblock";
                    }
                    AbstractC34867FYc.A01(userSession2, str);
                    User A02 = AnonymousClass189.A00(userSession2).A02(str2);
                    if (A02 == null) {
                        return new C220139nz("MessagingOnlyBlockingDeltaProcessor", "No cached user to update");
                    }
                    A02.A19(booleanValue);
                    return C1333660e.A00;
                }
                return C1333860h.A00;
            }

            {
                this.A00 = userSession;
            }
        };
        C0f9.A0A(817089924, A032);
        C0f9.A0A(424307093, A03);
        return c4l3;
    }
}
