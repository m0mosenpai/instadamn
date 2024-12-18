package X;

import android.graphics.Rect;
import java.util.Map;

/* renamed from: X.Ipt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC42392Ipt implements InterfaceC43071ya {
    public final Map A02 = AbstractC166987dD.A1I();
    public final Rect A00 = AbstractC166987dD.A0U();
    public final Rect A01 = AbstractC166987dD.A0U();

    public String A01(C59062n7 c59062n7) {
        return C37868GlN.A00(c59062n7, (C37868GlN) this);
    }

    public final void A02(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        int i;
        int i2;
        int i3;
        int i4;
        String A01 = A01(c59062n7);
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A0C) {
            this.A02.remove(A01);
            return;
        }
        Map map = this.A02;
        C38052Gof c38052Gof = (C38052Gof) map.get(A01);
        if (c38052Gof == null) {
            c38052Gof = new C38052Gof(7, 0, false, false);
        }
        if (c38052Gof.A00 != null) {
            return;
        }
        Rect rect = this.A00;
        interfaceC57162jr.CGX(rect);
        Rect rect2 = this.A01;
        interfaceC57162jr.BA8(rect2, c59062n7);
        boolean z = c38052Gof.A02;
        if (!z) {
            int i5 = rect2.top;
            int i6 = rect.top;
            if ((i5 > i6 || i5 == i6) && ((i3 = rect2.left) > (i4 = rect.left) || (i3 == i4 && rect2.right == rect.right))) {
                z = true;
            } else {
                z = false;
            }
            c38052Gof.A02 = z;
        }
        boolean z2 = c38052Gof.A01;
        if (!z2) {
            if ((rect2.bottom < rect.bottom || rect2.top == rect.top) && ((i = rect2.right) < (i2 = rect.right) || (rect2.left == rect.left && i == i2))) {
                z2 = true;
            } else {
                z2 = false;
            }
            c38052Gof.A01 = z2;
        }
        if (z && z2) {
            c38052Gof.A00 = String.valueOf(interfaceC57162jr.BmE());
        }
        map.put(A01, c38052Gof);
    }

    public final boolean A03(C59062n7 c59062n7) {
        C38052Gof c38052Gof = (C38052Gof) this.A02.get(A01(c59062n7));
        if (c38052Gof == null) {
            c38052Gof = new C38052Gof(7, 0, false, false);
        }
        return AbstractC167007dF.A1W(c38052Gof.A00);
    }
}
