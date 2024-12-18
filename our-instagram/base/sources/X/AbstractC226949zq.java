package X;

import android.content.res.Resources;
import android.view.View;

/* renamed from: X.9zq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226949zq {
    public static final void A00(View view, boolean z) {
        Resources resources = view.getResources();
        int i = 2131956162;
        if (z) {
            i = 2131956163;
        }
        String string = resources.getString(i);
        C14360o3.A0A(string);
        int i2 = 2131956160;
        if (z) {
            i2 = 2131956161;
        }
        String string2 = resources.getString(i2);
        C14360o3.A0A(string2);
        view.setContentDescription(string);
        AbstractC56932jR.A01(view);
        AbstractC56932jR.A08(view, string2);
    }
}
