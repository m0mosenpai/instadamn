package X;

import android.R;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import com.facebook.nobreak.CrashLoop$LastState;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.0UZ, reason: invalid class name */
/* loaded from: classes.dex */
public class C0UZ {
    public static final String[] A00 = {"crash_log", "insta_crash_log", "crash_lock", "remedy_log", "app_was_disabled", "ACRA-INSTALLATION", "is_employee", "app_state_logs"};

    public String A04() {
        return "Default Crash Loop Remedy";
    }

    public void A05(Context context, C06100Ua c06100Ua) {
    }

    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, java.util.Comparator] */
    @Deprecated
    public final C06110Ub A01(Context context, int i, int i2) {
        String str;
        boolean z = true;
        if (C18700vx.A0E) {
            String.format("Handling crash level %d, previous %d", Integer.valueOf(i), Integer.valueOf(i2));
        }
        if (i > i2) {
            if (new File(context.getApplicationInfo().dataDir, "flags/is_employee").exists()) {
                try {
                    String A04 = A04();
                    Locale locale = Locale.US;
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                str = "disabled auto-start";
                            } else {
                                str = String.format(locale, "??? %s", Integer.valueOf(i));
                            }
                        } else {
                            str = "cleared data and logged out";
                        }
                    } else {
                        str = "cleared caches";
                    }
                    String format = String.format(locale, "[employee only] %s using class %s in process %s.", str, A04, C0JA.A00().A01);
                    Notification.Builder smallIcon = new Notification.Builder(context).setWhen(System.currentTimeMillis()).setContentTitle("[fb] crash mitigation applied").setContentText(format).setSmallIcon(R.drawable.ic_delete);
                    smallIcon.setShowWhen(true);
                    smallIcon.setStyle(new Notification.BigTextStyle().bigText(format));
                    ((NotificationManager) context.getSystemService("notification")).notify(1, smallIcon.getNotification());
                } catch (Throwable th) {
                    android.util.Log.w("CrashLoopRemedy", "non-fatal error showing notification", th);
                }
            }
            C18700vx.A01(context);
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        android.util.Log.w("CrashLoopRemedy", AnonymousClass001.A0O("unknown remedy level ", i));
                    } else {
                        File file = new File(context.getApplicationInfo().dataDir, "app_was_disabled");
                        try {
                            file.createNewFile();
                            if (file.exists()) {
                                try {
                                    PackageManager packageManager = context.getPackageManager();
                                    ComponentName componentName = new ComponentName(context, (Class<?>) CrashLoop$LastState.class);
                                    try {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.addAll(C0UX.A00(context, packageManager.getPackageInfo(context.getPackageName(), 642).receivers));
                                        arrayList.addAll(C0UX.A00(context, packageManager.getPackageInfo(context.getPackageName(), 641).activities));
                                        arrayList.addAll(C0UX.A00(context, packageManager.getPackageInfo(context.getPackageName(), 648).providers));
                                        arrayList.addAll(C0UX.A00(context, packageManager.getPackageInfo(context.getPackageName(), 644).services));
                                        Collections.sort(arrayList, new Object());
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            PackageItemInfo packageItemInfo = (PackageItemInfo) it.next();
                                            arrayList2.add(new ComponentName(packageItemInfo.packageName, packageItemInfo.name));
                                        }
                                        Iterator it2 = arrayList2.iterator();
                                        while (it2.hasNext()) {
                                            ComponentName componentName2 = (ComponentName) it2.next();
                                            componentName2.getClassName();
                                            packageManager.setComponentEnabledSetting(componentName2, 2, 1);
                                        }
                                        packageManager.setComponentEnabledSetting(componentName, 2, 1);
                                    } catch (PackageManager.NameNotFoundException e) {
                                        throw new RuntimeException(e);
                                    }
                                } catch (RuntimeException e2) {
                                    android.util.Log.e("CrashLoopRemedy", "unable to disable app entry points", e2);
                                }
                                return new C06110Ub(true, z);
                            }
                            throw new RuntimeException("could not disable crash loop: could not create signal file");
                        } catch (IOException e3) {
                            throw new RuntimeException(e3);
                        }
                    }
                } else {
                    A06(context, new String[0], null);
                }
            } else {
                File cacheDir = context.getCacheDir();
                if (cacheDir != null) {
                    A00(cacheDir, new String[0], null);
                }
            }
            z = false;
            return new C06110Ub(true, z);
        }
        return new C06110Ub(false, false);
    }

    public C06110Ub A03(Context context, Map map, int i, int i2) {
        if (C18700vx.A0E) {
            String.format("Handling INSTA crash level %d, previous %d", Integer.valueOf(i), Integer.valueOf(i2));
        }
        return A01(context, i, i2);
    }

    public static void A00(File file, String[] strArr, Pattern[] patternArr) {
        String name = file.getName();
        for (String str : strArr) {
            if (name.matches(str)) {
                return;
            }
        }
        if (patternArr != null) {
            String path = file.getPath();
            for (Pattern pattern : patternArr) {
                if (pattern.matcher(path).matches()) {
                    return;
                }
            }
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    A00(file2, strArr, patternArr);
                }
            } else {
                return;
            }
        }
        file.delete();
    }

    public C06110Ub A02(Context context, Map map, int i, int i2) {
        return A01(context, i, i2);
    }

    public final void A06(Context context, String[] strArr, Pattern[] patternArr) {
        File file = new File(context.getApplicationInfo().dataDir);
        String[] strArr2 = A00;
        int length = strArr.length;
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, length + 8);
        System.arraycopy(strArr, 0, strArr3, 8, length);
        A00(file, strArr3, patternArr);
    }
}
