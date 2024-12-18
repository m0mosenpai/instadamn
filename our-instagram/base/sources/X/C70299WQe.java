package X;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.concurrent.Executor;

/* renamed from: X.WQe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70299WQe implements C07W {
    public float A00;
    public float A01;
    public long A02;
    public boolean A03;
    public final Sensor A04;
    public final SensorManager A05;
    public final C164317Wu A08;
    public final Executor A0B;
    public final C68698Vaa A07 = new C68698Vaa(this);
    public final float[] A09 = new float[9];
    public final float[] A0A = new float[9];
    public final WIO A06 = new WIO(this, 1);

    @OnLifecycleEvent(C07R.ON_START)
    public final void startTracking() {
        this.A0B.execute(new RunnableC71278Wr8(this));
    }

    @OnLifecycleEvent(C07R.ON_STOP)
    public final void stopTracking() {
        this.A0B.execute(new RunnableC71279Wr9(this));
    }

    public C70299WQe(Sensor sensor, SensorManager sensorManager, C164317Wu c164317Wu, Executor executor) {
        this.A05 = sensorManager;
        this.A04 = sensor;
        this.A0B = executor;
        this.A08 = c164317Wu;
    }
}
