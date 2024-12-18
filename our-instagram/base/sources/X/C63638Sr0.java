package X;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Sr0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63638Sr0 implements InterfaceC65303Thb, InterfaceC65187TfV {
    public boolean A00;
    public final C70130W5r A01;
    public final List A06 = AbstractC166987dD.A1E();
    public final List A04 = AbstractC166987dD.A1E();
    public final List A05 = AbstractC166987dD.A1E();
    public final Deque A02 = new ArrayDeque();
    public final Deque A03 = new ArrayDeque();

    public final void A00(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        if (bufferInfo.size != 0 && byteBuffer.remaining() != 0) {
            if ((bufferInfo.flags & 1) > 0) {
                this.A00 = true;
            }
            if (!this.A00 && MediaStreamTrack.VIDEO_TRACK_KIND.equals(WEI.A01(this.A01.A0Y))) {
                return;
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
            allocateDirect.put(byteBuffer);
            allocateDirect.rewind();
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            bufferInfo2.set(allocateDirect.position(), allocateDirect.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
            this.A02.addLast(bufferInfo2);
            this.A03.addLast(allocateDirect);
        }
    }

    @Override // X.InterfaceC65303Thb
    public final int FDf() {
        if (!MediaStreamTrack.AUDIO_TRACK_KIND.equals(WEI.A01(this.A01.A0Y))) {
            return 90000;
        }
        return 48000;
    }

    public C63638Sr0(C70130W5r c70130W5r) {
        this.A01 = c70130W5r;
    }
}
