package X;

import android.media.MediaFormat;
import android.media.MediaMuxer;

/* loaded from: classes11.dex */
public final class WZ7 implements InterfaceC71993XEh {
    public int A00;
    public int A01;
    public MediaMuxer A02;
    public boolean A03;

    @Override // X.InterfaceC71993XEh
    public final void AJA(String str) {
        this.A02 = new MediaMuxer(str, 0);
        this.A03 = false;
    }

    @Override // X.InterfaceC71993XEh
    public final String BVz() {
        return "Platform";
    }

    @Override // X.InterfaceC71993XEh
    public final void EQ1(MediaFormat mediaFormat) {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        this.A00 = mediaMuxer.addTrack(mediaFormat);
    }

    @Override // X.InterfaceC71993XEh
    public final void EaE(int i) {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        mediaMuxer.setOrientationHint(i);
    }

    @Override // X.InterfaceC71993XEh
    public final void Egv(MediaFormat mediaFormat) {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        this.A01 = mediaMuxer.addTrack(mediaFormat);
    }

    @Override // X.InterfaceC71993XEh
    public final void FEO(XD8 xd8) {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        mediaMuxer.writeSampleData(this.A00, xd8.AjR(), xd8.Aie());
    }

    @Override // X.InterfaceC71993XEh
    public final void FEt(XD8 xd8) {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        mediaMuxer.writeSampleData(this.A01, xd8.AjR(), xd8.Aie());
    }

    @Override // X.InterfaceC71993XEh
    public final boolean isStarted() {
        return this.A03;
    }

    @Override // X.InterfaceC71993XEh
    public final void start() {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        mediaMuxer.start();
        this.A03 = true;
    }

    @Override // X.InterfaceC71993XEh
    public final void stop() {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        mediaMuxer.stop();
        this.A03 = false;
        this.A02.release();
    }
}
