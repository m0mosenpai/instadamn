package X;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes10.dex */
public final class RFU extends C4C1 {
    public long A00;
    public android.net.Uri A01;
    public InputStream A02;
    public boolean A03;
    public final AssetManager A04;

    public RFU(Context context) {
        super(false);
        this.A04 = context.getAssets();
    }

    @Override // X.InterfaceC92354Bq
    public final void close() {
        this.A01 = null;
        try {
            try {
                InputStream inputStream = this.A02;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new C93224Fy(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, e);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A01();
            }
        }
    }

    @Override // X.InterfaceC92354Bq
    public final android.net.Uri getUri() {
        return this.A01;
    }

    @Override // X.InterfaceC92354Bq
    public final long open(C4C7 c4c7) {
        try {
            android.net.Uri uri = c4c7.A06;
            this.A01 = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            A02();
            InputStream open = this.A04.open(path, 1);
            this.A02 = open;
            long j = c4c7.A04;
            if (open.skip(j) >= j) {
                long j2 = c4c7.A03;
                if (j2 != -1) {
                    this.A00 = j2;
                } else {
                    long available = this.A02.available();
                    this.A00 = available;
                    if (available == 2147483647L) {
                        this.A00 = -1L;
                    }
                }
                this.A03 = true;
                A04(c4c7);
                return this.A00;
            }
            throw new C93224Fy(2008, (Throwable) null);
        } catch (RFY e) {
            throw e;
        } catch (IOException e2) {
            boolean z = e2 instanceof FileNotFoundException;
            int i = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
            if (z) {
                i = 2005;
            }
            throw new C93224Fy(i, e2);
        }
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
                    throw new C93224Fy(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, e);
                }
            }
            int read = this.A02.read(bArr, i, i2);
            if (read != -1) {
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
