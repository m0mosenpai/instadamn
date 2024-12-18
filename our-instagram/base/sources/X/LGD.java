package X;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;

/* loaded from: classes8.dex */
public final class LGD {
    public C48029LMy A00;
    public Integer A01;
    public final int A02;
    public final Context A03;
    public final Sensor A04;
    public final SensorManager A05;
    public final C7DK A06;
    public final C54812OKl A07;
    public final InterfaceC16820sZ A08;
    public final boolean A09;

    public static final void A00(LGD lgd) {
        C7DK c7dk = lgd.A06;
        c7dk.A05(1);
        lgd.A01 = C05F.A01;
        Activity activity = (Activity) AbstractC13320mI.A00(lgd.A03, Activity.class);
        if (activity != null) {
            activity.setVolumeControlStream(Integer.MIN_VALUE);
        }
        if (c7dk.A0C()) {
            c7dk.A0B(false);
        }
    }

    public final void A01() {
        C48029LMy c48029LMy;
        SensorManager sensorManager = this.A05;
        if (sensorManager != null && (c48029LMy = this.A00) != null) {
            c48029LMy.A01 = false;
            C0fX.A00(c48029LMy, sensorManager);
        }
        if (this.A01 == C05F.A00) {
            A00(this);
        }
        this.A07.A01(this.A09);
    }

    public LGD(Context context, C7DK c7dk, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z) {
        SensorManager sensorManager;
        Sensor sensor;
        this.A06 = c7dk;
        this.A03 = context;
        this.A09 = z;
        this.A02 = i2;
        this.A08 = interfaceC16820sZ;
        Object systemService = context.getSystemService("sensor");
        if (systemService instanceof SensorManager) {
            sensorManager = (SensorManager) systemService;
        } else {
            sensorManager = null;
        }
        this.A05 = sensorManager;
        this.A07 = new C54812OKl(context);
        this.A01 = C05F.A01;
        if (sensorManager != null) {
            sensor = sensorManager.getDefaultSensor(8);
        } else {
            sensor = null;
        }
        this.A04 = sensor;
        this.A00 = sensor != null ? new C48029LMy(sensor, new C43887Jau(this, 8), i) : null;
    }
}
