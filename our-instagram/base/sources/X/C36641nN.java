package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.1nN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36641nN implements C0KV {
    public static final C36641nN A00 = new C36641nN();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
        int A03 = C0f9.A03(-870577931);
        int A032 = C0f9.A03(-320029697);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(A002) { // from class: X.4Lr
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
                C14360o3.A0B(interfaceC16620sF, 5);
                String str = (String) map.get(RealtimeProtocol.THREAD_ID);
                if (str != null && C14360o3.A0K(c125205lR.A00, "replace")) {
                    try {
                        FGF parseFromJson = F49.parseFromJson(C16V.A00(c125205lR.A02));
                        C14360o3.A07(parseFromJson);
                        if (interfaceC16620sF.invoke(str, c5lP) == null) {
                            return C1333860h.A00;
                        }
                        C2DS c2ds = this.A00;
                        C34502FIo c34502FIo = parseFromJson.A00;
                        c2ds.FBU(str, c34502FIo.A01, c34502FIo.A00);
                        return C1333660e.A00;
                    } catch (IOException e) {
                        return new C1334160k(e, "invalid_direct_nicknames_payload", "Invalid DirectNicknameUpdate payload");
                    }
                }
                return C1333860h.A00;
            }
        };
        C0f9.A0A(1572816375, A032);
        C0f9.A0A(-874031616, A03);
        return c4l3;
    }
}
