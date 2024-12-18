package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.MmE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51353MmE extends C3OO {
    public final Context A00;
    public final ViewGroup A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final IgSimpleImageView A06;
    public final CircularImageView A07;
    public final C57012jc A08;
    public final C56247Oxu A09;
    public final BOM A0A;

    public C51353MmE(View view, C56247Oxu c56247Oxu) {
        super(view);
        Context context = view.getContext();
        this.A00 = context;
        this.A09 = c56247Oxu;
        Resources resources = context.getResources();
        this.A01 = AbstractC31173DnH.A0F(view, R.id.active_fundraiser_row_container);
        ImageView A0I = AbstractC31173DnH.A0I(view, R.id.album_art);
        this.A02 = A0I;
        this.A07 = AbstractC31173DnH.A0T(view, R.id.default_cover_photo_border);
        this.A06 = MSX.A0I(view, R.id.default_cover_photo);
        this.A05 = AbstractC166997dE.A0T(view, R.id.active_fundraiser_row_title);
        this.A04 = AbstractC166997dE.A0T(view, R.id.active_fundraiser_row_subtitle);
        this.A03 = AbstractC166997dE.A0T(view, R.id.active_fundraiser_row_secondary_subtitle);
        this.A08 = AbstractC31177DnL.A0V(view, R.id.overflow_button_stub);
        BOM bom = new BOM(context, null, resources.getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height), AbstractC166997dE.A07(resources), 0, 0, resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material), 1, false);
        this.A0A = bom;
        A0I.setImageDrawable(bom);
    }
}
