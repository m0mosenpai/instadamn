package com.instagram.creation.capture.quickcapture.sundial.widget;

import X.AbstractC13670mt;
import X.C14360o3;
import X.EnumC99704do;
import X.InterfaceC185498Kr;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class CountdownDurationToggle extends IgdsButton {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC185498Kr A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountdownDurationToggle(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public static /* synthetic */ void getCountdownDurationMs$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(com.instagram.creation.capture.quickcapture.sundial.widget.CountdownDurationToggle r6) {
        /*
            int r1 = r6.A00
            r0 = 3000(0xbb8, float:4.204E-42)
            r5 = 0
            r4 = 1
            if (r1 == r0) goto L45
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r1 == r0) goto L50
            java.lang.String r0 = ""
        Le:
            r6.setText(r0)
            int r1 = r6.A00
            r0 = 3000(0xbb8, float:4.204E-42)
            if (r1 == r0) goto L21
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r1 == r0) goto L2c
            java.lang.String r0 = ""
        L1d:
            X.AbstractC010103p.A0G(r6, r0)
            return
        L21:
            android.content.res.Resources r3 = r6.getResources()
            r2 = 2131955481(0x7f130f19, float:1.954749E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 3
            goto L37
        L2c:
            android.content.res.Resources r3 = r6.getResources()
            r2 = 2131955481(0x7f130f19, float:1.954749E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 10
        L37:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r5] = r0
            java.lang.String r0 = r3.getString(r2, r1)
            X.C14360o3.A07(r0)
            goto L1d
        L45:
            android.content.res.Resources r3 = r6.getResources()
            r2 = 2131955482(0x7f130f1a, float:1.9547493E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 3
            goto L5b
        L50:
            android.content.res.Resources r3 = r6.getResources()
            r2 = 2131955482(0x7f130f1a, float:1.9547493E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 10
        L5b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r5] = r0
            java.lang.String r0 = r3.getString(r2, r1)
            X.C14360o3.A07(r0)
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.widget.CountdownDurationToggle.A00(com.instagram.creation.capture.quickcapture.sundial.widget.CountdownDurationToggle):void");
    }

    @Override // com.instagram.igds.components.button.IgdsButton, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        TextView textView = this.A0A;
        measureChild(textView, i, i2);
        int measuredWidth = textView.getMeasuredWidth() + this.A02;
        if (View.MeasureSpec.getMode(measuredWidth) == 1073741824) {
            int size = View.MeasureSpec.getSize(i);
            if (size < measuredWidth) {
                size = measuredWidth;
            }
            measuredWidth = size;
        }
        super.A01.A02(measuredWidth, this.A01);
        setMeasuredDimension(measuredWidth, this.A01);
    }

    public final void setOnCountdownDurationChangedListener(InterfaceC185498Kr interfaceC185498Kr) {
        this.A03 = interfaceC185498Kr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountdownDurationToggle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = 3000;
        setStyle(EnumC99704do.A06);
        TextView textView = this.A0A;
        textView.setGravity(17);
        textView.setTextAppearance(R.style.igds_emphasized_body_1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        Rect rect = new Rect();
        String string = getResources().getString(2131955482, 10);
        C14360o3.A07(string);
        TextPaint paint = textView.getPaint();
        Pattern pattern = AbstractC13670mt.A03;
        paint.getTextBounds(string, 0, string.length(), rect);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width() + this.A02, -2);
        layoutParams.gravity = 17;
        addView(textView, layoutParams);
        A00(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountdownDurationToggle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
