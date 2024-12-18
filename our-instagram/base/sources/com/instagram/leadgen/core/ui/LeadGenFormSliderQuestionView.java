package com.instagram.leadgen.core.ui;

import X.AbstractC31172DnG;
import X.AbstractC50822Mcy;
import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class LeadGenFormSliderQuestionView extends AbstractC50822Mcy {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgEditSeekBar A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadGenFormSliderQuestionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View.inflate(context, R.layout.lead_gen_view_form_slider, this);
        this.A00 = AbstractC31172DnG.A0X(this, R.id.label_text_view);
        this.A03 = (IgEditSeekBar) requireViewById(R.id.slider);
        this.A02 = AbstractC31172DnG.A0X(this, R.id.min_label);
        this.A01 = AbstractC31172DnG.A0X(this, R.id.max_label);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0077, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071 A[LOOP:0: B:14:0x006f->B:15:0x0071, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[LOOP:1: B:18:0x0087->B:20:0x008d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    @Override // X.AbstractC50822Mcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0G(com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r11, boolean r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadgen.core.ui.LeadGenFormSliderQuestionView.A0G(com.instagram.leadgen.core.model.LeadGenFormBaseQuestion, boolean, boolean, boolean):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadGenFormSliderQuestionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadGenFormSliderQuestionView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ LeadGenFormSliderQuestionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
