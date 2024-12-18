package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7QM, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7QM {
    public static final C7QX A02(UserSession userSession, C160787Im c160787Im, AnonymousClass442 anonymousClass442) {
        C14360o3.A0B(userSession, 0);
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        boolean A00 = C7QN.A00(userSession, c160787Im);
        C7P3 A03 = c160787Im.A03();
        C14360o3.A07(A03);
        return A01(userSession, A03, c83403nh, anonymousClass442, A00);
    }

    public static final C7QX A01(UserSession userSession, C7P3 c7p3, C83403nh c83403nh, AnonymousClass442 anonymousClass442, boolean z) {
        long j;
        String A0i = c83403nh.A0i();
        C14360o3.A0C(A0i, "null cannot be cast to non-null type kotlin.String");
        String A0g = c83403nh.A0g();
        String str = anonymousClass442.A0T;
        if (str == null && (str = anonymousClass442.A0R) == null) {
            throw new IllegalStateException("message_id and client_context are both null");
        }
        String str2 = anonymousClass442.A0R;
        MessageIdentifier messageIdentifier = new MessageIdentifier(A0i, A0g);
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        Long l = anonymousClass442.A0P;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        long millis = timeUnit.toMillis(j);
        C7QV c7qv = new C7QV(null, null, "", "", null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        ArrayList A0s = c83403nh.A0s(C08730cb.A00(userSession).A00());
        C2EY c2ey = c83403nh.A10;
        C14360o3.A07(c2ey);
        return new C7QX(null, c7qv, c7p3, c2ey, messageIdentifier, new MessageIdentifier(str, str2), A0s, millis, z, false, false, C14360o3.A0K(anonymousClass442.A0U, userSession.userId), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0243, code lost:
    
        if (r5 != 1013) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x024d, code lost:
    
        if (r11.AFw(r115, r2) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x024f, code lost:
    
        if (r63 != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0259, code lost:
    
        if (X.C4GR.A07(java.lang.Integer.valueOf(r5)) != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x025b, code lost:
    
        if (r5 != 29) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0263, code lost:
    
        if (r4.A00(X.EnumC2054697t.A0H) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0265, code lost:
    
        r90 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0275, code lost:
    
        if (((java.lang.Boolean) r116.A0c.getValue()).booleanValue() != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0279, code lost:
    
        r106 = X.C7QQ.A00;
        r52 = X.C7QQ.A03(r115, r2, r11, r5, r0, r0, r0, r0, r12, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0297, code lost:
    
        if (r4.A00(X.EnumC2054697t.A0K) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x029b, code lost:
    
        if (r2.A2P != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x029d, code lost:
    
        if (r8 != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02a3, code lost:
    
        if (r11.AFx(r115, r2) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02a5, code lost:
    
        if (r5 != 29) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02a7, code lost:
    
        if (r0 == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02a9, code lost:
    
        r53 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02af, code lost:
    
        if (r36 == 2) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02b5, code lost:
    
        if (r2.A2P != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02b7, code lost:
    
        if (r8 == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02bf, code lost:
    
        if (r2.A1j(r23) == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02c1, code lost:
    
        r0 = r11.C2p(r115, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02c5, code lost:
    
        if (r0 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02c7, code lost:
    
        r54 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02cd, code lost:
    
        if (r0.length() != 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02d1, code lost:
    
        if (r0 != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02d3, code lost:
    
        if (r54 == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02d5, code lost:
    
        if (r8 != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02db, code lost:
    
        if (X.AbstractC31270Dos.A00(r115) == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02e3, code lost:
    
        if (r2.A1j(r23) == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02e5, code lost:
    
        if (r5 == 29) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02e7, code lost:
    
        r1 = java.lang.Integer.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02ef, code lost:
    
        if (X.C4GR.A07(r1) != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02f1, code lost:
    
        r55 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02f7, code lost:
    
        if (X.C4GR.A08(r1) == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02fb, code lost:
    
        r0 = r116.A1U;
        r1 = ((java.lang.Boolean) r116.A0z.getValue()).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x030f, code lost:
    
        if (r0 != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0311, code lost:
    
        if (r1 == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0319, code lost:
    
        if (r2.A1k(r23) == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x031f, code lost:
    
        if (r11.CWd(r115, r2) == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0327, code lost:
    
        if (r4.A00(X.EnumC2054697t.A0r) == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0329, code lost:
    
        r57 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x032b, code lost:
    
        if (r5 != 29) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x034b, code lost:
    
        r56 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0353, code lost:
    
        if (r4.A00(X.EnumC2054697t.A0G) == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0359, code lost:
    
        if (r11.AFu(r115, r2) == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x035b, code lost:
    
        if (r0 != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x035d, code lost:
    
        if (r0 == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x035f, code lost:
    
        if (r12 == false) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0365, code lost:
    
        if (r2.A10 != X.C2EY.A0q) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x036b, code lost:
    
        if (r2.A1V() != false) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0815, code lost:
    
        if (r2.A2P != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0819, code lost:
    
        if (r2.A13 != null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x081b, code lost:
    
        if (r14 == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0821, code lost:
    
        if (r2.A0h() == null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0823, code lost:
    
        r47 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0829, code lost:
    
        if (r2.A1P() == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x036f, code lost:
    
        if (r8 != false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0371, code lost:
    
        if (r0 != false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0373, code lost:
    
        if (r0 != false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0375, code lost:
    
        if (r0 != false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0379, code lost:
    
        if (r2.A13 != null) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x037f, code lost:
    
        if (X.C77X.A01(r115, r2) == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x038d, code lost:
    
        if (X.C98Q.A00(r115).A00(r0, 46) == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x038f, code lost:
    
        r48 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0391, code lost:
    
        if (r0 != false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x039b, code lost:
    
        if (r2.A1j(r23) != false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03a9, code lost:
    
        if (X.C98Q.A00(r115).A00(r0, 9) == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03ab, code lost:
    
        if (r0 != false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03ad, code lost:
    
        if (r0 == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03af, code lost:
    
        if (r31 == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03b1, code lost:
    
        r58 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03b3, code lost:
    
        if (r0 != false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03bb, code lost:
    
        if (r2.A10 != X.C2EY.A0q) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03bd, code lost:
    
        if (r8 == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03c3, code lost:
    
        if (r2.A1S() == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03c5, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03d1, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r115, 36320485428699690L) == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03e0, code lost:
    
        if (r2.A1j(X.C08730cb.A00(r115).A00()) == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03e6, code lost:
    
        if (r2.A1F != X.C05F.A0j) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03e8, code lost:
    
        r59 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03ea, code lost:
    
        if (r4 == false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03ee, code lost:
    
        r61 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b7, code lost:
    
        if (r5.contains(r2.A1u) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x03f4, code lost:
    
        if (X.C2TN.A00(r115) != false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x03f6, code lost:
    
        r61 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x03f8, code lost:
    
        r1 = r2.A1T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x03fc, code lost:
    
        if ((r1 instanceof X.C7QR) == false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x03fe, code lost:
    
        r1 = ((X.C7QR) r1).A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0404, code lost:
    
        if ((r1 instanceof X.InterfaceC1121054c) == false) goto L484;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0406, code lost:
    
        r1 = (X.InterfaceC1121054c) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0408, code lost:
    
        r38 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x040a, code lost:
    
        if (r1 == null) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x040c, code lost:
    
        r4 = r1.CDi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0410, code lost:
    
        if (r4 == null) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0412, code lost:
    
        r35 = r4.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x041a, code lost:
    
        if (r35.length() <= 0) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x041e, code lost:
    
        if (r4.A01 == false) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0420, code lost:
    
        if (r5 == 29) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0422, code lost:
    
        if (r13 != false) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0424, code lost:
    
        r65 = r1.Cdi();
        r62 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x042e, code lost:
    
        if (r2.A1R() == false) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0430, code lost:
    
        r4 = X.C05F.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0436, code lost:
    
        switch(r4.intValue()) {
            case 0: goto L449;
            case 1: goto L449;
            case 2: goto L453;
            case 3: goto L446;
            case 4: goto L446;
            case 5: goto L446;
            default: goto L250;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0439, code lost:
    
        r14 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x043f, code lost:
    
        if (r2.A10 != X.C2EY.A1f) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0441, code lost:
    
        r0 = r2.A15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0443, code lost:
    
        if (r0 == null) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0445, code lost:
    
        r0 = r0.A0A;
        r31 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0449, code lost:
    
        if (r0 == null) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x044b, code lost:
    
        if (r0 == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x044d, code lost:
    
        if (r0 != false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x044f, code lost:
    
        r91 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x045f, code lost:
    
        if (((java.lang.Boolean) r116.A0F.getValue()).booleanValue() != false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0463, code lost:
    
        if (r33 != false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0465, code lost:
    
        r68 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0477, code lost:
    
        if (X.C7QQ.A01(r115, r0, r2, r0, r5, r0, r0) != false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0491, code lost:
    
        r69 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0493, code lost:
    
        if (r8 != false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0495, code lost:
    
        r67 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x04a7, code lost:
    
        if (X.C7QS.A00(r115, r2, r11, r78, r0, r5, r0) != false) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x04ad, code lost:
    
        r70 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x04b3, code lost:
    
        if (r11.AFY(r2) != false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x04b5, code lost:
    
        r70 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x04b7, code lost:
    
        if (r49 == false) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x04b9, code lost:
    
        if (r67 == false) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x04bb, code lost:
    
        if (r5 != 29) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x04c8, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r115, 36319312902626460L) != false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x04e6, code lost:
    
        r50 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x04ec, code lost:
    
        if (r2.A10 != X.C2EY.A1s) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x04ee, code lost:
    
        if (r9 == false) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x04f0, code lost:
    
        r93 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x04fb, code lost:
    
        if (new X.C60352pJ(r115).A00() != false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0503, code lost:
    
        if (r2.A10 != X.C2EY.A0j) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0505, code lost:
    
        r94 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0512, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r115, 36328379578138095L) != false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0516, code lost:
    
        r76 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0518, code lost:
    
        if (r5 != 29) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x051e, code lost:
    
        if (X.AbstractC31323Dpl.A00(r115, r2) == false) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0524, code lost:
    
        if (X.C1580877s.A01(r115, r2) != false) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0526, code lost:
    
        if (r0 == false) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x052a, code lost:
    
        if (r15 != X.C05F.A00) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0537, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r115, 36319377327463729L) == false) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0539, code lost:
    
        if (r76 == false) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x053b, code lost:
    
        if (r5 == 29) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0545, code lost:
    
        if (X.AbstractC159077Bt.A00(r115).booleanValue() == false) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0552, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r115, 36328087520165031L) == false) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0564, code lost:
    
        if (X.AbstractC23021Ah.A00(r115).A01.getInt("direct_message_translation_badge_nux_seen_count", 0) >= 2) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0566, code lost:
    
        r77 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0576, code lost:
    
        if (X.AbstractC23021Ah.A00(r115).A01.getBoolean("direct_message_translation_nux_accepted", false) == false) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x057a, code lost:
    
        if (r5 != 29) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0580, code lost:
    
        if (X.AbstractC31323Dpl.A00(r115, r2) == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0586, code lost:
    
        if (X.C1580877s.A01(r115, r2) != false) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0588, code lost:
    
        if (r0 == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x058c, code lost:
    
        if (r15 != X.C05F.A01) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x058e, code lost:
    
        r78 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x059b, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r115, 36319377327463729L) != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x059f, code lost:
    
        r79 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x05a1, code lost:
    
        if (r5 == 29) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x05a7, code lost:
    
        if (X.AbstractC162497Pm.A01(r115, r2, r5) == false) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x05ab, code lost:
    
        if (r15 != X.C05F.A01) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x05ad, code lost:
    
        if (r0 == null) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x05b5, code lost:
    
        if (r0.A01() != true) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x074a, code lost:
    
        if (X.C4GR.A07(java.lang.Integer.valueOf(r5)) != false) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0757, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r115, 36328087520033958L) == false) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x05bf, code lost:
    
        if (X.C7QQ.A02(r115, r0, r2, r15, r5) == false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x05c1, code lost:
    
        r80 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x05c7, code lost:
    
        if (X.C1580877s.A03(r2) != false) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x05cb, code lost:
    
        r81 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x05cd, code lost:
    
        if (r5 != 29) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x05cf, code lost:
    
        if (r0 == false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x05db, code lost:
    
        if (X.C14360o3.A0K(r115.userId, r2.BtE()) == false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x05e5, code lost:
    
        if (X.C2EY.A05.contains(r2.A10) == false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x05e9, code lost:
    
        if (r2.A2F != false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x05ef, code lost:
    
        if (r2.A0P() != null) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x05f1, code lost:
    
        r1 = r2.A0H();
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x05f5, code lost:
    
        if (r1 == null) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x05fb, code lost:
    
        if (r1.isEmpty() != false) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x05fd, code lost:
    
        r0 = (X.C910143t) X.AbstractC001800i.A0O(r1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0605, code lost:
    
        if (r0 == null) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x060b, code lost:
    
        if (r0.A02 != 9) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0611, code lost:
    
        if (X.AbstractC172137li.A05(r115) == false) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0613, code lost:
    
        r81 = X.C18U.A06(X.C06090Tz.A05, r115, 36319377328053562L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x070b, code lost:
    
        r0 = (X.C104384n4) X.AnonymousClass483.A00(X.LWL.A00, (java.util.List) X.AbstractC46657Kka.A00(r115).A0D.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x071f, code lost:
    
        if (r0 == null) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0721, code lost:
    
        r0 = r0.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0723, code lost:
    
        if (r0 == null) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0727, code lost:
    
        if (r0 == com.instagram.api.schemas.MonetizationEligibilityDecision.A05) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x072b, code lost:
    
        if (r0 == com.instagram.api.schemas.MonetizationEligibilityDecision.A04) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x072f, code lost:
    
        if (r0 != com.instagram.api.schemas.MonetizationEligibilityDecision.A06) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x073c, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r115, 36319377328053562L) == false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x073e, code lost:
    
        r81 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x061e, code lost:
    
        r75 = r106.A05(r115, r116, r0, r2, r0, r5, r0, r0, r0, r70);
        r1 = (X.C7QT) r115.A01(X.C7QT.class, new X.C50252MHh(r115, 39));
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x064b, code lost:
    
        if (X.C7QT.A00(r1, r2, r0) == false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x064d, code lost:
    
        r60 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x065c, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r1.A00, 36325506244818049L) != false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0660, code lost:
    
        if (r17 == false) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0662, code lost:
    
        if (r18 != false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0672, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0677, code lost:
    
        if (r2.A10 != X.C2EY.A1i) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0679, code lost:
    
        r84 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x067b, code lost:
    
        if (r6 != false) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0683, code lost:
    
        if (r11.AGD(r2) == false) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0685, code lost:
    
        r88 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0691, code lost:
    
        if (X.C14360o3.A0K(r115.userId, r2.BtE()) != false) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0695, code lost:
    
        r89 = r11.AFz(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x069d, code lost:
    
        if (r2.A10 != X.C2EY.A0z) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x069f, code lost:
    
        r1 = r2.A0H();
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x06a3, code lost:
    
        if (r1 == null) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x06a5, code lost:
    
        r0 = (X.C910143t) r1.get(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x06ad, code lost:
    
        if (r0 == null) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x06af, code lost:
    
        r0 = r0.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x06b3, code lost:
    
        if (r0 == null) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x06b5, code lost:
    
        r15 = r0.iterator();
        X.C14360o3.A07(r15);
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x06c2, code lost:
    
        if (r15.hasNext() == false) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x06c4, code lost:
    
        r0 = (X.C9CP) r15.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x06d2, code lost:
    
        if (X.C14360o3.A0K(r0.A05, "xma_long_press_action") == false) goto L607;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x06d4, code lost:
    
        if (r6 != null) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x06d6, code lost:
    
        r6 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x06db, code lost:
    
        r13 = r0.A04;
        r12 = r0.A02;
        r1 = (java.lang.Number) r0.A00;
        r8 = X.EnumC223019sg.values();
        r11 = r8.length;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x06e9, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x06ea, code lost:
    
        if (r0 >= r11) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x06ec, code lost:
    
        r7 = r8[r0];
        r10 = r7.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x06f0, code lost:
    
        if (r1 == null) goto L611;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x06f6, code lost:
    
        if (r10 != r1.intValue()) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x06f8, code lost:
    
        r7 = r7.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x06fa, code lost:
    
        r6.add(new X.MUD(r7, r13, r12, 22));
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0705, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x08cb, code lost:
    
        r66 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x08cf, code lost:
    
        if (r4 != X.C05F.A0N) goto L536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x08d1, code lost:
    
        r66 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x08d3, code lost:
    
        r11 = r4;
        r12 = r14;
        r42 = new X.C9G8(r115, r2, r116, r11, r12, 1);
        r43 = new X.C9G8(r115, r2, r116, r11, r12, 2);
        r44 = new X.C7QU(r115, r116, r0, r2, r23, r5, r0, r0, r0, r0, r0, r118);
        r45 = new X.C9FW(18, r114, r115, r2, r0);
        r0 = r2.A1o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x090f, code lost:
    
        if (r0 == null) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0911, code lost:
    
        r1 = r0.length();
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0916, code lost:
    
        if (r1 != 0) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0919, code lost:
    
        r1 = !r0;
        r71 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0921, code lost:
    
        if (r2.A1S() == false) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0923, code lost:
    
        r71 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0925, code lost:
    
        r10 = r2.A2K;
        r73 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x092b, code lost:
    
        if (r2.A2B == null) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x092d, code lost:
    
        r73 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x092f, code lost:
    
        r0 = r2.A12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0931, code lost:
    
        if (r0 == null) goto L598;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0933, code lost:
    
        r0 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0935, code lost:
    
        if (r0 == null) goto L598;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0937, code lost:
    
        r7 = (com.instagram.model.mediasize.GifUrlImpl) r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x093b, code lost:
    
        r0 = r2.A0q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x093d, code lost:
    
        if (r0 == null) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x093f, code lost:
    
        r9 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0941, code lost:
    
        r0 = r2.A1z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0943, code lost:
    
        if (r0 == null) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0945, code lost:
    
        r38 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0949, code lost:
    
        if (r17 == false) goto L561;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x094b, code lost:
    
        r82 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0958, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r115, 36323672293846496L) != false) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x095c, code lost:
    
        if (r6 == null) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x095e, code lost:
    
        r41 = X.AbstractC133095zb.A00(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0962, code lost:
    
        r0 = r2.A0Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0964, code lost:
    
        if (r0 == null) goto L595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0966, code lost:
    
        r8 = r0.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0968, code lost:
    
        r6 = r2.A0f();
        r92 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x096e, code lost:
    
        if (r6 == null) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0970, code lost:
    
        X.C14360o3.A0B("cutout_", 1);
        r92 = r6.startsWith("cutout_");
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x097b, code lost:
    
        r95 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0981, code lost:
    
        if (r2.A10 != X.C2EY.A1C) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0983, code lost:
    
        r95 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0985, code lost:
    
        r32 = new X.C7QV(r7, r4, r35, r14, r9, r38, r8, r31, r41, r42, r43, r44, r45, r0, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r10, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, true, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95);
        r4 = X.C08730cb.A00(r115).A00();
        r9 = X.C4GR.A03(r5);
        r8 = X.C7QW.A01(r115, r5, X.C161857Mv.A02.A03(r115, r0));
        r107 = r2.A1k(r4);
        r6 = new com.instagram.model.direct.messageid.MessageIdentifier(r2.A0i(), r2.A0g());
        r103 = java.util.concurrent.TimeUnit.MICROSECONDS.toMillis(r2.C8i());
        r106 = r2.A1P();
        r108 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x09d5, code lost:
    
        if (r8 != false) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x09d7, code lost:
    
        if (r107 != false) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x09d9, code lost:
    
        r107 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x09df, code lost:
    
        if (r2.A0q(r4) == null) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x09e1, code lost:
    
        r107 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x09e3, code lost:
    
        if (r9 == false) goto L594;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x09e5, code lost:
    
        r102 = r2.A0r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x09ed, code lost:
    
        if (r2.A1j(r4) != false) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x09ef, code lost:
    
        r0 = X.AnonymousClass189.A00(r115).A02(r2.A1u);
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x09f9, code lost:
    
        if (r0 == null) goto L593;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x09fb, code lost:
    
        r1 = r0.A03.Aaj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0a07, code lost:
    
        if (X.C14360o3.A0K(r1, r115.userId) == false) goto L591;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0a0b, code lost:
    
        if (r5 == 1013) goto L591;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0a1e, code lost:
    
        return new X.C7QX(null, r32, r98, r118, r6, null, r102, r103, r105, r106, r107, r108, r2.A2P);
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0a1f, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0a0d, code lost:
    
        r108 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0a21, code lost:
    
        r102 = r2.A0s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0a26, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0a2a, code lost:
    
        r41 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x095a, code lost:
    
        r82 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0a2e, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0a32, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0918, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x08c9, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0693, code lost:
    
        r88 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x067d, code lost:
    
        r84 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0666, code lost:
    
        if (r5 != 1014) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0670, code lost:
    
        if (X.C14360o3.A0K(r115.userId, r22) == false) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0708, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x065e, code lost:
    
        r60 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x05c9, code lost:
    
        r80 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x05b7, code lost:
    
        r79 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x059d, code lost:
    
        r78 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0578, code lost:
    
        r77 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x076b, code lost:
    
        r76 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0761, code lost:
    
        if (X.C7QQ.A02(r115, r0, r2, r15, r5) == false) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0767, code lost:
    
        if (X.C1580877s.A03(r2) != false) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0514, code lost:
    
        r94 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x04fd, code lost:
    
        r93 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003b, code lost:
    
        if (X.C7QN.A00(r115, r117) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x04cc, code lost:
    
        if (r2.A0Q == null) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x04da, code lost:
    
        if ((!r2.A1u.equals(X.AbstractC31271Dot.A00(r115))) == false) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x04dc, code lost:
    
        r1 = X.AbstractC47093Kro.A00(r115).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x04e4, code lost:
    
        if (r1 == false) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x076f, code lost:
    
        r1 = X.C18U.A06(X.C06090Tz.A05, r115, 36325540605211805L);
        X.C14360o3.A0A(java.lang.Boolean.valueOf(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0783, code lost:
    
        r50 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x04a9, code lost:
    
        r67 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x04ab, code lost:
    
        if (r8 != false) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0479, code lost:
    
        r68 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x047b, code lost:
    
        if (r33 == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x047d, code lost:
    
        r69 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x048f, code lost:
    
        if (X.C7QQ.A01(r115, r0, r2, r0, r5, r0, r0) != false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0461, code lost:
    
        r91 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0787, code lost:
    
        r31 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x078b, code lost:
    
        r14 = r2.A0f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x078f, code lost:
    
        if (r14 != null) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0793, code lost:
    
        if (r1 == null) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0795, code lost:
    
        r14 = r1.getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0799, code lost:
    
        if (r14 != null) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x079d, code lost:
    
        r0 = r2.A15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x079f, code lost:
    
        if (r0 == null) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x07a1, code lost:
    
        r14 = r0.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x07a3, code lost:
    
        if (r14 != null) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x07a7, code lost:
    
        r7 = r2.A0f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x07ab, code lost:
    
        if (r7 == null) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x07ad, code lost:
    
        X.C14360o3.A0B("cutout_", 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x07b8, code lost:
    
        if (r7.startsWith("cutout_") == false) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x07ba, code lost:
    
        r4 = X.C05F.A0j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x07be, code lost:
    
        if (r1 == null) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x07c6, code lost:
    
        if (r1.Cdi() != true) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x07c8, code lost:
    
        r4 = X.C05F.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x07cc, code lost:
    
        r0 = r1.getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x07d0, code lost:
    
        if (r0 == null) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x07d6, code lost:
    
        if (r0.length() <= 0) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x07e4, code lost:
    
        if (X.C14360o3.A0K(r1.CPm(), true) != false) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x07e6, code lost:
    
        r4 = X.C05F.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x07ea, code lost:
    
        r0 = r2.A10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x07ee, code lost:
    
        if (r0 == X.C2EY.A0O) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x07f2, code lost:
    
        if (r0 == X.C2EY.A0J) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x07f6, code lost:
    
        if (r0 != X.C2EY.A1f) goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x07f8, code lost:
    
        r4 = X.C05F.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x07fc, code lost:
    
        r4 = X.C05F.A0u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0800, code lost:
    
        r4 = X.C05F.A0Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0804, code lost:
    
        r35 = "";
        r62 = false;
        r65 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017f, code lost:
    
        if (r2.A1R() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x080c, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x03ec, code lost:
    
        r59 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x03d3, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x080f, code lost:
    
        r59 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x03b5, code lost:
    
        r58 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0393, code lost:
    
        r48 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x036d, code lost:
    
        r47 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x032d, code lost:
    
        r57 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x032f, code lost:
    
        if (r1 == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0331, code lost:
    
        if (r0 != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0333, code lost:
    
        if (r0 != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0337, code lost:
    
        if (r2.A13 != null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x033d, code lost:
    
        if (r11.AFi(r2) == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0345, code lost:
    
        if (r4.A00(X.EnumC2054697t.A0r) == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0347, code lost:
    
        r56 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0349, code lost:
    
        if (r5 != 29) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x02f9, code lost:
    
        r55 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x02cf, code lost:
    
        r54 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x02b1, code lost:
    
        r53 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0277, code lost:
    
        r90 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0247, code lost:
    
        if (r9 == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0193, code lost:
    
        if (r4.A00(X.EnumC2054697t.A0F) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f3, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r115, 36325763942921549L) == false) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0831  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C7QX A00(android.content.Context r114, com.instagram.common.session.UserSession r115, X.AnonymousClass988 r116, X.C160787Im r117, X.C2EY r118) {
        /*
            Method dump skipped, instructions count: 2630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7QM.A00(android.content.Context, com.instagram.common.session.UserSession, X.988, X.7Im, X.2EY):X.7QX");
    }
}
