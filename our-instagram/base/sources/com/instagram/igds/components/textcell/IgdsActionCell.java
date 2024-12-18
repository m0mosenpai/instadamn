package com.instagram.igds.components.textcell;

import X.AbstractC13880nE;
import X.AbstractC31172DnG;
import X.AbstractC31177DnL;
import X.AbstractC56952jT;
import X.C14360o3;
import X.EnumC33337EoW;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class IgdsActionCell extends FrameLayout {
    public final IgTextView A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsActionCell(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View inflate = View.inflate(context, R.layout.igds_actioncell_layout, this);
        this.A00 = AbstractC31172DnG.A0X(inflate, R.id.igds_actioncell_label);
        AbstractC13880nE.A0m(inflate, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        AbstractC56952jT.A01(this);
    }

    public final void A00(View.OnClickListener onClickListener, EnumC33337EoW enumC33337EoW, CharSequence charSequence) {
        int i;
        C14360o3.A0B(enumC33337EoW, 1);
        IgTextView igTextView = this.A00;
        igTextView.setText(charSequence);
        setOnClickListener(onClickListener);
        int ordinal = enumC33337EoW.ordinal();
        Context context = getContext();
        if (ordinal != 1) {
            if (ordinal != 2) {
                i = R.attr.igds_color_primary_text;
            } else {
                i = R.attr.igds_color_error_or_destructive;
            }
        } else {
            i = R.attr.igds_color_primary_button;
        }
        AbstractC31177DnL.A0q(context, igTextView, i);
        setContentDescription(charSequence);
    }

    public final void setActionText(CharSequence charSequence) {
        this.A00.setText(charSequence);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsActionCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ IgdsActionCell(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsActionCell(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
