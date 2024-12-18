package X;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class OXg {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        r10 = X.C0fT.A01(r1, -1098697001);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        r3.selectTrack(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r10 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        X.C0fT.A07(r10, null, r12, null, 0, -366572983);
        X.C0fT.A05(r10, -1594093423);
        r2 = new android.media.MediaCodec.BufferInfo();
        r7 = r10.getInputBuffers();
        X.C14360o3.A07(r7);
        r6 = false;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        r12 = r10.dequeueInputBuffer(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r12 < 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        r18 = r3.readSampleData(r7[r12], 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r18 >= 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        r10.queueInputBuffer(r12, 0, 0, 0, 4);
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b7, code lost:
    
        r10.queueInputBuffer(r12, 0, r18, r3.getSampleTime(), 0);
        r3.advance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        r1 = r10.dequeueOutputBuffer(r2, com.facebook.proxygen.LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r1 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if ((r2.flags & 4) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        r10.releaseOutputBuffer(r1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r6 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        r3.release();
        X.C0fT.A06(r10, 1657950010);
        X.C0fT.A03(r10, -1633396843);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        return 0.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        if (r5 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0097, code lost:
    
        if (r1 != (-2)) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
    
        r1 = r10.getOutputFormat().getInteger("sample-rate");
        r3.release();
        X.C0fT.A06(r10, -1736924188);
        X.C0fT.A03(r10, 1345472773);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d8, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
    
        r0 = "Error creating decoder ";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final double A00(java.lang.String r21) {
        /*
            java.lang.String r4 = "Error"
            r14 = 0
            android.media.MediaExtractor r3 = new android.media.MediaExtractor
            r3.<init>()
            r8 = 0
            r0 = r21
            r3.setDataSource(r0)     // Catch: java.io.IOException -> Ld4
            int r5 = r3.getTrackCount()
            r2 = 0
        L14:
            r11 = 0
            if (r2 >= r5) goto Lc9
            android.media.MediaFormat r12 = r3.getTrackFormat(r2)
            X.C14360o3.A07(r12)
            java.lang.String r0 = "mime"
            java.lang.String r1 = r12.getString(r0)
            if (r1 == 0) goto L32
            java.lang.String r0 = "audio/"
            boolean r0 = X.AbstractC002300n.A0h(r1, r0, r14)
            if (r0 == 0) goto L32
            r0 = -1098697001(0xffffffffbe8336d7, float:-0.25627777)
            goto L35
        L32:
            int r2 = r2 + 1
            goto L14
        L35:
            android.media.MediaCodec r10 = X.C0fT.A01(r1, r0)     // Catch: java.io.IOException -> Ld8
            r3.selectTrack(r2)
            if (r10 == 0) goto Lc9
            r15 = -366572983(0xffffffffea268a49, float:-5.033368E25)
            r13 = r11
            X.C0fT.A07(r10, r11, r12, r13, r14, r15)
            r0 = -1594093423(0xffffffffa0fc1091, float:-4.2701423E-19)
            X.C0fT.A05(r10, r0)
            android.media.MediaCodec$BufferInfo r2 = new android.media.MediaCodec$BufferInfo
            r2.<init>()
            java.nio.ByteBuffer[] r7 = r10.getInputBuffers()
            X.C14360o3.A07(r7)
            r6 = 0
            r5 = 0
        L59:
            r0 = 0
            int r12 = r10.dequeueInputBuffer(r0)
            if (r12 < 0) goto L72
            r4 = r7[r12]
            int r18 = r3.readSampleData(r4, r14)
            if (r18 >= 0) goto Lb7
            r17 = 4
            r11 = r10
            r13 = r14
            r15 = r0
            r11.queueInputBuffer(r12, r13, r14, r15, r17)
            r5 = 1
        L72:
            r0 = 5000(0x1388, double:2.4703E-320)
            int r1 = r10.dequeueOutputBuffer(r2, r0)
            if (r1 < 0) goto L96
            int r0 = r2.flags
            r0 = r0 & 4
            if (r0 == 0) goto L81
            r6 = 1
        L81:
            r10.releaseOutputBuffer(r1, r14)
            if (r6 == 0) goto Lb4
            r3.release()
            r0 = 1657950010(0x62d24f3a, float:1.9397626E21)
            X.C0fT.A06(r10, r0)
            r0 = -1633396843(0xffffffff9ea45795, float:-1.7400398E-20)
            X.C0fT.A03(r10, r0)
            return r8
        L96:
            r0 = -2
            if (r1 != r0) goto Lb4
            android.media.MediaFormat r1 = r10.getOutputFormat()
            java.lang.String r0 = "sample-rate"
            int r0 = r1.getInteger(r0)
            double r1 = (double) r0
            r3.release()
            r0 = -1736924188(0xffffffff9878a3e4, float:-3.2135992E-24)
            X.C0fT.A06(r10, r0)
            r0 = 1345472773(0x50324905, float:1.1964519E10)
            X.C0fT.A03(r10, r0)
            return r1
        Lb4:
            if (r5 != 0) goto L72
            goto L59
        Lb7:
            long r19 = r3.getSampleTime()
            r15 = r10
            r16 = r12
            r17 = r14
            r21 = r14
            r15.queueInputBuffer(r16, r17, r18, r19, r21)
            r3.advance()
            goto L72
        Lc9:
            java.lang.String r0 = "Null decoder"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)     // Catch: java.lang.IllegalStateException -> Ld0
            throw r0     // Catch: java.lang.IllegalStateException -> Ld0
        Ld0:
            r1 = move-exception
            java.lang.String r0 = "Error decoder check null  "
            goto Ldb
        Ld4:
            r1 = move-exception
            java.lang.String r0 = "Error creating extractor "
            goto Ldb
        Ld8:
            r1 = move-exception
            java.lang.String r0 = "Error creating decoder "
        Ldb:
            X.C0K8.A0F(r4, r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OXg.A00(java.lang.String):double");
    }

    public static final int A01(String str) {
        int i;
        MediaExtractor mediaExtractor = new MediaExtractor();
        int i2 = 0;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            i = 0;
            for (int i3 = 0; i3 < trackCount; i3++) {
                try {
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i3);
                    C14360o3.A07(trackFormat);
                    String string = trackFormat.getString("mime");
                    if (string != null && AbstractC002300n.A0h(string, "audio/", false)) {
                        i = trackFormat.getInteger("channel-count");
                    }
                } catch (IOException | IllegalArgumentException e) {
                    e = e;
                    i2 = i;
                    C0K8.A0F("Error", "Error extracting channel count", e);
                    i = i2;
                    mediaExtractor.release();
                    return i;
                }
            }
        } catch (IOException | IllegalArgumentException e2) {
            e = e2;
        }
        mediaExtractor.release();
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ca, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01cb, code lost:
    
        r1 = "Error creating decoder ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r9 = X.C0fT.A01(r3, 1099392127);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        r14.selectTrack(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.nio.ByteBuffer A02(java.lang.String r33, long r34, long r36) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OXg.A02(java.lang.String, long, long):java.nio.ByteBuffer");
    }
}
