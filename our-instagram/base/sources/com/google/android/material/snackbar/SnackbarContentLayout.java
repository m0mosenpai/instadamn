package com.google.android.material.snackbar;

import X.C0f9;
import X.C65N;
import X.X86;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public class SnackbarContentLayout extends LinearLayout implements X86 {
    public Button A00;
    public TextView A01;
    public int A02;
    public int A03;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public Button getActionView() {
        return this.A00;
    }

    public TextView getMessageView() {
        return this.A01;
    }

    private boolean A00(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.A01.getPaddingTop() == i2 && this.A01.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.A01;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        int A06 = C0f9.A06(146968401);
        super.onFinishInflate();
        this.A01 = (TextView) findViewById(R.id.snackbar_text);
        this.A00 = (Button) findViewById(R.id.snackbar_action);
        C0f9.A0D(-674656186, A06);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            super.onMeasure(r7, r8)
            int r1 = r6.A03
            if (r1 <= 0) goto L16
            int r0 = r6.getMeasuredWidth()
            if (r0 <= r1) goto L16
            r0 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            super.onMeasure(r7, r8)
        L16:
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165521(0x7f070151, float:1.7945261E38)
            int r5 = r1.getDimensionPixelSize(r0)
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r4 = r1.getDimensionPixelSize(r0)
            android.widget.TextView r0 = r6.A01
            android.text.Layout r0 = r0.getLayout()
            int r0 = r0.getLineCount()
            r3 = 0
            r2 = 1
            if (r0 <= r2) goto L50
            int r0 = r6.A02
            if (r0 <= 0) goto L51
            android.widget.Button r0 = r6.A00
            int r1 = r0.getMeasuredWidth()
            int r0 = r6.A02
            if (r1 <= r0) goto L51
            int r0 = r5 - r4
            boolean r0 = r6.A00(r2, r5, r0)
        L4a:
            if (r0 == 0) goto L4f
            super.onMeasure(r7, r8)
        L4f:
            return
        L50:
            r5 = r4
        L51:
            boolean r0 = r6.A00(r3, r5, r5)
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.A02 = i;
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C65N.A0Y);
        this.A03 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.A02 = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
    }
}
