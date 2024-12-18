package X;

/* renamed from: X.249, reason: invalid class name */
/* loaded from: classes.dex */
public enum AnonymousClass249 implements InterfaceC02530Ab {
    PHOTO(1),
    VIDEO(2),
    OTHER(3),
    ALBUM(8),
    NONE(0);

    public final long A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    AnonymousClass249(long j) {
        this.A00 = j;
    }
}
