package X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.List;

/* renamed from: X.2KO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2KO extends AbstractC48222Jl {
    public static final List A00 = AbstractC16960so.A1Q("com.sonyericsson.home", "com.sonymobile.home", "com.sonymobile.launcher");

    @Override // X.AbstractC48222Jl
    public final boolean A01(Context context, int i) {
        C14360o3.A0B(context, 1);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && packageManager.resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null) {
                ContentResolver contentResolver = context.getContentResolver();
                android.net.Uri A03 = AbstractC08820cl.A03("content://com.sonymobile.home.resourceprovider/badge");
                ContentValues contentValues = new ContentValues();
                contentValues.put("badge_count", Integer.valueOf(i));
                contentValues.put("package_name", context.getPackageName());
                contentValues.put("activity_name", AbstractC48222Jl.A00(context).getClassName());
                if (contentResolver.insert(A03, contentValues) == null) {
                    return false;
                }
            } else {
                Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
                intent.setFlags(16);
                intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", AbstractC48222Jl.A00(context).getClassName());
                boolean z = false;
                if (i != 0) {
                    z = true;
                }
                intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", z);
                intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
                intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", context.getPackageName());
                context.sendBroadcast(intent);
            }
            return true;
        } catch (Exception e) {
            C0w9.A06("SonyLauncherBadges", "unexpected exception", e);
            return false;
        }
    }

    @Override // X.AbstractC48222Jl
    public final boolean A02(Context context, String str) {
        C14360o3.A0B(str, 1);
        return A00.contains(str);
    }
}
