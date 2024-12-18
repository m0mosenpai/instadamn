package X;

import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.RemoteException;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.2Jj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48202Jj extends AbstractC48222Jl {
    public static final Pattern A01 = Pattern.compile("com\\.htc\\.software\\.Sense(\\d+(?:\\.\\d+)?).*");
    public float A00;

    @Override // X.AbstractC48222Jl
    public final boolean A01(Context context, int i) {
        float f;
        C14360o3.A0B(context, 1);
        try {
            f = this.A00;
        } catch (Exception e) {
            C0w9.A06("HTCLauncherBadges", "unexpected exception", e);
        }
        if (f >= 4.0f && f < 5.0f) {
            Intent intent = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
            intent.setFlags(16);
            intent.putExtra("packagename", context.getPackageName());
            intent.putExtra("count", i);
            context.sendBroadcast(intent);
            HashSet hashSet = new HashSet();
            android.net.Uri A03 = AbstractC08820cl.A03("content://com.htc.launcher.settings/favorites");
            C14360o3.A07(A03);
            ContentProviderClient A00 = AbstractC15910ql.A00(context, A03);
            if (A00 != null) {
                Cursor cursor = null;
                try {
                    try {
                        cursor = A00.query(A03, new String[]{"_id", "intent"}, AbstractC13670mt.A06("%s LIKE ?", "intent"), new String[]{AnonymousClass001.A0E(context.getPackageName(), '%', '%')}, null);
                    } catch (RemoteException unused) {
                        A00.release();
                        if (cursor != null) {
                        }
                    }
                    if (cursor != null) {
                        int columnIndex = cursor.getColumnIndex("_id");
                        int columnIndex2 = cursor.getColumnIndex("intent");
                        cursor.moveToFirst();
                        while (!cursor.isAfterLast()) {
                            String string = cursor.getString(columnIndex2);
                            if (string != null) {
                                try {
                                    ComponentName component = Intent.parseUri(string, 0).getComponent();
                                    if (component != null && C14360o3.A0K(context.getPackageName(), component.getPackageName()) && C14360o3.A0K(AbstractC48222Jl.A00(context).getClassName(), component.getClassName())) {
                                        hashSet.add(Integer.valueOf(cursor.getInt(columnIndex)));
                                    }
                                } catch (URISyntaxException unused2) {
                                    cursor.moveToNext();
                                }
                            }
                            cursor.moveToNext();
                        }
                        A00.release();
                        cursor.close();
                    } else {
                        A00.release();
                    }
                } catch (Throwable th) {
                    A00.release();
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
                intent.setFlags(16);
                intent2.putExtra("packagename", AbstractC48222Jl.A00(context).flattenToShortString());
                intent2.putExtra("favorite_item_id", intValue);
                intent2.putExtra("selectArgs", new String[]{AbstractC13670mt.A06("%%%%s%%", AbstractC48222Jl.A00(context).flattenToShortString())});
                intent2.putExtra("count", i);
                context.sendBroadcast(intent2);
            }
            return true;
        }
        if (f > 5.0f) {
            Intent intent3 = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
            intent3.setFlags(16);
            intent3.putExtra("com.htc.launcher.extra.COMPONENT", AbstractC48222Jl.A00(context).flattenToShortString());
            intent3.putExtra("com.htc.launcher.extra.COUNT", i);
            context.sendBroadcast(intent3);
            return true;
        }
        return false;
    }

    @Override // X.AbstractC48222Jl
    public final boolean A02(Context context, String str) {
        Float A0n;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(str, 1);
        if (str.equals("com.htc.launcher")) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                FeatureInfo[] systemAvailableFeatures = packageManager.getSystemAvailableFeatures();
                C14360o3.A07(systemAvailableFeatures);
                for (FeatureInfo featureInfo : systemAvailableFeatures) {
                    String str2 = featureInfo.name;
                    if (str2 != null && str2.startsWith("com.htc.software.Sense")) {
                        Matcher matcher = A01.matcher(str2);
                        if (matcher.matches()) {
                            try {
                                String group = matcher.group(1);
                                if (group != null && (A0n = AnonymousClass010.A0n(group)) != null) {
                                    float floatValue = A0n.floatValue();
                                    if (floatValue >= 4.0f) {
                                        this.A00 = floatValue;
                                        return true;
                                    }
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return false;
    }
}
