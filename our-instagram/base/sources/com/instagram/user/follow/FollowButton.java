package com.instagram.user.follow;

import X.AbstractC13880nE;
import X.C14360o3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class FollowButton extends FollowButtonBase {
    public boolean A00;
    public boolean A01;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FollowButton(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    private final void A00(Drawable drawable) {
        if (!this.A01 && drawable != null) {
            int i = R.dimen.abc_dialog_padding_material;
            if (!this.A00) {
                i = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
            }
            AbstractC13880nE.A0m(this, i, R.dimen.abc_edit_text_inset_bottom_material, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding, R.dimen.abc_edit_text_inset_bottom_material);
            setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width));
            setGravity(17);
            return;
        }
        if (this.A00) {
            AbstractC13880nE.A0m(this, R.dimen.abc_dialog_padding_material, R.dimen.abc_action_bar_elevation_material, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding, R.dimen.abc_action_bar_elevation_material);
        } else {
            if (!((FollowButtonBase) this).A05) {
                return;
            }
            A03();
        }
    }

    public final void setDisableImmersivePadding(boolean z) {
        if (z) {
            ((FollowButtonBase) this).A08 = true;
        }
        if (!A07()) {
            this.A01 = z;
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        A00(drawable);
    }

    public final void setEnableCollaborationButtonPadding(boolean z) {
        this.A00 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        A00(getBackground());
        setTextSize(2, 14.0f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FollowButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ FollowButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
