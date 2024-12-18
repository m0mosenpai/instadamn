package com.facebook.react.modules.core;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC58321PtD;
import X.C14360o3;
import X.C62163S0k;
import X.C63150Sdx;
import X.C63192Seu;
import X.EnumC61159RgK;
import X.InterfaceC65655TqV;
import X.InterfaceC65656Tqi;
import X.R3M;
import X.SHU;
import X.T08;
import com.facebook.fbreact.specs.NativeTimingSpec;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Iterator;
import java.util.PriorityQueue;

@ReactModule(name = "Timing")
/* loaded from: classes10.dex */
public final class TimingModule extends NativeTimingSpec {
    public static final C62163S0k Companion = new Object();
    public static final String NAME = "Timing";
    public final T08 javaTimerManager;

    public void callTimers(InterfaceC65656Tqi interfaceC65656Tqi) {
        JSTimers jSTimers;
        C14360o3.A0B(interfaceC65656Tqi, 0);
        R3M reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null && (jSTimers = (JSTimers) reactApplicationContextIfActiveOrWarn.A03(JSTimers.class)) != null) {
            jSTimers.callTimers(interfaceC65656Tqi);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void createTimer(double d, double d2, double d3, boolean z) {
        int i = (int) d;
        int i2 = (int) d2;
        T08 t08 = this.javaTimerManager;
        long max = Math.max(0L, (((long) d3) - System.currentTimeMillis()) + i2);
        if (i2 == 0 && !z) {
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            writableNativeArray.pushInt(i);
            t08.A09.callTimers(writableNativeArray);
            return;
        }
        t08.createTimer(i, max, z);
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void deleteTimer(double d) {
        this.javaTimerManager.deleteTimer((int) d);
    }

    public void emitTimeDriftWarning(String str) {
        JSTimers jSTimers;
        C14360o3.A0B(str, 0);
        R3M reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null && (jSTimers = (JSTimers) reactApplicationContextIfActiveOrWarn.A03(JSTimers.class)) != null) {
            jSTimers.emitTimeDriftWarning(str);
        }
    }

    public final boolean hasActiveTimersInRange(long j) {
        T08 t08 = this.javaTimerManager;
        synchronized (t08.A0B) {
            PriorityQueue priorityQueue = t08.A0C;
            SHU shu = (SHU) priorityQueue.peek();
            if (shu != null) {
                if (shu.A03 || shu.A01 >= j) {
                    Iterator it = priorityQueue.iterator();
                    while (it.hasNext()) {
                        SHU shu2 = (SHU) it.next();
                        C14360o3.A0A(shu2);
                        if (shu2.A03 || shu2.A01 >= j) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void setSendIdleEvents(boolean z) {
        this.javaTimerManager.setSendIdleEvents(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimingModule(R3M r3m, InterfaceC65655TqV interfaceC65655TqV) {
        super(r3m);
        AbstractC167017dG.A1P(r3m, interfaceC65655TqV);
        C63192Seu c63192Seu = C63192Seu.A05;
        if (c63192Seu != null) {
            this.javaTimerManager = new T08(r3m, interfaceC65655TqV, c63192Seu, this);
            return;
        }
        throw AbstractC166987dD.A14("ReactChoreographer needs to be initialized.");
    }

    public void callIdleCallbacks(double d) {
        JSTimers jSTimers;
        R3M reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null && (jSTimers = (JSTimers) reactApplicationContextIfActiveOrWarn.A03(JSTimers.class)) != null) {
            jSTimers.callIdleCallbacks(d);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        C63150Sdx A00 = C63150Sdx.A00(AbstractC58321PtD.A0b(this));
        T08 t08 = this.javaTimerManager;
        synchronized (A00) {
            A00.A03.add(t08);
            Iterator it = A00.A02.iterator();
            while (it.hasNext()) {
                it.next();
                if (!t08.A0E.getAndSet(true)) {
                    if (!t08.A01) {
                        t08.A08.A02(t08.A07, EnumC61159RgK.A07);
                        t08.A01 = true;
                    }
                    T08.A02(t08);
                }
            }
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        C63150Sdx A00 = C63150Sdx.A00(AbstractC58321PtD.A0b(this));
        A00.A03.remove(this.javaTimerManager);
        T08 t08 = this.javaTimerManager;
        t08.A05.A0B(t08);
        T08.A00(t08);
        if (t08.A02) {
            t08.A08.A03(t08.A06, EnumC61159RgK.A04);
            t08.A02 = false;
        }
    }
}
