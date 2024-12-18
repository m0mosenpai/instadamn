package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexItem;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ttr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65776Ttr {
    public int[] A00;
    public long[] A01;
    public boolean[] A02;
    public long[] A03;
    public final InterfaceC87383uy A04;

    /* JADX WARN: Removed duplicated region for block: B:36:0x008d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C(int r13, int r14, int r15) {
        /*
            r12 = this;
            r5 = r12
            X.3uy r3 = r12.A04
            r4 = r3
            com.google.android.flexbox.FlexboxLayoutManager r4 = (com.google.android.flexbox.FlexboxLayoutManager) r4
            X.3F5 r0 = r4.A0E
            int r2 = r0.A00()
            boolean[] r1 = r12.A02
            if (r1 != 0) goto L7f
            r0 = 10
            if (r2 >= r0) goto L16
            r2 = 10
        L16:
            boolean[] r0 = new boolean[r2]
            r12.A02 = r0
        L1a:
            X.3F5 r0 = r4.A0E
            int r0 = r0.A00()
            if (r15 >= r0) goto L8d
            int r2 = r4.A02
            r1 = 1073741824(0x40000000, float:2.0)
            r7 = r13
            r8 = r14
            if (r2 == 0) goto L68
            r0 = 1
            if (r2 == r0) goto L68
            int r0 = android.view.View.MeasureSpec.getMode(r14)
            int r9 = android.view.View.MeasureSpec.getSize(r14)
            if (r0 == r1) goto L3b
            int r9 = r3.BLA()
        L3b:
            int r10 = r3.Bax()
            int r0 = r3.Bat()
        L43:
            int r10 = r10 + r0
            r3 = 0
            int[] r0 = r12.A00
            if (r0 == 0) goto L4b
            r3 = r0[r15]
        L4b:
            java.util.List r2 = r4.A0J
            int r1 = r2.size()
        L51:
            if (r3 >= r1) goto L8d
            java.lang.Object r6 = r2.get(r3)
            X.Tts r6 = (X.C65777Tts) r6
            int r0 = r6.A08
            r11 = 0
            if (r0 >= r9) goto L64
            r5.A06(r6, r7, r8, r9, r10, r11)
        L61:
            int r3 = r3 + 1
            goto L51
        L64:
            r5.A07(r6, r7, r8, r9, r10, r11)
            goto L61
        L68:
            int r0 = android.view.View.MeasureSpec.getMode(r13)
            int r9 = android.view.View.MeasureSpec.getSize(r13)
            if (r0 == r1) goto L76
            int r9 = r3.BLA()
        L76:
            int r10 = r3.Bau()
            int r0 = r3.Baw()
            goto L43
        L7f:
            int r0 = r1.length
            if (r0 >= r2) goto L88
            int r0 = r0 * 2
            if (r0 < r2) goto L16
            r2 = r0
            goto L16
        L88:
            r0 = 0
            java.util.Arrays.fill(r1, r0)
            goto L1a
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65776Ttr.A0C(int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int A00(FlexItem flexItem, int i) {
        InterfaceC87383uy interfaceC87383uy = this.A04;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) flexItem;
        AbstractC70663Fe abstractC70663Fe = (AbstractC70663Fe) interfaceC87383uy;
        int A0A = AbstractC70663Fe.A0A(abstractC70663Fe.A00, abstractC70663Fe.A01, interfaceC87383uy.Bax() + interfaceC87383uy.Bat() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i, ((ViewGroup.LayoutParams) flexItem).height, abstractC70663Fe.A1Y());
        int size = View.MeasureSpec.getSize(A0A);
        int BPo = flexItem.BPo();
        if (size > BPo || size < (BPo = flexItem.BTr())) {
            return View.MeasureSpec.makeMeasureSpec(BPo, View.MeasureSpec.getMode(A0A));
        }
        return A0A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int A01(FlexItem flexItem, int i) {
        InterfaceC87383uy interfaceC87383uy = this.A04;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) flexItem;
        AbstractC70663Fe abstractC70663Fe = (AbstractC70663Fe) interfaceC87383uy;
        int A0A = AbstractC70663Fe.A0A(abstractC70663Fe.A03, abstractC70663Fe.A04, interfaceC87383uy.Bau() + interfaceC87383uy.Baw() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i, ((ViewGroup.LayoutParams) flexItem).width, abstractC70663Fe.A1X());
        int size = View.MeasureSpec.getSize(A0A);
        int BQB = flexItem.BQB();
        if (size > BQB || size < (BQB = flexItem.BU3())) {
            return View.MeasureSpec.makeMeasureSpec(BQB, View.MeasureSpec.getMode(A0A));
        }
        return A0A;
    }

    private void A05(View view, int i, int i2, int i3) {
        long[] jArr = this.A01;
        if (jArr != null) {
            jArr[i] = (i2 & 4294967295L) | (i3 << 32);
        }
        long[] jArr2 = this.A03;
        if (jArr2 != null) {
            jArr2[i] = (view.getMeasuredWidth() & 4294967295L) | (view.getMeasuredHeight() << 32);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A06(C65777Tts c65777Tts, int i, int i2, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        double d;
        double d2;
        float f = c65777Tts.A00;
        if (f > 0.0f) {
            int i8 = c65777Tts.A08;
            if (i3 >= i8) {
                float f2 = (i3 - i8) / f;
                c65777Tts.A08 = i4 + c65777Tts.A03;
                if (!z) {
                    c65777Tts.A02 = Integer.MIN_VALUE;
                }
                boolean z2 = false;
                int i9 = 0;
                float f3 = 0.0f;
                for (int i10 = 0; i10 < c65777Tts.A06; i10++) {
                    int i11 = c65777Tts.A04 + i10;
                    InterfaceC87383uy interfaceC87383uy = this.A04;
                    View Bmv = interfaceC87383uy.Bmv(i11);
                    if (Bmv != null && Bmv.getVisibility() != 8) {
                        FlexItem flexItem = (FlexItem) Bmv.getLayoutParams();
                        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) interfaceC87383uy;
                        int i12 = flexboxLayoutManager.A02;
                        if (i12 != 0 && i12 != 1) {
                            int measuredHeight = Bmv.getMeasuredHeight();
                            long[] jArr = this.A03;
                            if (jArr != null) {
                                measuredHeight = (int) (jArr[i11] >> 32);
                            }
                            int measuredWidth = Bmv.getMeasuredWidth();
                            long[] jArr2 = this.A03;
                            if (jArr2 != null) {
                                measuredWidth = (int) jArr2[i11];
                            }
                            boolean[] zArr = this.A02;
                            if (!zArr[i11]) {
                                float B70 = flexItem.B70();
                                if (B70 > 0.0f) {
                                    float f4 = measuredHeight + (B70 * f2);
                                    if (i10 == c65777Tts.A06 - 1) {
                                        f4 += f3;
                                        f3 = 0.0f;
                                    }
                                    int round = Math.round(f4);
                                    int BPo = flexItem.BPo();
                                    if (round > BPo) {
                                        round = BPo;
                                        zArr[i11] = true;
                                        c65777Tts.A00 -= B70;
                                        z2 = true;
                                    } else {
                                        f3 += f4 - round;
                                        double d3 = f3;
                                        if (d3 > 1.0d) {
                                            round++;
                                            d2 = d3 - 1.0d;
                                        } else if (d3 < -1.0d) {
                                            round--;
                                            d2 = d3 + 1.0d;
                                        }
                                        f3 = (float) d2;
                                    }
                                    int A01 = A01(flexItem, c65777Tts.A0A);
                                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                                    Bmv.measure(A01, makeMeasureSpec);
                                    measuredWidth = Bmv.getMeasuredWidth();
                                    measuredHeight = Bmv.getMeasuredHeight();
                                    A05(Bmv, i11, A01, makeMeasureSpec);
                                    flexboxLayoutManager.A0A.put(i11, Bmv);
                                }
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) flexItem;
                            i9 = Math.max(i9, measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + interfaceC87383uy.Aw5(Bmv));
                            i5 = c65777Tts.A08;
                            i6 = measuredHeight + marginLayoutParams.topMargin;
                            i7 = marginLayoutParams.bottomMargin;
                        } else {
                            int measuredWidth2 = Bmv.getMeasuredWidth();
                            long[] jArr3 = this.A03;
                            if (jArr3 != null) {
                                measuredWidth2 = (int) jArr3[i11];
                            }
                            int measuredHeight2 = Bmv.getMeasuredHeight();
                            long[] jArr4 = this.A03;
                            if (jArr4 != null) {
                                measuredHeight2 = (int) (jArr4[i11] >> 32);
                            }
                            boolean[] zArr2 = this.A02;
                            if (!zArr2[i11]) {
                                float B702 = flexItem.B70();
                                if (B702 > 0.0f) {
                                    float f5 = measuredWidth2 + (B702 * f2);
                                    if (i10 == c65777Tts.A06 - 1) {
                                        f5 += f3;
                                        f3 = 0.0f;
                                    }
                                    int round2 = Math.round(f5);
                                    int BQB = flexItem.BQB();
                                    if (round2 > BQB) {
                                        round2 = BQB;
                                        zArr2[i11] = true;
                                        c65777Tts.A00 -= B702;
                                        z2 = true;
                                    } else {
                                        f3 += f5 - round2;
                                        double d4 = f3;
                                        if (d4 > 1.0d) {
                                            round2++;
                                            d = d4 - 1.0d;
                                        } else if (d4 < -1.0d) {
                                            round2--;
                                            d = d4 + 1.0d;
                                        }
                                        f3 = (float) d;
                                    }
                                    int A00 = A00(flexItem, c65777Tts.A0A);
                                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                                    Bmv.measure(makeMeasureSpec2, A00);
                                    measuredWidth2 = Bmv.getMeasuredWidth();
                                    measuredHeight2 = Bmv.getMeasuredHeight();
                                    A05(Bmv, i11, makeMeasureSpec2, A00);
                                    flexboxLayoutManager.A0A.put(i11, Bmv);
                                }
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) flexItem;
                            i9 = Math.max(i9, measuredHeight2 + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin + interfaceC87383uy.Aw5(Bmv));
                            i5 = c65777Tts.A08;
                            i6 = measuredWidth2 + marginLayoutParams2.leftMargin;
                            i7 = marginLayoutParams2.rightMargin;
                        }
                        c65777Tts.A08 = i5 + i6 + i7;
                        c65777Tts.A02 = Math.max(c65777Tts.A02, i9);
                    }
                }
                if (z2 && i8 != c65777Tts.A08) {
                    A06(c65777Tts, i, i2, i3, i4, true);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A07(C65777Tts c65777Tts, int i, int i2, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8 = c65777Tts.A08;
        float f = c65777Tts.A01;
        if (f > 0.0f && i3 <= i8) {
            float f2 = (i8 - i3) / f;
            c65777Tts.A08 = i4 + c65777Tts.A03;
            if (!z) {
                c65777Tts.A02 = Integer.MIN_VALUE;
            }
            boolean z2 = false;
            int i9 = 0;
            float f3 = 0.0f;
            for (int i10 = 0; i10 < c65777Tts.A06; i10++) {
                int i11 = c65777Tts.A04 + i10;
                InterfaceC87383uy interfaceC87383uy = this.A04;
                View Bmv = interfaceC87383uy.Bmv(i11);
                if (Bmv != null && Bmv.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) Bmv.getLayoutParams();
                    FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) interfaceC87383uy;
                    int i12 = flexboxLayoutManager.A02;
                    if (i12 != 0 && i12 != 1) {
                        int measuredHeight = Bmv.getMeasuredHeight();
                        long[] jArr = this.A03;
                        if (jArr != null) {
                            measuredHeight = (int) (jArr[i11] >> 32);
                        }
                        int measuredWidth = Bmv.getMeasuredWidth();
                        long[] jArr2 = this.A03;
                        if (jArr2 != null) {
                            measuredWidth = (int) jArr2[i11];
                        }
                        boolean[] zArr = this.A02;
                        if (!zArr[i11]) {
                            float B71 = flexItem.B71();
                            if (B71 > 0.0f) {
                                float f4 = measuredHeight - (B71 * f2);
                                if (i10 == c65777Tts.A06 - 1) {
                                    f4 += f3;
                                    f3 = 0.0f;
                                }
                                int round = Math.round(f4);
                                int BTr = flexItem.BTr();
                                if (round < BTr) {
                                    round = BTr;
                                    zArr[i11] = true;
                                    c65777Tts.A01 -= B71;
                                    z2 = true;
                                } else {
                                    f3 += f4 - round;
                                    double d = f3;
                                    if (d > 1.0d) {
                                        round++;
                                        f3 -= 1.0f;
                                    } else if (d < -1.0d) {
                                        round--;
                                        f3 += 1.0f;
                                    }
                                }
                                int A01 = A01(flexItem, c65777Tts.A0A);
                                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                                Bmv.measure(A01, makeMeasureSpec);
                                measuredWidth = Bmv.getMeasuredWidth();
                                measuredHeight = Bmv.getMeasuredHeight();
                                A05(Bmv, i11, A01, makeMeasureSpec);
                                flexboxLayoutManager.A0A.put(i11, Bmv);
                            }
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) flexItem;
                        i9 = Math.max(i9, measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + interfaceC87383uy.Aw5(Bmv));
                        i5 = c65777Tts.A08;
                        i6 = measuredHeight + marginLayoutParams.topMargin;
                        i7 = marginLayoutParams.bottomMargin;
                    } else {
                        int measuredWidth2 = Bmv.getMeasuredWidth();
                        long[] jArr3 = this.A03;
                        if (jArr3 != null) {
                            measuredWidth2 = (int) jArr3[i11];
                        }
                        int measuredHeight2 = Bmv.getMeasuredHeight();
                        long[] jArr4 = this.A03;
                        if (jArr4 != null) {
                            measuredHeight2 = (int) (jArr4[i11] >> 32);
                        }
                        boolean[] zArr2 = this.A02;
                        if (!zArr2[i11]) {
                            float B712 = flexItem.B71();
                            if (B712 > 0.0f) {
                                float f5 = measuredWidth2 - (B712 * f2);
                                if (i10 == c65777Tts.A06 - 1) {
                                    f5 += f3;
                                    f3 = 0.0f;
                                }
                                int round2 = Math.round(f5);
                                int BU3 = flexItem.BU3();
                                if (round2 < BU3) {
                                    round2 = BU3;
                                    zArr2[i11] = true;
                                    c65777Tts.A01 -= B712;
                                    z2 = true;
                                } else {
                                    f3 += f5 - round2;
                                    double d2 = f3;
                                    if (d2 > 1.0d) {
                                        round2++;
                                        f3 -= 1.0f;
                                    } else if (d2 < -1.0d) {
                                        round2--;
                                        f3 += 1.0f;
                                    }
                                }
                                int A00 = A00(flexItem, c65777Tts.A0A);
                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                                Bmv.measure(makeMeasureSpec2, A00);
                                measuredWidth2 = Bmv.getMeasuredWidth();
                                measuredHeight2 = Bmv.getMeasuredHeight();
                                A05(Bmv, i11, makeMeasureSpec2, A00);
                                flexboxLayoutManager.A0A.put(i11, Bmv);
                            }
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) flexItem;
                        i9 = Math.max(i9, measuredHeight2 + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin + interfaceC87383uy.Aw5(Bmv));
                        i5 = c65777Tts.A08;
                        i6 = measuredWidth2 + marginLayoutParams2.leftMargin;
                        i7 = marginLayoutParams2.rightMargin;
                    }
                    c65777Tts.A08 = i5 + i6 + i7;
                    c65777Tts.A02 = Math.max(c65777Tts.A02, i9);
                }
            }
            if (z2 && i8 != c65777Tts.A08) {
                A07(c65777Tts, i, i2, i3, i4, true);
            }
        }
    }

    public final void A08(int i) {
        int[] copyOf;
        int[] iArr = this.A00;
        if (iArr == null) {
            if (i < 10) {
                i = 10;
            }
            copyOf = new int[i];
        } else {
            int length = iArr.length;
            if (length >= i) {
                return;
            }
            int i2 = length * 2;
            if (i2 >= i) {
                i = i2;
            }
            copyOf = Arrays.copyOf(iArr, i);
        }
        this.A00 = copyOf;
    }

    public final void A09(int i) {
        long[] copyOf;
        long[] jArr = this.A01;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            copyOf = new long[i];
        } else {
            int length = jArr.length;
            if (length >= i) {
                return;
            }
            int i2 = length * 2;
            if (i2 >= i) {
                i = i2;
            }
            copyOf = Arrays.copyOf(jArr, i);
        }
        this.A01 = copyOf;
    }

    public final void A0A(int i) {
        long[] copyOf;
        long[] jArr = this.A03;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            copyOf = new long[i];
        } else {
            int length = jArr.length;
            if (length >= i) {
                return;
            }
            int i2 = length * 2;
            if (i2 >= i) {
                i = i2;
            }
            copyOf = Arrays.copyOf(jArr, i);
        }
        this.A03 = copyOf;
    }

    public final void A0B(int i) {
        int i2;
        View Bmv;
        InterfaceC87383uy interfaceC87383uy = this.A04;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) interfaceC87383uy;
        if (i < flexboxLayoutManager.A0E.A00()) {
            int i3 = flexboxLayoutManager.A02;
            if (flexboxLayoutManager.A00 == 4) {
                int[] iArr = this.A00;
                if (iArr != null) {
                    i2 = iArr[i];
                } else {
                    i2 = 0;
                }
                List list = flexboxLayoutManager.A0J;
                int size = list.size();
                while (i2 < size) {
                    C65777Tts c65777Tts = (C65777Tts) list.get(i2);
                    int i4 = c65777Tts.A06;
                    for (int i5 = 0; i5 < i4; i5++) {
                        int i6 = c65777Tts.A04 + i5;
                        if (i5 < flexboxLayoutManager.A0E.A00() && (Bmv = interfaceC87383uy.Bmv(i6)) != null && Bmv.getVisibility() != 8) {
                            FlexItem flexItem = (FlexItem) Bmv.getLayoutParams();
                            if (flexItem.Aaq() == -1 || flexItem.Aaq() == 4) {
                                if (i3 != 0 && i3 != 1) {
                                    A03(Bmv, c65777Tts.A02, i6);
                                } else {
                                    A04(Bmv, c65777Tts.A02, i6);
                                }
                            }
                        }
                    }
                    i2++;
                }
                return;
            }
            for (C65777Tts c65777Tts2 : flexboxLayoutManager.A0J) {
                Iterator it = c65777Tts2.A0B.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    View Bmv2 = interfaceC87383uy.Bmv(intValue);
                    if (i3 != 0 && i3 != 1) {
                        A03(Bmv2, c65777Tts2.A02, intValue);
                    } else {
                        A04(Bmv2, c65777Tts2.A02, intValue);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0274, code lost:
    
        if (r23 < (r2 + r3)) goto L115;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0F(X.C68705Vah r29, java.util.List r30, int r31, int r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 925
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65776Ttr.A0F(X.Vah, java.util.List, int, int, int, int):void");
    }

    public final void A0G(List list, int i) {
        int i2 = this.A00[i];
        if (i2 == -1) {
            i2 = 0;
        }
        for (int size = list.size() - 1; size >= i2; size--) {
            list.remove(size);
        }
        int[] iArr = this.A00;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.A01;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    public C65776Ttr(InterfaceC87383uy interfaceC87383uy) {
        this.A04 = interfaceC87383uy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r3 > r0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02(android.view.View r6, int r7) {
        /*
            r5 = this;
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            com.google.android.flexbox.FlexItem r4 = (com.google.android.flexbox.FlexItem) r4
            int r3 = r6.getMeasuredWidth()
            int r2 = r6.getMeasuredHeight()
            int r0 = r4.BU3()
            if (r3 < r0) goto L1b
            int r0 = r4.BQB()
            r1 = 0
            if (r3 <= r0) goto L1d
        L1b:
            r3 = r0
            r1 = 1
        L1d:
            int r0 = r4.BTr()
            if (r2 < r0) goto L45
            int r0 = r4.BPo()
            if (r2 > r0) goto L45
            if (r1 == 0) goto L44
        L2b:
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r6.measure(r1, r0)
            r5.A05(r6, r7, r1, r0)
            X.3uy r0 = r5.A04
            com.google.android.flexbox.FlexboxLayoutManager r0 = (com.google.android.flexbox.FlexboxLayoutManager) r0
            android.util.SparseArray r0 = r0.A0A
            r0.put(r7, r6)
        L44:
            return
        L45:
            r2 = r0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65776Ttr.A02(android.view.View, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A03(View view, int i, int i2) {
        int measuredHeight;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) flexItem;
        int i3 = (i - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        InterfaceC87383uy interfaceC87383uy = this.A04;
        int min = Math.min(Math.max(i3 - interfaceC87383uy.Aw5(view), flexItem.BU3()), flexItem.BQB());
        long[] jArr = this.A03;
        if (jArr != null) {
            measuredHeight = (int) (jArr[i2] >> 32);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        A05(view, i2, makeMeasureSpec2, makeMeasureSpec);
        ((FlexboxLayoutManager) interfaceC87383uy).A0A.put(i2, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A04(View view, int i, int i2) {
        int measuredWidth;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) flexItem;
        int i3 = (i - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
        InterfaceC87383uy interfaceC87383uy = this.A04;
        int min = Math.min(Math.max(i3 - interfaceC87383uy.Aw5(view), flexItem.BTr()), flexItem.BPo());
        long[] jArr = this.A03;
        if (jArr != null) {
            measuredWidth = (int) jArr[i2];
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        A05(view, i2, makeMeasureSpec, makeMeasureSpec2);
        ((FlexboxLayoutManager) interfaceC87383uy).A0A.put(i2, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0D(View view, C65777Tts c65777Tts, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int i8 = ((FlexboxLayoutManager) this.A04).A00;
        int Aaq = flexItem.Aaq();
        if (Aaq != -1) {
            i8 = Aaq;
        }
        int i9 = c65777Tts.A02;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 != 4) {
                            return;
                        }
                    } else {
                        i5 = Math.max(c65777Tts.A09 - view.getBaseline(), ((ViewGroup.MarginLayoutParams) flexItem).topMargin);
                        i7 = i2 + i5;
                        i6 = i4 + i5;
                    }
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) flexItem;
                    i7 = i2 + ((((i9 - view.getMeasuredHeight()) + marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin) / 2);
                    i6 = view.getMeasuredHeight() + i7;
                }
            } else {
                int i10 = i2 + i9;
                int measuredHeight = i10 - view.getMeasuredHeight();
                int i11 = ((ViewGroup.MarginLayoutParams) flexItem).bottomMargin;
                i7 = measuredHeight - i11;
                i6 = i10 - i11;
            }
            view.layout(i, i7, i3, i6);
        }
        i5 = ((ViewGroup.MarginLayoutParams) flexItem).topMargin;
        i7 = i2 + i5;
        i6 = i4 + i5;
        view.layout(i, i7, i3, i6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0E(View view, C65777Tts c65777Tts, int i, int i2, int i3, int i4, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i5;
        int i6;
        int i7;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int i8 = ((FlexboxLayoutManager) this.A04).A00;
        int Aaq = flexItem.Aaq();
        if (Aaq != -1) {
            i8 = Aaq;
        }
        int i9 = c65777Tts.A02;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3 && i8 != 4) {
                        return;
                    }
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    i6 = (((i9 - view.getMeasuredWidth()) + marginLayoutParams2.getMarginStart()) - marginLayoutParams2.getMarginEnd()) / 2;
                    i5 = i - i6;
                    if (!z) {
                        i5 = i + i6;
                        i7 = i3 + i6;
                        view.layout(i5, i2, i7, i4);
                    }
                    i7 = i3 - i6;
                    view.layout(i5, i2, i7, i4);
                }
            } else {
                if (!z) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) flexItem;
                    i5 = ((i + i9) - view.getMeasuredWidth()) - marginLayoutParams.rightMargin;
                    i3 = (i3 + i9) - view.getMeasuredWidth();
                    i6 = marginLayoutParams.rightMargin;
                    i7 = i3 - i6;
                    view.layout(i5, i2, i7, i4);
                }
                marginLayoutParams = (ViewGroup.MarginLayoutParams) flexItem;
                i5 = (i - i9) + view.getMeasuredWidth() + marginLayoutParams.leftMargin;
                i3 = (i3 - i9) + view.getMeasuredWidth();
                i6 = marginLayoutParams.leftMargin;
                i7 = i3 + i6;
                view.layout(i5, i2, i7, i4);
            }
        }
        marginLayoutParams = (ViewGroup.MarginLayoutParams) flexItem;
        if (!z) {
            i5 = i + marginLayoutParams.leftMargin;
            i6 = marginLayoutParams.leftMargin;
            i7 = i3 + i6;
            view.layout(i5, i2, i7, i4);
        }
        i5 = i - marginLayoutParams.rightMargin;
        i6 = marginLayoutParams.rightMargin;
        i7 = i3 - i6;
        view.layout(i5, i2, i7, i4);
    }
}
