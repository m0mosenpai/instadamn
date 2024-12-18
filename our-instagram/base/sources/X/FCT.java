package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FCT {
    public static final GFF A00(UserSession userSession, AbstractC33573Esl abstractC33573Esl) {
        String str;
        AbstractC167017dG.A1N(abstractC33573Esl, userSession);
        if (abstractC33573Esl instanceof C33295Enq) {
            C33295Enq c33295Enq = (C33295Enq) abstractC33573Esl;
            String str2 = c33295Enq.A03;
            if (str2 != null && (str = c33295Enq.A04) != null) {
                return new C33293Eno(userSession, c33295Enq.A02, str2, str, c33295Enq.A05);
            }
            boolean z = c33295Enq.A06;
            String str3 = c33295Enq.A02;
            String str4 = c33295Enq.A05;
            if (z) {
                return new C33291Enm(userSession, str3, str4);
            }
            return new C33292Enn(userSession, str3, str4);
        }
        if (abstractC33573Esl instanceof C33294Enp) {
            C33294Enp c33294Enp = (C33294Enp) abstractC33573Esl;
            return new C33290Enl(userSession, c33294Enp.A00, c33294Enp.A01);
        }
        throw B4Z.A00();
    }
}
