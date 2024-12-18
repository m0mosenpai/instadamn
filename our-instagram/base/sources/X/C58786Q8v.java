package X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.Q8v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58786Q8v extends AbstractC73327Y8i {
    public long A00;
    public AssetFileDescriptor A01;
    public C62932SYa A02;
    public InputStream A03;
    public boolean A04;
    public final Context A05;

    public C58786Q8v(Context context) {
        super(false);
        this.A05 = context.getApplicationContext();
    }

    @Override // X.InterfaceC65627Tpn
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
                            A02();
                        }
                    } finally {
                        th = th;
                        this.A01 = null;
                        if (!this.A04) {
                        }
                        this.A04 = false;
                        A02();
                        throw th;
                    }
                } catch (IOException e) {
                    throw new C61034Re4(null, e, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
                }
            } catch (IOException e2) {
                throw new C61034Re4(null, e2, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
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
                    throw new C61034Re4(null, e3, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
                }
            } finally {
                th = th;
                this.A01 = null;
                if (!this.A04) {
                }
                this.A04 = false;
                A02();
                throw th;
            }
        }
    }

    @Deprecated
    public static android.net.Uri buildRawResourceUri(int i) {
        return android.net.Uri.parse(AnonymousClass001.A0O("rawresource:///", i));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0145  */
    @Override // X.InterfaceC65627Tpn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long E2I(X.C62932SYa r19) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58786Q8v.E2I(X.SYa):long");
    }

    @Override // X.InterfaceC65627Tpn
    public final android.net.Uri getUri() {
        C62932SYa c62932SYa = this.A02;
        if (c62932SYa != null) {
            return c62932SYa.A01;
        }
        return null;
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
                    throw new C61034Re4(null, e, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
                }
            }
            int read = this.A03.read(bArr, i, i2);
            if (read == -1) {
                if (this.A00 != -1) {
                    throw new C61034Re4("End of stream reached having not read sufficient data.", new EOFException(), CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
                }
            } else {
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
