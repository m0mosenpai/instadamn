package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* loaded from: classes9.dex */
public enum Nj6 implements InterfaceC02530Ab {
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING),
    POSTS("posts"),
    REELS("reels"),
    STORIES("stories");

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    Nj6(String str) {
        this.A00 = str;
    }
}
