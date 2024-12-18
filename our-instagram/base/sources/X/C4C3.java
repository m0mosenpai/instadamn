package X;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.4C3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4C3 {
    public static final C4C3 A01 = new C4C3(new C4C4((byte) 3, true), "DEFAULT", 0);
    public static final C4C3 A02;
    public static final C4C3 A03;
    public final C4C4 A00;

    static {
        new C4C3(new C4C4((byte) 4, false), "PREFETCH", 1);
        new C4C3(new C4C4((byte) 3, false), "IMPORTANT_PREFETCH", 2);
        new C4C3(new C4C4((byte) 4, true), "PREFETCH_INCREMENTAL", 3);
        new C4C3(new C4C4((byte) 3, true), "IMPORTANT_PREFETCH_INCREMENTAL", 4);
        A03 = new C4C3(new C4C4((byte) 5, false), "UNIMPORTANT_PREFETCH", 5);
        new C4C3(new C4C4((byte) 5, true), "UNIMPORTANT_PREFETCH_INCREMENTAL", 6);
        new C4C3(new C4C4((byte) 6, false), "VERY_UNIMPORTANT_PREFETCH", 7);
        new C4C3(new C4C4((byte) 6, true), "VERY_UNIMPORTANT_PREFETCH_INCREMENTAL", 8);
        A02 = new C4C3(new C4C4((byte) 0, false), "STREAMING", 9);
        new C4C3(new C4C4((byte) 2, false), "WARMUP", 10);
        new C4C3(new C4C4((byte) 2, true), "WARMUP_INCREMENTAL", 11);
        new C4C3(new C4C4((byte) 0, true), "STREAMING_INCREMENTAL", 12);
    }

    public C4C3(C4C4 c4c4, String str, int i) {
        this.A00 = c4c4;
    }
}
