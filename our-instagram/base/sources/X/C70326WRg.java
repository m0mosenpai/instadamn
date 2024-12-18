package X;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import com.google.common.collect.ImmutableList;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.WRg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70326WRg implements XE1, InterfaceC71878X8l {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public WFa A0B;
    public InterfaceC72026XFo A0C;
    public MotionPhotoMetadata A0D;
    public ImmutableList A0E;
    public boolean A0F;
    public C69261VkV[] A0G;
    public long[][] A0H;
    public final int A0I;
    public final WFa A0J;
    public final WFa A0K;
    public final WFa A0L;
    public final WFa A0M;
    public final W2S A0N;
    public final ArrayDeque A0O;
    public final List A0P;
    public final InterfaceC72027XFp A0Q;

    @Override // X.InterfaceC71878X8l
    public final C69736VuW Bs4(long j) {
        return A01(-1, j);
    }

    @Override // X.XE1
    public final /* synthetic */ XE1 CCR() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x023d, code lost:
    
        if (r14 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x023f, code lost:
    
        if (r13 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0243, code lost:
    
        if (r15 == (-1)) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0245, code lost:
    
        r11.A0O(r15);
        r11.A0P(16);
        r6 = new androidx.media3.extractor.metadata.id3.InternalFrame(r14, r13, r11.A0G(r5 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0257, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x031c, code lost:
    
        r11.A0O(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x031f, code lost:
    
        if (r5 == null) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0321, code lost:
    
        r22.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01ef, code lost:
    
        r5 = X.WDo.A03(r11, "TVSHOW", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01e2, code lost:
    
        r5 = X.WDo.A03(r11, "TVSHOWSORT", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01d5, code lost:
    
        r5 = X.WDo.A01(r11, "ITUNESGAPLESS", r5, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c8, code lost:
    
        r5 = X.WDo.A01(r11, "ITUNESADVISORY", r5, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01bb, code lost:
    
        r5 = X.WDo.A03(r11, "TSOC", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01ae, code lost:
    
        r5 = X.WDo.A03(r11, "TSO2", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01a1, code lost:
    
        r5 = X.WDo.A03(r11, "TSOP", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0194, code lost:
    
        r5 = X.WDo.A03(r11, "TSOA", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0187, code lost:
    
        r5 = X.WDo.A03(r11, "TSOT", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x017a, code lost:
    
        r5 = X.WDo.A03(r11, "TPE2", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x012e, code lost:
    
        r13 = r11.A01();
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x013c, code lost:
    
        if (r11.A01() != 1684108385) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x013e, code lost:
    
        r4 = r11.A01() & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0148, code lost:
    
        if (r4 != 13) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x014a, code lost:
    
        r4 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x014c, code lost:
    
        r11.A0P(4);
        r6 = r13 - 16;
        r3 = new byte[r6];
        r11.A0R(r3, 0, r6);
        r6 = new androidx.media3.extractor.metadata.id3.ApicFrame(r4, null, r3, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0162, code lost:
    
        if (r4 != 14) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0164, code lost:
    
        r4 = "image/png";
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x016a, code lost:
    
        r3 = X.AnonymousClass001.A0O("Unrecognized cover art flags: ", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0170, code lost:
    
        X.AbstractC63374Sil.A04("MetadataUtil", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0167, code lost:
    
        r3 = "Failed to parse cover art attribute";
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0121, code lost:
    
        r5 = X.WDo.A01(r11, "TCMP", r5, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0114, code lost:
    
        r5 = X.WDo.A01(r11, "TBPM", r5, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0107, code lost:
    
        r5 = X.WDo.A02(r11, "TRCK", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x00fa, code lost:
    
        r5 = X.WDo.A02(r11, "TPOS", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x00c2, code lost:
    
        r5 = X.WDo.A00(r11) - 1;
        r3 = X.Xk5.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x00ca, code lost:
    
        if (r5 < 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x00cc, code lost:
    
        r4 = X.Xk5.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x00d2, code lost:
    
        if (r5 >= r3.size()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x00d4, code lost:
    
        r3 = (java.lang.String) r4.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00dc, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x00dd, code lost:
    
        if (r3 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x00df, code lost:
    
        r6 = new androidx.media3.extractor.metadata.id3.TextInformationFrame("TCON", null, com.google.common.collect.ImmutableList.of((java.lang.Object) r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x00ec, code lost:
    
        X.AbstractC63374Sil.A04("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x00db, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0713, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0714, code lost:
    
        r11.A0O(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0717, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x025a, code lost:
    
        r4 = 16777215 & r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0261, code lost:
    
        if (r4 != 6516084) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0296, code lost:
    
        if (r4 == 7233901) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x029b, code lost:
    
        if (r4 == 7631467) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02a0, code lost:
    
        if (r4 == 6516589) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02a5, code lost:
    
        if (r4 == 7828084) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02aa, code lost:
    
        if (r4 != 6578553) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02b6, code lost:
    
        if (r4 != 4280916) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02c2, code lost:
    
        if (r4 != 7630703) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x02ce, code lost:
    
        if (r4 != 6384738) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02da, code lost:
    
        if (r4 != 7108978) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02e6, code lost:
    
        if (r4 != 6776174) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02f2, code lost:
    
        if (r4 != 6779504) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x02f4, code lost:
    
        r5 = X.WDo.A03(r11, "TIT1", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x02e8, code lost:
    
        r5 = X.WDo.A03(r11, "TCON", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x02dc, code lost:
    
        r5 = X.WDo.A03(r11, "USLT", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x02d0, code lost:
    
        r5 = X.WDo.A03(r11, "TALB", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x02c4, code lost:
    
        r5 = X.WDo.A03(r11, "TSSE", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x02b8, code lost:
    
        r5 = X.WDo.A03(r11, "TPE1", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x02ac, code lost:
    
        r5 = X.WDo.A03(r11, "TDRC", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x030d, code lost:
    
        r5 = X.WDo.A03(r11, "TCOM", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0314, code lost:
    
        r5 = X.WDo.A03(r11, "TIT2", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0263, code lost:
    
        r6 = r11.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x026e, code lost:
    
        if (r11.A01() != 1684108385) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0270, code lost:
    
        r11.A0P(8);
        r4 = r11.A0G(r6 - 16);
        r5 = new androidx.media3.extractor.metadata.id3.CommentFrame("und", r4, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0282, code lost:
    
        X.AbstractC63374Sil.A04("MetadataUtil", X.AnonymousClass001.A0R("Failed to parse comment attribute: ", X.W46.A00(r5)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x031b, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x032c, code lost:
    
        if (r22.isEmpty() != false) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x032e, code lost:
    
        r4 = new androidx.media3.common.Metadata(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0392, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        r11.A0O(r8);
        r8 = r8 + r6;
        r11.A0P(8);
        r22 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
    
        r7 = r11.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        if (r7 >= r8) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        r7 = r7 + r11.A01();
        r5 = r11.A01();
        r4 = (r5 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b7, code lost:
    
        if (r4 == 169) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
    
        if (r4 == 253) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
    
        if (r5 != 1735291493) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f8, code lost:
    
        if (r5 != 1684632427) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0105, code lost:
    
        if (r5 != 1953655662) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0112, code lost:
    
        if (r5 != 1953329263) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011f, code lost:
    
        if (r5 != 1668311404) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012c, code lost:
    
        if (r5 != 1668249202) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0178, code lost:
    
        if (r5 != 1631670868) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0185, code lost:
    
        if (r5 != 1936682605) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0192, code lost:
    
        if (r5 != 1936679276) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x019f, code lost:
    
        if (r5 != 1936679282) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ac, code lost:
    
        if (r5 != 1936679265) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b9, code lost:
    
        if (r5 != 1936679791) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c6, code lost:
    
        if (r5 != 1920233063) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d3, code lost:
    
        if (r5 != 1885823344) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e0, code lost:
    
        if (r5 != 1936683886) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ed, code lost:
    
        if (r5 != 1953919848) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fa, code lost:
    
        if (r5 != 757935405) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02fb, code lost:
    
        X.AbstractC63374Sil.A01(X.AnonymousClass001.A0R("Skipped unknown metadata entry: ", X.W46.A00(r5)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0308, code lost:
    
        r11.A0O(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01fc, code lost:
    
        r6 = null;
        r14 = null;
        r13 = null;
        r15 = -1;
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0203, code lost:
    
        r3 = r11.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0207, code lost:
    
        if (r3 >= r7) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0209, code lost:
    
        r20 = r11.A01();
        r4 = r11.A01();
        r11.A0P(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0219, code lost:
    
        if (r4 != 1835360622) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0225, code lost:
    
        if (r4 != 1851878757) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0231, code lost:
    
        if (r4 != 1684108385) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0233, code lost:
    
        r15 = r3;
        r5 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0237, code lost:
    
        r11.A0P(r20 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0227, code lost:
    
        r13 = r11.A0G(r20 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x021b, code lost:
    
        r14 = r11.A0G(r20 - 12);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00(long r37) {
        /*
            Method dump skipped, instructions count: 1828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70326WRg.A00(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0085, code lost:
    
        if (r3 == (-1)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0035, code lost:
    
        if (r6 == (-1)) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C69736VuW A01(int r19, long r20) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70326WRg.A01(int, long):X.VuW");
    }

    @Override // X.XE1
    public final void CNe(InterfaceC72026XFo interfaceC72026XFo) {
        if ((this.A0I & 16) == 0) {
            interfaceC72026XFo = new C70333WRn(interfaceC72026XFo, this.A0Q);
        }
        this.A0C = interfaceC72026XFo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:225:0x006f, code lost:
    
        throw new X.VCM("Invalid SEF name", null, 1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x04e9, code lost:
    
        if (r1 == 0) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0176, code lost:
    
        if (r5 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x017a, code lost:
    
        if (r14 < r16) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0185, code lost:
    
        if (r10 >= r20) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0187, code lost:
    
        r12 = r2;
        r4 = r6;
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x017c, code lost:
    
        r5 = r2;
        r16 = r14;
        r22 = r6;
        r18 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x018f, code lost:
    
        if (true == r5) goto L67;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:183:0x0064. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0617 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02c9  */
    @Override // X.XE1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int E7l(X.XGj r28, X.VZk r29) {
        /*
            Method dump skipped, instructions count: 1590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70326WRg.E7l(X.XGj, X.VZk):int");
    }

    @Override // X.XE1
    public final void EMc(long j, long j2) {
        this.A0O.clear();
        this.A00 = 0;
        this.A08 = -1;
        this.A05 = 0;
        this.A06 = 0;
        this.A07 = 0;
        if (j == 0) {
            if (this.A04 != 3) {
                this.A04 = 0;
                this.A00 = 0;
                return;
            } else {
                W2S w2s = this.A0N;
                w2s.A02.clear();
                w2s.A00 = 0;
                this.A0P.clear();
                return;
            }
        }
        for (C69261VkV c69261VkV : this.A0G) {
            C69637Vse c69637Vse = c69261VkV.A04;
            int A02 = Util.A02(c69637Vse.A07, j2, false);
            while (true) {
                if (A02 >= 0) {
                    if ((c69637Vse.A04[A02] & 1) != 0) {
                        break;
                    } else {
                        A02--;
                    }
                } else {
                    A02 = c69637Vse.A00(j2);
                    break;
                }
            }
            c69261VkV.A00 = A02;
            C69775VvC c69775VvC = c69261VkV.A02;
            if (c69775VvC != null) {
                c69775VvC.A01 = false;
                c69775VvC.A00 = 0;
            }
        }
    }

    @Override // X.XE1
    public final boolean EmK(XGj xGj) {
        ImmutableList of;
        InterfaceC71837X6u A00 = AbstractC70002VzM.A00(xGj, false, AbstractC167007dF.A1M(this.A0I & 2));
        if (A00 != null) {
            of = ImmutableList.of((Object) A00);
        } else {
            of = ImmutableList.of();
        }
        this.A0E = of;
        if (A00 == null) {
            return true;
        }
        return false;
    }

    public C70326WRg(InterfaceC72027XFp interfaceC72027XFp, int i) {
        this.A0Q = interfaceC72027XFp;
        this.A0I = i;
        this.A0E = ImmutableList.of();
        this.A04 = (i & 4) != 0 ? 3 : 0;
        this.A0N = new W2S();
        this.A0P = new ArrayList();
        this.A0J = new WFa(16);
        this.A0O = new ArrayDeque();
        this.A0L = new WFa(WFG.A01);
        this.A0K = new WFa(4);
        this.A0M = new WFa();
        this.A08 = -1;
        this.A0C = InterfaceC72026XFo.A00;
        this.A0G = new C69261VkV[0];
    }

    @Deprecated
    public C70326WRg() {
        this(InterfaceC72027XFp.A00, 16);
    }
}
