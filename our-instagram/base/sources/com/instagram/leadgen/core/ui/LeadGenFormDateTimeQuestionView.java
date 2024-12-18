package com.instagram.leadgen.core.ui;

import X.AbstractC31172DnG;
import X.AbstractC50822Mcy;
import X.C14360o3;
import X.InterfaceC57834Pl0;
import X.JQ0;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.form.IgFormField;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class LeadGenFormDateTimeQuestionView extends AbstractC50822Mcy implements InterfaceC57834Pl0 {
    public final IgFormField A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgTextView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadGenFormDateTimeQuestionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View.inflate(context, R.layout.lead_gen_view_form_date_time, this);
        this.A02 = AbstractC31172DnG.A0X(this, R.id.label_text_view);
        this.A00 = AbstractC31172DnG.A0k(this, R.id.answer_form_field);
        this.A01 = AbstractC31172DnG.A0X(this, R.id.confirmation_text_view);
        this.A03 = AbstractC31172DnG.A0X(this, R.id.optional_label);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r6.A0I == false) goto L6;
     */
    @Override // X.AbstractC50822Mcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0G(com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            r5.A06 = r8
            r5.A04 = r9
            com.instagram.igds.components.form.IgFormField r4 = r5.A00
            r4.setPrismMode(r8)
            r5.A00 = r6
            com.instagram.common.ui.base.IgTextView r1 = r5.A02
            java.lang.String r0 = r6.A0A
            r1.setText(r0)
            java.lang.String r0 = r6.A00
            r5.setLastKnownInput(r0)
            com.instagram.common.ui.base.IgTextView r3 = r5.A03
            r2 = 0
            if (r9 == 0) goto L25
            boolean r1 = r6.A0I
            r0 = 0
            if (r1 != 0) goto L27
        L25:
            r0 = 8
        L27:
            r3.setVisibility(r0)
            java.lang.String r1 = r6.A00
            int r0 = r1.length()
            if (r0 <= 0) goto L35
            r4.setText(r1)
        L35:
            com.instagram.common.ui.base.IgTextView r1 = r5.A01
            java.lang.String r0 = r6.A07
            r1.setText(r0)
            if (r0 == 0) goto L44
            int r0 = r0.length()
            if (r0 != 0) goto L46
        L44:
            r2 = 8
        L46:
            r1.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadgen.core.ui.LeadGenFormDateTimeQuestionView.A0G(com.instagram.leadgen.core.model.LeadGenFormBaseQuestion, boolean, boolean, boolean):void");
    }

    public final void setDateTimePickerClickListener(View.OnClickListener onClickListener) {
        C14360o3.A0B(onClickListener, 0);
        this.A00.setInPickerMode(onClickListener);
    }

    public final void setUpLabelTextStyle(boolean z) {
        IgTextView igTextView = this.A02;
        if (z) {
            igTextView.setGravity(17);
            igTextView.setTextAppearance(R.style.igds_title);
        } else {
            igTextView.setGravity(8388611);
            igTextView.setTextAppearance(R.style.igds_emphasized_label);
            igTextView.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadGenFormDateTimeQuestionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadGenFormDateTimeQuestionView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ LeadGenFormDateTimeQuestionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
