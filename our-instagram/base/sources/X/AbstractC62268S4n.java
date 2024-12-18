package X;

import android.util.Base64;

/* renamed from: X.S4n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62268S4n {
    public static final String A00(String str) {
        byte[] decode = Base64.decode(str, 2);
        C14360o3.A07(decode);
        String A0x = AbstractC58319PtB.A0x(decode);
        C14360o3.A07(A0x);
        return A0x;
    }
}
