package X;

import androidx.media3.common.util.Util;

/* renamed from: X.WSo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70360WSo implements InterfaceC71967XCx {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final WFa A04 = new WFa(32);
    public final InterfaceC71940XBp A05;

    @Override // X.InterfaceC71967XCx
    public final void AJZ(WFa wFa, int i) {
        boolean z;
        int i2;
        if ((i & 1) != 0) {
            z = true;
            i2 = wFa.A01 + wFa.A05();
        } else {
            z = false;
            i2 = -1;
        }
        if (this.A03) {
            if (z) {
                this.A03 = false;
                wFa.A0O(i2);
                this.A00 = 0;
            } else {
                return;
            }
        }
        while (true) {
            int i3 = wFa.A00 - wFa.A01;
            if (i3 > 0) {
                int i4 = this.A00;
                if (i4 < 3) {
                    if (i4 == 0) {
                        int A05 = wFa.A05();
                        wFa.A0O(wFa.A01 - 1);
                        if (A05 == 255) {
                            break;
                        }
                    }
                    int i5 = wFa.A00 - wFa.A01;
                    int i6 = this.A00;
                    int min = Math.min(i5, 3 - i6);
                    WFa wFa2 = this.A04;
                    wFa.A0R(wFa2.A02, i6, min);
                    int i7 = this.A00 + min;
                    this.A00 = i7;
                    if (i7 == 3) {
                        wFa2.A0O(0);
                        wFa2.A0N(3);
                        wFa2.A0P(1);
                        int A052 = wFa2.A05();
                        int A053 = wFa2.A05();
                        this.A02 = AbstractC167007dF.A1M(A052 & 128);
                        int i8 = (((A052 & 15) << 8) | A053) + 3;
                        this.A01 = i8;
                        int length = wFa2.A02.length;
                        if (length < i8) {
                            wFa2.A0L(Math.min(4098, Math.max(i8, length * 2)));
                        }
                    }
                } else {
                    int min2 = Math.min(i3, this.A01 - i4);
                    WFa wFa3 = this.A04;
                    wFa.A0R(wFa3.A02, i4, min2);
                    int i9 = this.A00 + min2;
                    this.A00 = i9;
                    int i10 = this.A01;
                    if (i9 != i10) {
                        continue;
                    } else {
                        if (this.A02) {
                            byte[] bArr = wFa3.A02;
                            int i11 = -1;
                            for (int i12 = 0; i12 < i10; i12++) {
                                i11 = Util.A09[((i11 >>> 24) ^ (bArr[i12] & 255)) & 255] ^ (i11 << 8);
                            }
                            if (i11 != 0) {
                                break;
                            } else {
                                i10 -= 4;
                            }
                        }
                        wFa3.A0N(i10);
                        wFa3.A0O(0);
                        this.A05.AJY(wFa3);
                        this.A00 = 0;
                    }
                }
            } else {
                return;
            }
        }
        this.A03 = true;
    }

    @Override // X.InterfaceC71967XCx
    public final void EMb() {
        this.A03 = true;
    }

    @Override // X.InterfaceC71967XCx
    public final void CNd(C69793VvZ c69793VvZ, InterfaceC72026XFo interfaceC72026XFo, W4Q w4q) {
        this.A05.CNd(c69793VvZ, interfaceC72026XFo, w4q);
        this.A03 = true;
    }

    public C70360WSo(InterfaceC71940XBp interfaceC71940XBp) {
        this.A05 = interfaceC71940XBp;
    }
}
