package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.commonavatarliveediting.PrefetchQueue;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.Omc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55598Omc implements InterfaceC57896Pm0, InterfaceC57900Pm4 {
    public static C55598Omc A09;
    public String A00;
    public WeakReference A01;
    public WeakReference A02;
    public InterfaceC24901Jp A03;
    public boolean A04;
    public final O1H A05;
    public final PrefetchQueue A06;
    public final C0JO A07;
    public final QuickPerformanceLogger A08;

    @Override // X.InterfaceC57896Pm0
    public final void Cyd(AbstractC53420Nk9 abstractC53420Nk9) {
        InterfaceC24901Jp interfaceC24901Jp;
        boolean z;
        InterfaceC16660sJ interfaceC16660sJ;
        WeakReference weakReference;
        C54806OKa A0I;
        if (abstractC53420Nk9 instanceof C51406MnE) {
            C51406MnE c51406MnE = (C51406MnE) abstractC53420Nk9;
            if (C14360o3.A0K(c51406MnE.A01, this.A00)) {
                if (c51406MnE.A00 == C05F.A00) {
                    if (this.A04 && (weakReference = this.A01) != null && (A0I = MSW.A0I(weakReference)) != null) {
                        C54499O6b c54499O6b = A0I.A00;
                        if (c54499O6b == null) {
                            MSW.A1J();
                            throw C00O.createAndThrow();
                        }
                        c54499O6b.A00.saveCurrentAvatar();
                    }
                    interfaceC24901Jp = this.A03;
                    if (interfaceC24901Jp != null) {
                        z = AbstractC166997dE.A0b();
                        interfaceC16660sJ = C57588Ph0.A00;
                        interfaceC24901Jp.EKh(interfaceC16660sJ, z);
                    }
                    this.A03 = null;
                    this.A00 = null;
                }
                interfaceC24901Jp = this.A03;
                if (interfaceC24901Jp != null) {
                    z = false;
                    interfaceC16660sJ = C57589Ph1.A00;
                    interfaceC24901Jp.EKh(interfaceC16660sJ, z);
                }
                this.A03 = null;
                this.A00 = null;
            }
        }
    }

    public final Object A00(OMg oMg, String str, Map map, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2) {
        InterfaceC58017Po2 interfaceC58017Po2;
        C54806OKa A0I;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24891Jo.A04;
        C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        if (z) {
            this.A00 = str;
            this.A04 = z2;
            this.A03 = c24891Jo;
            WeakReference weakReference = this.A01;
            if (weakReference != null && (A0I = MSW.A0I(weakReference)) != null) {
                C14360o3.A0B(str, 0);
                C54499O6b c54499O6b = A0I.A00;
                if (c54499O6b == null) {
                    MSW.A1J();
                    throw C00O.createAndThrow();
                }
                c54499O6b.A00.prefetchAvatar(str, map);
            }
        } else {
            C14360o3.A0B(str, 1);
            WeakReference weakReference2 = this.A02;
            if (weakReference2 != null && (interfaceC58017Po2 = (InterfaceC58017Po2) weakReference2.get()) != null) {
                interfaceC58017Po2.AWn(Boolean.valueOf(map.containsKey("root")), null, str, new TreeMap(map), new MC7((Object) c24891Jo, (Object) oMg, (InterfaceC23621Ds) null, 6));
            } else {
                C0K8.A0D("PrefetchProvider", "Cannot run prefetch as no CDL instance has been registered");
            }
        }
        return c24891Jo.A0E();
    }

    @Override // X.InterfaceC57900Pm4
    public final void CwK(C54806OKa c54806OKa) {
        WeakReference weakReference = this.A01;
        if (weakReference != null) {
            weakReference.clear();
        }
        if (c54806OKa != null) {
            this.A01 = AbstractC25225BEi.A16(c54806OKa);
            c54806OKa.A00(this);
        }
    }

    public C55598Omc(O1H o1h, QuickPerformanceLogger quickPerformanceLogger) {
        PrefetchQueue prefetchQueue;
        this.A05 = o1h;
        this.A08 = quickPerformanceLogger;
        AbstractC54324Nzi.A00 = quickPerformanceLogger;
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C14360o3.A07(awakeTimeSinceBootClock);
        this.A07 = awakeTimeSinceBootClock;
        synchronized (PrefetchQueue.A08) {
            prefetchQueue = PrefetchQueue.A07;
            if (prefetchQueue == null) {
                prefetchQueue = new PrefetchQueue(awakeTimeSinceBootClock);
                PrefetchQueue.A07 = prefetchQueue;
            }
        }
        this.A06 = prefetchQueue;
    }
}
