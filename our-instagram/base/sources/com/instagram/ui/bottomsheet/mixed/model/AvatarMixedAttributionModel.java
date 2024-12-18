package com.instagram.ui.bottomsheet.mixed.model;

import X.AbstractC166997dE;
import X.C14360o3;
import android.content.Context;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel;

/* loaded from: classes9.dex */
public final class AvatarMixedAttributionModel extends MixedAttributionModel {
    public final Integer A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarMixedAttributionModel(Context context, ImageUrl imageUrl, Integer num, Object obj, String str) {
        super(imageUrl, MixedAttributionModel.MixedAttributionType.A02, AbstractC166997dE.A0q(context.getResources(), 2131953549), AbstractC166997dE.A0q(context.getResources(), 2131953548));
        C14360o3.A0B(obj, 2);
        this.A01 = str;
        this.A00 = num;
        A00(context.getDrawable(R.drawable.instagram_sticker_pano_filled_24), obj);
    }

    @Override // com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel
    /* renamed from: A01 */
    public final boolean isContentSame(MixedAttributionModel mixedAttributionModel) {
        if (super.isContentSame(mixedAttributionModel) && (mixedAttributionModel instanceof AvatarMixedAttributionModel) && C14360o3.A0K(this.A02, mixedAttributionModel.A02) && this.A00 == ((AvatarMixedAttributionModel) mixedAttributionModel).A00) {
            return true;
        }
        return false;
    }
}
