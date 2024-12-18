package X;

import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public abstract class JSK {
    public static final String A00 = new String(Character.toChars(10084));

    public static String A01(C83403nh c83403nh) {
        AbstractC44055Jdg abstractC44055Jdg = AbstractC44055Jdg.$redex_init_class;
        if (c83403nh.A10.ordinal() != 18) {
            C18C.A0E(c83403nh.A1T instanceof User);
            return AnonymousClass001.A0R("@", ((User) c83403nh.A1T).getUsername());
        }
        return A02(c83403nh);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A02(X.C83403nh r5) {
        /*
            X.2EY r4 = r5.A10
            if (r4 == 0) goto L4f
            java.lang.Object r2 = r5.A1T
            if (r2 == 0) goto L4f
            java.util.List r2 = (java.util.List) r2
            int r1 = r2.size()
            r0 = 1
            if (r1 < r0) goto L4f
            java.lang.Object r3 = X.AbstractC166987dD.A16(r2)
            X.43t r3 = (X.C910143t) r3
            X.Jdg r0 = X.AbstractC44055Jdg.$redex_init_class
            int r1 = r4.ordinal()
            r0 = 18
            if (r1 == r0) goto L3b
            r0 = 83
            if (r1 != r0) goto L4a
            java.lang.String r2 = r3.A13
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L4a
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "#"
        L33:
            r1.append(r0)
            java.lang.String r0 = X.AbstractC166997dE.A0x(r2, r1)
            return r0
        L3b:
            java.lang.String r2 = r3.A13
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L4a
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "@"
            goto L33
        L4a:
            java.lang.String r0 = r3.A1Q
            if (r0 == 0) goto L4f
            return r0
        L4f:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JSK.A02(X.3nh):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02f3, code lost:
    
        if (r18 == false) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0710, code lost:
    
        r1 = 2131959183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if ((r18.A0Q != null) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0394, code lost:
    
        if (r18 != false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0651, code lost:
    
        if (r1 == null) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x070e, code lost:
    
        if (r0 == null) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x076e, code lost:
    
        if (r1 == null) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0773, code lost:
    
        if (r0 != false) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x085d, code lost:
    
        if (X.AbstractC50102Ry.A00(r7.A00, "screen_recording") == false) goto L561;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x08cd, code lost:
    
        if (r0 == X.EnumC40111tc.A0Q) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x0927, code lost:
    
        if (r0.A0P == false) goto L621;
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x09a5, code lost:
    
        if (r6 != null) goto L666;
     */
    /* JADX WARN: Code restructure failed: missing block: B:766:0x0b9c, code lost:
    
        if (r20 != null) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x0bad, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append(r2);
        r0.append(": ");
        r0.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x0bbf, code lost:
    
        return r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x0bab, code lost:
    
        if (r19.CS1() == false) goto L784;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x007d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x026d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x09a7 A[PHI: r6
      0x09a7: PHI (r6v39 java.lang.String) = 
      (r6v6 java.lang.String)
      (r6v9 java.lang.String)
      (r6v9 java.lang.String)
      (r6v9 java.lang.String)
      (r6v9 java.lang.String)
      (r6v11 java.lang.String)
      (r6v13 java.lang.String)
      (r6v44 java.lang.String)
     binds: [B:684:0x09a5, B:633:0x097b, B:635:0x097f, B:637:0x0983, B:626:0x08fa, B:602:0x08b3, B:598:0x089c, B:156:0x026b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0767 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:511:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:712:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x0a87  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence A00(android.content.Context r16, com.instagram.common.session.UserSession r17, X.C83403nh r18, X.C2EC r19, com.instagram.user.model.User r20) {
        /*
            Method dump skipped, instructions count: 3236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JSK.A00(android.content.Context, com.instagram.common.session.UserSession, X.3nh, X.2EC, com.instagram.user.model.User):java.lang.CharSequence");
    }
}
