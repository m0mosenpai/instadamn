package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.1ms, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36341ms implements C0KV {
    public static final C36341ms A00 = new C36341ms();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(1129239533);
        int A032 = C0f9.A03(-729516197);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(userSession, A002) { // from class: X.4LO
            public final UserSession A00;
            public final C2DS A01;

            {
                C14360o3.A0B(A002, 2);
                this.A00 = userSession;
                this.A01 = A002;
            }

            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                Boolean bool;
                C14360o3.A0B(map, 0);
                C14360o3.A0B(c5lP, 1);
                C14360o3.A0B(c125205lR, 2);
                C14360o3.A0B(interfaceC16620sF, 5);
                Object obj = map.get(RealtimeProtocol.THREAD_ID);
                if (obj != null && "replace".equals(c125205lR.A00)) {
                    C2ED c2ed = (C2ED) interfaceC16620sF.invoke(obj, c5lP);
                    if (c2ed == null) {
                        return XZZ.A00;
                    }
                    try {
                        C07880b8 c07880b8 = C07950bF.A04;
                        UserSession userSession2 = this.A00;
                        String str = c125205lR.A02;
                        C14360o3.A06(str);
                        C34540FKa parseFromJson = F4D.parseFromJson(c07880b8.A01(userSession2, str));
                        if (parseFromJson != null) {
                            bool = parseFromJson.A01;
                        } else {
                            bool = null;
                        }
                        Boolean A003 = AbstractC22717A0n.A00(c125205lR.A02);
                        if (bool != null) {
                            this.A01.FCV(c2ed.BKb(), parseFromJson.A02, parseFromJson.A00, bool.booleanValue(), z);
                            return C1333660e.A00;
                        }
                        if (A003 != null) {
                            this.A01.FCV(c2ed.BKb(), null, 0, A003.booleanValue(), z);
                            return C1333660e.A00;
                        }
                        C0w9.A01.EmO("invalid_shh_mode_toggle_info_payload", "Invalid DirectShhModeToggleInfo payload", 1);
                        return new C1334060j(new Exception("Invalid DirectShhModeToggleInfo payload"), "invalid_shh_mode_toggle_info_payload", "Invalid DirectShhModeToggleInfo payload");
                    } catch (IOException e) {
                        C0w9.A01.EmT("invalid_shh_mode_toggle_info_format", "Invalid DirectShhModeToggleInfo format", 1, e);
                        return new C1334060j(e, "invalid_shh_mode_toggle_info_format", "Invalid DirectShhModeToggleInfo format");
                    }
                }
                return C1333860h.A00;
            }
        };
        C0f9.A0A(20223820, A032);
        C0f9.A0A(-91565830, A03);
        return c4l3;
    }
}
