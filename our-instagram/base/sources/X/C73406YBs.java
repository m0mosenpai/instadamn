package X;

import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.view.Surface;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.YBs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73406YBs implements InterfaceC176297sm {
    public MediaRecorder A00;
    public Surface A01;
    public C176507t8 A02;
    public RandomAccessFile A03;
    public final /* synthetic */ C179937yj A04;

    @Override // X.InterfaceC176297sm
    public final Y1s Eo8(CamcorderProfile camcorderProfile, C176587tG c176587tG, FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2, int i, int i2, boolean z, boolean z2, boolean z3) {
        return A00(camcorderProfile, fileDescriptor, null, i, i2, z2);
    }

    @Override // X.InterfaceC176297sm
    public final Y1s Eo9(CamcorderProfile camcorderProfile, C176587tG c176587tG, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        return A00(camcorderProfile, null, str, i, i2, z2);
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.InterfaceC176297sm
    public final void Eom() {
        try {
            try {
                MediaRecorder mediaRecorder = this.A00;
                if (mediaRecorder != null) {
                    mediaRecorder.stop();
                }
                MediaRecorder mediaRecorder2 = this.A00;
                if (mediaRecorder2 != null) {
                    mediaRecorder2.reset();
                    this.A00.release();
                    this.A00 = null;
                }
                C176507t8 c176507t8 = this.A02;
                if (c176507t8 != null) {
                    this.A04.A04.EG3(c176507t8);
                    this.A02 = null;
                }
                Surface surface = this.A01;
                if (surface != null) {
                    surface.release();
                    this.A01 = null;
                }
                RandomAccessFile randomAccessFile = this.A03;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused) {
                    }
                    this.A03 = null;
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            MediaRecorder mediaRecorder3 = this.A00;
            if (mediaRecorder3 != null) {
                mediaRecorder3.reset();
                this.A00.release();
                this.A00 = null;
            }
            C176507t8 c176507t82 = this.A02;
            if (c176507t82 != null) {
                this.A04.A04.EG3(c176507t82);
                this.A02 = null;
            }
            Surface surface2 = this.A01;
            if (surface2 != null) {
                surface2.release();
                this.A01 = null;
            }
            RandomAccessFile randomAccessFile2 = this.A03;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException unused2) {
                }
                this.A03 = null;
            }
            throw th;
        }
    }

    public C73406YBs(C179937yj c179937yj) {
        this.A04 = c179937yj;
    }

    private Y1s A00(CamcorderProfile camcorderProfile, FileDescriptor fileDescriptor, String str, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (i2 != 90 && i2 != 270) {
            i3 = camcorderProfile.videoFrameWidth;
            i4 = camcorderProfile.videoFrameHeight;
        } else {
            i3 = camcorderProfile.videoFrameHeight;
            i4 = camcorderProfile.videoFrameWidth;
        }
        C179937yj c179937yj = this.A04;
        int i7 = c179937yj.A02 + c179937yj.A00;
        if (i7 % 180 != 0) {
            i5 = c179937yj.A01;
            i6 = c179937yj.A03;
        } else {
            i5 = c179937yj.A03;
            i6 = c179937yj.A01;
        }
        float f = i3;
        float f2 = i4;
        float f3 = i5 / i6;
        if (f / f2 > f3) {
            i3 = (int) (f2 * f3);
        } else {
            i4 = (int) (f / f3);
        }
        int i8 = i3 - (i3 % 16);
        int i9 = i4 - (i4 % 16);
        int i10 = i7 % 360;
        boolean z2 = false;
        int i11 = i8;
        if (i10 % 180 != 0) {
            z2 = true;
            i11 = i9;
        }
        camcorderProfile.videoFrameWidth = i11;
        if (!z2) {
            i8 = i9;
        }
        camcorderProfile.videoFrameHeight = i8;
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.A00 = mediaRecorder;
        mediaRecorder.setVideoSource(2);
        MediaRecorder mediaRecorder2 = this.A00;
        if (z) {
            mediaRecorder2.setAudioSource(5);
            this.A00.setProfile(camcorderProfile);
        } else {
            mediaRecorder2.setOutputFormat(camcorderProfile.fileFormat);
            this.A00.setVideoFrameRate(camcorderProfile.videoFrameRate);
            this.A00.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            this.A00.setVideoEncodingBitRate(camcorderProfile.videoBitRate);
            this.A00.setVideoEncoder(camcorderProfile.videoCodec);
        }
        this.A00.setOrientationHint(i10);
        if (str != null) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rws");
            this.A03 = randomAccessFile;
            this.A00.setOutputFile(randomAccessFile.getFD());
        } else if (fileDescriptor != null) {
            this.A00.setOutputFile(fileDescriptor);
        } else {
            throw AbstractC166987dD.A18("MediaRecorder cannot be prepared without an output destination.");
        }
        this.A00.prepare();
        Surface surface = this.A00.getSurface();
        this.A01 = surface;
        C176507t8 c176507t8 = new C176507t8(surface, false);
        this.A02 = c176507t8;
        c176507t8.A09 = 1;
        this.A02.A07 = 1;
        c179937yj.A04.A9p(this.A02);
        this.A00.start();
        return Y14.A00(camcorderProfile, new Y14(fileDescriptor, str, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, i10, i));
    }
}
