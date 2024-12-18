package com.instagram.arads.ui;

import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class FooterView extends ConstraintLayout {
    public final IgLinearLayout A00;
    public final IgTextView A01;
    public final IgTextView A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FooterView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public final int getCurrentSubTitleColor() {
        return this.A01.getCurrentTextColor();
    }

    public final int getCurrentTitleColor() {
        return this.A02.getCurrentTextColor();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r5.length() == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setFooterText(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L7
            com.instagram.common.ui.base.IgTextView r0 = r4.A02
            r0.setText(r5)
        L7:
            com.instagram.common.ui.base.IgTextView r3 = r4.A02
            r2 = 0
            if (r5 == 0) goto L13
            int r1 = r5.length()
            r0 = 0
            if (r1 != 0) goto L15
        L13:
            r0 = 8
        L15:
            r3.setVisibility(r0)
            if (r6 == 0) goto L1f
            com.instagram.common.ui.base.IgTextView r0 = r4.A01
            r0.setText(r6)
        L1f:
            com.instagram.common.ui.base.IgTextView r1 = r4.A01
            if (r6 == 0) goto L29
            int r0 = r6.length()
            if (r0 != 0) goto L2b
        L29:
            r2 = 8
        L2b:
            r1.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.arads.ui.FooterView.setFooterText(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        LayoutInflater.from(context).inflate(R.layout.arads_camera_footer, this);
        this.A02 = (IgTextView) requireViewById(R.id.footer_title);
        this.A01 = (IgTextView) requireViewById(R.id.footer_subtitle);
        this.A00 = (IgLinearLayout) requireViewById(R.id.footer_background);
    }

    public /* synthetic */ FooterView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FooterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
