package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1mg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36221mg implements C0KV {
    public static final C36221mg A00 = new C36221mg();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(565685040);
        int A032 = C0f9.A03(733479135);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(userSession, A002) { // from class: X.4LA
            public final UserSession A00;
            public final C2DS A01;

            {
                C14360o3.A0B(A002, 2);
                this.A00 = userSession;
                this.A01 = A002;
            }

            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                C14360o3.A0B(map, 0);
                C14360o3.A0B(c5lP, 1);
                C14360o3.A0B(c125205lR, 2);
                C14360o3.A0B(interfaceC16620sF, 5);
                Object obj = map.get(RealtimeProtocol.THREAD_ID);
                String str = (String) map.get(RealtimeProtocol.ITEM_ID);
                if (obj != null && str != null && "replace".equals(c125205lR.A00)) {
                    C2ED c2ed = (C2ED) interfaceC16620sF.invoke(obj, c5lP);
                    if (c2ed != null) {
                        C2DS c2ds = this.A01;
                        if (c2ds.BSh(c2ed.BKb(), str) == null) {
                            return new C220139nz("UpdateMessageMediaInterventionsDeltaProcessor", "No cached message to update");
                        }
                        UserSession userSession2 = this.A00;
                        if (JUW.A03(userSession2, false)) {
                            String C7I = c2ed.C7I();
                            if (C7I != null) {
                                C83693oE c83693oE = new C83693oE(C7I);
                                try {
                                    FGY parseFromJson = F76.parseFromJson(C16V.A00(c125205lR.A02));
                                    if (parseFromJson != null) {
                                        LinkedHashMap linkedHashMap = parseFromJson.A00;
                                        if (linkedHashMap != null) {
                                            for (Object obj2 : linkedHashMap.keySet()) {
                                                C14360o3.A07(obj2);
                                                String str2 = (String) obj2;
                                                c2ds.EYs(new DirectMessageIdentifier(null, str, null), c83693oE, (Integer) linkedHashMap.get(str2), str2);
                                            }
                                        } else {
                                            C14360o3.A0F("mediaInterventions");
                                            throw C00O.createAndThrow();
                                        }
                                    }
                                } catch (IOException e) {
                                    C1ZX A01 = C1ZV.A00(userSession2).A01(C05F.A0N, C05F.A0K, true);
                                    A01.A03("error_message: ", "Invalid MessageMediaInterventionsInfo format");
                                    A01.A05(e);
                                    A01.A00();
                                    return new C1334060j(e, "UpdateMessageMediaInterventionsDeltaProcessor", "Invalid MessageMediaInterventionsInfo format");
                                }
                            }
                        }
                        return C1333660e.A00;
                    }
                    return XZZ.A00;
                }
                return C1333860h.A00;
            }
        };
        C0f9.A0A(-1703852862, A032);
        C0f9.A0A(-1542666050, A03);
        return c4l3;
    }
}
