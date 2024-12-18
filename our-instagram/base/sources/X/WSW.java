package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.SparseArray;
import androidx.media3.common.util.Util;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class WSW implements InterfaceC71939XBo {
    public static final byte[] A07 = {0, 7, 8, 15};
    public static final byte[] A08 = {0, 119, -120, -1};
    public static final byte[] A09 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Bitmap A00;
    public final Canvas A01;
    public final Paint A02;
    public final Paint A03;
    public final C69185VjE A04;
    public final C69316VlO A05;
    public final C69416Vn0 A06;

    public static C69185VjE A00(WFZ wfz, int i) {
        int[] iArr;
        int A04;
        int A042;
        int A043;
        int A044;
        int A045 = wfz.A04(8);
        wfz.A08(8);
        int i2 = i - 2;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] A03 = A03();
        int[] A046 = A04();
        while (i2 > 0) {
            int A047 = wfz.A04(8);
            int A048 = wfz.A04(8);
            int i3 = i2 - 2;
            if ((A048 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = A046;
                if ((A048 & 64) != 0) {
                    iArr = A03;
                }
            }
            if ((A048 & 1) != 0) {
                A04 = wfz.A04(8);
                A042 = wfz.A04(8);
                A043 = wfz.A04(8);
                A044 = wfz.A04(8);
                i2 = i3 - 4;
            } else {
                A04 = wfz.A04(6) << 2;
                A042 = wfz.A04(4) << 4;
                A043 = wfz.A04(4) << 4;
                A044 = wfz.A04(2) << 6;
                i2 = i3 - 2;
            }
            if (A04 == 0) {
                A042 = 0;
                A043 = 0;
                A044 = 255;
            }
            double d = A04;
            double d2 = A042 - 128;
            double d3 = A043 - 128;
            int i4 = (int) ((d - (0.34414d * d3)) - (d2 * 0.71414d));
            int max = Math.max(0, Math.min((int) (d + (1.402d * d2)), 255));
            int max2 = Math.max(0, Math.min(i4, 255));
            iArr[A047] = (((byte) (255 - (A044 & 255))) << 24) | (max << 16) | (max2 << 8) | Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255));
        }
        return new C69185VjE(iArr2, A03, A046, A045);
    }

    public static C69186VjF A01(WFZ wfz) {
        int A04 = wfz.A04(16);
        wfz.A08(4);
        int A042 = wfz.A04(2);
        boolean A0C = wfz.A0C();
        wfz.A08(1);
        byte[] bArr = Util.A07;
        byte[] bArr2 = bArr;
        if (A042 == 1) {
            wfz.A08(wfz.A04(8) * 16);
        } else if (A042 == 0) {
            int A043 = wfz.A04(16);
            int A044 = wfz.A04(16);
            if (A043 > 0) {
                bArr = new byte[A043];
                WDn.A02(AbstractC167007dF.A1N(wfz.A00));
                System.arraycopy(wfz.A03, wfz.A02, bArr, 0, A043);
                wfz.A02 += A043;
                WFZ.A01(wfz);
            }
            if (A044 > 0) {
                bArr2 = new byte[A044];
                WDn.A02(AbstractC167007dF.A1N(wfz.A00));
                System.arraycopy(wfz.A03, wfz.A02, bArr2, 0, A044);
                wfz.A02 += A044;
                WFZ.A01(wfz);
            } else {
                bArr2 = bArr;
            }
        }
        return new C69186VjF(bArr, bArr2, A04, A0C);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01b0, code lost:
    
        if (r4 != 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        if (r0 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012c, code lost:
    
        if (r11 != 0) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(android.graphics.Canvas r23, android.graphics.Paint r24, byte[] r25, int[] r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WSW.A02(android.graphics.Canvas, android.graphics.Paint, byte[], int[], int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
    
        r4 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] A03() {
        /*
            r7 = 16
            int[] r6 = new int[r7]
            r0 = 0
            r6[r0] = r0
            r5 = 1
        L8:
            r4 = 255(0xff, float:3.57E-43)
        La:
            r0 = r5 & 2
            r3 = 0
            if (r0 == 0) goto L11
            r3 = 255(0xff, float:3.57E-43)
        L11:
            r0 = r5 & 4
            r2 = 255(0xff, float:3.57E-43)
            if (r0 != 0) goto L18
        L17:
            r2 = 0
        L18:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = r4 << 16
            r1 = r1 | r0
            int r0 = r3 << 8
            r1 = r1 | r0
            r1 = r1 | r2
            r6[r5] = r1
            int r5 = r5 + 1
            if (r5 >= r7) goto L44
            r1 = 8
            r0 = r5 & 1
            if (r5 >= r1) goto L31
            r4 = 0
            if (r0 == 0) goto La
            goto L8
        L31:
            r2 = 127(0x7f, float:1.78E-43)
            r4 = 0
            if (r0 == 0) goto L38
            r4 = 127(0x7f, float:1.78E-43)
        L38:
            r0 = r5 & 2
            r3 = 0
            if (r0 == 0) goto L3f
            r3 = 127(0x7f, float:1.78E-43)
        L3f:
            r0 = r5 & 4
            if (r0 == 0) goto L17
            goto L18
        L44:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WSW.A03():int[]");
    }

    public static int[] A04() {
        int i;
        int i2;
        int i3;
        int[] iArr = new int[256];
        iArr[0] = 0;
        int i4 = 0;
        do {
            int i5 = 255;
            if (i4 < 8) {
                i = 0;
                if ((i4 & 1) != 0) {
                    i = 255;
                }
                i2 = 0;
                if ((i4 & 2) != 0) {
                    i2 = 255;
                }
                if ((i4 & 4) == 0) {
                    i5 = 0;
                }
                i3 = 1056964608;
            } else {
                int i6 = i4 & 136;
                int i7 = AbstractC62862SUj.MAX_FACTORIAL;
                int i8 = 85;
                if (i6 != 0) {
                    if (i6 != 8) {
                        i7 = 43;
                        if (i6 != 128) {
                            if (i6 == 136) {
                                int i9 = 0;
                                if ((i4 & 1) != 0) {
                                    i9 = 43;
                                }
                                int i10 = 0;
                                if ((i4 & 16) != 0) {
                                    i10 = 85;
                                }
                                i = i9 + i10;
                                int i11 = 0;
                                if ((i4 & 2) != 0) {
                                    i11 = 43;
                                }
                                int i12 = 0;
                                if ((i4 & 32) != 0) {
                                    i12 = 85;
                                }
                                i2 = i11 + i12;
                                if ((i4 & 4) == 0) {
                                    i7 = 0;
                                }
                            }
                            i4++;
                        } else {
                            int i13 = 0;
                            if ((i4 & 1) != 0) {
                                i13 = 43;
                            }
                            int i14 = i13 + StringTreeSet.MAX_SYMBOL_COUNT;
                            int i15 = 0;
                            if ((i4 & 16) != 0) {
                                i15 = 85;
                            }
                            i = i14 + i15;
                            int i16 = 0;
                            if ((i4 & 2) != 0) {
                                i16 = 43;
                            }
                            int i17 = i16 + StringTreeSet.MAX_SYMBOL_COUNT;
                            int i18 = 0;
                            if ((i4 & 32) != 0) {
                                i18 = 85;
                            }
                            i2 = i17 + i18;
                            if ((i4 & 4) == 0) {
                                i7 = 0;
                            }
                            i7 += StringTreeSet.MAX_SYMBOL_COUNT;
                        }
                        if ((i4 & 64) == 0) {
                            i8 = 0;
                        }
                    } else {
                        int i19 = 0;
                        if ((i4 & 1) != 0) {
                            i19 = 85;
                        }
                        int i20 = 0;
                        if ((i4 & 16) != 0) {
                            i20 = AbstractC62862SUj.MAX_FACTORIAL;
                        }
                        i = i19 + i20;
                        int i21 = 0;
                        if ((i4 & 2) != 0) {
                            i21 = 85;
                        }
                        int i22 = 0;
                        if ((i4 & 32) != 0) {
                            i22 = AbstractC62862SUj.MAX_FACTORIAL;
                        }
                        i2 = i21 + i22;
                        if ((i4 & 4) == 0) {
                            i8 = 0;
                        }
                        if ((i4 & 64) == 0) {
                            i7 = 0;
                        }
                        i5 = i8 + i7;
                        i3 = 2130706432;
                    }
                } else {
                    int i23 = 0;
                    if ((i4 & 1) != 0) {
                        i23 = 85;
                    }
                    int i24 = 0;
                    if ((i4 & 16) != 0) {
                        i24 = AbstractC62862SUj.MAX_FACTORIAL;
                    }
                    i = i23 + i24;
                    int i25 = 0;
                    if ((i4 & 2) != 0) {
                        i25 = 85;
                    }
                    int i26 = 0;
                    if ((i4 & 32) != 0) {
                        i26 = AbstractC62862SUj.MAX_FACTORIAL;
                    }
                    i2 = i25 + i26;
                    if ((i4 & 4) == 0) {
                        i8 = 0;
                    }
                    if ((i4 & 64) == 0) {
                        i7 = 0;
                    }
                }
                i5 = i8 + i7;
                i3 = -16777216;
            }
            iArr[i4] = i3 | (i << 16) | (i2 << 8) | i5;
            i4++;
        } while (i4 < 256);
        return iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0059. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.WFZ] */
    /* JADX WARN: Type inference failed for: r12v10, types: [X.VjE] */
    /* JADX WARN: Type inference failed for: r12v14, types: [X.VjF] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [com.google.common.collect.ImmutableList] */
    @Override // X.InterfaceC71939XBo
    public final void E3P(InterfaceC71874X8h interfaceC71874X8h, C70003VzN c70003VzN, byte[] bArr, int i, int i2) {
        List arrayList;
        int[] iArr;
        int i3;
        Paint paint;
        int[] iArr2;
        SparseArray sparseArray;
        int i4;
        C69429VnE c69429VnE;
        ?? r12;
        C69429VnE c69429VnE2;
        ?? r122;
        int i5;
        int i6;
        int i7;
        int i8;
        ?? obj = new Object();
        obj.A03 = bArr;
        obj.A01 = i2 + i;
        obj.A07(i);
        while (obj.A03() >= 48 && obj.A04(8) == 15) {
            C69416Vn0 c69416Vn0 = this.A06;
            int A04 = obj.A04(8);
            int A042 = obj.A04(16);
            int A043 = obj.A04(16);
            WDn.A02(AbstractC167007dF.A1N(obj.A00));
            int i9 = obj.A02 + A043;
            if (A043 * 8 > obj.A03()) {
                AbstractC63374Sil.A04("DvbParser", "Data field length exceeds limit");
                obj.A08(obj.A03());
            } else {
                switch (A04) {
                    case 16:
                        if (A042 == c69416Vn0.A03) {
                            C69038Vgf c69038Vgf = c69416Vn0.A01;
                            obj.A04(8);
                            int A044 = obj.A04(4);
                            int A045 = obj.A04(2);
                            obj.A08(2);
                            int i10 = A043 - 2;
                            SparseArray sparseArray2 = new SparseArray();
                            while (i10 > 0) {
                                int A046 = obj.A04(8);
                                obj.A08(8);
                                i10 -= 6;
                                sparseArray2.put(A046, new C68884Vdg(obj.A04(16), obj.A04(16)));
                            }
                            C69038Vgf c69038Vgf2 = new C69038Vgf(sparseArray2, A044, A045);
                            if (c69038Vgf2.A00 != 0) {
                                c69416Vn0.A01 = c69038Vgf2;
                                c69416Vn0.A08.clear();
                                c69416Vn0.A06.clear();
                                c69416Vn0.A07.clear();
                                break;
                            } else if (c69038Vgf != null && c69038Vgf.A01 != c69038Vgf2.A01) {
                                c69416Vn0.A01 = c69038Vgf2;
                                break;
                            }
                        }
                        break;
                    case 17:
                        C69038Vgf c69038Vgf3 = c69416Vn0.A01;
                        if (A042 == c69416Vn0.A03 && c69038Vgf3 != null) {
                            int A047 = obj.A04(8);
                            obj.A08(4);
                            boolean A0C = obj.A0C();
                            obj.A08(3);
                            int A048 = obj.A04(16);
                            int A049 = obj.A04(16);
                            obj.A04(3);
                            int A0410 = obj.A04(3);
                            obj.A08(2);
                            int A0411 = obj.A04(8);
                            int A0412 = obj.A04(8);
                            int A0413 = obj.A04(4);
                            int A0414 = obj.A04(2);
                            obj.A08(2);
                            int i11 = A043 - 10;
                            SparseArray sparseArray3 = new SparseArray();
                            while (i11 > 0) {
                                int A0415 = obj.A04(16);
                                int A0416 = obj.A04(2);
                                obj.A04(2);
                                int A0417 = obj.A04(12);
                                obj.A08(4);
                                int A0418 = obj.A04(12);
                                i11 -= 6;
                                if (A0416 == 1 || A0416 == 2) {
                                    obj.A04(8);
                                    obj.A04(8);
                                    i11 -= 2;
                                }
                                sparseArray3.put(A0415, new C68885Vdh(A0417, A0418));
                            }
                            C69429VnE c69429VnE3 = new C69429VnE(sparseArray3, A047, A048, A049, A0410, A0411, A0412, A0413, A0414, A0C);
                            if (c69038Vgf3.A00 == 0 && (c69429VnE = (C69429VnE) c69416Vn0.A08.get(c69429VnE3.A03)) != null) {
                                SparseArray sparseArray4 = c69429VnE.A08;
                                for (int i12 = 0; i12 < sparseArray4.size(); i12++) {
                                    AbstractC65702TsY.A10(sparseArray4, c69429VnE3.A08, i12);
                                }
                            }
                            sparseArray = c69416Vn0.A08;
                            i4 = c69429VnE3.A03;
                            c69429VnE2 = c69429VnE3;
                            sparseArray.put(i4, c69429VnE2);
                            break;
                        }
                        break;
                    case 18:
                        if (A042 == c69416Vn0.A03) {
                            C69185VjE A00 = A00(obj, A043);
                            sparseArray = c69416Vn0.A06;
                            r12 = A00;
                        } else if (A042 == c69416Vn0.A02) {
                            C69185VjE A002 = A00(obj, A043);
                            sparseArray = c69416Vn0.A04;
                            r12 = A002;
                        }
                        i4 = r12.A00;
                        c69429VnE2 = r12;
                        sparseArray.put(i4, c69429VnE2);
                        break;
                    case Process.SIGSTOP /* 19 */:
                        if (A042 == c69416Vn0.A03) {
                            C69186VjF A01 = A01(obj);
                            sparseArray = c69416Vn0.A07;
                            r122 = A01;
                        } else if (A042 == c69416Vn0.A02) {
                            C69186VjF A012 = A01(obj);
                            sparseArray = c69416Vn0.A05;
                            r122 = A012;
                        }
                        i4 = r122.A00;
                        c69429VnE2 = r122;
                        sparseArray.put(i4, c69429VnE2);
                        break;
                    case 20:
                        if (A042 == c69416Vn0.A03) {
                            obj.A08(4);
                            boolean A0C2 = obj.A0C();
                            obj.A08(3);
                            int A0419 = obj.A04(16);
                            int A0420 = obj.A04(16);
                            if (A0C2) {
                                i7 = obj.A04(16);
                                i5 = obj.A04(16);
                                i8 = obj.A04(16);
                                i6 = obj.A04(16);
                            } else {
                                i5 = A0419;
                                i6 = A0420;
                                i7 = 0;
                                i8 = 0;
                            }
                            c69416Vn0.A00 = new C69316VlO(A0419, A0420, i7, i5, i8, i6);
                            break;
                        }
                        break;
                }
                WDn.A02(AbstractC167007dF.A1N(obj.A00));
                obj.A09(i9 - obj.A02);
            }
        }
        C69416Vn0 c69416Vn02 = this.A06;
        C69038Vgf c69038Vgf4 = c69416Vn02.A01;
        if (c69038Vgf4 == null) {
            arrayList = ImmutableList.of();
        } else {
            C69316VlO c69316VlO = c69416Vn02.A00;
            if (c69316VlO == null) {
                c69316VlO = this.A05;
            }
            Bitmap bitmap = this.A00;
            if (bitmap == null || c69316VlO.A05 + 1 != bitmap.getWidth() || c69316VlO.A00 + 1 != this.A00.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(c69316VlO.A05 + 1, c69316VlO.A00 + 1, Bitmap.Config.ARGB_8888);
                this.A00 = createBitmap;
                this.A01.setBitmap(createBitmap);
            }
            arrayList = new ArrayList();
            SparseArray sparseArray5 = c69038Vgf4.A02;
            for (int i13 = 0; i13 < sparseArray5.size(); i13++) {
                Canvas canvas = this.A01;
                canvas.save();
                C68884Vdg c68884Vdg = (C68884Vdg) sparseArray5.valueAt(i13);
                C69429VnE c69429VnE4 = (C69429VnE) c69416Vn02.A08.get(sparseArray5.keyAt(i13));
                int i14 = c68884Vdg.A00 + c69316VlO.A02;
                int i15 = c68884Vdg.A01 + c69316VlO.A04;
                canvas.clipRect(i14, i15, Math.min(c69429VnE4.A07 + i14, c69316VlO.A01), Math.min(c69429VnE4.A02 + i15, c69316VlO.A03));
                C69185VjE c69185VjE = (C69185VjE) c69416Vn02.A06.get(c69429VnE4.A00);
                if (c69185VjE == null && (c69185VjE = (C69185VjE) c69416Vn02.A04.get(c69429VnE4.A00)) == null) {
                    c69185VjE = this.A04;
                }
                SparseArray sparseArray6 = c69429VnE4.A08;
                for (int i16 = 0; i16 < sparseArray6.size(); i16++) {
                    int keyAt = sparseArray6.keyAt(i16);
                    C68885Vdh c68885Vdh = (C68885Vdh) sparseArray6.valueAt(i16);
                    C69186VjF c69186VjF = (C69186VjF) c69416Vn02.A07.get(keyAt);
                    if (c69186VjF != null || (c69186VjF = (C69186VjF) c69416Vn02.A05.get(keyAt)) != null) {
                        if (c69186VjF.A01) {
                            paint = null;
                        } else {
                            paint = this.A02;
                        }
                        int i17 = c69429VnE4.A01;
                        int i18 = c68885Vdh.A00 + i14;
                        int i19 = i15 + c68885Vdh.A01;
                        if (i17 == 3) {
                            iArr2 = c69185VjE.A03;
                        } else if (i17 == 2) {
                            iArr2 = c69185VjE.A02;
                        } else {
                            iArr2 = c69185VjE.A01;
                        }
                        Paint paint2 = paint;
                        int[] iArr3 = iArr2;
                        A02(canvas, paint2, c69186VjF.A03, iArr3, i17, i18, i19);
                        A02(canvas, paint2, c69186VjF.A02, iArr3, i17, i18, i19 + 1);
                    }
                }
                if (c69429VnE4.A09) {
                    if (c69429VnE4.A01 == 3) {
                        iArr = c69185VjE.A03;
                        i3 = c69429VnE4.A06;
                    } else if (c69429VnE4.A01 == 2) {
                        iArr = c69185VjE.A02;
                        i3 = c69429VnE4.A05;
                    } else {
                        iArr = c69185VjE.A01;
                        i3 = c69429VnE4.A04;
                    }
                    int i20 = iArr[i3];
                    Paint paint3 = this.A03;
                    paint3.setColor(i20);
                    canvas.drawRect(i14, i15, c69429VnE4.A07 + i14, c69429VnE4.A02 + i15, paint3);
                }
                Bitmap bitmap2 = this.A00;
                int i21 = c69429VnE4.A07;
                int i22 = c69429VnE4.A02;
                C0fK.A03(bitmap2);
                Bitmap createBitmap2 = Bitmap.createBitmap(bitmap2, i14, i15, i21, i22);
                float f = i14;
                float f2 = c69316VlO.A05;
                float f3 = c69316VlO.A00;
                arrayList.add(new W5G(createBitmap2, null, null, null, i15 / f3, f / f2, -3.4028235E38f, i21 / f2, i22 / f3, 0.0f, 0, 0, 0, Integer.MIN_VALUE, Integer.MIN_VALUE));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
            }
        }
        interfaceC71874X8h.accept(new C69037Vge(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // X.InterfaceC71939XBo
    public final void reset() {
        C69416Vn0 c69416Vn0 = this.A06;
        c69416Vn0.A08.clear();
        c69416Vn0.A06.clear();
        c69416Vn0.A07.clear();
        c69416Vn0.A04.clear();
        c69416Vn0.A05.clear();
        c69416Vn0.A00 = null;
        c69416Vn0.A01 = null;
    }

    public WSW(List list) {
        char[] cArr = WFa.A04;
        WFa wFa = new WFa((byte[]) list.get(0));
        int A082 = wFa.A08();
        int A083 = wFa.A08();
        Paint paint = new Paint();
        this.A02 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        AbstractC166997dE.A1D(paint, PorterDuff.Mode.SRC);
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.A03 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        AbstractC166997dE.A1D(paint2, PorterDuff.Mode.DST_OVER);
        paint2.setPathEffect(null);
        this.A01 = new Canvas();
        this.A05 = new C69316VlO(719, 575, 0, 719, 0, 575);
        this.A04 = new C69185VjE(new int[]{0, -1, -16777216, -8421505}, A03(), A04(), 0);
        this.A06 = new C69416Vn0(A082, A083);
    }
}
