package X;

import android.util.SparseArray;
import androidx.media3.common.util.Util;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.WRf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70325WRf implements XE1 {
    public static final Map A0u;
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
    public C68875VdX A0P;
    public C68875VdX A0Q;
    public InterfaceC72026XFo A0R;
    public W3P A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public int[] A0b;
    public ByteBuffer A0c;
    public boolean A0d;
    public final SparseArray A0e;
    public final WFa A0f;
    public final WFa A0g;
    public final WFa A0h;
    public final WFa A0i;
    public final WFa A0j;
    public final W4K A0k;
    public final boolean A0l;
    public final WFa A0m;
    public final WFa A0n;
    public final WFa A0o;
    public final WFa A0p;
    public final WFa A0q;
    public final InterfaceC71839X6x A0r;
    public final InterfaceC72027XFp A0s;
    public final boolean A0t;
    public static final byte[] A0y = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] A0w = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(AbstractC50482Ts.A05);
    public static final byte[] A0x = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] A0z = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    public static final UUID A0v = new UUID(72057594037932032L, -9223371306706625679L);

    @Override // X.XE1
    public final /* synthetic */ XE1 CCR() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x01e8, code lost:
    
        r2 = ". Setting mimeType to ";
        r8 = "audio/raw";
        r18 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01fc, code lost:
    
        switch(r15) {
            case 0: goto L156;
            case 1: goto L156;
            case 2: goto L161;
            case 3: goto L175;
            case 4: goto L176;
            case 5: goto L195;
            case 6: goto L196;
            case 7: goto L198;
            case 8: goto L222;
            case 9: goto L156;
            case 10: goto L223;
            case 11: goto L224;
            case 12: goto L225;
            case 13: goto L226;
            case 14: goto L227;
            case 15: goto L228;
            case 16: goto L229;
            case 17: goto L230;
            case 18: goto L231;
            case 19: goto L232;
            case 20: goto L233;
            case 21: goto L228;
            case 22: goto L234;
            case 23: goto L238;
            case 24: goto L248;
            case 25: goto L155;
            case 26: goto L254;
            case 27: goto L256;
            case 28: goto L257;
            case 29: goto L258;
            case 30: goto L259;
            case 31: goto L261;
            case 32: goto L265;
            default: goto L848;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x033d, code lost:
    
        r2 = com.google.common.collect.ImmutableList.of((java.lang.Object) X.C70325WRf.A0w, (java.lang.Object) X.W3P.A00(r3, r7));
        r7 = null;
        r8 = "text/x-ssa";
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x05a9, code lost:
    
        r12 = -1;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x05aa, code lost:
    
        r9 = -1;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x05e8, code lost:
    
        r1 = r3.A0n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x05ea, code lost:
    
        if (r1 == null) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x05ec, code lost:
    
        r0 = X.W1N.A00(new X.WFa(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x05f5, code lost:
    
        if (r0 == null) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x05f7, code lost:
    
        r7 = r0.A00;
        r8 = "video/dolby-vision";
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x05fb, code lost:
    
        r6 = r3.A0i;
        r14 = 0;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0601, code lost:
    
        if (r3.A0j == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0603, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0604, code lost:
    
        r6 = (r6 ? 1 : 0) | r0;
        r1 = new X.C70116W4o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0614, code lost:
    
        if (org.webrtc.MediaStreamTrack.AUDIO_TRACK_KIND.equals(X.WEI.A01(r8)) == false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0616, code lost:
    
        r1.A04 = r3.A0G;
        r1.A0G = r3.A0V;
        r1.A0C = r12;
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0621, code lost:
    
        r13 = r3.A0h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0623, code lost:
    
        if (r13 == null) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x062b, code lost:
    
        if (X.C70325WRf.A0u.containsKey(r13) != false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x062d, code lost:
    
        r1.A0U = r3.A0h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0631, code lost:
    
        r1.A0T = java.lang.Integer.toString(r0);
        r1.A00(r8);
        r1.A0A = r9;
        r1.A0V = r3.A0g;
        r1.A0H = r6;
        r1.A0X = r2;
        r1.A0R = r7;
        r1.A0O = r3.A0b;
        r2 = new X.C70130W5r(r1);
        r0 = r0.F87(r3.A0T, r12);
        r3.A0d = r0;
        r0.AWZ(r2);
        r10.A0e.put(r3.A0T, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x066f, code lost:
    
        if (org.webrtc.MediaStreamTrack.VIDEO_TRACK_KIND.equals(X.WEI.A01(r8)) == false) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0673, code lost:
    
        if (r3.A0M != 0) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0675, code lost:
    
        r0 = r3.A0N;
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0678, code lost:
    
        if (r0 != (-1)) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x067a, code lost:
    
        r0 = r3.A0Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x067c, code lost:
    
        r3.A0N = r0;
        r0 = r3.A0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0680, code lost:
    
        if (r0 != (-1)) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0682, code lost:
    
        r0 = r3.A0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0684, code lost:
    
        r3.A0L = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0686, code lost:
    
        r12 = -1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x068a, code lost:
    
        if (r3.A0N == r13) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x068e, code lost:
    
        if (r3.A0L == r13) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0690, code lost:
    
        r12 = (r3.A0O * r0) / (r3.A0Y * r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x069b, code lost:
    
        if (r3.A0k == false) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x06a3, code lost:
    
        if (r3.A06 == (-1.0f)) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x06a9, code lost:
    
        if (r3.A07 == (-1.0f)) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x06af, code lost:
    
        if (r3.A04 == (-1.0f)) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x06b5, code lost:
    
        if (r3.A05 == (-1.0f)) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x06bb, code lost:
    
        if (r3.A02 == (-1.0f)) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x06c1, code lost:
    
        if (r3.A03 == (-1.0f)) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x06c7, code lost:
    
        if (r3.A0B == (-1.0f)) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x06cd, code lost:
    
        if (r3.A0C == (-1.0f)) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x06d3, code lost:
    
        if (r3.A00 == (-1.0f)) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x06d9, code lost:
    
        if (r3.A01 == (-1.0f)) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x06db, code lost:
    
        r17 = new byte[25];
        r15 = java.nio.ByteBuffer.wrap(r17).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r15.put((byte) 0);
        r15.putShort((short) ((r3.A06 * 50000.0f) + 0.5f));
        X.AbstractC65702TsY.A1V(r15, r3.A07);
        X.AbstractC65702TsY.A1V(r15, r3.A04);
        X.AbstractC65702TsY.A1V(r15, r3.A05);
        X.AbstractC65702TsY.A1V(r15, r3.A02);
        X.AbstractC65702TsY.A1V(r15, r3.A03);
        X.AbstractC65702TsY.A1V(r15, r3.A0B);
        X.AbstractC65702TsY.A1V(r15, r3.A0C);
        r15.putShort((short) (r3.A00 + 0.5f));
        r15.putShort((short) (r3.A01 + 0.5f));
        r15.putShort((short) r3.A0Q);
        r15.putShort((short) r3.A0R);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x073f, code lost:
    
        r15 = new X.C69614VsH();
        r15.A02 = r3.A0I;
        r15.A01 = r3.A0H;
        r15.A03 = r3.A0J;
        r15.A05 = r17;
        r0 = r3.A0E;
        r15.A04 = r0;
        r15.A00 = r0;
        r18 = r15.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x07d1, code lost:
    
        r17 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x075e, code lost:
    
        r0 = r3.A0h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0760, code lost:
    
        if (r0 == null) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0762, code lost:
    
        r15 = X.C70325WRf.A0u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0768, code lost:
    
        if (r15.containsKey(r0) == false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x076a, code lost:
    
        r13 = X.AbstractC65702TsY.A0E(r3.A0h, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0772, code lost:
    
        if (r3.A0U != 0) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x077b, code lost:
    
        if (java.lang.Float.compare(r3.A0A, 0.0f) != 0) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0783, code lost:
    
        if (java.lang.Float.compare(r3.A08, 0.0f) != 0) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0785, code lost:
    
        r15 = r3.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x078b, code lost:
    
        if (java.lang.Float.compare(r15, 0.0f) == 0) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0793, code lost:
    
        if (java.lang.Float.compare(r15, 90.0f) != 0) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0795, code lost:
    
        r14 = 90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x07b8, code lost:
    
        if (java.lang.Float.compare(r15, -180.0f) == 0) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x07c0, code lost:
    
        if (java.lang.Float.compare(r15, 180.0f) == 0) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x07c2, code lost:
    
        r14 = 270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x07ca, code lost:
    
        if (java.lang.Float.compare(r15, -90.0f) == 0) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x07ce, code lost:
    
        r14 = 180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0797, code lost:
    
        r1.A0L = r3.A0Y;
        r1.A09 = r3.A0O;
        r1.A01 = r12;
        r1.A0F = r14;
        r1.A0Z = r3.A0o;
        r1.A0I = r3.A0W;
        r1.A0N = r18;
        r12 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x07cc, code lost:
    
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x07d5, code lost:
    
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x07de, code lost:
    
        if ("application/x-subrip".equals(r8) != false) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x07e6, code lost:
    
        if ("text/x-ssa".equals(r8) != false) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x07ee, code lost:
    
        if ("text/vtt".equals(r8) != false) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x07f6, code lost:
    
        if ("application/vobsub".equals(r8) != false) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x07fe, code lost:
    
        if ("application/pgs".equals(r8) != false) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0806, code lost:
    
        if ("application/dvbsubs".equals(r8) != false) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x080f, code lost:
    
        throw new X.VCM("Unexpected MIME type.", null, 1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0810, code lost:
    
        r12 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x034c, code lost:
    
        r0 = r3.A0m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x034e, code lost:
    
        if (r0 != null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0350, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0351, code lost:
    
        r8 = "video/mp4v-es";
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x05a8, code lost:
    
        r7 = null;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0355, code lost:
    
        r2 = java.util.Collections.singletonList(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x035a, code lost:
    
        r1 = X.WFa.A04;
        r7 = new X.WFa(X.W3P.A00(r3, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0365, code lost:
    
        r9 = r7.A03();
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0369, code lost:
    
        if (r9 == 1) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x036e, code lost:
    
        if (r9 != 65534) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0370, code lost:
    
        r7.A0O(24);
        r16 = r7.A0B();
        r1 = X.C70325WRf.A0v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x037f, code lost:
    
        if (r16 != r1.getMostSignificantBits()) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x038b, code lost:
    
        if (r7.A0B() != r1.getLeastSignificantBits()) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x038e, code lost:
    
        r1 = new java.lang.StringBuilder();
        r2 = "Non-PCM MS/ACM is unsupported. Setting mimeType to ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0564, code lost:
    
        X.AbstractC63374Sil.A04("MatroskaExtractor", X.MSZ.A0u(r2, "audio/x-unknown", r1));
        r2 = null;
        r7 = null;
        r8 = "audio/x-unknown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0397, code lost:
    
        r7 = r3.A0D;
        r12 = androidx.media3.common.util.Util.A00(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x039d, code lost:
    
        if (r12 != 0) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x039f, code lost:
    
        r1 = new java.lang.StringBuilder();
        r0 = "Unsupported PCM bit depth: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x055e, code lost:
    
        r1.append(r0);
        r1.append(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x056f, code lost:
    
        r2 = null;
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x10ef, code lost:
    
        r0 = "Error parsing MS/ACM codec private";
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x03a8, code lost:
    
        r3.A0e = new X.C69775VvC();
        r8 = "audio/true-hd";
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x059b, code lost:
    
        r2 = null;
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x03b3, code lost:
    
        r9 = X.W3P.A00(r3, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x03bc, code lost:
    
        if (r9[0] != 2) goto L858;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x03be, code lost:
    
        r2 = 1;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x03c0, code lost:
    
        r7 = r9[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x03c6, code lost:
    
        if ((r7 & 255) != 255) goto L875;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x03c8, code lost:
    
        r13 = r13 + 255;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x03cd, code lost:
    
        r2 = r2 + 1;
        r13 = r13 + (r7 & 255);
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x03d2, code lost:
    
        r7 = r9[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x03d6, code lost:
    
        if ((r7 & 255) != 255) goto L876;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x03d8, code lost:
    
        r12 = r12 + 255;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x03dd, code lost:
    
        r2 = r2 + 1;
        r12 = r12 + (r7 & 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x03e3, code lost:
    
        if (r9[r2] != 1) goto L860;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x03e5, code lost:
    
        r7 = new byte[r13];
        java.lang.System.arraycopy(r9, r2, r7, 0, r13);
        r2 = r2 + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x03ed, code lost:
    
        if (r9[r2] != 3) goto L861;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x03ef, code lost:
    
        r2 = r2 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x03f3, code lost:
    
        if (r9[r2] != 5) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x03f5, code lost:
    
        r1 = r9.length - r2;
        r0 = new byte[r1];
        java.lang.System.arraycopy(r9, r2, r0, 0, r1);
        r2 = new java.util.ArrayList(2);
        r2.add(r7);
        r2.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0407, code lost:
    
        r8 = "audio/vorbis";
        r7 = null;
        r12 = -1;
        r9 = 8192;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x10f7, code lost:
    
        throw new X.VCM("Error parsing vorbis codec private", null, 1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x10fd, code lost:
    
        throw new X.VCM("Error parsing vorbis codec private", null, 1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x1103, code lost:
    
        throw new X.VCM("Error parsing vorbis codec private", null, 1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x1109, code lost:
    
        throw new X.VCM("Error parsing vorbis codec private", null, 1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x110f, code lost:
    
        throw new X.VCM("Error parsing vorbis codec private", null, 1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x040f, code lost:
    
        r8 = "audio/mpeg-L2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0414, code lost:
    
        r2 = null;
        r7 = null;
        r12 = -1;
        r9 = 4096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0412, code lost:
    
        r8 = "audio/mpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x041b, code lost:
    
        r0 = X.WFa.A04;
        r8 = new X.WFa(X.W3P.A00(r3, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0426, code lost:
    
        r8.A0P(16);
        r12 = r8.A0A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0432, code lost:
    
        if (r12 != 1482049860) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0434, code lost:
    
        r2 = new android.util.Pair("video/divx", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0494, code lost:
    
        r8 = (java.lang.String) r2.first;
        r2 = (java.util.List) r2.second;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0441, code lost:
    
        if (r12 != 859189832) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0443, code lost:
    
        r2 = new android.util.Pair("video/3gpp", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0450, code lost:
    
        if (r12 != 826496599) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0452, code lost:
    
        r7 = r8.A01 + 20;
        r6 = r8.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0458, code lost:
    
        r2 = r6.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x045b, code lost:
    
        if (r7 >= (r2 - 4)) goto L828;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x045f, code lost:
    
        if (r6[r7] != 0) goto L878;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0465, code lost:
    
        if (r6[r7 + 1] != 0) goto L879;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x046b, code lost:
    
        if (r6[r7 + 2] != 1) goto L880;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0473, code lost:
    
        if (r6[r7 + 3] != 15) goto L881;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0475, code lost:
    
        r2 = new android.util.Pair("video/wvc1", java.util.Collections.singletonList(java.util.Arrays.copyOfRange(r6, r7, r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0485, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x1117, code lost:
    
        throw new X.VCM("Failed to find FourCC VC1 initialization data", null, 1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0488, code lost:
    
        X.AbstractC63374Sil.A04("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
        r2 = new android.util.Pair("video/x-unknown", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x111f, code lost:
    
        throw new X.VCM("Error parsing FourCC private data", null, 1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x049e, code lost:
    
        r1 = new byte[4];
        java.lang.System.arraycopy(X.W3P.A00(r3, r7), 0, r1, 0, 4);
        r8 = "application/dvbsubs";
        r2 = com.google.common.collect.ImmutableList.of((java.lang.Object) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x04b0, code lost:
    
        r0 = X.WFa.A04;
        r1 = X.W3B.A00(new X.WFa(X.W3P.A00(r3, r7)));
        r2 = r1.A0B;
        r3.A0S = r1.A08;
        r7 = r1.A0A;
        r8 = "video/avc";
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x058b, code lost:
    
        r12 = -1;
        r9 = -1;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x04cb, code lost:
    
        r2 = com.google.common.collect.ImmutableList.of((java.lang.Object) X.W3P.A00(r3, r7));
        r7 = null;
        r8 = "application/vobsub";
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x04d8, code lost:
    
        r8 = "audio/vnd.dts.hd";
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x04dc, code lost:
    
        r2 = java.util.Collections.singletonList(X.W3P.A00(r3, r7));
        r1 = X.W8a.A01(new X.WFZ(r3.A0m), false);
        r3.A0V = r1.A01;
        r3.A0G = r1.A00;
        r7 = r1.A02;
        r8 = "audio/mp4a-latm";
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x04fd, code lost:
    
        r8 = "audio/ac3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0501, code lost:
    
        r8 = "audio/vnd.dts";
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0505, code lost:
    
        r8 = "video/av01";
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0509, code lost:
    
        r8 = "video/x-vnd.on2.vp8";
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x050d, code lost:
    
        r8 = "video/x-vnd.on2.vp9";
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0511, code lost:
    
        r8 = "application/pgs";
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0515, code lost:
    
        r8 = "video/x-unknown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0519, code lost:
    
        r7 = r3.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x051b, code lost:
    
        if (r7 != 32) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x051d, code lost:
    
        r2 = null;
        r7 = null;
        r12 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0522, code lost:
    
        r1 = new java.lang.StringBuilder();
        r0 = "Unsupported floating point PCM bit depth: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x052a, code lost:
    
        r7 = r3.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x052c, code lost:
    
        if (r7 != 8) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x052e, code lost:
    
        r2 = null;
        r7 = null;
        r12 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0532, code lost:
    
        if (r7 != 16) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0534, code lost:
    
        r2 = null;
        r7 = null;
        r12 = 268435456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0539, code lost:
    
        if (r7 != 24) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x053b, code lost:
    
        r2 = null;
        r7 = null;
        r12 = 1342177280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0540, code lost:
    
        if (r7 != 32) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0542, code lost:
    
        r2 = null;
        r7 = null;
        r12 = 1610612736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0547, code lost:
    
        r1 = new java.lang.StringBuilder();
        r0 = "Unsupported big endian PCM bit depth: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x054f, code lost:
    
        r7 = r3.A0D;
        r12 = androidx.media3.common.util.Util.A00(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0555, code lost:
    
        if (r12 != 0) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0557, code lost:
    
        r1 = new java.lang.StringBuilder();
        r0 = "Unsupported little endian PCM bit depth: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0572, code lost:
    
        r0 = X.WFa.A04;
        r1 = X.W35.A00(new X.WFa(X.W3P.A00(r3, r7)));
        r2 = r1.A09;
        r3.A0S = r1.A07;
        r7 = r1.A08;
        r8 = "video/hevc";
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x058e, code lost:
    
        r2 = null;
        r7 = null;
        r8 = "text/vtt";
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0593, code lost:
    
        r8 = "application/x-subrip";
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0596, code lost:
    
        r8 = "video/mpeg2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0599, code lost:
    
        r8 = "audio/eac3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x059e, code lost:
    
        r8 = "audio/flac";
        r2 = java.util.Collections.singletonList(X.W3P.A00(r3, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x05ac, code lost:
    
        r2 = new java.util.ArrayList(3);
        r2.add(X.W3P.A00(r3, r7));
        r0 = java.nio.ByteBuffer.allocate(8);
        r7 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r6 = r0.order(r7);
        r6.putLong(r3.A0Z);
        r2.add(r6.array());
        r6 = java.nio.ByteBuffer.allocate(8).order(r7);
        r6.putLong(r3.A0a);
        r2.add(r6.array());
        r8 = "audio/opus";
        r7 = null;
        r12 = -1;
        r9 = 5760;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0206, code lost:
    
        throw new X.VCM("Unrecognized codec identifier.", null, 1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0339, code lost:
    
        if (r2 == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0ff3, code lost:
    
        r6.A01 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x09de, code lost:
    
        if (r1 == 2) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x09e1, code lost:
    
        if (r1 == 3) goto L733;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x09e3, code lost:
    
        if (r1 == 4) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x09e5, code lost:
    
        r0 = r6.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x09eb, code lost:
    
        if (r0 == 4) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x09ef, code lost:
    
        if (r0 == 8) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x09f1, code lost:
    
        r3 = new java.lang.StringBuilder();
        r2 = "Invalid float size: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x09f8, code lost:
    
        r3.append(r2);
        r3.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0a07, code lost:
    
        throw new X.VCM(r3.toString(), null, 1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0a08, code lost:
    
        r9 = (int) r0;
        r11 = 0;
        r29.readFully(r6.A06, 0, r9);
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0a13, code lost:
    
        if (r11 >= r9) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0a15, code lost:
    
        r2 = (r2 << 8) | (r12[r11] & 255);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x0a21, code lost:
    
        if (r9 != 4) goto L489;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0a23, code lost:
    
        r0 = java.lang.Float.intBitsToFloat((int) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x0a29, code lost:
    
        r7 = ((X.WSD) r7).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0a2f, code lost:
    
        if (r8 == 181) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0a33, code lost:
    
        if (r8 == 17545) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x0a35, code lost:
    
        switch(r8) {
            case 21969: goto L502;
            case 21970: goto L501;
            case 21971: goto L500;
            case 21972: goto L499;
            case 21973: goto L498;
            case 21974: goto L497;
            case 21975: goto L496;
            case 21976: goto L495;
            case 21977: goto L494;
            case 21978: goto L493;
            default: goto L487;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x0a38, code lost:
    
        switch(r8) {
            case 30323: goto L492;
            case 30324: goto L491;
            case 30325: goto L490;
            default: goto L747;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0a42, code lost:
    
        A05(r7, r8);
        r7.A0S.A09 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0a4c, code lost:
    
        A05(r7, r8);
        r7.A0S.A08 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x0a56, code lost:
    
        A05(r7, r8);
        r7.A0S.A0A = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0a60, code lost:
    
        A05(r7, r8);
        r7.A0S.A01 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x0a6a, code lost:
    
        A05(r7, r8);
        r7.A0S.A00 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0a74, code lost:
    
        A05(r7, r8);
        r7.A0S.A0C = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x0a7e, code lost:
    
        A05(r7, r8);
        r7.A0S.A0B = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0a88, code lost:
    
        A05(r7, r8);
        r7.A0S.A03 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0a92, code lost:
    
        A05(r7, r8);
        r7.A0S.A02 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x0a9c, code lost:
    
        A05(r7, r8);
        r7.A0S.A05 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x0aa6, code lost:
    
        A05(r7, r8);
        r7.A0S.A04 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x0ab0, code lost:
    
        A05(r7, r8);
        r7.A0S.A07 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0aba, code lost:
    
        A05(r7, r8);
        r7.A0S.A06 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x0ac4, code lost:
    
        r7.A0I = (long) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0ac9, code lost:
    
        A05(r7, 181);
        r7.A0S.A0V = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x0a3d, code lost:
    
        r0 = java.lang.Double.longBitsToDouble(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0ad3, code lost:
    
        r12 = (int) r6.A02;
        r7 = ((X.WSD) r7).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0ae0, code lost:
    
        if (r8 == 161) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0ae2, code lost:
    
        if (r8 == 163) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x0ae6, code lost:
    
        if (r8 == 165) goto L531;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x0aea, code lost:
    
        if (r8 == 16877) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x0aee, code lost:
    
        if (r8 == 16981) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0af2, code lost:
    
        if (r8 == 18402) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x0af6, code lost:
    
        if (r8 == 21419) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0afa, code lost:
    
        if (r8 == 25506) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0afe, code lost:
    
        if (r8 != 30322) goto L849;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0b00, code lost:
    
        A05(r7, r8);
        r1 = new byte[r12];
        r7.A0S.A0o = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0b09, code lost:
    
        r29.readFully(r1, 0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x112b, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Unexpected id: ");
        r1.append(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x1149, code lost:
    
        r1 = r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x1157, code lost:
    
        throw new X.VCM(r1, null, 1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0b10, code lost:
    
        A05(r7, r8);
        r1 = new byte[r12];
        r7.A0S.A0m = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0b5e, code lost:
    
        r3 = r7.A0h;
        java.util.Arrays.fill(r3.A02, (byte) 0);
        r29.readFully(r3.A02, 4 - r12, r12);
        r3.A0O(0);
        r7.A0C = (int) r3.A0C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x0b7a, code lost:
    
        r2 = new byte[r12];
        r29.readFully(r2, 0, r12);
        A05(r7, 18402);
        r7.A0S.A0c = new X.C69702Vtx(1, r2, 0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0b1a, code lost:
    
        A05(r7, r8);
        r1 = new byte[r12];
        r7.A0S.A0p = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0b24, code lost:
    
        A05(r7, 16877);
        r2 = r7.A0S;
        r1 = r2.A0F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0b2e, code lost:
    
        if (r1 == 1685485123) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x0b33, code lost:
    
        if (r1 != 1685480259) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0b8f, code lost:
    
        r29.Em8(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x0b35, code lost:
    
        r1 = new byte[r12];
        r2.A0n = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x0b3c, code lost:
    
        if (r7.A05 != 2) goto L747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x0b3e, code lost:
    
        r1 = (X.W3P) r7.A0e.get(r7.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x0b4a, code lost:
    
        if (r7.A01 != 4) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x1093, code lost:
    
        r1 = r29.BeZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x0b54, code lost:
    
        if ("V_VP9".equals(r1.A0f) == false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x0b56, code lost:
    
        r0 = r7.A0j;
        r0.A0M(r12);
        r1 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0b9a, code lost:
    
        if (r7.A05 != 0) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x0b9c, code lost:
    
        r3 = r7.A0k;
        r7.A06 = (int) r3.A00(r29, 8, false, true);
        r7.A07 = r3.A00;
        r7.A0D = -9223372036854775807L;
        r7.A05 = 1;
        r7.A0g.A0M(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x0bbb, code lost:
    
        r0 = (X.W3P) r7.A0e.get(r7.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x0bc9, code lost:
    
        if (r0 != null) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x0bcb, code lost:
    
        r29.Em8(r12 - r7.A07);
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x0bd3, code lost:
    
        r7.A05 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x109d, code lost:
    
        if (r28.A0Y == false) goto L773;
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x0bd7, code lost:
    
        r0.A0d.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x0bde, code lost:
    
        if (r7.A05 != 1) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x0be0, code lost:
    
        A02(r29, r7, 3);
        r11 = r7.A0g;
        r3 = (r11.A02[2] & 6) >> 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x0bf1, code lost:
    
        if (r3 != 0) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x0bf3, code lost:
    
        r7.A03 = 1;
        r1 = r7.A0b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x0bf7, code lost:
    
        if (r1 != null) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x0bf9, code lost:
    
        r1 = new int[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x0bfb, code lost:
    
        r7.A0b = r1;
        r1[0] = (r12 - r7.A07) - 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x0c03, code lost:
    
        r0 = r11.A02;
        r7.A0F = r7.A0G + A01(r7, (r0[0] << 8) | (r0[1] & 255));
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x0c1b, code lost:
    
        if (r0.A0X == 2) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x0c1f, code lost:
    
        if (r8 != 163) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x0c28, code lost:
    
        if ((r11.A02[2] & 128) != 128) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x0c64, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x0c2b, code lost:
    
        r7.A02 = r0;
        r7.A05 = 2;
        r7.A04 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x0c2a, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x0c67, code lost:
    
        if (r1.length >= 1) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x0c69, code lost:
    
        r1 = new int[java.lang.Math.max(0, 1)];
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x10b0, code lost:
    
        if (r28.A0a == false) goto L865;
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x0c70, code lost:
    
        r13 = 4;
        A02(r29, r7, 4);
        r2 = (r11.A02[3] & 255) + 1;
        r7.A03 = r2;
        r1 = r7.A0b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x0c81, code lost:
    
        if (r1 != null) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x0c83, code lost:
    
        r1 = new int[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:683:0x0c85, code lost:
    
        r7.A0b = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x0c87, code lost:
    
        if (r3 != 2) goto L582;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x0c89, code lost:
    
        java.util.Arrays.fill(r1, 0, r2, ((r12 - r7.A07) - 4) / r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:686:0x0c9f, code lost:
    
        if (r3 != 1) goto L591;
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x0ca1, code lost:
    
        r3 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x0ca3, code lost:
    
        r2 = r7.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x0ca7, code lost:
    
        if (r3 >= (r2 - 1)) goto L902;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x0ca9, code lost:
    
        r1[r3] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:691:0x0cab, code lost:
    
        r13 = r13 + 1;
        A02(r29, r7, r13);
        r2 = r11.A02[r13 - 1] & 255;
        r1 = r7.A0b;
        r0 = r1[r3] + r2;
        r1[r3] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x0cc0, code lost:
    
        if (r2 == 255) goto L904;
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x0cc2, code lost:
    
        r10 = r10 + r0;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x0cc6, code lost:
    
        r2 = r2 - 1;
        r12 = ((r12 - r7.A07) - r13) - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x0d51, code lost:
    
        r1[r2] = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x0cce, code lost:
    
        if (r3 != 3) goto L834;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x10b2, code lost:
    
        r6 = r28.A0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x0cd0, code lost:
    
        r15 = 0;
        r20 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x0cd3, code lost:
    
        r2 = r7.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x0cd7, code lost:
    
        if (r15 >= (r2 - 1)) goto L905;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x0cd9, code lost:
    
        r1[r15] = 0;
        r13 = r13 + 1;
        A02(r29, r7, r13);
        r1 = r11.A02;
        r3 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x0ce8, code lost:
    
        if (r1[r3] == 0) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x0cea, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x0ceb, code lost:
    
        r2 = 1 << (7 - r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x0cf2, code lost:
    
        if ((r1[r3] & r2) == 0) goto L604;
     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x0d15, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x0d19, code lost:
    
        if (r10 < 8) goto L910;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x10ba, code lost:
    
        if (r6 == (-1)) goto L866;
     */
    /* JADX WARN: Code restructure failed: missing block: B:711:0x0d1b, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x0d39, code lost:
    
        r10 = (int) r2;
        r1 = r7.A0b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x0d3c, code lost:
    
        if (r15 == 0) goto L907;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x0d3e, code lost:
    
        r10 = r10 + r1[r15 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x0d43, code lost:
    
        r1[r15] = r10;
        r20 = r20 + r10;
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x0cf4, code lost:
    
        r13 = r13 + r10;
        A02(r29, r7, r13);
        r18 = r3 + 1;
        r2 = (r11.A02[r3] & 255) & (r2 ^ (-1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x0d09, code lost:
    
        if (r18 >= r13) goto L911;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x0d0b, code lost:
    
        r18 = r18 + 1;
        r2 = (r2 << 8) | (r0[r1] & 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x0d1e, code lost:
    
        if (r15 <= 0) goto L609;
     */
    /* JADX WARN: Code restructure failed: missing block: B:726:0x0d20, code lost:
    
        r2 = r2 - ((1 << ((r10 * 7) + 6)) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:728:0x0d30, code lost:
    
        if (r2 < (-2147483648L)) goto L840;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x10bc, code lost:
    
        r30.A00 = r6;
        r28.A0L = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x0d37, code lost:
    
        if (r2 > 2147483647L) goto L841;
     */
    /* JADX WARN: Code restructure failed: missing block: B:732:0x114e, code lost:
    
        r1 = "EBML lacing sample size out of range.";
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x1139, code lost:
    
        r1 = "No valid varint length mask found";
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x0d4a, code lost:
    
        r2 = r2 - 1;
        r12 = ((r12 - r7.A07) - r13) - r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x113c, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Unexpected lacing value: ");
        r1.append(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x10c2, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x0c93, code lost:
    
        r0 = r1.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x0c94, code lost:
    
        if (r0 >= r2) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x0c96, code lost:
    
        r1 = new int[java.lang.Math.max(r0 * 2, r2)];
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x0c33, code lost:
    
        if (r8 != 163) goto L619;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x0c35, code lost:
    
        r1 = r7.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x0c39, code lost:
    
        if (r1 >= r7.A03) goto L912;
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x0c3b, code lost:
    
        A03(r0, r7, r7.A02, A00(r29, r0, r7, r7.A0b[r1], false), 0, ((r7.A04 * r0.A0K) / 1000) + r7.A0F);
        r7.A04++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x0d55, code lost:
    
        r8 = r7.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x0d59, code lost:
    
        if (r8 >= r7.A03) goto L913;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x0d5b, code lost:
    
        r3 = r7.A0b;
        r3[r8] = A00(r29, r0, r7, r3[r8], true);
        r7.A04++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x0fc9, code lost:
    
        r0 = r6.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x0fd0, code lost:
    
        if (r0 > 2147483647L) goto L859;
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x0fd2, code lost:
    
        r3 = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x0fd3, code lost:
    
        if (r3 != 0) goto L755;
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x0fd5, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x0fd7, code lost:
    
        r2 = ((X.WSD) r7).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:759:0x0fdd, code lost:
    
        if (r8 == 134) goto L754;
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x0fe1, code lost:
    
        if (r8 == 17026) goto L749;
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x0fe5, code lost:
    
        if (r8 == 21358) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x0fea, code lost:
    
        if (r8 != 2274716) goto L747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:766:0x0fec, code lost:
    
        A05(r2, 2274716);
        r2.A0S.A0g = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x0ff7, code lost:
    
        A05(r2, 21358);
        r2.A0S.A0h = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x1005, code lost:
    
        if ("webm".equals(r1) != false) goto L747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x100d, code lost:
    
        if ("matroska".equals(r1) != false) goto L747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x100f, code lost:
    
        r3 = new java.lang.StringBuilder();
        r3.append("DocType ");
        r3.append(r1);
        r3.append(" not supported");
     */
    /* JADX WARN: Code restructure failed: missing block: B:774:0x1023, code lost:
    
        A05(r2, 134);
        r2.A0S.A0f = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:775:0x102b, code lost:
    
        r2 = new byte[r3];
        r29.readFully(r2, 0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x1032, code lost:
    
        if (r3 <= 0) goto L914;
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x1034, code lost:
    
        r1 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x1038, code lost:
    
        if (r2[r1] != 0) goto L915;
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x103a, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x103c, code lost:
    
        r1 = new java.lang.String(r2, 0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x1042, code lost:
    
        r3 = new java.lang.StringBuilder();
        r2 = "String element size: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x0d70, code lost:
    
        r0 = r6.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x0d74, code lost:
    
        if (r0 > 8) goto L845;
     */
    /* JADX WARN: Code restructure failed: missing block: B:787:0x0d76, code lost:
    
        r10 = (int) r0;
        r12 = 0;
        r29.readFully(r6.A06, 0, r10);
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x0d81, code lost:
    
        if (r12 >= r10) goto L916;
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x0d83, code lost:
    
        r0 = (r0 << 8) | (r13[r12] & 255);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x109f, code lost:
    
        r28.A0L = r1;
        r30.A00 = r28.A0H;
        r28.A0Y = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:0x0d8f, code lost:
    
        r7 = ((X.WSD) r7).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:792:0x0d97, code lost:
    
        if (r8 == 20529) goto L726;
     */
    /* JADX WARN: Code restructure failed: missing block: B:794:0x0d9d, code lost:
    
        if (r8 == 20530) goto L723;
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x0d9f, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x0da1, code lost:
    
        switch(r8) {
            case 131: goto L707;
            case 136: goto L703;
            case 155: goto L685;
            case 159: goto L702;
            case 176: goto L701;
            case 179: goto L681;
            case 186: goto L700;
            case 215: goto L699;
            case 231: goto L680;
            case 238: goto L679;
            case 241: goto L673;
            case 251: goto L672;
            case 16871: goto L698;
            case 16980: goto L729;
            case 17029: goto L717;
            case 17143: goto L714;
            case 18401: goto L711;
            case 18408: goto L708;
            case 21420: goto L671;
            case 21432: goto L661;
            case 21680: goto L697;
            case 21682: goto L696;
            case 21690: goto L695;
            case 21930: goto L691;
            case 21938: goto L660;
            case 21998: goto L690;
            case 22186: goto L689;
            case 22203: goto L688;
            case 25188: goto L687;
            case 30114: goto L659;
            case 30321: goto L650;
            case 2352003: goto L686;
            case 2807729: goto L649;
            default: goto L633;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:798:0x0da5, code lost:
    
        switch(r8) {
            case 21945: goto L642;
            case 21946: goto L639;
            case 21947: goto L636;
            case 21948: goto L648;
            case 21949: goto L647;
            default: goto L747;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x0daa, code lost:
    
        A05(r7, r8);
        r3 = r7.A0S;
        r3.A0k = true;
        r0 = X.C70171WEr.A00((int) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x10ab, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:800:0x0db6, code lost:
    
        if (r0 == (-1)) goto L747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x0db8, code lost:
    
        r3.A0I = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:802:0x0dbc, code lost:
    
        A05(r7, r8);
        r1 = X.C70171WEr.A01((int) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x0dc4, code lost:
    
        if (r1 == (-1)) goto L747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:804:0x0dc6, code lost:
    
        r7.A0S.A0J = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x0dcc, code lost:
    
        A05(r7, r8);
        r2 = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x0dd0, code lost:
    
        if (r2 == 1) goto L646;
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x0dd2, code lost:
    
        if (r2 != 2) goto L747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:808:0x0dd4, code lost:
    
        r7.A0S.A0H = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x0dda, code lost:
    
        r7.A0S.A0H = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x0de0, code lost:
    
        A05(r7, r8);
        r7.A0S.A0R = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x0dea, code lost:
    
        A05(r7, r8);
        r7.A0S.A0Q = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x0df4, code lost:
    
        r7.A0O = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:813:0x0df8, code lost:
    
        A05(r7, r8);
        r2 = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x0dfc, code lost:
    
        if (r2 == 0) goto L658;
     */
    /* JADX WARN: Code restructure failed: missing block: B:815:0x0dfe, code lost:
    
        if (r2 == 1) goto L657;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x0e00, code lost:
    
        if (r2 == 2) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:817:0x0e02, code lost:
    
        if (r2 != 3) goto L747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:818:0x0e04, code lost:
    
        r7.A0S.A0U = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x0e0a, code lost:
    
        r7.A0S.A0U = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:820:0x0e10, code lost:
    
        r7.A0S.A0U = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:0x0e16, code lost:
    
        r7.A0S.A0U = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:822:0x0e1c, code lost:
    
        r7.A0E = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x0e20, code lost:
    
        A05(r7, r8);
        r3 = r7.A0S;
        r3.A0k = true;
        r3.A0E = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:824:0x0e2c, code lost:
    
        r2 = (int) r0;
        A05(r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x0e30, code lost:
    
        if (r2 == 0) goto L670;
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x0e32, code lost:
    
        if (r2 == 1) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:827:0x0e34, code lost:
    
        if (r2 == 3) goto L668;
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x0e38, code lost:
    
        if (r2 != 15) goto L747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:830:0x0e3a, code lost:
    
        r7.A0S.A0W = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:831:0x0e40, code lost:
    
        r7.A0S.A0W = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:832:0x0e46, code lost:
    
        r7.A0S.A0W = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:833:0x0e4c, code lost:
    
        r7.A0S.A0W = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x0e52, code lost:
    
        r7.A0K = r0 + r7.A0M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:835:0x0e59, code lost:
    
        r7.A0T = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:837:0x0e5f, code lost:
    
        if (r7.A0Z != false) goto L747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x0e61, code lost:
    
        A04(r7, r8);
        r9 = r7.A0P;
        r3 = r9.A00;
        r8 = r9.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:0x0e6b, code lost:
    
        if (r3 != r8.length) goto L678;
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x0e6d, code lost:
    
        r8 = java.util.Arrays.copyOf(r8, r3 * 2);
        r9.A01 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x0e75, code lost:
    
        r3 = r9.A00;
        r9.A00 = r3 + 1;
        r8[r3] = r0;
        r7.A0Z = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:842:0x0e81, code lost:
    
        r7.A01 = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:843:0x0e86, code lost:
    
        r7.A0G = A01(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:0x0e8e, code lost:
    
        A04(r7, r8);
        r3 = r7.A0Q;
        r7 = A01(r7, r0);
        r1 = r3.A00;
        r2 = r3.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:845:0x0e9c, code lost:
    
        if (r1 != r2.length) goto L684;
     */
    /* JADX WARN: Code restructure failed: missing block: B:846:0x0e9e, code lost:
    
        r2 = java.util.Arrays.copyOf(r2, r1 * 2);
        r3.A01 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:847:0x0ea6, code lost:
    
        r1 = r3.A00;
        r3.A00 = r1 + 1;
        r2[r1] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:848:0x0eb0, code lost:
    
        r7.A0D = A01(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x0eb8, code lost:
    
        A05(r7, r8);
        r7.A0S.A0K = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x0ec2, code lost:
    
        A05(r7, r8);
        r7.A0S.A0D = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:851:0x0ecc, code lost:
    
        A05(r7, r8);
        r7.A0S.A0a = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:852:0x0ed5, code lost:
    
        A05(r7, r8);
        r7.A0S.A0Z = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:853:0x0ede, code lost:
    
        A05(r7, r8);
        r7.A0S.A0P = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:854:0x0ee8, code lost:
    
        A05(r7, r8);
        r3 = r7.A0S;
     */
    /* JADX WARN: Code restructure failed: missing block: B:855:0x0eef, code lost:
    
        if (r0 != 1) goto L694;
     */
    /* JADX WARN: Code restructure failed: missing block: B:856:0x0ef1, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:857:0x0ef2, code lost:
    
        r3.A0j = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x0ef6, code lost:
    
        A05(r7, r8);
        r7.A0S.A0L = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:859:0x0f00, code lost:
    
        A05(r7, r8);
        r7.A0S.A0M = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:860:0x0f0a, code lost:
    
        A05(r7, r8);
        r7.A0S.A0N = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:861:0x0f14, code lost:
    
        A05(r7, r8);
        r7.A0S.A0F = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:862:0x0f1e, code lost:
    
        A05(r7, r8);
        r7.A0S.A0T = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:863:0x0f28, code lost:
    
        A05(r7, r8);
        r7.A0S.A0O = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:864:0x0f32, code lost:
    
        A05(r7, r8);
        r7.A0S.A0Y = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x0f3c, code lost:
    
        A05(r7, r8);
        r7.A0S.A0G = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:866:0x0f46, code lost:
    
        A05(r7, r8);
        r3 = r7.A0S;
     */
    /* JADX WARN: Code restructure failed: missing block: B:867:0x0f4d, code lost:
    
        if (r0 != 1) goto L706;
     */
    /* JADX WARN: Code restructure failed: missing block: B:868:0x0f4f, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:869:0x0f50, code lost:
    
        r3.A0i = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:870:0x0f54, code lost:
    
        A05(r7, r8);
        r7.A0S.A0X = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:872:0x0f60, code lost:
    
        if (r0 == 1) goto L747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:874:0x0f62, code lost:
    
        r3 = new java.lang.StringBuilder();
        r2 = "AESSettingsCipherMode ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x0fbe, code lost:
    
        r3.append(r2);
        r3.append(r0);
        r3.append(" not supported");
     */
    /* JADX WARN: Code restructure failed: missing block: B:877:0x0f6e, code lost:
    
        if (r0 == 5) goto L747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:879:0x0f70, code lost:
    
        r3 = new java.lang.StringBuilder();
        r2 = "ContentEncAlgo ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:881:0x0f7a, code lost:
    
        if (r0 == 1) goto L747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:883:0x0f7c, code lost:
    
        r3 = new java.lang.StringBuilder();
        r2 = "EBMLReadVersion ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:885:0x0f86, code lost:
    
        if (r0 < 1) goto L853;
     */
    /* JADX WARN: Code restructure failed: missing block: B:887:0x0f8c, code lost:
    
        if (r0 > 2) goto L854;
     */
    /* JADX WARN: Code restructure failed: missing block: B:889:0x0f8f, code lost:
    
        r3 = new java.lang.StringBuilder();
        r2 = "DocTypeReadVersion ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:892:0x0fb5, code lost:
    
        if (r0 == 3) goto L747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:894:0x0fb7, code lost:
    
        r3 = new java.lang.StringBuilder();
        r2 = "ContentCompAlgo ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:896:0x0f99, code lost:
    
        if (r0 == 1) goto L747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:898:0x0f9b, code lost:
    
        r3 = new java.lang.StringBuilder();
        r2 = "ContentEncodingScope ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:900:0x0fa7, code lost:
    
        if (r0 == 0) goto L747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:902:0x0fa9, code lost:
    
        r3 = new java.lang.StringBuilder();
        r2 = "ContentEncodingOrder ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:904:0x104b, code lost:
    
        r3 = new java.lang.StringBuilder();
        r2 = "Invalid integer size: ";
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:118:0x0168. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:523:0x0908. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d7  */
    @Override // X.XE1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int E7l(X.XGj r29, X.VZk r30) {
        /*
            Method dump skipped, instructions count: 5372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70325WRf.E7l(X.XGj, X.VZk):int");
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        A0u = Collections.unmodifiableMap(hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [byte, boolean, int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    public static int A00(XGj xGj, W3P w3p, C70325WRf c70325WRf, int i, boolean z) {
        ?? r3;
        int ELK;
        int ELK2;
        int i2;
        byte[] bArr;
        String str = w3p.A0f;
        if ("S_TEXT/UTF8".equals(str)) {
            bArr = A0y;
        } else if ("S_TEXT/ASS".equals(str)) {
            bArr = A0x;
        } else if ("S_TEXT/WEBVTT".equals(str)) {
            bArr = A0z;
        } else {
            XG2 xg2 = w3p.A0d;
            boolean z2 = true;
            r3 = 0;
            r3 = 0;
            if (!c70325WRf.A0U) {
                if (w3p.A0l) {
                    c70325WRf.A02 &= -1073741825;
                    int i3 = 128;
                    if (!c70325WRf.A0X) {
                        WFa wFa = c70325WRf.A0g;
                        xGj.readFully(wFa.A02, 0, 1);
                        c70325WRf.A08++;
                        byte b = wFa.A02[0];
                        if ((b & 128) != 128) {
                            c70325WRf.A00 = b;
                            c70325WRf.A0X = true;
                        } else {
                            throw new VCM("Extension bit is set in signal byte", null, 1, true);
                        }
                    }
                    byte b2 = c70325WRf.A00;
                    if ((b2 & 1) == 1) {
                        boolean A1P = AbstractC167007dF.A1P(b2 & 2, 2);
                        c70325WRf.A02 |= AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
                        if (!c70325WRf.A0V) {
                            WFa wFa2 = c70325WRf.A0m;
                            xGj.readFully(wFa2.A02, 0, 8);
                            c70325WRf.A08 += 8;
                            c70325WRf.A0V = true;
                            WFa wFa3 = c70325WRf.A0g;
                            byte[] bArr2 = wFa3.A02;
                            if (!A1P) {
                                i3 = 0;
                            }
                            bArr2[0] = (byte) (i3 | 8);
                            wFa3.A0O(0);
                            xg2.ELM(wFa3, 1, 1);
                            c70325WRf.A09++;
                            wFa2.A0O(0);
                            xg2.ELM(wFa2, 8, 1);
                            c70325WRf.A09 += 8;
                        }
                        if (A1P) {
                            if (!c70325WRf.A0W) {
                                WFa wFa4 = c70325WRf.A0g;
                                xGj.readFully(wFa4.A02, 0, 1);
                                c70325WRf.A08++;
                                wFa4.A0O(0);
                                c70325WRf.A0B = wFa4.A05();
                                c70325WRf.A0W = true;
                            }
                            int i4 = c70325WRf.A0B * 4;
                            WFa wFa5 = c70325WRf.A0g;
                            wFa5.A0M(i4);
                            xGj.readFully(wFa5.A02, 0, i4);
                            c70325WRf.A08 += i4;
                            short s = (short) ((c70325WRf.A0B / 2) + 1);
                            int i5 = (s * 6) + 2;
                            ByteBuffer byteBuffer = c70325WRf.A0c;
                            if (byteBuffer == null || byteBuffer.capacity() < i5) {
                                c70325WRf.A0c = ByteBuffer.allocate(i5);
                            }
                            c70325WRf.A0c.position(0);
                            c70325WRf.A0c.putShort(s);
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                i2 = c70325WRf.A0B;
                                if (i6 >= i2) {
                                    break;
                                }
                                int A07 = wFa5.A07();
                                int i8 = i6 % 2;
                                ByteBuffer byteBuffer2 = c70325WRf.A0c;
                                int i9 = A07 - i7;
                                if (i8 == 0) {
                                    byteBuffer2.putShort((short) i9);
                                } else {
                                    byteBuffer2.putInt(i9);
                                }
                                i6++;
                                i7 = A07;
                            }
                            int i10 = (i - c70325WRf.A08) - i7;
                            int i11 = i2 % 2;
                            ByteBuffer byteBuffer3 = c70325WRf.A0c;
                            if (i11 == 1) {
                                byteBuffer3.putInt(i10);
                            } else {
                                byteBuffer3.putShort((short) i10);
                                c70325WRf.A0c.putInt(0);
                            }
                            WFa wFa6 = c70325WRf.A0n;
                            wFa6.A0Q(c70325WRf.A0c.array(), i5);
                            xg2.ELM(wFa6, i5, 1);
                            c70325WRf.A09 += i5;
                        }
                    }
                } else {
                    byte[] bArr3 = w3p.A0p;
                    if (bArr3 != null) {
                        c70325WRf.A0f.A0Q(bArr3, bArr3.length);
                    }
                }
                if (!"A_OPUS".equals(w3p.A0f) ? w3p.A0P > 0 : z) {
                    c70325WRf.A02 |= 268435456;
                    c70325WRf.A0j.A0M(0);
                    int i12 = (c70325WRf.A0f.A00 + i) - c70325WRf.A08;
                    WFa wFa7 = c70325WRf.A0g;
                    wFa7.A0M(4);
                    byte[] bArr4 = wFa7.A02;
                    bArr4[0] = (byte) ((i12 >> 24) & 255);
                    bArr4[1] = (byte) ((i12 >> 16) & 255);
                    bArr4[2] = (byte) ((i12 >> 8) & 255);
                    bArr4[3] = (byte) (i12 & 255);
                    xg2.ELM(wFa7, 4, 2);
                    c70325WRf.A09 += 4;
                }
                c70325WRf.A0U = true;
            }
            WFa wFa8 = c70325WRf.A0f;
            int i13 = wFa8.A00;
            int i14 = i + i13;
            String str2 = w3p.A0f;
            if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
                C69775VvC c69775VvC = w3p.A0e;
                if (c69775VvC != null) {
                    if (i13 != 0) {
                        z2 = false;
                    }
                    WDn.A02(z2);
                    c69775VvC.A00(xGj);
                }
                while (true) {
                    int i15 = c70325WRf.A08;
                    if (i15 >= i14) {
                        break;
                    }
                    int i16 = i14 - i15;
                    int i17 = wFa8.A00 - wFa8.A01;
                    if (i17 > 0) {
                        ELK2 = Math.min(i16, i17);
                        xg2.ELL(wFa8, ELK2);
                    } else {
                        ELK2 = xg2.ELK(xGj, i16, false);
                    }
                    c70325WRf.A08 += ELK2;
                    c70325WRf.A09 += ELK2;
                }
            } else {
                WFa wFa9 = c70325WRf.A0o;
                byte[] bArr5 = wFa9.A02;
                bArr5[0] = 0;
                bArr5[1] = 0;
                bArr5[2] = 0;
                int i18 = w3p.A0S;
                int i19 = 4 - i18;
                while (c70325WRf.A08 < i14) {
                    int i20 = c70325WRf.A0A;
                    int i21 = wFa8.A00 - wFa8.A01;
                    if (i20 == 0) {
                        int min = Math.min(i18, i21);
                        xGj.readFully(bArr5, i19 + min, i18 - min);
                        if (min > 0) {
                            wFa8.A0R(bArr5, i19, min);
                        }
                        c70325WRf.A08 += i18;
                        wFa9.A0O(0);
                        c70325WRf.A0A = wFa9.A07();
                        WFa wFa10 = c70325WRf.A0p;
                        wFa10.A0O(0);
                        xg2.ELL(wFa10, 4);
                        c70325WRf.A09 += 4;
                    } else {
                        if (i21 > 0) {
                            ELK = Math.min(i20, i21);
                            xg2.ELL(wFa8, ELK);
                        } else {
                            ELK = xg2.ELK(xGj, i20, false);
                        }
                        c70325WRf.A08 += ELK;
                        c70325WRf.A09 += ELK;
                        c70325WRf.A0A -= ELK;
                    }
                }
            }
            if ("A_VORBIS".equals(w3p.A0f)) {
                WFa wFa11 = c70325WRf.A0q;
                wFa11.A0O(0);
                xg2.ELL(wFa11, 4);
                c70325WRf.A09 += 4;
            }
            int i22 = c70325WRf.A09;
            c70325WRf.A08 = r3;
            c70325WRf.A09 = r3;
            c70325WRf.A0A = r3;
            c70325WRf.A0U = r3;
            c70325WRf.A0X = r3;
            c70325WRf.A0W = r3;
            c70325WRf.A0B = r3;
            c70325WRf.A00 = r3;
            c70325WRf.A0V = r3;
            c70325WRf.A0f.A0M(r3);
            return i22;
        }
        int length = bArr.length;
        int i23 = length + i;
        WFa wFa12 = c70325WRf.A0i;
        byte[] bArr6 = wFa12.A02;
        r3 = 0;
        if (bArr6.length < i23) {
            byte[] copyOf = Arrays.copyOf(bArr, i23 + i);
            wFa12.A0Q(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr6, 0, length);
        }
        xGj.readFully(wFa12.A02, length, i);
        wFa12.A0O(0);
        wFa12.A0N(i23);
        int i222 = c70325WRf.A09;
        c70325WRf.A08 = r3;
        c70325WRf.A09 = r3;
        c70325WRf.A0A = r3;
        c70325WRf.A0U = r3;
        c70325WRf.A0X = r3;
        c70325WRf.A0W = r3;
        c70325WRf.A0B = r3;
        c70325WRf.A00 = r3;
        c70325WRf.A0V = r3;
        c70325WRf.A0f.A0M(r3);
        return i222;
    }

    public static long A01(C70325WRf c70325WRf, long j) {
        long j2 = c70325WRf.A0O;
        if (j2 != -9223372036854775807L) {
            return Util.A07(j, j2, 1000L);
        }
        throw new VCM("Can't scale timecode prior to timecodeScale being set.", null, 1, true);
    }

    public static void A02(XGj xGj, C70325WRf c70325WRf, int i) {
        WFa wFa = c70325WRf.A0g;
        if (wFa.A00 < i) {
            int length = wFa.A02.length;
            if (length < i) {
                wFa.A0L(Math.max(length * 2, i));
            }
            byte[] bArr = wFa.A02;
            int i2 = wFa.A00;
            xGj.readFully(bArr, i2, i - i2);
            wFa.A0N(i);
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
    public static void A03(X.W3P r13, X.C70325WRf r14, int r15, int r16, int r17, long r18) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70325WRf.A03(X.W3P, X.WRf, int, int, int, long):void");
    }

    public static void A04(C70325WRf c70325WRf, int i) {
        if (c70325WRf.A0Q != null && c70325WRf.A0P != null) {
        } else {
            throw new VCM(AnonymousClass001.A0c("Element ", " must be in a Cues", i), null, 1, true);
        }
    }

    public static void A05(C70325WRf c70325WRf, int i) {
        if (c70325WRf.A0S != null) {
        } else {
            throw new VCM(AnonymousClass001.A0c("Element ", " must be in a TrackEntry", i), null, 1, true);
        }
    }

    @Override // X.XE1
    public final void CNe(InterfaceC72026XFo interfaceC72026XFo) {
        this.A0R = interfaceC72026XFo;
        if (this.A0t) {
            interfaceC72026XFo = new C70333WRn(interfaceC72026XFo, this.A0s);
        }
        this.A0R = interfaceC72026XFo;
    }

    @Override // X.XE1
    public final boolean EmK(XGj xGj) {
        WFa wFa = new WFa(8);
        long length = xGj.getLength();
        long j = OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
        if (length != -1 && length <= OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED) {
            j = length;
        }
        int i = (int) j;
        xGj.E3s(wFa.A02, 0, 4);
        int i2 = 4;
        for (long A0C = wFa.A0C(); A0C != 440786851; A0C = ((A0C << 8) & (-256)) | (wFa.A02[0] & 255)) {
            i2++;
            if (i2 == i) {
                return false;
            }
            xGj.E3s(wFa.A02, 0, 1);
        }
        int i3 = 0;
        xGj.E3s(wFa.A02, 0, 1);
        byte[] bArr = wFa.A02;
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
        xGj.E3s(bArr, 1, i6);
        while (i3 < i6) {
            i3++;
            i7 = (wFa.A02[i3] & 255) + (i7 << 8);
        }
        int i8 = i2 + i6 + 1;
        long j2 = i7;
        long j3 = i8;
        if (j2 == Long.MIN_VALUE) {
            return false;
        }
        if (length != -1 && j3 + j2 >= length) {
            return false;
        }
        while (true) {
            long j4 = i8;
            long j5 = j3 + j2;
            if (j4 < j5) {
                int i9 = 0;
                xGj.E3s(wFa.A02, 0, 1);
                byte[] bArr2 = wFa.A02;
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
                xGj.E3s(bArr2, 1, i12);
                while (i9 < i12) {
                    i9++;
                    i13 = (wFa.A02[i9] & 255) + (i13 << 8);
                }
                int i14 = i8 + i12 + 1;
                if (i13 == Long.MIN_VALUE) {
                    return false;
                }
                int i15 = 0;
                xGj.E3s(wFa.A02, 0, 1);
                byte[] bArr3 = wFa.A02;
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
                xGj.E3s(bArr3, 1, i18);
                while (i15 < i18) {
                    i15++;
                    i19 = (wFa.A02[i15] & 255) + (i19 << 8);
                }
                i8 = i14 + i18 + 1;
                long j6 = i19;
                if (j6 < 0 || j6 > 2147483647L) {
                    return false;
                }
                if (j6 != 0) {
                    int i20 = (int) j6;
                    xGj.AB0(i20);
                    i8 += i20;
                }
            } else {
                if (j4 != j5) {
                    return false;
                }
                return true;
            }
        }
    }

    public C70325WRf(InterfaceC71839X6x interfaceC71839X6x, InterfaceC72027XFp interfaceC72027XFp, int i) {
        this.A0M = -1L;
        this.A0O = -9223372036854775807L;
        this.A0I = -9223372036854775807L;
        this.A0J = -9223372036854775807L;
        this.A0H = -1L;
        this.A0L = -1L;
        this.A0G = -9223372036854775807L;
        this.A0r = interfaceC71839X6x;
        ((WSE) interfaceC71839X6x).A03 = new WSD(this);
        this.A0s = interfaceC72027XFp;
        this.A0l = AbstractC167007dF.A1N(i & 1);
        this.A0t = (i & 2) == 0;
        this.A0k = new W4K();
        this.A0e = new SparseArray();
        this.A0g = new WFa(4);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(-1);
        this.A0q = new WFa(allocate.array());
        this.A0h = new WFa(4);
        this.A0p = new WFa(WFG.A01);
        this.A0o = new WFa(4);
        this.A0f = new WFa();
        this.A0i = new WFa();
        this.A0m = new WFa(8);
        this.A0n = new WFa();
        this.A0j = new WFa();
        this.A0b = new int[1];
    }

    public static byte[] A06(String str, long j, long j2) {
        WDn.A01(AbstractC167007dF.A1M((j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1))));
        int i = (int) (j / 3600000000L);
        long j3 = j - ((i * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((i2 * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))).getBytes(AbstractC50482Ts.A05);
    }

    @Override // X.XE1
    public final void EMc(long j, long j2) {
        this.A0G = -9223372036854775807L;
        int i = 0;
        this.A05 = 0;
        WSE wse = (WSE) this.A0r;
        wse.A01 = 0;
        wse.A05.clear();
        W4K w4k = wse.A04;
        w4k.A01 = 0;
        w4k.A00 = 0;
        W4K w4k2 = this.A0k;
        w4k2.A01 = 0;
        w4k2.A00 = 0;
        this.A08 = 0;
        this.A09 = 0;
        this.A0A = 0;
        this.A0U = false;
        this.A0X = false;
        this.A0W = false;
        this.A0B = 0;
        this.A00 = (byte) 0;
        this.A0V = false;
        this.A0f.A0M(0);
        while (true) {
            SparseArray sparseArray = this.A0e;
            if (i < sparseArray.size()) {
                C69775VvC c69775VvC = ((W3P) sparseArray.valueAt(i)).A0e;
                if (c69775VvC != null) {
                    c69775VvC.A01 = false;
                    c69775VvC.A00 = 0;
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Deprecated
    public C70325WRf() {
        this(new WSE(), InterfaceC72027XFp.A00, 2);
    }
}
