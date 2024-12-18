package X;

import android.animation.Animator;
import com.facebook.R;
import java.util.AbstractMap;

/* renamed from: X.U5v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66251U5v implements Animator.AnimatorListener {
    public final /* synthetic */ C6FG A00;
    public final /* synthetic */ C63142tr A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C66251U5v(C6FG c6fg, C63142tr c63142tr, String str, boolean z) {
        this.A03 = z;
        this.A00 = c6fg;
        this.A02 = str;
        this.A01 = c63142tr;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.A03) {
            C6FG c6fg = this.A00;
            ((AbstractMap) c6fg.A00(R.id.bk_context_key_animations)).remove(this.A02);
        }
        C63142tr c63142tr = this.A01;
        if (c63142tr != null) {
            c63142tr.A00(this.A00, this.A02);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.A03) {
            C6FG c6fg = this.A00;
            ((AbstractMap) c6fg.A00(R.id.bk_context_key_animations)).remove(this.A02);
        }
        C63142tr c63142tr = this.A01;
        if (c63142tr != null) {
            c63142tr.A00(this.A00, this.A02);
        }
    }
}
