package X;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.LinkedHashSet;

/* renamed from: X.Cla, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC28688Cla implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewTreeObserverOnGlobalLayoutListenerC28688Cla(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C138746Qe c138746Qe;
        int i = this.A00;
        ViewGroup viewGroup = (ViewGroup) this.A01;
        viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        C28191Cbf c28191Cbf = BFS.A04;
        LinkedHashSet A00 = C28191Cbf.A00(viewGroup, c28191Cbf, 14);
        LinkedHashSet A002 = C28191Cbf.A00(viewGroup, c28191Cbf, 15);
        Object obj = this.A02;
        if (i != 0) {
            C29375Cx8 c29375Cx8 = ((C2K) obj).A03;
            if (c29375Cx8 == null || (c138746Qe = c29375Cx8.A00) == null) {
                return;
            }
        } else {
            c138746Qe = (C138746Qe) obj;
        }
        c138746Qe.A00 = A00.size() + A002.size();
        C138746Qe.A02(c138746Qe, AbstractC111324zv.A00(4875));
    }
}
