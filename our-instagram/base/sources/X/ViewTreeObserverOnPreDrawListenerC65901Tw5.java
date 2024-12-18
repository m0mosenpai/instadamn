package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* renamed from: X.Tw5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewTreeObserverOnPreDrawListenerC65901Tw5 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C3DU A01;

    public ViewTreeObserverOnPreDrawListenerC65901Tw5(View view, C3DU c3du) {
        this.A00 = view;
        this.A01 = c3du;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        Number valueOf;
        MSX.A13(this.A00, this);
        ArrayList arrayList = this.A01.A00;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return false;
        }
        while (true) {
            int i = size - 1;
            C3DP c3dp = ((C3DV) arrayList.get(size)).A00;
            C55982hj c55982hj = c3dp.A0u;
            c55982hj.A08(c3dp.A0V ? 1.0d : 0.0d, true);
            c55982hj.A06(1.0d);
            ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = c3dp.A0D;
            if (viewOnTouchListenerC65896Tw0 != null) {
                if (ViewOnTouchListenerC65896Tw0.A0C(viewOnTouchListenerC65896Tw0)) {
                    viewOnTouchListenerC65896Tw0.A0F = C05F.A1I;
                    C55982hj c55982hj2 = viewOnTouchListenerC65896Tw0.A0V;
                    c55982hj2.A0A(viewOnTouchListenerC65896Tw0);
                    if (!viewOnTouchListenerC65896Tw0.A0K && !viewOnTouchListenerC65896Tw0.A0N) {
                        valueOf = 0;
                    } else {
                        valueOf = Float.valueOf(ViewOnTouchListenerC65896Tw0.A00(viewOnTouchListenerC65896Tw0));
                    }
                    c55982hj2.A08(valueOf.doubleValue(), true);
                    c55982hj2.A06(ViewOnTouchListenerC65896Tw0.A00(viewOnTouchListenerC65896Tw0));
                    int i2 = 3;
                    if (viewOnTouchListenerC65896Tw0.A0G) {
                        i2 = 4;
                    }
                    ViewOnTouchListenerC65896Tw0.A09(viewOnTouchListenerC65896Tw0, i2);
                }
                C3I9 c3i9 = viewOnTouchListenerC65896Tw0.A0W;
                Context context = viewOnTouchListenerC65896Tw0.A0U.getContext();
                C14360o3.A0C(context, "null cannot be cast to non-null type android.app.Activity");
                c3i9.Dnr((Activity) context);
                c3i9.A9e(viewOnTouchListenerC65896Tw0);
                viewOnTouchListenerC65896Tw0.A0L = true;
            }
            if (i >= 0) {
                size = i;
            } else {
                return false;
            }
        }
    }
}
