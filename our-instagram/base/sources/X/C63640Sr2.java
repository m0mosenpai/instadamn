package X;

import android.media.MediaCodec;
import androidx.media3.common.Metadata;
import androidx.media3.container.Mp4OrientationData;
import com.google.common.collect.Range;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

/* renamed from: X.Sr2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63640Sr2 implements InterfaceC65556Tmb {
    public final C63370SiZ A00;
    public final SFK A01;

    @Override // X.InterfaceC65556Tmb
    public final void A9S(Metadata.Entry entry) {
        this.A01.A00 = (Mp4OrientationData) entry;
    }

    @Override // X.InterfaceC65556Tmb
    public final C63638Sr0 AAe(C70130W5r c70130W5r) {
        C63370SiZ c63370SiZ = this.A00;
        C63638Sr0 c63638Sr0 = new C63638Sr0(c70130W5r);
        List list = c63370SiZ.A09;
        list.add(c63638Sr0);
        Collections.sort(list, new TSE(0));
        return c63638Sr0;
    }

    @Override // X.InterfaceC65556Tmb
    public final void FEi(MediaCodec.BufferInfo bufferInfo, InterfaceC65187TfV interfaceC65187TfV, ByteBuffer byteBuffer) {
        try {
            C63370SiZ c63370SiZ = this.A00;
            WDn.A01(interfaceC65187TfV instanceof C63638Sr0);
            ((C63638Sr0) interfaceC65187TfV).A00(bufferInfo, byteBuffer);
            int i = 0;
            boolean z = false;
            while (true) {
                List list = c63370SiZ.A09;
                if (i >= list.size()) {
                    break;
                }
                C63638Sr0 c63638Sr0 = (C63638Sr0) list.get(i);
                if (c63638Sr0.A02.size() > 2) {
                    Deque deque = c63638Sr0.A02;
                    Object peekFirst = deque.peekFirst();
                    peekFirst.getClass();
                    Object peekLast = deque.peekLast();
                    peekLast.getClass();
                    if (((MediaCodec.BufferInfo) peekLast).presentationTimeUs - ((MediaCodec.BufferInfo) peekFirst).presentationTimeUs > 1000000) {
                        C63370SiZ.A04(c63370SiZ, c63638Sr0);
                        z = true;
                    }
                }
                i++;
            }
            if (z && c63370SiZ.A06) {
                C63370SiZ.A02(c63370SiZ);
            }
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
            C63370SiZ c63370SiZ = this.A00;
            int i = 0;
            while (true) {
                try {
                    List list = c63370SiZ.A09;
                    if (i >= list.size()) {
                        break;
                    }
                    C63370SiZ.A04(c63370SiZ, (C63638Sr0) list.get(i));
                    i++;
                } finally {
                    c63370SiZ.A08.close();
                    c63370SiZ.A07.close();
                }
            }
            if (c63370SiZ.A0A.get()) {
                if (c63370SiZ.A06) {
                    C63370SiZ.A02(c63370SiZ);
                } else {
                    ByteBuffer A00 = C63370SiZ.A00(c63370SiZ);
                    int remaining = A00.remaining();
                    long j = c63370SiZ.A01;
                    long j2 = c63370SiZ.A00;
                    long j3 = remaining + 8;
                    boolean z = true;
                    if (j - j2 < j3) {
                        C63370SiZ.A05(c63370SiZ, A00, ((Long) c63370SiZ.A05.upperBound.A01()).longValue() + j3);
                        long j4 = c63370SiZ.A01;
                        j2 = c63370SiZ.A00;
                        WDn.A02(MSY.A1R(((j4 - j2) > j3 ? 1 : ((j4 - j2) == j3 ? 0 : -1))));
                    }
                    FileChannel fileChannel = c63370SiZ.A08;
                    fileChannel.position(j2);
                    fileChannel.write(A00);
                    long j5 = remaining + j2;
                    long longValue = ((Long) c63370SiZ.A05.upperBound.A01()).longValue() - j5;
                    if (longValue >= 2147483647L) {
                        z = false;
                    }
                    WDn.A02(z);
                    ByteBuffer allocate = ByteBuffer.allocate(8);
                    allocate.putInt((int) longValue);
                    allocate.put("free".getBytes(AbstractC50482Ts.A05));
                    allocate.flip();
                    fileChannel.write(allocate);
                    c63370SiZ.A01 = j2;
                    C63370SiZ.A03(c63370SiZ, j2 - c63370SiZ.A02);
                    c63370SiZ.A05 = Range.A00(Long.valueOf(j2), Long.valueOf(j2 + A00.limit()));
                    fileChannel.truncate(j5);
                }
            }
        } catch (IOException e) {
            throw new Exception("Failed to close the muxer", e);
        }
    }

    public C63640Sr2(SFK sfk, C63370SiZ c63370SiZ) {
        this.A00 = c63370SiZ;
        this.A01 = sfk;
    }
}
