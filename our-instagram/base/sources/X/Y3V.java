package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes12.dex */
public final class Y3V {
    public float A00 = 1.0f;
    public int A01;
    public YM7 A02;
    public final AudioManager A03;
    public final Y85 A04;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r41 == (-1)) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.Y3V r40, int r41) {
        /*
            r0 = r40
            X.YM7 r0 = r0.A02
            X.Y8E r0 = (X.Y8E) r0
            X.Y8T r10 = r0.A00
            X.Y8T.A02(r10)
            X.Y4C r0 = r10.A0A
            boolean r9 = r0.A0E
            r1 = -1
            r8 = 1
            r2 = r41
            if (r2 != r1) goto L16
            r8 = 2
        L16:
            if (r9 == 0) goto L1b
            r7 = 1
            if (r2 != r1) goto L1c
        L1b:
            r7 = 0
        L1c:
            boolean r6 = X.AbstractC167007dF.A1N(r2)
            if (r9 != r7) goto L2b
            int r1 = r0.A02
            if (r1 != r6) goto L2b
            int r1 = r0.A00
            if (r1 != r8) goto L2b
            return
        L2b:
            int r1 = r10.A02
            int r1 = r1 + 1
            r10.A02 = r1
            boolean r5 = r0.A0F
            if (r5 == 0) goto L94
            androidx.media3.common.Timeline r1 = r0.A06
            r41 = r1
            X.Xp7 r1 = r0.A09
            r40 = r1
            long r13 = r0.A04
            long r11 = r0.A03
            int r1 = r0.A01
            r39 = r1
            X.XQ6 r1 = r0.A07
            r38 = r1
            boolean r1 = r0.A0D
            r35 = r1
            X.Y1Q r1 = r0.A0A
            r20 = r1
            X.XmJ r1 = r0.A0B
            r18 = r1
            java.util.List r1 = r0.A0C
            r19 = r1
            X.Xp7 r1 = r0.A08
            r17 = r1
            int r1 = r0.A00
            r21 = r1
            int r1 = r0.A02
            r16 = r1
            X.Y1o r15 = r0.A05
            long r3 = r0.A0G
            long r1 = r0.A0J
            long r31 = r0.A01()
            long r33 = android.os.SystemClock.elapsedRealtime()
            X.Y4C r0 = new X.Y4C
            r22 = r16
            r23 = r13
            r25 = r11
            r27 = r3
            r29 = r1
            r36 = r9
            r37 = r5
            r11 = r0
            r12 = r15
            r13 = r41
            r14 = r38
            r15 = r40
            r16 = r17
            r17 = r20
            r20 = r39
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r27, r29, r31, r33, r35, r36, r37)
        L94:
            X.Y4C r4 = r0.A03(r8, r6, r7)
            X.Y8B r1 = r10.A0W
            int r0 = r6 << 4
            r8 = r8 | r0
            X.YM5 r3 = r1.A0G
            r2 = 1
            X.Y8Y r3 = (X.Y8Y) r3
            X.Y3Q r1 = X.Y8Y.A00()
            android.os.Handler r0 = r3.A00
            android.os.Message r0 = r0.obtainMessage(r2, r7, r8)
            X.Y3Q.A00(r0, r1, r3)
            r0 = 0
            X.Y8T.A04(r10, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y3V.A00(X.Y3V, int):void");
    }

    public static void A01(Y3V y3v, int i) {
        if (y3v.A01 != i) {
            y3v.A01 = i;
            float f = 1.0f;
            if (i == 4) {
                f = 0.2f;
            }
            if (y3v.A00 != f) {
                y3v.A00 = f;
                Y8T y8t = ((Y8E) y3v.A02).A00;
                Y8T y8t2 = Y8T.$redex_init_class;
                Y8T.A06(y8t, Float.valueOf(y8t.A00 * y8t.A0U.A00), 1, 2);
            }
        }
    }

    public Y3V(Context context, Handler handler, YM7 ym7) {
        Object systemService = context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        systemService.getClass();
        this.A03 = (AudioManager) systemService;
        this.A02 = ym7;
        this.A04 = new Y85(handler, this);
        this.A01 = 0;
    }
}
