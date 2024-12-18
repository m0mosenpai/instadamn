package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.L4f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47698L4f {
    public final View A00;
    public final FrameLayout A01;
    public final ImageView A02;
    public final TextView A03;
    public final IgProgressImageView A04;
    public final MediaFrameLayout A05;
    public final List A06;

    public C47698L4f(Context context, View view, int i) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        Resources resources;
        int i2;
        int i3;
        this.A00 = view;
        this.A05 = (MediaFrameLayout) view.requireViewById(R.id.content_media_layout);
        this.A04 = (IgProgressImageView) view.requireViewById(R.id.content_media);
        FrameLayout frameLayout = (FrameLayout) view.requireViewById(R.id.facepiles_layout);
        this.A01 = frameLayout;
        ArrayList A17 = AbstractC25225BEi.A17(i);
        if (i == 0) {
            i3 = 8;
        } else {
            frameLayout.removeAllViews();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.abc_select_dialog_padding_start_material);
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.account_recs_header_image_margin);
            Resources resources2 = context.getResources();
            if (i == 1) {
                dimensionPixelSize = resources2.getDimensionPixelSize(R.dimen.asset_picker_static_sticker_last_row_padding);
                dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.audio_dubbing_gen_ai_gif_size);
                resources = context.getResources();
                i2 = R.dimen.abc_button_inset_vertical_material;
            } else {
                dimensionPixelSize = resources2.getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
                dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.caption_overlay_offset_with_social_bubble);
                resources = context.getResources();
                i2 = R.dimen.accent_edge_thickness;
            }
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i2);
            int i4 = dimensionPixelSize2 + (dimensionPixelOffset3 * 2) + (dimensionPixelOffset2 * 2);
            View view2 = null;
            i3 = 0;
            for (int i5 = 0; i5 < Math.min(i, 3); i5++) {
                View A0C = AbstractC25227BEk.A0C(LayoutInflater.from(context), R.layout.family_bridges_basic_netego_facepile_item);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                A0C.setPadding(dimensionPixelOffset3, dimensionPixelOffset3, dimensionPixelOffset3, dimensionPixelOffset3);
                layoutParams.setMargins((i4 - dimensionPixelOffset) * i5, 0, 0, 0);
                A0C.setLayoutParams(layoutParams);
                CircularImageView A0T = AbstractC31173DnH.A0T(A0C, R.id.family_bridges_facepile_image);
                AbstractC43593JPy.A1B(A0T, dimensionPixelSize2);
                A0T.A0H(dimensionPixelOffset2, context.getColor(R.color.black_20_transparent));
                A17.add(A0T);
                frameLayout.addView(A0C);
                if (i5 == 1) {
                    view2 = A0C;
                }
            }
            if (view2 != null && i >= 3) {
                view2.bringToFront();
            }
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.setMargins(0, dimensionPixelSize, 0, 0);
            layoutParams2.gravity = 1;
            frameLayout.setLayoutParams(layoutParams2);
        }
        frameLayout.setVisibility(i3);
        this.A06 = A17;
        this.A02 = AbstractC31173DnH.A0I(view, R.id.content_message_background);
        this.A03 = AbstractC166997dE.A0T(view, R.id.content_message);
    }
}
