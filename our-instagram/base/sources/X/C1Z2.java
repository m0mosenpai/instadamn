package X;

import android.os.Bundle;
import com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment;

/* renamed from: X.1Z2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Z2 {
    public final LimitedCommentsFragment A00(String str, boolean z, boolean z2, boolean z3) {
        Bundle bundle = new Bundle();
        bundle.putString("LimitedCommentsFragment.MEDIA_ID", str);
        bundle.putString("LimitedComments.SESSION_ID", null);
        bundle.putBoolean("LimitedCommentsFragment.IS_ORGANIC", z);
        bundle.putBoolean("LimitedCommentsFragment.IS_SPONSORED", z2);
        bundle.putBoolean("LimitedCommentsFragment.IS_LIMITED_REPLY", z3);
        LimitedCommentsFragment limitedCommentsFragment = new LimitedCommentsFragment();
        limitedCommentsFragment.setArguments(bundle);
        return limitedCommentsFragment;
    }
}
