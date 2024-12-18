package X;

import android.util.LongSparseArray;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.uimanager.events.ReactEventEmitter;
import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class T0q implements X9J, InterfaceC65542TmH {
    public static final Comparator A0G = new TSE(3);
    public final R3M A04;
    public volatile ReactEventEmitter A0E;
    public final Object A07 = AbstractC58318PtA.A0b();
    public final Object A08 = AbstractC58318PtA.A0b();
    public final LongSparseArray A03 = new LongSparseArray();
    public final Map A0A = AbstractC166987dD.A1G();
    public final RunnableC64577TKo A05 = new RunnableC64577TKo(this);
    public final ArrayList A09 = AbstractC166987dD.A1E();
    public final CopyOnWriteArrayList A0B = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList A0C = new CopyOnWriteArrayList();
    public final ChoreographerFrameCallbackC63494So8 A06 = new ChoreographerFrameCallbackC63494So8(this);
    public final AtomicInteger A0D = new AtomicInteger();
    public Sb5[] A02 = new Sb5[16];
    public int A00 = 0;
    public short A01 = 0;
    public volatile boolean A0F = false;

    private void A00() {
        if (this.A0E != null) {
            ChoreographerFrameCallbackC63494So8 choreographerFrameCallbackC63494So8 = this.A06;
            if (!choreographerFrameCallbackC63494So8.A01) {
                R3M r3m = choreographerFrameCallbackC63494So8.A02.A04;
                MessageQueueThread messageQueueThread = r3m.A05;
                AbstractC05810Sj.A00(messageQueueThread);
                if (messageQueueThread.isOnThread()) {
                    choreographerFrameCallbackC63494So8.A00();
                    return;
                }
                RunnableC64578TKp runnableC64578TKp = new RunnableC64578TKp(choreographerFrameCallbackC63494So8);
                MessageQueueThread messageQueueThread2 = r3m.A05;
                AbstractC05810Sj.A00(messageQueueThread2);
                messageQueueThread2.runOnQueue(runnableC64578TKp);
            }
        }
    }

    @Override // X.X9J
    public final void APn(Sb5 sb5) {
        AbstractC05810Sj.A03(sb5.A05, "Dispatched event hasn't been initialized");
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            C63347Si4 c63347Si4 = (C63347Si4) it.next();
            if (C63255SgD.A02()) {
                C63347Si4.A02(c63347Si4, sb5);
            } else {
                C63255SgD.A01(new RunnableC64626TNi(c63347Si4, sb5));
            }
        }
        synchronized (this.A07) {
            this.A09.add(sb5);
            Systrace.A07(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, sb5.A05(), sb5.A01);
        }
        A00();
    }

    @Override // X.InterfaceC65542TmH
    public final void onHostDestroy() {
        this.A06.A00 = true;
    }

    @Override // X.InterfaceC65542TmH
    public final void onHostPause() {
        this.A06.A00 = true;
    }

    public T0q(R3M r3m) {
        this.A04 = r3m;
        r3m.A0A(this);
        this.A0E = new ReactEventEmitter(r3m);
    }

    @Override // X.InterfaceC65542TmH
    public final void onHostResume() {
        A00();
    }
}
