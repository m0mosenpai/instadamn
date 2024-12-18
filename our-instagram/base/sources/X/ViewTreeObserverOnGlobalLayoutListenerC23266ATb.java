package X;

import android.view.ViewTreeObserver;
import com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager;

/* renamed from: X.ATb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC23266ATb implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ViewTreeObserver A00;
    public final /* synthetic */ StickyHeadersLinearLayoutManager A01;

    public ViewTreeObserverOnGlobalLayoutListenerC23266ATb(ViewTreeObserver viewTreeObserver, StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
        this.A00 = viewTreeObserver;
        this.A01 = stickyHeadersLinearLayoutManager;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.A00.removeOnGlobalLayoutListener(this);
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = this.A01;
        int i = stickyHeadersLinearLayoutManager.A01;
        if (i != -1) {
            stickyHeadersLinearLayoutManager.A1p(i, stickyHeadersLinearLayoutManager.A00);
            stickyHeadersLinearLayoutManager.A01 = -1;
            stickyHeadersLinearLayoutManager.A00 = Integer.MIN_VALUE;
        }
    }
}
