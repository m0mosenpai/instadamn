package X;

import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.os.MemoryFile;
import android.os.SystemClock;
import com.google.common.io.Closeables;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class XZI extends AbstractRunnableC14200nk {
    public final /* synthetic */ XZO A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XZI(XZO xzo) {
        super(83, 2, false, false);
        this.A00 = xzo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        XZO xzo = this.A00;
        Y3X y3x = xzo.A07;
        y3x.getClass();
        int i = xzo.A00;
        MemoryFile[] memoryFileArr = xzo.A0I;
        memoryFileArr.getClass();
        File file = xzo.A08;
        file.getClass();
        long j = xzo.A0F;
        String A00 = MSV.A00(145);
        final boolean z = false;
        if (y3x.A03.compareAndSet(0, 1)) {
            MediaCodec mediaCodec = y3x.A01;
            C0fT.A05(mediaCodec, -2104290731);
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            try {
                MediaMuxer mediaMuxer = new MediaMuxer(file.getAbsolutePath(), 0);
                mediaMuxer.setOrientationHint(i);
                ByteBuffer[] inputBuffers = mediaCodec.getInputBuffers();
                ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
                ArrayList A1E = AbstractC166987dD.A1E();
                for (MemoryFile memoryFile : memoryFileArr) {
                    if (memoryFile != null) {
                        A1E.add(memoryFile);
                    }
                }
                float size = A1E.size() / ((float) (j / 1.0E9d));
                try {
                    C8Is[] c8IsArr = y3x.A02.A01;
                    C14360o3.A0B(c8IsArr, 0);
                    float f = size / (1000.0f / 50.0f);
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    boolean z2 = false;
                    for (C8Is c8Is : c8IsArr) {
                        if (c8Is.A01 == 1.0f && !z2) {
                            C14360o3.A0B(A1E2, 0);
                            A1E2.size();
                            z2 = true;
                        }
                        c8Is.A00(A1E, A1E2, f, -1.0f, -1.0f);
                    }
                    long j2 = 0;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i2 = -1;
                    int i3 = 0;
                    int i4 = 0;
                    boolean z3 = false;
                    int i5 = 0;
                    while (true) {
                        if (SystemClock.elapsedRealtime() - elapsedRealtime > 15000) {
                            break;
                        }
                        int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(2500L);
                        if (dequeueInputBuffer >= 0) {
                            if (i3 != A1E2.size() - 1) {
                                i3++;
                            } else {
                                i4++;
                                if (j2 > 3000000000L && i4 >= 3) {
                                    z3 = true;
                                }
                                i3 = 0;
                            }
                            if (!z3) {
                                ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
                                MemoryFile memoryFile2 = (MemoryFile) A1E2.get(i3);
                                byteBuffer.clear();
                                InputStream inputStream = memoryFile2.getInputStream();
                                while (true) {
                                    try {
                                        try {
                                            byte[] bArr = y3x.A04;
                                            int read = inputStream.read(bArr);
                                            if (read == -1) {
                                                break;
                                            } else {
                                                byteBuffer.put(bArr, 0, read);
                                            }
                                        } catch (Exception e) {
                                            C0K8.A0F(A00, "Error while reading memory file bytes into input buffer", e);
                                            Closeables.A01(inputStream);
                                        }
                                    } catch (Throwable th) {
                                        Closeables.A01(inputStream);
                                        throw th;
                                    }
                                }
                                Closeables.A01(inputStream);
                                mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, memoryFile2.length(), j2 / 1000, 0);
                                i5++;
                                j2 = (long) (j2 + 5.0E7d);
                            }
                        }
                        int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 2500L);
                        if (dequeueOutputBuffer >= 0) {
                            ByteBuffer byteBuffer2 = outputBuffers[dequeueOutputBuffer];
                            if (i2 == -1) {
                                i2 = mediaMuxer.addTrack(mediaCodec.getOutputFormat());
                                mediaMuxer.start();
                            }
                            mediaMuxer.writeSampleData(i2, byteBuffer2, bufferInfo);
                            mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                            i5--;
                            if (i5 == 0 && z3) {
                                z = true;
                                break;
                            }
                        }
                    }
                } catch (RuntimeException e2) {
                    AbstractC12120kG.A07(A00, AbstractC111324zv.A00(3263), e2);
                }
                Y3X.A00(y3x);
                mediaMuxer.release();
            } catch (Exception unused) {
            }
        }
        xzo.A0M.set(3);
        C11T.A03(new Runnable() { // from class: X.YHd
            @Override // java.lang.Runnable
            public final void run() {
                XZI xzi = XZI.this;
                boolean z4 = z;
                XZO xzo2 = xzi.A00;
                ((AbstractC184988In) xzo2).A0H.A01(xzo2.A06, 0, z4, false);
                XZO.A01(xzo2);
            }
        });
    }
}
