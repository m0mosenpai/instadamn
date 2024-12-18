package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6o8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149566o8 {
    public AnonymousClass693 A00;
    public String A01;
    public float A02;
    public float A03;
    public ImageView A04;
    public final Context A05;
    public final Map A06;
    public final java.util.Set A07;
    public final UserSession A08;

    public C149566o8(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A05 = context;
        this.A08 = userSession;
        this.A07 = new HashSet();
        this.A06 = new HashMap();
        this.A02 = 1.0f;
        this.A03 = 1.0f;
    }

    public final void A03(Animator.AnimatorListener animatorListener, View view) {
        java.util.Set set = this.A07;
        if (!set.contains(view)) {
            set.add(view);
            this.A02 = view.getScaleX();
            this.A03 = view.getScaleY();
            ObjectAnimator A00 = A00(view, "scaleX", true);
            ObjectAnimator A002 = A00(view, "scaleY", true);
            ObjectAnimator A003 = A00(view, "scaleX", false);
            ObjectAnimator A004 = A00(view, "scaleY", false);
            float rotation = view.getRotation();
            float f = 0.0f + rotation;
            float f2 = (-5.0f) + rotation;
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, "rotation", f, f2, rotation + 5.0f, f2, f).setDuration(500L);
            C14360o3.A07(duration);
            duration.setInterpolator(new AccelerateInterpolator());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(A00).with(A002).with(duration);
            animatorSet.play(A003).with(A004).after(A00);
            animatorSet.addListener(animatorListener);
            animatorSet.addListener(new C35282FhH(view, this));
            animatorSet.start();
            this.A06.put(view, animatorSet);
        }
    }

    public final void A04(Animator.AnimatorListener animatorListener, View view, boolean z, boolean z2) {
        long j;
        C14360o3.A0B(view, 0);
        java.util.Set set = this.A07;
        if (!set.contains(view)) {
            set.add(view);
            this.A02 = view.getScaleX();
            this.A03 = view.getScaleY();
            ObjectAnimator A00 = A00(view, "scaleX", true);
            ObjectAnimator A002 = A00(view, "scaleY", true);
            A002.addListener(new C35284FhJ(animatorListener, view, this, z2, z));
            ObjectAnimator A003 = A00(view, "scaleX", false);
            ObjectAnimator A004 = A00(view, "scaleY", false);
            AnimatorSet animatorSet = new AnimatorSet();
            if (z) {
                j = 600;
            } else {
                j = 0;
            }
            animatorSet.setStartDelay(j);
            animatorSet.play(A00).with(A002);
            animatorSet.play(A003).with(A004).after(A00);
            animatorSet.addListener(new C35285FhK(animatorListener, view, this, z2, z));
            animatorSet.start();
            this.A06.put(view, animatorSet);
        }
    }

    private final ObjectAnimator A00(View view, String str, boolean z) {
        float f;
        long j;
        TimeInterpolator accelerateInterpolator;
        if ("scaleX".equals(str)) {
            f = this.A02;
        } else {
            f = this.A03;
        }
        float[] fArr = new float[2];
        float f2 = 1.0f;
        float f3 = 1.15f;
        if (z) {
            f3 = 1.0f;
        }
        fArr[0] = f3 * f;
        if (z) {
            f2 = 1.15f;
        }
        fArr[1] = f * f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
        if (z) {
            j = 400;
        } else {
            j = 200;
        }
        ofFloat.setDuration(j);
        if (z) {
            accelerateInterpolator = new DecelerateInterpolator();
        } else {
            accelerateInterpolator = new AccelerateInterpolator();
        }
        ofFloat.setInterpolator(accelerateInterpolator);
        return ofFloat;
    }

    public final void A01() {
        AnonymousClass693 anonymousClass693 = this.A00;
        if (anonymousClass693 != null) {
            anonymousClass693.pause();
            AnonymousClass693 anonymousClass6932 = this.A00;
            if (anonymousClass6932 != null) {
                anonymousClass6932.EMk(0.0f);
            }
        }
        ImageView imageView = this.A04;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public final void A02(Animator.AnimatorListener animatorListener) {
        AnonymousClass693 anonymousClass693;
        AnonymousClass693 anonymousClass6932;
        if (this.A00 == null) {
            if (C18U.A06(C06090Tz.A05, this.A08, 36326700245596201L)) {
                AnonymousClass693 A00 = C68U.A00(this.A05, R.raw.countdown_sticker_confetti);
                this.A00 = A00;
                if (A00 != null) {
                    A00.A8x(new C31222Do5(this));
                }
                ImageView imageView = this.A04;
                if (imageView != null) {
                    imageView.setImageDrawable(this.A00);
                }
            }
        }
        ImageView imageView2 = this.A04;
        if (imageView2 != null && (anonymousClass693 = this.A00) != null && !anonymousClass693.A03.isRunning()) {
            imageView2.setVisibility(0);
            if (animatorListener != null && (anonymousClass6932 = this.A00) != null) {
                anonymousClass6932.A8x(animatorListener);
            }
            AnonymousClass693 anonymousClass6933 = this.A00;
            if (anonymousClass6933 != null) {
                anonymousClass6933.EMk(0.0f);
            }
            AnonymousClass693 anonymousClass6934 = this.A00;
            if (anonymousClass6934 != null) {
                anonymousClass6934.E4S();
            }
        }
    }

    public final void A05(ImageView imageView, InterfaceC41201vU interfaceC41201vU) {
        String str;
        this.A04 = imageView;
        if (!C18U.A06(C06090Tz.A05, this.A08, 36326700245596201L)) {
            AnonymousClass693 A00 = C68U.A00(this.A05, R.raw.countdown_sticker_confetti);
            this.A00 = A00;
            if (A00 != null) {
                A00.A8x(new C31222Do5(this));
            }
            ImageView imageView2 = this.A04;
            if (imageView2 != null) {
                imageView2.setImageDrawable(this.A00);
            }
        }
        C38321qM BQN = interfaceC41201vU.BQN();
        if (BQN != null) {
            str = BQN.A38();
        } else {
            str = null;
        }
        this.A01 = str;
    }

    public final void A06(InterfaceC41201vU interfaceC41201vU) {
        String str;
        if (this.A00 != null) {
            String str2 = this.A01;
            if (str2 != null) {
                C38321qM BQN = interfaceC41201vU.BQN();
                if (BQN != null) {
                    str = BQN.A38();
                } else {
                    str = null;
                }
                if (str2.equals(str)) {
                    return;
                }
            }
            A01();
            HashSet hashSet = new HashSet();
            Iterator it = this.A07.iterator();
            while (it.hasNext()) {
                hashSet.add(this.A06.get(it.next()));
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                Animator animator = (Animator) it2.next();
                if (animator != null) {
                    animator.cancel();
                    animator.removeAllListeners();
                }
            }
        }
    }
}
