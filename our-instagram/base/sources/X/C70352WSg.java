package X;

import com.facebook.tigon.tigonhuc.HucClient;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.WSg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70352WSg implements XE2 {
    public static final byte[] A0M = {73, 68, 51};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public XG2 A0A;
    public XG2 A0B;
    public XG2 A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final int A0H;
    public final WFZ A0I = new WFZ(new byte[7]);
    public final WFa A0J;
    public final String A0K;
    public final boolean A0L;

    @Override // X.XE2
    public final void E3B(boolean z) {
    }

    @Override // X.XE2
    public final void AJY(WFa wFa) {
        int i;
        int i2;
        int i3;
        int A04;
        XG2 xg2;
        long j;
        int i4;
        this.A0C.getClass();
        while (true) {
            int i5 = wFa.A00;
            int i6 = wFa.A01;
            int i7 = i5 - i6;
            if (i7 > 0) {
                int i8 = this.A06;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                int min = Math.min(i7, this.A05 - this.A00);
                                this.A0A.ELL(wFa, min);
                                int i9 = this.A00 + min;
                                this.A00 = i9;
                                int i10 = this.A05;
                                if (i9 == i10) {
                                    long j2 = this.A09;
                                    WDn.A02(AbstractC167007dF.A1M((j2 > (-9223372036854775807L) ? 1 : (j2 == (-9223372036854775807L) ? 0 : -1))));
                                    i = 0;
                                    this.A0A.ELS(null, 1, i10, 0, j2);
                                    this.A09 += this.A07;
                                    this.A06 = i;
                                    this.A00 = i;
                                    this.A04 = 256;
                                }
                            } else {
                                int i11 = 5;
                                if (this.A0F) {
                                    i11 = 7;
                                }
                                WFZ wfz = this.A0I;
                                byte[] bArr = wfz.A03;
                                int i12 = this.A00;
                                int min2 = Math.min(i7, i11 - i12);
                                wFa.A0R(bArr, i12, min2);
                                int i13 = this.A00 + min2;
                                this.A00 = i13;
                                if (i13 == i11) {
                                    i2 = 0;
                                    wfz.A07(0);
                                    if (!this.A0G) {
                                        int A042 = wfz.A04(2) + 1;
                                        if (A042 != 2) {
                                            AbstractC63374Sil.A04("AdtsReader", AnonymousClass001.A0c("Detected audio object type: ", ", but assuming AAC LC.", A042));
                                        }
                                        wfz.A08(5);
                                        int A043 = wfz.A04(3);
                                        int i14 = this.A02;
                                        byte[] bArr2 = {(byte) (((i14 >> 1) & 7) | 16), (byte) (((i14 << 7) & 128) | ((A043 << 3) & HucClient.BODY_UPLOAD_TIMEOUT_SECONDS))};
                                        C69034Vgb A01 = W8a.A01(new WFZ(bArr2), false);
                                        C70116W4o c70116W4o = new C70116W4o();
                                        c70116W4o.A0T = this.A0D;
                                        c70116W4o.A00("audio/mp4a-latm");
                                        c70116W4o.A0R = A01.A02;
                                        c70116W4o.A04 = A01.A00;
                                        c70116W4o.A0G = A01.A01;
                                        c70116W4o.A0X = Collections.singletonList(bArr2);
                                        c70116W4o.A0V = this.A0K;
                                        c70116W4o.A0E = this.A0H;
                                        C70130W5r c70130W5r = new C70130W5r(c70116W4o);
                                        this.A08 = 1024000000 / c70130W5r.A0I;
                                        this.A0C.AWZ(c70130W5r);
                                        this.A0G = true;
                                    } else {
                                        wfz.A08(10);
                                    }
                                    i3 = 4;
                                    wfz.A08(4);
                                    A04 = (wfz.A04(13) - 2) - 5;
                                    if (this.A0F) {
                                        A04 -= 2;
                                    }
                                    xg2 = this.A0C;
                                    j = this.A08;
                                    this.A06 = i3;
                                    this.A00 = i2;
                                    this.A0A = xg2;
                                    this.A07 = j;
                                    this.A05 = A04;
                                }
                            }
                        } else {
                            WFa wFa2 = this.A0J;
                            byte[] bArr3 = wFa2.A02;
                            int i15 = this.A00;
                            int min3 = Math.min(i7, 10 - i15);
                            wFa.A0R(bArr3, i15, min3);
                            int i16 = this.A00 + min3;
                            this.A00 = i16;
                            if (i16 == 10) {
                                i2 = 10;
                                this.A0B.ELL(wFa2, 10);
                                wFa2.A0O(6);
                                xg2 = this.A0B;
                                A04 = wFa2.A04() + 10;
                                j = 0;
                                i3 = 4;
                                this.A06 = i3;
                                this.A00 = i2;
                                this.A0A = xg2;
                                this.A07 = j;
                                this.A05 = A04;
                            }
                        }
                    } else {
                        WFZ wfz2 = this.A0I;
                        i = 0;
                        wfz2.A03[0] = wFa.A02[i6];
                        wfz2.A07(2);
                        int A044 = wfz2.A04(4);
                        int i17 = this.A02;
                        if (i17 != -1 && A044 != i17) {
                            this.A0E = false;
                            this.A06 = i;
                            this.A00 = i;
                            this.A04 = 256;
                        } else {
                            if (!this.A0E) {
                                this.A0E = true;
                                this.A03 = this.A01;
                                this.A02 = A044;
                            }
                            this.A06 = 3;
                            this.A00 = 0;
                        }
                    }
                } else {
                    byte[] bArr4 = wFa.A02;
                    while (i6 < i5) {
                        int i18 = i6 + 1;
                        int i19 = bArr4[i6] & 255;
                        if (this.A04 == 512 && ((65280 | (((byte) i19) & 255)) & 65526) == 65520) {
                            if (!this.A0E) {
                                int i20 = i18 - 2;
                                wFa.A0O(i20 + 1);
                                WFZ wfz3 = this.A0I;
                                byte[] bArr5 = wfz3.A03;
                                if (wFa.A00 - wFa.A01 >= 1) {
                                    wFa.A0R(bArr5, 0, 1);
                                    wfz3.A07(4);
                                    int A045 = wfz3.A04(1);
                                    int i21 = this.A03;
                                    if (i21 == -1 || A045 == i21) {
                                        if (this.A02 != -1) {
                                            byte[] bArr6 = wfz3.A03;
                                            if (wFa.A00 - wFa.A01 >= 1) {
                                                wFa.A0R(bArr6, 0, 1);
                                                wfz3.A07(2);
                                                if (wfz3.A04(4) == this.A02) {
                                                    wFa.A0O(i20 + 2);
                                                }
                                            }
                                        }
                                        byte[] bArr7 = wfz3.A03;
                                        if (wFa.A00 - wFa.A01 >= 4) {
                                            wFa.A0R(bArr7, 0, 4);
                                            wfz3.A07(14);
                                            int A046 = wfz3.A04(13);
                                            if (A046 >= 7) {
                                                byte[] bArr8 = wFa.A02;
                                                int i22 = wFa.A00;
                                                int i23 = i20 + A046;
                                                if (i23 < i22) {
                                                    byte b = bArr8[i23];
                                                    if (b == -1) {
                                                        int i24 = i23 + 1;
                                                        if (i24 != i22) {
                                                            byte b2 = bArr8[i24];
                                                            if (((65280 | (b2 & 255)) & 65526) == 65520 && ((b2 & 8) >> 3) == A045) {
                                                            }
                                                        }
                                                    } else if (b == 73) {
                                                        int i25 = i23 + 1;
                                                        if (i25 != i22) {
                                                            if (bArr8[i25] == 68) {
                                                                int i26 = i23 + 2;
                                                                if (i26 != i22) {
                                                                    if (bArr8[i26] == 51) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    wFa.A0O(i18);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            this.A01 = (i19 & 8) >> 3;
                            boolean z = true;
                            if ((i19 & 1) != 0) {
                                z = false;
                            }
                            this.A0F = z;
                            int i27 = 3;
                            if (!this.A0E) {
                                i27 = 1;
                            }
                            this.A06 = i27;
                            this.A00 = 0;
                            wFa.A0O(i18);
                            break;
                            break;
                        }
                        int i28 = this.A04;
                        int i29 = i19 | i28;
                        if (i29 != 329) {
                            if (i29 != 511) {
                                if (i29 != 836) {
                                    if (i29 != 1075) {
                                        if (i28 != 256) {
                                            this.A04 = 256;
                                            i18--;
                                        }
                                    } else {
                                        this.A06 = 2;
                                        this.A00 = 3;
                                        this.A05 = 0;
                                        this.A0J.A0O(0);
                                        wFa.A0O(i18);
                                        break;
                                        break;
                                    }
                                } else {
                                    i4 = 1024;
                                }
                            } else {
                                this.A04 = 512;
                            }
                            i6 = i18;
                        } else {
                            i4 = 768;
                        }
                        this.A04 = i4;
                        i6 = i18;
                    }
                    wFa.A0O(i6);
                }
            } else {
                return;
            }
        }
    }

    public C70352WSg(String str, int i, boolean z) {
        char[] cArr = WFa.A04;
        this.A0J = new WFa(Arrays.copyOf(A0M, 10));
        this.A06 = 0;
        this.A00 = 0;
        this.A04 = 256;
        this.A03 = -1;
        this.A02 = -1;
        this.A08 = -9223372036854775807L;
        this.A09 = -9223372036854775807L;
        this.A0L = z;
        this.A0K = str;
        this.A0H = i;
    }

    @Override // X.XE2
    public final void ANM(InterfaceC72026XFo interfaceC72026XFo, W4Q w4q) {
        w4q.A01();
        W4Q.A00(w4q);
        this.A0D = w4q.A01;
        W4Q.A00(w4q);
        XG2 F87 = interfaceC72026XFo.F87(w4q.A00, 1);
        this.A0C = F87;
        this.A0A = F87;
        if (this.A0L) {
            w4q.A01();
            W4Q.A00(w4q);
            XG2 F872 = interfaceC72026XFo.F87(w4q.A00, 5);
            this.A0B = F872;
            C70116W4o c70116W4o = new C70116W4o();
            W4Q.A00(w4q);
            c70116W4o.A0T = w4q.A01;
            c70116W4o.A00("application/id3");
            XG2.A00(c70116W4o, F872);
            return;
        }
        this.A0B = new WS4();
    }

    @Override // X.XE2
    public final void E3C(long j, int i) {
        this.A09 = j;
    }

    @Override // X.XE2
    public final void EMb() {
        this.A09 = -9223372036854775807L;
        this.A0E = false;
        this.A06 = 0;
        this.A00 = 0;
        this.A04 = 256;
    }
}
