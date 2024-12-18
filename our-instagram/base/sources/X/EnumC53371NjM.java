package X;

/* renamed from: X.NjM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC53371NjM implements InterfaceC02530Ab {
    STORY(1),
    CLOSE_FRIENDS(2),
    DIRECT(3),
    BLAST_LIST(4),
    FACEBOOK(5),
    FRIENDS_LIST(6),
    FEED(7),
    /* JADX INFO: Fake field, exist only in values array */
    GROUP_STORY(8),
    CLIPS(10),
    /* JADX INFO: Fake field, exist only in values array */
    SUBSCRIBERS(11),
    /* JADX INFO: Fake field, exist only in values array */
    SHARE_TO_FRIENDS_STORY(12),
    THREADS(13),
    /* JADX INFO: Fake field, exist only in values array */
    CLIPS_SPIN(14);

    public final long A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    EnumC53371NjM(long j) {
        this.A00 = j;
    }
}
