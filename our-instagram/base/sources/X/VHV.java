package X;

/* loaded from: classes11.dex */
public enum VHV implements InterfaceC02530Ab {
    TEXT(0),
    /* JADX INFO: Fake field, exist only in values array */
    IMAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    XMA(2);

    public final long A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    VHV(long j) {
        this.A00 = j;
    }
}
