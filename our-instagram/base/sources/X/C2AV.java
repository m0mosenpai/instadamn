package X;

import android.content.Context;
import android.hardware.SensorManager;

/* renamed from: X.2AV, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2AV {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final C2AZ A03;
    public final InterfaceC09390do A04 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9E0(this, 5));

    public final void A03() {
        this.A01 = false;
        C2AZ c2az = this.A03;
        synchronized (c2az) {
            c2az.A01.A00();
        }
    }

    public final void A04() {
        C0K8.A0P("ShakeSensorHelper", "registerShakeListener started | mRegistered=%b", Boolean.valueOf(this.A00));
        if (!this.A00) {
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.3K6
                {
                    super(660565823, 3, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C2AV c2av = C2AV.this;
                    InterfaceC09390do interfaceC09390do = c2av.A04;
                    SensorManager sensorManager = (SensorManager) interfaceC09390do.getValue();
                    C0fX.A01(((SensorManager) interfaceC09390do.getValue()).getDefaultSensor(1), c2av.A03, sensorManager, 2);
                }
            });
            this.A00 = true;
            C0K8.A0D("ShakeSensorHelper", "registerShakeListener registered");
        }
    }

    public abstract void A06();

    public final void A05() {
        C0K8.A0P("ShakeSensorHelper", "unregisterShakeListener started | mRegistered=%b", Boolean.valueOf(this.A00));
        if (this.A00) {
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.54G
                {
                    super(660565823, 3, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C2AV c2av = C2AV.this;
                    C0fX.A00(c2av.A03, (SensorManager) c2av.A04.getValue());
                }
            });
            this.A00 = false;
            C0K8.A0D("ShakeSensorHelper", "unregisterShakeListener unregistered");
        }
    }

    public C2AV(Context context) {
        this.A02 = context;
        C2AZ c2az = new C2AZ(this);
        synchronized (c2az) {
            c2az.A00 = 18.042845f;
        }
        this.A03 = c2az;
    }
}
