package com.instagram.leadgen.core.ui;

import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class LeadGenFormHeaderView extends ConstraintLayout {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final CircularImageView A04;
    public final IgImageView A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadGenFormHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View.inflate(context, R.layout.lead_gen_view_form_header, this);
        this.A05 = AbstractC31172DnG.A0Z(this, R.id.lead_form_header_image);
        this.A01 = AbstractC31172DnG.A0X(this, R.id.num_questions_text_view);
        this.A03 = AbstractC31172DnG.A0X(this, R.id.welcome_message_text_view);
        this.A04 = AbstractC31173DnH.A0T(this, R.id.lead_form_profile_image);
        this.A02 = AbstractC31172DnG.A0X(this, R.id.username_text_view);
        this.A00 = AbstractC31172DnG.A0X(this, R.id.follower_number_text_view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadGenFormHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadGenFormHeaderView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ LeadGenFormHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
