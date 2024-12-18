package X;

/* renamed from: X.ErP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC33490ErP implements InterfaceC02530Ab {
    FEED(1),
    STORY(2),
    REEL(3),
    DIRECT_THREAD(4),
    UNKNOWN(5);

    public final long A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    EnumC33490ErP(long j) {
        this.A00 = j;
    }
}
