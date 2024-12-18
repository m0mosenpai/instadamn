package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Wri, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71314Wri implements Runnable {
    public final /* synthetic */ WEY A00;

    public RunnableC71314Wri(WEY wey) {
        this.A00 = wey;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WEY wey = this.A00;
        if (wey.A0D.getAndSet(5) != 5) {
            for (C200688uB c200688uB : wey.A0C) {
                if (c200688uB != null) {
                    c200688uB.A01();
                }
            }
            C70190WFt c70190WFt = wey.A02;
            if (c70190WFt != null) {
                c70190WFt.A00 = null;
                Map map = c70190WFt.A02;
                Iterator A16 = AbstractC166997dE.A16(map);
                while (A16.hasNext()) {
                    C81H c81h = (C81H) A16.next();
                    if (c81h != null) {
                        c81h.A02();
                    }
                }
                map.clear();
            }
            wey.A02 = null;
            C178927x4 c178927x4 = wey.A00;
            if (c178927x4 != null) {
                c178927x4.release();
            }
            wey.A00 = null;
        }
    }
}
