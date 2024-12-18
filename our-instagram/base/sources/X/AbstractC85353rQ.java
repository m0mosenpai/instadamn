package X;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.animation.LinearInterpolator;
import com.instagram.common.session.UserSession;

/* renamed from: X.3rQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC85353rQ {
    public static final C9BH A00(AnimatorListenerAdapter animatorListenerAdapter, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(C85363rR.A00(userSession));
        ofFloat.addUpdateListener(animatorUpdateListener);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.setDuration(C85363rR.A01(userSession));
        ofFloat2.setStartDelay(C18U.A01(C06090Tz.A05, userSession, 36602093550441032L));
        ofFloat2.addUpdateListener(animatorUpdateListener);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        animatorSet.addListener(animatorListenerAdapter);
        return new C9BH(animatorSet, 4);
    }

    public static final C9BH A01(ValueAnimator.AnimatorUpdateListener animatorUpdateListener, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(C85363rR.A01(userSession));
        ofFloat.addUpdateListener(animatorUpdateListener);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.setDuration(C85363rR.A00(userSession));
        ofFloat2.setStartDelay(C18U.A01(C06090Tz.A05, userSession, 36602093550441032L));
        ofFloat2.addUpdateListener(animatorUpdateListener);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        return new C9BH(animatorSet, 4);
    }

    public static final void A02(Handler handler, UserSession userSession, MOL mol) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(handler, 2);
        handler.postDelayed(new RunnableC49850Lzv(mol), C18U.A01(C06090Tz.A05, userSession, 36602093550572106L));
    }
}
