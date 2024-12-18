package X;

import android.os.Bundle;
import com.instagram.model.direct.threadkey.util.UnifiedThreadKeyParcelable;

/* renamed from: X.JZo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43826JZo {
    public static final C3o9 A00(Bundle bundle, String str) {
        UnifiedThreadKeyParcelable unifiedThreadKeyParcelable = (UnifiedThreadKeyParcelable) bundle.getParcelable(str);
        if (unifiedThreadKeyParcelable != null) {
            return unifiedThreadKeyParcelable.A00;
        }
        return null;
    }

    public static final void A01(Bundle bundle, C3o9 c3o9, String str) {
        AbstractC167017dG.A1O(bundle, c3o9);
        bundle.putParcelable(str, new UnifiedThreadKeyParcelable(c3o9));
    }
}
