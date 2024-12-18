package X;

/* loaded from: classes9.dex */
public abstract class No1 {
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
    
        r10.stop();
        r10.release();
        r7.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d0, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(java.lang.String r13, java.lang.String r14, java.util.List r15, long r16, long r18) {
        /*
            r1 = r16
            r9 = 0
            X.C14360o3.A0B(r13, r9)
            r8 = 1
            android.media.MediaExtractor r7 = new android.media.MediaExtractor     // Catch: java.lang.Throwable -> Ld8
            r7.<init>()     // Catch: java.lang.Throwable -> Ld8
            r7.setDataSource(r13)     // Catch: java.lang.Throwable -> Ld8
            android.media.MediaMuxer r10 = new android.media.MediaMuxer     // Catch: java.lang.Throwable -> Ld8
            r10.<init>(r14, r9)     // Catch: java.lang.Throwable -> Ld8
            int r13 = r7.getTrackCount()     // Catch: java.lang.Throwable -> Ld8
            r11 = -1
            r12 = 0
            r17 = -1
            r6 = -1
            r5 = -1
        L1e:
            r0 = 2
            r14 = r15
            if (r12 >= r13) goto L69
            android.media.MediaFormat r4 = r7.getTrackFormat(r12)     // Catch: java.lang.Throwable -> Ld8
            X.C14360o3.A07(r4)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r0 = "mime"
            java.lang.String r3 = r4.getString(r0)     // Catch: java.lang.Throwable -> Ld8
            if (r3 == 0) goto L66
            java.lang.String r0 = "video/"
            boolean r0 = X.AbstractC002300n.A0h(r3, r0, r9)     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L4f
            X.NeN r0 = X.EnumC53110NeN.A03     // Catch: java.lang.Throwable -> Ld8
            boolean r0 = r15.contains(r0)     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L4f
            java.lang.String r0 = "max-input-size"
            int r17 = r4.getInteger(r0)     // Catch: java.lang.Throwable -> Ld8
            r7.selectTrack(r12)     // Catch: java.lang.Throwable -> Ld8
            int r6 = r10.addTrack(r4)     // Catch: java.lang.Throwable -> Ld8
            goto L66
        L4f:
            java.lang.String r0 = "audio/"
            boolean r0 = X.AbstractC002300n.A0h(r3, r0, r9)     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L66
            X.NeN r0 = X.EnumC53110NeN.A02     // Catch: java.lang.Throwable -> Ld8
            boolean r0 = r15.contains(r0)     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L66
            r7.selectTrack(r12)     // Catch: java.lang.Throwable -> Ld8
            int r5 = r10.addTrack(r4)     // Catch: java.lang.Throwable -> Ld8
        L66:
            int r12 = r12 + 1
            goto L1e
        L69:
            if (r17 >= 0) goto L6d
            r17 = 1048576(0x100000, float:1.469368E-39)
        L6d:
            r15 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r15
            r7.seekTo(r1, r0)     // Catch: java.lang.Throwable -> Ld8
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r17)     // Catch: java.lang.Throwable -> Ld8
            android.media.MediaCodec$BufferInfo r2 = new android.media.MediaCodec$BufferInfo     // Catch: java.lang.Throwable -> Ld8
            r2.<init>()     // Catch: java.lang.Throwable -> Ld8
            r10.start()     // Catch: java.lang.Throwable -> Ld8
        L7f:
            r2.offset = r9     // Catch: java.lang.Throwable -> Ld8
            int r0 = r7.readSampleData(r3, r9)     // Catch: java.lang.Throwable -> Ld8
            r2.size = r0     // Catch: java.lang.Throwable -> Ld8
            if (r0 >= 0) goto L8a
            goto Lc5
        L8a:
            long r0 = r7.getSampleTime()     // Catch: java.lang.Throwable -> Ld8
            r2.presentationTimeUs = r0     // Catch: java.lang.Throwable -> Ld8
            r12 = 0
            int r4 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r4 <= 0) goto L9d
            long r12 = r18 * r15
            int r4 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r4 <= 0) goto L9d
            goto Lc7
        L9d:
            int r0 = r7.getSampleFlags()     // Catch: java.lang.Throwable -> Ld8
            r2.flags = r0     // Catch: java.lang.Throwable -> Ld8
            int r0 = r14.size()     // Catch: java.lang.Throwable -> Ld8
            if (r0 != r8) goto Lab
            r0 = 0
            goto Lbe
        Lab:
            int r0 = r7.getSampleTrackIndex()     // Catch: java.lang.Throwable -> Ld8
            if (r0 != r6) goto Lb5
            if (r6 == r11) goto Lb5
            r0 = r6
            goto Lbe
        Lb5:
            int r0 = r7.getSampleTrackIndex()     // Catch: java.lang.Throwable -> Ld8
            if (r0 != r5) goto Ld1
            if (r5 == r11) goto Ld1
            r0 = r5
        Lbe:
            r10.writeSampleData(r0, r3, r2)     // Catch: java.lang.Throwable -> Ld8
            r7.advance()     // Catch: java.lang.Throwable -> Ld8
            goto L7f
        Lc5:
            r2.size = r9     // Catch: java.lang.Throwable -> Ld8
        Lc7:
            r10.stop()     // Catch: java.lang.Throwable -> Ld8
            r10.release()     // Catch: java.lang.Throwable -> Ld8
            r7.release()     // Catch: java.lang.Throwable -> Ld8
            return r8
        Ld1:
            java.lang.String r0 = "Invalid track index!"
            java.io.IOException r0 = X.MSW.A0y(r0)     // Catch: java.lang.Throwable -> Ld8
            throw r0     // Catch: java.lang.Throwable -> Ld8
        Ld8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.No1.A00(java.lang.String, java.lang.String, java.util.List, long, long):boolean");
    }
}
