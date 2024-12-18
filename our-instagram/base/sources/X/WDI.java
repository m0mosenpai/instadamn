package X;

import android.graphics.RectF;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class WDI {
    public static final RectF A0P = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    public float A00;
    public int A01;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public C68695VaV A0F;
    public C70124W5f A0G;
    public Integer A0H;
    public String A0I;
    public List A0J;
    public Map A0K;
    public Map A0L;
    public boolean A0M;
    public boolean A0O;
    public boolean A0N = false;
    public RectF A0E = A0P;
    public int A04 = -1;
    public int A02 = 30;
    public int A03 = 10;
    public int A0D = -1;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        if (r8.isEmpty() != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.WDI A00(X.MYB r6, X.W94 r7, java.util.List r8) {
        /*
            if (r8 == 0) goto L9
            boolean r0 = r8.isEmpty()
            r5 = 1
            if (r0 == 0) goto La
        L9:
            r5 = 0
        La:
            X.WDI r4 = new X.WDI
            r4.<init>()
            int r3 = r6.A05
            r4.A08 = r3
            int r2 = r6.A03
            r4.A06 = r2
            int r1 = r6.A04
            r4.A07 = r1
            r0 = 30
            r4.A02 = r0
            int r0 = r7.A03
            r4.A03 = r0
            r4.A0J = r8
            int r0 = r1 % 180
            if (r0 == 0) goto L33
            if (r5 == 0) goto L33
            r4.A0C = r2
            r4.A0A = r3
            r0 = 0
            r4.A0B = r0
            return r4
        L33:
            r4.A0C = r3
            r4.A0A = r2
            r4.A0B = r1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WDI.A00(X.MYB, X.W94, java.util.List):X.WDI");
    }

    public final int A01() {
        C70124W5f c70124W5f = this.A0G;
        if (c70124W5f != null) {
            VE8 ve8 = VE8.CODEC_VIDEO_HEVC;
            VE8 ve82 = c70124W5f.A04;
            if (ve8.equals(ve82) || 1 != c70124W5f.A03 || !VE8.CODEC_VIDEO_H264.equals(ve82)) {
                int i = this.A04;
                if (i != -1) {
                    return i;
                }
                int i2 = this.A01;
                int min = Math.min(Math.max((int) (i2 * 0.85d), 655000), i2);
                this.A04 = min;
                return min;
            }
        }
        return this.A01;
    }

    public final String toString() {
        int i;
        Integer valueOf;
        HashMap hashMap = new HashMap();
        hashMap.put("sourceWidth", Integer.valueOf(this.A08));
        hashMap.put("sourceHeight", Integer.valueOf(this.A06));
        hashMap.put("sourceRotationDegreesClockwise", Integer.valueOf(this.A07));
        hashMap.put("targetWidth", Integer.valueOf(this.A0C));
        hashMap.put("targetHeight", Integer.valueOf(this.A0A));
        hashMap.put("outputAspectRatio", Float.valueOf(this.A00));
        hashMap.put("shouldRetainAspectRatio", Boolean.valueOf(this.A0O));
        hashMap.put("targetRotationDegreesClockwise", Integer.valueOf(this.A0B));
        hashMap.put("outputRotationDegreesClockwise", Integer.valueOf(this.A05));
        hashMap.put("cropRectangle", this.A0E);
        Integer num = this.A0H;
        if (num == null) {
            valueOf = null;
        } else {
            if (1 - num.intValue() != 0) {
                i = 0;
            } else {
                i = 1;
            }
            valueOf = Integer.valueOf(i);
        }
        hashMap.put("videoMirroringMode", valueOf);
        hashMap.put("baselineBitRate", Integer.valueOf(this.A01));
        hashMap.put("mainHighBitRate", Integer.valueOf(this.A04));
        hashMap.put("frameRate", Integer.valueOf(this.A02));
        hashMap.put("iframeinterval", Integer.valueOf(this.A03));
        hashMap.put("videoBitrateMode", Integer.valueOf(this.A0D));
        hashMap.put("videoTranscodeProfileLevelParams", this.A0G);
        hashMap.put("glRenderers", this.A0J);
        hashMap.put("debugStats", this.A0I);
        hashMap.put("forceAvcEncoding", Boolean.valueOf(this.A0M));
        return AbstractC1126356r.A04(WDI.class, hashMap);
    }
}
