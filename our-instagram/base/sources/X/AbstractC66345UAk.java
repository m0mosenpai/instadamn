package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.UAk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66345UAk extends ViewGroup {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;

    public abstract void setSingleLine(boolean z);

    public int getItemSpacing() {
        return this.A00;
    }

    public int getLineSpacing() {
        return this.A01;
    }

    public int getRowCount() {
        return this.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        if (r7 == 1073741824) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        if (r5 == 1073741824) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r7 == 1073741824) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r20, int r21) {
        /*
            r19 = this;
            r18 = r20
            int r9 = android.view.View.MeasureSpec.getSize(r18)
            int r7 = android.view.View.MeasureSpec.getMode(r18)
            r12 = r21
            int r6 = android.view.View.MeasureSpec.getSize(r12)
            int r5 = android.view.View.MeasureSpec.getMode(r12)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r4) goto L1f
            r0 = 1073741824(0x40000000, float:2.0)
            r11 = 2147483647(0x7fffffff, float:NaN)
            if (r7 != r0) goto L20
        L1f:
            r11 = r9
        L20:
            r8 = r19
            int r16 = r8.getPaddingLeft()
            int r1 = r8.getPaddingTop()
            int r0 = r8.getPaddingRight()
            int r11 = r11 - r0
            r2 = r1
            r10 = 0
            r3 = 0
        L32:
            int r0 = r8.getChildCount()
            if (r10 >= r0) goto L95
            android.view.View r15 = r8.getChildAt(r10)
            int r13 = r15.getVisibility()
            r0 = 8
            if (r13 == r0) goto L8f
            r0 = r18
            r8.measureChild(r15, r0, r12)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            boolean r13 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r13 == 0) goto L92
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r14 = r0.leftMargin
            int r13 = r0.rightMargin
        L57:
            int r0 = r16 + r14
            int r17 = r15.getMeasuredWidth()
            int r0 = r0 + r17
            if (r0 <= r11) goto L6c
            boolean r0 = r8.A03
            if (r0 != 0) goto L6c
            int r16 = r8.getPaddingLeft()
            int r2 = r8.A01
            int r2 = r2 + r1
        L6c:
            int r0 = r16 + r14
            int r1 = r15.getMeasuredWidth()
            int r0 = r0 + r1
            int r1 = r15.getMeasuredHeight()
            int r1 = r1 + r2
            if (r0 <= r3) goto L7b
            r3 = r0
        L7b:
            int r14 = r14 + r13
            int r0 = r15.getMeasuredWidth()
            int r14 = r14 + r0
            int r0 = r8.A00
            int r14 = r14 + r0
            int r16 = r16 + r14
            int r0 = r8.getChildCount()
            int r0 = r0 + (-1)
            if (r10 != r0) goto L8f
            int r3 = r3 + r13
        L8f:
            int r10 = r10 + 1
            goto L32
        L92:
            r14 = 0
            r13 = 0
            goto L57
        L95:
            int r0 = r8.getPaddingRight()
            int r3 = r3 + r0
            int r0 = r8.getPaddingBottom()
            int r1 = r1 + r0
            if (r7 == r4) goto Lb6
            r0 = 1073741824(0x40000000, float:2.0)
            if (r7 != r0) goto La6
        La5:
            r3 = r9
        La6:
            if (r5 == r4) goto Lb1
            r0 = 1073741824(0x40000000, float:2.0)
            if (r5 != r0) goto Lad
        Lac:
            r1 = r6
        Lad:
            r8.setMeasuredDimension(r3, r1)
            return
        Lb1:
            int r6 = java.lang.Math.min(r1, r6)
            goto Lac
        Lb6:
            int r9 = java.lang.Math.min(r3, r9)
            goto La5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC66345UAk.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.A02 = 0;
            return;
        }
        this.A02 = 1;
        if (getLayoutDirection() == 1) {
            z2 = true;
            paddingLeft = getPaddingRight();
            paddingRight = getPaddingLeft();
        } else {
            z2 = false;
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingRight;
        int i8 = paddingLeft;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = marginLayoutParams.getMarginStart();
                    i5 = marginLayoutParams.getMarginEnd();
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                int measuredWidth = i8 + i6 + childAt.getMeasuredWidth();
                if (!this.A03 && measuredWidth > i7) {
                    i9 = this.A01 + paddingTop;
                    this.A02++;
                    i8 = paddingLeft;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.A02 - 1));
                int i11 = i8 + i6;
                int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                paddingTop = childAt.getMeasuredHeight() + i9;
                if (z2) {
                    i11 = i7 - measuredWidth2;
                    measuredWidth2 = (i7 - i8) - i6;
                }
                childAt.layout(i11, i9, measuredWidth2, paddingTop);
                i8 += i6 + i5 + childAt.getMeasuredWidth() + this.A00;
            }
        }
    }

    public void setItemSpacing(int i) {
        this.A00 = i;
    }

    public void setLineSpacing(int i) {
        this.A01 = i;
    }
}
