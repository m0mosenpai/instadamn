package X;

import android.util.SparseArray;
import androidx.media3.common.util.Util;
import com.facebook.common.dextricks.OdexSchemeArtXdex;

/* loaded from: classes11.dex */
public final class WRU implements XE1 {
    public InterfaceC72026XFo A00;
    public C66401UFm A01;
    public boolean A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C69793VvZ A09 = new C69793VvZ();
    public final WFa A08 = new WFa(4096);
    public final SparseArray A07 = new SparseArray();
    public final C70098W2y A0A = new C70098W2y();

    @Override // X.XE1
    public final /* synthetic */ XE1 CCR() {
        return this;
    }

    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, X.X8j] */
    /* JADX WARN: Type inference failed for: r8v10, types: [X.UFm, X.Vtw] */
    @Override // X.XE1
    public final int E7l(XGj xGj, VZk vZk) {
        long j;
        int A08;
        long j2;
        XE2 c70355WSj;
        InterfaceC71878X8l c70345WRz;
        long j3;
        long j4;
        long j5;
        InterfaceC72026XFo interfaceC72026XFo = this.A00;
        WDn.A00(interfaceC72026XFo);
        long length = xGj.getLength();
        if (length != -1) {
            C70098W2y c70098W2y = this.A0A;
            if (!c70098W2y.A03) {
                if (!c70098W2y.A05) {
                    int min = (int) Math.min(20000L, length);
                    j3 = length - min;
                    if (xGj.BeZ() == j3) {
                        WFa wFa = c70098W2y.A06;
                        wFa.A0M(min);
                        xGj.EJn();
                        xGj.E3s(wFa.A02, 0, min);
                        int i = wFa.A01;
                        int i2 = wFa.A00 - 4;
                        while (true) {
                            if (i2 >= i) {
                                if (AbstractC65703TsZ.A07(wFa.A02, i2) == 442) {
                                    wFa.A0O(i2 + 4);
                                    j5 = C70098W2y.A00(wFa);
                                    if (j5 != -9223372036854775807L) {
                                        break;
                                    }
                                }
                                i2--;
                            } else {
                                j5 = -9223372036854775807L;
                                break;
                            }
                        }
                        c70098W2y.A02 = j5;
                        c70098W2y.A05 = true;
                        return 0;
                    }
                    vZk.A00 = j3;
                    return 1;
                }
                if (c70098W2y.A02 != -9223372036854775807L) {
                    if (!c70098W2y.A04) {
                        int min2 = (int) Math.min(20000L, length);
                        j3 = 0;
                        if (xGj.BeZ() == 0) {
                            WFa wFa2 = c70098W2y.A06;
                            wFa2.A0M(min2);
                            xGj.EJn();
                            xGj.E3s(wFa2.A02, 0, min2);
                            int i3 = wFa2.A01;
                            int i4 = wFa2.A00;
                            while (true) {
                                if (i3 < i4 - 3) {
                                    if (AbstractC65703TsZ.A07(wFa2.A02, i3) == 442) {
                                        wFa2.A0O(i3 + 4);
                                        j4 = C70098W2y.A00(wFa2);
                                        if (j4 != -9223372036854775807L) {
                                            break;
                                        }
                                    }
                                    i3++;
                                } else {
                                    j4 = -9223372036854775807L;
                                    break;
                                }
                            }
                            c70098W2y.A01 = j4;
                            c70098W2y.A04 = true;
                            return 0;
                        }
                        vZk.A00 = j3;
                        return 1;
                    }
                    long j6 = c70098W2y.A01;
                    if (j6 != -9223372036854775807L) {
                        C69793VvZ c69793VvZ = c70098W2y.A07;
                        c70098W2y.A00 = c69793VvZ.A03(c70098W2y.A02) - c69793VvZ.A02(j6);
                    }
                }
                c70098W2y.A06.A0Q(Util.A07, 0);
                c70098W2y.A03 = true;
                xGj.EJn();
                return 0;
            }
        }
        if (!this.A02) {
            this.A02 = true;
            C70098W2y c70098W2y2 = this.A0A;
            long j7 = c70098W2y2.A00;
            if (j7 != -9223372036854775807L) {
                ?? abstractC69701Vtw = new AbstractC69701Vtw(new Object(), new WRE(c70098W2y2.A07), 1000, j7, j7 + 1, 0L, length, 188L);
                this.A01 = abstractC69701Vtw;
                c70345WRz = abstractC69701Vtw.A01;
            } else {
                c70345WRz = new C70345WRz(j7, 0L);
            }
            interfaceC72026XFo.EMe(c70345WRz);
        }
        C66401UFm c66401UFm = this.A01;
        if (c66401UFm != null && c66401UFm.A00 != null) {
            return c66401UFm.A00(xGj, vZk);
        }
        xGj.EJn();
        if (length != -1) {
            j = length - xGj.Bc8();
        } else {
            j = -1;
        }
        if (j != -1 && j < 4) {
            return -1;
        }
        WFa wFa3 = this.A08;
        if (!xGj.E3t(wFa3.A02, 0, 4, true)) {
            return -1;
        }
        wFa3.A0O(0);
        int A01 = wFa3.A01();
        if (A01 == 441) {
            return -1;
        }
        if (A01 == 442) {
            xGj.E3s(wFa3.A02, 0, 10);
            wFa3.A0O(9);
            A08 = (wFa3.A05() & 7) + 14;
        } else if (A01 == 443) {
            xGj.E3s(wFa3.A02, 0, 2);
            wFa3.A0O(0);
            A08 = wFa3.A08() + 6;
        } else {
            if (((A01 & (-256)) >> 8) != 1) {
                xGj.Em8(1);
                return 0;
            }
            int i5 = A01 & 255;
            SparseArray sparseArray = this.A07;
            C69317VlP c69317VlP = (C69317VlP) sparseArray.get(i5);
            if (!this.A04) {
                if (c69317VlP == null) {
                    if (i5 == 189) {
                        c70355WSj = new C70348WSc();
                    } else if ((i5 & 224) == 192) {
                        c70355WSj = new C70350WSe();
                    } else if ((i5 & 240) == 224) {
                        c70355WSj = new C70355WSj(null);
                        this.A06 = true;
                        this.A03 = xGj.BeZ();
                        c70355WSj.ANM(this.A00, new W4Q(Integer.MIN_VALUE, i5, 256));
                        c69317VlP = new C69317VlP(this.A09, c70355WSj);
                        sparseArray.put(i5, c69317VlP);
                    }
                    this.A05 = true;
                    this.A03 = xGj.BeZ();
                    c70355WSj.ANM(this.A00, new W4Q(Integer.MIN_VALUE, i5, 256));
                    c69317VlP = new C69317VlP(this.A09, c70355WSj);
                    sparseArray.put(i5, c69317VlP);
                }
                if (this.A05 && this.A06) {
                    j2 = this.A03 + OdexSchemeArtXdex.STATE_PGO_ATTEMPTED;
                } else {
                    j2 = 1048576;
                }
                if (xGj.BeZ() > j2) {
                    this.A04 = true;
                    this.A00.ASd();
                }
            }
            xGj.E3s(wFa3.A02, 0, 2);
            wFa3.A0O(0);
            A08 = wFa3.A08() + 6;
            if (c69317VlP != null) {
                wFa3.A0M(A08);
                xGj.readFully(wFa3.A02, 0, A08);
                wFa3.A0O(6);
                WFZ wfz = c69317VlP.A03;
                wFa3.A0R(wfz.A03, 0, 3);
                wfz.A07(0);
                wfz.A08(8);
                c69317VlP.A01 = wfz.A0C();
                c69317VlP.A00 = wfz.A0C();
                wfz.A08(6);
                wFa3.A0R(wfz.A03, 0, wfz.A04(8));
                wfz.A07(0);
                long j8 = 0;
                if (c69317VlP.A01) {
                    wfz.A08(4);
                    wfz.A08(1);
                    long A00 = WFZ.A00(wfz, wfz.A04(3) << 30);
                    if (!c69317VlP.A02 && c69317VlP.A00) {
                        wfz.A08(4);
                        wfz.A08(1);
                        c69317VlP.A04.A02(WFZ.A00(wfz, wfz.A04(3) << 30));
                        c69317VlP.A02 = true;
                    }
                    j8 = c69317VlP.A04.A02(A00);
                }
                XE2 xe2 = c69317VlP.A05;
                xe2.E3C(j8, 4);
                xe2.AJY(wFa3);
                xe2.E3B(false);
                wFa3.A0N(wFa3.A02.length);
                return 0;
            }
        }
        xGj.Em8(A08);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (r3 != r12) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[LOOP:0: B:18:0x002c->B:20:0x0034, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[SYNTHETIC] */
    @Override // X.XE1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EMc(long r10, long r12) {
        /*
            r9 = this;
            X.VvZ r6 = r9.A09
            monitor-enter(r6)
            long r1 = r6.A01     // Catch: java.lang.Throwable -> L46
            monitor-exit(r6)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L22
            long r3 = r6.A00()
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 == 0) goto L25
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L25
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 == 0) goto L25
        L22:
            r6.A04(r12)
        L25:
            X.UFm r0 = r9.A01
            if (r0 == 0) goto L2c
            r0.A01(r12)
        L2c:
            android.util.SparseArray r1 = r9.A07
            int r0 = r1.size()
            if (r5 >= r0) goto L45
            java.lang.Object r1 = r1.valueAt(r5)
            X.VlP r1 = (X.C69317VlP) r1
            r0 = 0
            r1.A02 = r0
            X.XE2 r0 = r1.A05
            r0.EMb()
            int r5 = r5 + 1
            goto L2c
        L45:
            return
        L46:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRU.EMc(long, long):void");
    }

    @Override // X.XE1
    public final boolean EmK(XGj xGj) {
        byte[] bArr = new byte[14];
        xGj.E3s(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        xGj.AB0(bArr[13] & 7);
        xGj.E3s(bArr, 0, 3);
        if (1 != (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return false;
        }
        return true;
    }

    @Override // X.XE1
    public final void CNe(InterfaceC72026XFo interfaceC72026XFo) {
        this.A00 = interfaceC72026XFo;
    }
}
