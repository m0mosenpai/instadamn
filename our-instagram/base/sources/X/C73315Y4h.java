package X;

import android.media.MediaFormat;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.mediastreaming.opt.muxer.AndroidPlatformMediaMuxerHybrid;
import com.facebook.mediastreaming.opt.muxer.TempFileCreator;
import java.io.File;
import java.util.Arrays;

/* renamed from: X.Y4h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73315Y4h {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public MediaFormat A05;
    public MediaFormat A06;
    public Object A07;
    public Object A08;
    public long A09;
    public final C0JO A0A;
    public final AndroidPlatformMediaMuxerHybrid A0B;
    public final C72757XmY A0C;
    public final TempFileCreator A0D;
    public volatile long A0E;
    public volatile File A0F;
    public volatile Exception A0G;
    public volatile Integer A0H;
    public volatile boolean A0I;
    public volatile boolean A0J;
    public volatile boolean A0K;
    public volatile boolean A0L;
    public volatile boolean A0M;

    public C73315Y4h(C0JO c0jo, AndroidPlatformMediaMuxerHybrid androidPlatformMediaMuxerHybrid, C72757XmY c72757XmY, TempFileCreator tempFileCreator) {
        C14360o3.A0B(c72757XmY, 3);
        this.A0A = c0jo;
        this.A0D = tempFileCreator;
        this.A0C = c72757XmY;
        this.A0B = androidPlatformMediaMuxerHybrid;
        this.A01 = Long.MIN_VALUE;
        this.A04 = Long.MIN_VALUE;
        this.A0H = C05F.A00;
    }

    public static final synchronized void A01(C73315Y4h c73315Y4h, Exception exc) {
        synchronized (c73315Y4h) {
            Object[] copyOf = Arrays.copyOf(new Object[]{exc.getClass(), exc.getMessage()}, 2);
            C14360o3.A0B(copyOf, 3);
            C55219Oei.A01(C73315Y4h.class.getSimpleName(), "Muxing failed due to exception %s: %s", null, Arrays.copyOf(copyOf, copyOf.length));
            c73315Y4h.A0K = true;
            c73315Y4h.A0G = exc;
            File file = c73315Y4h.A0F;
            if (file != null) {
                file.delete();
            }
            c73315Y4h.A0F = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r11 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0009, code lost:
    
        if (r11 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void A02(boolean r11, boolean r12) {
        /*
            r10 = this;
            r9 = r10
            monitor-enter(r9)
            boolean r0 = r10.A0M     // Catch: java.lang.Throwable -> Lc9
            r6 = 0
            r3 = 1
            if (r0 != 0) goto Lb
            r0 = 0
            if (r11 == 0) goto Lc
        Lb:
            r0 = 1
        Lc:
            r10.A0M = r0     // Catch: java.lang.Throwable -> Lc9
            boolean r0 = r10.A0I     // Catch: java.lang.Throwable -> Lc9
            if (r0 != 0) goto L15
            r0 = 0
            if (r11 != 0) goto L16
        L15:
            r0 = 1
        L16:
            r10.A0I = r0     // Catch: java.lang.Throwable -> Lc9
            boolean r0 = r10.A0J     // Catch: java.lang.Throwable -> Lc9
            if (r0 != 0) goto L72
            boolean r0 = r10.A0M     // Catch: java.lang.Throwable -> Lc9
            if (r0 == 0) goto Lae
            boolean r0 = r10.A0I     // Catch: java.lang.Throwable -> Lc9
            if (r0 == 0) goto Lae
            X.0JO r0 = r10.A0A     // Catch: java.lang.Throwable -> Lc9
            long r4 = r0.now()     // Catch: java.lang.Throwable -> Lc9
            long r0 = r10.A0E     // Catch: java.lang.Throwable -> Lc9
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L34
            r10.A0E = r4     // Catch: java.lang.Throwable -> Lc9
        L34:
            if (r12 != 0) goto L44
            boolean r0 = r10.A0L     // Catch: java.lang.Throwable -> Lc9
            if (r0 != 0) goto Lae
            if (r11 == 0) goto Lae
            r10.A0L = r3     // Catch: java.lang.Throwable -> Lc9
            com.facebook.mediastreaming.opt.muxer.AndroidPlatformMediaMuxerHybrid r0 = r10.A0B     // Catch: java.lang.Throwable -> Lc9
            r0.requestRestartVideoEncoder()     // Catch: java.lang.Throwable -> Lc9
            goto Lae
        L44:
            r10.A0L = r6     // Catch: java.lang.Throwable -> Lc9
            long r1 = r10.A0E     // Catch: java.lang.Throwable -> Lc9
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L72
            long r0 = r10.A0E     // Catch: java.lang.Throwable -> Lc9
            long r7 = r4 - r0
            r1 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L72
            java.lang.String r2 = "Frame/sample drop too high since a/v sync start:%d now:%d"
            long r0 = r10.A0E     // Catch: java.lang.Throwable -> Lc9
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> Lc9
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r2, r1, r0)     // Catch: java.lang.Throwable -> Lc9
            X.C14360o3.A0A(r1)     // Catch: java.lang.Throwable -> Lc9
            X.C14360o3.A0B(r1, r3)     // Catch: java.lang.Throwable -> Lc9
            X.Xdq r0 = new X.Xdq     // Catch: java.lang.Throwable -> Lc9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc9
            throw r0     // Catch: java.lang.Throwable -> Lc9
        L72:
            X.XmY r2 = r10.A0C     // Catch: java.lang.Throwable -> Ld0
            java.io.File r0 = r10.A0F     // Catch: java.lang.Throwable -> Ld0
            if (r0 == 0) goto Lc4
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> Ld0
            X.C14360o3.A07(r0)     // Catch: java.lang.Throwable -> Ld0
            android.media.MediaMuxer r1 = new android.media.MediaMuxer     // Catch: java.lang.Throwable -> Ld0
            r1.<init>(r0, r6)     // Catch: java.lang.Throwable -> Ld0
            r2.A02 = r1     // Catch: java.lang.Throwable -> Ld0
            android.media.MediaFormat r0 = r10.A06     // Catch: java.lang.Throwable -> Ld0
            if (r0 == 0) goto Lbf
            int r0 = r1.addTrack(r0)     // Catch: java.lang.Throwable -> Ld0
            r2.A01 = r0     // Catch: java.lang.Throwable -> Ld0
            android.media.MediaMuxer r0 = r2.A02     // Catch: java.lang.Throwable -> Ld0
            if (r0 == 0) goto Lba
            r0.setOrientationHint(r6)     // Catch: java.lang.Throwable -> Ld0
            android.media.MediaFormat r1 = r10.A05     // Catch: java.lang.Throwable -> Ld0
            if (r1 == 0) goto Lb5
            android.media.MediaMuxer r0 = r2.A02     // Catch: java.lang.Throwable -> Ld0
            if (r0 == 0) goto Lcb
            int r0 = r0.addTrack(r1)     // Catch: java.lang.Throwable -> Ld0
            r2.A00 = r0     // Catch: java.lang.Throwable -> Ld0
            android.media.MediaMuxer r0 = r2.A02     // Catch: java.lang.Throwable -> Ld0
            if (r0 == 0) goto Lb0
            r0.start()     // Catch: java.lang.Throwable -> Ld0
            r10.A0J = r3     // Catch: java.lang.Throwable -> Ld0
        Lae:
            monitor-exit(r9)
            return
        Lb0:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()     // Catch: java.lang.Throwable -> Ld0
            goto Lcf
        Lb5:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()     // Catch: java.lang.Throwable -> Ld0
            goto Lcf
        Lba:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()     // Catch: java.lang.Throwable -> Ld0
            goto Lcf
        Lbf:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()     // Catch: java.lang.Throwable -> Ld0
            goto Lcf
        Lc4:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()     // Catch: java.lang.Throwable -> Ld0
            goto Lcf
        Lc9:
            r0 = move-exception
            goto Lcf
        Lcb:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()     // Catch: java.lang.Throwable -> Ld0
        Lcf:
            throw r0     // Catch: java.lang.Throwable -> Ld0
        Ld0:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73315Y4h.A02(boolean, boolean):void");
    }

    public static final void A00(C73315Y4h c73315Y4h) {
        int i;
        if (c73315Y4h.A02 != 0 && !c73315Y4h.A0K && c73315Y4h.A0F != null) {
            long now = c73315Y4h.A0A.now();
            long j = c73315Y4h.A09;
            if (j != 0 && ((i = c73315Y4h.A00) < 0 || now - j < i * 1000)) {
                return;
            }
            c73315Y4h.A09 = now;
            File file = c73315Y4h.A0F;
            if (file == null || !file.exists()) {
                return;
            }
            long usableSpace = file.getUsableSpace();
            long length = file.length();
            if (usableSpace >= c73315Y4h.A02 * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED) {
                long j2 = c73315Y4h.A03;
                if (j2 <= 0 || length <= j2 * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED) {
                    return;
                }
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("exceedMaxDvrFileSize size:%d", Long.valueOf(length));
                C14360o3.A07(formatStrLocaleSafe);
                throw new Exception(formatStrLocaleSafe);
            }
            throw new Exception(StringFormatUtil.formatStrLocaleSafe("lowDiskSpace size:%d, space:%d", Long.valueOf(length), Long.valueOf(usableSpace)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(android.media.MediaFormat r18, java.lang.Integer r19, java.nio.ByteBuffer r20, int r21, int r22, int r23, int r24, long r25) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73315Y4h.A03(android.media.MediaFormat, java.lang.Integer, java.nio.ByteBuffer, int, int, int, int, long):void");
    }
}
