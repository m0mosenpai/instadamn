package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gib, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37700Gib implements InterfaceC669530m, InterfaceC116905Qw, InterfaceC120815dY {
    public int A00;
    public int A01;
    public C1ON A02;
    public InterfaceC670130s A04;
    public Integer A05;
    public String A07;
    public java.util.Set A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0G;
    public boolean A0H;
    public int A0I;
    public boolean A0K;
    public final long A0L;
    public final Context A0M;
    public final InterfaceC08100bW A0N;
    public final InterfaceC116925Qy A0O;
    public final C37682GiJ A0P;
    public final UserSession A0Q;
    public final AnonymousClass318 A0R;
    public final InterfaceC60442pS A0S;
    public final C31G A0T;
    public final C37701Gic A0U;
    public final C37824Gke A0V;
    public final AbstractC39459Hbl A0W;
    public final C37604Ggz A0X;
    public final C37624GhJ A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;
    public final InterfaceC09390do A0f;
    public final InterfaceC09390do A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final long A0j;
    public final C13920nI A0k;
    public final C37646Ghf A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final List A0d = AbstractC166987dD.A1E();
    public final List A0e = AbstractC166987dD.A1E();
    public Integer A06 = C05F.A00;
    public boolean A0F = true;
    public boolean A0J = true;
    public InterfaceC669830p A03 = new C669730o();

    public C37700Gib(Context context, InterfaceC116925Qy interfaceC116925Qy, C37682GiJ c37682GiJ, UserSession userSession, AnonymousClass318 anonymousClass318, InterfaceC60442pS interfaceC60442pS, C31G c31g, C37646Ghf c37646Ghf, AbstractC39459Hbl abstractC39459Hbl, C37604Ggz c37604Ggz, C37624GhJ c37624GhJ, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.A0Q = userSession;
        this.A0X = c37604Ggz;
        this.A0M = context;
        this.A0O = interfaceC116925Qy;
        this.A0W = abstractC39459Hbl;
        this.A0Z = str;
        this.A0c = str2;
        this.A0a = str3;
        this.A0b = str4;
        this.A0T = c31g;
        this.A0S = interfaceC60442pS;
        this.A0P = c37682GiJ;
        this.A0h = z;
        this.A0o = z2;
        this.A0l = c37646Ghf;
        this.A0Y = c37624GhJ;
        this.A0R = anonymousClass318;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0p = C18U.A06(c06090Tz, userSession, 36318526922823916L);
        this.A0q = C18U.A06(c06090Tz, userSession, 36318526922889453L);
        this.A0m = C18U.A06(c06090Tz, userSession, 36318526923675897L);
        this.A0n = C18U.A06(c06090Tz, userSession, 36318526923872508L);
        this.A0r = C18U.A06(c06090Tz, userSession, 36320506903077471L);
        C06090Tz c06090Tz2 = C06090Tz.A06;
        this.A0i = C18U.A06(c06090Tz2, userSession, 36320506904060522L);
        this.A0L = C18U.A01(c06090Tz2, userSession, 36601981880832440L);
        this.A0N = AbstractC31175DnJ.A0B();
        this.A0j = C18U.A01(c06090Tz, userSession, 36600001900973745L);
        this.A0f = J8Z.A00(this, 6);
        this.A0g = AbstractC09440dt.A00(EnumC09460dv.A02, new J8Z(this, 7));
        this.A0s = C18U.A06(c06090Tz, userSession, 36318526924593414L);
        this.A0k = C13920nI.A00;
        this.A0V = AbstractC37696GiX.A00(userSession);
        this.A0U = new C37701Gic(context, new C37477Gev(this, 0), userSession);
        C37702Gid c37702Gid = (C37702Gid) this.A0f.getValue();
        if (c37702Gid != null && c37646Ghf != null) {
            c37646Ghf.A00 = c37702Gid;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x02e3, code lost:
    
        if (r50.A0H != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0208, code lost:
    
        if (r50.A0H != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x00f2, code lost:
    
        if (r2 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0186, code lost:
    
        if (r50.A0H != false) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01da  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(java.util.List r51, boolean r52, boolean r53) {
        /*
            Method dump skipped, instructions count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37700Gib.A05(java.util.List, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        if (r8.A0o != false) goto L13;
     */
    @Override // X.InterfaceC669530m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A7S(X.AnonymousClass320 r9, X.InterfaceC669830p r10, X.InterfaceC670130s r11) {
        /*
            r8 = this;
            r4 = 0
            boolean r3 = X.AbstractC25233BEq.A1b(r11, r10, r9)
            r8.A09 = r3
            r8.A04 = r11
            X.0do r0 = r8.A0f
            java.lang.Object r0 = r0.getValue()
            X.Gid r0 = (X.C37702Gid) r0
            if (r0 == 0) goto L15
            r0.A00 = r11
        L15:
            r8.A03 = r10
            int r5 = r9.A01
            r8.A0I = r5
            com.instagram.common.session.UserSession r6 = r8.A0Q
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318479679887543(0x810777001a18b7, double:3.0312910201157354E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            if (r0 == 0) goto L53
            boolean r0 = r8.A0G
            if (r0 == 0) goto L53
            X.0wb r7 = X.C18950wb.A01
            r1 = 817895520(0x30c01860, float:1.3976766E-9)
            java.lang.String r0 = "sync flow is enabled upon acp activation"
            X.0f5 r7 = r7.AEp(r0, r1)
            java.lang.String r1 = r8.A0Z
            java.lang.String r0 = "Container Module"
            r7.ABW(r0, r1)
            java.util.List r0 = r9.A03
            int r1 = r0.size()
            java.lang.String r0 = "Entry organic list size"
            r7.ABU(r0, r1)
            java.lang.String r0 = "Entry point index"
            r7.ABU(r0, r5)
            r7.report()
        L53:
            if (r5 == 0) goto L5a
            boolean r0 = r8.A0o
            r7 = 0
            if (r0 == 0) goto L5b
        L5a:
            r7 = 1
        L5b:
            r0 = 36318526924331266(0x81078200171902, double:3.031320897692184E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            if (r0 == 0) goto L84
            long r0 = r8.A0j
            int r2 = (int) r0
        L69:
            java.util.List r6 = r9.A03
            int r0 = r6.size()
            if (r0 < r2) goto L83
            if (r7 == 0) goto L83
            boolean r0 = r8.A0m
            if (r0 == 0) goto L8b
            X.Hbl r2 = r8.A0W
            java.lang.String r1 = r8.A0Z
            java.lang.String r0 = "reels list already contains ads when entering surface"
            boolean r0 = X.AbstractC37800GkF.A09(r2, r0, r1)
            if (r0 == 0) goto L8b
        L83:
            return r3
        L84:
            boolean r0 = r8.A0n
            r2 = 1
            if (r0 != 0) goto L69
            r2 = 2
            goto L69
        L8b:
            boolean r0 = X.AbstractC167007dF.A1N(r5)
            r8.A05(r6, r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37700Gib.A7S(X.320, X.30p, X.30s):boolean");
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ void CKM(C206209Bd c206209Bd, List list) {
    }

    @Override // X.InterfaceC669530m
    public final void Co5() {
    }

    @Override // X.InterfaceC669530m
    public final void CoL(AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, boolean z) {
    }

    @Override // X.InterfaceC669530m
    public final void CoN(int i) {
    }

    @Override // X.InterfaceC116905Qw
    public final void D5G(C37752GjR c37752GjR) {
        C14360o3.A0B(c37752GjR, 0);
        this.A0d.clear();
        UserSession userSession = this.A0Q;
        if (!C18U.A06(C06090Tz.A06, userSession, 36315112425065490L)) {
            this.A0e.clear();
        }
        this.A0K = false;
        this.A0H = false;
        this.A0A = false;
        if (c37752GjR.A01 && C18U.A06(C06090Tz.A05, userSession, 36325343036257290L)) {
            C1ON c1on = this.A02;
            if (c1on != null) {
                c1on.cancel();
            }
            this.A02 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e2, code lost:
    
        if (r12.hasNext() == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e4, code lost:
    
        r6 = r12.next();
        r5 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ea, code lost:
    
        if (r4 >= 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f4, code lost:
    
        r6 = (X.C120985dq) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fa, code lost:
    
        if (r6.A03 != X.C05F.A01) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01fe, code lost:
    
        if (r6.A09 != false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x020a, code lost:
    
        if (r39.A0d.contains(r6.getId()) != false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x020c, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x020e, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01ec, code lost:
    
        X.AbstractC16960so.A1U();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01f3, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0280, code lost:
    
        r39.A00 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0282, code lost:
    
        r14 = r39.A0W;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x028e, code lost:
    
        if (X.C18U.A06(r7, r2, 36318479679494321L) != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0290, code lost:
    
        r11 = r14.A0d();
        r6 = r14.A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0298, code lost:
    
        if (r6 != 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02dd, code lost:
    
        if (r11 >= r6) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02df, code lost:
    
        r12 = r14.A0F(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02e7, code lost:
    
        if (r12.A01 == X.EnumC129395t1.A08) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02ef, code lost:
    
        if (r2.contains(r12) != false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02f3, code lost:
    
        if (r12.A09 != false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02ff, code lost:
    
        if (r39.A0d.contains(r12.getId()) != false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0301, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0303, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x029a, code lost:
    
        r6 = X.AbstractC128065qa.A06(r2, r40.A01.AoN(), r2, r5);
        r4 = r40.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02a8, code lost:
    
        if (r4 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02aa, code lost:
    
        r8 = X.AbstractC25225BEi.A18(X.AbstractC16850sd.A0L(r4.size()));
        r12 = X.AbstractC166997dE.A14(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02be, code lost:
    
        if (r12.hasNext() == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02c0, code lost:
    
        r8.put(((java.util.Map.Entry) r12.next()).getKey(), java.lang.Long.valueOf(((java.lang.Number) r3.getValue()).intValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0306, code lost:
    
        A03(r39, r6, r40.A08, r8);
        r3 = (X.C37695GiW) r3.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0311, code lost:
    
        if (r3 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0313, code lost:
    
        r15 = r39.A0F;
        r13 = X.AbstractC166987dD.A1E();
        r12 = X.AbstractC166987dD.A1E();
        r16 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0329, code lost:
    
        if (r16.hasNext() == false) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x032b, code lost:
    
        r11 = r16.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0336, code lost:
    
        if (((X.C120985dq) r11).A01 != X.EnumC129395t1.A0G) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0338, code lost:
    
        r12.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x033c, code lost:
    
        r8 = r12.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0344, code lost:
    
        if (r8.hasNext() == false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0346, code lost:
    
        r13.add(((X.C120985dq) r8.next()).getId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0354, code lost:
    
        r11 = r39.A0G;
        r8 = r39.A05;
        r22 = java.lang.Integer.valueOf(r14.A0d());
        r4 = r39.A0H;
        r23 = java.lang.Integer.valueOf(r5);
        r5 = r40.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0368, code lost:
    
        if (r5 == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x036a, code lost:
    
        r33 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0372, code lost:
    
        if (r5.longValue() != (-1)) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0376, code lost:
    
        r3.CiG(new X.C85633rs(r8, r22, r23, r3, r3, null, null, null, r13, r11, r4, false, r33), r6, 200, -1, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0374, code lost:
    
        r33 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x039c, code lost:
    
        if (r39.A0s == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03a0, code lost:
    
        if (r39.A0J != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03a2, code lost:
    
        r39.A03.CtS();
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03a7, code lost:
    
        r4 = r39.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03a9, code lost:
    
        if (r4 == null) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03ab, code lost:
    
        r4.DnX(X.C05F.A00, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03b0, code lost:
    
        r9 = r39.A0G;
        r8 = r39.A0H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03bd, code lost:
    
        if (X.C18U.A06(r7, r2, 36318479680346300L) == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03bf, code lost:
    
        r2 = r40.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03c9, code lost:
    
        if (r2.AoN().isEmpty() != false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03cb, code lost:
    
        r3 = r2.AoN().iterator();
        r4 = false;
        r12 = 0;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03da, code lost:
    
        if (r3.hasNext() == false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03dc, code lost:
    
        r2 = (X.InterfaceC43554JLo) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03e6, code lost:
    
        if (r2.AZH() == null) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03ef, code lost:
    
        if (r2.BWY() == null) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03f1, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03e8, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03f4, code lost:
    
        if (r6 == null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03f6, code lost:
    
        r3 = r6.iterator();
        r7 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0400, code lost:
    
        if (r3.hasNext() == false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0402, code lost:
    
        r2 = (X.C120985dq) ((X.C206239Bg) r3.next()).A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0412, code lost:
    
        if (X.AbstractC37647Ghg.A01(r2.A01) == false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x041b, code lost:
    
        if (r2.A0H() == false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x041d, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0414, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0422, code lost:
    
        if (r12 != r7) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0424, code lost:
    
        if (r11 != r6) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0428, code lost:
    
        if (r39.A04 != null) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x042a, code lost:
    
        r3 = X.C18950wb.A01;
        r5 = X.AbstractC166987dD.A1C();
        r5.append("Sponsored Item Delivery Discrepancy, adCountInResponse: ");
        r5.append(r12);
        r5.append(", netegoCountInResponse: ");
        r5.append(r11);
        r5.append(", adCountDelivery: ");
        r5.append(r7);
        r5.append(", netegoCountDelivery: ");
        r5.append(r6);
        r5.append(", shouldEnableSyncFlow: ");
        r5.append(r9);
        r5.append(", shouldFallBackToAsync: ");
        r5.append(r8);
        r5.append(", isPrefetch: ");
        r5.append(r2);
        r5.append(", isHeadLoad: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0472, code lost:
    
        if (r2 != false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0474, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0475, code lost:
    
        if (r10 == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0478, code lost:
    
        r5.append(r1);
        r5.append(", current_module: ");
        r5.append(r3);
        r5.append(", responseCallback is null: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x048c, code lost:
    
        if (r39.A04 != null) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x048e, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x048f, code lost:
    
        r5.append(r4);
        X.AbstractC166987dD.A1T(r3, r5.toString(), 817895520);
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0499, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0477, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0420, code lost:
    
        r7 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0210, code lost:
    
        if (r5 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x021a, code lost:
    
        if (r11 != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0223, code lost:
    
        if (X.C1LE.A05(r2) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
    
        if (r10 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0247, code lost:
    
        if (java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(X.AbstractC37300Gc1.A00(r16)) <= r14) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b7, code lost:
    
        if (r39.A0p == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b9, code lost:
    
        if (r5 != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01bb, code lost:
    
        r39.A0K = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r40.A0G != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bd, code lost:
    
        r6 = X.C16930sl.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c1, code lost:
    
        if (r39.A0G == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c5, code lost:
    
        if (r39.A0H != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d0, code lost:
    
        if (X.C18U.A06(r7, r2, 36318479681132743L) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d2, code lost:
    
        if (r5 == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d4, code lost:
    
        if (r2 != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d6, code lost:
    
        r12 = X.AbstractC37552Gg8.A08(r39.A0W);
        r11 = 0;
        r4 = 0;
     */
    @Override // X.InterfaceC116905Qw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D5H(X.C37818GkY r40) {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37700Gib.D5H(X.GkY):void");
    }

    @Override // X.InterfaceC669530m
    public final boolean D7a(int i, int i2) {
        return false;
    }

    @Override // X.InterfaceC669530m
    public final void Dtv(int i) {
    }

    private final void A01(C38321qM c38321qM) {
        UserSession userSession = this.A0Q;
        if (!C18U.A06(C06090Tz.A05, userSession, 36318329354393705L) || c38321qM.Cff() || c38321qM.A5p()) {
            C4AG.A00(userSession).A01(new C4AD(c38321qM.CFR(), this.A0S.getModuleName()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bf, code lost:
    
        if (r0 != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C37700Gib r43, java.util.List r44) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37700Gib.A02(X.Gib, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x0322, code lost:
    
        if (r26 != null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0324, code lost:
    
        r9 = r24.A0W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x032a, code lost:
    
        if (r9.A0Z() != false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x032c, code lost:
    
        r8 = X.AbstractC166987dD.A1E();
        r7 = X.AbstractC166987dD.A1E();
        r10 = X.AbstractC166987dD.A1G();
        r11 = r26.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0340, code lost:
    
        if (r11.hasNext() == false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0342, code lost:
    
        r0 = (com.instagram.api.schemas.MediaIdToBrandSafetyContentBlocklistBitmapMapImpl) r11.next();
        r1 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x034a, code lost:
    
        if (r1 == null) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x034c, code lost:
    
        r0 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x034e, code lost:
    
        if (r0 == null) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0350, code lost:
    
        r10.put(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0366, code lost:
    
        r0 = r9.A0L(X.EnumC129395t1.A0G);
        r11 = X.AbstractC167017dG.A0q(r0);
        r13 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0378, code lost:
    
        if (r13.hasNext() == false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x037a, code lost:
    
        r12 = ((X.C120985dq) r13.next()).A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0382, code lost:
    
        if (r12 == null) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0384, code lost:
    
        r9 = r12.A2u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0388, code lost:
    
        if (r9 == null) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x038e, code lost:
    
        if (r10.containsKey(r9) == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0390, code lost:
    
        r1 = (com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj) r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0396, code lost:
    
        if (r1 == null) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0398, code lost:
    
        r12.A0C.EQZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x039d, code lost:
    
        r7.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x03a0, code lost:
    
        r11.add(X.C0eB.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x03aa, code lost:
    
        if (r10.containsKey(r9) != false) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x03ac, code lost:
    
        r8.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x03b4, code lost:
    
        if (X.AbstractC25226BEj.A1b(r8) == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03bf, code lost:
    
        if (X.C18U.A06(r3, r15, 36317899857598104L) == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x03c1, code lost:
    
        r2 = X.C18950wb.A01.AEp("UNMATCHED_ORGANIC_MEDIA", 817903741);
        r1 = X.AbstractC166987dD.A1C();
        r1.append(r8.size());
        r1.append(" Unmatched organic media ids in adapter: ");
        r1.append(r8);
        r2.ABW(com.facebook.react.modules.dialog.DialogModule.KEY_MESSAGE, X.AbstractC167017dG.A0n(r7, " organic media ids in brs severity map: ", r1));
        r2.report();
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x03ea, code lost:
    
        if (r24.A0G == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x03ee, code lost:
    
        if (r24.A0H == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x03f3, code lost:
    
        r7 = r25.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x03fb, code lost:
    
        if (r7.hasNext() == false) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x03fd, code lost:
    
        r6 = (X.C120985dq) ((X.C206239Bg) r7.next()).A03;
        r0 = r6.A02;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x040a, code lost:
    
        if (r0 == null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x040c, code lost:
    
        r1 = r0.A0C.BNL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0412, code lost:
    
        if (r1 == null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0414, code lost:
    
        r5 = X.AbstractC08820cl.A01(r24.A0N, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x041e, code lost:
    
        if (r6.CdW() == false) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0420, code lost:
    
        r0 = r6.A06().A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0428, code lost:
    
        if (r0 == null) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x042a, code lost:
    
        r0 = (com.instagram.model.androidlink.AndroidLink) X.AbstractC001800i.A0J(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0430, code lost:
    
        if (r0 == null) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0432, code lost:
    
        r2 = X.AbstractC114965Hm.A01(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0438, code lost:
    
        if (r2 != X.EnumC906041v.AD_DESTINATION_CANVAS) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x043a, code lost:
    
        if (r5 == null) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0442, code lost:
    
        if (X.AbstractC41668Ic0.A02(r5, "clips_canvas_bloks_prefetch") == false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0444, code lost:
    
        r1 = r6.A06().A0K.A0C.Ap5();
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0450, code lost:
    
        if (r1 == null) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0454, code lost:
    
        if ((r1 instanceof java.util.Collection) == false) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x045a, code lost:
    
        if (r1.isEmpty() == false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x045d, code lost:
    
        r2 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0465, code lost:
    
        if (r2.hasNext() == false) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0475, code lost:
    
        if (((X.C38321qM) r2.next()).A0C.Ap7() != com.instagram.api.schemas.CollectionMediaRole.A05) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0477, code lost:
    
        X.AbstractC41668Ic0.A01(r24.A0M, r5, r15, "clips_canvas_bloks_prefetch");
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x047e, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0480, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x03f0, code lost:
    
        A02(r24, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0360, code lost:
    
        if (r26.isEmpty() != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0299, code lost:
    
        if (r27.isEmpty() != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01bb, code lost:
    
        if (r8 == 0) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C37700Gib r24, java.util.List r25, java.util.List r26, java.util.Map r27) {
        /*
            Method dump skipped, instructions count: 1153
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37700Gib.A03(X.Gib, java.util.List, java.util.List, java.util.Map):void");
    }

    private final void A04(boolean z, boolean z2) {
        if (this.A0s && !z) {
            this.A03.CtS();
            List list = this.A0d;
            int AuR = this.A03.AuR();
            int A01 = this.A0Y.A01();
            if (AuR < A01) {
                AuR = A01;
            }
            ArrayList A00 = A00(list, AuR, true, z);
            list.clear();
            list.addAll(A00);
        }
        List list2 = this.A0d;
        A05(list2, z, z2);
        list2.clear();
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ boolean AFs() {
        return false;
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ C51G AND() {
        return new C43000Izq();
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ String B5L() {
        return "";
    }

    @Override // X.InterfaceC669530m
    public final int BX5() {
        return 0;
    }

    @Override // X.InterfaceC669530m
    public final int Bg5() {
        return 0;
    }

    @Override // X.InterfaceC120815dY
    public final Map Bkt() {
        InterfaceC670130s interfaceC670130s = this.A04;
        if (interfaceC670130s != null) {
            return interfaceC670130s.Bkt();
        }
        return null;
    }

    @Override // X.InterfaceC120815dY
    public final boolean CKw() {
        return this.A0B;
    }

    @Override // X.InterfaceC669530m
    public final boolean CUl() {
        return AbstractC25229BEm.A1a(this.A06, C05F.A00);
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ void Cnx(boolean z) {
        AbstractC12120kG.A07("ClipsSponsoredContentFetcher", "Call of unsupported method maybeCarryOverFirstResponse", null);
    }

    @Override // X.InterfaceC116905Qw
    public final void D5E(C38971HDz c38971HDz) {
        this.A0d.clear();
        this.A0e.clear();
        this.A0K = true;
    }

    @Override // X.InterfaceC116905Qw
    public final void D5F() {
        if (AbstractC166987dD.A1b(this.A0d)) {
            if (!this.A0q || this.A0K) {
                A04(this.A0J, this.A0D);
            }
        }
    }

    @Override // X.InterfaceC669530m
    public final void deactivate() {
        C1ON c1on = this.A02;
        if (c1on != null) {
            c1on.cancel();
        }
        this.A02 = null;
        this.A09 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
    
        r8.A0A = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b2, code lost:
    
        if (r8.A0I != 0) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.ArrayList A00(java.util.List r9, int r10, boolean r11, boolean r12) {
        /*
            r8 = this;
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            com.instagram.common.session.UserSession r4 = r8.A0Q
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36318526924921099(0x8107820020190b, double:3.031320898065197E-306)
            boolean r0 = X.C18U.A06(r3, r4, r0)
            r4 = 0
            r3 = 1
            if (r0 == 0) goto Lad
            if (r10 == 0) goto Lad
        L17:
            int r5 = r10 + 1
        L19:
            X.Hbl r7 = r8.A0W
            java.util.List r0 = r7.A0J()
            int r6 = X.AbstractC31172DnG.A03(r0, r3)
            if (r5 > r6) goto La2
        L25:
            X.5dq r0 = r7.A0F(r6)
            java.lang.String r0 = r0.getId()
            boolean r0 = r9.contains(r0)
            if (r0 != 0) goto L4d
            X.5dq r0 = r7.A0F(r6)
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.C05F.A01
            if (r1 == r0) goto L4d
            java.lang.String r1 = r8.A0c
            X.5dq r0 = r7.A0F(r6)
            java.lang.String r0 = r0.getId()
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L66
        L4d:
            java.util.List r0 = r7.A0J()
            java.lang.Object r0 = X.AbstractC001800i.A0O(r0, r6)
            X.5dq r0 = (X.C120985dq) r0
            if (r0 == 0) goto L66
            X.1qM r0 = r0.A02
            if (r0 == 0) goto L66
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L66
            r2.add(r4, r0)
        L66:
            X.5dq r0 = r7.A0F(r6)
            X.C14360o3.A0B(r0, r4)
            boolean r0 = X.AbstractC37647Ghg.A00(r0)
            if (r0 != 0) goto La2
            X.5dq r0 = r7.A0F(r6)
            X.C14360o3.A0B(r0, r4)
            X.5t1 r1 = r0.A01
            X.5t1 r0 = X.EnumC129395t1.A0B
            if (r1 == r0) goto La2
            X.5dq r0 = r7.A0F(r6)
            X.5t1 r1 = r0.A01
            X.5t1 r0 = X.EnumC129395t1.A0G
            if (r1 != r0) goto La7
            X.5dq r0 = r7.A0F(r6)
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.C05F.A01
            if (r1 == r0) goto La7
            X.5dq r0 = r7.A0F(r6)
            java.lang.String r0 = r0.getId()
            boolean r0 = r9.contains(r0)
            if (r0 != 0) goto La7
        La2:
            if (r11 == 0) goto La6
            r8.A0A = r3
        La6:
            return r2
        La7:
            if (r6 == r5) goto La2
            int r6 = r6 + (-1)
            goto L25
        Lad:
            if (r12 == 0) goto L17
            int r0 = r8.A0I
            r5 = 0
            if (r0 == 0) goto L19
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37700Gib.A00(java.util.List, int, boolean, boolean):java.util.ArrayList");
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ java.util.Set Bts() {
        return AbstractC166987dD.A1H();
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ void CoM(C9C3 c9c3, AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, String str, String str2, double d, boolean z) {
        AbstractC167017dG.A1Q(anonymousClass320, enumC37671p4);
    }
}
