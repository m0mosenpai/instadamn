package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.1mi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36241mi implements C0KV {
    public static final C36241mi A00 = new C36241mi();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
        int A03 = C0f9.A03(-911343288);
        int A032 = C0f9.A03(727998645);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(A002) { // from class: X.4LC
            public final C2DS A00;

            {
                C14360o3.A0B(A002, 1);
                this.A00 = A002;
            }

            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                boolean z2;
                boolean A0N;
                boolean z3;
                boolean z4;
                C80993jT Av3;
                String str;
                String str2;
                C14360o3.A0B(map, 0);
                C14360o3.A0B(c5lP, 1);
                C14360o3.A0B(c125205lR, 2);
                C14360o3.A0B(interfaceC16620sF2, 6);
                String str3 = (String) map.get(RealtimeProtocol.THREAD_ID);
                String str4 = (String) map.get(RealtimeProtocol.USER_ID);
                if (str3 != null && str4 != null) {
                    String str5 = c125205lR.A00;
                    if (C14360o3.A0K(str5, "add") || C14360o3.A0K(str5, "replace")) {
                        if (((Boolean) interfaceC16620sF2.invoke(str3, c5lP)).booleanValue()) {
                            return XZY.A00;
                        }
                        try {
                            C80993jT parseFromJson = AbstractC80983jS.parseFromJson(C16V.A00(c125205lR.A02));
                            C14360o3.A07(parseFromJson);
                            C2DS c2ds = this.A00;
                            C81663kb C76 = c2ds.C76(str3);
                            if (C76 != null) {
                                boolean z5 = c5lP.A06;
                                C2DU c2du = (C2DU) c2ds;
                                synchronized (c2du) {
                                    C4GV A0P = c2du.A0P(C76.BKb());
                                    if (A0P == null) {
                                        C0w9.A03(AbstractC43591JPw.A00(114), "Can't find thread to update seen messages.");
                                        C76.A0N(parseFromJson, str4);
                                    } else {
                                        C81663kb c81663kb = A0P.A0I;
                                        if (!C14360o3.A0K(c81663kb, C76)) {
                                            C0w9.A03(AbstractC43591JPw.A00(114), "There should be only one reference of thread thread.");
                                            z2 = C76.A0N(parseFromJson, str4);
                                        } else {
                                            z2 = false;
                                        }
                                        synchronized (A0P) {
                                            A0N = c81663kb.A0N(parseFromJson, str4);
                                            if (A0N) {
                                                A0P.A0Q();
                                                if (str4.equals(A0P.A0H.userId)) {
                                                    A0P.A0S();
                                                }
                                            }
                                            A0P.A0T();
                                            A0P.A0P();
                                        }
                                        if (!A0N && !z2) {
                                            z3 = false;
                                            if (C14360o3.A0K(c2du.A0A.userId, str4) && (Av3 = C76.Av3(str4)) != null && (str = ((AbstractC81003jU) parseFromJson).A01) != null && (str2 = ((AbstractC81003jU) Av3).A01) != null) {
                                                z4 = true;
                                                if (!str.equals(str2)) {
                                                }
                                                C2In c2In = new C2In(parseFromJson, C76.BKb(), str4, z5, z3, z4);
                                                c2du.A06.E4s(c2In);
                                                c2du.A08.accept(c2In);
                                                C2DU.A0G(c2du, C76.BKb(), C05F.A0D, z, false);
                                            }
                                        } else {
                                            z3 = true;
                                        }
                                        z4 = false;
                                        C2In c2In2 = new C2In(parseFromJson, C76.BKb(), str4, z5, z3, z4);
                                        c2du.A06.E4s(c2In2);
                                        c2du.A08.accept(c2In2);
                                        C2DU.A0G(c2du, C76.BKb(), C05F.A0D, z, false);
                                    }
                                }
                            }
                            return C1333660e.A00;
                        } catch (IOException e) {
                            String simpleName = getClass().getSimpleName();
                            C0K8.A0F(simpleName, "Invalid DirectThreadSeenMarker format", e);
                            C14360o3.A07(simpleName);
                            return new C1334060j(e, simpleName, "Invalid DirectThreadSeenMarker format");
                        }
                    }
                }
                return C1333860h.A00;
            }
        };
        C0f9.A0A(1190434438, A032);
        C0f9.A0A(1699223908, A03);
        return c4l3;
    }
}
