package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;

/* renamed from: X.FfV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35178FfV {
    public static final C27391Ur A00() {
        C27391Ur c27391Ur = C27391Ur.A00;
        if (c27391Ur != null) {
            return c27391Ur;
        }
        AbstractC31171DnF.A0v();
        throw C00O.createAndThrow();
    }

    public static void A01(Activity activity, Bundle bundle, AbstractC12990ll abstractC12990ll) {
        A00().A00(activity, bundle, abstractC12990ll);
    }

    public static void A02(Activity activity, Bundle bundle, C09Y c09y) {
        A00().A00(activity, bundle, c09y.A05(activity));
    }

    public static void A03(Bundle bundle, IgFragmentActivity igFragmentActivity) {
        A00().A00(igFragmentActivity, bundle, igFragmentActivity.getSession());
    }
}
