package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.PwM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58494PwM {
    public static volatile AbstractC61577Rq1 A00;
    public static volatile List A01;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.Rq1, java.lang.Object] */
    public static AbstractC61577Rq1 A00(Context context) {
        if (A00 == null) {
            try {
                A00 = (AbstractC61577Rq1) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, C58494PwM.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (A00 == null) {
                A00 = new Object();
            }
        }
        return A00;
    }

    public static ArrayList A01(Context context) {
        List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
        ArrayList A0q = AbstractC25230BEn.A0q(dynamicShortcuts);
        Iterator<ShortcutInfo> it = dynamicShortcuts.iterator();
        while (it.hasNext()) {
            A0q.add(new C72081XMz(context, it.next()).A00());
        }
        return A0q;
    }

    public static List A02(Context context) {
        Bundle bundle;
        String string;
        if (A01 == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = ((PackageItemInfo) activityInfo).metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        Class.forName(string, false, C58494PwM.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
                        arrayList.add(null);
                    } catch (Exception unused) {
                    }
                }
            }
            if (A01 == null) {
                A01 = arrayList;
            }
        }
        return A01;
    }

    public static void A05(Context context, List list) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 32) {
            ArrayList A1F = AbstractC166987dD.A1F(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C72080XMy c72080XMy = (C72080XMy) it.next();
                if ((c72080XMy.A01 & 1) != 0) {
                    A1F.remove(c72080XMy);
                }
            }
            list = A1F;
            if (i <= 29) {
                Iterator it2 = AbstractC166987dD.A1F(A1F).iterator();
                while (it2.hasNext()) {
                    C72080XMy c72080XMy2 = (C72080XMy) it2.next();
                    if (!A06(context, c72080XMy2)) {
                        A1F.remove(c72080XMy2);
                    }
                }
            }
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            A1E.add(((C72080XMy) it3.next()).A01());
        }
        if (((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(A1E)) {
            A00(context).A00(list);
            Iterator it4 = A02(context).iterator();
            if (it4.hasNext()) {
                it4.next();
                throw AbstractC166987dD.A15("onShortcutAdded");
            }
        }
    }

    public static boolean A06(Context context, C72080XMy c72080XMy) {
        Bitmap decodeStream;
        IconCompat A02;
        IconCompat iconCompat = c72080XMy.A09;
        if (iconCompat != null) {
            int i = iconCompat.A02;
            if (i != 6 && i != 4) {
                return true;
            }
            InputStream A07 = iconCompat.A07(context);
            if (A07 != null && (decodeStream = BitmapFactory.decodeStream(A07)) != null) {
                if (i == 6) {
                    A02 = new IconCompat(5);
                    A02.A06 = decodeStream;
                } else {
                    A02 = IconCompat.A02(decodeStream);
                }
                c72080XMy.A09 = A02;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, X.56I] */
    public static void A03(Context context, C72080XMy c72080XMy) {
        List<C72080XMy> A1E;
        c72080XMy.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i <= 32 && (c72080XMy.A01 & 1) != 0) {
            Iterator it = A02(context).iterator();
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("onShortcutAdded");
            }
            return;
        }
        int maxShortcutCountPerActivity = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        if (maxShortcutCountPerActivity != 0) {
            if (i <= 29) {
                A06(context, c72080XMy);
            }
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (i >= 30) {
                shortcutManager.pushDynamicShortcut(c72080XMy.A01());
            } else if (!shortcutManager.isRateLimitingActive()) {
                List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
                if (dynamicShortcuts.size() >= maxShortcutCountPerActivity) {
                    int i2 = -1;
                    String str = null;
                    for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                        if (shortcutInfo.getRank() > i2) {
                            str = shortcutInfo.getId();
                            i2 = shortcutInfo.getRank();
                        }
                    }
                    shortcutManager.removeDynamicShortcuts(Arrays.asList(str));
                }
                shortcutManager.addDynamicShortcuts(Arrays.asList(c72080XMy.A01()));
            } else {
                return;
            }
            AbstractC61577Rq1 A002 = A00(context);
            try {
                boolean z = A002 instanceof ShortcutInfoCompatSaverImpl;
                if (z) {
                    ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) A002;
                    A1E = (List) shortcutInfoCompatSaverImpl.A05.submit(new CallableC58499PwS(shortcutInfoCompatSaverImpl, 0)).get();
                } else {
                    A1E = AbstractC166987dD.A1E();
                }
                if (A1E.size() >= maxShortcutCountPerActivity) {
                    int i3 = -1;
                    String str2 = null;
                    for (C72080XMy c72080XMy2 : A1E) {
                        int i4 = c72080XMy2.A02;
                        if (i4 > i3) {
                            str2 = c72080XMy2.A0D;
                            i3 = i4;
                        }
                    }
                    List asList = Arrays.asList(str2);
                    if (z) {
                        ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) A002;
                        ArrayList A1F = AbstractC166987dD.A1F(asList);
                        shortcutInfoCompatSaverImpl2.A05.submit(new RunnableC58498PwR(new Object(), shortcutInfoCompatSaverImpl2, A1F));
                    }
                }
                A002.A00(Arrays.asList(c72080XMy));
                Iterator it2 = A02(context).iterator();
                if (it2.hasNext()) {
                    it2.next();
                    throw AbstractC166987dD.A15("onShortcutAdded");
                }
            } catch (Exception unused) {
                Iterator it3 = A02(context).iterator();
                if (it3.hasNext()) {
                    it3.next();
                    throw AbstractC166987dD.A15("onShortcutAdded");
                }
            } catch (Throwable th) {
                Iterator it4 = A02(context).iterator();
                if (it4.hasNext()) {
                    it4.next();
                    throw AbstractC166987dD.A15("onShortcutAdded");
                }
                A04(context, c72080XMy.A0D);
                throw th;
            }
            A04(context, c72080XMy.A0D);
        }
    }

    public static void A04(Context context, String str) {
        str.getClass();
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        Iterator it = A02(context).iterator();
        if (it.hasNext()) {
            it.next();
            throw AbstractC166987dD.A15("onShortcutUsageReported");
        }
    }
}
