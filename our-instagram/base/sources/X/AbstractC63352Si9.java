package X;

import android.media.MediaCodec;
import com.facebook.common.dextricks.Constants;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Si9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63352Si9 {
    public static final ImmutableList A00 = ImmutableList.of((byte) -66, (byte) 122, (byte) -49, (byte) -53, (byte) -105, (byte) -87, (byte) 66, (byte) -24, (byte) -100, (byte) 113, (byte) -103, (byte) -108, (byte) -111, (byte) -29, (byte) -81, (byte) -84);

    public static ByteBuffer A01(String str, String str2) {
        ByteBuffer allocate = ByteBuffer.allocate(200);
        allocate.putInt(0);
        allocate.putInt(0);
        Charset charset = AbstractC50482Ts.A05;
        allocate.put(str.getBytes(charset));
        allocate.putInt(0);
        allocate.putInt(0);
        allocate.putInt(0);
        allocate.put(str2.getBytes(charset));
        allocate.put((byte) 0);
        allocate.flip();
        return SQV.A00("hdlr", allocate);
    }

    public static ArrayList A04(List list, List list2, int i) {
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        if (!list.isEmpty()) {
            boolean z = false;
            long j = ((MediaCodec.BufferInfo) list.get(0)).presentationTimeUs;
            long j2 = 0;
            long j3 = 0;
            int i2 = 0;
            boolean z2 = false;
            while (i2 < list.size()) {
                long j4 = ((MediaCodec.BufferInfo) list.get(i2)).presentationTimeUs - j;
                long j5 = ((j4 * i) / 1000000) - j2;
                if (j5 <= 2147483647L) {
                    z = true;
                }
                if (z) {
                    j2 += AbstractC58320PtC.A0A(list2, i2);
                    AbstractC166997dE.A1W(A0q, (int) j5);
                    if (j4 < j3) {
                        z2 = true;
                    }
                    i2++;
                    j3 = j4;
                    z = false;
                } else {
                    throw AbstractC166987dD.A14(String.valueOf("Only 32-bit offset is allowed"));
                }
            }
            if (!z2) {
                A0q.clear();
            }
        }
        return A0q;
    }

    public static ByteBuffer A00() {
        ArrayList A1E = AbstractC166987dD.A1E();
        Charset charset = AbstractC50482Ts.A05;
        A1E.add(ByteBuffer.wrap("isom".getBytes(charset)));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
        allocate.flip();
        A1E.add(allocate);
        int i = 0;
        String[] strArr = {"isom", "iso2", "mp41"};
        do {
            A1E.add(ByteBuffer.wrap(strArr[i].getBytes(charset)));
            i++;
        } while (i < 3);
        return SQV.A01("ftyp", A1E);
    }

    public static ByteBuffer A02(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.limit() + 200);
        allocate.putInt(0);
        allocate.putInt(1);
        allocate.put(byteBuffer);
        allocate.flip();
        return SQV.A00("stsd", allocate);
    }

    public static ArrayList A03(List list, int i, int i2, long j) {
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        ArrayList A0q2 = AbstractC25230BEn.A0q(list);
        if (!list.isEmpty()) {
            long j2 = 0;
            int i3 = 0;
            boolean z = false;
            while (i3 < list.size()) {
                long j3 = ((MediaCodec.BufferInfo) list.get(i3)).presentationTimeUs;
                AbstractC166997dE.A1X(A0q, j3);
                if (j3 < j2) {
                    z = true;
                }
                i3++;
                j2 = j3;
            }
            if (z) {
                Collections.sort(A0q);
            }
            int i4 = 1;
            while (i4 < A0q.size()) {
                long A0N = AbstractC166987dD.A0N(A0q.get(i4));
                long j4 = i;
                long j5 = ((A0N * j4) / 1000000) - ((j * j4) / 1000000);
                if (j5 <= 2147483647L) {
                    AbstractC166997dE.A1X(A0q2, j5);
                    i4++;
                    j = A0N;
                } else {
                    throw AbstractC166987dD.A12(String.format(Locale.US, "Timestamp delta %d doesn't fit into an int", AbstractC58319PtB.A1Y(j5)));
                }
            }
            AbstractC166997dE.A1X(A0q2, 0L);
            if (A0q2.size() > 2) {
                boolean z2 = true;
                if (i2 != 0) {
                    A0q2.set(A0q2.size() - 1, A0q2.get(A0q2.size() - 2));
                    return A0q2;
                }
                if (AbstractC166987dD.A0N(SSP.A00(A0q2)) != 0) {
                    z2 = false;
                }
                WDn.A02(z2);
            }
        }
        return A0q2;
    }
}
