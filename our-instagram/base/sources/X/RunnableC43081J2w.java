package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.J2w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43081J2w implements Runnable {
    public final /* synthetic */ C1P3 A00;

    public RunnableC43081J2w(C1P3 c1p3) {
        this.A00 = c1p3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1P3 c1p3 = this.A00;
        Map map = c1p3.A01;
        Iterator A0k = AbstractC167007dF.A0k(new HashMap(map));
        while (A0k.hasNext()) {
            ((C98974cH) A0k.next()).A07.cancel();
        }
        map.clear();
        ((C1IB) c1p3).A02.clear();
        c1p3.A00.clear();
    }
}
