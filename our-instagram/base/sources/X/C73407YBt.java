package X;

import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.RandomAccessFile;

/* renamed from: X.YBt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73407YBt implements InterfaceC176297sm {
    public MediaRecorder A00;
    public final InterfaceC175197qt A01;
    public final boolean A04;
    public final MediaRecorder.OnInfoListener A03 = new Y87(this);
    public final MediaRecorder.OnErrorListener A02 = new Y86(this);

    @Override // X.InterfaceC176297sm
    public final Y1s Eo8(CamcorderProfile camcorderProfile, C176587tG c176587tG, FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2, int i, int i2, boolean z, boolean z2, boolean z3) {
        A00(camcorderProfile, fileDescriptor, i2, z, z3);
        Y14 y14 = new Y14(fileDescriptor, null, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, i2, i);
        y14.A01(Y1s.A0W, Long.valueOf(SystemClock.elapsedRealtime()));
        return new Y1s(y14);
    }

    @Override // X.InterfaceC176297sm
    public final Y1s Eo9(CamcorderProfile camcorderProfile, C176587tG c176587tG, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        A00(camcorderProfile, new RandomAccessFile(str, "rws").getFD(), i2, z, z3);
        return Y14.A00(camcorderProfile, new Y14(null, str, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, i2, i));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00(android.media.CamcorderProfile r16, java.io.FileDescriptor r17, int r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73407YBt.A00(android.media.CamcorderProfile, java.io.FileDescriptor, int, boolean, boolean):void");
    }

    @Override // X.InterfaceC176297sm
    public final void Eom() {
        MediaRecorder mediaRecorder = this.A00;
        if (mediaRecorder != null) {
            try {
                try {
                    mediaRecorder.stop();
                } catch (RuntimeException e) {
                    android.util.Log.e("SimpleVideoCapture", "stopVideoRecording", e);
                    throw new RuntimeException(e);
                }
            } finally {
                this.A00.reset();
                this.A00.release();
                this.A00 = null;
            }
        }
    }

    public C73407YBt(InterfaceC175197qt interfaceC175197qt, boolean z) {
        this.A04 = z;
        this.A01 = interfaceC175197qt;
    }
}
