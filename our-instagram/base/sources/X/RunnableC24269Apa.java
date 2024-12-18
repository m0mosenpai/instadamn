package X;

import android.view.Surface;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Apa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24269Apa implements Runnable {
    public final /* synthetic */ C23128AMg A00;

    public RunnableC24269Apa(C23128AMg c23128AMg) {
        this.A00 = c23128AMg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23128AMg c23128AMg = this.A00;
        if (c23128AMg.A0V.getAndSet(5) != 5) {
            c23128AMg.A05 = -1L;
            c23128AMg.A04 = -1L;
            c23128AMg.A01 = -1.0f;
            c23128AMg.A00 = -1.0f;
            List list = c23128AMg.A0T;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C200688uB) it.next()).A01();
            }
            list.clear();
            AKR akr = c23128AMg.A0F;
            if (akr != null) {
                akr.A02();
                c23128AMg.A0F = null;
            }
            AbstractC180277zH abstractC180277zH = c23128AMg.A0B;
            if (abstractC180277zH != null) {
                abstractC180277zH.A02();
                c23128AMg.A0B = null;
            }
            Surface surface = c23128AMg.A07;
            if (surface != null) {
                surface.release();
                c23128AMg.A07 = null;
            }
            C178927x4 c178927x4 = c23128AMg.A08;
            if (c178927x4 != null) {
                c178927x4.release();
                c23128AMg.A08 = null;
            }
        }
    }
}
