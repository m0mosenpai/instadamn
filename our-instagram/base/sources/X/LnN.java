package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Random;

/* loaded from: classes8.dex */
public final class LnN implements InterfaceC165827bA {
    public static boolean A04;
    public AnimatorSet A00;
    public final UserSession A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A00(EnumC09460dv.A02, MGA.A00);
    public final AbstractC59962oe A03;

    @Override // X.InterfaceC165827bA
    public final boolean Cou(String str, String str2, String str3, String str4) {
        Integer num;
        boolean A1Z;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        int A06 = AbstractC167007dF.A06(1, str2, str3);
        if (str != null && str.length() != 0) {
            if (A04) {
                return true;
            }
            UserSession userSession = this.A01;
            C81663kb A0d = AbstractC43594JPz.A0d(userSession, str2);
            if (A0d != null && !A0d.CYg() && !A0d.CPl() && !A0d.CdS() && !A0d.isPending()) {
                if (AbstractC23085AFr.A00(str, AbstractC23085AFr.A01) && C18U.A06(C06090Tz.A05, userSession, 36330247888651012L)) {
                    num = C05F.A00;
                } else if (AbstractC23085AFr.A00(str, AbstractC23085AFr.A00) && C18U.A06(C06090Tz.A05, userSession, 36330960853288034L)) {
                    num = C05F.A01;
                } else {
                    num = C05F.A0C;
                }
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue == 1) {
                        if ("tap".equals(str4)) {
                            LXX lxx = (LXX) userSession.A01(LXX.class, MHS.A00(userSession, 4));
                            boolean A1Z2 = AbstractC31172DnG.A1Z(userSession, str3);
                            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(lxx.A00, "direct_halloween_animation_activation_tap");
                            A0f.A7v("is_sender", AbstractC31173DnH.A0e(A0f, "open_thread_id", str2, A1Z2));
                            A0f.Cht();
                        }
                        AbstractC59962oe abstractC59962oe = this.A03;
                        A1Z = AbstractC31172DnG.A1Z(userSession, str3);
                        View view = abstractC59962oe.mView;
                        if (view != null && (viewGroup2 = (ViewGroup) view.findViewById(R.id.animation_container)) != null) {
                            viewGroup2.setVisibility(0);
                            Context context = viewGroup2.getContext();
                            ImageView imageView = new ImageView(context);
                            AbstractC43593JPy.A1B(imageView, -1);
                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            viewGroup2.addView(imageView);
                            Drawable drawable = context.getDrawable(R.drawable.special_moments_bat_animation_special_moments_bat_animation);
                            C14360o3.A0C(drawable, "null cannot be cast to non-null type com.facebook.keyframes.network.KeyframesNetworkDrawableLite");
                            AbstractC58662mP abstractC58662mP = (AbstractC58662mP) drawable;
                            abstractC58662mP.EMk(0.0f);
                            abstractC58662mP.A8x(new U5Q(imageView, 21));
                            imageView.setVisibility(0);
                            imageView.setImageDrawable(abstractC58662mP);
                            A04 = true;
                            abstractC58662mP.E4S();
                            InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(((LXX) userSession.A01(LXX.class, MHS.A00(userSession, 4))).A00, "direct_halloween_animation");
                            AbstractC31171DnF.A1G(A0f2, str4);
                            A0f2.A7v("is_sender", AbstractC31173DnH.A0e(A0f2, "open_thread_id", str2, A1Z));
                            A0f2.Cht();
                            return true;
                        }
                        return true;
                    }
                } else if ("tap".equals(str4)) {
                    LXX lxx2 = (LXX) userSession.A01(LXX.class, MHS.A00(userSession, 4));
                    boolean A1Z3 = AbstractC31172DnG.A1Z(userSession, str3);
                    InterfaceC02590Ai A0f3 = AbstractC166987dD.A0f(lxx2.A00, "direct_halloween_animation_activation_tap");
                    A0f3.A7v("is_sender", AbstractC31173DnH.A0e(A0f3, "open_thread_id", str2, A1Z3));
                    A0f3.Cht();
                    AbstractC59962oe abstractC59962oe2 = this.A03;
                    A1Z = AbstractC31172DnG.A1Z(userSession, str3);
                    View view2 = abstractC59962oe2.mView;
                    if (view2 == null || (viewGroup = (ViewGroup) view2.findViewById(R.id.animation_container)) == null) {
                        return true;
                    }
                    viewGroup.setVisibility(0);
                    viewGroup.removeAllViews();
                    Context context2 = viewGroup.getContext();
                    C14360o3.A0A(context2);
                    int A0A = AbstractC13880nE.A0A(context2);
                    int A09 = AbstractC13880nE.A09(context2);
                    List A0J = AbstractC009903n.A0J(EnumC46152Kbq.values());
                    if (this.A00 == null) {
                        this.A00 = new AnimatorSet();
                    }
                    int i = 0;
                    do {
                        TextView textView = new TextView(context2);
                        viewGroup.addView(textView);
                        AbstractC43593JPy.A1B(textView, -2);
                        textView.setText("🕷️");
                        textView.setTextSize(30.0f);
                        EnumC46152Kbq enumC46152Kbq = (EnumC46152Kbq) AbstractC001800i.A0I(C0eM.A1H(A0J));
                        float f = A02(context2, enumC46152Kbq, A09, A0A).A01;
                        float f2 = A01(context2, enumC46152Kbq, A09, A0A).A01;
                        float f3 = A02(context2, enumC46152Kbq, A09, A0A).A00;
                        float f4 = A01(context2, enumC46152Kbq, A09, A0A).A00;
                        textView.setRotation((float) (((Math.atan2(f2 - f, f4 - f3) * 180.0d) / 3.141592653589793d) - 90.0d));
                        textView.setX(f3);
                        textView.setY(f);
                        AnimatorSet animatorSet = new AnimatorSet();
                        float[] fArr = new float[A06];
                        fArr[0] = f3;
                        fArr[1] = f4;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "translationX", fArr);
                        float[] fArr2 = new float[A06];
                        fArr2[0] = f;
                        fArr2[1] = f2;
                        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(textView, "translationY", fArr2));
                        animatorSet.setDuration(((Random) this.A02.getValue()).nextInt(200) + 4800);
                        animatorSet.setStartDelay(i * 200);
                        AnimatorSet animatorSet2 = this.A00;
                        if (animatorSet2 != null) {
                            animatorSet2.playTogether(animatorSet);
                        }
                        if (C18U.A06(C06090Tz.A05, userSession, 36330247888716549L)) {
                            C0fQ.A00(new LQ1(25, animatorSet, textView), textView);
                        }
                        i++;
                    } while (i < 12);
                    AnimatorSet animatorSet3 = this.A00;
                    if (animatorSet3 != null) {
                        LLs.A00(animatorSet3, viewGroup, 8);
                    }
                    AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
                    AnimatorSet animatorSet4 = this.A00;
                    if (animatorSet4 != null) {
                        animatorSet4.setInterpolator(accelerateInterpolator);
                    }
                    AnimatorSet animatorSet5 = this.A00;
                    if (animatorSet5 != null) {
                        animatorSet5.start();
                    }
                    A04 = true;
                    InterfaceC02590Ai A0f22 = AbstractC166987dD.A0f(((LXX) userSession.A01(LXX.class, MHS.A00(userSession, 4))).A00, "direct_halloween_animation");
                    AbstractC31171DnF.A1G(A0f22, str4);
                    A0f22.A7v("is_sender", AbstractC31173DnH.A0e(A0f22, "open_thread_id", str2, A1Z));
                    A0f22.Cht();
                    return true;
                }
            }
        }
        return false;
    }

    public static int A00(LnN lnN, int i) {
        return ((Random) lnN.A02.getValue()).nextInt(i);
    }

    private final C47569Kzf A01(Context context, EnumC46152Kbq enumC46152Kbq, int i, int i2) {
        float f;
        float f2;
        float A00 = AbstractC13880nE.A00(context, 40.0f);
        int ordinal = enumC46152Kbq.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        f = A00(this, i2);
                        f2 = -A00;
                        return new C47569Kzf(f, f2);
                    }
                    throw B4Z.A00();
                }
                f = A00(this, i2);
                f2 = i;
                return new C47569Kzf(f, f2);
            }
            f = -A00;
        } else {
            f = i2;
        }
        i = A00(this, i);
        f2 = i;
        return new C47569Kzf(f, f2);
    }

    private final C47569Kzf A02(Context context, EnumC46152Kbq enumC46152Kbq, int i, int i2) {
        float f;
        float A00;
        float A002 = AbstractC13880nE.A00(context, 40.0f);
        int ordinal = enumC46152Kbq.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        f = A00(this, i2);
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    f = A00(this, i2);
                    A00 = -A002;
                }
            } else {
                f = i2;
                i = A00(this, i);
            }
            A00 = i;
        } else {
            f = -A002;
            A00 = A00(this, i);
        }
        return new C47569Kzf(f, A00);
    }

    public LnN(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        this.A01 = userSession;
        this.A03 = abstractC59962oe;
    }
}
