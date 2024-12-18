package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.emitter.PulseEmitter;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.imageview.PulsingMultiImageView;

/* renamed from: X.3P2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3P2 {
    public View.OnClickListener A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public TextView A05;
    public CircularImageView A06;
    public CircularImageView A07;
    public CircularImageView A08;
    public C3PN A09;
    public PulseEmitter A0A;
    public PulsingMultiImageView A0B;
    public final ViewStub A0C;
    public final ViewStub A0D;
    public final ViewStub A0E;
    public final ViewStub A0F;
    public final ViewStub A0G;
    public final ViewStub A0H;
    public final ViewStub A0I;
    public final ViewStub A0J;
    public final FrameLayout A0K;
    public final CircularImageView A0L;
    public final InterfaceC56392iX A0M;
    public final InterfaceC56392iX A0N;
    public final GradientSpinner A0O;
    public final View A0P;

    public C3P2(View view) {
        C14360o3.A0B(view, 1);
        this.A0P = view;
        View requireViewById = view.requireViewById(R.id.seen_state);
        C14360o3.A07(requireViewById);
        this.A0O = (GradientSpinner) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.pulse_emitter_stub);
        C14360o3.A07(requireViewById2);
        this.A0H = (ViewStub) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.pulsing_image_view_stub);
        C14360o3.A07(requireViewById3);
        this.A0I = (ViewStub) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.failed_stub);
        C14360o3.A07(requireViewById4);
        this.A0E = (ViewStub) requireViewById4;
        View requireViewById5 = view.requireViewById(R.id.live_badge_stub);
        C14360o3.A07(requireViewById5);
        this.A0G = (ViewStub) requireViewById5;
        if (C14640oc.A02()) {
            Context context = view.getContext();
            int A0G = AbstractC53242c7.A0G(context, R.attr.reelsTrayAvatarInnerSize);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.avatar_reel_ring_size_extra_large);
            GradientSpinner gradientSpinner = this.A0O;
            float A05 = AbstractC14670of.A05(context, A0G, dimensionPixelSize);
            float A00 = AbstractC14670of.A00(context, this.A0O.A00, A0G);
            float A01 = AbstractC14670of.A01(context, this.A0O.A02, A0G);
            ViewGroup.LayoutParams layoutParams = gradientSpinner.getLayoutParams();
            if (layoutParams != null) {
                int i = (int) A05;
                layoutParams.width = i;
                layoutParams.height = i;
            }
            gradientSpinner.A02 = A00;
            gradientSpinner.A00 = A01;
            gradientSpinner.invalidate();
        }
        this.A0L = (CircularImageView) view.requireViewById(R.id.avatar_image_view);
        this.A0K = (FrameLayout) view.requireViewById(R.id.avatar_container);
        this.A0D = (ViewStub) view.requireViewById(R.id.double_avatar_stub);
        this.A0C = (ViewStub) view.requireViewById(R.id.birthday_confetti_animation_stub);
        this.A0F = (ViewStub) view.requireViewById(R.id.likes_emitter_animation_stub);
        this.A0J = (ViewStub) view.requireViewById(R.id.self_avatar_camera_overlay);
        this.A0M = AbstractC56372iV.A01(view.requireViewById(R.id.comment_container_stub), false, false);
        this.A0N = AbstractC56372iV.A01(view.requireViewById(R.id.tray_follow_button_stub), false, false);
    }

    public final void A00() {
        if (this.A0A == null) {
            View inflate = this.A0H.inflate();
            C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.emitter.PulseEmitter");
            this.A0A = (PulseEmitter) inflate;
            View inflate2 = this.A0I.inflate();
            C14360o3.A0C(inflate2, "null cannot be cast to non-null type com.instagram.ui.widget.imageview.PulsingMultiImageView");
            this.A0B = (PulsingMultiImageView) inflate2;
        }
    }
}
