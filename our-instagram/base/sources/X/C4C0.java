package X;

import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.4C0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4C0 extends C4C1 {
    public long A00;
    public android.net.Uri A01;
    public RandomAccessFile A02;
    public boolean A03;

    public C4C0() {
        super(false);
    }

    @Override // X.InterfaceC92354Bq
    public final void close() {
        this.A01 = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.A02;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
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
        AbstractC460729r.A01("fileSrcReadOpen");
        android.net.Uri uri = c4c7.A06;
        this.A01 = uri;
        A02();
        int i = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.A02 = randomAccessFile;
            try {
                try {
                    long j = c4c7.A04;
                    randomAccessFile.seek(j);
                    long j2 = c4c7.A03;
                    if (j2 == -1) {
                        j2 = this.A02.length() - j;
                    }
                    this.A00 = j2;
                    AbstractC460729r.A00();
                    if (this.A00 >= 0) {
                        this.A03 = true;
                        A04(c4c7);
                        return this.A00;
                    }
                    throw new C93224Fy(null, null, 2008);
                } catch (IOException e) {
                    throw new C93224Fy(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, e);
                }
            } catch (Throwable th) {
                AbstractC460729r.A00();
                throw th;
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof ErrnoException) || ((ErrnoException) cause).errno != OsConstants.EACCES) {
                    i = 2005;
                }
                throw new C93224Fy(i, e2);
            }
            throw new C93224Fy(String.format(AbstractC58317Pt9.A00(1024), uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
        } catch (SecurityException e3) {
            throw new C93224Fy(2006, e3);
        } catch (RuntimeException e4) {
            throw new C93224Fy(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, e4);
        }
    }

    @Override // X.InterfaceC92364Br
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            if (this.A00 == 0) {
                return -1;
            }
            try {
                AbstractC460729r.A01("fileSrcReadRAF");
                int read = this.A02.read(bArr, i, (int) Math.min(this.A00, i2));
                if (read <= 0) {
                    return read;
                }
                this.A00 -= read;
                A03(read);
                return read;
            } catch (IOException e) {
                throw new C93224Fy(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, e);
            }
        } finally {
            AbstractC460729r.A00();
        }
    }
}
