package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Collection;

/* loaded from: classes9.dex */
public final class N29 extends AbstractViewOnTouchListenerC115705Lg {
    public final UserSession A00;
    public final InterfaceC145436h2 A01;
    public final InterfaceC57982PnS A02;
    public final Iterable A03;

    @Override // X.AbstractViewOnTouchListenerC115705Lg
    public final boolean A00(View view, MotionEvent motionEvent) {
        double d;
        double d2;
        float rawX;
        boolean z;
        Iterable<O4M> iterable = this.A03;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (O4M o4m : iterable) {
                if (o4m instanceof NSK) {
                    NSK nsk = (NSK) o4m;
                    double d3 = ((O4M) nsk).A00;
                    if (d3 == 0.0d) {
                        continue;
                    } else if (d3 != 0.5d) {
                        d = nsk.A00;
                        d2 = nsk.A01 - d;
                        rawX = motionEvent.getX();
                    } else {
                        z = false;
                        break;
                    }
                } else {
                    d = ((NSL) o4m).A00;
                    d2 = r8.A01 - d;
                    rawX = motionEvent.getRawX();
                }
                double d4 = rawX;
                if (d <= d4 && d4 <= d2) {
                }
                z = false;
            }
        }
        z = true;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            if (z) {
                this.A02.D44(motionEvent);
                return z;
            }
        } else if (z) {
            this.A01.DgA();
        }
        return z;
    }

    public N29(UserSession userSession, InterfaceC145436h2 interfaceC145436h2, InterfaceC57982PnS interfaceC57982PnS, Iterable iterable, boolean z) {
        super(userSession, z);
        this.A01 = interfaceC145436h2;
        this.A03 = iterable;
        this.A02 = interfaceC57982PnS;
        this.A00 = userSession;
    }
}
