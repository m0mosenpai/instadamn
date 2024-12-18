package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.1nC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36531nC implements C0KV {
    public static final C36531nC A00 = new C36531nC();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(2119920230);
        int A032 = C0f9.A03(-1739424384);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(userSession, A002) { // from class: X.4Li
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
                String str = (String) map.get(RealtimeProtocol.THREAD_ID);
                UserSession userSession2 = this.A00;
                if (C18U.A06(C06090Tz.A05, userSession2, 2342159504617640374L) && str != null) {
                    String str2 = c125205lR.A00;
                    if ("add".equals(str2) || "remove".equals(str2)) {
                        C2ED c2ed = (C2ED) interfaceC16620sF.invoke(str, c5lP);
                        if (c2ed == null) {
                            return XZZ.A00;
                        }
                        AbstractC43712JUx.A01(userSession2, c5lP, str, null, false);
                        try {
                            C07880b8 c07880b8 = C07950bF.A04;
                            String str3 = c125205lR.A02;
                            C14360o3.A06(str3);
                            IGP parseFromJson = AbstractC40584Hz4.parseFromJson(c07880b8.A01(userSession2, str3));
                            C14360o3.A07(parseFromJson);
                            C2DS c2ds = this.A01;
                            c2ds.FCW(c2ed.BKb(), parseFromJson.A00);
                            String str4 = c125205lR.A00;
                            if (C14360o3.A0K(str4, "add")) {
                                DirectThreadKey BKb = c2ed.BKb();
                                List list2 = parseFromJson.A01;
                                List list3 = parseFromJson.A02;
                                C2DU c2du = (C2DU) c2ds;
                                synchronized (c2ds) {
                                    C4GV A0P = c2du.A0P(BKb);
                                    if (A0P != null) {
                                        C81663kb c81663kb = A0P.A0I;
                                        HashSet hashSet = new HashSet(c81663kb.BSH());
                                        C81543kP A0K = A0P.A0K();
                                        C14360o3.A07(A0K);
                                        if (list2 != null) {
                                            A0K.A0B = AbstractC35061FcY.A02(A0K.A0B, list2);
                                            hashSet.addAll(list2);
                                        }
                                        if (list3 != null) {
                                            A0K.A0D = AbstractC35061FcY.A02(A0K.A0D, list3);
                                            hashSet.addAll(list3);
                                        }
                                        AbstractC31407DrC.A01(c81663kb, new ArrayList(hashSet));
                                        C2DU.A0E(A0P.A0L(A0K), c2du, false);
                                    }
                                }
                                return C1333660e.A00;
                            }
                            if (C14360o3.A0K(str4, "remove")) {
                                DirectThreadKey BKb2 = c2ed.BKb();
                                List list4 = parseFromJson.A01;
                                List list5 = parseFromJson.A02;
                                C2DU c2du2 = (C2DU) c2ds;
                                synchronized (c2ds) {
                                    C4GV A0P2 = c2du2.A0P(BKb2);
                                    if (A0P2 != null) {
                                        C81663kb c81663kb2 = A0P2.A0I;
                                        HashSet hashSet2 = new HashSet(c81663kb2.BSH());
                                        C81543kP A0K2 = A0P2.A0K();
                                        C14360o3.A07(A0K2);
                                        if (list4 != null) {
                                            A0K2.A0B = AbstractC35061FcY.A00(A0K2.A0B, list4);
                                            hashSet2.removeAll(AbstractC35061FcY.A01(list4, A0K2.A0D));
                                        }
                                        if (list5 != null) {
                                            A0K2.A0D = AbstractC35061FcY.A00(A0K2.A0D, list5);
                                            hashSet2.removeAll(list5);
                                        }
                                        AbstractC31407DrC.A01(c81663kb2, new ArrayList(hashSet2));
                                        C2DU.A0E(A0P2.A0L(A0K2), c2du2, false);
                                    }
                                }
                            }
                            return C1333660e.A00;
                            return C1333660e.A00;
                        } catch (IOException e) {
                            AbstractC43712JUx.A00(userSession2, c5lP, "invalid broadcast collaborator format");
                            C0w9.A03("invalid broadcast collaborator format", "Invalid Collaborator format");
                            return new C1334160k(e, "invalid broadcast collaborator format", "invalid broadcast collaborator format");
                        }
                    }
                }
                return C1333860h.A00;
            }
        };
        C0f9.A0A(-692147549, A032);
        C0f9.A0A(475974360, A03);
        return c4l3;
    }
}
