package X;

import android.transition.Transition;
import android.view.View;
import com.google.android.material.transition.platform.MaterialContainerTransform;

/* loaded from: classes11.dex */
public final class WKj implements Transition.TransitionListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C66304U8c A03;
    public final /* synthetic */ MaterialContainerTransform A04;

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        MaterialContainerTransform materialContainerTransform = this.A04;
        materialContainerTransform.removeListener(this);
        if (!materialContainerTransform.holdAtEndEnabled) {
            this.A02.setAlpha(1.0f);
            this.A01.setAlpha(1.0f);
            View view = this.A00;
            (view != null ? view.getOverlay() : null).remove(this.A03);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        View view = this.A00;
        (view != null ? view.getOverlay() : null).add(this.A03);
        this.A02.setAlpha(0.0f);
        this.A01.setAlpha(0.0f);
    }

    public WKj(View view, View view2, View view3, C66304U8c c66304U8c, MaterialContainerTransform materialContainerTransform) {
        this.A04 = materialContainerTransform;
        this.A00 = view;
        this.A03 = c66304U8c;
        this.A02 = view2;
        this.A01 = view3;
    }

    public WKj() {
    }
}
