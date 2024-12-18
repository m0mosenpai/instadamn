package X;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes10.dex */
public abstract class S4E {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Integer num;
        Intent intent;
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Context context = c6fg.A00;
            if (C14360o3.A0K(MSW.A10(c6fw, 0), "notification")) {
                num = C05F.A01;
            } else {
                num = C05F.A00;
            }
            C14360o3.A0B(num, 1);
            if (num.intValue() != 0) {
                intent = AbstractC58318PtA.A0E("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            } else {
                intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", android.net.Uri.fromParts("package", context.getPackageName(), null));
            }
            C0b3.A00().A04().A0G(context, intent);
        }
        return null;
    }
}
