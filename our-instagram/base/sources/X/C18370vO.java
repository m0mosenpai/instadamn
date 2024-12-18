package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0vO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18370vO implements InterfaceC14020nS {
    public C0v7 A00;
    public final List A01;
    public final BlockingQueue A02 = new SynchronousQueue();
    public final Executor A03;

    public C18370vO(C14130nd c14130nd) {
        Executor c14330nx;
        List synchronizedList;
        final int i = c14130nd.A05;
        ThreadFactory threadFactory = new ThreadFactory() { // from class: X.0nf
            public final AtomicInteger A00 = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                ThreadGroup threadGroup = C14290nt.A01;
                return new C14290nt(runnable, AnonymousClass001.A0O("IgExecutorV2 #", this.A00.getAndIncrement()), i);
            }
        };
        try {
            if (c14130nd.A0D) {
                c14330nx = new ThreadPoolExecutor(c14130nd.A04, 128, c14130nd.A03, TimeUnit.SECONDS, (BlockingQueue<Runnable>) this.A02, threadFactory);
            } else {
                c14330nx = new C14330nx(this.A02, threadFactory, TimeUnit.SECONDS, c14130nd.A04, c14130nd.A03);
            }
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Incompatible parameters: (");
            sb.append(c14130nd.A04);
            sb.append(", ");
            sb.append(128);
            sb.append(", ");
            sb.append(c14130nd.A03);
            sb.append(", ");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            sb.append(timeUnit);
            sb.append(", ...)");
            C0w9.A06("IgExecutor:MonitoredThreadPool", sb.toString(), e);
            if (c14130nd.A0D) {
                c14330nx = new ThreadPoolExecutor(5, 128, 1L, timeUnit, (BlockingQueue<Runnable>) this.A02, threadFactory);
            } else {
                c14330nx = new C14330nx(this.A02, threadFactory, timeUnit, 5, 1L);
            }
        }
        this.A03 = c14330nx;
        if (c14130nd.A0G) {
            synchronizedList = new CopyOnWriteArrayList();
        } else {
            synchronizedList = Collections.synchronizedList(new ArrayList());
        }
        this.A01 = synchronizedList;
        int A04 = C15900qk.A01().A04();
        C14360o3.A0B(synchronizedList, 1);
        String str = c14130nd.A09;
        int[][] iArr = C0v7.A06;
        if (str.length() > 0) {
            try {
                String obj = AbstractC001900j.A0B(str).toString();
                int[] iArr2 = new int[5];
                int[] iArr3 = new int[5];
                try {
                    try {
                        int i2 = -1;
                        for (String str2 : (String[]) new C11L("/").A03(obj).toArray(new String[0])) {
                            String[] strArr = (String[]) new C11L(":").A03(str2).toArray(new String[0]);
                            int parseInt = Integer.parseInt(strArr[0]);
                            if (i2 + 1 <= parseInt && parseInt <= A04) {
                                String[] strArr2 = (String[]) new C11L(";").A03(strArr[1]).toArray(new String[0]);
                                String[] strArr3 = (String[]) new C11L(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A03(strArr2[0]).toArray(new String[0]);
                                String[] strArr4 = (String[]) new C11L(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A03(strArr2[1]).toArray(new String[0]);
                                int i3 = 0;
                                do {
                                    iArr2[i3] = Integer.parseInt(strArr3[i3]);
                                    iArr3[i3] = Integer.parseInt(strArr4[i3]);
                                    i3++;
                                } while (i3 < 5);
                                i2 = parseInt;
                            }
                        }
                        iArr = new int[][]{iArr2, iArr3};
                    } catch (NumberFormatException unused) {
                        throw new IllegalArgumentException(AnonymousClass001.A0R("The values of TaskAndThreadManagerSpec are malformed: ", obj));
                    }
                } catch (IndexOutOfBoundsException unused2) {
                    throw new IllegalArgumentException(AnonymousClass001.A0R("The format of TaskAndThreadManagerSpec is malformed: ", obj));
                }
            } catch (IllegalArgumentException unused3) {
            }
        }
        this.A00 = new C0v7(c14130nd, synchronizedList, iArr[0], iArr[1]);
    }

    @Override // X.InterfaceC14020nS
    public final void ATN(C14160ng c14160ng) {
        ATO(c14160ng.A00);
    }

    @Override // X.InterfaceC14020nS
    public final void ATO(AbstractRunnableC14200nk abstractRunnableC14200nk) {
        C18180v3 c18180v3 = AbstractC14310nv.A00;
        if (c18180v3 != null && !abstractRunnableC14200nk.isSendToNetworkThreadPool) {
            c18180v3.A00(abstractRunnableC14200nk);
        }
        C14360o3.A0B(abstractRunnableC14200nk, 0);
        C18260vD c18260vD = new C18260vD(abstractRunnableC14200nk);
        if (c18260vD.isSendToNetworkThreadPool) {
            this.A03.execute(C0SX.A00(c18260vD, "Fury", 1));
            return;
        }
        List list = this.A01;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC14210nl) it.next()).onAddTask(c18260vD, this.A00.A00());
            }
        }
        C0SJ A02 = C06600Wq.A02("Fury", 1);
        A02.close();
        c18260vD.furyContext = A02;
        C0v7 c0v7 = this.A00;
        List list2 = c0v7.A01;
        ((AbstractCollection) list2.get(c18260vD.priority - 1)).add(c18260vD);
        c0v7.A01(list2, c0v7.A00, c0v7.A02, c0v7.A03, -1);
    }
}
