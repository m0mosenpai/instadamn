package X;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AC9 {
    public C22823A4s A00;
    public volatile boolean A01 = false;
    public final /* synthetic */ C176247sh A02;

    public AC9(C176247sh c176247sh) {
        this.A02 = c176247sh;
    }

    public final void A00(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        if (!this.A01) {
            if ((bufferInfo.flags & 4) != 0) {
                this.A01 = true;
                return;
            }
            C176247sh c176247sh = this.A02;
            if (c176247sh.A0B.CUZ(126)) {
                C176267sj c176267sj = c176247sh.A0E;
                c176267sj.A03++;
                int i = c176267sj.A02 + 1;
                c176267sj.A02 = i;
                long currentTimeMillis = System.currentTimeMillis();
                if (c176267sj.A04 == 0) {
                    c176267sj.A04 = currentTimeMillis;
                }
                long j = c176267sj.A06;
                if (j == 0) {
                    c176267sj.A07 = currentTimeMillis;
                    c176267sj.A06 = currentTimeMillis;
                    j = currentTimeMillis;
                }
                if (currentTimeMillis > c176267sj.A07 + 1000) {
                    if (i < 30) {
                        c176267sj.A05 += 30 - i;
                        c176267sj.A01 += 30 - i;
                    }
                    if (currentTimeMillis > j + 30000) {
                        c176267sj.A09.add(Integer.valueOf(c176267sj.A01));
                        c176267sj.A01 = 0;
                        c176267sj.A06 = currentTimeMillis;
                    }
                    c176267sj.A07 = currentTimeMillis;
                    c176267sj.A02 = 0;
                }
            }
            synchronized (c176247sh) {
                C176137sW c176137sW = c176247sh.A03;
                if (c176137sW != null) {
                    c176137sW.A03(bufferInfo, EnumC176237sg.VIDEO, byteBuffer);
                }
            }
        }
    }

    public final void A01(Exception exc, Map map) {
        if (this.A00 != null) {
            AbstractC223559ty abstractC223559ty = new AbstractC223559ty(23001, exc);
            abstractC223559ty.A01(map);
            C176247sh c176247sh = this.A02;
            c176247sh.A0D.Cl9(abstractC223559ty, "inprogress_recording_video_failure", "AbstractVideoRecordingTrack", "", "VideoEncoderCallback", null, AbstractC166987dD.A0M(c176247sh));
            C176097sS c176097sS = this.A00.A00;
            c176097sS.A04(abstractC223559ty);
            c176097sS.A07(new C23418AZr());
        }
    }
}
