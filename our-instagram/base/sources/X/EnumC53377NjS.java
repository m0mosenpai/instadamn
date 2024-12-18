package X;

/* renamed from: X.NjS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC53377NjS implements InterfaceC02530Ab {
    REMIX(1),
    COLLABORATION(2),
    BRANDED_CONTENT(3),
    PANAVISION(4),
    VISUAL_COMMENT(5),
    OA_UNAVAILABLE_ON_FB(6),
    NETWORK_ERROR(7),
    ADD_YOURS_STICKER(8),
    CAPTION_LENGTH(9),
    MEDIA_LENGTH(10),
    INTERNAL_STICKER(11),
    REMIX_V2(12),
    COMMUNITY_POST(13),
    POLL_STICKER(14),
    QUIZ_STICKER(15),
    EMOJI_SLIDER_STICKER(16),
    QUESTION_STICKER(17),
    AUDIENCE_CONTROL_SELECTED(18),
    COMMENT_POLL(19),
    /* JADX INFO: Fake field, exist only in values array */
    OPAL(20),
    ERROR_CONFIG_FAILURE(21),
    ERROR_INVALID_DESTINATION(22),
    ERROR_NULL_CONFIG(23),
    ERROR_NULL_STATE(24),
    SCHEDULED_CONTENT(25),
    COMMENT_POLL_MAX_OPTIONS_EXCEEDED(26);

    public final long A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    EnumC53377NjS(long j) {
        this.A00 = j;
    }
}
