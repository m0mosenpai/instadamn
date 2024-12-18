package X;

import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes11.dex */
public abstract class VNB {
    public static final boolean A00(C7Kp c7Kp, C47701L4i c47701L4i, Integer num, String str, boolean z, boolean z2) {
        C66340UAd c66340UAd;
        C66340UAd c66340UAd2;
        C14360o3.A0B(c7Kp, 0);
        AbstractC167007dF.A1E(c47701L4i, 1, num);
        View view = c47701L4i.A03;
        C14360o3.A0C(view, "null cannot be cast to non-null type com.facebook.xac.powerups.hearts.HeartsReleaseView");
        UAV uav = (UAV) view;
        if (uav.getParent() != null) {
            return false;
        }
        ViewGroup viewGroup = c47701L4i.A05;
        if (viewGroup != null) {
            viewGroup.addView(uav);
            viewGroup.setVisibility(0);
        }
        VaZ vaZ = new VaZ(uav);
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                C69607VsA c69607VsA = (C69607VsA) c7Kp.A01.get(str);
                if (c69607VsA != null) {
                    WeakReference weakReference = c69607VsA.A02;
                    if (weakReference != null && (c66340UAd2 = (C66340UAd) weakReference.get()) != null && c66340UAd2.getCanReleaseHearts()) {
                        Iterator it = c66340UAd2.A05.iterator();
                        while (it.hasNext()) {
                            C66340UAd.A04((C69465Vno) it.next(), c66340UAd2, vaZ);
                        }
                    }
                    WeakReference weakReference2 = c69607VsA.A03;
                    if (weakReference2 != null && (c66340UAd = (C66340UAd) weakReference2.get()) != null && c66340UAd.getCanReleaseHearts()) {
                        Iterator it2 = c66340UAd.A05.iterator();
                        while (it2.hasNext()) {
                            C66340UAd.A04((C69465Vno) it2.next(), c66340UAd, vaZ);
                        }
                    }
                }
            } else {
                throw new RuntimeException();
            }
        } else {
            C69607VsA c69607VsA2 = (C69607VsA) c7Kp.A01.get(str);
            if (c69607VsA2 != null) {
                c69607VsA2.A00(vaZ);
            } else {
                c7Kp.A00.put(str, vaZ);
            }
        }
        if (z) {
            Object systemService = AbstractC166997dE.A0L(uav).getSystemService("vibrator");
            C14360o3.A0C(systemService, AbstractC111324zv.A00(1134));
            Vibrator vibrator = (Vibrator) systemService;
            long[] jArr = {50, 150, 50, 150, 50, 25, 50, 25, 50, 25, 50};
            if (vibrator.hasAmplitudeControl()) {
                vibrator.vibrate(VibrationEffect.createWaveform(jArr, new int[]{15, 0, 10, 0, 25, 0, 15, 0, 10, 0, 15}, -1));
            } else if (z2) {
                vibrator.vibrate(jArr, -1);
            } else {
                vibrator.vibrate(50L);
            }
        }
        uav.A01 = new C50358MLk(c47701L4i, 36);
        return true;
    }
}
