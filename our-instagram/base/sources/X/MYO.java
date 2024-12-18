package X;

/* loaded from: classes9.dex */
public enum MYO implements InterfaceC02530Ab {
    CAPTURE(1),
    GALLERY(2),
    FEED_RESHARE(3),
    /* JADX INFO: Fake field, exist only in values array */
    MENTION_RESHARE(4),
    /* JADX INFO: Fake field, exist only in values array */
    PLATFORM(5),
    /* JADX INFO: Fake field, exist only in values array */
    PRODUCT_RESHARE(8),
    /* JADX INFO: Fake field, exist only in values array */
    FUNDRAISER_RESHARE(9),
    /* JADX INFO: Fake field, exist only in values array */
    PRODUCT_COLLECTION_RESHARE(10),
    /* JADX INFO: Fake field, exist only in values array */
    STOREFRONT_RESHARE(11),
    /* JADX INFO: Fake field, exist only in values array */
    STORY_REMIX_REPLY_RESHARE(12),
    /* JADX INFO: Fake field, exist only in values array */
    GIF_LIBRARY(13),
    OTHER(-1);

    public final long A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    MYO(long j) {
        this.A00 = j;
    }
}
