package com.bloks.foa.components.bottomsheet;

import X.C66242U5m;
import X.C66271U6q;
import X.InterfaceC51602Yi;
import X.InterfaceC71941XBq;
import X.UKP;
import android.view.View;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class ViewDragHelper$Callback {
    public final void A00(View view) {
        C66242U5m c66242U5m = ((UKP) this).A00;
        List list = c66242U5m.A0H;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC71941XBq) it.next()).DZj(view, c66242U5m.getHeight());
            }
        }
    }

    public final void A01(View view, float f) {
        UKP ukp = (UKP) this;
        if (view != null) {
            C66242U5m c66242U5m = ukp.A00;
            int height = c66242U5m.getHeight();
            C66271U6q c66271U6q = c66242U5m.A05;
            c66271U6q.A09.abortAnimation();
            c66271U6q.A09.fling(0, 0, 0, (int) f, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            int finalY = c66271U6q.A09.getFinalY();
            c66271U6q.A09.abortAnimation();
            int top = height - (view.getTop() + finalY);
            List list = c66242U5m.A06;
            if (list == null) {
                list = Collections.emptyList();
            }
            InterfaceC51602Yi A00 = C66242U5m.A00(view, c66242U5m, list, top, height);
            if (A00 != null) {
                c66242U5m.A04 = A00;
                int BeY = height - A00.BeY(view, height);
                try {
                    int i = c66242U5m.A00;
                    if (c66271U6q.A0A) {
                        c66271U6q.A07.getXVelocity(c66271U6q.A02);
                        C66271U6q.A06(c66271U6q, BeY, (int) c66271U6q.A07.getYVelocity(c66271U6q.A02), i);
                        c66242U5m.postInvalidateOnAnimation();
                        return;
                    }
                    throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
                } catch (NullPointerException unused) {
                }
            }
        }
    }
}
