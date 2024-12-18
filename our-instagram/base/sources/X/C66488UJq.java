package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.UJq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66488UJq extends C3OO implements MOK {
    public C44376JjF A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final Resources A09;
    public final Drawable A0A;
    public final UserSession A0B;
    public final IgTextView A0C;
    public final U8W A0D;
    public final IgImageView A0E;
    public final IgImageView A0F;
    public final IgImageView A0G;
    public final SpinnerImageView A0H;

    @Override // X.MOK
    public final void Cze(Bitmap bitmap, C44376JjF c44376JjF) {
        this.A0H.setLoadingStatus(C3T1.SUCCESS);
        IgImageView igImageView = this.A0E;
        igImageView.setImageDrawable(c44376JjF);
        int i = 4;
        igImageView.setVisibility(0);
        this.A0C.setVisibility(0);
        this.A0G.setVisibility(0);
        IgImageView igImageView2 = this.A0F;
        if (this.A01) {
            i = 0;
        }
        igImageView2.setVisibility(i);
    }

    public C66488UJq(Context context, View view, UserSession userSession) {
        super(view);
        this.A08 = context;
        this.A0B = userSession;
        this.A0G = (IgImageView) view.requireViewById(R.id.mention_profile_attribution);
        this.A0E = (IgImageView) view.requireViewById(R.id.mention_thumbnail_image);
        IgImageView igImageView = (IgImageView) view.requireViewById(R.id.mention_thumbnail_video_play_button);
        this.A0F = igImageView;
        this.A0C = (IgTextView) view.requireViewById(R.id.mention_thumbnail_time_left_text);
        this.A0H = (SpinnerImageView) view.requireViewById(R.id.mention_thumbnail_spinner);
        ImageView imageView = (ImageView) view.requireViewById(R.id.mention_thumbnail_card_dim);
        this.A0A = igImageView.getDrawable();
        U8W u8w = new U8W();
        this.A0D = u8w;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A02 = dimensionPixelSize;
        u8w.A01 = dimensionPixelSize;
        u8w.A02 = 77;
        imageView.setImageDrawable(u8w);
        Resources resources = context.getResources();
        this.A09 = resources;
        this.A05 = resources.getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding);
        this.A06 = resources.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
        this.A07 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A03 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A04 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
    }
}
