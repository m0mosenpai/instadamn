package X;

/* renamed from: X.9tK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC223279tK implements InterfaceC02530Ab {
    /* JADX INFO: Fake field, exist only in values array */
    ACTIVE_ACCOUNT(1),
    /* JADX INFO: Fake field, exist only in values array */
    ADMINED_ACCOUNT(2),
    /* JADX INFO: Fake field, exist only in values array */
    INACTIVE_LOGGED_IN_ACCOUNT(3),
    /* JADX INFO: Fake field, exist only in values array */
    SAVED_ACCOUNT(4),
    /* JADX INFO: Fake field, exist only in values array */
    TWO_FACTOR_ACCOUNT(5);

    public final long A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    EnumC223279tK(long j) {
        this.A00 = j;
    }
}
