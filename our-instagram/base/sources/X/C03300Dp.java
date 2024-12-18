package X;

/* renamed from: X.0Dp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03300Dp {
    public final long A00;

    public final String toString() {
        String str;
        long j = this.A00;
        if (j != 0) {
            str = Long.toString(j);
        } else {
            str = "<null ptr>";
        }
        return AnonymousClass001.A0g("[HookedBinderData ptr: ", str, "]");
    }

    public C03300Dp(long j) {
        this.A00 = j;
    }
}
