package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.38d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C689238d {
    public final C689338e A00;

    public final void A00(String str, String str2, String str3) {
        long j;
        C689338e c689338e = this.A00;
        C25531Mh c25531Mh = (C25531Mh) c689338e.A02.getValue();
        if (c25531Mh != null) {
            String str4 = c689338e.A00.userId;
            C14360o3.A0B(str4, 0);
            Long A0k = AbstractC003100w.A0k(10, str4);
            if (A0k != null) {
                j = A0k.longValue();
            } else {
                j = 0;
            }
            c25531Mh.A0Q("author_igid", Long.valueOf(j));
            c25531Mh.A0R("cta_type", str2);
            c25531Mh.A0R("media_type", str);
            c25531Mh.A0p(str3);
            c25531Mh.Cht();
        }
    }

    public C689238d(UserSession userSession, String str) {
        this.A00 = new C689338e(userSession, str);
    }
}
