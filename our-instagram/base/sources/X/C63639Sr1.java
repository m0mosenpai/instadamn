package X;

import android.media.MediaCodec;
import androidx.media3.common.Metadata;
import androidx.media3.container.Mp4OrientationData;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Deque;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Sr1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63639Sr1 implements InterfaceC65556Tmb {
    public final SXF A00;
    public final SFK A01;

    @Override // X.InterfaceC65556Tmb
    public final void A9S(Metadata.Entry entry) {
        this.A01.A00 = (Mp4OrientationData) entry;
    }

    @Override // X.InterfaceC65556Tmb
    public final C63638Sr0 AAe(C70130W5r c70130W5r) {
        SXF sxf = this.A00;
        C63638Sr0 c63638Sr0 = new C63638Sr0(c70130W5r);
        sxf.A08.add(c63638Sr0);
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(WEI.A01(c70130W5r.A0Y))) {
            sxf.A03 = c63638Sr0;
        }
        return c63638Sr0;
    }

    @Override // X.InterfaceC65556Tmb
    public final void FEi(MediaCodec.BufferInfo bufferInfo, InterfaceC65187TfV interfaceC65187TfV, ByteBuffer byteBuffer) {
        long j;
        try {
            SXF sxf = this.A00;
            WDn.A01(interfaceC65187TfV instanceof C63638Sr0);
            if (!sxf.A04) {
                FileChannel fileChannel = sxf.A07;
                fileChannel.position(0L);
                fileChannel.write(AbstractC63352Si9.A00());
                fileChannel.write(sxf.A05.A00(sxf.A08, 0L, true));
                sxf.A04 = true;
            }
            C63638Sr0 c63638Sr0 = (C63638Sr0) interfaceC65187TfV;
            C63638Sr0 c63638Sr02 = sxf.A03;
            if (c63638Sr02 != null) {
                if (c63638Sr0.equals(c63638Sr02) && c63638Sr0.A00 && (bufferInfo.flags & 1) > 0) {
                    Deque deque = c63638Sr0.A02;
                    Object peekFirst = deque.peekFirst();
                    peekFirst.getClass();
                    Object peekLast = deque.peekLast();
                    peekLast.getClass();
                    j = ((MediaCodec.BufferInfo) peekLast).presentationTimeUs - ((MediaCodec.BufferInfo) peekFirst).presentationTimeUs;
                }
                c63638Sr0.A00(bufferInfo, byteBuffer);
                Deque deque2 = c63638Sr0.A02;
                Object peekFirst2 = deque2.peekFirst();
                peekFirst2.getClass();
                Object peekLast2 = deque2.peekLast();
                peekLast2.getClass();
                long j2 = sxf.A02;
                long j3 = ((MediaCodec.BufferInfo) peekFirst2).presentationTimeUs;
                sxf.A02 = Math.min(j2, j3);
                sxf.A01 = Math.max(sxf.A01, ((MediaCodec.BufferInfo) peekLast2).presentationTimeUs - j3);
            }
            j = sxf.A01;
            if (j >= 2000000) {
                SXF.A00(sxf);
            }
            c63638Sr0.A00(bufferInfo, byteBuffer);
            Deque deque22 = c63638Sr0.A02;
            Object peekFirst22 = deque22.peekFirst();
            peekFirst22.getClass();
            Object peekLast22 = deque22.peekLast();
            peekLast22.getClass();
            long j22 = sxf.A02;
            long j32 = ((MediaCodec.BufferInfo) peekFirst22).presentationTimeUs;
            sxf.A02 = Math.min(j22, j32);
            sxf.A01 = Math.max(sxf.A01, ((MediaCodec.BufferInfo) peekLast22).presentationTimeUs - j32);
        } catch (IOException e) {
            C61247Rjk c61247Rjk = C61247Rjk.$redex_init_class;
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Failed to write sample for presentationTimeUs=");
            A1C.append(bufferInfo.presentationTimeUs);
            A1C.append(", size=");
            throw new Exception(AbstractC58318PtA.A0l(A1C, bufferInfo.size), e);
        }
    }

    @Override // X.InterfaceC65556Tmb
    public final void close() {
        try {
            SXF sxf = this.A00;
            try {
                SXF.A00(sxf);
            } finally {
                sxf.A07.close();
                sxf.A06.close();
            }
        } catch (IOException e) {
            throw new Exception("Failed to close the muxer", e);
        }
    }

    public C63639Sr1(FileOutputStream fileOutputStream) {
        SFK sfk = new SFK();
        this.A01 = sfk;
        this.A00 = new SXF(InterfaceC65602Tnr.A00, new SKy(sfk, 1), fileOutputStream);
    }
}
