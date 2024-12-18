package androidx.recyclerview.widget;

import X.AbstractC154146wP;
import X.AbstractC63123SdR;
import X.AbstractC70663Fe;
import X.AbstractC70763Fo;
import X.AnonymousClass001;
import X.C0f9;
import X.C154496wz;
import X.C3F5;
import X.C3FM;
import X.C3H6;
import X.C3OO;
import X.C3OP;
import X.C70593Ew;
import X.C70743Fm;
import X.C70753Fn;
import X.C72203Lt;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public int A00;
    public AbstractC154146wP A01;
    public boolean A02;
    public boolean A03;
    public int[] A04;
    public View[] A05;
    public final Rect A06;
    public final SparseIntArray A07;
    public final SparseIntArray A08;

    public static int A03(GridLayoutManager gridLayoutManager, C70593Ew c70593Ew, C3F5 c3f5, int i) {
        if (!c3f5.A08) {
            return gridLayoutManager.A01.A02(i, gridLayoutManager.A00);
        }
        int A03 = c70593Ew.A03(i);
        if (A03 == -1) {
            Log.w("GridLayoutManager", AnonymousClass001.A0O("Cannot find span size for pre layout position. ", i));
            return 0;
        }
        return gridLayoutManager.A01.A02(A03, gridLayoutManager.A00);
    }

    private int A08(C70593Ew c70593Ew, C3F5 c3f5, int i) {
        if (!c3f5.A08) {
            AbstractC154146wP abstractC154146wP = this.A01;
            int i2 = this.A00;
            if (!abstractC154146wP.A00) {
                return abstractC154146wP.A01(i, i2);
            }
            SparseIntArray sparseIntArray = abstractC154146wP.A02;
            int i3 = sparseIntArray.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int A01 = abstractC154146wP.A01(i, i2);
            sparseIntArray.put(i, A01);
            return A01;
        }
        int i4 = this.A07.get(i, -1);
        if (i4 != -1) {
            return i4;
        }
        int A03 = c70593Ew.A03(i);
        if (A03 == -1) {
            Log.w("GridLayoutManager", AnonymousClass001.A0O("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i));
            return 0;
        }
        AbstractC154146wP abstractC154146wP2 = this.A01;
        int i5 = this.A00;
        if (!abstractC154146wP2.A00) {
            return abstractC154146wP2.A01(A03, i5);
        }
        SparseIntArray sparseIntArray2 = abstractC154146wP2.A02;
        int i6 = sparseIntArray2.get(A03, -1);
        if (i6 != -1) {
            return i6;
        }
        int A012 = abstractC154146wP2.A01(A03, i5);
        sparseIntArray2.put(A03, A012);
        return A012;
    }

    private int A0I(C70593Ew c70593Ew, C3F5 c3f5, int i) {
        if (!c3f5.A08) {
            return this.A01.A03(i);
        }
        int i2 = this.A08.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int A03 = c70593Ew.A03(i);
        if (A03 == -1) {
            Log.w("GridLayoutManager", AnonymousClass001.A0O("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i));
            return 1;
        }
        return this.A01.A03(A03);
    }

    private void A0J() {
        View[] viewArr = this.A05;
        if (viewArr == null || viewArr.length != this.A00) {
            this.A05 = new View[this.A00];
        }
    }

    private void A0K() {
        int Bat;
        int Bax;
        if (((LinearLayoutManager) this).A01 == 1) {
            Bat = ((AbstractC70663Fe) this).A03 - Baw();
            Bax = Bau();
        } else {
            Bat = ((AbstractC70663Fe) this).A00 - Bat();
            Bax = Bax();
        }
        A0L(Bat - Bax);
    }

    private void A0L(int i) {
        int i2;
        int length;
        int[] iArr = this.A04;
        int i3 = this.A00;
        if (iArr == null || (length = iArr.length) != i3 + 1 || iArr[length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 > 0 && i3 - i4 < i6) {
                i2 = i5 + 1;
                i4 -= i3;
            } else {
                i2 = i5;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.A04 = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (A1u() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e9, code lost:
    
        if (r4 <= r17) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00eb, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ec, code lost:
    
        if (r5 != r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ff, code lost:
    
        if (r4 > r16) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View A1E(android.view.View r25, X.C70593Ew r26, X.C3F5 r27, int r28) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.A1E(android.view.View, X.3Ew, X.3F5, int):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.3OP, X.6wz] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // X.AbstractC70663Fe
    public C3OP A1F(ViewGroup.LayoutParams layoutParams) {
        ?? r1;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            r1 = new C3OP((ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            r1 = new C3OP(layoutParams);
        }
        r1.A00 = -1;
        r1.A01 = 0;
        return r1;
    }

    @Override // X.AbstractC70663Fe
    public final void A1G(Rect rect, int i, int i2) {
        int A09;
        int A092;
        if (this.A04 == null) {
            super.A1G(rect, i, i2);
        }
        int Bau = Bau() + Baw();
        int Bax = Bax() + Bat();
        if (((LinearLayoutManager) this).A01 == 1) {
            A092 = AbstractC70663Fe.A09(i2, rect.height() + Bax, ((AbstractC70663Fe) this).A07.getMinimumHeight());
            int[] iArr = this.A04;
            A09 = AbstractC70663Fe.A09(i, iArr[iArr.length - 1] + Bau, ((AbstractC70663Fe) this).A07.getMinimumWidth());
        } else {
            A09 = AbstractC70663Fe.A09(i, rect.width() + Bau, ((AbstractC70663Fe) this).A07.getMinimumWidth());
            int[] iArr2 = this.A04;
            A092 = AbstractC70663Fe.A09(i2, iArr2[iArr2.length - 1] + Bax, ((AbstractC70663Fe) this).A07.getMinimumHeight());
        }
        ((AbstractC70663Fe) this).A07.setMeasuredDimension(A09, A092);
    }

    @Override // X.AbstractC70663Fe
    public final void A1I(RecyclerView recyclerView) {
        this.A01.A02.clear();
        this.A01.A01.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public boolean A1J() {
        if (((LinearLayoutManager) this).A05 == null && !this.A02) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.3OP, X.6wz] */
    @Override // X.AbstractC70663Fe
    public final C3OP A1N(Context context, AttributeSet attributeSet) {
        ?? c3op = new C3OP(context, attributeSet);
        c3op.A00 = -1;
        c3op.A01 = 0;
        return c3op;
    }

    @Override // X.AbstractC70663Fe
    public final void A1V(RecyclerView recyclerView, int i, int i2) {
        this.A01.A02.clear();
        this.A01.A01.clear();
    }

    @Override // X.AbstractC70663Fe
    public final void A1W(RecyclerView recyclerView, int i, int i2) {
        this.A01.A02.clear();
        this.A01.A01.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A1r(C70753Fn c70753Fn, C72203Lt c72203Lt, C70593Ew c70593Ew, C3F5 c3f5) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int makeMeasureSpec;
        int A0A;
        int i7;
        View A00;
        AbstractC70763Fo abstractC70763Fo = ((LinearLayoutManager) this).A06;
        if (abstractC70763Fo instanceof C3H6) {
            i = abstractC70763Fo.A02.A04;
        } else {
            i = abstractC70763Fo.A02.A01;
        }
        int i8 = 0;
        boolean z = false;
        if (i != 1073741824) {
            z = true;
        }
        if (A0T() > 0) {
            i2 = this.A04[this.A00];
        } else {
            i2 = 0;
        }
        if (z) {
            A0K();
        }
        boolean z2 = false;
        if (c72203Lt.A03 == 1) {
            z2 = true;
        }
        int i9 = this.A00;
        if (!z2) {
            i9 = A08(c70593Ew, c3f5, c72203Lt.A01) + A0I(c70593Ew, c3f5, c72203Lt.A01);
        }
        int i10 = 0;
        while (i10 < this.A00 && (i7 = c72203Lt.A01) >= 0 && i7 < c3f5.A00() && i9 > 0) {
            int A0I = A0I(c70593Ew, c3f5, i7);
            int i11 = this.A00;
            if (A0I <= i11) {
                i9 -= A0I;
                if (i9 < 0 || (A00 = c72203Lt.A00(c70593Ew)) == null) {
                    break;
                }
                this.A05[i10] = A00;
                i10++;
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A0z("Item at position ", " requires ", " spans but GridLayoutManager has only ", " spans.", i7, A0I, i11));
            }
        }
        if (i10 == 0) {
            c70753Fn.A01 = true;
            return;
        }
        float f = 0.0f;
        int i12 = 0;
        int i13 = -1;
        int i14 = i10 - 1;
        int i15 = -1;
        if (z2) {
            i13 = i10;
            i15 = 1;
            View view = this.A05[0];
            C154496wz c154496wz = (C154496wz) view.getLayoutParams();
            int A0I2 = A0I(c70593Ew, c3f5, AbstractC70663Fe.A0C(view));
            c154496wz.A01 = A0I2;
            c154496wz.A00 = 0;
            i12 = 0 + A0I2;
            i14 = 0 + 1;
        }
        while (i14 != i13) {
            View view2 = this.A05[i14];
            C154496wz c154496wz2 = (C154496wz) view2.getLayoutParams();
            int A0I3 = A0I(c70593Ew, c3f5, AbstractC70663Fe.A0C(view2));
            c154496wz2.A01 = A0I3;
            c154496wz2.A00 = i12;
            i12 += A0I3;
            i14 += i15;
        }
        int i16 = 0;
        for (int i17 = 0; i17 < i10; i17++) {
            View view3 = this.A05[i17];
            if (c72203Lt.A09 == null) {
                if (z2) {
                    A0o(view3, -1);
                } else {
                    A0o(view3, 0);
                }
            } else if (z2) {
                AbstractC70663Fe.A0G(view3, this, -1, true);
            } else {
                AbstractC70663Fe.A0G(view3, this, 0, true);
            }
            A0r(view3, this.A06);
            A0N(view3, i, false);
            int A0B = ((LinearLayoutManager) this).A06.A0B(view3);
            if (A0B > i16) {
                i16 = A0B;
            }
            float A0C = (((LinearLayoutManager) this).A06.A0C(view3) * 1.0f) / ((C154496wz) view3.getLayoutParams()).A01;
            if (A0C > f) {
                f = A0C;
            }
        }
        if (z) {
            A0L(Math.max(Math.round(f * this.A00), i2));
            i16 = 0;
            for (int i18 = 0; i18 < i10; i18++) {
                View view4 = this.A05[i18];
                A0N(view4, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO, true);
                int A0B2 = ((LinearLayoutManager) this).A06.A0B(view4);
                if (A0B2 > i16) {
                    i16 = A0B2;
                }
            }
        }
        for (int i19 = 0; i19 < i10; i19++) {
            View view5 = this.A05[i19];
            if (((LinearLayoutManager) this).A06.A0B(view5) != i16) {
                C154496wz c154496wz3 = (C154496wz) view5.getLayoutParams();
                Rect rect = c154496wz3.A02;
                int i20 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c154496wz3).topMargin + ((ViewGroup.MarginLayoutParams) c154496wz3).bottomMargin;
                int i21 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c154496wz3).leftMargin + ((ViewGroup.MarginLayoutParams) c154496wz3).rightMargin;
                int i22 = c154496wz3.A00;
                int i23 = c154496wz3.A01;
                if (((LinearLayoutManager) this).A01 == 1 && A1u()) {
                    int[] iArr = this.A04;
                    int i24 = this.A00 - i22;
                    i6 = iArr[i24] - iArr[i24 - i23];
                } else {
                    int[] iArr2 = this.A04;
                    i6 = iArr2[i23 + i22] - iArr2[i22];
                }
                if (((LinearLayoutManager) this).A01 == 1) {
                    makeMeasureSpec = AbstractC70663Fe.A0A(i6, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO, i21, ((ViewGroup.LayoutParams) c154496wz3).width, false);
                    A0A = View.MeasureSpec.makeMeasureSpec(i16 - i20, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                    A0A = AbstractC70663Fe.A0A(i6, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO, i20, ((ViewGroup.LayoutParams) c154496wz3).height, false);
                }
                A0M(view5, makeMeasureSpec, A0A, true);
            }
        }
        int i25 = 0;
        c70753Fn.A00 = i16;
        int i26 = ((LinearLayoutManager) this).A01;
        int i27 = c72203Lt.A05;
        if (i26 == 1) {
            i5 = c72203Lt.A07;
            i8 = i5 - i16;
            if (i27 != -1) {
                i8 = i5;
                i5 = i16 + i5;
            }
            i3 = 0;
            i4 = 0;
        } else {
            int i28 = c72203Lt.A07;
            i3 = i16 + i28;
            i4 = i28;
            if (i27 == -1) {
                i4 = i28 - i16;
                i3 = i28;
            }
            i5 = 0;
        }
        while (true) {
            View[] viewArr = this.A05;
            if (i25 < i10) {
                View view6 = viewArr[i25];
                C154496wz c154496wz4 = (C154496wz) view6.getLayoutParams();
                if (((LinearLayoutManager) this).A01 == 1) {
                    boolean A1u = A1u();
                    int Bau = Bau();
                    int[] iArr3 = this.A04;
                    if (A1u) {
                        i3 = Bau + iArr3[this.A00 - c154496wz4.A00];
                        i4 = i3 - ((LinearLayoutManager) this).A06.A0C(view6);
                    } else {
                        int i29 = Bau + iArr3[c154496wz4.A00];
                        i4 = i29;
                        i3 = ((LinearLayoutManager) this).A06.A0C(view6) + i29;
                    }
                } else {
                    i8 = Bax() + this.A04[c154496wz4.A00];
                    i5 = ((LinearLayoutManager) this).A06.A0C(view6) + i8;
                }
                AbstractC70663Fe.A0F(view6, i4, i8, i3, i5);
                C3OO c3oo = c154496wz4.mViewHolder;
                if (c3oo.isRemoved() || c3oo.isUpdated()) {
                    c70753Fn.A03 = true;
                }
                c70753Fn.A02 |= view6.hasFocusable();
                i25++;
            } else {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A1t(boolean z) {
        if (!z) {
            super.A1t(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final void A1v(int i) {
        if (i != this.A00) {
            this.A02 = true;
            if (i >= 1) {
                this.A00 = i;
                this.A01.A02.clear();
                A0i();
                return;
            }
            throw new IllegalArgumentException(AnonymousClass001.A0O("Span count should be at least 1. Provided ", i));
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A02 = false;
        this.A00 = -1;
        this.A08 = new SparseIntArray();
        this.A07 = new SparseIntArray();
        this.A01 = new AbstractC154146wP() { // from class: X.6wO
        };
        this.A06 = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3FM.A00, i, i2);
        obtainStyledAttributes.getInt(0, 1);
        int i3 = obtainStyledAttributes.getInt(10, 1);
        obtainStyledAttributes.getBoolean(9, false);
        obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        A1v(i3);
    }

    public static int A04(GridLayoutManager gridLayoutManager, C3F5 c3f5) {
        int max;
        if (gridLayoutManager.A0T() == 0 || c3f5.A00() == 0) {
            return 0;
        }
        gridLayoutManager.A1n();
        boolean z = ((LinearLayoutManager) gridLayoutManager).A0A;
        boolean z2 = !z;
        View A1m = gridLayoutManager.A1m(z2);
        View A1l = gridLayoutManager.A1l(z2);
        if (A1m == null || A1l == null) {
            return 0;
        }
        int A02 = gridLayoutManager.A01.A02(AbstractC70663Fe.A0C(A1m), gridLayoutManager.A00);
        int A022 = gridLayoutManager.A01.A02(AbstractC70663Fe.A0C(A1l), gridLayoutManager.A00);
        int min = Math.min(A02, A022);
        int max2 = Math.max(A02, A022);
        int A023 = gridLayoutManager.A01.A02(c3f5.A00() - 1, gridLayoutManager.A00) + 1;
        if (((LinearLayoutManager) gridLayoutManager).A09) {
            max = Math.max(0, (A023 - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (z) {
            return Math.round((max * (Math.abs(((LinearLayoutManager) gridLayoutManager).A06.A08(A1l) - ((LinearLayoutManager) gridLayoutManager).A06.A0D(A1m)) / ((gridLayoutManager.A01.A02(AbstractC70663Fe.A0C(A1l), gridLayoutManager.A00) - gridLayoutManager.A01.A02(AbstractC70663Fe.A0C(A1m), gridLayoutManager.A00)) + 1))) + (((LinearLayoutManager) gridLayoutManager).A06.A06() - ((LinearLayoutManager) gridLayoutManager).A06.A0D(A1m)));
        }
        return max;
    }

    public static int A05(GridLayoutManager gridLayoutManager, C3F5 c3f5) {
        if (gridLayoutManager.A0T() == 0 || c3f5.A00() == 0) {
            return 0;
        }
        gridLayoutManager.A1n();
        boolean z = ((LinearLayoutManager) gridLayoutManager).A0A;
        boolean z2 = !z;
        View A1m = gridLayoutManager.A1m(z2);
        View A1l = gridLayoutManager.A1l(z2);
        if (A1m == null || A1l == null) {
            return 0;
        }
        if (!z) {
            return gridLayoutManager.A01.A02(c3f5.A00() - 1, gridLayoutManager.A00) + 1;
        }
        int A08 = ((LinearLayoutManager) gridLayoutManager).A06.A08(A1l) - ((LinearLayoutManager) gridLayoutManager).A06.A0D(A1m);
        int A02 = gridLayoutManager.A01.A02(AbstractC70663Fe.A0C(A1m), gridLayoutManager.A00);
        return (int) ((A08 / ((gridLayoutManager.A01.A02(AbstractC70663Fe.A0C(A1l), gridLayoutManager.A00) - A02) + 1)) * (gridLayoutManager.A01.A02(c3f5.A00() - 1, gridLayoutManager.A00) + 1));
    }

    private void A0M(View view, int i, int i2, boolean z) {
        C3OP c3op = (C3OP) view.getLayoutParams();
        if (z) {
            if (((AbstractC70663Fe) this).A0D && AbstractC70663Fe.A0H(view.getMeasuredWidth(), i, ((ViewGroup.LayoutParams) c3op).width) && AbstractC70663Fe.A0H(view.getMeasuredHeight(), i2, ((ViewGroup.LayoutParams) c3op).height)) {
                return;
            }
        } else if (!A18(view, c3op, i, i2)) {
            return;
        }
        view.measure(i, i2);
    }

    private void A0N(View view, int i, boolean z) {
        int i2;
        int A0A;
        int A0A2;
        C154496wz c154496wz = (C154496wz) view.getLayoutParams();
        Rect rect = c154496wz.A02;
        int i3 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c154496wz).topMargin + ((ViewGroup.MarginLayoutParams) c154496wz).bottomMargin;
        int i4 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c154496wz).leftMargin + ((ViewGroup.MarginLayoutParams) c154496wz).rightMargin;
        int i5 = c154496wz.A00;
        int i6 = c154496wz.A01;
        if (((LinearLayoutManager) this).A01 == 1 && A1u()) {
            int[] iArr = this.A04;
            int i7 = this.A00 - i5;
            i2 = iArr[i7] - iArr[i7 - i6];
        } else {
            int[] iArr2 = this.A04;
            i2 = iArr2[i6 + i5] - iArr2[i5];
        }
        if (((LinearLayoutManager) this).A01 == 1) {
            A0A2 = AbstractC70663Fe.A0A(i2, i, i4, ((ViewGroup.LayoutParams) c154496wz).width, false);
            A0A = AbstractC70663Fe.A0A(((LinearLayoutManager) this).A06.A07(), ((AbstractC70663Fe) this).A01, i3, ((ViewGroup.LayoutParams) c154496wz).height, true);
        } else {
            A0A = AbstractC70663Fe.A0A(i2, i, i3, ((ViewGroup.LayoutParams) c154496wz).height, false);
            A0A2 = AbstractC70663Fe.A0A(((LinearLayoutManager) this).A06.A07(), ((AbstractC70663Fe) this).A04, i4, ((ViewGroup.LayoutParams) c154496wz).width, true);
        }
        A0M(view, A0A2, A0A, z);
    }

    @Override // X.AbstractC70663Fe
    public final void A1H(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, C70593Ew c70593Ew, C3F5 c3f5) {
        super.A1H(accessibilityNodeInfoCompat, c70593Ew, c3f5);
        accessibilityNodeInfoCompat.setClassName(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final int A1K(C70593Ew c70593Ew, C3F5 c3f5, int i) {
        A0K();
        A0J();
        return super.A1K(c70593Ew, c3f5, i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final int A1L(C70593Ew c70593Ew, C3F5 c3f5, int i) {
        A0K();
        A0J();
        return super.A1L(c70593Ew, c3f5, i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final void A1R(C70593Ew c70593Ew, C3F5 c3f5) {
        int A03 = C0f9.A03(-29962045);
        if (c3f5.A08) {
            int A0T = A0T();
            for (int i = 0; i < A0T; i++) {
                C154496wz c154496wz = (C154496wz) A0e(i).getLayoutParams();
                int layoutPosition = c154496wz.mViewHolder.getLayoutPosition();
                this.A08.put(layoutPosition, c154496wz.A01);
                this.A07.put(layoutPosition, c154496wz.A00);
            }
        }
        super.A1R(c70593Ew, c3f5);
        this.A08.clear();
        this.A07.clear();
        C0f9.A0A(-652217396, A03);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public void A1S(C3F5 c3f5) {
        super.A1S(c3f5);
        this.A02 = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View A1k(C70593Ew c70593Ew, C3F5 c3f5, boolean z, boolean z2) {
        int i;
        int A0T = A0T();
        int i2 = -1;
        int i3 = 1;
        if (z2) {
            i = A0T() - 1;
            i3 = -1;
        } else {
            i2 = A0T;
            i = 0;
        }
        int A00 = c3f5.A00();
        A1n();
        int A06 = ((LinearLayoutManager) this).A06.A06();
        int A03 = ((LinearLayoutManager) this).A06.A03();
        View view = null;
        View view2 = null;
        while (i != i2) {
            View A0e = A0e(i);
            int A0C = AbstractC70663Fe.A0C(A0e);
            if (A0C >= 0 && A0C < A00 && A08(c70593Ew, c3f5, A0C) == 0) {
                if (((C3OP) A0e.getLayoutParams()).mViewHolder.isRemoved()) {
                    if (view2 == null) {
                        view2 = A0e;
                    }
                } else {
                    if (((LinearLayoutManager) this).A06.A0D(A0e) < A03 && ((LinearLayoutManager) this).A06.A08(A0e) >= A06) {
                        return A0e;
                    }
                    if (view == null) {
                        view = A0e;
                    }
                }
            }
            i += i3;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A1q(C70743Fm c70743Fm, C70593Ew c70593Ew, C3F5 c3f5, int i) {
        A0K();
        if (c3f5.A00() > 0 && !c3f5.A08) {
            boolean z = false;
            if (i == 1) {
                z = true;
            }
            int A08 = A08(c70593Ew, c3f5, c70743Fm.A01);
            if (!z) {
                int A00 = c3f5.A00() - 1;
                int i2 = c70743Fm.A01;
                while (i2 < A00) {
                    int i3 = i2 + 1;
                    int A082 = A08(c70593Ew, c3f5, i3);
                    if (A082 <= A08) {
                        break;
                    }
                    i2 = i3;
                    A08 = A082;
                }
                c70743Fm.A01 = i2;
            } else {
                while (A08 > 0) {
                    int i4 = c70743Fm.A01;
                    if (i4 <= 0) {
                        break;
                    }
                    int i5 = i4 - 1;
                    c70743Fm.A01 = i5;
                    A08 = A08(c70593Ew, c3f5, i5);
                }
            }
        }
        A0J();
    }

    @Override // X.AbstractC70663Fe
    public final boolean A1Z(C3OP c3op) {
        return c3op instanceof C154496wz;
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.A02 = false;
        this.A00 = -1;
        this.A08 = new SparseIntArray();
        this.A07 = new SparseIntArray();
        this.A01 = new AbstractC154146wP() { // from class: X.6wO
        };
        this.A06 = new Rect();
        A1v(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.A02 = false;
        this.A00 = -1;
        this.A08 = new SparseIntArray();
        this.A07 = new SparseIntArray();
        this.A01 = new AbstractC154146wP() { // from class: X.6wO
        };
        this.A06 = new Rect();
        A1v(i);
    }
}
