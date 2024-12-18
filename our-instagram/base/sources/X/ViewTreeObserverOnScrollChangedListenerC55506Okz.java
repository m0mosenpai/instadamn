package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

/* renamed from: X.Okz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewTreeObserverOnScrollChangedListenerC55506Okz implements ViewTreeObserver.OnScrollChangedListener {
    public final View A00;
    public final ScrollView A01;
    public final InterfaceC57965PnB A02;

    public ViewTreeObserverOnScrollChangedListenerC55506Okz(View view, ScrollView scrollView, InterfaceC57965PnB interfaceC57965PnB) {
        this.A01 = scrollView;
        this.A00 = view;
        this.A02 = interfaceC57965PnB;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        Rect A0U = AbstractC166987dD.A0U();
        ScrollView scrollView = this.A01;
        scrollView.getHitRect(A0U);
        if (this.A00.getLocalVisibleRect(A0U)) {
            this.A02.D39();
            scrollView.getViewTreeObserver().removeOnScrollChangedListener(this);
        }
    }
}
