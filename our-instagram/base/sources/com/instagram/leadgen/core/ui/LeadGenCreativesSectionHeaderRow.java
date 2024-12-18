package com.instagram.leadgen.core.ui;

import X.AbstractC166997dE;
import X.AbstractC31172DnG;
import X.AbstractC37302Gc3;
import X.AbstractC56952jT;
import X.C14360o3;
import X.InterfaceC16820sZ;
import X.JQ0;
import X.ViewOnClickListenerC55461OkG;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class LeadGenCreativesSectionHeaderRow extends ConstraintLayout {
    public final IgTextView A00;
    public final IgImageView A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadGenCreativesSectionHeaderRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View.inflate(context, R.layout.lead_gen_view_creatives_section_header_row, this);
        this.A00 = AbstractC31172DnG.A0X(this, R.id.title_text_view);
        this.A01 = AbstractC31172DnG.A0Z(this, R.id.chevron);
    }

    public final void A0D(String str, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        C14360o3.A0B(str, 0);
        this.A00.setText(str);
        int i = R.drawable.instagram_chevron_down_outline_16;
        if (z) {
            i = R.drawable.instagram_chevron_up_outline_16;
        }
        IgImageView igImageView = this.A01;
        Context context = getContext();
        AbstractC166997dE.A19(context, igImageView, i);
        setOnClickListener(new ViewOnClickListenerC55461OkG(interfaceC16820sZ, 35));
        AbstractC37302Gc3.A0o(context, this, str, 2131964850);
        AbstractC56952jT.A01(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadGenCreativesSectionHeaderRow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadGenCreativesSectionHeaderRow(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ LeadGenCreativesSectionHeaderRow(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
