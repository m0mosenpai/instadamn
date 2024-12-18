package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;

/* loaded from: classes6.dex */
public final class EVO extends AbstractC60592pi {
    public final Activity A00;

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        ComponentCallbacks2 componentCallbacks2 = this.A00;
        if (componentCallbacks2 instanceof InterfaceC53712dA) {
            C14360o3.A0C(componentCallbacks2, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
            ((InterfaceC53712dA) componentCallbacks2).EfL(0);
        }
    }

    public static void A00(AbstractC59962oe abstractC59962oe) {
        C60462pV c60462pV = new C60462pV();
        c60462pV.A0E(new EVO(abstractC59962oe.getActivity()));
        abstractC59962oe.registerLifecycleListenerSet(c60462pV);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        ComponentCallbacks2 componentCallbacks2 = this.A00;
        if (componentCallbacks2 instanceof InterfaceC53712dA) {
            C14360o3.A0C(componentCallbacks2, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
            ((InterfaceC53712dA) componentCallbacks2).EfL(8);
        }
    }

    public EVO(Activity activity) {
        this.A00 = activity;
    }

    public static void A01(AbstractC59962oe abstractC59962oe) {
        abstractC59962oe.registerLifecycleListener(new EVO(abstractC59962oe.requireActivity()));
    }
}
