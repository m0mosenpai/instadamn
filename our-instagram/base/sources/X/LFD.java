package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public final class LFD {
    public static final C1345666g A00(UserSession userSession) {
        return ((LEA) AbstractC43593JPy.A0b(userSession).A01(LEA.class, MHJ.A00(userSession, 8))).A00;
    }

    public final MailboxFutureImpl A01(UserSession userSession, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, long j, long j2, boolean z) {
        AbstractC167007dF.A1E(userSession, 0, str);
        AbstractC25229BEm.A1M(str2, 6, str5);
        String A14 = AbstractC25225BEi.A14();
        C1345666g A00 = A00(userSession);
        Integer valueOf = Integer.valueOf(i);
        List A1J = AbstractC166987dD.A1J(valueOf);
        List A1J2 = AbstractC166987dD.A1J(str);
        List A0z = AbstractC43594JPz.A0z(AbstractC167017dG.A0K(num));
        List A0z2 = AbstractC43594JPz.A0z(AbstractC167017dG.A0K(num2));
        List A1J3 = AbstractC166987dD.A1J(str2);
        List A0z3 = AbstractC43594JPz.A0z(AbstractC167017dG.A0K(num3));
        List A0z4 = AbstractC43594JPz.A0z(AbstractC167017dG.A0K(num4));
        List A1J4 = AbstractC166987dD.A1J(str3);
        List A10 = AbstractC43594JPz.A10(j2);
        List A0z5 = AbstractC43594JPz.A0z(i2);
        List A0z6 = AbstractC43594JPz.A0z(0);
        if (str4 == null) {
            str4 = "";
        }
        List A1J5 = AbstractC166987dD.A1J(str4);
        List A1J6 = AbstractC166987dD.A1J(str5);
        return A00.A00(null, num5, l, AbstractC25233BEq.A0n(str8), AbstractC46872KoF.A00(userSession, valueOf, num5, null, null, l2, str7, z), str6, A14, A1J, A1J2, A0z, A0z2, A1J3, A0z3, A0z4, A1J4, A10, A0z5, A0z6, A1J5, A1J6, j, z);
    }
}
