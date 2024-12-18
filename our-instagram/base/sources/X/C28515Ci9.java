package X;

import android.animation.Animator;
import android.media.SoundPool;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ci9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28515Ci9 implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ SoundPool A02;
    public final /* synthetic */ UserSession A03;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C28515Ci9(SoundPool soundPool, UserSession userSession, int i, int i2) {
        this.A03 = userSession;
        this.A02 = soundPool;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (C4AJ.A00(this.A03, null, false, false)) {
            SoundPool soundPool = this.A02;
            int i = this.A01;
            float f = this.A00;
            soundPool.play(i, f, f, 1, 0, 1.0f);
        }
    }
}
