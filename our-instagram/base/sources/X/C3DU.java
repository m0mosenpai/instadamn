package X;

import android.view.View;
import java.util.ArrayList;

/* renamed from: X.3DU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3DU extends AbstractC60592pi {
    public final ArrayList A00 = new ArrayList();

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        C14360o3.A0B(view, 0);
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC65901Tw5(view, this));
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        ArrayList arrayList = this.A00;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = ((C3DV) arrayList.get(size)).A00.A0D;
                if (viewOnTouchListenerC65896Tw0 != null) {
                    viewOnTouchListenerC65896Tw0.A0G();
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        arrayList.clear();
    }
}
