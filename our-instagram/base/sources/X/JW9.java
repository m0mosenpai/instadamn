package X;

import android.view.View;
import com.instagram.feed.ui.rows.mediaheader.layout.CyclicSubtitleLayout;

/* loaded from: classes8.dex */
public final class JW9 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ CyclicSubtitleLayout A00;

    public JW9(CyclicSubtitleLayout cyclicSubtitleLayout) {
        this.A00 = cyclicSubtitleLayout;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A00.setAnimating(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.A00.setAnimating(false);
    }
}
