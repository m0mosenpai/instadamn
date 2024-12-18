package X;

import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.TwM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65915TwM implements InterfaceC98454bO, InterfaceC97954aa {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A05;
    public int A06;
    public int A07;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public C97974ac A0E;
    public long[][] A0G;
    public int A04 = 0;
    public final C65999Txu A0H = new C65999Txu();
    public final List A0N = new ArrayList();
    public final C97974ac A0I = new C97974ac(16);
    public final ArrayDeque A0M = new ArrayDeque();
    public final C97974ac A0K = new C97974ac(AbstractC97984ad.A01);
    public final C97974ac A0J = new C97974ac(4);
    public final C97974ac A0L = new C97974ac();
    public int A08 = -1;
    public C4XF A0D = C4XF.A00;
    public C66003Txy[] A0F = new C66003Txy[0];

    @Override // X.InterfaceC98454bO
    public final long CAK(int i) {
        if (i == 2) {
            return this.A0C;
        }
        if (i == 1) {
            return this.A0A;
        }
        return -9223372036854775807L;
    }

    @Override // X.InterfaceC98454bO
    public final boolean Cca() {
        return true;
    }

    @Override // X.InterfaceC97954aa
    public final boolean EmL(InterfaceC98284b7 interfaceC98284b7) {
        return AbstractC70023Vzj.A00(interfaceC98284b7, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0225, code lost:
    
        r14 = r12.A0A(r17 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0247, code lost:
    
        if (r14 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0249, code lost:
    
        if (r13 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x024d, code lost:
    
        if (r3 == (-1)) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x024f, code lost:
    
        r12.A0G(r3);
        r12.A0H(16);
        r1 = new com.google.android.exoplayer2.metadata.id3.InternalFrame(r14, r13, r12.A0A(r2 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0324, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0325, code lost:
    
        r12.A0G(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0328, code lost:
    
        if (r2 == null) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x032a, code lost:
    
        r19.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01fb, code lost:
    
        r2 = X.Y4W.A02(r12, "TVSHOW", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01ee, code lost:
    
        r2 = X.Y4W.A02(r12, "TVSHOWSORT", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01e1, code lost:
    
        r2 = X.Y4W.A00(r12, "ITUNESGAPLESS", r2, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01d4, code lost:
    
        r2 = X.Y4W.A00(r12, "ITUNESADVISORY", r2, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01c7, code lost:
    
        r2 = X.Y4W.A02(r12, "TSOC", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01ba, code lost:
    
        r2 = X.Y4W.A02(r12, "TSOP", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01ad, code lost:
    
        r2 = X.Y4W.A02(r12, "TSOA", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01a0, code lost:
    
        r2 = X.Y4W.A02(r12, "TSO2", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0193, code lost:
    
        r2 = X.Y4W.A02(r12, "TSOT", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0186, code lost:
    
        r2 = X.Y4W.A02(r12, "TPE2", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x013c, code lost:
    
        r14 = r12.A01();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x014a, code lost:
    
        if (r12.A01() != 1684108385) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x014c, code lost:
    
        r1 = r12.A01() & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0156, code lost:
    
        if (r1 != 13) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0158, code lost:
    
        r13 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x015a, code lost:
    
        r12.A0H(4);
        r1 = r14 - 16;
        r0 = new byte[r1];
        r12.A0J(r0, 0, r1);
        r1 = new com.google.android.exoplayer2.metadata.id3.ApicFrame(r13, null, r0, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x016e, code lost:
    
        if (r1 != 14) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0170, code lost:
    
        r13 = "image/png";
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0173, code lost:
    
        r0 = X.AnonymousClass001.A0O("Unrecognized cover art flags: ", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x017c, code lost:
    
        X.AbstractC46512Bo.A04("MetadataUtil", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x017a, code lost:
    
        r0 = "Failed to parse cover art attribute";
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x012f, code lost:
    
        r2 = X.Y4W.A00(r12, "TCMP", r2, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0122, code lost:
    
        r2 = X.Y4W.A00(r12, "TBPM", r2, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0114, code lost:
    
        r2 = X.Y4W.A01(r12, "TRCK", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0107, code lost:
    
        r2 = X.Y4W.A01(r12, "TPOS", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x00ba, code lost:
    
        r12.A0H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x00c4, code lost:
    
        if (r12.A01() != 1684108385) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00c6, code lost:
    
        r12.A0H(8);
        r1 = r12.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x00da, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x00db, code lost:
    
        if (r1 <= 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x00dd, code lost:
    
        r3 = X.Y4W.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x00e1, code lost:
    
        if (r1 > 192) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x00e3, code lost:
    
        r0 = r3[r1 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x00e6, code lost:
    
        if (r0 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x00e8, code lost:
    
        r1 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame("TCON", null, X.C4VT.A00(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x00f9, code lost:
    
        X.AbstractC46512Bo.A04("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x00ce, code lost:
    
        X.AbstractC46512Bo.A04("MetadataUtil", X.AbstractC111324zv.A00(1630));
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x06a2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x06a3, code lost:
    
        r12.A0G(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x06a6, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0263, code lost:
    
        r1 = 16777215 & r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x026a, code lost:
    
        if (r1 != 6516084) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02a0, code lost:
    
        if (r1 == 7233901) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02a5, code lost:
    
        if (r1 == 7631467) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02aa, code lost:
    
        if (r1 == 6516589) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02af, code lost:
    
        if (r1 == 7828084) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02b4, code lost:
    
        if (r1 != 6578553) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02c0, code lost:
    
        if (r1 != 4280916) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x02cc, code lost:
    
        if (r1 != 7630703) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02d8, code lost:
    
        if (r1 != 6384738) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02e4, code lost:
    
        if (r1 != 7108978) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x02f0, code lost:
    
        if (r1 != 6776174) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x02fc, code lost:
    
        if (r1 != 6779504) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x02fe, code lost:
    
        r2 = X.Y4W.A02(r12, "TIT1", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x02f2, code lost:
    
        r2 = X.Y4W.A02(r12, "TCON", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x02e6, code lost:
    
        r2 = X.Y4W.A02(r12, "USLT", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x02da, code lost:
    
        r2 = X.Y4W.A02(r12, "TALB", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x02ce, code lost:
    
        r2 = X.Y4W.A02(r12, "TSSE", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x02c2, code lost:
    
        r2 = X.Y4W.A02(r12, "TPE1", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x02b6, code lost:
    
        r2 = X.Y4W.A02(r12, "TDRC", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0316, code lost:
    
        r2 = X.Y4W.A02(r12, "TCOM", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x031d, code lost:
    
        r2 = X.Y4W.A02(r12, "TIT2", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x026c, code lost:
    
        r3 = r12.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0277, code lost:
    
        if (r12.A01() != 1684108385) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0279, code lost:
    
        r12.A0H(8);
        r1 = r12.A0A(r3 - 16);
        r2 = new com.google.android.exoplayer2.metadata.id3.CommentFrame("und", r1, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x028b, code lost:
    
        X.AbstractC46512Bo.A04("MetadataUtil", X.AnonymousClass001.A0R("Failed to parse comment attribute: ", X.AbstractC98304b9.A00(r2)));
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x038e, code lost:
    
        if (r19.isEmpty() != false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0390, code lost:
    
        r0 = new com.google.android.exoplayer2.metadata.Metadata(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x058e, code lost:
    
        if (r12 != null) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
    
        r12.A0G(r5);
        r5 = r5 + r3;
        r12.A0H(8);
        r19 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
    
        r4 = r12.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        if (r4 >= r5) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a0, code lost:
    
        r4 = r4 + r12.A01();
        r2 = r12.A01();
        r1 = (r2 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
    
        if (r1 == 169) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
    
        if (r1 == 253) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b8, code lost:
    
        if (r2 != 1735291493) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0105, code lost:
    
        if (r2 != 1684632427) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0112, code lost:
    
        if (r2 != 1953655662) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0120, code lost:
    
        if (r2 != 1953329263) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012d, code lost:
    
        if (r2 != 1668311404) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013a, code lost:
    
        if (r2 != 1668249202) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0184, code lost:
    
        if (r2 != 1631670868) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0191, code lost:
    
        if (r2 != 1936682605) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x019e, code lost:
    
        if (r2 != 1936679276) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ab, code lost:
    
        if (r2 != 1936679282) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b8, code lost:
    
        if (r2 != 1936679265) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c5, code lost:
    
        if (r2 != 1936679791) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d2, code lost:
    
        if (r2 != 1920233063) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01df, code lost:
    
        if (r2 != 1885823344) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ec, code lost:
    
        if (r2 != 1936683886) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01f9, code lost:
    
        if (r2 != 1953919848) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0206, code lost:
    
        if (r2 != 757935405) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0305, code lost:
    
        X.AnonymousClass001.A0R("Skipped unknown metadata entry: ", X.AbstractC98304b9.A00(r2));
        X.AbstractC46512Bo.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0311, code lost:
    
        r12.A0G(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0208, code lost:
    
        r1 = null;
        r14 = null;
        r13 = null;
        r3 = -1;
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x020f, code lost:
    
        r0 = r12.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0213, code lost:
    
        if (r0 >= r4) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0215, code lost:
    
        r17 = r12.A01();
        r0 = r12.A01();
        r12.A0H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0223, code lost:
    
        if (r0 != 1835360622) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x022f, code lost:
    
        if (r0 != 1851878757) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x023b, code lost:
    
        if (r0 != 1684108385) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x023d, code lost:
    
        r3 = r0;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0241, code lost:
    
        r12.A0H(r17 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0231, code lost:
    
        r13 = r12.A0A(r17 - 12);
     */
    /* JADX WARN: Removed duplicated region for block: B:351:0x05a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00(long r39) {
        /*
            Method dump skipped, instructions count: 1715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65915TwM.A00(long):void");
    }

    @Override // X.InterfaceC98454bO
    public final long Azt() {
        return this.A0B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r4 = r6.A07;
        r9 = r4[r5];
        r3 = r6.A06;
        r7 = r3[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if (r9 >= r19) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r5 >= (r6.A01 - 1)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        r0 = r6.A00(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r0 == (-1)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r0 == r5) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        r5 = r4[r0];
        r1 = r3[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
    
        r7 = java.lang.Math.min(r14.A06[r3], r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        r1 = java.lang.Math.min(r14.A06[r3], r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007d, code lost:
    
        if (r3 == (-1)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x002f, code lost:
    
        if (r5 == (-1)) goto L13;
     */
    @Override // X.InterfaceC98454bO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C69745Vuf Bs5(long r19) {
        /*
            r18 = this;
            r13 = r18
            X.Txy[] r3 = r13.A0F
            int r0 = r3.length
            if (r0 == 0) goto L31
            r12 = -1
            int r2 = r13.A03
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r19
            if (r2 == r12) goto Lb1
            r2 = r3[r2]
            X.Txw r6 = r2.A04
            long[] r3 = r6.A07
            r2 = 0
            int r5 = com.google.android.exoplayer2.util.Util.A04(r3, r0, r2)
        L1e:
            if (r5 < 0) goto L2b
            int[] r2 = r6.A04
            r2 = r2[r5]
            r2 = r2 & 1
            if (r2 != 0) goto L39
            int r5 = r5 + (-1)
            goto L1e
        L2b:
            int r5 = r6.A00(r0)
            if (r5 != r12) goto L39
        L31:
            X.W5Q r3 = X.W5Q.A02
        L33:
            X.Vuf r1 = new X.Vuf
            r1.<init>(r3, r3)
            return r1
        L39:
            long[] r4 = r6.A07
            r9 = r4[r5]
            long[] r3 = r6.A06
            r7 = r3[r5]
            int r2 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r2 >= 0) goto Lb7
            int r2 = r6.A01
            int r2 = r2 + (-1)
            if (r5 >= r2) goto Lb7
            int r0 = r6.A00(r0)
            if (r0 == r12) goto Lb7
            if (r0 == r5) goto Lb7
            r5 = r4[r0]
            r1 = r3[r0]
        L57:
            r11 = 0
        L58:
            X.Txy[] r3 = r13.A0F
            int r0 = r3.length
            if (r11 >= r0) goto Lbf
            int r0 = r13.A03
            if (r11 == r0) goto La5
            r0 = r3[r11]
            X.Txw r14 = r0.A04
            long[] r0 = r14.A07
            r15 = 0
            int r3 = com.google.android.exoplayer2.util.Util.A04(r0, r9, r15)
        L6c:
            if (r3 < 0) goto L79
            int[] r0 = r14.A04
            r0 = r0[r3]
            r0 = r0 & 1
            if (r0 != 0) goto L96
            int r3 = r3 + (-1)
            goto L6c
        L79:
            int r3 = r14.A00(r9)
            if (r3 != r12) goto L96
        L7f:
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 == 0) goto La5
            long[] r0 = r14.A07
            int r3 = com.google.android.exoplayer2.util.Util.A04(r0, r5, r15)
        L89:
            if (r3 < 0) goto L9f
            int[] r0 = r14.A04
            r0 = r0[r3]
            r0 = r0 & 1
            if (r0 != 0) goto La8
            int r3 = r3 + (-1)
            goto L89
        L96:
            long[] r0 = r14.A06
            r3 = r0[r3]
            long r7 = java.lang.Math.min(r3, r7)
            goto L7f
        L9f:
            int r3 = r14.A00(r5)
            if (r3 != r12) goto La8
        La5:
            int r11 = r11 + 1
            goto L58
        La8:
            long[] r0 = r14.A06
            r3 = r0[r3]
            long r1 = java.lang.Math.min(r3, r1)
            goto La5
        Lb1:
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r0
        Lb7:
            r1 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L57
        Lbf:
            X.W5Q r3 = new X.W5Q
            r3.<init>(r9, r7)
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 == 0) goto L33
            X.W5Q r0 = new X.W5Q
            r0.<init>(r5, r1)
            X.Vuf r1 = new X.Vuf
            r1.<init>(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65915TwM.Bs5(long):X.Vuf");
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0059, code lost:
    
        if (r4 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x005d, code lost:
    
        if (r16 < r18) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0068, code lost:
    
        if (r9 >= r22) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x006a, code lost:
    
        r6 = r1;
        r3 = r5;
        r22 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x005f, code lost:
    
        r4 = r1;
        r18 = r16;
        r24 = r5;
        r20 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0072, code lost:
    
        if (true == r4) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x026e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0144  */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Throwable, X.4Fv, java.io.IOException] */
    @Override // X.InterfaceC97954aa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int E7m(X.InterfaceC98284b7 r29, X.C4XJ r30) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65915TwM.E7m(X.4b7, X.4XJ):int");
    }

    @Override // X.InterfaceC97954aa
    public final void EMc(long j, long j2) {
        this.A0M.clear();
        this.A00 = 0;
        this.A08 = -1;
        this.A05 = 0;
        this.A06 = 0;
        this.A07 = 0;
        if (j == 0) {
            this.A04 = 0;
            this.A00 = 0;
            return;
        }
        for (C66003Txy c66003Txy : this.A0F) {
            C66001Txw c66001Txw = c66003Txy.A04;
            int A04 = Util.A04(c66001Txw.A07, j2, false);
            while (true) {
                if (A04 >= 0) {
                    if ((c66001Txw.A04[A04] & 1) != 0) {
                        break;
                    } else {
                        A04--;
                    }
                } else {
                    A04 = c66001Txw.A00(j2);
                    break;
                }
            }
            c66003Txy.A00 = A04;
            C69778VvF c69778VvF = c66003Txy.A02;
            if (c69778VvF != null) {
                c69778VvF.A01 = false;
                c69778VvF.A00 = 0;
            }
        }
    }

    @Override // X.InterfaceC97954aa
    public final void CNm(C4XF c4xf) {
        this.A0D = c4xf;
    }
}
