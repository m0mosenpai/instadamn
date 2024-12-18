package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;

/* renamed from: X.AZx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23424AZx implements InterfaceC25219BDt {
    public int A00;
    public MediaMuxer A01;
    public volatile boolean A02;
    public volatile boolean A03;
    public volatile boolean A04;
    public volatile boolean A05;
    public volatile boolean A06;

    @Override // X.InterfaceC25219BDt
    public final void EaE(int i) {
        MediaMuxer mediaMuxer = this.A01;
        if (mediaMuxer != null) {
            mediaMuxer.setOrientationHint(0);
        }
    }

    @Override // X.InterfaceC25219BDt
    public final void FEu(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        MediaMuxer mediaMuxer;
        this.A02 = true;
        if ((bufferInfo.flags & 2) == 0 && (mediaMuxer = this.A01) != null) {
            mediaMuxer.writeSampleData(this.A00, byteBuffer, bufferInfo);
            this.A03 = true;
        }
    }

    @Override // X.InterfaceC25219BDt
    public final void start() {
        this.A06 = true;
        MediaMuxer mediaMuxer = this.A01;
        if (mediaMuxer != null) {
            mediaMuxer.start();
            this.A05 = true;
        }
    }

    @Override // X.InterfaceC25219BDt
    public final void AJA(String str) {
        AJB(str, C05F.A00);
    }

    @Override // X.InterfaceC25219BDt
    public final void ASg() {
        MediaMuxer mediaMuxer = this.A01;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                this.A01.release();
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // X.InterfaceC25219BDt
    public final void EQ1(MediaFormat mediaFormat) {
        throw AbstractC166987dD.A18("VideoOnlyMuxer does not accept an audio format.");
    }

    @Override // X.InterfaceC25219BDt
    public final void Egv(MediaFormat mediaFormat) {
        MediaMuxer mediaMuxer = this.A01;
        if (mediaMuxer != null) {
            this.A00 = mediaMuxer.addTrack(mediaFormat);
            this.A04 = true;
        }
    }

    @Override // X.InterfaceC25219BDt
    public final int EoQ(int[] iArr) {
        int i;
        if (this.A01 != null) {
            if (this.A04 && !this.A03) {
                i = 4;
                if (this.A02) {
                    i = 5;
                }
            } else {
                i = 0;
            }
            if (i == 0) {
                this.A01.stop();
                this.A01.release();
            }
        } else {
            i = 1;
        }
        this.A03 = false;
        this.A01 = null;
        this.A00 = 0;
        if (i != 0 && !this.A05) {
            if (this.A06) {
                return i + 20;
            }
            return i + 10;
        }
        return i;
    }

    @Override // X.InterfaceC25219BDt
    public final void FEP(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        throw AbstractC166987dD.A18("VideoOnlyMuxer does not have audio to write.");
    }

    @Override // X.InterfaceC25219BDt
    public final void AJB(String str, Integer num) {
        int i;
        switch (num.intValue()) {
            case 1:
                i = 1;
                break;
            case 2:
                i = -1;
                break;
            default:
                i = 0;
                break;
        }
        this.A01 = new MediaMuxer(str, i);
        this.A03 = false;
        this.A04 = false;
        this.A02 = false;
        this.A06 = false;
        this.A05 = false;
    }
}
