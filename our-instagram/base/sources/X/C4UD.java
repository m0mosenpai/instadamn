package X;

import com.google.common.collect.ImmutableMap;
import java.util.Arrays;

/* renamed from: X.4UD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4UD {
    public static final ImmutableMap A02;
    public final int[] A00;
    public static final C4UD A01 = new C4UD(new int[]{2});
    public static final C4UD A03 = new C4UD(new int[]{2, 5, 6});

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.put(5, 6);
        builder.put(17, 6);
        builder.put(7, 6);
        builder.put(18, 6);
        builder.put(6, 8);
        builder.put(8, 8);
        builder.put(14, 8);
        A02 = builder.buildOrThrow();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C4UD) && Arrays.equals(this.A00, ((C4UD) obj).A00);
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r3 > 8) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0122, code lost:
    
        if (r0 != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair A00(X.C4B6 r8) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4UD.A00(X.4B6):android.util.Pair");
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.A00) * 31) + 8;
    }

    public final String toString() {
        return AnonymousClass001.A08(8, AbstractC58317Pt9.A00(460), ", supportedEncodings=", Arrays.toString(this.A00), "]");
    }

    public C4UD(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.A00 = copyOf;
        Arrays.sort(copyOf);
    }
}
