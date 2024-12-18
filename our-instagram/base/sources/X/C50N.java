package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.emitter.PulseEmitter;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.imageview.PulsingMultiImageView;

/* renamed from: X.50N, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C50N {
    public final View A00;
    public final View A01;
    public final FrameLayout A02;
    public final FrameLayout A03;
    public final ImageView A04;
    public final TextView A05;
    public final IgSimpleImageView A06;
    public final IgSimpleImageView A07;
    public final PulseEmitter A08;
    public final PulseEmitter A09;
    public final GradientSpinner A0A;
    public final GradientSpinner A0B;
    public final PulsingMultiImageView A0C;
    public final PulsingMultiImageView A0D;

    public C50N(View view) {
        FrameLayout frameLayout = (FrameLayout) view.requireViewById(R.id.avatar_container);
        this.A02 = frameLayout;
        this.A03 = (FrameLayout) view.requireViewById(R.id.avatar_image_container);
        this.A0B = (GradientSpinner) frameLayout.requireViewById(R.id.seen_state_circle_front);
        this.A0A = (GradientSpinner) frameLayout.requireViewById(R.id.seen_state_circle_back);
        this.A07 = (IgSimpleImageView) frameLayout.requireViewById(R.id.tray_double_avatar_background_front);
        this.A06 = (IgSimpleImageView) frameLayout.requireViewById(R.id.tray_double_avatar_background_back);
        this.A09 = (PulseEmitter) frameLayout.requireViewById(R.id.tray_double_avatar_pulse_emitter_front);
        this.A08 = (PulseEmitter) frameLayout.requireViewById(R.id.tray_double_avatar_pulse_emitter_back);
        this.A0D = (PulsingMultiImageView) frameLayout.requireViewById(R.id.tray_double_avatar_front);
        this.A0C = (PulsingMultiImageView) frameLayout.requireViewById(R.id.tray_double_avatar_back);
        View requireViewById = frameLayout.requireViewById(R.id.double_avatar_live_badge);
        this.A01 = requireViewById;
        requireViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.50O
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                View view2 = C50N.this.A01;
                view2.getViewTreeObserver().removeOnPreDrawListener(this);
                view2.setTranslationY(view2.getHeight() / 4);
                return false;
            }
        });
        this.A00 = frameLayout.requireViewById(R.id.badge_background);
        this.A04 = (ImageView) frameLayout.requireViewById(R.id.badge_icon);
        this.A05 = (TextView) frameLayout.requireViewById(R.id.badge_label);
    }
}
