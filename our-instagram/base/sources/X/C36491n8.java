package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.1n8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36491n8 implements C0KV {
    public static final C36491n8 A00 = new C36491n8();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(2058878004);
        int A032 = C0f9.A03(514743447);
        C14360o3.A0B(userSession, 0);
        C4L3 c4l3 = new C4L3(userSession) { // from class: X.4Le
            public final UserSession A00;

            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                C14360o3.A0B(map, 0);
                C14360o3.A0B(c125205lR, 2);
                String str = (String) map.get(RealtimeProtocol.USER_ID);
                Boolean A002 = AbstractC22717A0n.A00(c125205lR.A02);
                if (str != null && A002 != null) {
                    boolean booleanValue = A002.booleanValue();
                    UserSession userSession2 = this.A00;
                    C18A A003 = AnonymousClass189.A00(userSession2);
                    User A02 = A003.A02(str);
                    if (A02 == null && (A02 = A003.A00(Long.parseLong(str))) == null) {
                        return new C220139nz("UpdateViewerUnconnectedDeltaProcessor", "No cached user to update");
                    }
                    A02.A1D(booleanValue);
                    AbstractC25651Mw.A00(userSession2).E4s(new C23611Ad6(A02));
                    return C1333660e.A00;
                }
                return C1333860h.A00;
            }

            {
                this.A00 = userSession;
            }
        };
        C0f9.A0A(1670452176, A032);
        C0f9.A0A(-117813550, A03);
        return c4l3;
    }
}
