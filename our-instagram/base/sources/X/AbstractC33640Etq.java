package X;

import android.content.Intent;

@Deprecated
/* renamed from: X.Etq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33640Etq {
    public static Intent A00(Boolean bool, Boolean bool2, String str, String str2) {
        Intent A04 = AbstractC31171DnF.A04();
        A04.setClassName("com.facebook.appmanager", "com.facebook.oxygen.appmanager.ui.landing.StubInstallActivity");
        A04.putExtra("package_name", str);
        A04.putExtra("method_type", "internal_or_cross_install");
        if (bool2 != null) {
            A04.putExtra("update_flow", bool2.booleanValue());
        }
        if (str2 != null) {
            A04.putExtra("referrer", str2);
        }
        A04.putExtra("show_back_navigation", bool);
        return A04;
    }
}
