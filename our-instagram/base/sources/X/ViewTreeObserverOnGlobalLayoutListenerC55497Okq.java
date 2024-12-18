package X;

import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;

/* renamed from: X.Okq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC55497Okq implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public ViewTreeObserverOnGlobalLayoutListenerC55497Okq(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        switch (this.A00) {
            case 0:
                InterfaceC58203Pr9 interfaceC58203Pr9 = ((C52254NAu) this.A02).A0R;
                interfaceC58203Pr9.CFv().removeOnGlobalLayoutListener(this);
                interfaceC58203Pr9.EMH(this.A01, interfaceC58203Pr9.CEh());
                return;
            case 1:
                NestedScrollView nestedScrollView = (NestedScrollView) this.A02;
                nestedScrollView.post(new PQ5(nestedScrollView, this.A01));
                AbstractC166997dE.A1K(nestedScrollView, this);
                return;
            default:
                C56274Oyj c56274Oyj = (C56274Oyj) this.A02;
                ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK = c56274Oyj.A03;
                if (viewOnClickListenerC44797JsK != null) {
                    MSZ.A15(viewOnClickListenerC44797JsK, this);
                    boolean A02 = C2J9.A02(c56274Oyj.A04);
                    ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK2 = c56274Oyj.A03;
                    if (A02) {
                        if (viewOnClickListenerC44797JsK2 != null) {
                            i = this.A01;
                            viewOnClickListenerC44797JsK2.A1H(i);
                            return;
                        }
                    } else if (viewOnClickListenerC44797JsK2 != null) {
                        i = 0;
                        viewOnClickListenerC44797JsK2.A1H(i);
                        return;
                    }
                }
                C14360o3.A0F("filterPicker");
                throw C00O.createAndThrow();
        }
    }
}
