package com.instagram.leadgen.core.ui;

import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class LeadGenCreateFormImageView extends ConstraintLayout {
    public final RoundedCornerImageView A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadGenCreateFormImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View.inflate(context, R.layout.lead_gen_view_create_form_image, this);
        this.A00 = (RoundedCornerImageView) requireViewById(R.id.lead_form_cover_image);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadGenCreateFormImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadGenCreateFormImageView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ LeadGenCreateFormImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
