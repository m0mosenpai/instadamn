package X;

/* renamed from: X.Era, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC33501Era implements InterfaceC02530Ab {
    PAPER_AIRPLANE_SEND(1),
    KEYBOARD_SEND(2),
    META_AI_RING(3),
    /* JADX INFO: Fake field, exist only in values array */
    CONTACT_INVITE(4),
    CLEAR_SEARCH(5),
    /* JADX INFO: Fake field, exist only in values array */
    THREE_DOT_MENU(6),
    /* JADX INFO: Fake field, exist only in values array */
    COPY(7),
    /* JADX INFO: Fake field, exist only in values array */
    META_AI_VOICE(8),
    /* JADX INFO: Fake field, exist only in values array */
    FORWARD(9),
    THUMB_UP(10),
    THUMB_DOWN(11),
    SEARCH(12),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(13),
    SEE_MORE_WITH_SNIPPET(14);

    public final long A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    EnumC33501Era(long j) {
        this.A00 = j;
    }
}
