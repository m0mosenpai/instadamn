package X;

import com.facebook.R;
import com.instagram.business.instantexperiences.ui.InstantExperiencesAutofillBar;

/* renamed from: X.Aq0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24295Aq0 implements Runnable {
    public final /* synthetic */ C60892Rb6 A00;

    public RunnableC24295Aq0(C60892Rb6 c60892Rb6) {
        this.A00 = c60892Rb6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C60892Rb6 c60892Rb6 = this.A00;
        InstantExperiencesAutofillBar instantExperiencesAutofillBar = c60892Rb6.A00.A00;
        if (instantExperiencesAutofillBar != null) {
            C5SU c5su = new C5SU(c60892Rb6.requireActivity(), new C149686oL(AbstractC166997dE.A0N(c60892Rb6).getString(2131964566)));
            c5su.A02();
            c5su.A04(instantExperiencesAutofillBar, 0, AbstractC166997dE.A0N(c60892Rb6).getDimensionPixelSize(R.dimen.igtv_feed_preview_sound_tooltip_above_anchor_point_y), true);
            c5su.A07(C5SV.A07);
            c5su.A0A = true;
            c5su.A00().A07(c60892Rb6.getSession());
            c60892Rb6.A02 = true;
        }
    }
}
