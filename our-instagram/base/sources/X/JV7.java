package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class JV7 {
    public static final JV7 A00 = new Object();

    public static final C45078Jx7 A00(UserSession userSession, EnumC72377XcD enumC72377XcD, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j) {
        User A02;
        if (str != null && str2 != null && str3 != null && enumC72377XcD != EnumC72377XcD.A0D) {
            AbstractC72621XiX abstractC72621XiX = AbstractC72621XiX.$redex_init_class;
            if (enumC72377XcD.ordinal() != 1 || (A02 = AnonymousClass189.A00(userSession).A02(String.valueOf(j))) == null || (!A02.CYY() && !A02.isRestricted())) {
                return new C45078Jx7(enumC72377XcD, num, num2, num3, num4, str4, str, str2, str5, str6, str7, str8, str3, j);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008c, code lost:
    
        if (r5 != 1003) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        if (X.JUW.A01(r17) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(com.instagram.common.session.UserSession r17, X.InterfaceC71916XAa r18, X.C23031Ai r19, java.lang.String r20, long r21) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JV7.A01(com.instagram.common.session.UserSession, X.XAa, X.1Ai, java.lang.String, long):void");
    }

    public static final void A02(C23031Ai c23031Ai, Boolean bool, String str) {
        java.util.Set A0j;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            InterfaceC19630xq interfaceC19630xq = c23031Ai.A01;
            if (booleanValue) {
                A0j = AbstractC001800i.A0j(interfaceC19630xq.C2v("odn_pre_send_inferencing_marked_threads"));
                A0j.add(str);
            } else {
                if (!interfaceC19630xq.contains("odn_pre_send_inferencing_marked_threads")) {
                    return;
                }
                A0j = AbstractC001800i.A0j(interfaceC19630xq.C2v("odn_pre_send_inferencing_marked_threads"));
                A0j.remove(str);
            }
            AbstractC43594JPz.A1M(interfaceC19630xq, "odn_pre_send_inferencing_marked_threads", A0j);
        }
    }
}
