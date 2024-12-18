package X;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.Q8s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58783Q8s extends AbstractC73327Y8i {
    public long A00;
    public android.net.Uri A01;
    public InputStream A02;
    public boolean A03;
    public final AssetManager A04;

    public C58783Q8s(Context context) {
        super(false);
        this.A04 = context.getAssets();
    }

    @Override // X.InterfaceC65627Tpn
    public final void close() {
        this.A01 = null;
        try {
            try {
                InputStream inputStream = this.A02;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new C61034Re4(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, e);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A02();
            }
        }
    }

    @Override // X.InterfaceC65627Tpn
    public final long E2I(C62932SYa c62932SYa) {
        try {
            android.net.Uri uri = c62932SYa.A01;
            this.A01 = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            A03();
            InputStream open = this.A04.open(path, 1);
            this.A02 = open;
            long j = c62932SYa.A00;
            if (open.skip(j) >= j) {
                long available = this.A02.available();
                this.A00 = available;
                if (available == 2147483647L) {
                    this.A00 = -1L;
                }
                this.A03 = true;
                A05(c62932SYa);
                return this.A00;
            }
            throw new C61034Re4(2008, null);
        } catch (C58788Q8x e) {
            throw e;
        } catch (IOException e2) {
            boolean z = e2 instanceof FileNotFoundException;
            int i = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
            if (z) {
                i = 2005;
            }
            throw new C61034Re4(i, e2);
        }
    }

    @Override // X.InterfaceC65627Tpn
    public final android.net.Uri getUri() {
        return this.A01;
    }

    @Override // X.InterfaceC71873X8g
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
                    throw new C61034Re4(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, e);
                }
            }
            int read = this.A02.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.A00;
                if (j2 != -1) {
                    this.A00 = j2 - read;
                }
                A04(read);
                return read;
            }
        }
        return -1;
    }
}
