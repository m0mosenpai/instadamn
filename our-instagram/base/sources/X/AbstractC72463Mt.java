package X;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;

/* renamed from: X.3Mt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC72463Mt extends AbstractC72473Mu implements InterfaceC11380iw, C1GL, InterfaceC59992oh, InterfaceC60002oi, InterfaceC60012oj, InterfaceC60052on, InterfaceC60062oo {
    public static final String __redex_internal_original_name = "IgDialogFragmentCompat";
    public C3DI A00;
    public final C60462pV A01 = new C60462pV();
    public final C60482pX A02 = new C60482pX();

    public abstract AbstractC12990ll A0M();

    @Override // X.InterfaceC60012oj
    public final void addFragmentVisibilityListener(InterfaceC71183He interfaceC71183He) {
        C14360o3.A0B(interfaceC71183He, 0);
        this.A02.addFragmentVisibilityListener(interfaceC71183He);
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return AbstractC140796Yh.A01(this, i2, z, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        this.A01.A0C(view);
    }

    @Override // X.InterfaceC59992oh
    public final void registerLifecycleListener(InterfaceC60602pj interfaceC60602pj) {
        C14360o3.A0B(interfaceC60602pj, 0);
        this.A01.A0E(interfaceC60602pj);
    }

    @Override // X.InterfaceC60012oj
    public final void removeFragmentVisibilityListener(InterfaceC71183He interfaceC71183He) {
        C14360o3.A0B(interfaceC71183He, 0);
        this.A02.removeFragmentVisibilityListener(interfaceC71183He);
    }

    @Override // X.InterfaceC59992oh
    public final void unregisterLifecycleListener(InterfaceC60602pj interfaceC60602pj) {
        C14360o3.A0B(interfaceC60602pj, 0);
        this.A01.A00.remove(interfaceC60602pj);
    }

    @Override // X.AbstractC72483Mv
    public void A0I() {
        this.A01.A05();
        C3DI c3di = this.A00;
        if (c3di != null) {
            c3di.A00();
        }
    }

    @Override // X.InterfaceC60002oi
    public final C3DI getFragmentVisibilityDetector() {
        return this.A00;
    }

    @Override // X.C1GL
    public final void schedule(C11R c11r) {
        if (c11r != null) {
            C1GJ.A00(requireContext(), AbstractC018607g.A00(this), c11r);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC60052on
    public final Activity getRootActivity() {
        Context context = getContext();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            Activity parent = activity.getParent();
            if (parent != null) {
                return parent;
            }
            return activity;
        }
        throw new RuntimeException("Fragment is not attached.");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.A01.A08(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final Animator onCreateAnimator(int i, boolean z, int i2) {
        return AbstractC140796Yh.A00(this, i2, z);
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        int A02 = C0f9.A02(243126670);
        super.onViewStateRestored(bundle);
        this.A01.A0B(bundle);
        C0f9.A09(907210736, A02);
    }

    @Override // X.C1GL
    public final void schedule(C11R c11r, int i, int i2, boolean z, boolean z2) {
        schedule(c11r);
    }
}
