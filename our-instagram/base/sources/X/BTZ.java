package X;

import android.view.View;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* loaded from: classes5.dex */
public final class BTZ extends AbstractC60592pi {
    public final /* synthetic */ InterfaceC59992oh A00;
    public final /* synthetic */ BottomSheetFragment A01;

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        C14360o3.A0B(view, 0);
        BottomSheetFragment bottomSheetFragment = this.A01;
        if (C18U.A06(C06090Tz.A05, bottomSheetFragment.getSession(), 36314103111616969L)) {
            ViewTreeObserverOnPreDrawListenerC25701BXl viewTreeObserverOnPreDrawListenerC25701BXl = new ViewTreeObserverOnPreDrawListenerC25701BXl(2, view, bottomSheetFragment);
            view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC25701BXl);
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC44250Jgu(viewTreeObserverOnPreDrawListenerC25701BXl, 5));
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC25701BXl(1, view, bottomSheetFragment));
    }

    public BTZ(InterfaceC59992oh interfaceC59992oh, BottomSheetFragment bottomSheetFragment) {
        this.A01 = bottomSheetFragment;
        this.A00 = interfaceC59992oh;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        this.A00.unregisterLifecycleListener(this);
    }
}
