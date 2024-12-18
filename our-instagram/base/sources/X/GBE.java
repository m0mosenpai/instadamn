package X;

import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.imageview.PulsingMultiImageView;

/* loaded from: classes6.dex */
public final class GBE implements InterfaceC1568572n {
    public final View A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final TextView A04;
    public final GradientSpinner A05;
    public final GradientSpinner A06;
    public final PulsingMultiImageView A07;
    public final PulsingMultiImageView A08;

    @Override // X.C3Ow
    public final boolean Ejh() {
        return true;
    }

    @Override // X.C3Ow
    /* renamed from: AeS */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A00);
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.A00);
    }

    @Override // X.C3Ow
    public final void CMM() {
        this.A00.setVisibility(4);
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
        this.A00.setVisibility(0);
    }

    public GBE(View view) {
        this.A00 = view;
        this.A06 = (GradientSpinner) view.requireViewById(R.id.seen_state_circle_front);
        this.A05 = (GradientSpinner) view.requireViewById(R.id.seen_state_circle_back);
        this.A08 = (PulsingMultiImageView) view.requireViewById(R.id.tray_double_avatar_front);
        this.A07 = (PulsingMultiImageView) view.requireViewById(R.id.tray_double_avatar_back);
        View requireViewById = view.requireViewById(R.id.double_avatar_live_badge);
        this.A02 = requireViewById;
        requireViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC35720Fpu(this, 2));
        this.A01 = view.requireViewById(R.id.badge_background);
        this.A03 = AbstractC31173DnH.A0I(view, R.id.badge_icon);
        this.A04 = AbstractC166997dE.A0T(view, R.id.badge_label);
    }

    @Override // X.C3Ow
    public final View Aek() {
        return this.A00;
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        return this.A06;
    }
}
