package X;

/* loaded from: classes5.dex */
public enum BSV implements InterfaceC133175zj {
    SIZE_8(8),
    SIZE_12(12),
    SIZE_14(14),
    SIZE_16(16),
    SIZE_18(18),
    SIZE_20(20),
    SIZE_24(24),
    SIZE_32(32),
    SIZE_44(44),
    /* JADX INFO: Fake field, exist only in values array */
    SIZE_96(96);

    public final int A00;

    BSV(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC133175zj
    public final int Bxg() {
        return this.A00;
    }
}
