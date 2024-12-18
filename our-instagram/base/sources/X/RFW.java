package X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes10.dex */
public final class RFW extends C4C1 {
    public long A00;
    public AssetFileDescriptor A01;
    public android.net.Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;
    public final String A06;

    public RFW(Context context) {
        super(false);
        this.A05 = context.getResources();
        this.A06 = context.getPackageName();
    }

    @Override // X.InterfaceC92354Bq
    public final void close() {
        boolean z;
        this.A02 = null;
        try {
            try {
                InputStream inputStream = this.A03;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.A03 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.A01;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        if (z) {
                            this.A04 = false;
                            A01();
                        }
                    } finally {
                        th = th;
                        this.A01 = null;
                        if (!this.A04) {
                        }
                        this.A04 = false;
                        A01();
                        throw th;
                    }
                } catch (IOException e) {
                    throw new C93224Fy(null, e, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
                }
            } catch (IOException e2) {
                throw new C93224Fy(null, e2, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
            }
        } catch (Throwable th) {
            th = th;
            this.A03 = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.A01;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.A01 = null;
                    if (!this.A04) {
                        throw th;
                    }
                } catch (IOException e3) {
                    throw new C93224Fy(null, e3, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
                }
            } finally {
                th = th;
                this.A01 = null;
                if (!this.A04) {
                }
                this.A04 = false;
                A01();
                throw th;
            }
        }
    }

    @Override // X.InterfaceC92354Bq
    public final android.net.Uri getUri() {
        return this.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r1.matches("\\d+") != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0145  */
    @Override // X.InterfaceC92354Bq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long open(X.C4C7 r19) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RFW.open(X.4C7):long");
    }

    @Override // X.InterfaceC92364Br
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new C93224Fy(null, e, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
                }
            }
            int read = this.A03.read(bArr, i, i2);
            if (read == -1) {
                if (this.A00 != -1) {
                    throw new C93224Fy("End of stream reached having not read sufficient data.", new EOFException(), CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
                }
            } else {
                long j2 = this.A00;
                if (j2 != -1) {
                    this.A00 = j2 - read;
                }
                A03(read);
                return read;
            }
        }
        return -1;
    }
}
