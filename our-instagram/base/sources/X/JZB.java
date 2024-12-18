package X;

/* loaded from: classes8.dex */
public enum JZB implements InterfaceC02530Ab {
    ALL_FOLLOWERS("all_followers"),
    CLOSE_FRIENDS("close_friends"),
    /* JADX INFO: Fake field, exist only in values array */
    GROUP_PROFILE("group_profile"),
    MUTUAL_FOLLOWERS("mutual_followers"),
    /* JADX INFO: Fake field, exist only in values array */
    MUTUALS_WITH_PROFILE("mutuals_with_profile");

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    JZB(String str) {
        this.A00 = str;
    }
}
