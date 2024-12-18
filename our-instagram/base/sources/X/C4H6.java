package X;

import java.math.BigInteger;

/* renamed from: X.4H6, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4H6 {
    public static final long A00(String str) {
        C14360o3.A0B(str, 0);
        return A01(str) / 1000000;
    }

    public static final String A03(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new BigInteger(str).and(new BigInteger("FFFFFFFFFFFFFFFF", 16)).toString();
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final String A04(String str, long j) {
        C14360o3.A0B(str, 0);
        if (1388563201 <= j && j < 32945472000L) {
            long parseLong = Long.parseLong(str);
            BigInteger valueOf = BigInteger.valueOf((j * 1000000) + ((((parseLong >> 22) & 2199023255551L) % 100000) * 10) + (parseLong % 10));
            C14360o3.A07(valueOf);
            BigInteger shiftLeft = valueOf.shiftLeft(64);
            BigInteger valueOf2 = BigInteger.valueOf(parseLong);
            C14360o3.A07(valueOf2);
            String obj = shiftLeft.or(valueOf2).toString();
            C14360o3.A07(obj);
            if (obj.length() == 35) {
                return obj;
            }
            throw new RuntimeException(AnonymousClass001.A0g("serverItemId: ", obj, " generated is invalid!"));
        }
        throw new RuntimeException(AnonymousClass001.A0e("serverTimestampSec: ", " passed for generating itemId is invalid!", j));
    }

    public static final String A02(long j, boolean z) {
        long j2;
        if (!z) {
            j2 = 999;
        } else {
            j2 = 0;
        }
        BigInteger valueOf = BigInteger.valueOf((j * 1000) + j2);
        C14360o3.A07(valueOf);
        BigInteger shiftLeft = valueOf.shiftLeft(64);
        BigInteger valueOf2 = BigInteger.valueOf(Long.MAX_VALUE);
        C14360o3.A07(valueOf2);
        String obj = shiftLeft.add(valueOf2).toString();
        C14360o3.A07(obj);
        return obj;
    }

    public static final long A01(String str) {
        long j;
        Long A0k;
        String A03 = A03(str);
        if (A03 != null && (A0k = AbstractC003100w.A0k(10, A03)) != null) {
            j = A0k.longValue() % 10;
        } else {
            j = 0;
        }
        return new BigInteger(str).shiftRight(64).longValue() - j;
    }
}
