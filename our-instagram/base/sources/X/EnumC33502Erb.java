package X;

/* renamed from: X.Erb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC33502Erb implements InterfaceC02530Ab {
    CHAT_CONTROLS("chat_controls"),
    PEOPLE("people"),
    PRIVACY_CONTROL("privacy_control"),
    RESHARED_MEDIA("reshared_media"),
    SHARED_MEDIA("shared_media"),
    /* JADX INFO: Fake field, exist only in values array */
    SHARED_LINK("shared_link"),
    THEME("theme"),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBERSHIP_CONTROLS("membership_controls"),
    /* JADX INFO: Fake field, exist only in values array */
    IG_EVENTS("ig_events"),
    CREATE_GROUP("create_group"),
    AI_AUTO_REPLIES("ai_auto_replies"),
    NICKNAMES("nicknames");

    public final String A00;

    EnumC33502Erb(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }
}
