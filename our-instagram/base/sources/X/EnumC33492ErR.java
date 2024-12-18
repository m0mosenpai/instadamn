package X;

/* renamed from: X.ErR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC33492ErR implements InterfaceC02530Ab {
    DEFAULT(0),
    BLOCKED_ACCOUNTS(1),
    INBOX_THREAD_LIST(2),
    INBOX_NEW_MESSAGE(3),
    SEARCH(4),
    PROFILE(5);

    public final long A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    EnumC33492ErR(long j) {
        this.A00 = j;
    }
}
