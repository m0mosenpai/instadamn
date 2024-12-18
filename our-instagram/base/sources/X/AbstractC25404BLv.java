package X;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.view.Display;
import android.view.View;

/* renamed from: X.BLv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25404BLv {
    public static final InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C25469BOi.A00);

    public static final void A00(View view, boolean z) {
        if (z) {
            if (view != null) {
                view.setLayerType(2, (Paint) A00.getValue());
            }
        } else {
            if (view == null) {
                return;
            }
            view.setLayerType(0, null);
        }
    }

    public static final boolean A01(Context context) {
        Display display;
        if (Build.VERSION.SDK_INT >= 34 && (display = AbstractC13330mJ.A00(context).getDisplay()) != null && display.isHdrSdrRatioAvailable()) {
            return true;
        }
        return false;
    }
}
