package com.google.android.exoplayer2.extractor.mkv;

import X.AbstractC167007dF;
import X.AbstractC50482Ts;
import X.AbstractC63123SdR;
import X.AbstractC97984ad;
import X.AnonymousClass001;
import X.C131905xQ;
import X.C4B8;
import X.C4XF;
import X.C69778VvF;
import X.C70528Wbo;
import X.C70529Wbp;
import X.C93194Fv;
import X.C97974ac;
import X.C98274b6;
import X.InterfaceC97954aa;
import X.InterfaceC98054ak;
import X.InterfaceC98284b7;
import X.W3O;
import X.W4L;
import X.X7u;
import android.util.SparseArray;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes11.dex */
public class MatroskaExtractor implements InterfaceC97954aa {
    public static final Map A0s;
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public long A0O;
    public SparseArray A0P;
    public C4XF A0Q;
    public W3O A0R;
    public C131905xQ A0S;
    public C131905xQ A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public int[] A0c;
    public ByteBuffer A0d;
    public boolean A0e;
    public final X7u A0f;
    public final W4L A0g;
    public final C97974ac A0h;
    public final C97974ac A0i;
    public final C97974ac A0j;
    public final C97974ac A0k;
    public final C97974ac A0l;
    public final C97974ac A0m;
    public final C97974ac A0n;
    public final C97974ac A0o;
    public final C97974ac A0p;
    public final C97974ac A0q;
    public final boolean A0r;
    public static final byte[] A0w = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] A0u = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(AbstractC50482Ts.A05);
    public static final byte[] A0v = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] A0x = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    public static final UUID A0t = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX WARN: Code restructure failed: missing block: B:115:0x01ce, code lost:
    
        r2 = ". Setting mimeType to ";
        r3 = "audio/raw";
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01e2, code lost:
    
        switch(r14) {
            case 0: goto L151;
            case 1: goto L151;
            case 2: goto L156;
            case 3: goto L170;
            case 4: goto L171;
            case 5: goto L190;
            case 6: goto L191;
            case 7: goto L193;
            case 8: goto L217;
            case 9: goto L151;
            case 10: goto L218;
            case 11: goto L219;
            case 12: goto L220;
            case 13: goto L221;
            case 14: goto L222;
            case 15: goto L223;
            case 16: goto L224;
            case 17: goto L225;
            case 18: goto L226;
            case 19: goto L227;
            case 20: goto L228;
            case 21: goto L223;
            case 22: goto L229;
            case 23: goto L233;
            case 24: goto L236;
            case 25: goto L246;
            case 26: goto L247;
            case 27: goto L248;
            case 28: goto L249;
            case 29: goto L250;
            case 30: goto L251;
            case 31: goto L253;
            case 32: goto L256;
            default: goto L839;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0322, code lost:
    
        r0 = r9.A0l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0324, code lost:
    
        if (r0 != null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0326, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0327, code lost:
    
        r3 = "video/mp4v-es";
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x05b0, code lost:
    
        r10 = null;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x05b1, code lost:
    
        r11 = -1;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x05ee, code lost:
    
        r12 = -1;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x05ef, code lost:
    
        r1 = r9.A0m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x05f1, code lost:
    
        if (r1 == null) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x05f3, code lost:
    
        r0 = X.W1Q.A00(new X.C97974ac(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x05fc, code lost:
    
        if (r0 == null) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x05fe, code lost:
    
        r10 = r0.A00;
        r3 = "video/dolby-vision";
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0602, code lost:
    
        r1 = r9.A0h;
        r20 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0608, code lost:
    
        if (r9.A0i == false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x060a, code lost:
    
        r20 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x060c, code lost:
    
        r20 = r20 | (r1 ? 1 : 0);
        r1 = new X.C4B3();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0617, code lost:
    
        if (X.C2IH.A04(r3) == false) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0619, code lost:
    
        r1.A04 = r9.A0F;
        r1.A0E = r9.A0U;
        r1.A0A = r12;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0624, code lost:
    
        r12 = r9.A0g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0626, code lost:
    
        if (r12 == null) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x062e, code lost:
    
        if (com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.A0s.containsKey(r12) != false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0630, code lost:
    
        r1.A0S = r9.A0g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0634, code lost:
    
        r1.A0R = java.lang.Integer.toString(r0);
        r1.A0U = r3;
        r1.A09 = r11;
        r1.A0T = r9.A0f;
        r1.A0F = r20;
        r1.A0V = r2;
        r1.A0P = r10;
        r1.A00(r9.A0a);
        r2 = new X.C4B6(r1);
        r0 = r0.F88(r9.A0S, r8);
        r9.A0c = r0;
        r0.AWa(r2);
        r6.A0P.put(r9.A0S, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x066e, code lost:
    
        if (X.C2IH.A06(r3) == false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0672, code lost:
    
        if (r9.A0L != 0) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0674, code lost:
    
        r0 = r9.A0M;
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0677, code lost:
    
        if (r0 != (-1)) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0679, code lost:
    
        r0 = r9.A0X;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x067b, code lost:
    
        r9.A0M = r0;
        r0 = r9.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x067f, code lost:
    
        if (r0 != (-1)) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0681, code lost:
    
        r0 = r9.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0683, code lost:
    
        r9.A0K = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0685, code lost:
    
        r19 = -1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0689, code lost:
    
        if (r9.A0M == r12) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x068d, code lost:
    
        if (r9.A0K == r12) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x068f, code lost:
    
        r19 = (r9.A0N * r13) / (r9.A0X * r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x069d, code lost:
    
        if (r9.A0j == false) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x06a5, code lost:
    
        if (r9.A06 == (-1.0f)) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x06ab, code lost:
    
        if (r9.A07 == (-1.0f)) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x06b1, code lost:
    
        if (r9.A04 == (-1.0f)) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x06b7, code lost:
    
        if (r9.A05 == (-1.0f)) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x06bd, code lost:
    
        if (r9.A02 == (-1.0f)) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x06c3, code lost:
    
        if (r9.A03 == (-1.0f)) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x06c9, code lost:
    
        if (r9.A0B == (-1.0f)) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x06cf, code lost:
    
        if (r9.A0C == (-1.0f)) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x06d5, code lost:
    
        if (r9.A00 == (-1.0f)) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x06db, code lost:
    
        if (r9.A01 == (-1.0f)) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x06dd, code lost:
    
        r18 = new byte[25];
        r8 = java.nio.ByteBuffer.wrap(r18).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r8.put((byte) 0);
        r8.putShort((short) ((r9.A06 * 50000.0f) + 0.5f));
        X.AbstractC65702TsY.A1V(r8, r9.A07);
        X.AbstractC65702TsY.A1V(r8, r9.A04);
        X.AbstractC65702TsY.A1V(r8, r9.A05);
        X.AbstractC65702TsY.A1V(r8, r9.A02);
        X.AbstractC65702TsY.A1V(r8, r9.A03);
        X.AbstractC65702TsY.A1V(r8, r9.A0B);
        X.AbstractC65702TsY.A1V(r8, r9.A0C);
        r8.putShort((short) (r9.A00 + 0.5f));
        r8.putShort((short) (r9.A01 + 0.5f));
        r8.putShort((short) r9.A0P);
        r8.putShort((short) r9.A0Q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x073d, code lost:
    
        r17 = new com.google.android.exoplayer2.video.ColorInfo(r9.A0H, r9.A0G, r9.A0I, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x074f, code lost:
    
        r0 = r9.A0g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0751, code lost:
    
        if (r0 == null) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0753, code lost:
    
        r8 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.A0s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0759, code lost:
    
        if (r8.containsKey(r0) == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x075b, code lost:
    
        r12 = X.AbstractC65702TsY.A0E(r9.A0g, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0763, code lost:
    
        if (r9.A0T != 0) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x076c, code lost:
    
        if (java.lang.Float.compare(r9.A0A, 0.0f) != 0) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x076e, code lost:
    
        r8 = r9.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0774, code lost:
    
        if (java.lang.Float.compare(r8, 0.0f) != 0) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x077c, code lost:
    
        if (java.lang.Float.compare(r9.A09, 0.0f) != 0) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x077e, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x07a2, code lost:
    
        if (java.lang.Float.compare(r8, 90.0f) != 0) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x07a4, code lost:
    
        r12 = 90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x07ad, code lost:
    
        if (java.lang.Float.compare(r8, -180.0f) == 0) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x07b5, code lost:
    
        if (java.lang.Float.compare(r8, 180.0f) == 0) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x07bd, code lost:
    
        if (java.lang.Float.compare(r8, -90.0f) != 0) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x07bf, code lost:
    
        r12 = 270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x07c2, code lost:
    
        r12 = 180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x077f, code lost:
    
        r1.A0J = r9.A0X;
        r1.A08 = r9.A0N;
        r1.A01 = r19;
        r1.A0D = r12;
        r1.A0W = r9.A0n;
        r1.A0G = r9.A0V;
        r1.A0O = r17;
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x07c5, code lost:
    
        r18 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x07c9, code lost:
    
        r17 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x07cc, code lost:
    
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x07d5, code lost:
    
        if ("application/x-subrip".equals(r3) != false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x07dd, code lost:
    
        if ("text/x-ssa".equals(r3) != false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x07e5, code lost:
    
        if ("text/vtt".equals(r3) != false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x07ed, code lost:
    
        if ("application/vobsub".equals(r3) != false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x07f5, code lost:
    
        if ("application/pgs".equals(r3) != false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x07fd, code lost:
    
        if ("application/dvbsubs".equals(r3) != false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0805, code lost:
    
        throw X.C93194Fv.A00("Unexpected MIME type.", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x032b, code lost:
    
        r2 = java.util.Collections.singletonList(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0330, code lost:
    
        r14 = new X.C97974ac(X.W3O.A00(r9, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0339, code lost:
    
        r10 = r14.A02;
        r0 = r14.A01;
        r13 = r0 + 1;
        r12 = r10[r0] & 255;
        r14.A01 = r13 + 1;
        r10 = ((r10[r13] & 255) << 8) | r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x034e, code lost:
    
        if (r10 == 1) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0353, code lost:
    
        if (r10 != 65534) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0355, code lost:
    
        r14.A0G(24);
        r17 = r14.A06();
        r10 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.A0t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0366, code lost:
    
        if (r17 != r10.getMostSignificantBits()) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0372, code lost:
    
        if (r14.A06() != r10.getLeastSignificantBits()) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0375, code lost:
    
        r3 = new java.lang.StringBuilder();
        r2 = "Non-PCM MS/ACM is unsupported. Setting mimeType to ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0554, code lost:
    
        X.AbstractC46512Bo.A04("MatroskaExtractor", X.MSZ.A0u(r2, "audio/x-unknown", r3));
        r3 = "audio/x-unknown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x05a4, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x037e, code lost:
    
        r10 = r9.A0D;
        r12 = com.google.android.exoplayer2.util.Util.A02(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0384, code lost:
    
        if (r12 != 0) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0386, code lost:
    
        r3 = new java.lang.StringBuilder();
        r0 = "Unsupported PCM bit depth: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x054e, code lost:
    
        r3.append(r0);
        r3.append(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0563, code lost:
    
        r2 = null;
        r10 = null;
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x10bc, code lost:
    
        r0 = "Error parsing MS/ACM codec private";
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x038f, code lost:
    
        r9.A0d = new X.C69778VvF();
        r3 = "audio/true-hd";
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x039a, code lost:
    
        r11 = X.W3O.A00(r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x03a2, code lost:
    
        if (r11[0] != 2) goto L855;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x03a4, code lost:
    
        r2 = 1;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x03a6, code lost:
    
        r1 = r11[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x03ac, code lost:
    
        if ((r1 & 255) != 255) goto L875;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x03ae, code lost:
    
        r12 = r12 + 255;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x03b3, code lost:
    
        r2 = r2 + 1;
        r12 = r12 + (r1 & 255);
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x03b8, code lost:
    
        r10 = r11[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x03bc, code lost:
    
        if ((r10 & 255) != 255) goto L876;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x03be, code lost:
    
        r1 = r1 + 255;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x03c3, code lost:
    
        r2 = r2 + 1;
        r1 = r1 + (r10 & 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x03c9, code lost:
    
        if (r11[r2] != 1) goto L857;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x03cb, code lost:
    
        r10 = new byte[r12];
        java.lang.System.arraycopy(r11, r2, r10, 0, r12);
        r2 = r2 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x03d3, code lost:
    
        if (r11[r2] != 3) goto L858;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x03d5, code lost:
    
        r2 = r2 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x03d9, code lost:
    
        if (r11[r2] != 5) goto L859;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x03db, code lost:
    
        r1 = r11.length - r2;
        r0 = new byte[r1];
        java.lang.System.arraycopy(r11, r2, r0, 0, r1);
        r2 = new java.util.ArrayList(2);
        r2.add(r10);
        r2.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x03ed, code lost:
    
        r3 = "audio/vorbis";
        r10 = null;
        r11 = 8192;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x10c3, code lost:
    
        throw X.C93194Fv.A00("Error parsing vorbis codec private", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x10c8, code lost:
    
        throw X.C93194Fv.A00("Error parsing vorbis codec private", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x10cd, code lost:
    
        throw X.C93194Fv.A00("Error parsing vorbis codec private", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x10d2, code lost:
    
        throw X.C93194Fv.A00("Error parsing vorbis codec private", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x10d7, code lost:
    
        throw X.C93194Fv.A00("Error parsing vorbis codec private", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x03f4, code lost:
    
        r3 = "audio/mpeg-L2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x03f9, code lost:
    
        r2 = null;
        r10 = null;
        r11 = 4096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x03f7, code lost:
    
        r3 = "audio/mpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x03ff, code lost:
    
        r0 = new X.C97974ac(X.W3O.A00(r9, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x040a, code lost:
    
        r0.A0H(16);
        r10 = r0.A02;
        r2 = ((r10[r0] & 255) | ((r10[r1] & 255) << 8)) | ((r10[r14] & 255) << 16);
        r14 = (((r0.A01 + 1) + 1) + 1) + 1;
        r0 = ((r10[r12] & 255) << 24) | r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x043c, code lost:
    
        if (r0 != 1482049860) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x043e, code lost:
    
        r2 = new android.util.Pair("video/divx", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x049a, code lost:
    
        r3 = (java.lang.String) r2.first;
        r2 = (java.util.List) r2.second;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x044b, code lost:
    
        if (r0 != 859189832) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x044d, code lost:
    
        r2 = new android.util.Pair("video/3gpp", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x045a, code lost:
    
        if (r0 != 826496599) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x045c, code lost:
    
        r3 = r14 + 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x045e, code lost:
    
        r2 = r10.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0461, code lost:
    
        if (r3 >= (r2 - 4)) goto L823;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0465, code lost:
    
        if (r10[r3] != 0) goto L878;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x046b, code lost:
    
        if (r10[r3 + 1] != 0) goto L879;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0471, code lost:
    
        if (r10[r3 + 2] != 1) goto L880;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0479, code lost:
    
        if (r10[r3 + 3] != 15) goto L881;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x047b, code lost:
    
        r2 = new android.util.Pair("video/wvc1", java.util.Collections.singletonList(java.util.Arrays.copyOfRange(r10, r3, r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x048b, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x10de, code lost:
    
        throw X.C93194Fv.A00("Failed to find FourCC VC1 initialization data", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x048e, code lost:
    
        X.AbstractC46512Bo.A04("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
        r2 = new android.util.Pair("video/x-unknown", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x10e5, code lost:
    
        throw X.C93194Fv.A00("Error parsing FourCC private data", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x04a4, code lost:
    
        r1 = new byte[4];
        java.lang.System.arraycopy(X.W3O.A00(r9, r10), 0, r1, 0, 4);
        r3 = "application/dvbsubs";
        r2 = X.C4VT.A00(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x04ba, code lost:
    
        r1 = X.C122385gZ.A00(new X.C97974ac(X.W3O.A00(r9, r10)));
        r2 = r1.A03;
        r9.A0R = r1.A01;
        r10 = r1.A02;
        r3 = "video/avc";
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x04d3, code lost:
    
        r3 = "application/vobsub";
        r2 = X.C4VT.A00(X.W3O.A00(r9, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x04e3, code lost:
    
        r3 = "audio/vnd.dts.hd";
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x04e7, code lost:
    
        r2 = java.util.Collections.singletonList(X.W3O.A00(r9, r10));
        r1 = X.AbstractC127525pV.A01(r9.A0l);
        r9.A0U = r1.A01;
        r9.A0F = r1.A00;
        r10 = r1.A02;
        r3 = "audio/mp4a-latm";
        r11 = -1;
        r12 = -1;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0505, code lost:
    
        r3 = "audio/ac3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0509, code lost:
    
        r3 = "audio/vnd.dts";
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x050d, code lost:
    
        r3 = "video/av01";
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0511, code lost:
    
        r3 = "video/x-vnd.on2.vp8";
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0515, code lost:
    
        r3 = "video/x-vnd.on2.vp9";
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0519, code lost:
    
        r3 = "application/pgs";
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x051d, code lost:
    
        r3 = "video/x-unknown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0521, code lost:
    
        r10 = r9.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0525, code lost:
    
        if (r10 != 32) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0527, code lost:
    
        r2 = null;
        r10 = null;
        r11 = -1;
        r12 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x052d, code lost:
    
        r3 = new java.lang.StringBuilder();
        r0 = "Unsupported floating point PCM bit depth: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0535, code lost:
    
        r10 = r9.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0537, code lost:
    
        if (r10 != 8) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0539, code lost:
    
        r2 = null;
        r10 = null;
        r11 = -1;
        r12 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x055f, code lost:
    
        if (r10 != 16) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0561, code lost:
    
        r12 = 268435456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0568, code lost:
    
        r3 = new java.lang.StringBuilder();
        r0 = "Unsupported big endian PCM bit depth: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x053f, code lost:
    
        r10 = r9.A0D;
        r12 = com.google.android.exoplayer2.util.Util.A02(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0545, code lost:
    
        if (r12 != 0) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0547, code lost:
    
        r3 = new java.lang.StringBuilder();
        r0 = "Unsupported little endian PCM bit depth: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0570, code lost:
    
        r3 = "text/x-ssa";
        r2 = X.C4VT.A00(com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.A0u, X.W3O.A00(r9, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0581, code lost:
    
        r1 = X.C70095W2s.A00(new X.C97974ac(X.W3O.A00(r9, r10)));
        r2 = r1.A06;
        r9.A0R = r1.A04;
        r10 = r1.A05;
        r3 = "video/hevc";
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0599, code lost:
    
        r3 = "text/vtt";
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x059c, code lost:
    
        r3 = "application/x-subrip";
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x059f, code lost:
    
        r3 = "video/mpeg2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x05a2, code lost:
    
        r3 = "audio/eac3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x05a6, code lost:
    
        r3 = "audio/flac";
        r2 = java.util.Collections.singletonList(X.W3O.A00(r9, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x05b3, code lost:
    
        r2 = new java.util.ArrayList(3);
        r2.add(X.W3O.A00(r9, r10));
        r0 = java.nio.ByteBuffer.allocate(8);
        r10 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r3 = r0.order(r10);
        r3.putLong(r9.A0Y);
        r2.add(r3.array());
        r3 = java.nio.ByteBuffer.allocate(8).order(r10);
        r3.putLong(r9.A0Z);
        r2.add(r3.array());
        r3 = "audio/opus";
        r10 = null;
        r11 = 5760;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x01eb, code lost:
    
        throw X.C93194Fv.A00("Unrecognized codec identifier.", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x031e, code lost:
    
        if (r0 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x1084, code lost:
    
        r1 = ((X.C98274b6) r30).A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0fe0, code lost:
    
        r6.A01 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x1090, code lost:
    
        if (r29.A0Z == false) goto L772;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x09e1, code lost:
    
        if (r1 == 2) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x09e4, code lost:
    
        if (r1 == 3) goto L730;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x10a3, code lost:
    
        if (r29.A0b == false) goto L864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x09e6, code lost:
    
        if (r1 == 4) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x09e9, code lost:
    
        if (r1 != 5) goto L840;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x09eb, code lost:
    
        r0 = r6.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x09f1, code lost:
    
        if (r0 == 4) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x09f5, code lost:
    
        if (r0 == 8) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x09f7, code lost:
    
        r3 = new java.lang.StringBuilder();
        r2 = "Invalid float size: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x09fe, code lost:
    
        r3.append(r2);
        r3.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0a0c, code lost:
    
        throw X.C93194Fv.A00(r3.toString(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0a0d, code lost:
    
        r9 = (int) r0;
        r11 = 0;
        r30.readFully(r6.A06, 0, r9);
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0a18, code lost:
    
        if (r11 >= r9) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0a1a, code lost:
    
        r2 = (r2 << 8) | (r12[r11] & 255);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0a26, code lost:
    
        if (r9 != 4) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0a28, code lost:
    
        r0 = java.lang.Float.intBitsToFloat((int) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0a2e, code lost:
    
        r7 = ((X.C70528Wbo) r7).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0a34, code lost:
    
        if (r8 == 181) goto L500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x10a5, code lost:
    
        r6 = r29.A0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0a38, code lost:
    
        if (r8 == 17545) goto L499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0a3a, code lost:
    
        switch(r8) {
            case 21969: goto L498;
            case 21970: goto L497;
            case 21971: goto L496;
            case 21972: goto L495;
            case 21973: goto L494;
            case 21974: goto L493;
            case 21975: goto L492;
            case 21976: goto L491;
            case 21977: goto L490;
            case 21978: goto L489;
            default: goto L483;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0a3d, code lost:
    
        switch(r8) {
            case 30323: goto L488;
            case 30324: goto L487;
            case 30325: goto L486;
            default: goto L746;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0a47, code lost:
    
        A04(r7, r8);
        r7.A0R.A09 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0a51, code lost:
    
        A04(r7, r8);
        r7.A0R.A08 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0a5b, code lost:
    
        A04(r7, r8);
        r7.A0R.A0A = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x0a65, code lost:
    
        A04(r7, r8);
        r7.A0R.A01 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x0a6f, code lost:
    
        A04(r7, r8);
        r7.A0R.A00 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0a79, code lost:
    
        A04(r7, r8);
        r7.A0R.A0C = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x10ad, code lost:
    
        if (r6 == (-1)) goto L865;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x0a83, code lost:
    
        A04(r7, r8);
        r7.A0R.A0B = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0a8d, code lost:
    
        A04(r7, r8);
        r7.A0R.A03 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x0a97, code lost:
    
        A04(r7, r8);
        r7.A0R.A02 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0aa1, code lost:
    
        A04(r7, r8);
        r7.A0R.A05 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x0aab, code lost:
    
        A04(r7, r8);
        r7.A0R.A04 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x0ab5, code lost:
    
        A04(r7, r8);
        r7.A0R.A07 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0abf, code lost:
    
        A04(r7, r8);
        r7.A0R.A06 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0ac9, code lost:
    
        r7.A0I = (long) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x0ace, code lost:
    
        A04(r7, 181);
        r7.A0R.A0U = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0a42, code lost:
    
        r0 = java.lang.Double.longBitsToDouble(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0ad8, code lost:
    
        r3 = new java.lang.StringBuilder();
        r3.append("Invalid element type ");
        r3.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x0ae7, code lost:
    
        r12 = (int) r6.A02;
        r7 = ((X.C70528Wbo) r7).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0af4, code lost:
    
        if (r8 == 161) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0af6, code lost:
    
        if (r8 == 163) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x0afa, code lost:
    
        if (r8 == 165) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0afe, code lost:
    
        if (r8 == 16877) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x10af, code lost:
    
        r31.A00 = r6;
        r29.A0L = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0b02, code lost:
    
        if (r8 == 16981) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0b06, code lost:
    
        if (r8 == 18402) goto L536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0b0a, code lost:
    
        if (r8 == 21419) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x0b0e, code lost:
    
        if (r8 == 25506) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x0b12, code lost:
    
        if (r8 != 30322) goto L844;
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x0b14, code lost:
    
        A04(r7, r8);
        r1 = new byte[r12];
        r7.A0R.A0n = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x10b5, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x0b1d, code lost:
    
        r30.readFully(r1, 0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x10f0, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Unexpected id: ");
        r1.append(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x110e, code lost:
    
        r1 = r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x111b, code lost:
    
        throw X.C93194Fv.A00(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0b24, code lost:
    
        A04(r7, r8);
        r1 = new byte[r12];
        r7.A0R.A0l = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0b72, code lost:
    
        r3 = r7.A0n;
        java.util.Arrays.fill(r3.A02, (byte) 0);
        r30.readFully(r3.A02, 4 - r12, r12);
        r3.A0G(0);
        r7.A0C = (int) r3.A07();
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0b8e, code lost:
    
        r2 = new byte[r12];
        r30.readFully(r2, 0, r12);
        A04(r7, 18402);
        r7.A0R.A0b = new X.C98094ao(1, r2, 0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0b2e, code lost:
    
        A04(r7, r8);
        r1 = new byte[r12];
        r7.A0R.A0o = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0b38, code lost:
    
        A04(r7, 16877);
        r2 = r7.A0R;
        r1 = r2.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x0b42, code lost:
    
        if (r1 == 1685485123) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x0b47, code lost:
    
        if (r1 != 1685480259) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0ba3, code lost:
    
        r30.Em8(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0b49, code lost:
    
        r1 = new byte[r12];
        r2.A0m = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0b50, code lost:
    
        if (r7.A05 != 2) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x0b52, code lost:
    
        r1 = (X.W3O) r7.A0P.get(r7.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0b5e, code lost:
    
        if (r7.A01 != 4) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0b68, code lost:
    
        if ("V_VP9".equals(r1.A0e) == false) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x0b6a, code lost:
    
        r0 = r7.A0p;
        r0.A0E(r12);
        r1 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0bae, code lost:
    
        if (r7.A05 != 0) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x0bb0, code lost:
    
        r3 = r7.A0g;
        r7.A06 = (int) r3.A00(r30, 8, false, true);
        r7.A07 = r3.A00;
        r7.A0D = -9223372036854775807L;
        r7.A05 = 1;
        r7.A0m.A0E(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x0bcf, code lost:
    
        r0 = (X.W3O) r7.A0P.get(r7.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x0bdd, code lost:
    
        if (r0 != null) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x0bdf, code lost:
    
        r30.Em8(r12 - r7.A07);
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x0be7, code lost:
    
        r7.A05 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x0beb, code lost:
    
        r0.A0c.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x0bf2, code lost:
    
        if (r7.A05 != 1) goto L561;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x0bf4, code lost:
    
        A02(r30, r7, 3);
        r11 = r7.A0m;
        r3 = (r11.A02[2] & 6) >> 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x0c05, code lost:
    
        if (r3 != 0) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0c07, code lost:
    
        r7.A03 = 1;
        r1 = r7.A0c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x0c0b, code lost:
    
        if (r1 != null) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x0c0d, code lost:
    
        r1 = new int[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x0c0f, code lost:
    
        r7.A0c = r1;
        r1[0] = (r12 - r7.A07) - 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x0c17, code lost:
    
        r0 = r11.A02;
        r7.A0F = r7.A0G + A01(r7, (r0[0] << 8) | (r0[1] & 255));
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x0c2f, code lost:
    
        if (r0.A0W == 2) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x0c33, code lost:
    
        if (r8 != 163) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x0c3c, code lost:
    
        if ((r11.A02[2] & 128) != 128) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x0c78, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x0c3f, code lost:
    
        r7.A02 = r0;
        r7.A05 = 2;
        r7.A04 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x0c3e, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x0c7b, code lost:
    
        if (r1.length >= 1) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x0c7d, code lost:
    
        r1 = new int[java.lang.Math.max(0, 1)];
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x0c84, code lost:
    
        r13 = 4;
        A02(r30, r7, 4);
        r2 = (r11.A02[3] & 255) + 1;
        r7.A03 = r2;
        r1 = r7.A0c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x0c95, code lost:
    
        if (r1 != null) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x0c97, code lost:
    
        r1 = new int[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x0c99, code lost:
    
        r7.A0c = r1;
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x0c9c, code lost:
    
        if (r3 != 2) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x0c9e, code lost:
    
        java.util.Arrays.fill(r1, 0, r2, ((r12 - r7.A07) - 4) / r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x0cb4, code lost:
    
        if (r3 != 1) goto L588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x0cb6, code lost:
    
        r3 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x0cb8, code lost:
    
        r2 = r7.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x0cbc, code lost:
    
        if (r3 >= (r2 - 1)) goto L902;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x1092, code lost:
    
        r29.A0L = r1;
        r31.A00 = r29.A0H;
        r29.A0Z = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x0cbe, code lost:
    
        r0[r3] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x0cc0, code lost:
    
        r13 = r13 + 1;
        A02(r30, r7, r13);
        r2 = r11.A02[r13 - 1] & 255;
        r0 = r7.A0c;
        r1 = r0[r3] + r2;
        r0[r3] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x0cd5, code lost:
    
        if (r2 == 255) goto L904;
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x0cd7, code lost:
    
        r10 = r10 + r1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x0cdb, code lost:
    
        r0[r2 - 1] = ((r12 - r7.A07) - r13) - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x0ce5, code lost:
    
        if (r3 != 3) goto L828;
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x0ce7, code lost:
    
        r15 = 0;
        r21 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x109e, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x0cea, code lost:
    
        r2 = r7.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:691:0x0cee, code lost:
    
        if (r15 >= (r2 - 1)) goto L905;
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x0cf0, code lost:
    
        r1[r15] = 0;
        r13 = r13 + 1;
        A02(r30, r7, r13);
        r1 = r11.A02;
        r3 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x0cff, code lost:
    
        if (r1[r3] == 0) goto L829;
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x0d01, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x0d02, code lost:
    
        r2 = 1 << (7 - r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x0d09, code lost:
    
        if ((r1[r3] & r2) == 0) goto L601;
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x0d2c, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x0d30, code lost:
    
        if (r10 < 8) goto L910;
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x0d32, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x0d50, code lost:
    
        r0 = (int) r2;
        r1 = r7.A0c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x0d53, code lost:
    
        if (r15 == 0) goto L907;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x0d55, code lost:
    
        r0 = r0 + r1[r15 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x0d5a, code lost:
    
        r1[r15] = r0;
        r21 = r21 + r0;
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x0d0b, code lost:
    
        r13 = r13 + r10;
        A02(r30, r7, r13);
        r19 = r3 + 1;
        r2 = (r11.A02[r3] & 255) & (r2 ^ (-1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:711:0x0d20, code lost:
    
        if (r19 >= r13) goto L911;
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x0d22, code lost:
    
        r19 = r19 + 1;
        r2 = (r2 << 8) | (r0[r1] & 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x0d35, code lost:
    
        if (r15 <= 0) goto L606;
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x0d37, code lost:
    
        r2 = r2 - ((1 << ((r10 * 7) + 6)) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x0d47, code lost:
    
        if (r2 < (-2147483648L)) goto L834;
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x0d4e, code lost:
    
        if (r2 > 2147483647L) goto L836;
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x1113, code lost:
    
        r1 = "EBML lacing sample size out of range.";
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x10fe, code lost:
    
        r1 = "No valid varint length mask found";
     */
    /* JADX WARN: Code restructure failed: missing block: B:726:0x0d61, code lost:
    
        r1[r2 - 1] = ((r12 - r7.A07) - r13) - r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:728:0x1101, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Unexpected lacing value: ");
        r1.append(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x0ca8, code lost:
    
        r0 = r1.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x0ca9, code lost:
    
        if (r0 >= r2) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x0cab, code lost:
    
        r1 = new int[java.lang.Math.max(r0 * 2, r2)];
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x0c47, code lost:
    
        if (r8 != 163) goto L615;
     */
    /* JADX WARN: Code restructure failed: missing block: B:734:0x0c49, code lost:
    
        r1 = r7.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x0c4d, code lost:
    
        if (r1 >= r7.A03) goto L912;
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x0c4f, code lost:
    
        A03(r0, r7, r7.A02, A00(r30, r0, r7, r7.A0c[r1]), 0, ((r7.A04 * r0.A0J) / 1000) + r7.A0F);
        r7.A04++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x0d6c, code lost:
    
        r8 = r7.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x0d70, code lost:
    
        if (r8 >= r7.A03) goto L913;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x0d72, code lost:
    
        r3 = r7.A0c;
        r3[r8] = A00(r30, r0, r7, r3[r8]);
        r7.A04++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x0fb2, code lost:
    
        r0 = r6.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x0fb9, code lost:
    
        if (r0 > 2147483647L) goto L856;
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x0fbb, code lost:
    
        r3 = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x0fbc, code lost:
    
        if (r3 != 0) goto L754;
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x0fbe, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x0fc0, code lost:
    
        r2 = ((X.C70528Wbo) r7).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x0fc6, code lost:
    
        if (r8 == 134) goto L753;
     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x0fca, code lost:
    
        if (r8 == 17026) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x0fce, code lost:
    
        if (r8 == 17827) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x0fd2, code lost:
    
        if (r8 == 21358) goto L747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x0fd7, code lost:
    
        if (r8 != 2274716) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x0fd9, code lost:
    
        A04(r2, 2274716);
        r2.A0R.A0f = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x0fe4, code lost:
    
        A04(r2, 21358);
        r2.A0R.A0g = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:760:0x0ff2, code lost:
    
        if ("webm".equals(r1) != false) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:762:0x0ffa, code lost:
    
        if ("matroska".equals(r1) != false) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:764:0x0ffc, code lost:
    
        r3 = new java.lang.StringBuilder();
        r3.append("DocType ");
        r3.append(r1);
        r3.append(" not supported");
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x1010, code lost:
    
        A04(r2, 134);
        r2.A0R.A0e = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:766:0x1018, code lost:
    
        r2 = new byte[r3];
        r30.readFully(r2, 0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x101f, code lost:
    
        if (r3 <= 0) goto L915;
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x1021, code lost:
    
        r1 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x1025, code lost:
    
        if (r2[r1] != 0) goto L914;
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x1027, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x1029, code lost:
    
        r1 = new java.lang.String(r2, 0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:775:0x102f, code lost:
    
        r3 = new java.lang.StringBuilder();
        r2 = "String element size: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x0d87, code lost:
    
        r0 = r6.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x0d8b, code lost:
    
        if (r0 > 8) goto L837;
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x0d8d, code lost:
    
        r10 = (int) r0;
        r12 = 0;
        r30.readFully(r6.A06, 0, r10);
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x0d98, code lost:
    
        if (r12 >= r10) goto L916;
     */
    /* JADX WARN: Code restructure failed: missing block: B:780:0x0d9a, code lost:
    
        r0 = (r0 << 8) | (r13[r12] & 255);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:782:0x0da6, code lost:
    
        r7 = ((X.C70528Wbo) r7).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x0dae, code lost:
    
        if (r8 == 20529) goto L723;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x0db4, code lost:
    
        if (r8 == 20530) goto L720;
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x0db6, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:787:0x0db8, code lost:
    
        switch(r8) {
            case 131: goto L699;
            case 136: goto L695;
            case 155: goto L677;
            case 159: goto L694;
            case 176: goto L693;
            case 179: goto L700;
            case 186: goto L692;
            case 215: goto L691;
            case 231: goto L676;
            case 238: goto L675;
            case 241: goto L668;
            case 251: goto L667;
            case 16871: goto L690;
            case 16980: goto L726;
            case 17029: goto L714;
            case 17143: goto L711;
            case 18401: goto L708;
            case 18408: goto L705;
            case 21420: goto L666;
            case 21432: goto L656;
            case 21680: goto L689;
            case 21682: goto L688;
            case 21690: goto L687;
            case 21930: goto L683;
            case 21998: goto L682;
            case 22186: goto L681;
            case 22203: goto L680;
            case 25188: goto L679;
            case 30114: goto L655;
            case 30321: goto L646;
            case 2352003: goto L678;
            case 2807729: goto L645;
            default: goto L629;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x0dbc, code lost:
    
        switch(r8) {
            case 21945: goto L638;
            case 21946: goto L635;
            case 21947: goto L632;
            case 21948: goto L644;
            case 21949: goto L643;
            default: goto L746;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:790:0x0dc1, code lost:
    
        A04(r7, r8);
        r3 = r7.A0R;
        r3.A0j = true;
        r0 = com.google.android.exoplayer2.video.ColorInfo.A00((int) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:0x0dcd, code lost:
    
        if (r0 == (-1)) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:792:0x0dcf, code lost:
    
        r3.A0H = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:793:0x0dd3, code lost:
    
        A04(r7, r8);
        r1 = com.google.android.exoplayer2.video.ColorInfo.A01((int) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:794:0x0ddb, code lost:
    
        if (r1 == (-1)) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x0ddd, code lost:
    
        r7.A0R.A0I = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x0de3, code lost:
    
        A04(r7, r8);
        r2 = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:797:0x0de7, code lost:
    
        if (r2 == 1) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:798:0x0de9, code lost:
    
        if (r2 != 2) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x0deb, code lost:
    
        r7.A0R.A0G = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:800:0x0df1, code lost:
    
        r7.A0R.A0G = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x0df7, code lost:
    
        A04(r7, r8);
        r7.A0R.A0Q = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:802:0x0e01, code lost:
    
        A04(r7, r8);
        r7.A0R.A0P = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x0e0b, code lost:
    
        r7.A0O = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:804:0x0e0f, code lost:
    
        A04(r7, r8);
        r2 = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x0e13, code lost:
    
        if (r2 == 0) goto L654;
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x0e15, code lost:
    
        if (r2 == 1) goto L653;
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x0e17, code lost:
    
        if (r2 == 2) goto L652;
     */
    /* JADX WARN: Code restructure failed: missing block: B:808:0x0e19, code lost:
    
        if (r2 != 3) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x0e1b, code lost:
    
        r7.A0R.A0T = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x0e21, code lost:
    
        r7.A0R.A0T = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x0e27, code lost:
    
        r7.A0R.A0T = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x0e2d, code lost:
    
        r7.A0R.A0T = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:813:0x0e33, code lost:
    
        r7.A0E = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x0e37, code lost:
    
        r2 = (int) r0;
        A04(r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:815:0x0e3b, code lost:
    
        if (r2 == 0) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x0e3d, code lost:
    
        if (r2 == 1) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:817:0x0e3f, code lost:
    
        if (r2 == 3) goto L663;
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x0e43, code lost:
    
        if (r2 != 15) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:820:0x0e45, code lost:
    
        r7.A0R.A0V = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:0x0e4b, code lost:
    
        r7.A0R.A0V = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:822:0x0e51, code lost:
    
        r7.A0R.A0V = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x0e57, code lost:
    
        r7.A0R.A0V = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:824:0x0e5d, code lost:
    
        r7.A0K = r0 + r7.A0M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x0e64, code lost:
    
        r7.A0U = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:827:0x0e6a, code lost:
    
        if (r7.A0a != false) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x0e6e, code lost:
    
        if (r7.A0T == null) goto L842;
     */
    /* JADX WARN: Code restructure failed: missing block: B:830:0x0e70, code lost:
    
        r2 = r7.A0S;
     */
    /* JADX WARN: Code restructure failed: missing block: B:831:0x0e72, code lost:
    
        if (r2 == null) goto L843;
     */
    /* JADX WARN: Code restructure failed: missing block: B:832:0x0e74, code lost:
    
        r2.A01(r0);
        r7.A0a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:835:0x1128, code lost:
    
        throw X.C93194Fv.A00(X.AnonymousClass001.A0c("Element ", " must be in a Cues", r8), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:837:0x0e7b, code lost:
    
        r7.A01 = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x0e80, code lost:
    
        r7.A0G = A01(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:0x0e88, code lost:
    
        r7.A0D = A01(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x0e90, code lost:
    
        A04(r7, r8);
        r7.A0R.A0J = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x0e9a, code lost:
    
        A04(r7, r8);
        r7.A0R.A0D = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:842:0x0ea4, code lost:
    
        A04(r7, r8);
        r7.A0R.A0Z = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:843:0x0ead, code lost:
    
        A04(r7, r8);
        r7.A0R.A0Y = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:0x0eb6, code lost:
    
        A04(r7, r8);
        r7.A0R.A0O = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:845:0x0ec0, code lost:
    
        A04(r7, r8);
        r3 = r7.A0R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:846:0x0ec7, code lost:
    
        if (r0 != 1) goto L686;
     */
    /* JADX WARN: Code restructure failed: missing block: B:847:0x0ec9, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:848:0x0eca, code lost:
    
        r3.A0i = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x0ece, code lost:
    
        A04(r7, r8);
        r7.A0R.A0K = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x0ed8, code lost:
    
        A04(r7, r8);
        r7.A0R.A0L = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:851:0x0ee2, code lost:
    
        A04(r7, r8);
        r7.A0R.A0M = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:852:0x0eec, code lost:
    
        A04(r7, r8);
        r7.A0R.A0E = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:853:0x0ef6, code lost:
    
        A04(r7, r8);
        r7.A0R.A0S = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:854:0x0f00, code lost:
    
        A04(r7, r8);
        r7.A0R.A0N = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:855:0x0f0a, code lost:
    
        A04(r7, r8);
        r7.A0R.A0X = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:856:0x0f14, code lost:
    
        A04(r7, r8);
        r7.A0R.A0F = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:857:0x0f1e, code lost:
    
        A04(r7, r8);
        r3 = r7.A0R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x0f25, code lost:
    
        if (r0 != 1) goto L698;
     */
    /* JADX WARN: Code restructure failed: missing block: B:859:0x0f27, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:860:0x0f28, code lost:
    
        r3.A0h = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:861:0x0f2c, code lost:
    
        A04(r7, r8);
        r7.A0R.A0W = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:862:0x0f36, code lost:
    
        r3 = r7.A0T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:863:0x0f38, code lost:
    
        if (r3 == null) goto L845;
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x0f3c, code lost:
    
        if (r7.A0S == null) goto L846;
     */
    /* JADX WARN: Code restructure failed: missing block: B:866:0x0f3e, code lost:
    
        r3.A01(A01(r7, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:870:0x0f49, code lost:
    
        if (r0 == 1) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:872:0x0f4b, code lost:
    
        r3 = new java.lang.StringBuilder();
        r2 = "AESSettingsCipherMode ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:873:0x0fa7, code lost:
    
        r3.append(r2);
        r3.append(r0);
        r3.append(" not supported");
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x0f57, code lost:
    
        if (r0 == 5) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:877:0x0f59, code lost:
    
        r3 = new java.lang.StringBuilder();
        r2 = "ContentEncAlgo ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:879:0x0f63, code lost:
    
        if (r0 == 1) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:881:0x0f65, code lost:
    
        r3 = new java.lang.StringBuilder();
        r2 = "EBMLReadVersion ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:883:0x0f6f, code lost:
    
        if (r0 < 1) goto L850;
     */
    /* JADX WARN: Code restructure failed: missing block: B:885:0x0f75, code lost:
    
        if (r0 > 2) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:887:0x0f78, code lost:
    
        r3 = new java.lang.StringBuilder();
        r2 = "DocTypeReadVersion ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:890:0x0f9e, code lost:
    
        if (r0 == 3) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:892:0x0fa0, code lost:
    
        r3 = new java.lang.StringBuilder();
        r2 = "ContentCompAlgo ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:894:0x0f82, code lost:
    
        if (r0 == 1) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:896:0x0f84, code lost:
    
        r3 = new java.lang.StringBuilder();
        r2 = "ContentEncodingScope ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:898:0x0f90, code lost:
    
        if (r0 == 0) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:900:0x0f92, code lost:
    
        r3 = new java.lang.StringBuilder();
        r2 = "ContentEncodingOrder ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:902:0x1038, code lost:
    
        r3 = new java.lang.StringBuilder();
        r2 = "Invalid integer size: ";
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:107:0x0153. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:509:0x0900. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c2  */
    /* JADX WARN: Type inference failed for: r2v138, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v139, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v143, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v145, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v161, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v183, types: [java.util.List] */
    @Override // X.InterfaceC97954aa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int E7m(X.InterfaceC98284b7 r30, X.C4XJ r31) {
        /*
            Method dump skipped, instructions count: 5338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.E7m(X.4b7, X.4XJ):int");
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        A0s = Collections.unmodifiableMap(hashMap);
    }

    public MatroskaExtractor(int i) {
        C70529Wbp c70529Wbp = new C70529Wbp();
        this.A0M = -1L;
        this.A0O = -9223372036854775807L;
        this.A0I = -9223372036854775807L;
        this.A0J = -9223372036854775807L;
        this.A0H = -1L;
        this.A0L = -1L;
        this.A0G = -9223372036854775807L;
        this.A0f = c70529Wbp;
        c70529Wbp.A03 = new C70528Wbo(this);
        this.A0r = AbstractC167007dF.A1N(i & 1);
        this.A0g = new W4L();
        this.A0P = new SparseArray();
        this.A0m = new C97974ac(4);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(-1);
        this.A0q = new C97974ac(allocate.array());
        this.A0n = new C97974ac(4);
        this.A0k = new C97974ac(AbstractC97984ad.A01);
        this.A0j = new C97974ac(4);
        this.A0l = new C97974ac();
        this.A0o = new C97974ac();
        this.A0h = new C97974ac(8);
        this.A0i = new C97974ac();
        this.A0p = new C97974ac();
        this.A0c = new int[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [byte, boolean, int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    public static int A00(InterfaceC98284b7 interfaceC98284b7, W3O w3o, MatroskaExtractor matroskaExtractor, int i) {
        ?? r3;
        int ELR;
        int ELR2;
        int i2;
        byte[] bArr;
        String str = w3o.A0e;
        if ("S_TEXT/UTF8".equals(str)) {
            bArr = A0w;
        } else if ("S_TEXT/ASS".equals(str)) {
            bArr = A0v;
        } else if ("S_TEXT/WEBVTT".equals(str)) {
            bArr = A0x;
        } else {
            InterfaceC98054ak interfaceC98054ak = w3o.A0c;
            boolean z = true;
            r3 = 0;
            r3 = 0;
            if (!matroskaExtractor.A0V) {
                if (w3o.A0k) {
                    matroskaExtractor.A02 &= -1073741825;
                    int i3 = 128;
                    if (!matroskaExtractor.A0Y) {
                        C97974ac c97974ac = matroskaExtractor.A0m;
                        interfaceC98284b7.readFully(c97974ac.A02, 0, 1);
                        matroskaExtractor.A08++;
                        byte b = c97974ac.A02[0];
                        if ((b & 128) != 128) {
                            matroskaExtractor.A00 = b;
                            matroskaExtractor.A0Y = true;
                        } else {
                            throw C93194Fv.A00("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b2 = matroskaExtractor.A00;
                    if ((b2 & 1) == 1) {
                        boolean A1P = AbstractC167007dF.A1P(b2 & 2, 2);
                        matroskaExtractor.A02 |= AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
                        if (!matroskaExtractor.A0W) {
                            C97974ac c97974ac2 = matroskaExtractor.A0h;
                            interfaceC98284b7.readFully(c97974ac2.A02, 0, 8);
                            matroskaExtractor.A08 += 8;
                            matroskaExtractor.A0W = true;
                            C97974ac c97974ac3 = matroskaExtractor.A0m;
                            byte[] bArr2 = c97974ac3.A02;
                            if (!A1P) {
                                i3 = 0;
                            }
                            bArr2[0] = (byte) (i3 | 8);
                            c97974ac3.A0G(0);
                            interfaceC98054ak.ELO(c97974ac3, 1, 1);
                            matroskaExtractor.A09++;
                            c97974ac2.A0G(0);
                            interfaceC98054ak.ELO(c97974ac2, 8, 1);
                            matroskaExtractor.A09 += 8;
                        }
                        if (A1P) {
                            if (!matroskaExtractor.A0X) {
                                C97974ac c97974ac4 = matroskaExtractor.A0m;
                                interfaceC98284b7.readFully(c97974ac4.A02, 0, 1);
                                matroskaExtractor.A08++;
                                c97974ac4.A0G(0);
                                matroskaExtractor.A0B = c97974ac4.A02();
                                matroskaExtractor.A0X = true;
                            }
                            int i4 = matroskaExtractor.A0B * 4;
                            C97974ac c97974ac5 = matroskaExtractor.A0m;
                            c97974ac5.A0E(i4);
                            interfaceC98284b7.readFully(c97974ac5.A02, 0, i4);
                            matroskaExtractor.A08 += i4;
                            short s = (short) ((matroskaExtractor.A0B / 2) + 1);
                            int i5 = (s * 6) + 2;
                            ByteBuffer byteBuffer = matroskaExtractor.A0d;
                            if (byteBuffer == null || byteBuffer.capacity() < i5) {
                                matroskaExtractor.A0d = ByteBuffer.allocate(i5);
                            }
                            matroskaExtractor.A0d.position(0);
                            matroskaExtractor.A0d.putShort(s);
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                i2 = matroskaExtractor.A0B;
                                if (i6 >= i2) {
                                    break;
                                }
                                int A04 = c97974ac5.A04();
                                int i8 = i6 % 2;
                                ByteBuffer byteBuffer2 = matroskaExtractor.A0d;
                                int i9 = A04 - i7;
                                if (i8 == 0) {
                                    byteBuffer2.putShort((short) i9);
                                } else {
                                    byteBuffer2.putInt(i9);
                                }
                                i6++;
                                i7 = A04;
                            }
                            int i10 = (i - matroskaExtractor.A08) - i7;
                            int i11 = i2 % 2;
                            ByteBuffer byteBuffer3 = matroskaExtractor.A0d;
                            if (i11 == 1) {
                                byteBuffer3.putInt(i10);
                            } else {
                                byteBuffer3.putShort((short) i10);
                                matroskaExtractor.A0d.putInt(0);
                            }
                            C97974ac c97974ac6 = matroskaExtractor.A0i;
                            c97974ac6.A0I(matroskaExtractor.A0d.array(), i5);
                            interfaceC98054ak.ELO(c97974ac6, i5, 1);
                            matroskaExtractor.A09 += i5;
                        }
                    }
                } else {
                    byte[] bArr3 = w3o.A0o;
                    if (bArr3 != null) {
                        matroskaExtractor.A0l.A0I(bArr3, bArr3.length);
                    }
                }
                if (w3o.A0O > 0) {
                    matroskaExtractor.A02 |= 268435456;
                    matroskaExtractor.A0p.A0E(0);
                    int i12 = (matroskaExtractor.A0l.A00 + i) - matroskaExtractor.A08;
                    C97974ac c97974ac7 = matroskaExtractor.A0m;
                    c97974ac7.A0E(4);
                    byte[] bArr4 = c97974ac7.A02;
                    bArr4[0] = (byte) ((i12 >> 24) & 255);
                    bArr4[1] = (byte) ((i12 >> 16) & 255);
                    bArr4[2] = (byte) ((i12 >> 8) & 255);
                    bArr4[3] = (byte) (i12 & 255);
                    interfaceC98054ak.ELO(c97974ac7, 4, 2);
                    matroskaExtractor.A09 += 4;
                }
                matroskaExtractor.A0V = true;
            }
            C97974ac c97974ac8 = matroskaExtractor.A0l;
            int i13 = c97974ac8.A00;
            int i14 = i + i13;
            String str2 = w3o.A0e;
            if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
                C69778VvF c69778VvF = w3o.A0d;
                if (c69778VvF != null) {
                    if (i13 != 0) {
                        z = false;
                    }
                    C4B8.A04(z);
                    c69778VvF.A00(interfaceC98284b7);
                }
                while (true) {
                    int i15 = matroskaExtractor.A08;
                    if (i15 >= i14) {
                        break;
                    }
                    int i16 = i14 - i15;
                    int i17 = c97974ac8.A00 - c97974ac8.A01;
                    if (i17 > 0) {
                        ELR2 = Math.min(i16, i17);
                        interfaceC98054ak.ELN(c97974ac8, ELR2);
                    } else {
                        ELR2 = interfaceC98054ak.ELR(interfaceC98284b7, i16, 0, false);
                    }
                    matroskaExtractor.A08 += ELR2;
                    matroskaExtractor.A09 += ELR2;
                }
            } else {
                C97974ac c97974ac9 = matroskaExtractor.A0j;
                byte[] bArr5 = c97974ac9.A02;
                bArr5[0] = 0;
                bArr5[1] = 0;
                bArr5[2] = 0;
                int i18 = w3o.A0R;
                int i19 = 4 - i18;
                while (matroskaExtractor.A08 < i14) {
                    int i20 = matroskaExtractor.A0A;
                    int i21 = c97974ac8.A00 - c97974ac8.A01;
                    if (i20 == 0) {
                        int min = Math.min(i18, i21);
                        interfaceC98284b7.readFully(bArr5, i19 + min, i18 - min);
                        if (min > 0) {
                            c97974ac8.A0J(bArr5, i19, min);
                        }
                        matroskaExtractor.A08 += i18;
                        c97974ac9.A0G(0);
                        matroskaExtractor.A0A = c97974ac9.A04();
                        C97974ac c97974ac10 = matroskaExtractor.A0k;
                        c97974ac10.A0G(0);
                        interfaceC98054ak.ELN(c97974ac10, 4);
                        matroskaExtractor.A09 += 4;
                    } else {
                        if (i21 > 0) {
                            ELR = Math.min(i20, i21);
                            interfaceC98054ak.ELN(c97974ac8, ELR);
                        } else {
                            ELR = interfaceC98054ak.ELR(interfaceC98284b7, i20, 0, false);
                        }
                        matroskaExtractor.A08 += ELR;
                        matroskaExtractor.A09 += ELR;
                        matroskaExtractor.A0A -= ELR;
                    }
                }
            }
            if ("A_VORBIS".equals(w3o.A0e)) {
                C97974ac c97974ac11 = matroskaExtractor.A0q;
                c97974ac11.A0G(0);
                interfaceC98054ak.ELN(c97974ac11, 4);
                matroskaExtractor.A09 += 4;
            }
            int i22 = matroskaExtractor.A09;
            matroskaExtractor.A08 = r3;
            matroskaExtractor.A09 = r3;
            matroskaExtractor.A0A = r3;
            matroskaExtractor.A0V = r3;
            matroskaExtractor.A0Y = r3;
            matroskaExtractor.A0X = r3;
            matroskaExtractor.A0B = r3;
            matroskaExtractor.A00 = r3;
            matroskaExtractor.A0W = r3;
            matroskaExtractor.A0l.A0E(r3);
            return i22;
        }
        int length = bArr.length;
        int i23 = length + i;
        C97974ac c97974ac12 = matroskaExtractor.A0o;
        byte[] bArr6 = c97974ac12.A02;
        r3 = 0;
        if (bArr6.length < i23) {
            byte[] copyOf = Arrays.copyOf(bArr, i23 + i);
            c97974ac12.A0I(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr6, 0, length);
        }
        interfaceC98284b7.readFully(c97974ac12.A02, length, i);
        c97974ac12.A0G(0);
        c97974ac12.A0F(i23);
        int i222 = matroskaExtractor.A09;
        matroskaExtractor.A08 = r3;
        matroskaExtractor.A09 = r3;
        matroskaExtractor.A0A = r3;
        matroskaExtractor.A0V = r3;
        matroskaExtractor.A0Y = r3;
        matroskaExtractor.A0X = r3;
        matroskaExtractor.A0B = r3;
        matroskaExtractor.A00 = r3;
        matroskaExtractor.A0W = r3;
        matroskaExtractor.A0l.A0E(r3);
        return i222;
    }

    public static long A01(MatroskaExtractor matroskaExtractor, long j) {
        long j2 = matroskaExtractor.A0O;
        if (j2 != -9223372036854775807L) {
            return Util.A09(j, j2, 1000L);
        }
        throw C93194Fv.A00("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public static void A02(InterfaceC98284b7 interfaceC98284b7, MatroskaExtractor matroskaExtractor, int i) {
        int max;
        C97974ac c97974ac = matroskaExtractor.A0m;
        if (c97974ac.A00 < i) {
            byte[] bArr = c97974ac.A02;
            int length = bArr.length;
            if (length < i && (max = Math.max(length * 2, i)) > length) {
                bArr = Arrays.copyOf(bArr, max);
                c97974ac.A02 = bArr;
            }
            int i2 = c97974ac.A00;
            interfaceC98284b7.readFully(bArr, i2, i - i2);
            c97974ac.A0F(i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0075. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(X.W3O r13, com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r14, int r15, int r16, int r17, long r18) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.A03(X.W3O, com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor, int, int, int, long):void");
    }

    public static void A04(MatroskaExtractor matroskaExtractor, int i) {
        if (matroskaExtractor.A0R != null) {
        } else {
            throw C93194Fv.A00(AnonymousClass001.A0c("Element ", " must be in a TrackEntry", i), null);
        }
    }

    @Override // X.InterfaceC97954aa
    public final boolean EmL(InterfaceC98284b7 interfaceC98284b7) {
        C97974ac c97974ac = new C97974ac(8);
        C98274b6 c98274b6 = (C98274b6) interfaceC98284b7;
        long j = c98274b6.A04;
        long j2 = OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
        if (j != -1 && j <= OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED) {
            j2 = j;
        }
        int i = (int) j2;
        interfaceC98284b7.E3s(c97974ac.A02, 0, 4);
        int i2 = 4;
        for (long A07 = c97974ac.A07(); A07 != 440786851; A07 = ((A07 << 8) & (-256)) | (c97974ac.A02[0] & 255)) {
            i2++;
            if (i2 == i) {
                return false;
            }
            interfaceC98284b7.E3s(c97974ac.A02, 0, 1);
        }
        int i3 = 0;
        interfaceC98284b7.E3s(c97974ac.A02, 0, 1);
        byte[] bArr = c97974ac.A02;
        int i4 = bArr[0] & 255;
        if (i4 == 0) {
            return false;
        }
        int i5 = 128;
        int i6 = 0;
        while ((i4 & i5) == 0) {
            i5 >>= 1;
            i6++;
        }
        int i7 = i4 & (i5 ^ (-1));
        interfaceC98284b7.E3s(bArr, 1, i6);
        while (i3 < i6) {
            i3++;
            i7 = (c97974ac.A02[i3] & 255) + (i7 << 8);
        }
        int i8 = i2 + i6 + 1;
        long j3 = i7;
        long j4 = i8;
        if (j3 == Long.MIN_VALUE) {
            return false;
        }
        if (j != -1 && j4 + j3 >= j) {
            return false;
        }
        while (true) {
            long j5 = i8;
            long j6 = j4 + j3;
            if (j5 < j6) {
                int i9 = 0;
                interfaceC98284b7.E3s(c97974ac.A02, 0, 1);
                byte[] bArr2 = c97974ac.A02;
                int i10 = bArr2[0] & 255;
                if (i10 == 0) {
                    return false;
                }
                int i11 = 128;
                int i12 = 0;
                while ((i10 & i11) == 0) {
                    i11 >>= 1;
                    i12++;
                }
                int i13 = i10 & (i11 ^ (-1));
                interfaceC98284b7.E3s(bArr2, 1, i12);
                while (i9 < i12) {
                    i9++;
                    i13 = (c97974ac.A02[i9] & 255) + (i13 << 8);
                }
                int i14 = i8 + i12 + 1;
                if (i13 == Long.MIN_VALUE) {
                    return false;
                }
                int i15 = 0;
                interfaceC98284b7.E3s(c97974ac.A02, 0, 1);
                byte[] bArr3 = c97974ac.A02;
                int i16 = bArr3[0] & 255;
                if (i16 == 0) {
                    return false;
                }
                int i17 = 128;
                int i18 = 0;
                while ((i16 & i17) == 0) {
                    i17 >>= 1;
                    i18++;
                }
                int i19 = i16 & (i17 ^ (-1));
                interfaceC98284b7.E3s(bArr3, 1, i18);
                while (i15 < i18) {
                    i15++;
                    i19 = (c97974ac.A02[i15] & 255) + (i19 << 8);
                }
                i8 = i14 + i18 + 1;
                long j7 = i19;
                if (j7 < 0 || j7 > 2147483647L) {
                    return false;
                }
                if (j7 != 0) {
                    int i20 = (int) j7;
                    c98274b6.A02(i20, false);
                    i8 += i20;
                }
            } else {
                if (j5 != j6) {
                    return false;
                }
                return true;
            }
        }
    }

    @Override // X.InterfaceC97954aa
    public final void CNm(C4XF c4xf) {
        this.A0Q = c4xf;
    }

    public static byte[] A05(String str, long j, long j2) {
        C4B8.A03(AbstractC167007dF.A1M((j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1))));
        int i = (int) (j / 3600000000L);
        long j3 = j - ((i * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((i2 * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))).getBytes(AbstractC50482Ts.A05);
    }

    @Override // X.InterfaceC97954aa
    public final void EMc(long j, long j2) {
        this.A0G = -9223372036854775807L;
        int i = 0;
        this.A05 = 0;
        C70529Wbp c70529Wbp = (C70529Wbp) this.A0f;
        c70529Wbp.A01 = 0;
        c70529Wbp.A05.clear();
        W4L w4l = c70529Wbp.A04;
        w4l.A01 = 0;
        w4l.A00 = 0;
        W4L w4l2 = this.A0g;
        w4l2.A01 = 0;
        w4l2.A00 = 0;
        this.A08 = 0;
        this.A09 = 0;
        this.A0A = 0;
        this.A0V = false;
        this.A0Y = false;
        this.A0X = false;
        this.A0B = 0;
        this.A00 = (byte) 0;
        this.A0W = false;
        this.A0l.A0E(0);
        while (true) {
            SparseArray sparseArray = this.A0P;
            if (i < sparseArray.size()) {
                C69778VvF c69778VvF = ((W3O) sparseArray.valueAt(i)).A0d;
                if (c69778VvF != null) {
                    c69778VvF.A01 = false;
                    c69778VvF.A00 = 0;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public MatroskaExtractor() {
        this(0);
    }
}
