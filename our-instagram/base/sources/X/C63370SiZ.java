package X;

import android.media.MediaCodec;
import com.google.common.collect.Range;
import java.io.FileOutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.SiZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63370SiZ {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Range A05;
    public final FileOutputStream A07;
    public final FileChannel A08;
    public final InterfaceC65602Tnr A0B;
    public final SKy A0C;
    public boolean A06 = true;
    public final List A09 = AbstractC166987dD.A1E();
    public final AtomicBoolean A0A = AbstractC166997dE.A17();

    public C63370SiZ(InterfaceC65602Tnr interfaceC65602Tnr, SKy sKy, FileOutputStream fileOutputStream) {
        this.A07 = fileOutputStream;
        this.A08 = fileOutputStream.getChannel();
        this.A0C = sKy;
        this.A0B = interfaceC65602Tnr;
        Long A0d = AbstractC167007dF.A0d();
        this.A05 = Range.A00(A0d, A0d);
    }

    private void A01(long j) {
        if (!this.A06) {
            long j2 = this.A00 + j;
            long j3 = this.A01;
            if (j2 >= j3) {
                A05(this, A00(this), Math.max(j3 + Math.min(1000000000L, Math.max(500000L, ((float) r4) * 0.2f)) + j, AbstractC166987dD.A0N(this.A05.upperBound.A01())));
            }
        }
    }

    public static void A03(C63370SiZ c63370SiZ, long j) {
        FileChannel fileChannel = c63370SiZ.A08;
        fileChannel.position(c63370SiZ.A02 + 8);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putLong(j);
        allocate.flip();
        fileChannel.write(allocate);
    }

    public static void A04(C63370SiZ c63370SiZ, C63638Sr0 c63638Sr0) {
        Deque deque = c63638Sr0.A03;
        int size = deque.size();
        Deque deque2 = c63638Sr0.A02;
        boolean z = false;
        WDn.A02(AbstractC167007dF.A1P(size, deque2.size()));
        if (!deque2.isEmpty()) {
            if (!c63370SiZ.A0A.getAndSet(true)) {
                FileChannel fileChannel = c63370SiZ.A08;
                fileChannel.position(0L);
                fileChannel.write(AbstractC63352Si9.A00());
                if (c63370SiZ.A06) {
                    c63370SiZ.A04 = fileChannel.position();
                    fileChannel.write(SQV.A00("free", ByteBuffer.allocate(400000)));
                    c63370SiZ.A03 = fileChannel.position();
                }
                c63370SiZ.A02 = fileChannel.position();
                ByteBuffer allocate = ByteBuffer.allocate(16);
                allocate.putInt(1);
                allocate.put("mdat".getBytes(AbstractC50482Ts.A05));
                allocate.putLong(16L);
                allocate.flip();
                fileChannel.write(allocate);
                long j = c63370SiZ.A02 + 16;
                c63370SiZ.A00 = j;
                if (c63370SiZ.A06) {
                    j = Long.MAX_VALUE;
                }
                c63370SiZ.A01 = j;
            }
            long j2 = 0;
            while (deque.iterator().hasNext()) {
                j2 += ((Buffer) r6.next()).limit();
            }
            c63370SiZ.A01(j2);
            AbstractC58318PtA.A1A(c63370SiZ.A00, c63638Sr0.A04);
            MSX.A0u(deque2.size(), c63638Sr0.A05);
            do {
                MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) deque2.removeFirst();
                ByteBuffer byteBuffer = (ByteBuffer) deque.removeFirst();
                String str = c63638Sr0.A01.A0Y;
                str.getClass();
                if (str.equals("video/avc") || str.equals("video/hevc")) {
                    byteBuffer = AbstractC61641RrC.A00(byteBuffer);
                    bufferInfo.set(byteBuffer.position(), byteBuffer.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
                }
                c63370SiZ.A01(byteBuffer.remaining());
                c63370SiZ.A00 = c63370SiZ.A00 + c63370SiZ.A08.write(byteBuffer, r2);
                c63638Sr0.A06.add(bufferInfo);
            } while (!deque2.isEmpty());
            if (c63370SiZ.A00 <= c63370SiZ.A01) {
                z = true;
            }
            WDn.A02(z);
        }
    }

    public static void A05(C63370SiZ c63370SiZ, ByteBuffer byteBuffer, long j) {
        boolean z = true;
        WDn.A02(MSY.A1R((j > AbstractC166987dD.A0N(c63370SiZ.A05.upperBound.A01()) ? 1 : (j == AbstractC166987dD.A0N(c63370SiZ.A05.upperBound.A01()) ? 0 : -1))));
        if (j < c63370SiZ.A01) {
            z = false;
        }
        WDn.A02(z);
        FileChannel fileChannel = c63370SiZ.A08;
        fileChannel.position(j);
        fileChannel.write(SQV.A00("free", byteBuffer.duplicate()));
        long j2 = 8 + j;
        c63370SiZ.A01 = j2;
        A03(c63370SiZ, j2 - c63370SiZ.A02);
        c63370SiZ.A05 = Range.A00(Long.valueOf(j), Long.valueOf(j + byteBuffer.remaining()));
    }

    public static void A02(C63370SiZ c63370SiZ) {
        ByteBuffer A00 = A00(c63370SiZ);
        int remaining = A00.remaining();
        long remaining2 = A00.remaining() + 8;
        long j = c63370SiZ.A03;
        long j2 = c63370SiZ.A04;
        if (remaining2 <= j - j2) {
            FileChannel fileChannel = c63370SiZ.A08;
            fileChannel.position(j2);
            fileChannel.write(A00);
            fileChannel.write(SQV.A00("free", ByteBuffer.allocate((int) ((c63370SiZ.A03 - fileChannel.position()) - 8))));
        } else {
            c63370SiZ.A06 = false;
            long j3 = c63370SiZ.A00;
            c63370SiZ.A01 = j3;
            FileChannel fileChannel2 = c63370SiZ.A08;
            fileChannel2.position(j3);
            fileChannel2.write(A00);
            long j4 = c63370SiZ.A01;
            c63370SiZ.A05 = Range.A00(Long.valueOf(j4), Long.valueOf(j4 + remaining));
            fileChannel2.write(SQV.A00("free", ByteBuffer.allocate((int) ((c63370SiZ.A03 - c63370SiZ.A04) - 8))), c63370SiZ.A04);
        }
        A03(c63370SiZ, c63370SiZ.A00 - c63370SiZ.A02);
    }

    public static ByteBuffer A00(C63370SiZ c63370SiZ) {
        List list;
        long j = Long.MAX_VALUE;
        int i = 0;
        while (true) {
            list = c63370SiZ.A09;
            if (i >= list.size()) {
                break;
            }
            C63638Sr0 c63638Sr0 = (C63638Sr0) list.get(i);
            if (!c63638Sr0.A06.isEmpty()) {
                j = Math.min(((MediaCodec.BufferInfo) c63638Sr0.A06.get(0)).presentationTimeUs, j);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            return c63370SiZ.A0C.A00(list, j, false);
        }
        return ByteBuffer.allocate(0);
    }
}
