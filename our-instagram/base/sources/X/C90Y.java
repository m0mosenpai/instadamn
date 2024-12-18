package X;

import android.content.Context;
import android.os.VibrationEffect;
import android.os.Vibrator;
import java.util.List;

/* renamed from: X.90Y, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C90Y implements C90Z {
    public Vibrator A00;
    public final Context A01;

    @Override // X.C90Z
    public final void FDc(List list, List list2) {
        VibrationEffect createWaveform;
        Vibrator vibrator = this.A00;
        if (vibrator != null) {
            long[] jArr = new long[list.size()];
            for (int i = 0; i < list.size(); i++) {
                jArr[i] = Math.max(((Number) list.get(i)).longValue(), 0L);
            }
            if (list2.isEmpty()) {
                createWaveform = VibrationEffect.createWaveform(jArr, -1);
            } else {
                int[] iArr = new int[list2.size()];
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    int floatValue = (int) (((Number) list2.get(i2)).floatValue() * 255.0f);
                    iArr[i2] = floatValue;
                    int max = Math.max(floatValue, 0);
                    iArr[i2] = max;
                    iArr[i2] = Math.min(max, 255);
                }
                createWaveform = VibrationEffect.createWaveform(jArr, iArr, -1);
            }
            vibrator.vibrate(createWaveform);
        }
    }

    @Override // X.C90Z
    public final void FDd() {
        Vibrator vibrator = this.A00;
        if (vibrator != null) {
            vibrator.vibrate(VibrationEffect.createOneShot(100L, -1));
        }
    }

    @Override // X.C90Z
    public final void cancel() {
        Vibrator vibrator = this.A00;
        if (vibrator != null) {
            vibrator.cancel();
        }
    }

    public C90Y(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A01 = applicationContext;
        this.A00 = (Vibrator) applicationContext.getSystemService("vibrator");
    }
}
