package com.facebook.mqtt.service;

import X.AbstractC19560xi;
import X.AbstractC58318PtA;
import X.AbstractServiceC19690xx;
import X.AnonymousClass209;
import X.C0K8;
import X.C14360o3;
import X.C4MW;
import X.C4MX;
import X.TKF;
import X.TKG;
import X.TKH;
import X.TKI;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes10.dex */
public abstract class XplatServiceDelegate extends AbstractC19560xi {
    public static final AnonymousClass209 A01;
    public static final C4MW A02;
    public static final C4MX A03;
    public static final Object A04 = AbstractC58318PtA.A0b();
    public static final Condition A05;
    public static final ReentrantLock A06;
    public static volatile XplatServiceDelegate A07;
    public final XplatServiceDelegate$remoteBinder$1 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XplatServiceDelegate(AbstractServiceC19690xx abstractServiceC19690xx) {
        super(abstractServiceC19690xx);
        C14360o3.A0B(abstractServiceC19690xx, 1);
        this.A00 = new XplatServiceDelegate$remoteBinder$1();
    }

    @Override // X.AbstractC19560xi
    public final int A07(Intent intent, int i, int i2) {
        A01.A01(new TKH(this));
        return 2;
    }

    @Override // X.AbstractC19560xi
    public final IBinder A0B(Intent intent) {
        A01.A01(new TKH(this));
        return this.A00;
    }

    @Override // X.AbstractC19560xi
    public final void A0F() {
        AnonymousClass209 anonymousClass209 = A01;
        anonymousClass209.A01(new TKG(this));
        if (A07 == this) {
            A07 = null;
            if (!anonymousClass209.A02(new TKI(this))) {
                C0K8.A0C("MqttXplatService", "Unable to stop mqtt client. No handler available");
            }
        }
        super.A0F();
    }

    static {
        AnonymousClass209 anonymousClass209 = new AnonymousClass209("XplatClientDispatchThread");
        A01 = anonymousClass209;
        ReentrantLock reentrantLock = new ReentrantLock();
        A06 = reentrantLock;
        A05 = reentrantLock.newCondition();
        A02 = new C4MW(anonymousClass209);
        A03 = new C4MX(anonymousClass209);
    }

    @Override // X.AbstractC19560xi
    public final void A0C() {
        super.A0C();
        A07 = this;
        AnonymousClass209 anonymousClass209 = A01;
        anonymousClass209.A00();
        anonymousClass209.A01(new TKH(this));
        anonymousClass209.A01(new TKF(this));
    }
}
