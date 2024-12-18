package com.instagram.igds.components.facepile;

import X.AbstractC001800i;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25235BEs;
import X.AbstractC28320Ce8;
import X.AbstractC55922hc;
import X.C05F;
import X.C14360o3;
import X.C89553yv;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class IgdsFacepile extends FrameLayout {
    public int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsFacepile(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        A00(context, attributeSet);
    }

    public final void setImageBitmaps(List list, String str) {
        C14360o3.A0B(list, 0);
        setImageBitmaps(list, 3, str);
    }

    public final void setImageDrawables(List list) {
        C14360o3.A0B(list, 0);
        if (list.size() >= 1) {
            ImageView imageView = (ImageView) AbstractC166997dE.A0R(this, R.id.facepile_avatar_left);
            imageView.setImageDrawable((Drawable) AbstractC001800i.A0O(list, 0));
            imageView.setVisibility(0);
            ImageView imageView2 = (ImageView) AbstractC166997dE.A0R(this, R.id.facepile_avatar_center);
            imageView2.setImageDrawable((Drawable) AbstractC001800i.A0O(list, 1));
            imageView2.setVisibility(0);
            ImageView imageView3 = (ImageView) AbstractC166997dE.A0R(this, R.id.facepile_avatar_right);
            imageView3.setImageDrawable((Drawable) AbstractC001800i.A0O(list, 2));
            imageView3.setVisibility(0);
        }
    }

    public final void setImageUris(List list, String str) {
        C14360o3.A0B(list, 0);
        setImageUris(list, 3, str);
    }

    private final void setStandardPileBitmaps(List list, int i, String str) {
        int i2 = i;
        ImageView imageView = (ImageView) AbstractC166997dE.A0R(this, R.id.facepile_holder);
        Context A0L = AbstractC166997dE.A0L(this);
        C14360o3.A0B(list, 1);
        Resources resources = A0L.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.biz_sign_up_divider_bottom_margin);
        ArrayList A1E = AbstractC166987dD.A1E();
        int size = list.size();
        if (i2 > size) {
            i2 = size;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            A1E.add(AbstractC28320Ce8.A00(A0L, (Bitmap) AbstractC001800i.A0O(list, i3), str, resources.getDimensionPixelSize(R.dimen.biz_sign_up_divider_bottom_margin), resources.getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right), A0L.getColor(R.color.barcelona_story_share_light_mode)));
        }
        imageView.setImageDrawable(new C89553yv(A0L, C05F.A00, A1E, 0.42f, dimensionPixelSize, true));
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC55922hc.A17, 0, 0);
        C14360o3.A07(obtainStyledAttributes);
        this.A00 = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        int i = this.A00;
        int i2 = R.layout.facepile_standard;
        if (i == 1) {
            i2 = R.layout.facepile_large;
        }
        View.inflate(context, i2, this);
    }

    private final void setLargePileBitmaps(List list, String str) {
        ImageView imageView = (ImageView) AbstractC166997dE.A0R(this, R.id.facepile_avatar_left);
        Context A0L = AbstractC166997dE.A0L(this);
        imageView.setImageDrawable(AbstractC28320Ce8.A00(A0L, (Bitmap) AbstractC001800i.A0O(list, 0), str, AbstractC25235BEs.A04(A0L), 0, 0));
        imageView.setVisibility(0);
        ImageView imageView2 = (ImageView) AbstractC166997dE.A0R(this, R.id.facepile_avatar_center);
        Bitmap bitmap = (Bitmap) AbstractC001800i.A0O(list, 1);
        Resources resources = A0L.getResources();
        imageView2.setImageDrawable(AbstractC28320Ce8.A00(A0L, bitmap, str, resources.getDimensionPixelSize(R.dimen.bio_product_sticker_width), resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material), A0L.getColor(R.color.audio_bar_action_color_enabled)));
        imageView2.setVisibility(0);
        ImageView imageView3 = (ImageView) AbstractC166997dE.A0R(this, R.id.facepile_avatar_right);
        imageView3.setImageDrawable(AbstractC28320Ce8.A00(A0L, (Bitmap) AbstractC001800i.A0O(list, 2), str, AbstractC25235BEs.A04(A0L), 0, 0));
        imageView3.setVisibility(0);
    }

    private final void setLargePileUris(List list, String str) {
        ImageView imageView = (ImageView) AbstractC166997dE.A0R(this, R.id.facepile_avatar_left);
        Context A0L = AbstractC166997dE.A0L(this);
        imageView.setImageDrawable(AbstractC28320Ce8.A01(A0L, (ImageUrl) AbstractC001800i.A0O(list, 0), str, AbstractC25235BEs.A04(A0L), 0, 0));
        imageView.setVisibility(0);
        ImageView imageView2 = (ImageView) AbstractC166997dE.A0R(this, R.id.facepile_avatar_center);
        ImageUrl imageUrl = (ImageUrl) AbstractC001800i.A0O(list, 1);
        Resources resources = A0L.getResources();
        imageView2.setImageDrawable(AbstractC28320Ce8.A01(A0L, imageUrl, str, resources.getDimensionPixelSize(R.dimen.bio_product_sticker_width), resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material), A0L.getColor(R.color.audio_bar_action_color_enabled)));
        imageView2.setVisibility(0);
        ImageView imageView3 = (ImageView) AbstractC166997dE.A0R(this, R.id.facepile_avatar_right);
        imageView3.setImageDrawable(AbstractC28320Ce8.A01(A0L, (ImageUrl) AbstractC001800i.A0O(list, 2), str, AbstractC25235BEs.A04(A0L), 0, 0));
        imageView3.setVisibility(0);
    }

    private final void setStandardPileUris(List list, int i, String str) {
        ImageView imageView = (ImageView) AbstractC166997dE.A0R(this, R.id.facepile_holder);
        Context A0L = AbstractC166997dE.A0L(this);
        C14360o3.A0B(list, 1);
        imageView.setImageDrawable(AbstractC28320Ce8.A02(A0L, str, list, i, R.dimen.biz_sign_up_divider_bottom_margin, R.dimen.audience_lists_text_in_badge_horizontal_margin_right));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsFacepile(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        A00(context, attributeSet);
    }

    public final void setImageBitmaps(List list, int i, String str) {
        C14360o3.A0B(list, 0);
        if (i >= 1 && list.size() >= 1) {
            if (this.A00 == 1) {
                setLargePileBitmaps(list, str);
            } else {
                setStandardPileBitmaps(list, i, str);
            }
        }
    }

    public final void setImageUris(List list, int i, String str) {
        C14360o3.A0B(list, 0);
        if (i >= 1 && list.size() >= 1) {
            if (this.A00 == 1) {
                setLargePileUris(list, str);
            } else {
                setStandardPileUris(list, i, str);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsFacepile(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        A00(context, null);
    }
}
