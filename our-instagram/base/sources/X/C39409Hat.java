package X;

import android.animation.Animator;
import android.view.ViewTreeObserver;
import java.util.List;

/* renamed from: X.Hat, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39409Hat extends AbstractC87373uv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C41583IaW A01;
    public final /* synthetic */ List A02;

    public C39409Hat(C41583IaW c41583IaW, List list, int i) {
        this.A01 = c41583IaW;
        this.A02 = list;
        this.A00 = i;
    }

    @Override // X.AbstractC87373uv, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A02.clear();
        C41583IaW c41583IaW = this.A01;
        int i = this.A00;
        ViewTreeObserver viewTreeObserver = c41583IaW.A02.CFj().getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC42067Ika(viewTreeObserver, c41583IaW, i));
        c41583IaW.A01.AGt();
    }
}
