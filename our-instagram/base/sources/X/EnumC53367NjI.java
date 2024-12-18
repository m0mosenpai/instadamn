package X;

/* renamed from: X.NjI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC53367NjI implements InterfaceC02530Ab {
    UNKNOWN(0),
    NORMAL(1),
    /* JADX INFO: Fake field, exist only in values array */
    LIGHT(2),
    MODERATE(3),
    SEVERE(4),
    CRITICAL(5),
    /* JADX INFO: Fake field, exist only in values array */
    SHUTDOWN(6);

    public final long A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    EnumC53367NjI(long j) {
        this.A00 = j;
    }
}
