package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.1n3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36451n3 implements C0KV {
    public static final C36451n3 A00 = new C36451n3();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(1316072615);
        int A032 = C0f9.A03(-1258794122);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(userSession, A002) { // from class: X.4LZ
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
                if (obj != null) {
                    C2ED c2ed = (C2ED) interfaceC16620sF.invoke(obj, c5lP);
                    if (c2ed == null) {
                        return XZZ.A00;
                    }
                    try {
                        String str = c125205lR.A02;
                        if (str != null && !"remove".equals(c125205lR.A00)) {
                            C07880b8 c07880b8 = C07950bF.A04;
                            UserSession userSession2 = this.A00;
                            C14360o3.A06(str);
                            C34545FKf parseFromJson = F5B.parseFromJson(c07880b8.A01(userSession2, str));
                            if (parseFromJson != null) {
                                this.A01.Ego(c2ed.BKb(), parseFromJson.A01, parseFromJson.A00, parseFromJson.A02, z);
                            }
                        } else {
                            this.A01.Ego(c2ed.BKb(), null, null, false, z);
                        }
                        return C1333660e.A00;
                    } catch (IOException e) {
                        C0w9.A01.EmN("video_call_iris_sync_message_error", "Invalid DirectThreadVideoCallInfo format");
                        return new C1334060j(e, "video_call_iris_sync_message_error", "Invalid DirectThreadVideoCallInfo format");
                    }
                }
                C0w9.A01.EmN("video_call_iris_sync_message_error", "Thread id is missing from iris sync message video call info");
                return C1333860h.A00;
            }
        };
        C0f9.A0A(188816498, A032);
        C0f9.A0A(44805659, A03);
        return c4l3;
    }
}
