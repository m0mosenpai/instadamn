package X;

import androidx.fragment.app.Fragment;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3Mw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC72493Mw {
    public static final List A00(Fragment fragment) {
        List emptyList;
        if (fragment.isAdded()) {
            emptyList = fragment.getChildFragmentManager().A0U.A04();
        } else {
            emptyList = Collections.emptyList();
        }
        C14360o3.A07(emptyList);
        return emptyList;
    }
}
