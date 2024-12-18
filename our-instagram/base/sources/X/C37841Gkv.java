package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;
import android.view.animation.ScaleAnimation;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Gkv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37841Gkv {
    public int A00;
    public View.OnClickListener A01;
    public View A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public IgTextView A05;
    public IgTextView A06;
    public IgImageView A07;
    public GradientSpinnerAvatarView A08;
    public Integer A09;
    public Integer A0A;
    public String A0B;
    public final Context A0C;
    public final Animation A0D;
    public final Animation A0E;
    public final Animation A0F;
    public final Animation A0G;
    public final InterfaceC11380iw A0H;
    public final UserSession A0I;
    public final Integer A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final java.util.Set A0N;
    public final InterfaceC09390do A0O;
    public final InterfaceC09390do A0P;
    public final C09530e4 A0Q;
    public final ValueAnimator A0R;

    public C37841Gkv(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num, String str, String str2, String str3, C09530e4 c09530e4) {
        this.A0C = context;
        this.A0I = userSession;
        this.A0M = str;
        this.A0H = interfaceC11380iw;
        this.A0Q = c09530e4;
        this.A0K = str2;
        this.A0L = str3;
        this.A0J = num;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new OvershootInterpolator());
        alphaAnimation.setStartOffset(250L);
        alphaAnimation.setDuration(350L);
        this.A0D = alphaAnimation;
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new OvershootInterpolator());
        scaleAnimation.setStartOffset(250L);
        scaleAnimation.setDuration(350L);
        this.A0E = scaleAnimation;
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(200L);
        this.A0F = alphaAnimation2;
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(200L);
        this.A0G = scaleAnimation2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new PathInterpolator(0.17f, 0.17f, 0.0f, 1.0f));
        this.A0R = ofFloat;
        this.A0N = AbstractC31171DnF.A0l();
        this.A09 = C05F.A00;
        this.A0P = AbstractC09440dt.A01(new C50158MDl(this, 14));
        this.A0O = AbstractC09440dt.A01(new C50158MDl(this, 13));
    }

    public static final void A00(C37841Gkv c37841Gkv, Integer num) {
        ViewGroup viewGroup;
        InterfaceC09390do interfaceC09390do;
        c37841Gkv.A09 = num;
        GradientSpinnerAvatarView gradientSpinnerAvatarView = c37841Gkv.A08;
        if (gradientSpinnerAvatarView != null) {
            gradientSpinnerAvatarView.setAlpha(1.0f);
        }
        IgTextView igTextView = c37841Gkv.A05;
        if (igTextView != null) {
            igTextView.setAlpha(1.0f);
        }
        IgImageView igImageView = c37841Gkv.A07;
        if (igImageView != null) {
            igImageView.setAlpha(1.0f);
        }
        IgTextView igTextView2 = c37841Gkv.A06;
        if (igTextView2 != null) {
            igTextView2.setAlpha(1.0f);
        }
        GradientSpinnerAvatarView gradientSpinnerAvatarView2 = c37841Gkv.A08;
        if (gradientSpinnerAvatarView2 != null) {
            gradientSpinnerAvatarView2.setRotation(0.0f);
        }
        IgImageView igImageView2 = c37841Gkv.A07;
        if (igImageView2 != null) {
            igImageView2.setRotation(0.0f);
        }
        ViewGroup viewGroup2 = c37841Gkv.A03;
        if (viewGroup2 != null) {
            AbstractC13880nE.A0g(viewGroup2, -2);
        }
        Integer num2 = c37841Gkv.A09;
        Integer num3 = C05F.A00;
        GradientSpinnerAvatarView gradientSpinnerAvatarView3 = c37841Gkv.A08;
        if (num2 == num3) {
            if (gradientSpinnerAvatarView3 != null) {
                gradientSpinnerAvatarView3.setVisibility(0);
            }
            IgTextView igTextView3 = c37841Gkv.A05;
            if (igTextView3 != null) {
                igTextView3.setVisibility(0);
            }
            IgImageView igImageView3 = c37841Gkv.A07;
            if (igImageView3 != null) {
                igImageView3.setVisibility(8);
            }
            IgTextView igTextView4 = c37841Gkv.A06;
            if (igTextView4 != null) {
                igTextView4.setVisibility(8);
            }
            viewGroup = c37841Gkv.A04;
            if (viewGroup != null) {
                interfaceC09390do = c37841Gkv.A0P;
            } else {
                return;
            }
        } else {
            if (gradientSpinnerAvatarView3 != null) {
                gradientSpinnerAvatarView3.setVisibility(8);
            }
            IgTextView igTextView5 = c37841Gkv.A05;
            if (igTextView5 != null) {
                igTextView5.setVisibility(8);
            }
            IgImageView igImageView4 = c37841Gkv.A07;
            if (igImageView4 != null) {
                igImageView4.setVisibility(0);
            }
            IgTextView igTextView6 = c37841Gkv.A06;
            if (igTextView6 != null) {
                igTextView6.setVisibility(0);
            }
            viewGroup = c37841Gkv.A04;
            if (viewGroup == null) {
                return;
            } else {
                interfaceC09390do = c37841Gkv.A0O;
            }
        }
        AbstractC13880nE.A0a(viewGroup, AbstractC167027dH.A01(interfaceC09390do));
    }

    public static final void A01(C37841Gkv c37841Gkv, Integer num) {
        ViewGroup viewGroup;
        InterfaceC09390do interfaceC09390do;
        ViewGroup viewGroup2 = c37841Gkv.A03;
        if (viewGroup2 != null) {
            int width = viewGroup2.getWidth();
            ValueAnimator valueAnimator = c37841Gkv.A0R;
            if (!valueAnimator.isRunning()) {
                if (num == C05F.A00) {
                    GradientSpinnerAvatarView gradientSpinnerAvatarView = c37841Gkv.A08;
                    if (gradientSpinnerAvatarView != null) {
                        gradientSpinnerAvatarView.setVisibility(0);
                    }
                    IgTextView igTextView = c37841Gkv.A05;
                    if (igTextView != null) {
                        igTextView.setVisibility(0);
                    }
                    GradientSpinnerAvatarView gradientSpinnerAvatarView2 = c37841Gkv.A08;
                    if (gradientSpinnerAvatarView2 != null) {
                        gradientSpinnerAvatarView2.setRotation(54.000004f);
                    }
                    viewGroup = c37841Gkv.A04;
                    if (viewGroup != null) {
                        interfaceC09390do = c37841Gkv.A0O;
                        AbstractC13880nE.A0a(viewGroup, AbstractC167027dH.A01(interfaceC09390do));
                    }
                    valueAnimator.removeAllListeners();
                    valueAnimator.addUpdateListener(new C41786If2(c37841Gkv, num, width));
                    valueAnimator.addListener(new C46073KaU(1, num, c37841Gkv));
                    valueAnimator.start();
                }
                IgImageView igImageView = c37841Gkv.A07;
                if (igImageView != null) {
                    igImageView.setVisibility(0);
                }
                IgTextView igTextView2 = c37841Gkv.A06;
                if (igTextView2 != null) {
                    igTextView2.setVisibility(0);
                }
                IgImageView igImageView2 = c37841Gkv.A07;
                if (igImageView2 != null) {
                    igImageView2.setRotation(-54.000004f);
                }
                viewGroup = c37841Gkv.A04;
                if (viewGroup != null) {
                    interfaceC09390do = c37841Gkv.A0P;
                    AbstractC13880nE.A0a(viewGroup, AbstractC167027dH.A01(interfaceC09390do));
                }
                valueAnimator.removeAllListeners();
                valueAnimator.addUpdateListener(new C41786If2(c37841Gkv, num, width));
                valueAnimator.addListener(new C46073KaU(1, num, c37841Gkv));
                valueAnimator.start();
            }
        }
    }
}
