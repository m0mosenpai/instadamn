package X;

/* loaded from: classes5.dex */
public enum C8U implements InterfaceC02530Ab {
    EXISTING(0),
    NEW(1);

    public final long A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    C8U(long j) {
        this.A00 = j;
    }
}
