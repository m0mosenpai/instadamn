package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* renamed from: X.BXl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewTreeObserverOnPreDrawListenerC25701BXl implements ViewTreeObserver.OnPreDrawListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewTreeObserverOnPreDrawListenerC25701BXl(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.A00;
        ((View) this.A01).getViewTreeObserver().removeOnPreDrawListener(this);
        Object obj = this.A02;
        if (i != 0) {
            BottomSheetFragment.A08((BottomSheetFragment) obj);
            return false;
        }
        ((Runnable) obj).run();
        return true;
    }
}
