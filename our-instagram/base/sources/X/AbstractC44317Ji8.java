package X;

import java.util.Arrays;

/* renamed from: X.Ji8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44317Ji8 {
    public static final String A00(long j) {
        long abs = Math.abs(j);
        long j2 = abs / 60;
        if ((abs ^ 60) < 0 && j2 * 60 != abs) {
            j2--;
        }
        long j3 = abs % 60;
        String A0z = AbstractC166997dE.A0z("%02d", Arrays.copyOf(AbstractC25228BEl.A1Y((int) (j3 + (60 & (((j3 ^ 60) & ((-j3) | j3)) >> 63)))), 1));
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(j2);
        A1C.append(':');
        return AbstractC166997dE.A0x(A0z, A1C);
    }
}
