package X;

/* renamed from: X.ErU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC33495ErU implements InterfaceC02530Ab {
    NO_RESULTS(1),
    NO_INTERNET(2),
    GENERAL_ERROR(3),
    REFUSAL_WITH_SNIPPET(4),
    ERROR_WITH_SNIPPET(5),
    NEEDS_MORE_INFO_WITH_SNIPPET(6);

    public final long A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    EnumC33495ErU(long j) {
        this.A00 = j;
    }
}
