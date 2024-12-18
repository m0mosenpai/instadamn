package X;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.net.Uri;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Qn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC49772Qn {
    public static boolean A00;
    public static boolean A01;

    public static final Intent A00(C48a c48a, String str) {
        Intent intent = c48a.A01;
        android.net.Uri data = intent.getData();
        if (data != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            Uri.Builder buildUpon = data.buildUpon();
            if (str != null && str.length() != 0) {
                buildUpon.appendQueryParameter(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
            } else {
                buildUpon.appendQueryParameter("open_account_switcher", "true");
            }
            Intent data2 = intent2.setData(buildUpon.build());
            C14360o3.A07(data2);
            return data2;
        }
        return intent;
    }

    public static final void A01(ShortcutManager shortcutManager) {
        if (shortcutManager != null) {
            try {
                List<ShortcutInfo> pinnedShortcuts = shortcutManager.getPinnedShortcuts();
                C14360o3.A07(pinnedShortcuts);
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(pinnedShortcuts, 10));
                Iterator<ShortcutInfo> it = pinnedShortcuts.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getId());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (C14360o3.A0K((String) obj, "map")) {
                        arrayList2.add(obj);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    shortcutManager.disableShortcuts(arrayList2);
                }
            } catch (Exception e) {
                C0w9.A03("ShortcutUtil", AnonymousClass001.A0R("disableMapsPinnedShortcut throw exception: ", e.getMessage()));
            }
        }
    }
}
