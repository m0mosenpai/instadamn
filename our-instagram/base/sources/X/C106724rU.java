package X;

import android.util.Pair;
import java.io.Serializable;
import java.util.Locale;

/* renamed from: X.4rU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106724rU implements Serializable {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final EnumC106714rT A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public final String toString() {
        Locale locale;
        Object[] objArr;
        String str;
        EnumC106714rT enumC106714rT = this.A09;
        switch (enumC106714rT) {
            case SPAN_ADDED:
            case SPAN_REMOVED:
                locale = Locale.US;
                String str2 = this.A0E;
                String str3 = this.A0D;
                String name = enumC106714rT.name();
                String str4 = this.A0C;
                String str5 = this.A0B;
                long j = this.A05;
                objArr = new Object[]{str2, str3, name, str4, str5, Long.valueOf(j), Long.valueOf(j + this.A02)};
                str = "[%s][%s][%s][%s] - %s [%d, %d] - [%s]";
                return String.format(locale, str, objArr);
            case SPAN_TOUCHED:
                long j2 = this.A05;
                long j3 = this.A04;
                if (j2 == j3) {
                    long j4 = this.A02;
                    if (j4 == this.A03) {
                        locale = Locale.US;
                        objArr = new Object[]{this.A0B, Long.valueOf(j2), Long.valueOf(j2 + j4)};
                        str = "[SPAN HIT] - %s [%d, %d]";
                        return String.format(locale, str, objArr);
                    }
                }
                locale = Locale.US;
                objArr = new Object[]{this.A0B, Long.valueOf(j2), Long.valueOf(j2 + this.A02), Long.valueOf(j3), Long.valueOf(j3 + this.A03)};
                str = "[SPAN_TOUCHED] - %s [%d, %d],[%d,%d]";
                return String.format(locale, str, objArr);
            case CACHE_PARTIAL_HIT:
            case CACHE_PARTIAL_MISS:
            case CACHE_HIT:
            case CACHE_MISS:
                locale = Locale.US;
                objArr = new Object[]{this.A0D, enumC106714rT, Pair.create(Long.valueOf(this.A07), Long.valueOf(this.A06)), Pair.create(Long.valueOf(this.A01), Long.valueOf(this.A00))};
                str = "[%s][%s] Requested %s, cached %s";
                return String.format(locale, str, objArr);
            default:
                return "Unknown. Err-roar";
        }
    }

    public C106724rU(EnumC106714rT enumC106714rT, String str, String str2, String str3, String str4, String str5, long j, long j2, long j3, long j4) {
        this.A09 = enumC106714rT;
        this.A0E = str;
        this.A0D = str2;
        this.A0B = str3;
        this.A05 = j;
        this.A02 = j2;
        this.A04 = j3;
        this.A03 = j4;
        this.A0A = str4;
        this.A07 = 0L;
        this.A06 = 0L;
        this.A01 = 0L;
        this.A00 = 0L;
        this.A08 = System.currentTimeMillis();
        this.A0C = str5;
    }

    public C106724rU(Pair pair, EnumC106714rT enumC106714rT, String str, String str2, String str3, String str4, long j, long j2) {
        this.A09 = enumC106714rT;
        this.A0E = str;
        this.A0D = str2;
        this.A0B = str3;
        this.A07 = j;
        this.A06 = j2;
        this.A01 = pair == null ? -1L : ((Number) pair.first).longValue();
        this.A00 = pair != null ? ((Number) pair.second).longValue() : -1L;
        this.A05 = 0L;
        this.A02 = 0L;
        this.A04 = 0L;
        this.A03 = 0L;
        this.A0A = null;
        this.A08 = System.currentTimeMillis();
        this.A0C = str4;
    }
}
