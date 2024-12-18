package X;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class AC8 {
    public C22823A4s A00;
    public volatile boolean A01 = false;
    public final /* synthetic */ C176177sa A02;

    public AC8(C176177sa c176177sa) {
        this.A02 = c176177sa;
    }

    public final void A00(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        if (!this.A01) {
            if ((bufferInfo.flags & 4) != 0) {
                this.A01 = true;
                return;
            }
            C176177sa c176177sa = this.A02;
            synchronized (c176177sa) {
                C176137sW c176137sW = c176177sa.A07;
                if (c176137sW != null) {
                    c176137sW.A03(bufferInfo, EnumC176237sg.AUDIO, byteBuffer);
                }
            }
        }
    }

    public final void A01(Exception exc) {
        if (this.A00 != null) {
            AbstractC223559ty abstractC223559ty = new AbstractC223559ty(22001, exc);
            C176177sa c176177sa = this.A02;
            C177527um c177527um = c176177sa.A05;
            if (c177527um != null) {
                abstractC223559ty.A01(c177527um.A00());
            }
            try {
                abstractC223559ty.A00("supported_configs", AMJ.A02(AMJ.A03()));
            } catch (Exception unused) {
            }
            c176177sa.A0F.Cl9(abstractC223559ty, "inprogress_recording_audio_failure", "AudioRecordingTrack", "", "AudioEncoderCallback", null, AbstractC166987dD.A0M(c176177sa));
            C176097sS c176097sS = this.A00.A00;
            c176097sS.A04(abstractC223559ty);
            c176097sS.A07(new C23418AZr());
            this.A00 = null;
        }
    }
}
