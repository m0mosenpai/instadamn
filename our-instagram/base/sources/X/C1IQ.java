package X;

import com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1IQ, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1IQ {
    public SubspanMutableStateFlow A00 = new SubspanMutableStateFlow(C1IT.A04);
    public final C1IN A01;

    public abstract List A01();

    public void A02() {
    }

    public final void A05(String str, Long l) {
        C1IN c1in = this.A01;
        if (l != null) {
            C1IN.A00(c1in).markerPoint(15335435, str, l.longValue(), TimeUnit.MILLISECONDS);
            return;
        }
        c1in.A02(str);
    }

    public SubspanMutableStateFlow A00() {
        return this.A00;
    }

    public final void A03() {
        A04(new SubspanMutableStateFlow(C1IT.A04));
        Iterator it = A01().iterator();
        while (it.hasNext()) {
            ((C1IQ) it.next()).A03();
        }
    }

    public void A04(SubspanMutableStateFlow subspanMutableStateFlow) {
        this.A00 = subspanMutableStateFlow;
    }

    public C1IQ(C1IN c1in) {
        this.A01 = c1in;
    }
}
