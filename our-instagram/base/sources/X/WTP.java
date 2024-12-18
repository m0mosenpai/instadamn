package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class WTP implements InterfaceC51602Yi {
    public static final WTP A00 = new WTP();

    @Override // X.InterfaceC51602Yi
    public final int BeY(View view, int i) {
        if (view instanceof UDx) {
            view = ((UDx) view).A00;
        }
        int measuredHeight = view.getMeasuredHeight();
        if (measuredHeight > i) {
            return i;
        }
        return measuredHeight;
    }
}
