package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.textureview.CircularTextureView;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class PJ5 implements YP5 {
    public static final long A0C = TimeUnit.SECONDS.toMillis(5);
    public ObjectAnimator A00;
    public boolean A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final PopupWindow A05;
    public final ProgressBar A06;
    public final TextView A07;
    public final TextView A08;
    public final CircularImageView A09;
    public final CircularTextureView A0A;
    public final View A0B;

    public PJ5(Context context) {
        View A0C2 = AbstractC25227BEk.A0C(LayoutInflater.from(context), R.layout.layout_iglive_livewith_autoaccept_popup);
        this.A0B = A0C2;
        this.A05 = new PopupWindow(A0C2, -1, -2, true);
        this.A09 = (CircularImageView) AbstractC166987dD.A0c(A0C2, R.id.iglive_receiver_avatar_imageview);
        this.A08 = AbstractC25230BEn.A0Q(A0C2, R.id.iglive_livewith_auto_accept_title);
        this.A07 = AbstractC25230BEn.A0Q(A0C2, R.id.iglive_livewith_auto_accept_subtitle);
        this.A03 = AbstractC166987dD.A0c(A0C2, R.id.iglive_livewith_auto_accept_cancel);
        this.A02 = AbstractC166987dD.A0c(A0C2, R.id.iglive_livewith_auto_accept_bottom_container);
        this.A06 = (ProgressBar) AbstractC166987dD.A0c(A0C2, R.id.iglive_auto_accept_progress_bar);
        this.A0A = (CircularTextureView) AbstractC166987dD.A0c(A0C2, R.id.iglive_camera_preview_texture);
        this.A04 = AbstractC166987dD.A0c(A0C2, R.id.iglive_livewith_switch_camera);
    }

    @Override // X.YP5
    public final CircularTextureView Ak1() {
        return this.A0A;
    }

    @Override // X.YP5
    public final void EQw(InterfaceC174767qC interfaceC174767qC) {
        ViewOnClickListenerC55468OkN.A00(this.A04, 41, interfaceC174767qC, this);
    }
}
