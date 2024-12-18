package X;

/* renamed from: X.NjD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC53362NjD implements InterfaceC02530Ab {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    IMPRESSION(1),
    CLICK(2),
    LONG_CLICK(3),
    /* JADX INFO: Fake field, exist only in values array */
    SWIPE(4),
    /* JADX INFO: Fake field, exist only in values array */
    SCROLL(5),
    /* JADX INFO: Fake field, exist only in values array */
    REACTION_PLUS(6),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE_CLICK(7),
    LOCK(8),
    RAISE_DEVICE(9);

    public final long A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    EnumC53362NjD(long j) {
        this.A00 = j;
    }
}
