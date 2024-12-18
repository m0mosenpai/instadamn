package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.util.List;
import java.util.Map;

/* renamed from: X.1nS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36691nS implements C0KV {
    public static final C36691nS A00 = new C36691nS();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
        int A03 = C0f9.A03(-510787876);
        int A032 = C0f9.A03(-711453729);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(A002) { // from class: X.4Lw
            public final C2DS A00;

            {
                C14360o3.A0B(A002, 1);
                this.A00 = A002;
            }

            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                C14360o3.A0B(map, 0);
                C14360o3.A0B(c5lP, 1);
                C14360o3.A0B(c125205lR, 2);
                C14360o3.A0B(interfaceC16620sF2, 6);
                String str = (String) map.get(RealtimeProtocol.THREAD_ID);
                String str2 = (String) map.get(RealtimeProtocol.ITEM_ID);
                if (str != null && str2 != null) {
                    String str3 = c125205lR.A00;
                    if (C14360o3.A0K(str3, "add") || C14360o3.A0K(str3, "replace")) {
                        if (((Boolean) interfaceC16620sF2.invoke(str, c5lP)).booleanValue()) {
                            return XZY.A00;
                        }
                        this.A00.EZ5((C206209Bd) F4O.parseFromJson(C16V.A00(c125205lR.A02)).A00, new DirectThreadKey(str, null), str2);
                        return C1333660e.A00;
                    }
                }
                return C1333860h.A00;
            }
        };
        C0f9.A0A(-1227222331, A032);
        C0f9.A0A(149268874, A03);
        return c4l3;
    }
}
