package X;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes5.dex */
public final class BJ6 implements View.OnAttachStateChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public BJ6(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.A00) {
            case 0:
                C5TM c5tm = (C5TM) this.A02;
                C07X A00 = AbstractC55832hO.A00(c5tm);
                if (A00 != null) {
                    ((C15370ps) this.A01).A00 = AbstractC25323BIs.A00(c5tm, A00.getLifecycle());
                    c5tm.removeOnAttachStateChangeListener(this);
                    return;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("View tree for ");
                    sb.append(c5tm);
                    AbstractC28290Cdc.A02(AbstractC166997dE.A0x(" has no ViewTreeLifecycleOwner", sb));
                    throw C00O.createAndThrow();
                }
            case 1:
            case 2:
            default:
                return;
            case 3:
                WEV.A00((Activity) this.A01, (WEV) this.A02);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.A00) {
            case 1:
            case 2:
                ((RecyclerView) this.A01).setAdapter((C2UU) this.A02);
                return;
            case 3:
            default:
                return;
            case 4:
                View view2 = ((C66049Tym) this.A02).A01;
                view2.getViewTreeObserver().removeOnDrawListener((ViewTreeObserverOnDrawListenerC66039Tyb) this.A01);
                view2.removeOnAttachStateChangeListener(this);
                return;
        }
    }
}
