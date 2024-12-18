package com.google.android.exoplayer2.extractor.mp3;

import X.C131905xQ;
import X.C4XF;
import X.C58603PyW;
import X.C68703Vaf;
import X.C69628VsV;
import X.C70527Wbn;
import X.C70530Wbq;
import X.C97974ac;
import X.C98274b6;
import X.C98414bK;
import X.InterfaceC65402TjZ;
import X.InterfaceC97954aa;
import X.InterfaceC98054ak;
import X.InterfaceC98284b7;
import X.XLI;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;

/* loaded from: classes11.dex */
public final class Mp3Extractor implements InterfaceC97954aa {
    public static final InterfaceC65402TjZ A0J = new InterfaceC65402TjZ() { // from class: X.Wbw
        @Override // X.InterfaceC65402TjZ
        public final boolean AT4(int i, int i2, int i3, int i4, int i5) {
            if (i2 == 67) {
                if (i3 == 79 && i4 == 77) {
                    if (i5 != 77 && i != 2) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            if (i2 != 77 || i3 != 76 || i4 != 76) {
                return false;
            }
            if (i5 != 84 && i != 2) {
                return false;
            }
            return true;
        }
    };
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public C4XF A06;
    public InterfaceC98054ak A07;
    public InterfaceC98054ak A08;
    public XLI A09;
    public Metadata A0A;
    public boolean A0B;
    public final int A0C;
    public final long A0D;
    public final C69628VsV A0E;
    public final C58603PyW A0F;
    public final C97974ac A0G;
    public final C68703Vaf A0H;
    public final InterfaceC98054ak A0I;

    @Override // X.InterfaceC97954aa
    public final void EMc(long j, long j2) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A04 = 0L;
        this.A00 = 0;
        this.A05 = j2;
        XLI xli = this.A09;
        if (xli instanceof C70530Wbq) {
            C131905xQ c131905xQ = ((C70530Wbq) xli).A02;
            if (j2 - c131905xQ.A00(c131905xQ.A00 - 1) >= 100000) {
                this.A0B = true;
                this.A07 = this.A0I;
            }
        }
    }

    @Override // X.InterfaceC97954aa
    public final boolean EmL(InterfaceC98284b7 interfaceC98284b7) {
        return A03(interfaceC98284b7, true);
    }

    public static long A00(Metadata metadata) {
        if (metadata != null) {
            for (Metadata.Entry entry : metadata.A01) {
                if (entry instanceof TextInformationFrame) {
                    TextInformationFrame textInformationFrame = (TextInformationFrame) entry;
                    if (((Id3Frame) textInformationFrame).A00.equals("TLEN")) {
                        return Util.A07(Long.parseLong((String) textInformationFrame.A01.get(0)));
                    }
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    private C70527Wbn A01(InterfaceC98284b7 interfaceC98284b7, boolean z) {
        C97974ac c97974ac = this.A0G;
        interfaceC98284b7.E3s(c97974ac.A02, 0, 4);
        c97974ac.A0G(0);
        C69628VsV c69628VsV = this.A0E;
        c69628VsV.A00(c97974ac.A01());
        C98274b6 c98274b6 = (C98274b6) interfaceC98284b7;
        return new C70527Wbn(c69628VsV, c98274b6.A04, c98274b6.A02, z);
    }

    private boolean A02(InterfaceC98284b7 interfaceC98284b7) {
        boolean z;
        XLI xli = this.A09;
        boolean z2 = true;
        if (xli != null) {
            long Avh = xli.Avh();
            if (Avh != -1) {
                if (((C98274b6) interfaceC98284b7).A02 + r0.A01 > Avh - 4) {
                    return true;
                }
            }
        }
        try {
            byte[] bArr = this.A0G.A02;
            C98274b6 c98274b6 = (C98274b6) interfaceC98284b7;
            if (c98274b6.A02(4, true)) {
                System.arraycopy(c98274b6.A03, c98274b6.A01 - 4, bArr, 0, 4);
                z = true;
            } else {
                z = false;
            }
            z2 = !z;
            return z2;
        } catch (EOFException unused) {
            return z2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00db, code lost:
    
        if (r20 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00dd, code lost:
    
        r19.Em8(r12 + r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e1, code lost:
    
        r18.A01 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e3, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e4, code lost:
    
        r6.A01 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A03(X.InterfaceC98284b7 r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp3.Mp3Extractor.A03(X.4b7, boolean):boolean");
    }

    @Override // X.InterfaceC97954aa
    public final void CNm(C4XF c4xf) {
        this.A06 = c4xf;
        InterfaceC98054ak F88 = c4xf.F88(0, 1);
        this.A08 = F88;
        this.A07 = F88;
        this.A06.ASd();
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x03c6, code lost:
    
        if (r8 != (-1)) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03f8, code lost:
    
        r1 = r35.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0295, code lost:
    
        if ((r7 & 2) != 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0297, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0298, code lost:
    
        r1 = A01(r36, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03fc, code lost:
    
        if (r1 == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03fe, code lost:
    
        r2 = r1.Azt();
        r20 = r1.Avh();
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0408, code lost:
    
        r2 = A00(r35.A0A);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0410, code lost:
    
        if (r4 == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0412, code lost:
    
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0415, code lost:
    
        if (r1 != null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0417, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x024d, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x023d, code lost:
    
        r1 = null;
        r8 = (X.C98274b6) r36;
        r8.A01 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0058, code lost:
    
        r8 = (X.C98274b6) r36;
        r9 = r8.A04;
        r3 = r8.A02;
        r11 = r6.A04;
        r1 = r6.A03;
        r16 = r7.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x006d, code lost:
    
        if ((r16 & 1) != 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x006f, code lost:
    
        r3 = r7.A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0073, code lost:
    
        if (r3 == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0075, code lost:
    
        r24 = com.google.android.exoplayer2.util.Util.A09(r3, r11 * 1000000, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x008b, code lost:
    
        if ((r16 & 6) == 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x008d, code lost:
    
        r1 = new X.C70532Wbs(null, r6.A02, r3, r24, -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x009e, code lost:
    
        if (r1 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00a0, code lost:
    
        r7 = r35.A0F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x00a5, code lost:
    
        if (r7.A00 == (-1)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x00a9, code lost:
    
        if (r7.A01 == (-1)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0107, code lost:
    
        r8.A01 = 0;
        r8.A02(r5 + 141, false);
        r5 = r35.A0G;
        r36.E3s(r5.A02, 0, 3);
        r5.A0G(0);
        r3 = r5.A03();
        r4 = r3 >> 12;
        r3 = r3 & 4095;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0121, code lost:
    
        if (r4 > 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0123, code lost:
    
        if (r3 <= 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0125, code lost:
    
        r7.A00 = r4;
        r7.A01 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x00ab, code lost:
    
        r36.Em8(r6.A02);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x00b0, code lost:
    
        if (r1 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x00b2, code lost:
    
        r3 = X.AbstractC167007dF.A1W(r1.A01);
        r1 = r1;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00b8, code lost:
    
        if (r3 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x00ba, code lost:
    
        if (r2 != 1231971951) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x00bc, code lost:
    
        r1 = A01(r36, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x012a, code lost:
    
        r33 = r7.A07();
        r12 = new long[100];
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0133, code lost:
    
        r12[r1] = r7.A02();
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x013c, code lost:
    
        if (r1 < 100) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0142, code lost:
    
        if (r9 == (-1)) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0144, code lost:
    
        r30 = r3 + r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0148, code lost:
    
        if (r9 == r30) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x014a, code lost:
    
        X.AbstractC46512Bo.A04("XingSeeker", X.AnonymousClass001.A0f("XING data size mismatch: ", ", ", r9, r30));
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0159, code lost:
    
        r1 = new X.C70532Wbs(r12, r6.A02, r3, r24, r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x016c, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0173, code lost:
    
        if (r7.A00 < 40) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0175, code lost:
    
        r7.A0G(36);
        r2 = r7.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0249, code lost:
    
        if (r2 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r2 == 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        r5 = 21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (r7.A00 < (r5 + 4)) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        r7.A0G(r5);
        r2 = r7.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r2 == 1483304551) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        if (r2 != 1231971951) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (r2 == 1483304551) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        if (r2 != 1231971951) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0181, code lost:
    
        if (r2 != 1447187017) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0183, code lost:
    
        r8 = (X.C98274b6) r36;
        r1 = r8.A04;
        r2 = r8.A02;
        r7.A0H(10);
        r4 = r7.A01();
        r1 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0196, code lost:
    
        if (r4 <= 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0198, code lost:
    
        r11 = r6.A03;
        r9 = r4;
        r4 = 576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01a2, code lost:
    
        if (r11 < 32000) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01a4, code lost:
    
        r4 = 1152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a6, code lost:
    
        r25 = com.google.android.exoplayer2.util.Util.A09(r9, 1000000 * r4, r11);
        r11 = r7.A05();
        r21 = r7.A05();
        r10 = r7.A05();
        r7.A0H(2);
        r18 = r2 + r6.A02;
        r4 = new long[r11];
        r4 = new long[r11];
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d3, code lost:
    
        if (r9 >= r11) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01d5, code lost:
    
        r4[r9] = (r9 * r25) / r11;
        r4[r9] = java.lang.Math.max(r2, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01e6, code lost:
    
        if (r10 == 1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ea, code lost:
    
        if (r10 == 2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ed, code lost:
    
        if (r10 == 3) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01f0, code lost:
    
        if (r10 != 4) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01f2, code lost:
    
        r4 = r7.A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01f6, code lost:
    
        r2 = r2 + (r4 * r21);
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ff, code lost:
    
        r4 = r7.A03();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0204, code lost:
    
        r4 = r7.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0209, code lost:
    
        r4 = r7.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0212, code lost:
    
        if (r1 == (-1)) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0216, code lost:
    
        if (r1 == r2) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0218, code lost:
    
        X.AbstractC46512Bo.A04("VbriSeeker", X.AnonymousClass001.A0f("VBRI data size mismatch: ", ", ", r1, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0229, code lost:
    
        r1 = new X.C70531Wbr(r4, r4, r25, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0236, code lost:
    
        r36.Em8(r6.A02);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c0, code lost:
    
        r10 = r35.A0A;
        r4 = r8.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c4, code lost:
    
        if (r10 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c6, code lost:
    
        r9 = r10.A01;
        r7 = r9.length;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ca, code lost:
    
        if (r3 >= r7) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00cc, code lost:
    
        r13 = r9[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d0, code lost:
    
        if ((r13 instanceof com.google.android.exoplayer2.metadata.id3.MlltFrame) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0104, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d2, code lost:
    
        r18 = A00(r10);
        r11 = ((com.google.android.exoplayer2.metadata.id3.MlltFrame) r13).A03.length;
        r2 = r11 + 1;
        r10 = new long[r2];
        r9 = new long[r2];
        r10[0] = r4;
        r16 = 0;
        r9[0] = 0;
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e8, code lost:
    
        if (r7 > r11) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ea, code lost:
    
        r15 = r7 - 1;
        r4 = r4 + (r13.A00 + r12[r15]);
        r16 = r16 + (r13.A01 + r13.A04[r15]);
        r10[r7] = r4;
        r9[r7] = r16;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0266, code lost:
    
        r4 = new X.C70533Wbt(r10, r9, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x026d, code lost:
    
        r7 = r35.A0C;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0272, code lost:
    
        if ((r7 & 4) == 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0274, code lost:
    
        if (r4 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0276, code lost:
    
        r2 = r4.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0278, code lost:
    
        r20 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x027a, code lost:
    
        r1 = new X.C70530Wbq(r2, r8.A02, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0286, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0287, code lost:
    
        if (r1 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0289, code lost:
    
        r2 = r1.Cca();
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x028d, code lost:
    
        if (r2 != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x028f, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0291, code lost:
    
        if ((r7 & 1) == 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x029c, code lost:
    
        r35.A09 = r1;
        r35.A06.EMf(r1);
        r4 = r35.A07;
        r3 = new X.C4B3();
        r3.A0U = r6.A06;
        r3.A09 = 4096;
        r3.A04 = r6.A01;
        r3.A0E = r6.A03;
        r2 = r35.A0F;
        r3.A06 = r2.A00;
        r3.A07 = r2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02c6, code lost:
    
        if ((r7 & 8) == 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02c8, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02c9, code lost:
    
        r3.A0N = r1;
        r4.AWa(new X.C4B6(r3));
        r35.A03 = r8.A02;
     */
    @Override // X.InterfaceC97954aa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int E7m(X.InterfaceC98284b7 r36, X.C4XJ r37) {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp3.Mp3Extractor.E7m(X.4b7, X.4XJ):int");
    }

    public Mp3Extractor(int i) {
        this(i, -9223372036854775807L);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.VsV] */
    public Mp3Extractor(int i, long j) {
        this.A0C = (i & 2) != 0 ? i | 1 : i;
        this.A0D = j;
        this.A0G = new C97974ac(10);
        this.A0E = new Object();
        this.A0F = new C58603PyW();
        this.A02 = -9223372036854775807L;
        this.A0H = new C68703Vaf();
        C98414bK c98414bK = new C98414bK();
        this.A0I = c98414bK;
        this.A07 = c98414bK;
    }

    public Mp3Extractor() {
        this(0);
    }
}
