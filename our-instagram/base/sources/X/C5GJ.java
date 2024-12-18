package X;

/* renamed from: X.5GJ, reason: invalid class name */
/* loaded from: classes3.dex */
public enum C5GJ implements InterfaceC02530Ab {
    ASSET_PICKER(1),
    CREATE_MODE_DIAL_SELECTION(2),
    CREATE_MODE_RANDOM_SELECTION(3),
    CREATE_MODE_VIEW_ALL_SELECTION(4),
    CREATE_MODE_TAP_TO_CYCLE_SELECTION(5),
    CREATE_MODE_GIF_SEARCH(6),
    CREATE_MODE_USER_SEARCH(7),
    /* JADX INFO: Fake field, exist only in values array */
    MUSIC_PRE_CAPTURE(8),
    FEED_MEGAPHONE(9),
    STORY_ATTRIBUTION(10),
    STORY_PRECAPTURE_NUX(11),
    MAP_LOCATION_STICKER(12),
    CLIPS_COMMENTS(13),
    /* JADX INFO: Fake field, exist only in values array */
    SYSTEM_GALLERY_PICKER(14),
    /* JADX INFO: Fake field, exist only in values array */
    FEED_COMMENTS_VISUAL_REPLY(15);

    public final long A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    C5GJ(long j) {
        this.A00 = j;
    }
}
