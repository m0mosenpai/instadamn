package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.sliderview.RulerView;
import com.instagram.creation.video.ui.FilmstripScrollView;
import com.instagram.pendingmedia.model.ClipInfo;

/* loaded from: classes9.dex */
public final class NLH extends KB4 implements InterfaceC25215BDn, InterfaceC58090PpF, InterfaceC184058Eu {
    public static final C54998OUj A0Z = new Object();
    public static final String __redex_internal_original_name = "VideoTrimFragment";
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public Animation A0D;
    public LinearLayout A0E;
    public FilmstripScrollView A0F;
    public C9KJ A0G;
    public ClipInfo A0H;
    public boolean A0I;
    public double[] A0J;
    public double A0K;
    public double A0L;
    public int A0M;
    public int A0N;
    public long A0O;
    public View A0P;
    public View A0Q;
    public View A0R;
    public Animation A0S;
    public ProgressBar A0T;
    public RulerView A0U;
    public AnonymousClass841 A0V;
    public C47Z A0W;
    public final Runnable A0X = new RunnableC56891PMk(this);
    public final InterfaceC09390do A0Y = AbstractC25225BEi.A0a(new C50161MDo(this, 25), new C50161MDo(this, 26), MSW.A1G(this, null, 41), AbstractC25225BEi.A1D(C44529JmZ.class));

    @Override // X.KB4
    public final void A0C() {
    }

