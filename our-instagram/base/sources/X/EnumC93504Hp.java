package X;

/* renamed from: X.4Hp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC93504Hp implements InterfaceC02530Ab {
    APP_BADGE(0),
    /* JADX INFO: Fake field, exist only in values array */
    PROFILE_BADGE(1),
    INBOX_BADGE(2);

    public final long A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    EnumC93504Hp(long j) {
        this.A00 = j;
    }
}
