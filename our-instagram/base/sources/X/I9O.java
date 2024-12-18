package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public abstract class I9O {
    public static final void A00(UserSession userSession, C1M6 c1m6, HashMap hashMap) {
        long j;
        long j2;
        AbstractC167017dG.A1P(hashMap, c1m6);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36325746762921280L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36325746762986817L);
        if (A06 || A062) {
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            int i = 0;
            Iterator A14 = AbstractC166997dE.A14(hashMap);
            while (A14.hasNext()) {
                C9BW c9bw = (C9BW) AbstractC31176DnK.A0j(A14);
                if (c9bw != null) {
                    AnonymousClass317 anonymousClass317 = (AnonymousClass317) ((C9C7) c9bw.A01).A04;
                    if (!C82603mO.A01(anonymousClass317)) {
                        if (anonymousClass317 == AnonymousClass317.A0M) {
                            AbstractC82583mM abstractC82583mM = (AbstractC82583mM) c9bw.A00;
                            String A04 = abstractC82583mM.A04();
                            C9BW c9bw2 = (C9BW) A1I.get(A04);
                            if (c9bw2 != null) {
                                if (abstractC82583mM instanceof C82573mL) {
                                    j = ((C82573mL) abstractC82583mM).A0A;
                                } else {
                                    j = -1;
                                }
                                AbstractC82583mM abstractC82583mM2 = (AbstractC82583mM) c9bw2.A00;
                                if (abstractC82583mM2 instanceof C82573mL) {
                                    j2 = ((C82573mL) abstractC82583mM2).A0A;
                                } else {
                                    j2 = -1;
                                }
                                if (j > j2) {
                                    A1I.put(A04, c9bw);
                                }
                            } else {
                                A1I.put(A04, c9bw);
                            }
                        } else if (A06) {
                            c1m6.EIB(c9bw, C05F.A00);
                        }
                        i++;
                    }
                }
            }
            if (A06) {
                Iterator A0k = AbstractC167007dF.A0k(A1I);
                while (A0k.hasNext()) {
                    c1m6.EIB((C9BW) A0k.next(), C05F.A00);
                }
            }
            if (A062) {
                c1m6.EIC(i, C05F.A00);
            }
        }
    }
}
