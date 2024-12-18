package X;

/* renamed from: X.CGl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27615CGl {
    public static final int A00(C65890Tvu c65890Tvu) {
        String substring = AbstractC166997dE.A0z("%x", AbstractC166997dE.A1b(Integer.valueOf(c65890Tvu.A05), 1)).substring(2);
        C14360o3.A07(substring);
        String A0w = AbstractC25227BEk.A0w(substring, 0, 2);
        String A0w2 = AbstractC25227BEk.A0w(substring, 2, 4);
        String substring2 = substring.substring(4);
        C14360o3.A07(substring2);
        int parseInt = Integer.parseInt(A0w, 16);
        int parseInt2 = Integer.parseInt(A0w2, 16);
        int parseInt3 = Integer.parseInt(substring2, 16);
        int min = Math.min(parseInt, Math.min(parseInt2, parseInt3));
        int max = Math.max(parseInt, Math.max(parseInt2, parseInt3));
        return ((max + min) * (max - min)) / max;
    }
}