    @Override // X.InterfaceC58090PpF
    public final void APx(Bitmap bitmap, int i, int i2) {
        View view;
        C14360o3.A0B(bitmap, 0);
        LinearLayout linearLayout = this.A0E;
        if (linearLayout != null && linearLayout.hashCode() == i2) {
            LinearLayout linearLayout2 = this.A0E;
            if (linearLayout2 != null) {
                view = linearLayout2.getChildAt(i);
            } else {
                view = null;
            }
            C14360o3.A0C(view, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) view).setImageBitmap(bitmap);
        }
    }

    @Override // X.InterfaceC58090PpF
    public final void Drf(double[] dArr) {
        double d;
        if (this.mView != null) {
            LinearLayout linearLayout = this.A0E;
            if (linearLayout != null) {
                if (linearLayout.getChildCount() == 0) {
                    float f = this.A00;
                    int i = this.A07;
                    double[] dArr2 = new double[i];
                    float f2 = f / 2.0f;
                    int length = dArr.length - 1;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        int i4 = i2 + 1;
                        double d2 = dArr[i2];
                        double d3 = f2;
                        if (d2 > d3) {
                            dArr2[i3] = d2;
                        } else {
                            if (d2 <= d3 && d3 <= dArr[i4]) {
                                if (Math.abs(d2 - d3) < Math.abs(dArr[i4] - d3)) {
                                    d = dArr[i2];
                                } else {
                                    d = dArr[i4];
                                }
                                dArr2[i3] = d;
                            }
                            i2 = i4;
                        }
                        f2 += f;
                        i3++;
                        if (i3 >= i) {
                            break;
                        } else {
                            i2 = i4;
                        }
                    }
                    while (i3 < i) {
                        dArr2[i3] = dArr[length];
                        i3++;
                    }
                    for (int i5 = 0; i5 < i; i5++) {
                        dArr2[i5] = dArr2[i5] * 1000.0d;
                    }
                    this.A0J = dArr2;
                    this.A0J = dArr2;
                    OXC oxc = super.A07;
                    if (oxc != null) {
                        oxc.A04 = dArr2;
                        oxc.A00();
                    }
                    double[] dArr3 = this.A0J;
                    if (dArr3 != null) {
                        int length2 = dArr3.length;
                        for (int i6 = 0; i6 < length2; i6++) {
                            ImageView imageView = new ImageView(requireContext());
                            imageView.setBackgroundResource(R.drawable.trim_frame_bg);
                            AbstractC43592JPx.A1H(imageView, (int) this.A0L, (int) this.A0K);
                            imageView.setPadding(0, 0, 0, 0);
                            LinearLayout linearLayout2 = this.A0E;
                            if (linearLayout2 != null) {
                                linearLayout2.addView(imageView);
                            }
                        }
                    }
                    A09(this, C05F.A01);
                    int A00 = ((int) A00(this)) + (this.A02 * 2);
                    int i7 = this.A0N;
                    if (A00 < i7) {
                        LinearLayout linearLayout3 = this.A0E;
                        if (linearLayout3 != null) {
                            AbstractC13880nE.A0b(linearLayout3, i7 - A00);
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                    ClipInfo clipInfo = this.A0H;
                    if (clipInfo == null) {
                        C14360o3.A0F("clipInfo");
                        throw C00O.createAndThrow();
                    }
                    double d4 = clipInfo.A08;
                    int i8 = clipInfo.A07;
                    double d5 = this.A01 * 1000;
                    double d6 = this.A03;
                    double d7 = ((((i8 * 1.0d) / d5) * d6) - d4) + this.A02;
                    A07(this, (int) Math.min(((((clipInfo.A05 - i8) * 1.0d) / d5) * d6) + d7, A00(this) + d7));
                    A08(this, (int) d7);
                    View view = this.A0C;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    View view2 = this.A0B;
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    Animation loadAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.import_filmstrip_slide_in_right);
                    loadAnimation.setAnimationListener(new AnimationAnimationListenerC55511Ol4(this, d4));
                    View view3 = this.A0R;
                    if (view3 != null) {
                        view3.startAnimation(loadAnimation);
                        return;
                    }
                    return;
                }
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        if (isResumed()) {
            C9GR.A0C(AbstractC12290kX.A00, "view_is_null");
            AbstractC25226BEj.A1Q(this);
        }
    }

    @Override // X.InterfaceC25215BDn
    public final void Dz1(String str) {
    }

    @Override // X.InterfaceC25215BDn
    public final void Dz9(int i) {
    }

    @Override // X.InterfaceC25215BDn
    public final void Dzd() {
    }

    @Override // X.InterfaceC25215BDn
    public final void Dzf() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "video_trim";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View view2 = super.A00;
        if (view2 != null) {
            AbstractC43841Ja4.A03(view2);
            C54998OUj c54998OUj = A0Z;
            Context requireContext = requireContext();
            ClipInfo clipInfo = this.A0H;
            if (clipInfo == null) {
                C14360o3.A0F("clipInfo");
                throw C00O.createAndThrow();
            }
            this.A0L = c54998OUj.A01(requireContext, A0A(), clipInfo);
            this.A0K = AbstractC31177DnL.A09(this).getDimensionPixelSize(R.dimen.album_preview_add_item_circle_size);
            OXC oxc = super.A07;
            if (oxc != null) {
                oxc.A02 = this;
            }
            LinearLayout linearLayout = this.A0E;
            if (linearLayout != null) {
                linearLayout.post(this.A0X);
                InterfaceC09390do interfaceC09390do = this.A0Y;
                if (((C44529JmZ) interfaceC09390do.getValue()).A02()) {
                    JQ0.A11(this, new MCE(this, null, 20), ((C44529JmZ) interfaceC09390do.getValue()).A01);
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }

    public static final double A00(NLH nlh) {
        if (nlh.A0E != null) {
            return r0.getChildCount() * nlh.A0L;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final double A01(NLH nlh) {
        if (nlh.A0F != null) {
            double scrollX = ((((r0.getScrollX() + nlh.A08) - nlh.A02) * 1.0d) / nlh.A03) * nlh.A01 * 1000;
            if (nlh.A0H == null) {
                C14360o3.A0F("clipInfo");
                throw C00O.createAndThrow();
            }
            return Math.max(Math.min(scrollX, r0.A0A), 500.0d);
        }
        throw AbstractC166997dE.A0g();
    }

    public static final double A02(NLH nlh) {
        if (nlh.A0F != null) {
            double max = Math.max(0.0d, ((((r0.getScrollX() + nlh.A09) - nlh.A02) * 1.0d) / nlh.A03) * nlh.A01 * 1000);
            if (nlh.A0H == null) {
                C14360o3.A0F("clipInfo");
                throw C00O.createAndThrow();
            }
            return Math.min(max, r0.A0A - 500.0d);
        }
        throw AbstractC166997dE.A0g();
    }

    private final void A03(int i) {
        View view = this.A0A;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C14360o3.A0C(layoutParams, AbstractC111324zv.A00(5));
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = (i - view.getPaddingLeft()) + this.A0M;
            view.requestLayout();
        }
    }

    private final void A04(int i) {
        ClipInfo clipInfo = this.A0H;
        if (clipInfo == null) {
            C14360o3.A0F("clipInfo");
            throw C00O.createAndThrow();
        }
        int i2 = clipInfo.A07;
        if (i < i2) {
            i = i2;
        }
        if (this.mView != null) {
            A03((int) (((A00(this) - (this.A0M * 2)) * i) / this.A0O));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.NnR, java.lang.Object] */
    private final void A05(int i, int i2) {
        OXC oxc = super.A07;
        if (oxc != 0) {
            double d = this.A0L;
            double d2 = this.A0K;
            LinearLayout linearLayout = this.A0E;
            if (linearLayout != null) {
                int hashCode = linearLayout.hashCode();
                ?? obj = new Object();
                obj.A04 = i;
                obj.A02 = i2;
                obj.A01 = d;
                obj.A00 = d2;
                obj.A03 = hashCode;
                oxc.A03(obj);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public static final void A06(NLH nlh) {
        AbstractC167007dF.A0w(nlh.A0A);
        View view = nlh.A0A;
        if (view != null) {
            view.clearAnimation();
        }
        View view2 = nlh.A0A;
        if (view2 != null) {
            Animation animation = nlh.A0S;
            if (animation == null) {
                C14360o3.A0F("playIndicatorFadeInAnimation");
                throw C00O.createAndThrow();
            }
            view2.startAnimation(animation);
        }
    }

    public static final void A07(NLH nlh, int i) {
        ViewGroup.LayoutParams layoutParams;
        Drawable background;
        nlh.A08 = i;
        ProgressBar progressBar = nlh.A0T;
        if (progressBar != null) {
            progressBar.setProgress(i - nlh.A09);
        }
        View view = nlh.A0C;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (view != null) {
            layoutParams2 = view.getLayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        if (marginLayoutParams != null) {
            int i2 = nlh.A08;
            View view2 = nlh.A0C;
            if (view2 != null && (background = view2.getBackground()) != null) {
                marginLayoutParams.leftMargin = i2 - (background.getIntrinsicWidth() / 2);
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        View view3 = nlh.A0C;
        if (view3 != null) {
            view3.requestLayout();
        }
        View view4 = nlh.A0Q;
        if (view4 != null && (layoutParams = view4.getLayoutParams()) != null) {
            FilmstripScrollView filmstripScrollView = nlh.A0F;
            if (filmstripScrollView != null) {
                layoutParams.width = filmstripScrollView.getWidth() - nlh.A08;
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        View view5 = nlh.A0Q;
        if (view5 != null) {
            view5.requestLayout();
        }
        FilmstripScrollView filmstripScrollView2 = nlh.A0F;
        if (filmstripScrollView2 != null) {
            filmstripScrollView2.invalidate();
        }
    }

    public static final void A08(NLH nlh, int i) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        Drawable background;
        nlh.A09 = i;
        FilmstripScrollView filmstripScrollView = nlh.A0F;
        if (filmstripScrollView != null) {
            nlh.A03((filmstripScrollView.getScrollX() + nlh.A09) - nlh.A02);
            ProgressBar progressBar = nlh.A0T;
            if (progressBar != null) {
                progressBar.setMax(nlh.A0N - nlh.A09);
                ProgressBar progressBar2 = nlh.A0T;
                if (progressBar2 != null) {
                    progressBar2.setProgress(nlh.A08 - nlh.A09);
                }
                ProgressBar progressBar3 = nlh.A0T;
                ViewGroup.LayoutParams layoutParams3 = null;
                if (progressBar3 != null) {
                    layoutParams = progressBar3.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    marginLayoutParams.leftMargin = nlh.A09;
                }
                View view = nlh.A0B;
                if (view != null) {
                    layoutParams3 = view.getLayoutParams();
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                if (marginLayoutParams2 != null) {
                    int i2 = nlh.A09;
                    View view2 = nlh.A0B;
                    if (view2 != null && (background = view2.getBackground()) != null) {
                        marginLayoutParams2.leftMargin = i2 - (background.getIntrinsicWidth() / 2);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                View view3 = nlh.A0B;
                if (view3 != null) {
                    view3.requestLayout();
                }
                View view4 = nlh.A0P;
                if (view4 != null && (layoutParams2 = view4.getLayoutParams()) != null) {
                    layoutParams2.width = nlh.A09;
                }
                View view5 = nlh.A0P;
                if (view5 != null) {
                    view5.requestLayout();
                }
                FilmstripScrollView filmstripScrollView2 = nlh.A0F;
                if (filmstripScrollView2 != null) {
                    filmstripScrollView2.invalidate();
                    return;
                }
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final void A09(NLH nlh, Integer num) {
        OXC oxc = ((KB4) nlh).A07;
        if (oxc != null) {
            oxc.A00();
        }
        LinearLayout linearLayout = nlh.A0E;
        if (linearLayout != null) {
            int childCount = linearLayout.getChildCount();
            if (nlh.A0F != null) {
                int width = ((int) (r0.getWidth() / nlh.A0L)) + 1;
                if (nlh.A0F != null) {
                    int scrollX = (int) (r0.getScrollX() / nlh.A0L);
                    int i = childCount - 1;
                    int min = Math.min(i, (scrollX + width) - 1);
                    int max = Math.max(0, scrollX - width);
                    int max2 = Math.max(0, scrollX - 1);
                    int min2 = Math.min(min + 1, i);
                    int min3 = Math.min(width + min, i);
                    nlh.A05(scrollX, min);
                    if (num == C05F.A01) {
                        nlh.A05(min2, min3);
                        nlh.A05(max2, max);
                        return;
                    } else {
                        nlh.A05(max2, max);
                        nlh.A05(min2, min3);
                        return;
                    }
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.KB4
    public final void A0D() {
        OXC oxc = super.A07;
        if (oxc != null) {
            oxc.A02 = this;
        }
        LinearLayout linearLayout = this.A0E;
        if (linearLayout != null) {
            linearLayout.post(this.A0X);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC25215BDn
    public final void E0B() {
        View view = this.A0A;
        if (view != null) {
            view.clearAnimation();
        }
        View view2 = this.A0A;
        if (view2 != null) {
            Animation animation = this.A0D;
            if (animation == null) {
                C14360o3.A0F("playIndicatorFadeOutAnimation");
                throw C00O.createAndThrow();
            }
            view2.startAnimation(animation);
        }
    }

    @Override // X.InterfaceC25215BDn
    public final void E03() {
        A06(this);
        ClipInfo clipInfo = this.A0H;
        if (clipInfo == null) {
            C14360o3.A0F("clipInfo");
            throw C00O.createAndThrow();
        }
        A04(clipInfo.A07);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return A0A();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(986663679);
        super.onCreate(bundle);
        InterfaceC189628ah interfaceC189628ah = (InterfaceC189628ah) AbstractC13320mI.A01(requireContext(), InterfaceC189628ah.class);
        this.A0V = AbstractC43594JPz.A0Q(AbstractC13320mI.A01(requireContext(), InterfaceC189608af.class));
        UserSession CE4 = interfaceC189628ah.CE4();
        C14360o3.A0B(CE4, 0);
        super.A01 = CE4;
        setModuleNameV2("video_trim");
        this.A0S = AnimationUtils.loadAnimation(requireContext(), R.anim.import_play_fade_in);
        this.A0D = AnimationUtils.loadAnimation(requireContext(), R.anim.import_play_fade_out);
        this.A0M = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
        C0f9.A09(579643463, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ee, code lost:
    
        if (r12.A0W == null) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NLH.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-223253481);
        super.onDestroyView();
        OXC oxc = super.A07;
        if (oxc != null) {
            oxc.A02 = null;
            oxc.A04 = null;
            oxc.A00();
        }
        super.A07 = null;
        FilmstripScrollView filmstripScrollView = this.A0F;
        if (filmstripScrollView != null) {
            filmstripScrollView.A00 = null;
            C9KJ c9kj = this.A0G;
            if (c9kj != null) {
                c9kj.A06(null);
                c9kj.A0J.clear();
                C9KW c9kw = c9kj.A08;
                if (c9kw != null) {
                    c9kw.A0A.clear();
                }
            }
            this.A0G = null;
            LinearLayout linearLayout = this.A0E;
            if (linearLayout != null) {
                linearLayout.removeCallbacks(this.A0X);
            }
            this.A0E = null;
            this.A0F = null;
            this.A0R = null;
            this.A0Q = null;
            this.A0P = null;
            this.A0A = null;
            View view = this.A0C;
            if (view != null) {
                view.setOnTouchListener(null);
            }
            this.A0C = null;
            View view2 = this.A0B;
            if (view2 != null) {
                view2.setOnTouchListener(null);
            }
            this.A0B = null;
            this.A0T = null;
            C0f9.A09(1311275998, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(-863457531, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(2095778849);
        OXC oxc = super.A07;
        if (oxc != null) {
            oxc.A00();
        }
        super.onPause();
        C0f9.A09(1633896488, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1722916628);
        super.onResume();
        C9KK c9kk = super.A05;
        if (c9kk != null) {
            C9KJ c9kj = this.A0G;
            if (c9kj != null) {
                c9kk.A07 = c9kj;
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A09(1771801817, A02);
                throw A0g;
            }
        }
        if (A00(this) > 0.0d && super.A07 != null) {
            A09(this, C05F.A01);
        }
        C0f9.A09(-89953815, A02);
    }

    @Override // X.InterfaceC184058Eu
    public final void DzQ(int i) {
        A04(i);
    }
}
