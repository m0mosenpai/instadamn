package X;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.WGx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70204WGx implements LayoutTransition.TransitionListener {
    public final /* synthetic */ LayoutTransition A00;

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
    }

    public C70204WGx(LayoutTransition layoutTransition) {
        this.A00 = layoutTransition;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        this.A00.disableTransitionType(4);
    }
}
