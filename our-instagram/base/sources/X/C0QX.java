package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;

/* renamed from: X.0QX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0QX extends AbstractC07790av {
    @Override // X.C0OK
    public final boolean A0G() {
        return false;
    }

    @Override // X.C0OK
    public final Integer A0E() {
        return C05F.A0j;
    }

    @Override // X.AbstractC07790av
    public final boolean A0I(Context context, ComponentInfo componentInfo) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        ApplicationInfo applicationInfo2 = componentInfo.applicationInfo;
        if (applicationInfo != null && applicationInfo2 != null) {
            try {
                return !AbstractC08450c9.A03(context, applicationInfo.uid, applicationInfo2.uid);
            } catch (SecurityException e) {
                this.A01.EHA("ExternalIntentScope", AnonymousClass001.A0R("Unexpected exception in verifying signature for: ", ((PackageItemInfo) componentInfo).packageName), e);
                return !A0A();
            }
        }
        InterfaceC08100bW interfaceC08100bW = this.A01;
        StringBuilder sb = new StringBuilder();
        sb.append("Null app info, current app: ");
        sb.append(applicationInfo);
        sb.append(", target app: ");
        sb.append(applicationInfo2);
        interfaceC08100bW.EHA("ExternalIntentScope", sb.toString(), null);
        return false;
    }
}
