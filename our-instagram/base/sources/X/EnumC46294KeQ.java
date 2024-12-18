package X;

/* renamed from: X.KeQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC46294KeQ implements InterfaceC02530Ab {
    ONLY_OWNER("ONLY_OWNER"),
    MUTUAL_FOLLOWS("MUTUAL_FOLLOWS"),
    BESTIES("BESTIES"),
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL("INTERNAL"),
    ALLOWLIST("ALLOWLIST"),
    BLOCKLIST("BLOCKLIST");

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    EnumC46294KeQ(String str) {
        this.A00 = str;
    }
}
