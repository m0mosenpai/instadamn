package X;

/* renamed from: X.15x, reason: invalid class name */
/* loaded from: classes.dex */
public enum C15x implements InterfaceC222215y {
    INTERN_FIELD_NAMES,
    CANONICALIZE_FIELD_NAMES,
    FAIL_ON_SYMBOL_HASH_OVERFLOW,
    USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING;

    public final boolean A00 = true;

    C15x() {
    }

    @Override // X.InterfaceC222215y
    public final boolean ARw() {
        return this.A00;
    }

    public final boolean A00(int i) {
        if ((i & (1 << ordinal())) == 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC222215y
    public final int BPk() {
        return 1 << ordinal();
    }
}
