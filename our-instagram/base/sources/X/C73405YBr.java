package X;

import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.view.Surface;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.YBr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73405YBr implements InterfaceC176297sm {
    public int A00;
    public int A01;
    public Surface A02;
    public C177077u3 A03;
    public MediaRecorder A04;
    public RandomAccessFile A05;

    /* JADX WARN: Finally extract failed */
    @Override // X.InterfaceC176297sm
    public final void Eom() {
        try {
            try {
                MediaRecorder mediaRecorder = this.A04;
                if (mediaRecorder != null) {
                    mediaRecorder.stop();
                }
                MediaRecorder mediaRecorder2 = this.A04;
                if (mediaRecorder2 != null) {
                    mediaRecorder2.reset();
                    this.A04.release();
                    this.A04 = null;
                }
                C177077u3 c177077u3 = this.A03;
                if (c177077u3 != null) {
                    c177077u3.A00(null);
                }
                Surface surface = this.A02;
                if (surface != null) {
                    surface.release();
                    this.A02 = null;
                }
                RandomAccessFile randomAccessFile = this.A05;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused) {
                    }
                    this.A05 = null;
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            MediaRecorder mediaRecorder3 = this.A04;
            if (mediaRecorder3 != null) {
                mediaRecorder3.reset();
                this.A04.release();
                this.A04 = null;
            }
            C177077u3 c177077u32 = this.A03;
            if (c177077u32 != null) {
                c177077u32.A00(null);
            }
            Surface surface2 = this.A02;
            if (surface2 != null) {
                surface2.release();
                this.A02 = null;
            }
            RandomAccessFile randomAccessFile2 = this.A05;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException unused2) {
                }
                this.A05 = null;
            }
            throw th;
        }
    }

    @Override // X.InterfaceC176297sm
    public final /* synthetic */ Y1s Eo8(CamcorderProfile camcorderProfile, C176587tG c176587tG, FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2, int i, int i2, boolean z, boolean z2, boolean z3) {
        throw AbstractC166987dD.A1D(AbstractC111324zv.A00(669));
    }

    @Override // X.InterfaceC176297sm
    public final Y1s Eo9(CamcorderProfile camcorderProfile, C176587tG c176587tG, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        int i4;
        if (i2 != 90 && i2 != 270) {
            i3 = camcorderProfile.videoFrameWidth;
            i4 = camcorderProfile.videoFrameHeight;
        } else {
            i3 = camcorderProfile.videoFrameHeight;
            i4 = camcorderProfile.videoFrameWidth;
        }
        float f = i3;
        float f2 = i4;
        float f3 = this.A01 / this.A00;
        if (f / f2 > f3) {
            i3 = (int) (f2 * f3);
        } else {
            i4 = (int) (f / f3);
        }
        camcorderProfile.videoFrameWidth = i3 - (i3 % 16);
        camcorderProfile.videoFrameHeight = i4 - (i4 % 16);
        this.A05 = new RandomAccessFile(str, "rws");
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.A04 = mediaRecorder;
        mediaRecorder.setVideoSource(2);
        MediaRecorder mediaRecorder2 = this.A04;
        if (z2) {
            mediaRecorder2.setAudioSource(5);
            this.A04.setProfile(camcorderProfile);
        } else {
            mediaRecorder2.setOutputFormat(camcorderProfile.fileFormat);
            this.A04.setVideoFrameRate(camcorderProfile.videoFrameRate);
            this.A04.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            this.A04.setVideoEncodingBitRate(camcorderProfile.videoBitRate);
            this.A04.setVideoEncoder(camcorderProfile.videoCodec);
        }
        this.A04.setOrientationHint(0);
        this.A04.setOutputFile(this.A05.getFD());
        this.A04.prepare();
        this.A02 = this.A04.getSurface();
        C177077u3 c177077u3 = this.A03;
        c177077u3.getClass();
        c177077u3.A00(this.A02);
        this.A04.start();
        return Y14.A00(camcorderProfile, new Y14(null, str, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, 0, i));
    }
}
