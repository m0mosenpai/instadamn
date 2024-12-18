package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NQN extends AbstractC38513GwY {
    @Override // X.AbstractC38513GwY
    public final /* bridge */ /* synthetic */ void A02(Object obj) {
        Drawable drawable;
        Drawable mutate;
        ImageView A0I = AbstractC31173DnH.A0I(this.itemView, R.id.mix_nux_icon);
        Context A0L = AbstractC166997dE.A0L(A0I);
        Drawable drawable2 = A0L.getDrawable(R.drawable.music_mix_nux_icon);
        if (drawable2 != null) {
            drawable = drawable2.mutate();
        } else {
            drawable = null;
        }
        C14360o3.A0C(drawable, AbstractC111324zv.A00(28));
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        Drawable drawable3 = A0L.getDrawable(R.drawable.instagram_mix_pano_outline_20);
        if (drawable3 != null && (mutate = drawable3.mutate()) != null) {
            mutate.setColorFilter(AbstractC166997dE.A01(A0L), PorterDuff.Mode.SRC_IN);
        }
        layerDrawable.setDrawableByLayerId(R.id.music_mix_pano_icon_drawable, drawable3);
        A0I.setImageDrawable(layerDrawable);
    }
}
