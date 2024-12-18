package X;

import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.WmD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70997WmD implements C3Ow {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final CircularImageView A07;
    public final ReelBrandingBadgeView A08;
    public final GradientSpinner A09;

    @Override // X.C3Ow
    public final boolean Ejh() {
        return true;
    }

    @Override // X.C3Ow
    /* renamed from: AeS */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A07);
    }

    @Override // X.C3Ow
    public final View Aek() {
        return this.A07;
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.A07);
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        return this.A09;
    }

    @Override // X.C3Ow
    public final void CMM() {
        this.A07.setVisibility(4);
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
        this.A07.setVisibility(0);
    }

    public C70997WmD(View view) {
        this.A00 = view.requireViewById(R.id.location_page_header_container);
        this.A01 = view.requireViewById(R.id.reel);
        this.A09 = (GradientSpinner) view.requireViewById(R.id.reel_ring);
        CircularImageView circularImageView = (CircularImageView) view.requireViewById(R.id.profile_image);
        this.A07 = circularImageView;
        circularImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.A08 = (ReelBrandingBadgeView) view.requireViewById(R.id.branding_badge);
        this.A06 = (TextView) view.requireViewById(R.id.category_name);
        this.A03 = (TextView) view.requireViewById(R.id.dot_separator);
        this.A05 = (TextView) view.requireViewById(R.id.distance);
        this.A04 = (TextView) view.requireViewById(R.id.more_info);
        this.A02 = (TextView) view.requireViewById(R.id.city);
    }
}
