package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.1nA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36511nA implements C0KV {
    public static final C36511nA A00 = new C36511nA();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(1328142919);
        int A032 = C0f9.A03(842000147);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(userSession, A002) { // from class: X.4Lg
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
                if (obj != null && "replace".equals(c125205lR.A00)) {
                    C2ED c2ed = (C2ED) interfaceC16620sF.invoke(obj, c5lP);
                    if (c2ed != null) {
                        try {
                            C07880b8 c07880b8 = C07950bF.A04;
                            UserSession userSession2 = this.A00;
                            String str = c125205lR.A02;
                            C14360o3.A06(str);
                            this.A01.Efk(AbstractC126445nf.parseFromJson(c07880b8.A01(userSession2, str)).A0M, c2ed);
                        } catch (IOException e) {
                            C0K8.A0F("ThreadSnippetUpdateDeltaProcessor", "Invalid thread snippet format", e);
                            return new C1334060j(e, "ThreadSnippetUpdateDeltaProcessor", "Invalid thread snippet format");
                        }
                    }
                    return C1333660e.A00;
                }
                return C1333860h.A00;
            }
        };
        C0f9.A0A(825908803, A032);
        C0f9.A0A(1542811667, A03);
        return c4l3;
    }
}
