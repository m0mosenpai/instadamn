package X;

/* loaded from: classes10.dex */
public enum RiV implements InterfaceC02530Ab {
    UNAUTHENTICATED("unauthenticated"),
    AUTHENTICATED_ACTIVE("authenticated_active"),
    AUTHENTICATED_EXPIRED("authenticated_expired"),
    /* JADX INFO: Fake field, exist only in values array */
    UNLINKED("unlinked"),
    /* JADX INFO: Fake field, exist only in values array */
    RECENTLY_UNLINKED("recently_unlinked");

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    RiV(String str) {
        this.A00 = str;
    }
}
