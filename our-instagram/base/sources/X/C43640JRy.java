package X;

import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.JRy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43640JRy {
    public static final C43640JRy A00 = new Object();

    public static final String A04(Resources resources, AtomicBoolean atomicBoolean, int i, int i2, boolean z) {
        String A0k;
        if (i >= i2 && i2 > 1) {
            int i3 = 2131960680;
            if (z) {
                i3 = 2131960681;
            }
            A0k = AbstractC43594JPz.A0t(resources, i2 - 1, i3);
        } else {
            atomicBoolean.set(true);
            int i4 = R.plurals.direct_thread_n_new_messages;
            if (z) {
                i4 = R.plurals.direct_thread_n_unwatched_reels;
            }
            A0k = AbstractC167017dG.A0k(resources, i, i4);
        }
        C14360o3.A0A(A0k);
        return A0k;
    }

    private final CharSequence A03(C99E c99e, MRV mrv, InterfaceC50518MRv interfaceC50518MRv) {
        CharSequence ByE;
        CharSequence obj;
        if (c99e == null || (ByE = c99e.ANm(mrv.ByE())) == null) {
            ByE = mrv.ByE();
        }
        if (interfaceC50518MRv.CM0()) {
            if (ByE instanceof SpannableString) {
                obj = SpannableString.valueOf(new SpannableStringBuilder(ByE).replace(0, 0, (CharSequence) "📣 · "));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("📣 · ");
                sb.append((Object) ByE);
                obj = sb.toString();
            }
            return obj;
        }
        return ByE;
    }

    private final boolean A05(MRV mrv, Integer num, boolean z) {
        if ((num == C05F.A00 || num == C05F.A0Y) && mrv.Ar9() == C2EY.A18 && z && mrv.BtC() != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r4 == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(android.content.Context r2, java.lang.Integer r3, boolean r4) {
        /*
            int r1 = r3.intValue()
            r0 = 13
            if (r1 == r0) goto L1f
            switch(r1) {
                case 1: goto L17;
                case 2: goto L1b;
                case 3: goto L1b;
                case 4: goto L1b;
                case 8: goto L1b;
                case 9: goto L1b;
                case 12: goto L1f;
                case 15: goto L17;
                case 24: goto L1b;
                default: goto Lb;
            }
        Lb:
            r0 = 2130970313(0x7f0406c9, float:1.7549333E38)
        Le:
            int r0 = X.AbstractC53242c7.A0H(r2, r0)
            int r0 = r2.getColor(r0)
            return r0
        L17:
            r0 = 2130970217(0x7f040669, float:1.7549138E38)
            goto Le
        L1b:
            r0 = 2130970280(0x7f0406a8, float:1.7549266E38)
            goto Le
        L1f:
            r0 = 2130970273(0x7f0406a1, float:1.7549251E38)
            if (r4 != 0) goto Le
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43640JRy.A00(android.content.Context, java.lang.Integer, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (X.C6X6.A02(r6) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.CharSequence A02(android.content.Context r4, X.C99E r5, com.instagram.common.session.UserSession r6, X.MRV r7, X.InterfaceC50518MRv r8, java.util.concurrent.atomic.AtomicBoolean r9, java.util.concurrent.atomic.AtomicBoolean r10, int r11, int r12) {
        /*
            r3 = this;
            boolean r0 = r7.CSg()
            r2 = 0
            if (r0 == 0) goto Le
            boolean r0 = X.C6X6.A02(r6)
            r1 = 1
            if (r0 != 0) goto Lf
        Le:
            r1 = 0
        Lf:
            boolean r0 = r8.CWD()
            if (r0 != 0) goto L1f
            boolean r0 = r7.CSd()
            if (r0 != 0) goto L1f
            if (r1 != 0) goto L1f
            r0 = 0
            return r0
        L1f:
            if (r11 <= 0) goto L2d
            android.content.res.Resources r0 = r4.getResources()
            X.C14360o3.A07(r0)
            java.lang.String r0 = A04(r0, r9, r11, r12, r2)
            return r0
        L2d:
            boolean r0 = r7.CPN()
            if (r0 == 0) goto L41
            boolean r0 = X.C6X6.A02(r6)
            if (r0 == 0) goto L41
            r10.set(r2)
            java.lang.CharSequence r0 = r3.A03(r5, r7, r8)
            return r0
        L41:
            r10.set(r2)
            r0 = 2131959228(0x7f131dbc, float:1.955509E38)
            java.lang.String r0 = r4.getString(r0)
            X.C14360o3.A0A(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43640JRy.A02(android.content.Context, X.99E, com.instagram.common.session.UserSession, X.MRV, X.MRv, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicBoolean, int, int):java.lang.CharSequence");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r1.length() == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x05f3, code lost:
    
        if (X.AbstractC13620mo.A02(r41) != false) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x05f5, code lost:
    
        r2.replace(0, 0, (java.lang.CharSequence) "· ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x05ec, code lost:
    
        if (r26 != false) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x07fa, code lost:
    
        if (r17 != false) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a6, code lost:
    
        if ((r6.A01 & 4) != 4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0a6d, code lost:
    
        if (r16 != null) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0415, code lost:
    
        if (r46.Ar9() != X.C2EY.A18) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x00c9, code lost:
    
        if (r10 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0201, code lost:
    
        if (X.C14360o3.A0K(r46.BtF(), r44.userId) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0273, code lost:
    
        if (r12 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0275, code lost:
    
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0285, code lost:
    
        if (r46.BN5() != X.C05F.A0C) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x02ad, code lost:
    
        if (r8 != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x02be, code lost:
    
        if (X.JSN.A00(r41, r44, r46, r47) == null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0314, code lost:
    
        if (((java.lang.Boolean) r4.getValue()).booleanValue() != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0398, code lost:
    
        if (r16 != false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x02a2, code lost:
    
        if (r46.CSg() == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x026d, code lost:
    
        if (X.C41891wf.A00(r8) < 2) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x03c0, code lost:
    
        if (r48.A00 > 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x03d9, code lost:
    
        if (r6 != 4) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0402, code lost:
    
        if (r6 != 4) goto L253;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:90:0x0435. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0a7a  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0a8f  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x044c  */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.text.SpannableString, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v112, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v135, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v139, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v141, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v151, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v153, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v156, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v216 */
    /* JADX WARN: Type inference failed for: r1v217 */
    /* JADX WARN: Type inference failed for: r1v218 */
    /* JADX WARN: Type inference failed for: r1v219 */
    /* JADX WARN: Type inference failed for: r1v220 */
    /* JADX WARN: Type inference failed for: r1v221 */
    /* JADX WARN: Type inference failed for: r1v222 */
    /* JADX WARN: Type inference failed for: r1v223 */
    /* JADX WARN: Type inference failed for: r1v224 */
    /* JADX WARN: Type inference failed for: r1v225 */
    /* JADX WARN: Type inference failed for: r1v226 */
    /* JADX WARN: Type inference failed for: r1v227 */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v77, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v79, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v81, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C43641JRz A01(android.content.Context r41, android.text.SpannableString r42, X.C99E r43, com.instagram.common.session.UserSession r44, X.C43929Jbe r45, X.MRV r46, X.InterfaceC50518MRv r47, X.C44079Je4 r48, java.util.List r49, int r50, boolean r51, boolean r52, boolean r53, boolean r54, boolean r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 2940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43640JRy.A01(android.content.Context, android.text.SpannableString, X.99E, com.instagram.common.session.UserSession, X.Jbe, X.MRV, X.MRv, X.Je4, java.util.List, int, boolean, boolean, boolean, boolean, boolean, boolean):X.JRz");
    }
}
