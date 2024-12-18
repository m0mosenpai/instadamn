package X;

import android.animation.Animator;

/* renamed from: X.KaQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46069KaQ extends AbstractC87373uv {
    public final /* synthetic */ InterfaceC16820sZ A00;

    public C46069KaQ(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }

    @Override // X.AbstractC87373uv, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.invoke();
    }
}
