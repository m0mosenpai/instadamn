package X;

/* renamed from: X.4T8, reason: invalid class name */
/* loaded from: classes2.dex */
public enum C4T8 implements InterfaceC02530Ab {
    UNKNOWN("unknown"),
    FETCHING("fetching"),
    NOT_FOLLOWING("not_following"),
    FOLLOWING("following"),
    REQUESTED("requested"),
    /* JADX INFO: Fake field, exist only in values array */
    REQUEST_IN_PROGRESS("request_in_progress"),
    /* JADX INFO: Fake field, exist only in values array */
    FOLLOW_IN_PROGRESS("follow_in_progress"),
    /* JADX INFO: Fake field, exist only in values array */
    UNFOLLOW_IN_PROGRESS("unfollow_in_progress");

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    C4T8(String str) {
        this.A00 = str;
    }
}
