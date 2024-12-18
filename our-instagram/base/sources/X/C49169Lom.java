package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.MediaActionsView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;

/* renamed from: X.Lom, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49169Lom implements C7QD, C7QE, InterfaceC1581778c {
    public C158827Au A00;
    public C7QH A01;
    public final Drawable A02 = AbstractC162807Qr.A00();
    public final View A03;
    public final View A04;
    public final FrameLayout A05;
    public final ImageView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final CircularImageView A0C;
    public final C57012jc A0D;
    public final C57012jc A0E;
    public final C57012jc A0F;
    public final C57012jc A0G;
    public final C3Y8 A0H;
    public final IgProgressImageView A0I;
    public final MediaActionsView A0J;
    public final RoundedCornerMediaFrameLayout A0K;

    @Override // X.InterfaceC1581778c
    public final ImageView Afy() {
        return this.A06;
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A05;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A01;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A01 = c7qh;
    }

    public C49169Lom(View view) {
        this.A05 = (FrameLayout) view.requireViewById(R.id.message_content_media_share_bubble_container);
        this.A04 = view.requireViewById(R.id.header);
        this.A03 = view.requireViewById(R.id.avatar_container);
        this.A0C = AbstractC31173DnH.A0T(view, R.id.avatar);
        this.A0D = AbstractC31177DnL.A0V(view, R.id.avatar_badge);
        this.A0F = AbstractC31177DnL.A0V(view, R.id.facepile_stub);
        this.A0B = AbstractC166997dE.A0T(view, R.id.username);
        this.A0A = AbstractC166997dE.A0T(view, R.id.subtitle);
        this.A0K = (RoundedCornerMediaFrameLayout) view.requireViewById(R.id.media_container);
        this.A0I = (IgProgressImageView) view.requireViewById(R.id.image);
        this.A0H = new C3Y8(AbstractC31171DnF.A07(view, R.id.zero_rating_video_play_button_stub));
        this.A09 = AbstractC166997dE.A0T(view, R.id.caption_title);
        this.A07 = AbstractC166997dE.A0T(view, R.id.caption_body);
        this.A08 = AbstractC166997dE.A0T(view, R.id.caption_subtitle);
        this.A0J = (MediaActionsView) view.requireViewById(R.id.video_indicator);
        this.A0E = AbstractC31177DnL.A0V(view, R.id.content_attribution_stub);
        this.A0G = AbstractC31177DnL.A0U(view, R.id.gradient_spinner_stub);
        this.A06 = AbstractC31173DnH.A0I(view, R.id.doubletap_heart);
    }
}
