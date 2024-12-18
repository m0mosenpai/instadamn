package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EDq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32217EDq extends AnonymousClass935 {
    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(1965679563);
        EDO edo = (EDO) obj;
        int A032 = C0f9.A03(853862374);
        boolean A1R = AbstractC167007dF.A1R(0, userSession, edo);
        Iterator it = edo.A01.iterator();
        while (it.hasNext()) {
            List<E6O> list = ((E6S) it.next()).A06;
            if (!list.isEmpty()) {
                String str = ((E6O) list.get(0)).A01;
                if (AbstractC111324zv.A00(886).equals(str)) {
                    for (E6O e6o : list) {
                        String str2 = e6o.A02;
                        if (str2 == null) {
                            str2 = "off";
                        }
                        if (Boolean.valueOf(A1R).equals(e6o.A00)) {
                            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                            AbstractC167007dF.A1L(A00, A00.A0z, C23031Ai.A8c, 335, str2.equals("off"));
                        }
                    }
                } else if ("direct_media_creator_share_activity".equals(str)) {
                    for (E6O e6o2 : list) {
                        String str3 = e6o2.A02;
                        if (str3 == null) {
                            str3 = "off";
                        }
                        if (Boolean.valueOf(A1R).equals(e6o2.A00)) {
                            C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                            C14360o3.A0B(str3, 0);
                            InterfaceC19610xo A0w = AbstractC166987dD.A0w(A002);
                            A0w.E7K(AbstractC43591JPw.A00(337), str3);
                            A0w.apply();
                        }
                    }
                } else if (AbstractC111324zv.A00(1166).equals(str)) {
                    for (E6O e6o3 : list) {
                        String str4 = e6o3.A02;
                        if (str4 == null) {
                            str4 = "off";
                        }
                        if (Boolean.valueOf(A1R).equals(e6o3.A00)) {
                            C23031Ai A003 = AbstractC23021Ah.A00(userSession);
                            AbstractC167007dF.A1L(A003, A003.A10, C23031Ai.A8c, 336, str4.equals("off"));
                        }
                    }
                }
            }
        }
        C0f9.A0A(2137649978, A032);
        C0f9.A0A(-2016284008, A03);
    }

    public C32217EDq(UserSession userSession) {
        super(userSession);
    }
}
