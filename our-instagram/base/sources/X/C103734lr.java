package X;

/* renamed from: X.4lr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103734lr {
    public final C0JM A00;
    public final C0JO A01;

    public final long A00(C103804lz c103804lz) {
        long now = this.A00.now();
        long now2 = this.A01.now();
        long elapsedRealtimeNanos = c103804lz.A00.getElapsedRealtimeNanos();
        if (elapsedRealtimeNanos != 0 && Long.valueOf(elapsedRealtimeNanos) != null) {
            return (((now2 * 1000000) - elapsedRealtimeNanos) + 500000) / 1000000;
        }
        if (c103804lz.A03() != null) {
            return now - c103804lz.A03().longValue();
        }
        return Long.MIN_VALUE;
    }

    public C103734lr(C0JM c0jm, C0JO c0jo) {
        this.A00 = c0jm;
        this.A01 = c0jo;
    }
}
