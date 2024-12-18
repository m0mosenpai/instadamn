package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.1nJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36601nJ implements C0KV {
    public static final C36601nJ A00 = new C36601nJ();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(278150857);
        int A032 = C0f9.A03(-1546861207);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(userSession, A002) { // from class: X.4Ln
            public final UserSession A00;
            public final C2DS A01;

            {
                C14360o3.A0B(A002, 2);
                this.A00 = userSession;
                this.A01 = A002;
            }

            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                Long l;
                C2DU c2du;
                DirectThreadKey A01;
                C4GV A0P;
                C14360o3.A0B(map, 0);
                C14360o3.A0B(c5lP, 1);
                C14360o3.A0B(c125205lR, 2);
                C14360o3.A0B(interfaceC16620sF, 5);
                String str = (String) map.get(RealtimeProtocol.THREAD_ID);
                UserSession userSession2 = this.A00;
                if (C18U.A06(C06090Tz.A05, userSession2, 2342162618468867642L) && str != null && C14360o3.A0K(c125205lR.A00, "replace")) {
                    String str2 = c125205lR.A02;
                    C14360o3.A06(str2);
                    if (interfaceC16620sF.invoke(str, c5lP) == null) {
                        return XZZ.A00;
                    }
                    try {
                        C83693oE c83693oE = new C83693oE(str);
                        C126455ng parseFromJson = AbstractC126445nf.parseFromJson(C07950bF.A04.A01(userSession2, str2));
                        if (parseFromJson != null && (l = parseFromJson.A1A) != null) {
                            long longValue = l.longValue();
                            if (longValue > 0 && (A0P = (c2du = (C2DU) this.A01).A0P((A01 = AbstractC140956Yx.A01(c83693oE)))) != null) {
                                synchronized (A0P) {
                                    A0P.A0I.A01.A0N = longValue;
                                }
                                c2du.FCS(A01);
                                C28741aC c28741aC = c2du.A0H;
                                C14360o3.A0B(A01, 0);
                                c28741aC.A02.ATO(new KM1(c28741aC, A01));
                            }
                        }
                        return C1333660e.A00;
                    } catch (IOException e) {
                        C0K8.A0F(getClass().getSimpleName(), "Invalid bumpThread payload", e);
                        return new C1334060j(e, "BatchedPollsMessageDeltaProcessor", "Invalid bumpThread payload");
                    }
                }
                return C1333860h.A00;
            }
        };
        C0f9.A0A(-1114808240, A032);
        C0f9.A0A(-1671469413, A03);
        return c4l3;
    }
}
