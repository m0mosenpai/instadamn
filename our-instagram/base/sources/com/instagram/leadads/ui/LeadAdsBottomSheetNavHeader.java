package com.instagram.leadads.ui;

import X.AbstractC31172DnG;
import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class LeadAdsBottomSheetNavHeader extends ConstraintLayout {
    public final int A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgImageView A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadAdsBottomSheetNavHeader(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadAdsBottomSheetNavHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        View.inflate(context, R.layout.lead_gen_view_bottom_sheet_nav_header, this);
        this.A02 = AbstractC31172DnG.A0Y(this, R.id.lead_form_title);
        this.A03 = AbstractC31172DnG.A0a(this, R.id.lead_form_header_back_button);
        this.A01 = AbstractC31172DnG.A0Y(this, R.id.lead_form_header_close_button);
        this.A00 = getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
    }

    public /* synthetic */ LeadAdsBottomSheetNavHeader(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }
}
