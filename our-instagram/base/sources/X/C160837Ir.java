package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7Ir, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160837Ir {
    public static CharSequence A00;
    public static final C160837Ir A01 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (X.C18U.A06(r4, r8, 36316675792048741L) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A02(android.content.Context r7, com.instagram.common.session.UserSession r8, X.AnonymousClass172 r9, java.lang.String r10, boolean r11) {
        /*
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36598150768626819(0x8205d300000c83, double:3.208156142779537E-306)
            long r5 = X.C18U.A01(r4, r8, r0)
            r3 = 0
            r1 = 1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L7e
            java.lang.String r2 = r9.getUsername()
            boolean r0 = r9 instanceof com.instagram.user.model.User
            r1 = 1
            if (r0 == 0) goto L46
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            X.17P r0 = r9.A03
            java.lang.String r5 = r0.getCategory()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            X.17P r0 = r9.A03
            java.lang.Boolean r0 = r0.BvV()
            boolean r1 = r1.equals(r0)
            if (r5 == 0) goto L46
            int r0 = r5.length()
            if (r0 == 0) goto L46
            if (r1 == 0) goto L46
            r0 = 36316675792048741(0x8105d300021265, double:3.030150234182804E-306)
            boolean r0 = X.C18U.A06(r4, r8, r0)
            if (r0 == 0) goto L4d
        L46:
            r0 = 2131969301(0x7f134515, float:1.957552E38)
            java.lang.String r5 = r7.getString(r0)
        L4d:
            X.C14360o3.A0A(r5)
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            r3.append(r5)
            r0 = 36329865636561459(0x8111d200014233, double:3.0384915449638874E-306)
            boolean r0 = X.C18U.A06(r4, r8, r0)
            if (r0 != 0) goto L79
            boolean r0 = r10.equals(r2)
            if (r0 != 0) goto L79
            if (r11 != 0) goto L79
            r0 = 2131961132(0x7f13252c, float:1.9558952E38)
            java.lang.String r0 = r7.getString(r0)
            android.text.SpannableStringBuilder r0 = r3.append(r0)
            r0.append(r2)
        L79:
            java.lang.String r0 = r3.toString()
            return r0
        L7e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160837Ir.A02(android.content.Context, com.instagram.common.session.UserSession, X.172, java.lang.String, boolean):java.lang.String");
    }

    private final User A01(UserSession userSession, C2EC c2ec) {
        C81543kP c81543kP;
        String str;
        List<User> BSH = c2ec.BSH();
        if (BSH.size() <= 1 && !c2ec.CVQ()) {
            if (BSH.isEmpty()) {
                return C08730cb.A00(userSession).A00();
            }
            return (User) BSH.get(0);
        }
        if (c2ec.C7g() == 29 && (c81543kP = ((C81663kb) c2ec).A01.A0t) != null && (str = c81543kP.A07) != null) {
            for (User user : BSH) {
                if (C14360o3.A0K(user.getId(), str)) {
                    return user;
                }
            }
            return null;
        }
        return null;
    }

    private final boolean A03(UserSession userSession, C2EC c2ec) {
        String str;
        User A012 = A01(userSession, c2ec);
        if (c2ec.C7g() == 1014) {
            if (A012 != null) {
                str = A012.A03.Aab();
            } else {
                str = null;
            }
            if (C14360o3.A0K(str, userSession.userId) && c2ec.BI1() != 1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A04(UserSession userSession, C2EC c2ec) {
        if (c2ec.CVQ()) {
            return false;
        }
        C41951wl A002 = C41951wl.A00(userSession);
        List list = c2ec.BKb().A02;
        if (list == null) {
            list = C16930sl.A00;
        }
        if (!C41891wf.A01(userSession).A0E(C41891wf.A03(A002, list))) {
            return false;
        }
        return true;
    }

    public static final boolean A05(UserSession userSession, C2EC c2ec) {
        if (c2ec.C7g() == 29) {
            C23031Ai A002 = AbstractC23021Ah.A00(userSession);
            String C7I = c2ec.C7I();
            if (C7I == null) {
                C7I = "";
            }
            if (!A002.A01.getBoolean(AnonymousClass001.A0R("broadcast_channel_tap_for_more_info_in_thread_header/", C7I), false) && C18U.A06(C06090Tz.A05, userSession, 36328624391012028L)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A06(C2EC c2ec) {
        if (c2ec.BSH().size() == 1 && ((User) AbstractC001800i.A0I(c2ec.BSH())).A1U()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x055e, code lost:
    
        if (r0.A0D(r8) != false) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0053, code lost:
    
        if (r4 == 8) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0579, code lost:
    
        if (X.C31227DoA.A00(r93.C7g()) == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0190, code lost:
    
        if (X.MU6.A02(r90, r93) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01b8, code lost:
    
        if (r0.A1Q() != true) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01df, code lost:
    
        if (r94.equals("ai_home_from_thread") == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01f4, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r90, 36325081043448509L) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0245, code lost:
    
        if (X.C18U.A06(r4, r90, 36330376737735504L) != false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0286, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r90, 36330376737604430L) == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0376, code lost:
    
        if (r93.CbX() == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03ba, code lost:
    
        if (X.AbstractC28415CgL.A03(r90) != false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x03da, code lost:
    
        if (r4.A01.getBoolean(X.AnonymousClass001.A0R("show_blends_add_icon_for_thread", r0), false) != false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0673, code lost:
    
        if (r2.length() == 0) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x06cf, code lost:
    
        if (r2 != 0) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0122, code lost:
    
        if (X.C18U.A06(r4, r90, 36316392324403556L) == false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x05b0, code lost:
    
        if (X.C31227DoA.A01(r0, r93.C7I(), r93.BSH()) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0150, code lost:
    
        if (X.C18U.A06(r4, r90, 36316392324403556L) == false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x051e, code lost:
    
        if (X.C31227DoA.A01(r0, r93.C7I(), r93.BSH()) == false) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x024a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0294 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012c  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v32, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r2v43, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v55, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v62, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v66, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v68, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r2v70, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v72, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v73, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v75, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r2v76, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v80, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91 */
    /* JADX WARN: Type inference failed for: r5v21, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C160847Is A00(android.content.Context r89, com.instagram.common.session.UserSession r90, com.instagram.direct.capabilities.Capabilities r91, X.C7IH r92, X.C2EC r93, java.lang.String r94, int r95, boolean r96, boolean r97, boolean r98, boolean r99, boolean r100, boolean r101, boolean r102, boolean r103, boolean r104, boolean r105, boolean r106) {
        /*
            Method dump skipped, instructions count: 2347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160837Ir.A00(android.content.Context, com.instagram.common.session.UserSession, com.instagram.direct.capabilities.Capabilities, X.7IH, X.2EC, java.lang.String, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):X.7Is");
    }
}
