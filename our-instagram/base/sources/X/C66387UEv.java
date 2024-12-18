package X;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;

/* renamed from: X.UEv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66387UEv extends Fragment {
    public int A00;
    public long A01;
    public long A02;
    public Q7j A03;
    public final WIQ A04 = new WIQ(this);

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Q7j, X.0SG] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-160884726);
        super.onCreate(bundle);
        this.A03 = new C0SG();
        C0f9.A09(-2074729308, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1919433724);
        super.onPause();
        WIQ wiq = this.A04;
        Sensor sensor = wiq.A00;
        if (sensor != null) {
            wiq.A02.A00();
            wiq.A01.unregisterListener(wiq, sensor);
            C0BW.A00.A06(wiq, sensor);
            wiq.A01 = null;
            wiq.A00 = null;
        }
        if (getParentFragmentManager().A0Q("dump_debug_info_dialog_fragment") != null) {
            C14240no c14240no = new C14240no(getParentFragmentManager());
            c14240no.A03(this.A03);
            c14240no.A00();
        }
        C0f9.A09(-846301003, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-878129247);
        super.onResume();
        this.A02 = SystemClock.elapsedRealtime();
        SensorManager sensorManager = (SensorManager) requireActivity().getSystemService("sensor");
        WIQ wiq = this.A04;
        if (wiq.A00 == null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            wiq.A00 = defaultSensor;
            if (defaultSensor != null) {
                wiq.A01 = sensorManager;
                C0fX.A01(defaultSensor, wiq, sensorManager, 1);
            }
        }
        C0f9.A09(989473941, A02);
    }
}
