package com.google.android.gms.common.api.internal;

import X.AbstractC1335861e;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC61584Rq8;
import X.C3U5;
import X.C60655RGh;
import X.C60656RGi;
import X.C60657RGj;
import X.C60726ROg;
import X.C61j;
import X.C62440SBt;
import X.HandlerC1336161q;
import X.HandlerC60672RLb;
import X.InterfaceC65403Tja;
import X.InterfaceC65404Tjb;
import X.LW6;
import X.RKy;
import X.RKz;
import X.RL1;
import X.T4o;
import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes10.dex */
public abstract class BasePendingResult extends AbstractC61584Rq8 {
    public static final ThreadLocal A0D = new ThreadLocal();
    public InterfaceC65404Tjb A00;
    public Status A01;
    public boolean A02;
    public C61j A04;
    public boolean A05;
    public final HandlerC60672RLb A06;
    public final WeakReference A08;
    public volatile boolean A0C;
    public final Object A07 = AbstractC58318PtA.A0b();
    public final CountDownLatch A0A = AbstractC58319PtB.A15();
    public final ArrayList A09 = AbstractC166987dD.A1E();
    public final AtomicReference A0B = new AtomicReference();
    public boolean A03 = false;

    public static final C61j A00(BasePendingResult basePendingResult) {
        C61j c61j;
        synchronized (basePendingResult.A07) {
            C3U5.A09(!basePendingResult.A0C, "Result has already been consumed.");
            C3U5.A09(AbstractC167007dF.A1N((basePendingResult.A0A.getCount() > 0L ? 1 : (basePendingResult.A0A.getCount() == 0L ? 0 : -1))), "Result is not ready.");
            c61j = basePendingResult.A04;
            basePendingResult.A04 = null;
            basePendingResult.A00 = null;
            basePendingResult.A0C = true;
        }
        C62440SBt c62440SBt = (C62440SBt) basePendingResult.A0B.getAndSet(null);
        if (c62440SBt != null) {
            c62440SBt.A00.A01.remove(basePendingResult);
        }
        C3U5.A02(c61j);
        return c61j;
    }

    private final void A01(C61j c61j) {
        this.A04 = c61j;
        this.A01 = c61j.C0F();
        this.A0A.countDown();
        if (this.A02) {
            this.A00 = null;
        } else {
            InterfaceC65404Tjb interfaceC65404Tjb = this.A00;
            if (interfaceC65404Tjb != null) {
                HandlerC60672RLb handlerC60672RLb = this.A06;
                handlerC60672RLb.removeMessages(2);
                AbstractC166997dE.A1H(handlerC60672RLb, new Pair(interfaceC65404Tjb, A00(this)), 1);
            }
        }
        ArrayList arrayList = this.A09;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC65403Tja) arrayList.get(i)).D6T(this.A01);
        }
        arrayList.clear();
    }

    public final C61j A03(Status status) {
        if (!(this instanceof RKy)) {
            if (this instanceof RKz) {
                return new T4o(null, status);
            }
            if (this instanceof C60657RGj) {
                return ((C60657RGj) this).A00;
            }
            if (!(this instanceof C60656RGi)) {
                if (this instanceof C60726ROg) {
                    return new LW6(status, null);
                }
                if (this instanceof C60655RGh) {
                    return new LocationSettingsResult(status, null);
                }
                boolean z = this instanceof RL1;
            }
        }
        return status;
    }

    public final void A04() {
        synchronized (this.A07) {
            if (!this.A02 && !this.A0C) {
                this.A02 = true;
                A01(A03(Status.A04));
            }
        }
    }

    public final void A05() {
        boolean z = true;
        if (!this.A03 && !AbstractC166987dD.A1a(A0D.get())) {
            z = false;
        }
        this.A03 = z;
    }

    public final void A06(C61j c61j) {
        synchronized (this.A07) {
            if (!this.A05 && !this.A02) {
                this.A0A.getCount();
                C3U5.A09(!AbstractC167007dF.A1N((r0.getCount() > 0L ? 1 : (r0.getCount() == 0L ? 0 : -1))), "Results have already been set");
                C3U5.A09(!this.A0C, "Result has already been consumed");
                A01(c61j);
            }
        }
    }

    public final void A07(InterfaceC65404Tjb interfaceC65404Tjb, TimeUnit timeUnit, long j) {
        synchronized (this.A07) {
            C3U5.A09(!this.A0C, "Result has already been consumed.");
            if (!this.A02) {
                if (AbstractC167007dF.A1N((this.A0A.getCount() > 0L ? 1 : (this.A0A.getCount() == 0L ? 0 : -1)))) {
                    AbstractC166997dE.A1H(this.A06, new Pair(interfaceC65404Tjb, A00(this)), 1);
                } else {
                    this.A00 = interfaceC65404Tjb;
                    HandlerC60672RLb handlerC60672RLb = this.A06;
                    handlerC60672RLb.sendMessageDelayed(handlerC60672RLb.obtainMessage(2, this), timeUnit.toMillis(j));
                }
            }
        }
    }

    @Deprecated
    public final void A08(Status status) {
        synchronized (this.A07) {
            if (!AbstractC167007dF.A1N((this.A0A.getCount() > 0L ? 1 : (this.A0A.getCount() == 0L ? 0 : -1)))) {
                A06(A03(status));
                this.A05 = true;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.RLb, X.61q] */
    public BasePendingResult(AbstractC1335861e abstractC1335861e) {
        Looper mainLooper;
        if (abstractC1335861e != null) {
            mainLooper = abstractC1335861e.A04();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.A06 = new HandlerC1336161q(mainLooper);
        this.A08 = AbstractC25225BEi.A16(abstractC1335861e);
    }
}
