package X;

import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.Q8r, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58782Q8r extends AbstractC73327Y8i {
    public long A00;
    public android.net.Uri A01;
    public RandomAccessFile A02;
    public boolean A03;

    public C58782Q8r() {
        super(false);
    }

    @Override // X.InterfaceC65627Tpn
    public final void close() {
        this.A01 = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.A02;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
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
        android.net.Uri uri = c62932SYa.A01;
        this.A01 = uri;
        A03();
        int i = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.A02 = randomAccessFile;
            try {
                long j = c62932SYa.A00;
                randomAccessFile.seek(j);
                long length = this.A02.length() - j;
                this.A00 = length;
                if (length >= 0) {
                    this.A03 = true;
                    A05(c62932SYa);
                    return this.A00;
                }
                throw new C61034Re4(null, null, 2008);
            } catch (IOException e) {
                throw new C61034Re4(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof ErrnoException) || ((ErrnoException) cause).errno != OsConstants.EACCES) {
                    i = 2005;
                }
                throw new C61034Re4(i, e2);
            }
            throw new C61034Re4(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
        } catch (SecurityException e3) {
            throw new C61034Re4(2006, e3);
        } catch (RuntimeException e4) {
            throw new C61034Re4(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, e4);
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
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.A02.read(bArr, i, (int) Math.min(j, i2));
            if (read <= 0) {
                return read;
            }
            this.A00 -= read;
            A04(read);
            return read;
        } catch (IOException e) {
            throw new C61034Re4(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, e);
        }
    }
}
