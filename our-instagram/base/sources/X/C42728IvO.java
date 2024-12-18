package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.IvO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42728IvO implements JHC {
    public final int A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final IgImageView A07;
    public final C42739IvZ A08;
    public final C38064Gos A09;
    public final IF5 A0A;
    public final NXU A0B;
    public final NXU A0C;
    public final NXU A0D;
    public final Handler A0E = AbstractC167007dF.A0J();
    public final Runnable A0F = new J3M(this);

    public C42728IvO(View view, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C677733r c677733r) {
        Context context = view.getContext();
        Resources resources = context.getResources();
        this.A02 = view;
        View requireViewById = view.requireViewById(R.id.music_player);
        this.A03 = requireViewById;
        this.A08 = new C42739IvZ(requireViewById, userSession, interfaceC60442pS, this, c677733r);
        IF5 if5 = new IF5(view);
        this.A0A = if5;
        this.A09 = new C38064Gos(if5.A01, context.getColor(R.color.direct_light_mode_glyph_color_tertiary));
        ImageView A0I = AbstractC31173DnH.A0I(view, R.id.album_art);
        this.A04 = A0I;
        A0I.setImageDrawable(new BOM(context, null, resources.getDimensionPixelSize(R.dimen.avatar_sticker_max_height), resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), 0, 0, resources.getDimensionPixelSize(R.dimen.accent_edge_thickness), 1, false));
        this.A01 = view.requireViewById(R.id.artist_profile_container);
        this.A07 = AbstractC31172DnG.A0Z(view, R.id.artist_profile_pic);
        this.A05 = AbstractC166997dE.A0T(view, R.id.artist_profile_username);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        this.A0C = AbstractC37304Gc5.A0N(view, R.id.message_button);
        this.A0D = AbstractC37304Gc5.A0N(view, R.id.share_button);
        this.A0B = AbstractC37304Gc5.A0N(view, R.id.delete_button);
        this.A06 = AbstractC166997dE.A0T(view, R.id.text_response);
        this.A00 = AbstractC166997dE.A06(resources);
    }

    @Override // X.JHC
    public final void DUd() {
        this.A0E.postDelayed(this.A0F, 1000L);
    }

    @Override // X.JHC
    public final void DUe() {
        this.A0E.removeCallbacks(this.A0F);
        this.A09.A00(false);
    }
}
