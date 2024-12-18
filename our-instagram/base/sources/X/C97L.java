package X;

import android.content.Context;
import android.content.pm.PackageManager;
import com.instagram.common.session.UserSession;

/* renamed from: X.97L, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C97L {
    public final C18920wW A00;
    public final UserSession A01;

    public C97L(C18920wW c18920wW, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = c18920wW;
    }

    public final void A00(String str) {
        String str2;
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_dogfood_updater");
        if (A00.isSampled()) {
            Context A06 = this.A01.deviceSession.A06();
            A00.AAP("event_name", str);
            PackageManager packageManager = A06.getPackageManager();
            String packageName = A06.getPackageName();
            android.net.Uri uri = AbstractC14490oL.A01;
            try {
                str2 = packageManager.getInstallerPackageName(packageName);
                if (str2 == null) {
                    str2 = "";
                }
            } catch (IllegalArgumentException unused) {
                str2 = "unknown";
            }
            A00.AAP("installer_name", str2);
            A00.Cht();
        }
    }
}
