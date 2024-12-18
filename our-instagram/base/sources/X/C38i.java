package X;

import com.instagram.api.schemas.OrganicCTAType;
import com.instagram.common.session.UserSession;

/* renamed from: X.38i, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38i {
    public final C689238d A00;

    public C38i(UserSession userSession, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = new C689238d(userSession, str);
    }

    public static final void A00(C38i c38i, C38321qM c38321qM, String str) {
        OrganicCTAType Atr;
        String str2;
        long j;
        String A00 = AbstractC54949ORz.A00(c38321qM.BRp().A00);
        JLT BZV = c38321qM.A0C.BZV();
        if (BZV != null && (Atr = BZV.Atr()) != null && (str2 = Atr.A00) != null) {
            C689338e c689338e = c38i.A00.A00;
            C25531Mh c25531Mh = (C25531Mh) c689338e.A01.getValue();
            if (c25531Mh != null) {
                String str3 = c689338e.A00.userId;
                C14360o3.A0B(str3, 0);
                Long A0k = AbstractC003100w.A0k(10, str3);
                if (A0k != null) {
                    j = A0k.longValue();
                } else {
                    j = 0;
                }
                c25531Mh.A0Q("author_igid", Long.valueOf(j));
                c25531Mh.A0R("cta_type", str2);
                c25531Mh.A0R("media_type", A00);
                c25531Mh.A0p(str);
                c25531Mh.Cht();
            }
        }
    }
}
