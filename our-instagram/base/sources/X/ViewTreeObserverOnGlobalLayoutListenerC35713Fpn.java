package X;

import android.view.ViewTreeObserver;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.Fpn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC35713Fpn implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ SearchEditText A00;

    public ViewTreeObserverOnGlobalLayoutListenerC35713Fpn(SearchEditText searchEditText) {
        this.A00 = searchEditText;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        SearchEditText searchEditText = this.A00;
        AbstractC166997dE.A1K(searchEditText, this);
        if (searchEditText.isAttachedToWindow()) {
            searchEditText.A06();
        }
    }
}
