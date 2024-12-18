package X;

import android.os.Bundle;

/* loaded from: classes6.dex */
public abstract class FCU {
    public static final ENS A00(String str, String str2, String str3, boolean z) {
        AbstractC167027dH.A12(str, str2, str3);
        ENS ens = new ENS();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("CommentPollVotersListFragment.SOURCE_MODULE", str);
        A0b.putString("CommentPollVotersListFragment.MEDIA_ID", str2);
        A0b.putString("CommentPollVotersListFragment.POLL_ID", str3);
        A0b.putBoolean("CommentPollVotersListFragment.SHOULD_SHOW_EMPTY_STATE", z);
        ens.setArguments(A0b);
        return ens;
    }
}
