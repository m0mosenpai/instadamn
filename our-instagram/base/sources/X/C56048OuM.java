package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.OuM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56048OuM implements InterfaceC60602pj, SeekBar.OnSeekBarChangeListener {
    public float A00;
    public long A01;
    public ValueAnimator A02;
    public Integer A03;
    public final Context A04;
    public final UserSession A05;
    public final TargetViewSizeProvider A06;
    public final ClipsStackedTimelineViewController A07;
    public final ClipsCreationViewModel A08;
    public final C187358Sd A09;
    public final C50868Mdz A0A;
    public final HashMap A0B;
    public final C87H A0C;

    public C56048OuM(Context context, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, ClipsStackedTimelineViewController clipsStackedTimelineViewController, ClipsCreationViewModel clipsCreationViewModel, C187358Sd c187358Sd, C50868Mdz c50868Mdz, C87H c87h) {
        C14360o3.A0B(userSession, 1);
        this.A05 = userSession;
        this.A07 = clipsStackedTimelineViewController;
        this.A08 = clipsCreationViewModel;
        this.A09 = c187358Sd;
        this.A0C = c87h;
        this.A0A = c50868Mdz;
        this.A04 = context;
        this.A06 = targetViewSizeProvider;
        this.A00 = 1.0f;
        this.A0B = AbstractC166987dD.A1G();
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        ClipsStackedTimelineViewController clipsStackedTimelineViewController = this.A07;
        C0fQ.A00(new ViewOnClickListenerC55460OkF(this, 11), clipsStackedTimelineViewController.A0P().getSpeedDoneButton());
        ClipsTimelineActionBarViewController.A01(new ViewOnClickListenerC55460OkF(this, 12), EnumC53325Ni3.A0Y, clipsStackedTimelineViewController.A0C);
        clipsStackedTimelineViewController.A0P().getSpeedSlider().setOnSeekBarChangeListener(this);
        clipsStackedTimelineViewController.A0P().getSpeedSlider().setMax(180);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    private final float A00(float f, int i) {
        C115475Kh A0V;
        C115475Kh A0V2;
        double pow;
        double d;
        C115475Kh A0V3;
        C115475Kh A0V4;
        ClipsCreationViewModel clipsCreationViewModel = this.A08;
        C58252li c58252li = clipsCreationViewModel.A0G;
        C84B A0W = MSW.A0W(c58252li);
        if (A0W != null && (A0V3 = MSW.A0V(A0W, i)) != null) {
            if ((MSW.A04(clipsCreationViewModel) - MSW.A05(A0V3)) + AbstractC53904Nsd.A00(A0V3, f) > clipsCreationViewModel.A0E()) {
                C84B A0W2 = MSW.A0W(c58252li);
                if (A0W2 != null && (A0V4 = MSW.A0V(A0W2, i)) != null) {
                    float A00 = AbstractC53904Nsd.A00(A0V4, 1.0f) / ((clipsCreationViewModel.A0E() - MSW.A04(clipsCreationViewModel)) + MSW.A05(A0V4));
                    if (A00 < 0.1f) {
                        A00 = 0.1f;
                    }
                    pow = Math.pow(10.0d, 1.0d);
                    d = Math.ceil(A00 * pow);
                    return ((int) d) / ((float) pow);
                }
                return 1.0f;
            }
        }
        C84B A0W3 = MSW.A0W(c58252li);
        if (A0W3 == null || (A0V = MSW.A0V(A0W3, i)) == null || AbstractC53904Nsd.A00(A0V, f) >= 100) {
            return f;
        }
        C84B A0W4 = MSW.A0W(c58252li);
        if (A0W4 != null && (A0V2 = MSW.A0V(A0W4, i)) != null) {
            float A002 = AbstractC53904Nsd.A00(A0V2, 1.0f) / 100.0f;
            if (A002 > 10.0f) {
                A002 = 10.0f;
            }
            pow = Math.pow(10.0d, 1.0d);
            d = A002 * pow;
            return ((int) d) / ((float) pow);
        }
        return 1.0f;
    }

    private final float A01(int i) {
        EnumC1828489f enumC1828489f;
        float f = i;
        if (f >= 90.0f + 1.0f) {
            return (((f - 90.0f) / 1.0f) * 0.1f) + 1.0f;
        }
        if (f <= 9.0f) {
            enumC1828489f = EnumC1828489f.A0E;
        } else {
            if (f <= 90.0f - 9.0f) {
                return f / 90.0f;
            }
            enumC1828489f = EnumC1828489f.A09;
        }
        return enumC1828489f.A00;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            AbstractC187378Sf A0E = this.A09.A0E();
            if (seekBar != null && (A0E instanceof C187528Su)) {
                int i2 = ((C187528Su) A0E).A00;
                float A01 = A01(seekBar.getProgress());
                float A00 = A00(A01, i2);
                this.A07.A0T(A01);
                if (A00 != this.A00) {
                    C50868Mdz c50868Mdz = this.A0A;
                    Context context = this.A04;
                    int i3 = ((NineSixteenLayoutConfigImpl) this.A06).A06 / 2;
                    ClipsCreationViewModel clipsCreationViewModel = c50868Mdz.A0E;
                    C84B A0N = MSY.A0N(clipsCreationViewModel);
                    if (A0N != null) {
                        ArrayList A1F = AbstractC166987dD.A1F(A0N.A05());
                        if (i2 < A1F.size()) {
                            int A05 = MSW.A05((C115475Kh) A1F.get(i2));
                            int A002 = AbstractC53904Nsd.A00((C115475Kh) A1F.get(i2), A00);
                            double d = A002;
                            double d2 = A05;
                            A1F.set(i2, C115475Kh.A00(null, null, (C115475Kh) A1F.get(i2), null, A00, (int) ((r15.A09 * d) / d2), (int) ((r15.A08 * d) / d2), 0, 0, 2147483619));
                            c50868Mdz.A0Q(context, null, A1F, i3, false, false);
                            c50868Mdz.A0Z.Egh(new C51752Mtb(C05F.A01, (MSW.A04(clipsCreationViewModel) - A05) + A002, MSW.A04(clipsCreationViewModel), 7));
                            if (c50868Mdz.A0F.A0E() instanceof C187528Su) {
                                C57155PYz.A00(c50868Mdz, AbstractC141776au.A00(c50868Mdz), A002, 12);
                            }
                            int i4 = A002 - A05;
                            c50868Mdz.A0J.A0V(i4, MSW.A04(clipsCreationViewModel), false, true, true);
                            c50868Mdz.A0H.A0P(i4, MSW.A04(clipsCreationViewModel), false);
                            c50868Mdz.A0I.A0P(i4, MSW.A04(clipsCreationViewModel), false);
                        }
                    }
                    if (A00 == 1.0f) {
                        seekBar.performHapticFeedback(1);
                    }
                    this.A00 = A00;
                    return;
                }
                return;
            }
            return;
        }
        this.A07.A0T(A01(i));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        C84B A0N;
        InterfaceC115495Kj A04;
        ValueAnimator valueAnimator = this.A02;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C50868Mdz c50868Mdz = this.A0A;
        AbstractC187378Sf A0E = c50868Mdz.A0F.A0E();
        if ((A0E instanceof C187528Su) && (A0N = MSY.A0N(c50868Mdz.A0E)) != null && (A04 = A0N.A04(((C187528Su) A0E).A00)) != null) {
            C57171PZp.A03(A04, c50868Mdz, AbstractC141776au.A00(c50868Mdz), 13);
        }
        C05A c05a = c50868Mdz.A0Z;
        Integer num = C05F.A00;
        ClipsCreationViewModel clipsCreationViewModel = c50868Mdz.A0E;
        c05a.Egh(new C51752Mtb(num, MSW.A04(clipsCreationViewModel), MSW.A04(clipsCreationViewModel), 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStopTrackingTouch(android.widget.SeekBar r9) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56048OuM.onStopTrackingTouch(android.widget.SeekBar):void");
    }

    public static final void A02(C56048OuM c56048OuM, float f, int i) {
        C115475Kh A00;
        float A002 = c56048OuM.A00(f, i);
        ClipsCreationViewModel clipsCreationViewModel = c56048OuM.A08;
        Float valueOf = Float.valueOf(A002);
        C84G c84g = clipsCreationViewModel.A0O;
        C14360o3.A0A(valueOf);
        int A0E = clipsCreationViewModel.A0E() - MSW.A04(clipsCreationViewModel);
        C05A c05a = c84g.A02;
        AbstractC115485Ki abstractC115485Ki = (AbstractC115485Ki) ((C84B) c05a.getValue()).A04(i);
        if (abstractC115485Ki != null && (abstractC115485Ki instanceof C115475Kh)) {
            A00 = C115475Kh.A00(null, null, (C115475Kh) abstractC115485Ki, null, 0.0f, 0, 0, 0, 0, Integer.MAX_VALUE);
            if (Math.abs(A00.A00) != A002) {
                int A05 = MSW.A05(A00);
                int A003 = AbstractC53904Nsd.A00(A00, A002);
                if (A003 >= 100) {
                    int i2 = (A0E - A003) + A05;
                    double d = A003;
                    double d2 = A05;
                    int i3 = (int) ((A00.A09 * d) / d2);
                    int i4 = (int) ((A00.A08 * d) / d2);
                    if (i2 > 0) {
                        i2 = 0;
                    }
                    A00.A0G(A002);
                    A00.A09 = i3;
                    A00.A08 = i4 + i2;
                    c05a.Egh(AbstractC55154OdI.A02(A00, (C84B) c05a.getValue(), i));
                    C115475Kh A0V = MSW.A0V(ClipsCreationViewModel.A00(clipsCreationViewModel), i);
                    C49602Pt c49602Pt = clipsCreationViewModel.A0R;
                    if (c49602Pt.A02() && A0V != null) {
                        C115525Km c115525Km = A0V.A0G;
                        C14360o3.A0B(c115525Km, 0);
                        try {
                            MSZ.A1N(AMc.A01(c49602Pt, AbstractC166987dD.A11(c115525Km.A0F), "adjusted"));
                        } catch (IOException unused) {
                        }
                        C84D.A01(A0V, c49602Pt);
                    }
                }
            }
        }
    }
}
