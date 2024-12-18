package X;

import org.webrtc.CameraVideoCapturer;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.Scs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63092Scs {
    public static final int[] A00 = {2002, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, C3OO.FLAG_MOVED};

    public static void A01(C97974ac c97974ac, int i) {
        c97974ac.A0E(7);
        byte[] bArr = c97974ac.A02;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        r8 = r4.A01(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (r4.A05() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (r4.A01(3) <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        r4.A03(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        r0 = 44100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (r4.A05() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        r0 = 48000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        r4 = r4.A01(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r0 != 44100) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r4 != 13) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        return X.AbstractC63092Scs.A00[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009c, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r0 != 48000) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        r1 = X.AbstractC63092Scs.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r4 >= 14) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        r3 = r1[r4];
        r2 = r8 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (r2 == 1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r2 == 2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (r2 == 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        if (r2 != 4) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        if (r4 == 3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
    
        if (r4 == 8) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        if (r4 != 11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        return r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0092, code lost:
    
        if (r4 == 8) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0094, code lost:
    
        if (r4 != 11) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
    
        if (r4 == 3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r4 != 8) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        if (r4.A01(2) == 3) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        r4.A01(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        if (r4.A05() != false) goto L46;
     */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.4bF] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(java.nio.ByteBuffer r8) {
        /*
            r2 = 16
            byte[] r1 = new byte[r2]
            int r0 = r8.position()
            r8.get(r1)
            r8.position(r0)
            X.4bF r4 = new X.4bF
            r4.<init>()
            r4.A03 = r1
            r4.A01 = r2
            r4.A01(r2)
            int r1 = r4.A01(r2)
            r7 = 4
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 != r0) goto L29
            r0 = 24
            r4.A01(r0)
        L29:
            r6 = 2
            int r0 = r4.A01(r6)
            r5 = 3
            if (r0 != r5) goto L3a
        L31:
            r4.A01(r6)
            boolean r0 = r4.A05()
            if (r0 != 0) goto L31
        L3a:
            r0 = 10
            int r8 = r4.A01(r0)
            boolean r0 = r4.A05()
            if (r0 == 0) goto L4f
            int r0 = r4.A01(r5)
            if (r0 <= 0) goto L4f
            r4.A03(r6)
        L4f:
            boolean r3 = r4.A05()
            r2 = 48000(0xbb80, float:6.7262E-41)
            r1 = 44100(0xac44, float:6.1797E-41)
            r0 = 44100(0xac44, float:6.1797E-41)
            if (r3 == 0) goto L61
            r0 = 48000(0xbb80, float:6.7262E-41)
        L61:
            int r4 = r4.A01(r7)
            if (r0 != r1) goto L70
            r0 = 13
            if (r4 != r0) goto L9c
            int[] r0 = X.AbstractC63092Scs.A00
            r3 = r0[r4]
        L6f:
            return r3
        L70:
            if (r0 != r2) goto L9c
            int[] r1 = X.AbstractC63092Scs.A00
            r0 = 14
            if (r4 >= r0) goto L9c
            r3 = r1[r4]
            int r2 = r8 % 5
            r1 = 8
            r0 = 1
            if (r2 == r0) goto L97
            r0 = 11
            if (r2 == r6) goto L92
            if (r2 == r5) goto L97
            if (r2 != r7) goto L6f
            if (r4 == r5) goto L8f
            if (r4 == r1) goto L8f
            if (r4 != r0) goto L6f
        L8f:
            int r3 = r3 + 1
            return r3
        L92:
            if (r4 == r1) goto L8f
            if (r4 != r0) goto L6f
            goto L8f
        L97:
            if (r4 == r5) goto L8f
            if (r4 != r1) goto L6f
            goto L8f
        L9c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63092Scs.A00(java.nio.ByteBuffer):int");
    }
}
