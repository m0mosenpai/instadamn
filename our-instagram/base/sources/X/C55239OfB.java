package X;

import android.animation.ValueAnimator;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;

/* renamed from: X.OfB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55239OfB implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ OKm A00;
    public final /* synthetic */ OKm A01;
    public final /* synthetic */ OKm A02;
    public final /* synthetic */ OKm A03;
    public final /* synthetic */ PIA A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ C15370ps A07;

    public C55239OfB(OKm oKm, OKm oKm2, OKm oKm3, OKm oKm4, PIA pia, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, C15370ps c15370ps) {
        this.A05 = interfaceC16820sZ;
        this.A06 = interfaceC16820sZ2;
        this.A07 = c15370ps;
        this.A03 = oKm;
        this.A00 = oKm2;
        this.A01 = oKm3;
        this.A02 = oKm4;
        this.A04 = pia;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        C14360o3.A0B(valueAnimator, 0);
        FilmstripTimelineView filmstripTimelineView = (FilmstripTimelineView) this.A05.invoke();
        if (filmstripTimelineView != null) {
            C15370ps c15370ps = this.A07;
            OKm oKm = this.A03;
            OKm oKm2 = this.A00;
            OKm oKm3 = this.A01;
            OKm oKm4 = this.A02;
            PIA pia = this.A04;
            AbstractC25228BEl.A1P(c15370ps.A00);
            c15370ps.A00 = null;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Float) && (number = (Number) animatedValue) != null) {
                float floatValue = number.floatValue();
                oKm.A01(floatValue, AbstractC166987dD.A07(filmstripTimelineView));
                oKm2.A01(floatValue, AbstractC166987dD.A07(filmstripTimelineView.A0B));
                oKm3.A01(floatValue, filmstripTimelineView.getScaleX());
                oKm4.A01(floatValue, filmstripTimelineView.getScaleY());
                filmstripTimelineView.setMeasureSpecBuilder(pia);
                filmstripTimelineView.setFilmstripTimelineWidth((int) oKm2.A00());
                filmstripTimelineView.setScaleX(oKm3.A00());
                filmstripTimelineView.setScaleY(oKm4.A00());
            }
        }
        this.A06.invoke();
    }
}
