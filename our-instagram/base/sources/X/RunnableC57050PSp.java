package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;

/* renamed from: X.PSp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57050PSp implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C55210OeT A02;

    public RunnableC57050PSp(C55210OeT c55210OeT, int i, int i2) {
        this.A02 = c55210OeT;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C55210OeT c55210OeT = this.A02;
        ReboundHorizontalScrollView reboundHorizontalScrollView = c55210OeT.A09;
        if (reboundHorizontalScrollView.isLaidOut()) {
            C55210OeT.A06(c55210OeT, this.A00, this.A01, false);
            return;
        }
        RunnableC57049PSo runnableC57049PSo = new RunnableC57049PSo(c55210OeT, this.A00, this.A01);
        View.OnLayoutChangeListener onLayoutChangeListener = c55210OeT.A00;
        if (onLayoutChangeListener != null) {
            reboundHorizontalScrollView.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        ViewOnLayoutChangeListenerC55474OkT viewOnLayoutChangeListenerC55474OkT = new ViewOnLayoutChangeListenerC55474OkT(3, c55210OeT, runnableC57049PSo);
        c55210OeT.A00 = viewOnLayoutChangeListenerC55474OkT;
        reboundHorizontalScrollView.addOnLayoutChangeListener(viewOnLayoutChangeListenerC55474OkT);
    }
}
