package X;

import android.content.res.Resources;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes5.dex */
public abstract class BOJ {
    public static final void A00(IgImageView igImageView, boolean z) {
        Resources resources = igImageView.getResources();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(resources.getDimensionPixelSize(R.dimen.abc_list_item_height_material), resources.getDimensionPixelSize(R.dimen.abc_list_item_height_material));
        layoutParams.gravity = 17;
        int i = R.dimen.abc_dialog_padding_material;
        if (z) {
            i = R.dimen.audio_bar_margin_bottom;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        igImageView.setLayoutParams(layoutParams);
        igImageView.setBackground(resources.getDrawable(R.drawable.black_50_transparent_oval));
        igImageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        igImageView.setImageResource(R.drawable.instagram_play_pano_filled_24);
        igImageView.setColorFilter(resources.getColor(R.color.audio_bar_action_color_enabled));
        igImageView.setVisibility(8);
    }
}
