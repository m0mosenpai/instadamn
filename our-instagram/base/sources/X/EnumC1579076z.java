package X;

/* renamed from: X.76z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC1579076z implements InterfaceC02530Ab {
    /* JADX INFO: Fake field, exist only in values array */
    DEFAULT(0),
    CANONICAL(1),
    GROUP(2),
    SECURE_OVER_WA_CANONICAL(3),
    SECURE_OVER_WA_GROUP(4);

    public final long A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    EnumC1579076z(long j) {
        this.A00 = j;
    }
}
