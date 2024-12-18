package X;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.lifecycle.CoroutineLiveData;
import com.facebook.R;
import com.facebook.cameracore.mediapipeline.services.uicontrol.SliderConfiguration;
import com.instagram.creation.capture.quickcapture.faceeffectui.viewmodels.EffectSliderViewModel$isEffectTrayState$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.viewmodels.EffectSliderViewModel$progress$$inlined$filter$1$2;
import com.instagram.ui.widget.drawing.EffectSlider;

/* renamed from: X.8H1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8H1 implements C8H2, C8H3 {
    public SliderConfiguration A00;
    public boolean A01;
    public C184578Gy A02;
    public final ConstraintLayout A03;
    public final Guideline A04;
    public final C8A0 A05;
    public final EffectSlider A06;

    @Override // X.C82M
    public final /* synthetic */ void A7T(Parcelable parcelable) {
    }

    @Override // X.C82M
    public final /* synthetic */ Parcelable ANh() {
        return null;
    }

    @Override // X.C8H3
    public final void Dyb(float f) {
        C8A0 c8a0 = this.A05;
        InterfaceC25156BBa interfaceC25156BBa = c8a0.A01;
        if (interfaceC25156BBa != null) {
            interfaceC25156BBa.onAdjustableValueChanged(f);
        }
        c8a0.A07.Egh(Float.valueOf(f));
    }

    @Override // X.C8H2
    public final void EDv() {
        C184578Gy c184578Gy = this.A02;
        InterfaceC58362lv interfaceC58362lv = new InterfaceC58362lv() { // from class: X.8H4
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                C8H1 c8h1 = C8H1.this;
                if (((Boolean) obj).booleanValue()) {
                    if (!c8h1.A01) {
                        c8h1.A01 = true;
                        SliderConfiguration sliderConfiguration = c8h1.A05.A00;
                        c8h1.A00 = sliderConfiguration;
                        if (sliderConfiguration != null) {
                            c8h1.A06.A04(sliderConfiguration.mSliderType, sliderConfiguration.mSteps, sliderConfiguration.mColorSamplerRGBAData, sliderConfiguration.mImageData);
                        }
                        View[] viewArr = {c8h1.A06};
                        C55942hf c55942hf = C150956qv.A02;
                        AbstractC125325le.A04(null, viewArr, true);
                        return;
                    }
                    return;
                }
                if (!c8h1.A01) {
                    return;
                }
                c8h1.A01 = false;
                C150956qv.A08(new View[]{c8h1.A06}, true);
                c8h1.A00 = null;
            }
        };
        InterfaceC58362lv interfaceC58362lv2 = new InterfaceC58362lv() { // from class: X.8H5
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                C8H1 c8h1 = C8H1.this;
                float floatValue = ((Number) obj).floatValue();
                SliderConfiguration sliderConfiguration = c8h1.A05.A00;
                if (sliderConfiguration != c8h1.A00) {
                    c8h1.A00 = sliderConfiguration;
                    if (sliderConfiguration != null) {
                        c8h1.A06.A04(sliderConfiguration.mSliderType, sliderConfiguration.mSteps, sliderConfiguration.mColorSamplerRGBAData, sliderConfiguration.mImageData);
                    }
                }
                c8h1.A06.setProgress(floatValue);
            }
        };
        InterfaceC58362lv interfaceC58362lv3 = new InterfaceC58362lv() { // from class: X.8H6
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                C8H1 c8h1 = C8H1.this;
                int i = 3;
                if (((Boolean) obj).booleanValue()) {
                    i = 5;
                }
                ConstraintLayout constraintLayout = c8h1.A03;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) constraintLayout.getLayoutParams();
                layoutParams.gravity = i | 17;
                constraintLayout.setLayoutParams(layoutParams);
            }
        };
        InterfaceC58362lv interfaceC58362lv4 = new InterfaceC58362lv() { // from class: X.8H7
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                Guideline guideline = C8H1.this.A04;
                float f = 1.0f;
                if (obj == C8A3.A04) {
                    f = 0.5f;
                }
                guideline.setGuidelinePercent(f);
            }
        };
        C8A0 c8a0 = c184578Gy.A01;
        C1810281e c1810281e = c184578Gy.A02;
        C14360o3.A0B(c1810281e, 0);
        final InterfaceC19390xP A00 = AbstractC184118Fa.A00(c1810281e);
        InterfaceC19390xP A01 = C0ST.A01(C10Q.A00(new C206609Cr(0, null), C0ST.A01(new InterfaceC19390xP() { // from class: X.8H8
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new EffectSliderViewModel$isEffectTrayState$$inlined$map$1$2(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        }), C0ST.A01(AbstractC011604e.A00(C05F.A00, C0JE.A00(new C9D3(c8a0.A03.A04, (InterfaceC23621Ds) null, 6, 42)), -1)), c8a0.A05));
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        CoroutineLiveData A002 = AbstractC58232lf.A00(anonymousClass191, A01);
        C07X c07x = c184578Gy.A00;
        A002.A06(c07x, interfaceC58362lv);
        final C05A c05a = c8a0.A07;
        AbstractC58232lf.A00(anonymousClass191, C0ST.A01(new InterfaceC19390xP() { // from class: X.8H9
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new EffectSliderViewModel$progress$$inlined$filter$1$2(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        })).A06(c07x, interfaceC58362lv2);
        AbstractC58232lf.A00(anonymousClass191, c8a0.A06).A06(c07x, interfaceC58362lv3);
        AbstractC58232lf.A00(anonymousClass191, c8a0.A04).A06(c07x, interfaceC58362lv4);
    }

    public C8H1(ViewGroup viewGroup, C184578Gy c184578Gy, C8A0 c8a0) {
        this.A06 = (EffectSlider) viewGroup.requireViewById(R.id.effect_slider);
        this.A05 = c8a0;
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup.requireViewById(R.id.effect_slider_container);
        this.A03 = constraintLayout;
        this.A04 = (Guideline) constraintLayout.requireViewById(R.id.effect_slider_container_guideline);
        this.A06.A0F = this;
        this.A02 = c184578Gy;
    }
}
