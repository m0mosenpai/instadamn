package X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.systrace.Systrace;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.TKo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64577TKo implements Runnable {
    public final /* synthetic */ T0q A00;

    public RunnableC64577TKo(T0q t0q) {
        this.A00 = t0q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "DispatchEventsRunnable", -981503000);
        try {
            T0q t0q = this.A00;
            Systrace.A05(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "ScheduleDispatchFrameCallback", t0q.A0D.getAndIncrement());
            int i2 = 0;
            t0q.A0F = false;
            AbstractC05810Sj.A00(t0q.A0E);
            synchronized (t0q.A08) {
                try {
                    int i3 = t0q.A00;
                    if (i3 > 0) {
                        if (i3 > 1) {
                            Arrays.sort(t0q.A02, 0, i3, T0q.A0G);
                        }
                        while (true) {
                            i = t0q.A00;
                            if (i2 >= i) {
                                break;
                            }
                            Sb5 sb5 = t0q.A02[i2];
                            if (sb5 != null) {
                                Systrace.A05(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, sb5.A05(), sb5.A01);
                                sb5.A0A(t0q.A0E);
                                sb5.A05 = false;
                                sb5.A07();
                            }
                            i2++;
                        }
                        Arrays.fill(t0q.A02, 0, i, (Object) null);
                        t0q.A00 = 0;
                        t0q.A03.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = t0q.A0C.iterator();
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("onBatchEventDispatched");
            }
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 1183250855);
        } catch (Throwable th2) {
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 1695580238);
            throw th2;
        }
    }
}
