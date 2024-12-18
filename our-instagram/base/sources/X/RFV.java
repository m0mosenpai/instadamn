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

/* loaded from: classes10.dex */
public final class RFV extends C4C1 {
    public long A00;
    public AssetFileDescriptor A01;
    public android.net.Uri A02;
    public FileInputStream A03;
    public boolean A04;
    public final ContentResolver A05;

    public RFV(Context context) {
        super(false);
        this.A05 = context.getContentResolver();
    }

    @Override // X.InterfaceC92354Bq
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
                    throw new C93224Fy(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, e);
                }
            } catch (IOException e2) {
                throw new C93224Fy(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, e2);
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
                    throw new C93224Fy(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, e3);
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

    @Override // X.InterfaceC92354Bq
    public final long open(C4C7 c4c7) {
        AssetFileDescriptor openAssetFileDescriptor;
        long j;
        int i = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
        try {
            android.net.Uri uri = c4c7.A06;
            this.A02 = uri;
            A02();
            if ("content".equals(uri.getScheme())) {
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.A05.openTypedAssetFileDescriptor(uri, "*/*", A0b);
            } else {
                openAssetFileDescriptor = this.A05.openAssetFileDescriptor(uri, "r");
            }
            this.A01 = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.A03 = fileInputStream;
                if (length == -1 || c4c7.A04 <= length) {
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long j2 = c4c7.A04;
                    long skip = fileInputStream.skip(j2 + startOffset) - startOffset;
                    if (skip == j2) {
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.A00 = -1L;
                                j = -1;
                            } else {
                                j = size - channel.position();
                                this.A00 = j;
                                if (j < 0) {
                                    throw new C93224Fy(2008, (Throwable) null);
                                }
                            }
                        } else {
                            j = length - skip;
                            this.A00 = j;
                            if (j < 0) {
                                throw new C93224Fy(2008, (Throwable) null);
                            }
                        }
                        long j3 = c4c7.A03;
                        if (j3 != -1) {
                            if (j != -1) {
                                j3 = Math.min(j, j3);
                            }
                            this.A00 = j3;
                        }
                        this.A04 = true;
                        A04(c4c7);
                        if (j3 != -1) {
                            return j3;
                        }
                        return this.A00;
                    }
                    throw new C93224Fy(2008, (Throwable) null);
                }
                throw new C93224Fy(2008, (Throwable) null);
            }
            throw new C93224Fy(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, MSW.A0y(AbstractC167017dG.A0n(uri, "Could not open file descriptor for: ", AbstractC166987dD.A1C())));
        } catch (RFZ e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
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
            int read = this.A03.read(bArr, i, i2);
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
