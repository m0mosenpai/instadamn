package X;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes5.dex */
public final class DHD extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DHD(int i, int i2) {
        super(1);
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view;
        C51222Wv c51222Wv = (C51222Wv) obj;
        C14360o3.A0B(c51222Wv, 0);
        Object obj2 = c51222Wv.A00;
        if ((obj2 instanceof View) && (view = (View) obj2) != null) {
            int i = this.A01;
            int i2 = this.A00;
            if (view.isLaidOut() && !view.isLayoutRequested()) {
                AbstractC25236BEt.A0f(new Rect(0, 0, i, i2), view, i, i2);
            } else {
                view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC28671ClJ(i, i2));
            }
        }
        return C0eB.A00;
    }
}
