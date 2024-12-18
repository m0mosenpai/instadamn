package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4mP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC104034mP implements Runnable, Choreographer.FrameCallback {
    public static RunnableC104034mP A06;
    public static final long A07 = TimeUnit.MILLISECONDS.toNanos(C2V2.A00);
    public long A00;
    public boolean A01;
    public final C1LL A03;
    public final long A05;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(C104044mQ.A00);

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.A00 = j;
        if (!((java.util.Set) this.A04.getValue()).isEmpty()) {
            C1LL c1ll = this.A03;
            boolean isTracing = c1ll.isTracing();
            if (isTracing) {
                c1ll.ADO("IncrementalMountGapWorker::doFrame");
            }
            this.A02.post(this);
            Choreographer.getInstance().postFrameCallback(this);
            if (isTracing) {
                c1ll.ASb();
                return;
            }
            return;
        }
        this.A01 = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = (this.A00 + this.A05) - A07;
        C1LL c1ll = this.A03;
        boolean isTracing = c1ll.isTracing();
        if (isTracing) {
            c1ll.ADO("premount");
        }
        try {
            Iterator it = ((java.util.Set) this.A04.getValue()).iterator();
            while (it.hasNext() && System.nanoTime() < j) {
                C79063gD c79063gD = (C79063gD) it.next();
                boolean isTracing2 = c1ll.isTracing();
                if (isTracing2) {
                    c1ll.ADO("premount-item");
                }
                while (c79063gD.A08() && System.nanoTime() < j) {
                    try {
                        c79063gD.A03();
                        List list = c79063gD.A08;
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            if (((C79073gE) list.get(i)).A01 instanceof C79083gF) {
                                Object obj = list.get(i);
                                C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.rendercore.extensions.ExtensionState<kotlin.Any>");
                                C79073gE c79073gE = (C79073gE) obj;
                                C79183gP c79183gP = (C79183gP) c79073gE.A02;
                                C50882Vk c50882Vk = c79183gP.A02;
                                if (c50882Vk != null) {
                                    ArrayList arrayList = c50882Vk.A0O;
                                    ArrayList arrayList2 = c50882Vk.A0N;
                                    int size2 = c50882Vk.A0W.size();
                                    int i2 = c79183gP.A01;
                                    if (i2 < size2 && i2 >= 0) {
                                        long j2 = ((C79043gB) arrayList.get(i2)).A03;
                                        if (!c79073gE.A03.contains(Long.valueOf(j2))) {
                                            c79073gE.A01(j2, true);
                                        }
                                        c79183gP.A01++;
                                    } else {
                                        int i3 = c79183gP.A00;
                                        if (i3 > 0 && i3 <= size2) {
                                            long j3 = ((C79043gB) arrayList2.get(i3 - 1)).A03;
                                            if (!c79073gE.A03.contains(Long.valueOf(j3))) {
                                                c79073gE.A01(j3, true);
                                            }
                                            c79183gP.A00--;
                                        }
                                    }
                                }
                            }
                        }
                        c79063gD.A02();
                    } catch (Throwable th) {
                        if (isTracing2) {
                            c1ll.ASb();
                        }
                        throw th;
                    }
                }
                if (isTracing2) {
                    c1ll.ASb();
                }
                if (!c79063gD.A08()) {
                    it.remove();
                }
            }
            if (isTracing) {
                c1ll.ASb();
            }
        } catch (Throwable th2) {
            if (isTracing) {
                c1ll.ASb();
            }
            throw th2;
        }
    }

    public RunnableC104034mP(C1LL c1ll, long j) {
        this.A05 = j;
        this.A03 = c1ll;
    }
}
