package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import com.instagram.user.model.Product;

/* renamed from: X.8qe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198818qe implements AnonymousClass884 {
    public C88M A00;
    public C88H A01;
    public Integer A02;
    public boolean A03;
    public boolean A04;
    public final View A05;
    public final UserSession A06;
    public final TargetViewSizeProvider A07;
    public final C87y A08;
    public final C198798qc A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC55932he A0K;

    public C198818qe(View view, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C87y c87y, C198798qc c198798qc) {
        C14360o3.A0B(view, 1);
        C14360o3.A0B(targetViewSizeProvider, 3);
        C14360o3.A0B(c87y, 5);
        this.A05 = view;
        this.A06 = userSession;
        this.A07 = targetViewSizeProvider;
        this.A09 = c198798qc;
        this.A08 = c87y;
        this.A0K = new C668630d() { // from class: X.8qf
            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnk(C55982hj c55982hj) {
                C14360o3.A0B(c55982hj, 0);
                float f = (float) c55982hj.A09.A00;
                C198818qe c198818qe = C198818qe.this;
                if (f == 0.0f) {
                    ((View) c198818qe.A0E.getValue()).setVisibility(8);
                    return;
                }
                C88H c88h = c198818qe.A01;
                if (c88h == null) {
                    return;
                }
                c88h.CkA();
            }

            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                C14360o3.A0B(c55982hj, 0);
                C198818qe.this.FBj((float) c55982hj.A09.A00);
            }
        };
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0B = AbstractC09440dt.A00(enumC09460dv, new C9ET(this, 7));
        this.A0F = AbstractC09440dt.A00(enumC09460dv, new C9ET(this, 11));
        this.A0E = AbstractC09440dt.A00(enumC09460dv, new C9ET(this, 10));
        this.A0A = AbstractC09440dt.A00(enumC09460dv, new C9ET(this, 6));
        this.A0G = AbstractC09440dt.A00(enumC09460dv, new C9ET(this, 12));
        this.A0I = AbstractC09440dt.A00(enumC09460dv, new C9ET(this, 14));
        this.A0H = AbstractC09440dt.A00(enumC09460dv, new C9ET(this, 13));
        this.A0C = AbstractC09440dt.A00(enumC09460dv, new C9ET(this, 8));
        this.A0D = AbstractC09440dt.A00(enumC09460dv, new C9ET(this, 9));
        this.A0J = AbstractC09440dt.A00(enumC09460dv, new C9ET(this, 15));
    }

    @Override // X.AnonymousClass884
    public final void DmC() {
    }

    @Override // X.AnonymousClass884
    public final void E5s() {
        this.A04 = false;
        onPause();
    }

    @Override // X.AnonymousClass884
    public final void E5t() {
        this.A04 = true;
        ((View) this.A0E.getValue()).setVisibility(0);
        onResume();
    }

    @Override // X.AnonymousClass884
    public final void ESj(String str) {
        C88X c88x;
        CameraAREffect cameraAREffect;
        boolean z;
        boolean z2;
        if (str != null && !AbstractC001900j.A0T(str)) {
            C88M c88m = this.A00;
            if (c88m != null) {
                c88x = c88m.A02(c88m.A00);
            } else {
                c88x = null;
            }
            String str2 = null;
            if (c88x != null) {
                cameraAREffect = c88x.A00();
            } else {
                cameraAREffect = null;
            }
            Object value = this.A0H.getValue();
            C14360o3.A07(value);
            ((View) value).setContentDescription(str);
            C195328kY c195328kY = (C195328kY) this.A0D.getValue();
            if (c88x != null) {
                str2 = c88x.A01(((View) this.A0G.getValue()).getContext());
            }
            if (cameraAREffect != null) {
                z = cameraAREffect.CcN();
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
            c195328kY.setCurrentTitle(new C174587ps(str, str2, false, z, false, z2, z2));
            return;
        }
        Object value2 = this.A0H.getValue();
        C14360o3.A07(value2);
        ((View) value2).setContentDescription(((View) this.A0G.getValue()).getContext().getString(2131968565));
        C195328kY c195328kY2 = (C195328kY) this.A0D.getValue();
        IgTextView igTextView = c195328kY2.A05;
        igTextView.setTextSize(14.0f);
        if (c195328kY2.A0A) {
            c195328kY2.setBackground(null);
        }
        c195328kY2.A0D();
        igTextView.setText(c195328kY2.getContext().getString(2131968565));
    }

    @Override // X.AnonymousClass884
    public final void FC1() {
    }

    public final void A00() {
        C88X c88x;
        C88Z c88z;
        C88M c88m = this.A00;
        if (c88m != null) {
            c88x = c88m.A02(c88m.A00);
        } else {
            c88x = null;
        }
        String str = null;
        if (c88x != null) {
            c88z = c88x.A04;
            if (c88z == null) {
                c88z = C88Z.A0G;
            }
        } else {
            c88z = null;
        }
        if (c88z == C88Z.A0Q) {
            ((C195328kY) this.A0D.getValue()).A0D();
            return;
        }
        if (c88x != null) {
            str = c88x.A0G;
        }
        ESj(str);
    }

    @Override // X.AnonymousClass884
    public final boolean AFk() {
        if (this.A04) {
            InterfaceC09390do interfaceC09390do = this.A0G;
            if (((View) interfaceC09390do.getValue()).isEnabled() && ((ReboundViewPager) interfaceC09390do.getValue()).A0O == C3VZ.A03) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AnonymousClass884
    public final void AJ8(C88M c88m, C88H c88h) {
        if (!this.A03) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            ((ViewGroup) this.A0C.getValue()).addView((View) this.A0D.getValue(), layoutParams);
        }
        InterfaceC09390do interfaceC09390do = this.A0B;
        ((AnonymousClass889) interfaceC09390do.getValue()).A02 = c88h;
        ((AnonymousClass889) interfaceC09390do.getValue()).A01 = c88m;
        this.A00 = c88m;
        this.A01 = c88h;
        if (c88m != null) {
            this.A03 = true;
            InterfaceC09390do interfaceC09390do2 = this.A0G;
            Context context = ((View) interfaceC09390do2.getValue()).getContext();
            Resources resources = context.getResources();
            int A00 = C88P.A00(context);
            int width = ((NineSixteenLayoutConfigImpl) this.A07).A0K.getWidth();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.audio_page_audio_filter_tooltip_vertical_offset);
            View view = (View) this.A0I.getValue();
            InterfaceC09390do interfaceC09390do3 = this.A0J;
            AbstractC13880nE.A0W(view, ((Number) interfaceC09390do3.getValue()).intValue() - dimensionPixelSize);
            AbstractC13880nE.A0W((View) interfaceC09390do2.getValue(), ((Number) interfaceC09390do3.getValue()).intValue());
            float f = A00;
            float f2 = width;
            C174437pd c174437pd = new C174437pd(AbstractC174417pb.A00(f, f2 / 2.0f, resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material), resources.getDimensionPixelSize(R.dimen.abc_star_medium), resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen)), f, f2, ((Number) interfaceC09390do3.getValue()).intValue(), dimensionPixelSize);
            ((ReboundViewPager) interfaceC09390do2.getValue()).A0C = A00;
            int i = 0;
            ((ReboundViewPager) interfaceC09390do2.getValue()).A0M(4, false);
            ((ReboundViewPager) interfaceC09390do2.getValue()).setPageSpacing(0.0f);
            ((ReboundViewPager) interfaceC09390do2.getValue()).setScrollMode(A3V.A00);
            ((ReboundViewPager) interfaceC09390do2.getValue()).A0J = c174437pd;
            InterfaceC09390do interfaceC09390do4 = this.A0H;
            Object value = interfaceC09390do4.getValue();
            C14360o3.A07(value);
            ((ShutterButton) value).setInnerCircleAlpha(0.0f);
            ((AnonymousClass889) interfaceC09390do.getValue()).A00 = (ReboundViewPager) interfaceC09390do2.getValue();
            ((AnonymousClass889) interfaceC09390do.getValue()).A00("camera_dial_postcap");
            c88m.A02 = c174437pd;
            c174437pd.A00 = c88m.A04;
            c88m.A03 = new C23754AfR(this);
            int i2 = c88m.A00;
            if (c88m.A07(i2)) {
                i = i2;
            }
            ((ReboundViewPager) interfaceC09390do2.getValue()).A0K(i);
            ((ReboundViewPager) interfaceC09390do2.getValue()).A0N(c88m, i);
            C23757AfU c23757AfU = new C23757AfU(this);
            Object value2 = interfaceC09390do4.getValue();
            C14360o3.A07(value2);
            C174537pn c174537pn = new C174537pn(context, (View) value2, (View) interfaceC09390do2.getValue(), c23757AfU);
            ((TouchInterceptorFrameLayout) this.A0A.getValue()).A00(c174537pn.A02, c174537pn.A01);
        }
    }

    @Override // X.AnonymousClass884
    public final int B6q() {
        return ((ReboundViewPager) this.A0G.getValue()).A09;
    }

    @Override // X.AnonymousClass884
    public final int BM3() {
        return ((ReboundViewPager) this.A0G.getValue()).A0A;
    }

    @Override // X.AnonymousClass884
    public final int Bd6() {
        return ((Number) this.A0J.getValue()).intValue();
    }

    @Override // X.AnonymousClass884
    public final InterfaceC55932he Bp9() {
        return this.A0K;
    }

    @Override // X.AnonymousClass884
    public final boolean CaF() {
        return this.A03;
    }

    @Override // X.AnonymousClass884
    public final void EMP(int i, boolean z) {
        C88M c88m = this.A00;
        if (this.A03 && c88m != null) {
            InterfaceC09390do interfaceC09390do = this.A0G;
            if (((View) interfaceC09390do.getValue()).isEnabled()) {
                if (c88m.A07(i)) {
                    ReboundViewPager reboundViewPager = (ReboundViewPager) interfaceC09390do.getValue();
                    if (z) {
                        reboundViewPager.A0L(i, 0.0f);
                        return;
                    } else {
                        reboundViewPager.A0K(i);
                        return;
                    }
                }
                AbstractC12120kG.A07("PostCaptureDialViewController", AnonymousClass001.A0O("Invalid Scroll position passed: ", i), null);
            }
        }
    }

    @Override // X.AnonymousClass884
    public final void EMq(String str) {
        Integer valueOf;
        C88M c88m = this.A00;
        if (c88m != null && (valueOf = Integer.valueOf(c88m.A00(str))) != null) {
            EMs(null, valueOf.intValue(), false);
        }
    }

    @Override // X.AnonymousClass884
    public final void EMs(String str, int i, boolean z) {
        ((ReboundViewPager) this.A0G.getValue()).A0K(i);
        C88M c88m = this.A00;
        if (c88m != null) {
            c88m.A05(str, i, false, z, false);
        }
        this.A02 = null;
    }

    @Override // X.AnonymousClass884
    public final void EVD(boolean z) {
        ((AnonymousClass889) this.A0B.getValue()).A05 = z;
    }

    @Override // X.AnonymousClass884
    public final void Eba(Product product) {
        throw new UnsupportedOperationException("Post capture dial does not support products");
    }

    @Override // X.AnonymousClass884
    public final void Ebe(boolean z) {
        throw new UnsupportedOperationException("Post capture dial does not support products");
    }

    @Override // X.AnonymousClass884
    public final void FBj(float f) {
        ((View) this.A0E.getValue()).setAlpha(f);
        ((C195328kY) this.A0D.getValue()).setGroupAlpha(f);
    }

    @Override // X.AnonymousClass884
    public final View getView() {
        return (View) this.A0E.getValue();
    }

    @Override // X.AnonymousClass884
    public final void onPause() {
        Integer valueOf;
        if (this.A04) {
            InterfaceC09390do interfaceC09390do = this.A0G;
            ReboundViewPager reboundViewPager = (ReboundViewPager) interfaceC09390do.getValue();
            InterfaceC09390do interfaceC09390do2 = this.A0B;
            reboundViewPager.A0Q((C42H) interfaceC09390do2.getValue());
            if (this.A03 && ((ReboundViewPager) interfaceC09390do.getValue()).A0O != C3VZ.A03) {
                if (this.A00 == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(Math.max(0, Math.min(C1H4.A01(((ReboundViewPager) interfaceC09390do.getValue()).A01), r2.getCount() - 1)));
                }
                this.A02 = valueOf;
                if (valueOf != null) {
                    ((ReboundViewPager) interfaceC09390do.getValue()).A0K(valueOf.intValue());
                }
            }
            C62882tR c62882tR = ((AnonymousClass889) interfaceC09390do2.getValue()).A03;
            if (c62882tR != null) {
                c62882tR.onPause();
            }
        }
    }

    @Override // X.AnonymousClass884
    public final void onResume() {
        Integer num;
        int intValue;
        if (this.A04) {
            ReboundViewPager reboundViewPager = (ReboundViewPager) this.A0G.getValue();
            InterfaceC09390do interfaceC09390do = this.A0B;
            reboundViewPager.A0P((C42H) interfaceC09390do.getValue());
            if (this.A03 && (num = this.A02) != null && (intValue = num.intValue()) >= 0) {
                C88M c88m = this.A00;
                if (c88m != null) {
                    c88m.A03(intValue);
                }
                this.A02 = null;
            }
            interfaceC09390do.getValue();
        }
    }
}
