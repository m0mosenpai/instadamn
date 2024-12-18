package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.Arrays;
import java.util.Random;

/* renamed from: X.4rs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106914rs {
    public static final Random A07 = new Random();
    public int A00;
    public long A03;
    public long A04;
    public String A06 = Integer.toString(Math.abs(A07.nextInt()), 36);
    public int A02 = -1;
    public int A01 = 0;
    public int[] A05 = null;

    public static C19280xC A00(C106914rs c106914rs, Integer num, long j) {
        long j2;
        if (c106914rs.A05 == null) {
            return null;
        }
        long j3 = c106914rs.A04;
        if (j > j3) {
            j2 = Math.min(64L, (j - c106914rs.A03) + 1);
        } else {
            j2 = (j3 - c106914rs.A03) + 1;
        }
        "time_spent_bit_array".getClass();
        C19280xC A01 = C19280xC.A01("time_spent_bit_array", null);
        A01.A0C("tos_id", c106914rs.A06);
        A01.A0B(TraceFieldType.StartTime, Long.valueOf(c106914rs.A03));
        A01.A0C("tos_array", Arrays.toString(c106914rs.A05));
        A01.A08(Integer.valueOf((int) j2), "tos_len");
        A01.A08(Integer.valueOf(c106914rs.A02), "tos_seq");
        A01.A08(Integer.valueOf(c106914rs.A01), "tos_cum");
        if (num == C05F.A0N) {
            A01.A0C("trigger", "clock_change");
        }
        return A01;
    }

    public C106914rs() {
        this.A00 = 1;
        this.A00 = (int) Math.ceil(2.0d);
    }
}
