package X;

import android.os.VibrationEffect;
import android.os.Vibrator;

/* loaded from: classes10.dex */
public abstract class S45 {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        long j;
        int i;
        String str = (String) c6fw.A01();
        Vibrator vibrator = (Vibrator) C6BQ.A09(c6fq).A00.getSystemService("vibrator");
        if (vibrator != null && vibrator.hasVibrator()) {
            if (!str.equals("strong")) {
                if (!str.equals("weak")) {
                    j = 40;
                    i = 143;
                } else {
                    j = 10;
                    i = 47;
                }
            } else {
                j = 80;
                i = 255;
            }
            vibrator.vibrate(VibrationEffect.createOneShot(j, i));
            return null;
        }
        return null;
    }
}
