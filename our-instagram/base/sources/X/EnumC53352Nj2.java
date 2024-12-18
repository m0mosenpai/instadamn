package X;

/* renamed from: X.Nj2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC53352Nj2 implements InterfaceC02530Ab {
    FOLLOWERS_YOU_DONT_FOLLOW_BACK("followers_you_dont_follow_back"),
    ANYONE_YOU_DONT_FOLLOW("anyone_you_dont_follow"),
    SELECTED_USERS_ONLY("selected_users_only"),
    /* JADX INFO: Fake field, exist only in values array */
    NOBODY("nobody"),
    /* JADX INFO: Fake field, exist only in values array */
    ANYBODY("anybody");

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    EnumC53352Nj2(String str) {
        this.A00 = str;
    }
}
