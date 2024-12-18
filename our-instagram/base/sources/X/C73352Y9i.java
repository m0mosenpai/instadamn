package X;

import android.os.Process;
import com.facebook.common.dextricks.DexStore;
import com.facebook.proxygen.TraceFieldType;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.Y9i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C73352Y9i implements YOl {
    public static String A04;
    public YNY A00;
    public YNZ A01;
    public YNa A02;
    public YNb A03;

    @Override // X.YOl
    public final synchronized void DSb(Object obj, ScheduledExecutorService scheduledExecutorService, int i) {
        ScheduledFuture<?> scheduleAtFixedRate;
        ScheduledFuture scheduledFuture;
        if (this instanceof C72186XRw) {
            C72186XRw c72186XRw = (C72186XRw) this;
            synchronized (this) {
                if (i != 5) {
                    if (i == 6 && (scheduledFuture = c72186XRw.A00) != null) {
                        scheduledFuture.cancel(true);
                        scheduleAtFixedRate = null;
                        c72186XRw.A00 = scheduleAtFixedRate;
                    }
                } else if (obj != null) {
                    C72501XfF c72501XfF = (C72501XfF) obj;
                    ScheduledFuture scheduledFuture2 = c72186XRw.A00;
                    if (scheduledFuture2 != null) {
                        scheduledFuture2.cancel(true);
                        c72186XRw.A00 = null;
                    }
                    scheduleAtFixedRate = scheduledExecutorService.scheduleAtFixedRate(new YHB(c72186XRw, c72501XfF.A03), c72501XfF.A00, c72501XfF.A01, c72501XfF.A02);
                    c72186XRw.A00 = scheduleAtFixedRate;
                }
            }
        }
        synchronized (this) {
            A00(i);
        }
    }

    public final void A00(int i) {
        String str;
        String str2;
        String str3;
        YNZ ynz = this.A01;
        ((C73362Y9s) ynz).A00 = C19280xC.A01("mobile_memory_metrics", null);
        C73362Y9s c73362Y9s = (C73362Y9s) ynz;
        InterfaceC11360iu interfaceC11360iu = c73362Y9s.A01;
        C19280xC c19280xC = c73362Y9s.A00;
        if (c19280xC != null) {
            if (interfaceC11360iu.CU0(c19280xC)) {
                this.A02.reportTo(this.A00.BTc(), ynz);
                boolean z = !C218914p.A08();
                C19280xC c19280xC2 = c73362Y9s.A00;
                if (c19280xC2 != null) {
                    c19280xC2.A09(TraceFieldType.IsForeground, Boolean.valueOf(z));
                    switch (i) {
                        case 1:
                            str = "EVENT_FOREGROUND";
                            break;
                        case 2:
                            str = "EVENT_BACKGROUND";
                            break;
                        case 3:
                            str = "EVENT_PERIODIC_FOREGROUND";
                            break;
                        case 4:
                            str = "EVENT_NAVIGATION";
                            break;
                        case 5:
                            str = "EVENT_START_PERIODIC";
                            break;
                        case 6:
                            str = "EVENT_STOP_PERIODIC";
                            break;
                        case 7:
                            str = "EVENT_START_DEBUG";
                            break;
                        case 8:
                            str = "EVENT_STOP_DEBUG";
                            break;
                        default:
                            str = "EVENT_PERIODIC_BACKGROUND";
                            break;
                    }
                    ynz.A7n("memory_event_type", str);
                    synchronized (this) {
                        str2 = A04;
                        if (str2 == null) {
                            str2 = AnonymousClass001.A0g(Integer.toString(Process.myPid()), "_", Integer.toString(new Random().nextInt(DexStore.MS_IN_NS)));
                            A04 = str2;
                        }
                    }
                    ynz.A7n(AbstractC31580Du8.A00(9, 10, 3), str2);
                    ynz.A7n(AbstractC111324zv.A00(1945), C0L6.A01());
                    if (C0L6.A04 == null) {
                        str3 = "";
                    } else {
                        str3 = C0L6.A04.A03;
                    }
                    ynz.A7n("navigation_module", str3);
                    long elapsedCpuTime = Process.getElapsedCpuTime();
                    C19280xC c19280xC3 = c73362Y9s.A00;
                    if (c19280xC3 != null) {
                        c19280xC3.A0B("elapsed_cpu_time_ms", Long.valueOf(elapsedCpuTime));
                        C19280xC c19280xC4 = c73362Y9s.A00;
                        if (c19280xC4 != null) {
                            interfaceC11360iu.EHW(c19280xC4);
                            c73362Y9s.A00 = null;
                            return;
                        }
                        throw AbstractC166997dE.A0g();
                    }
                    throw AbstractC166997dE.A0g();
                }
                throw AbstractC166997dE.A0g();
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.YOl
    public final boolean EjB(int i, Object obj) {
        boolean z = this instanceof C72186XRw;
        boolean CVi = this.A03.CVi();
        if (z) {
            if (CVi) {
                if (i == 5 || i == 6) {
                    return true;
                }
                return false;
            }
            return false;
        }
        if (CVi) {
            if (i == 1 || i == 2) {
                return true;
            }
            return false;
        }
        return false;
    }
}
