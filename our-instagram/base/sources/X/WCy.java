package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class WCy {
    public static final WCy A00 = new Object();

    public static final void A00(JIN jin, XEO xeo, C69449VnY c69449VnY, XBB xbb) {
        View view = c69449VnY.A00;
        ImageView imageView = c69449VnY.A08;
        boolean z = c69449VnY.A05;
        if (view != null) {
            view.setVisibility(0);
            C0fQ.A00(new WNR(14, xeo, jin, c69449VnY, xbb), view);
        }
        if (z) {
            imageView.setVisibility(0);
            WNW.A00(imageView, 5, xeo, jin);
        }
    }

    public final View A01(ViewGroup viewGroup, boolean z, boolean z2) {
        ImageView imageView;
        C8G6 A002;
        Context context = viewGroup.getContext();
        View A0R = AbstractC25226BEj.A0R(LayoutInflater.from(context), viewGroup, R.layout.row_search_audio_track, false);
        Resources resources = context.getResources();
        C69449VnY c69449VnY = new C69449VnY(A0R);
        c69449VnY.A05 = z2;
        View view = null;
        c69449VnY.A07.setImageDrawable(new BOM(context, null, resources.getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height), resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material), 0, AbstractC167007dF.A09(A0R.getContext(), R.attr.avatarInnerStroke), resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material), -1, false));
        c69449VnY.A02 = new C41059IGc(AbstractC167007dF.A0N(A0R, R.id.artist_name));
        if (z) {
            boolean z3 = c69449VnY.A05;
            C8G4 c8g4 = new C8G4(context);
            c8g4.A0A = 0;
            c8g4.A00 = context.getDrawable(R.drawable.instagram_play_pano_filled_24);
            c8g4.A01 = context.getDrawable(R.drawable.instagram_stop_filled_16);
            if (z3) {
                view = A0R.requireViewById(R.id.album_art_preview_button);
                imageView = (ImageView) view.requireViewById(R.id.album_art_preview_button_icon);
                c8g4.A06 = 0;
                c8g4.A02(AbstractC167017dG.A03(context));
                A002 = c8g4.A00();
            } else {
                imageView = (ImageView) A0R.requireViewById(R.id.side_preview_button);
                Integer valueOf = Integer.valueOf(context.getColor(AbstractC53242c7.A04(context)));
                c8g4.A06 = valueOf;
                c8g4.A0C = valueOf;
                c8g4.A0B = Integer.valueOf(AbstractC167017dG.A07(context));
                c8g4.A02(AbstractC167017dG.A0E(context));
                c8g4.A01(context.getColor(AbstractC53242c7.A08(context)));
                A002 = c8g4.A00();
                A002.setBounds(0, 0, context.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width), AbstractC166997dE.A04(context, R.dimen.account_group_management_clickable_width));
            }
            if (imageView != null) {
                imageView.setImageDrawable(A002);
            }
            c69449VnY.A01 = imageView;
            c69449VnY.A03 = A002;
            if (view == null) {
                view = imageView;
            }
            c69449VnY.A00 = view;
        } else {
            ImageView imageView2 = c69449VnY.A01;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            c69449VnY.A08.setVisibility(8);
        }
        A0R.setTag(c69449VnY);
        return A0R;
    }
}
