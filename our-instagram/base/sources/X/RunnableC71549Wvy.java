package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.Wvy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71549Wvy implements Runnable {
    public final /* synthetic */ C69522Vql A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ Object A02;

    public RunnableC71549Wvy(C69522Vql c69522Vql, Integer num, Object obj) {
        this.A00 = c69522Vql;
        this.A01 = num;
        this.A02 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        long j2;
        WZF wzf = this.A00.A00;
        Integer num = this.A01;
        Object obj = this.A02;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                wzf.A02++;
                return;
            } else {
                obj.getClass();
                WZF.A0A(wzf, (Throwable) obj);
                return;
            }
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
        long longValue = ((Number) objArr[1]).longValue();
        if (booleanValue && wzf.A0X) {
            wzf.A0X = false;
            W1m w1m = wzf.A0h;
            HashMap A00 = WZF.A00(wzf);
            A00.put("first_frame_render_time_ms", String.valueOf(longValue - wzf.A0C));
            W1m.A00(w1m, "media_player_first_frame_rendered", A00);
        }
        long j3 = wzf.A08;
        if (j3 == 0) {
            j3 = wzf.A0C;
            wzf.A08 = j3;
        }
        if (j3 > 0) {
            long j4 = longValue - j3;
            if (j4 >= 35) {
                boolean z = wzf.A0w;
                long j5 = wzf.A0B;
                if (z) {
                    j = j5 + (j4 - 35);
                } else {
                    j = j5 + j4;
                }
                wzf.A0B = j;
                long j6 = wzf.A0D + 1;
                wzf.A0D = j6;
                if (z) {
                    j2 = j4 - 35;
                } else {
                    j2 = j4;
                }
                WZF.A08(wzf, "doFrameRendered: adding delta=%s, mOverallStuckTimeMs=%s, mStuckFramesCount=%s, mEnableDeltaStuckTime=%s", Long.valueOf(j2), Long.valueOf(j), Long.valueOf(j6), Boolean.valueOf(z));
                List list = wzf.A0U;
                if (list.size() < 500) {
                    if (z) {
                        j4 -= 35;
                    }
                    list.add(Long.valueOf(j4));
                }
            }
            wzf.A08 = longValue;
        }
        wzf.A0A++;
    }
}
