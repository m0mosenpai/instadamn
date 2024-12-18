package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.IiS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41935IiS implements View.OnClickListener {
    public final /* synthetic */ JI9 A00;
    public final /* synthetic */ C64452w4 A01;
    public final /* synthetic */ String A02;

    public ViewOnClickListenerC41935IiS(JI9 ji9, C64452w4 c64452w4, String str) {
        this.A01 = c64452w4;
        this.A02 = str;
        this.A00 = ji9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-545227393);
        C64452w4 c64452w4 = this.A01;
        String str = this.A02;
        C65192xH c65192xH = (C65192xH) c64452w4.A02.getAdapter();
        AbstractC65332xV abstractC65332xV = (AbstractC65332xV) ((AbstractC65202xI) c65192xH).A00;
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator A13 = AbstractC166997dE.A13(abstractC65332xV.A02);
        while (A13.hasNext()) {
            Object next = A13.next();
            C3XG c3xg = (C3XG) next;
            C14360o3.A0B(c3xg, 0);
            if (c3xg.A06 == C1XV.A07 && C14360o3.A0K(c3xg.A09, str)) {
                A1E.add(next);
            } else {
                A1E2.add(next);
            }
        }
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            abstractC65332xV.A0D(it.next());
        }
        AbstractC37302Gc3.A1Q(abstractC65332xV, A1E2);
        c65192xH.A0A(-1);
        this.A00.Ciw();
        C0f9.A0C(1636289193, A05);
    }
}
