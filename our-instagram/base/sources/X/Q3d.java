package X;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final class Q3d extends Handler {
    public boolean A00;
    public final WeakReference A01;

    private final float A00(EnumC61156RgH enumC61156RgH, float f, float f2) {
        float f3;
        float f4;
        if (f == 0.0f && f2 == 0.0f) {
            return 0.0f;
        }
        int ordinal = enumC61156RgH.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    f2 = -f;
                    f3 = 20.0f;
                    f4 = f2 * f3;
                    return AbstractC58322PtE.A01(1.0f, f4, 0.0f);
                }
            } else {
                f4 = f * 12.5f;
                return AbstractC58322PtE.A01(1.0f, f4, 0.0f);
            }
        } else {
            f2 = -f2;
        }
        f3 = 14.285714f;
        f4 = f2 * f3;
        return AbstractC58322PtE.A01(1.0f, f4, 0.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0442, code lost:
    
        if (r11 != r6) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0462, code lost:
    
        if (r8 != 0.0f) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x047f, code lost:
    
        if (java.lang.Math.abs(r8 - r5.A01) >= 0.02f) goto L156;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r25) {
        /*
            Method dump skipped, instructions count: 1734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q3d.handleMessage(android.os.Message):void");
    }

    public Q3d(C63962Swn c63962Swn) {
        super(Looper.getMainLooper());
        this.A01 = AbstractC25225BEi.A16(c63962Swn);
    }
}
