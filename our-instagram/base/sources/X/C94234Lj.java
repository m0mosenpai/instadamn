package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.4Lj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94234Lj implements C4L3 {
    public final UserSession A00;
    public final C2DS A01;

    public C94234Lj(UserSession userSession, C2DS c2ds) {
        C14360o3.A0B(c2ds, 2);
        this.A00 = userSession;
        this.A01 = c2ds;
    }

    @Override // X.C4L3
    public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
        C14360o3.A0B(map, 0);
        C14360o3.A0B(c5lP, 1);
        C14360o3.A0B(c125205lR, 2);
        C14360o3.A0B(interfaceC16620sF, 5);
        String str = (String) map.get(RealtimeProtocol.THREAD_ID);
        if (str != null) {
            String str2 = c125205lR.A00;
            if ("add".equals(str2) || "remove".equals(str2) || "replace".equals(str2)) {
                C2ED c2ed = (C2ED) interfaceC16620sF.invoke(str, c5lP);
                if (c2ed == null) {
                    return XZZ.A00;
                }
                UserSession userSession = this.A00;
                AbstractC43712JUx.A01(userSession, c5lP, str, null, false);
                try {
                    C07880b8 c07880b8 = C07950bF.A04;
                    String str3 = c125205lR.A02;
                    C14360o3.A06(str3);
                    IGQ parseFromJson = AbstractC40585Hz5.parseFromJson(c07880b8.A01(userSession, str3));
                    C14360o3.A07(parseFromJson);
                    C2DS c2ds = this.A01;
                    c2ds.FCW(c2ed.BKb(), parseFromJson.A00);
                    String str4 = c125205lR.A00;
                    if (str4 != null) {
                        int hashCode = str4.hashCode();
                        if (hashCode != -934610812) {
                            if (hashCode != 96417) {
                                if (hashCode == 1094496948 && str4.equals("replace")) {
                                    c2ds.FCW(c2ed.BKb(), parseFromJson.A00);
                                }
                            } else if (str4.equals("add")) {
                                DirectThreadKey BKb = c2ed.BKb();
                                List list2 = parseFromJson.A01;
                                List list3 = parseFromJson.A02;
                                C2DU c2du = (C2DU) c2ds;
                                C4GV A0P = c2du.A0P(BKb);
                                if (A0P != null) {
                                    C81663kb c81663kb = A0P.A0I;
                                    HashSet hashSet = new HashSet(c81663kb.BSH());
                                    C81543kP A0K = A0P.A0K();
                                    C14360o3.A07(A0K);
                                    if (list2 != null) {
                                        A0K.A0C = AbstractC35061FcY.A02(A0K.A0C, list2);
                                        hashSet.addAll(list2);
                                    }
                                    if (list3 != null) {
                                        A0K.A0E = AbstractC35061FcY.A02(A0K.A0E, list3);
                                        hashSet.addAll(list3);
                                    }
                                    AbstractC31407DrC.A01(c81663kb, new ArrayList(hashSet));
                                    C2DU.A0E(A0P.A0L(A0K), c2du, false);
                                }
                            }
                        } else if (str4.equals("remove")) {
                            DirectThreadKey BKb2 = c2ed.BKb();
                            List list4 = parseFromJson.A01;
                            List list5 = parseFromJson.A02;
                            C2DU c2du2 = (C2DU) c2ds;
                            C4GV A0P2 = c2du2.A0P(BKb2);
                            if (A0P2 != null) {
                                C81663kb c81663kb2 = A0P2.A0I;
                                HashSet hashSet2 = new HashSet(c81663kb2.BSH());
                                C81543kP A0K2 = A0P2.A0K();
                                C14360o3.A07(A0K2);
                                if (list4 != null) {
                                    A0K2.A0C = AbstractC35061FcY.A00(A0K2.A0C, list4);
                                    hashSet2.removeAll(AbstractC35061FcY.A01(list4, A0K2.A0D));
                                }
                                if (list5 != null) {
                                    A0K2.A0E = AbstractC35061FcY.A00(A0K2.A0E, list5);
                                    hashSet2.removeAll(list5);
                                }
                                AbstractC31407DrC.A01(c81663kb2, new ArrayList(hashSet2));
                                C2DU.A0E(A0P2.A0L(A0K2), c2du2, false);
                            }
                        }
                    }
                    return C1333660e.A00;
                } catch (IOException e) {
                    AbstractC43712JUx.A00(userSession, c5lP, "Invalid Moderator format");
                    C0w9.A01.EmN("invalid broadcast moderator format", "Invalid Moderator format");
                    return new C1334160k(e, "invalid broadcast moderator format", "Invalid Moderator format");
                }
            }
        }
        return C1333860h.A00;
    }
}
