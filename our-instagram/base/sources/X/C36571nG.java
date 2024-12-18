package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.1nG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36571nG implements C0KV {
    public static final C36571nG A00 = new C36571nG();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(-919080772);
        int A032 = C0f9.A03(-368082356);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(userSession, A002) { // from class: X.4Lk
            public final UserSession A00;
            public final C2DS A01;

            {
                C14360o3.A0B(A002, 2);
                this.A00 = userSession;
                this.A01 = A002;
            }

            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                C81613kW c81613kW;
                C14360o3.A0B(map, 0);
                C14360o3.A0B(c125205lR, 2);
                String str = (String) map.get(RealtimeProtocol.THREAD_ID);
                if (str != null && C14360o3.A0K(c125205lR.A00, "replace")) {
                    String str2 = c125205lR.A02;
                    C14360o3.A06(str2);
                    try {
                        DirectThreadKey directThreadKey = new DirectThreadKey(str, null);
                        C126455ng parseFromJson = AbstractC126445nf.parseFromJson(C07950bF.A04.A01(this.A00, str2));
                        if (parseFromJson != null && (c81613kW = parseFromJson.A0a) != null) {
                            this.A01.FCT(c81613kW, directThreadKey, "delta");
                            return C1333660e.A00;
                        }
                        String simpleName = getClass().getSimpleName();
                        C14360o3.A07(simpleName);
                        return new C1334060j(new Exception("Invalid btvEnabledMap payload"), simpleName, "Invalid btvEnabledMap payload");
                    } catch (IOException e) {
                        String simpleName2 = getClass().getSimpleName();
                        C0K8.A0F(simpleName2, "Invalid btvEnabledMap format", e);
                        C14360o3.A07(simpleName2);
                        return new C1334060j(e, simpleName2, "Invalid btvEnabledMap format");
                    }
                }
                return C1333860h.A00;
            }
        };
        C0f9.A0A(-427753137, A032);
        C0f9.A0A(-273874425, A03);
        return c4l3;
    }
}
