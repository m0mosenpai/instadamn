package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* renamed from: X.2ri, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC61812ri {
    public boolean A01(int i, int i2) {
        AbstractC110824yu A05;
        int A02;
        if (this instanceof AbstractC61802rh) {
            AbstractC61802rh abstractC61802rh = (AbstractC61802rh) this;
            RecyclerView recyclerView = abstractC61802rh.A00;
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            if (abstractC70663Fe == null || recyclerView.A0A == null) {
                return false;
            }
            int i3 = recyclerView.A0t;
            if ((Math.abs(i2) <= i3 && Math.abs(i) <= i3) || !(abstractC70663Fe instanceof InterfaceC70673Ff) || (A05 = abstractC61802rh.A05(abstractC70663Fe)) == null || (A02 = abstractC61802rh.A02(abstractC70663Fe, i, i2)) == -1) {
                return false;
            }
            A05.A00 = A02;
            abstractC70663Fe.A10(A05);
            return true;
        }
        Iterator it = ((C3FS) this).A00.A04.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                boolean A01 = ((AbstractC61812ri) it.next()).A01(i, i2);
                if (z || A01) {
                    z = true;
                }
            }
            return z;
        }
    }
}
