package X;

import android.os.SystemClock;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* renamed from: X.4X0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4X0 implements C4X1 {
    public long A01;
    public final HeroPlayerSetting A03;
    public float A00 = 1.2f;
    public long A02 = -9223372036854775807L;

    @Override // X.C4X1
    public final float BWk(C441321v c441321v, float f, int i) {
        int i2 = c441321v.A0A - i;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.A02;
        if (j == -9223372036854775807L || j + 200 < elapsedRealtime) {
            this.A02 = elapsedRealtime;
            long j2 = this.A01 + i2;
            this.A01 = j2;
            int i3 = c441321v.A0U;
            if (i3 > 0) {
                this.A01 = Math.min(i3, Math.max(-i3, j2));
            }
        }
        double d = c441321v.A01;
        float f2 = this.A00;
        double d2 = f2;
        double d3 = (1.0d - ((d * d2) * i2)) - ((c441321v.A00 * d2) * this.A01);
        this.A00 = Math.max(0.5f, f2 * 0.95f);
        return (float) d3;
    }

    public C4X0(HeroPlayerSetting heroPlayerSetting) {
        this.A03 = heroPlayerSetting;
    }
}
