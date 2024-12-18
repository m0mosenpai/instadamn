package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.2qP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61012qP {
    public final int A00;
    public final int A01;
    public final long A02;
    public final byte[] A03;

    public static C61012qP A00(ByteOrder byteOrder, int[] iArr) {
        int i = C60782q2.A0l[3];
        int length = iArr.length;
        ByteBuffer wrap = ByteBuffer.wrap(new byte[i * length]);
        wrap.order(byteOrder);
        for (int i2 : iArr) {
            wrap.putShort((short) i2);
        }
        return new C61012qP(-1L, wrap.array(), 3, length);
    }

    public static C61012qP A01(ByteOrder byteOrder, long[] jArr) {
        int i = C60782q2.A0l[4];
        int length = jArr.length;
        ByteBuffer wrap = ByteBuffer.wrap(new byte[i * length]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new C61012qP(-1L, wrap.array(), 4, length);
    }

    public static C61012qP A02(ByteOrder byteOrder, Q0Y[] q0yArr) {
        int i = C60782q2.A0l[5];
        int length = q0yArr.length;
        ByteBuffer wrap = ByteBuffer.wrap(new byte[i * length]);
        wrap.order(byteOrder);
        for (Q0Y q0y : q0yArr) {
            wrap.putInt((int) q0y.A01);
            wrap.putInt((int) q0y.A00);
        }
        return new C61012qP(-1L, wrap.array(), 5, length);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0012. Please report as an issue. */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0185: MOVE (r12 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:389), block:B:147:0x0185 */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0188 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(java.nio.ByteOrder r14) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61012qP.A04(java.nio.ByteOrder):java.lang.Object");
    }

    public final String toString() {
        return AnonymousClass001.A09(this.A03.length, "(", C60782q2.A0m[this.A00], AbstractC111324zv.A00(1408), ")");
    }

    public C61012qP(long j, byte[] bArr, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A03 = bArr;
    }

    public final int A03(ByteOrder byteOrder) {
        Object A04 = A04(byteOrder);
        if (A04 != null) {
            if (A04 instanceof String) {
                return Integer.parseInt((String) A04);
            }
            if (A04 instanceof long[]) {
                long[] jArr = (long[]) A04;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (A04 instanceof int[]) {
                int[] iArr = (int[]) A04;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException(AbstractC111324zv.A00(1563));
        }
        throw new NumberFormatException(AbstractC111324zv.A00(1699));
    }

    public final String A05(ByteOrder byteOrder) {
        Object A04 = A04(byteOrder);
        if (A04 == null) {
            return null;
        }
        if (A04 instanceof String) {
            return (String) A04;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (A04 instanceof long[]) {
            long[] jArr = (long[]) A04;
            while (true) {
                int length = jArr.length;
                if (i >= length) {
                    break;
                }
                sb.append(jArr[i]);
                i++;
                if (i != length) {
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                }
            }
        } else if (A04 instanceof int[]) {
            int[] iArr = (int[]) A04;
            while (true) {
                int length2 = iArr.length;
                if (i >= length2) {
                    break;
                }
                sb.append(iArr[i]);
                i++;
                if (i != length2) {
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                }
            }
        } else if (A04 instanceof double[]) {
            double[] dArr = (double[]) A04;
            while (true) {
                int length3 = dArr.length;
                if (i >= length3) {
                    break;
                }
                sb.append(dArr[i]);
                i++;
                if (i != length3) {
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                }
            }
        } else {
            if (!(A04 instanceof Q0Y[])) {
                return null;
            }
            Q0Y[] q0yArr = (Q0Y[]) A04;
            while (true) {
                int length4 = q0yArr.length;
                if (i >= length4) {
                    break;
                }
                Q0Y q0y = q0yArr[i];
                sb.append(q0y.A01);
                sb.append('/');
                sb.append(q0y.A00);
                i++;
                if (i != length4) {
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                }
            }
        }
        return sb.toString();
    }
}
