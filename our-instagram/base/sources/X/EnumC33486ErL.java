package X;

/* renamed from: X.ErL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC33486ErL implements InterfaceC02530Ab {
    /* JADX INFO: Fake field, exist only in values array */
    DEFAULT(0),
    SUGGESTED_BLOCKS(1),
    PSEUDO_BLOCK_WARNING(2),
    BLOCKED_ACCOUNTS(3),
    SECURE_OVER_WA_PSEUDO_BLOCK_WARNING(4);

    public final long A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    EnumC33486ErL(long j) {
        this.A00 = j;
    }
}
