package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1mc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36181mc implements C0KV {
    public static final C36181mc A00 = new C36181mc();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(664406499);
        int A032 = C0f9.A03(-1695729206);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(userSession, A002) { // from class: X.4L6
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
                C14360o3.A0B(list, 4);
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
                        C83403nh A003 = C83403nh.A00(c07880b8.A01(userSession2, str), c2ed.BKb(), false);
                        if (A003 == null) {
                            return new C1334160k(new Exception("Failed to parse value as DirectMessage"), "Invalid DirectMessage format", "Failed to parse value as DirectMessage");
                        }
                        A003.A1m(C05F.A0j);
                        this.A01.A9l(A003, c2ed.BKb(), false);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC93894Jz) it.next()).DAL(A003, c2ed.BKb(), c5lP.A06);
                        }
                        return C1333660e.A00;
                    } catch (IOException e) {
                        C0K8.A0F("BatchedPollsMessageDeltaProcessor", "Invalid DirectMessage format", e);
                        return new C1334060j(e, "BatchedPollsMessageDeltaProcessor", "Invalid DirectMessage format");
                    }
                }
                return C1333860h.A00;
            }
        };
        C0f9.A0A(-2044632956, A032);
        C0f9.A0A(1328936676, A03);
        return c4l3;
    }
}
