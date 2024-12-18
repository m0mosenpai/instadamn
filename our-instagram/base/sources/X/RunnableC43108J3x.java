package X;

import android.os.Handler;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.J3x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43108J3x implements Runnable {
    public final /* synthetic */ C26591Boo A00;

    public RunnableC43108J3x(C26591Boo c26591Boo) {
        this.A00 = c26591Boo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC43447JHl interfaceC43447JHl;
        C41000IDv BQx;
        C5TA c5ta;
        C26591Boo c26591Boo = this.A00;
        List list = (List) AbstractC37301Gc2.A0f(c26591Boo.A02, c26591Boo.A0A);
        if (list != null && (interfaceC43447JHl = (InterfaceC43447JHl) list.get(c26591Boo.A00)) != null && (BQx = interfaceC43447JHl.BQx()) != null) {
            J26 j26 = BQx.A00;
            C41725Idw c41725Idw = j26.A07;
            List list2 = c41725Idw.A08;
            Iterator it = list2.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (C14360o3.A0K(it.next(), j26)) {
                    if (i >= 0) {
                        J27 j27 = j26.A00;
                        if (j27 != null && (c5ta = j27.A00) != null) {
                            c5ta.A09("paused_for_replay");
                        }
                        j26.A00();
                        if (j26.equals(c41725Idw.A02)) {
                            Handler handler = c41725Idw.A04;
                            handler.removeCallbacks(c41725Idw.A06);
                            handler.removeCallbacks(c41725Idw.A07);
                            handler.removeCallbacks(c41725Idw.A05);
                            if (list2.size() == 1) {
                                list2.clear();
                                c41725Idw.A00 = 0;
                                c41725Idw.A01 = 0;
                                return;
                            } else if (i == AbstractC31172DnG.A03(list2, 1)) {
                                list2.remove(i);
                                c41725Idw.A00 = 0;
                                C41725Idw.A00(c41725Idw);
                                return;
                            } else {
                                list2.remove(i);
                                C41725Idw.A02(c41725Idw);
                                return;
                            }
                        }
                        list2.remove(i);
                        int i2 = c41725Idw.A00;
                        if (i >= i2) {
                            return;
                        }
                        c41725Idw.A00 = i2 - 1;
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }
}
