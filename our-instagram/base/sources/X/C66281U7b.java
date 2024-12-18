package X;

import android.media.MediaFormat;
import com.facebook.ffmpeg.FFMpegAVStream;
import com.facebook.ffmpeg.FFMpegBadDataException;
import com.facebook.ffmpeg.FFMpegBufferInfo;
import com.facebook.ffmpeg.FFMpegMediaFormat;
import com.facebook.ffmpeg.FFMpegMediaMuxer;
import java.util.Map;

/* renamed from: X.U7b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66281U7b implements InterfaceC71993XEh {
    public int A00;
    public int A01;
    public FFMpegAVStream A02;
    public FFMpegAVStream A03;
    public FFMpegBufferInfo A04 = new FFMpegBufferInfo();
    public C66014TyA A05;
    public FFMpegMediaMuxer A06;
    public String A07;
    public String A08;
    public Map A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    @Override // X.InterfaceC71993XEh
    public final String BVz() {
        return "FFMpeg";
    }

    public C66281U7b(C66014TyA c66014TyA, String str, boolean z, String str2, int i, boolean z2, Map map) {
        this.A01 = -1;
        this.A00 = -1;
        this.A0A = false;
        this.A07 = null;
        this.A08 = null;
        this.A05 = c66014TyA;
        this.A01 = i;
        this.A00 = 20;
        this.A0A = z;
        this.A07 = str;
        this.A0B = z2;
        this.A09 = map;
        this.A08 = str2;
    }

    @Override // X.InterfaceC71993XEh
    public final void AJA(String str) {
        FFMpegMediaMuxer fFMpegMediaMuxer = new FFMpegMediaMuxer(this.A05, str, this.A0A, this.A07, this.A01, this.A0B, this.A09, this.A08);
        fFMpegMediaMuxer.initialize();
        this.A06 = fFMpegMediaMuxer;
    }

    @Override // X.InterfaceC71993XEh
    public final void EQ1(MediaFormat mediaFormat) {
        FFMpegMediaMuxer fFMpegMediaMuxer = this.A06;
        this.A02 = fFMpegMediaMuxer.mNativeWrapper.nativeAddStream(FFMpegMediaFormat.toFFMpegMediaFormat(mediaFormat), -1, fFMpegMediaMuxer.A02);
    }

    @Override // X.InterfaceC71993XEh
    public final void EaE(int i) {
        this.A03.setOrientationHint(i);
    }

    @Override // X.InterfaceC71993XEh
    public final void Egv(MediaFormat mediaFormat) {
        FFMpegMediaMuxer fFMpegMediaMuxer = this.A06;
        this.A03 = fFMpegMediaMuxer.mNativeWrapper.nativeAddStream(FFMpegMediaFormat.toFFMpegMediaFormat(mediaFormat), this.A00, fFMpegMediaMuxer.A02);
    }

    @Override // X.InterfaceC71993XEh
    public final void FEO(XD8 xd8) {
        try {
            FFMpegBufferInfo fFMpegBufferInfo = this.A04;
            fFMpegBufferInfo.setFrom(xd8.Aie());
            this.A02.writeFrame(fFMpegBufferInfo, xd8.AjR());
        } catch (FFMpegBadDataException e) {
            throw new Exception(e);
        }
    }

    @Override // X.InterfaceC71993XEh
    public final void FEt(XD8 xd8) {
        try {
            FFMpegBufferInfo fFMpegBufferInfo = this.A04;
            fFMpegBufferInfo.setFrom(xd8.Aie());
            this.A03.writeFrame(fFMpegBufferInfo, xd8.AjR());
        } catch (FFMpegBadDataException e) {
            throw new Exception(e);
        }
    }

    @Override // X.InterfaceC71993XEh
    public final boolean isStarted() {
        return this.A0C;
    }

    @Override // X.InterfaceC71993XEh
    public final void start() {
        this.A06.A00();
        this.A0C = true;
    }

    @Override // X.InterfaceC71993XEh
    public final void stop() {
        this.A06.A01();
        this.A0C = false;
    }
}
