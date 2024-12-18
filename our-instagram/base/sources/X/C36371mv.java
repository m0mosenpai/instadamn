package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.1mv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36371mv implements C0KV {
    public static final C36371mv A00 = new C36371mv();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(426321749);
        int A032 = C0f9.A03(-222336110);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(userSession, A002) { // from class: X.4LR
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
                    String str = c125205lR.A00;
                    if (C14360o3.A0K(str, "add")) {
                        C2ED c2ed = (C2ED) interfaceC16620sF.invoke(obj, c5lP);
                        if (c2ed != null) {
                            try {
                                C07880b8 c07880b8 = C07950bF.A04;
                                UserSession userSession2 = this.A00;
                                String str2 = c125205lR.A02;
                                C14360o3.A06(str2);
                                C33586Esy parseFromJson = F4F.parseFromJson(c07880b8.A01(userSession2, str2));
                                if (parseFromJson != null) {
                                    this.A01.FCU(parseFromJson.A00, c2ed.BKb(), z);
                                    return C1333660e.A00;
                                }
                                return new C1334060j(new Exception("Invalid DirectThreadImageInfo payload"), "invalid_thread_image_info_payload", "Invalid DirectThreadImageInfo payload");
                            } catch (IOException e) {
                                C0w9.A05("invalid_thread_image_info_format", "Invalid DirectThreadImageInfo format", 1, e);
                                return new C1334060j(e, "invalid_thread_image_info_format", "Invalid DirectThreadImageInfo format");
                            }
                        }
                    } else if (C14360o3.A0K(str, "remove")) {
                        C2ED c2ed2 = (C2ED) interfaceC16620sF.invoke(obj, c5lP);
                        if (c2ed2 != null) {
                            this.A01.FCU(null, c2ed2.BKb(), z);
                            return C1333660e.A00;
                        }
                    }
                    return XZZ.A00;
                }
                return C1333860h.A00;
            }
        };
        C0f9.A0A(935257109, A032);
        C0f9.A0A(-389055306, A03);
        return c4l3;
    }
}
