package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.Q8t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58784Q8t extends AbstractC73327Y8i {
    public long A00;
    public AssetFileDescriptor A01;
    public android.net.Uri A02;
    public FileInputStream A03;
    public boolean A04;
    public final ContentResolver A05;

    public C58784Q8t(Context context) {
        super(false);
        this.A05 = context.getContentResolver();
    }

    @Override // X.InterfaceC65627Tpn
    public final void close() {
        boolean z;
        this.A02 = null;
        try {
            try {
                FileInputStream fileInputStream = this.A03;
                if (fileInputStream != null) {
                    fileInputStream.close();
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
                    throw new C61034Re4(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, e);
                }
            } catch (IOException e2) {
                throw new C61034Re4(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, e2);
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
                    throw new C61034Re4(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, e3);
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

    @Override // X.InterfaceC65627Tpn
    public final long E2I(C62932SYa c62932SYa) {
        AssetFileDescriptor openAssetFileDescriptor;
        int i = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
        try {
            android.net.Uri normalizeScheme = c62932SYa.A01.normalizeScheme();
            this.A02 = normalizeScheme;
            A03();
            if ("content".equals(normalizeScheme.getScheme())) {
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.A05.openTypedAssetFileDescriptor(normalizeScheme, "*/*", A0b);
            } else {
                openAssetFileDescriptor = this.A05.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.A01 = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.A03 = fileInputStream;
                if (length == -1 || c62932SYa.A00 <= length) {
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long j = c62932SYa.A00;
                    long skip = fileInputStream.skip(j + startOffset) - startOffset;
                    if (skip == j) {
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.A00 = -1L;
                            } else {
                                long position = size - channel.position();
                                this.A00 = position;
                                if (position < 0) {
                                    throw new C61034Re4(2008, null);
                                }
                            }
                        } else {
                            long j2 = length - skip;
                            this.A00 = j2;
                            if (j2 < 0) {
                                throw new C61034Re4(2008, null);
                            }
                        }
                        this.A04 = true;
                        A05(c62932SYa);
                        return this.A00;
                    }
                    throw new C61034Re4(2008, null);
                }
                throw new C61034Re4(2008, null);
            }
            throw new C61034Re4(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, MSW.A0y(AbstractC167017dG.A0n(normalizeScheme, "Could not open file descriptor for: ", AbstractC166987dD.A1C())));
        } catch (C58789Q8y e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = 2005;
            }
            throw new C61034Re4(i, e2);
        }
    }

    @Override // X.InterfaceC65627Tpn
    public final android.net.Uri getUri() {
        return this.A02;
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
            int read = this.A03.read(bArr, i, i2);
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
