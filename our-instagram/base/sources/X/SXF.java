package X;

import android.R;
import android.media.MediaCodec;
import com.google.common.collect.ImmutableList;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/* loaded from: classes10.dex */
public final class SXF {
    public long A01;
    public C63638Sr0 A03;
    public boolean A04;
    public final SKy A05;
    public final FileOutputStream A06;
    public final FileChannel A07;
    public final InterfaceC65602Tnr A09;
    public final List A08 = AbstractC166987dD.A1E();
    public long A02 = Long.MAX_VALUE;
    public int A00 = 1;

    /* JADX WARN: Multi-variable type inference failed */
    public static void A00(SXF sxf) {
        long j;
        int i;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i2 = 0;
        while (true) {
            List list = sxf.A08;
            if (i2 >= list.size()) {
                break;
            }
            if (!((C63638Sr0) list.get(i2)).A02.isEmpty()) {
                int i3 = i2 + 1;
                C63638Sr0 c63638Sr0 = (C63638Sr0) list.get(i2);
                Deque deque = c63638Sr0.A03;
                int size = deque.size();
                Deque deque2 = c63638Sr0.A02;
                WDn.A02(AbstractC167007dF.A1P(size, deque2.size()));
                ImmutableList.Builder builder2 = new ImmutableList.Builder();
                ImmutableList.Builder builder3 = new ImmutableList.Builder();
                String str = c63638Sr0.A01.A0Y;
                str.getClass();
                if (!str.equals("video/avc") && !str.equals("video/hevc")) {
                    builder2.addAll(deque);
                    deque.clear();
                    builder3.addAll(deque2);
                    deque2.clear();
                } else {
                    while (!deque.isEmpty()) {
                        ByteBuffer A00 = AbstractC61641RrC.A00((ByteBuffer) deque.removeFirst());
                        builder2.add((Object) A00);
                        MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) deque2.removeFirst();
                        bufferInfo.set(A00.position(), A00.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
                        builder3.add((Object) bufferInfo);
                    }
                }
                ImmutableList build = builder3.build();
                if (sxf.A00 == 1) {
                    j = sxf.A02;
                } else {
                    j = ((MediaCodec.BufferInfo) build.get(0)).presentationTimeUs;
                }
                ArrayList A03 = AbstractC63352Si9.A03(build, c63638Sr0.FDf(), 1, j);
                ArrayList A04 = AbstractC63352Si9.A04(build, A03, c63638Sr0.FDf());
                boolean A1b = AbstractC25226BEj.A1b(A04);
                ImmutableList.Builder builder4 = new ImmutableList.Builder();
                int i4 = 0;
                for (int i5 = 0; i5 < build.size(); i5++) {
                    i4 += ((MediaCodec.BufferInfo) build.get(i5)).size;
                    long A0N = AbstractC166987dD.A0N(A03.get(i5));
                    int i6 = ((MediaCodec.BufferInfo) build.get(i5)).size;
                    int i7 = ((MediaCodec.BufferInfo) build.get(i5)).flags;
                    if (A1b) {
                        i = AbstractC166987dD.A0H(A04.get(i5));
                    } else {
                        i = 0;
                    }
                    builder4.add((Object) new SH6(A0N, i6, i7, i));
                }
                builder.add((Object) new SI5(builder2.build(), builder4.build(), i3, i4, A1b));
            }
            i2++;
        }
        ImmutableList build2 = builder.build();
        FileChannel fileChannel = sxf.A07;
        long position = fileChannel.position();
        ImmutableList.Builder builder5 = new ImmutableList.Builder();
        int i8 = 0;
        for (int i9 = 0; i9 < build2.size(); i9++) {
            SI5 si5 = (SI5) build2.get(i9);
            int size2 = si5.A03.size();
            boolean z = si5.A04;
            ImmutableList immutableList = AbstractC63352Si9.A00;
            int i10 = 3;
            if (z) {
                i10 = 4;
            }
            i8 += 32 + (i10 * size2 * 4) + 12 + 8;
        }
        int i11 = i8 + 24 + 8;
        for (int i12 = 0; i12 < build2.size(); i12++) {
            SI5 si52 = (SI5) build2.get(i12);
            int i13 = si52.A01;
            ImmutableList immutableList2 = AbstractC63352Si9.A00;
            ByteBuffer allocate = ByteBuffer.allocate(16);
            allocate.putInt(1);
            allocate.putInt(i13);
            allocate.putLong(position);
            allocate.flip();
            ByteBuffer A002 = SQV.A00("tfhd", allocate);
            ImmutableList immutableList3 = si52.A03;
            boolean z2 = si52.A04;
            int size3 = immutableList3.size();
            int i14 = 3;
            if (z2) {
                i14 = 4;
            }
            ByteBuffer allocate2 = ByteBuffer.allocate((i14 * size3 * 4) + 12);
            int i15 = 16779009;
            if (z2) {
                i15 = 16781057;
            }
            AbstractC58320PtC.A1R(allocate2, immutableList3, i15);
            allocate2.putInt(i11);
            for (int i16 = 0; i16 < immutableList3.size(); i16++) {
                SH6 sh6 = (SH6) immutableList3.get(i16);
                allocate2.putInt((int) sh6.A03);
                allocate2.putInt(sh6.A02);
                int i17 = sh6.A01 & 1;
                int i18 = R.attr.theme;
                if (i17 != 0) {
                    i18 = 33554432;
                }
                allocate2.putInt(i18);
                if (z2) {
                    allocate2.putInt(sh6.A00);
                }
            }
            allocate2.flip();
            builder5.add((Object) SQV.A01("traf", ImmutableList.of((Object) A002, (Object) SQV.A00("trun", allocate2))));
            i11 += si52.A00;
        }
        ImmutableList build3 = builder5.build();
        if (!build3.isEmpty()) {
            int i19 = sxf.A00;
            ImmutableList immutableList4 = AbstractC63352Si9.A00;
            ByteBuffer allocate3 = ByteBuffer.allocate(8);
            allocate3.putInt(0);
            allocate3.putInt(i19);
            allocate3.flip();
            ByteBuffer A003 = SQV.A00("mfhd", allocate3);
            ImmutableList.Builder builder6 = new ImmutableList.Builder();
            builder6.add((Object) A003);
            builder6.addAll(build3);
            fileChannel.write(SQV.A01("moof", builder6.build()));
            long position2 = fileChannel.position();
            ByteBuffer allocate4 = ByteBuffer.allocate(8);
            allocate4.putInt(8);
            allocate4.put("mdat".getBytes(AbstractC50482Ts.A05));
            allocate4.flip();
            fileChannel.write(allocate4);
            boolean z3 = false;
            long j2 = 0;
            for (int i20 = 0; i20 < build2.size(); i20++) {
                for (int i21 = 0; i21 < ((SI5) build2.get(i20)).A02.size(); i21++) {
                    j2 += fileChannel.write((ByteBuffer) r10.A02.get(i21));
                }
            }
            long position3 = fileChannel.position();
            fileChannel.position(position2);
            ByteBuffer allocate5 = ByteBuffer.allocate(4);
            long j3 = j2 + 8;
            if (j3 <= 4294967295L) {
                z3 = true;
            }
            WDn.A03(z3, "Only 32-bit long mdat size supported in the fragmented MP4");
            allocate5.putInt((int) j3);
            allocate5.flip();
            fileChannel.write(allocate5);
            fileChannel.position(position3);
            sxf.A00++;
        }
    }

    public SXF(InterfaceC65602Tnr interfaceC65602Tnr, SKy sKy, FileOutputStream fileOutputStream) {
        this.A06 = fileOutputStream;
        this.A07 = fileOutputStream.getChannel();
        this.A05 = sKy;
        this.A09 = interfaceC65602Tnr;
    }
}
