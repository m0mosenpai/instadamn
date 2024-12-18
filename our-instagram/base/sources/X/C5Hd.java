package X;

/* renamed from: X.5Hd, reason: invalid class name */
/* loaded from: classes3.dex */
public enum C5Hd {
    USER_SINGLE_MEDIA(1),
    ENTITY_MULTI_MEDIA(2),
    USER_FOLLOW(3),
    USER_SIMPLE(4),
    FOLLOW_REQUEST(5),
    GROUPED_FRIEND_REQUEST(6),
    DIRECT_SHARE(9),
    COPYRIGHT_VIDEO_REMOVED(10),
    COPYRIGHT_VIDEO_REINSTATED(11),
    CAMPAIGN_MESSAGE(13),
    USER_COMMENT_LIKED_SINGLE_MEDIA(14),
    INSIGHTS_ENTRY(15),
    CANVAS_PREVIEW(16),
    USER_REEL(17),
    BUNDLE_WITH_ICON(18),
    ICON_WITH_INLINE_BUTTON(19),
    /* JADX INFO: Fake field, exist only in values array */
    USER_OPTIONAL_SINGLE_MEDIA_WITH_AVATAR(20);

    public static final C005101q A01 = new C005101q();
    public int A00;

    static {
        for (C5Hd c5Hd : values()) {
            A01.A07(c5Hd.A00, c5Hd);
        }
    }

    C5Hd(int i) {
        this.A00 = i;
    }
}
