package X;

import android.view.ViewTreeObserver;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.Fpm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC35712Fpm implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ IgdsInlineSearchBox A00;

    public ViewTreeObserverOnGlobalLayoutListenerC35712Fpm(IgdsInlineSearchBox igdsInlineSearchBox) {
        this.A00 = igdsInlineSearchBox;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        IgdsInlineSearchBox igdsInlineSearchBox = this.A00;
        AbstractC166997dE.A1K(igdsInlineSearchBox, this);
        if (igdsInlineSearchBox.isAttachedToWindow()) {
            igdsInlineSearchBox.A04();
        }
    }
}
