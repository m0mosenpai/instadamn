package X;

import android.view.View;
import com.facebook.R;
import com.facebook.litho.ComponentHost;

/* renamed from: X.3er, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78253er {
    public static final void A00(View view) {
        boolean z = view instanceof ComponentHost;
        if (!z && view.getTag(R.id.component_node_info) == null) {
            return;
        }
        view.setTag(R.id.component_node_info, null);
        if (z) {
            return;
        }
        AbstractC010103p.A0B(view, null);
    }

    public final void A01(View view) {
        C2YG c2yg;
        if (view instanceof ComponentHost) {
            c2yg = ((ComponentHost) view).A07;
        } else {
            Object tag = view.getTag(R.id.component_focus_change_listener);
            if (!(tag instanceof C2YG)) {
                return;
            } else {
                c2yg = (C2YG) tag;
            }
        }
        if (c2yg != null) {
            c2yg.A00 = null;
        }
    }

    public final void A02(View view) {
        C2X2 c2x2;
        if (view instanceof ComponentHost) {
            c2x2 = ((ComponentHost) view).A08;
        } else {
            Object tag = view.getTag(R.id.component_long_click_listener);
            if (!(tag instanceof C2X2)) {
                return;
            } else {
                c2x2 = (C2X2) tag;
            }
        }
        if (c2x2 != null) {
            c2x2.A00 = null;
        }
    }

    public final void A03(View view) {
        ViewOnTouchListenerC51412Xo viewOnTouchListenerC51412Xo;
        if (view instanceof ComponentHost) {
            viewOnTouchListenerC51412Xo = ((ComponentHost) view).A09;
        } else {
            Object tag = view.getTag(R.id.component_touch_listener);
            if (!(tag instanceof ViewOnTouchListenerC51412Xo)) {
                return;
            } else {
                viewOnTouchListenerC51412Xo = (ViewOnTouchListenerC51412Xo) tag;
            }
        }
        if (viewOnTouchListenerC51412Xo != null) {
            viewOnTouchListenerC51412Xo.A00 = null;
        }
    }
}
