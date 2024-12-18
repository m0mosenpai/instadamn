package X;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.Uri;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.93J, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C93J {
    public static final Intent A00(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(new Uri.Builder().scheme("instagram").authority("mainfeed").appendQueryParameter(AbstractC111324zv.A00(3915), "true").appendQueryParameter(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str).appendQueryParameter(AbstractC37314GcG.A01(43, 8, 86), str2).build());
        return intent;
    }

    public static final void A01(Icon icon, String str, String str2) {
        boolean z;
        ShortcutManager shortcutManager = (ShortcutManager) AbstractC12290kX.A00.getSystemService(ShortcutManager.class);
        if (shortcutManager != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<ShortcutInfo> it = shortcutManager.getPinnedShortcuts().iterator();
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                String id = it.next().getId();
                C14360o3.A07(id);
                if (id.equals(AnonymousClass001.A0S(AbstractC111324zv.A00(1390), str, '\''))) {
                    ShortcutInfo.Builder builder = new ShortcutInfo.Builder(AbstractC12290kX.A00, id);
                    if (str2 != null && str2.length() != 0) {
                        builder.setShortLabel(str2).setLongLabel(str2).setIntent(A00(str, str2));
                        z = true;
                    } else {
                        z = false;
                    }
                    if (icon != null) {
                        builder.setIcon(icon);
                    } else {
                        z2 = false;
                    }
                    if (z || z2) {
                        ShortcutInfo build = builder.build();
                        C14360o3.A07(build);
                        arrayList.add(build);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                shortcutManager.updateShortcuts(arrayList);
            }
        }
    }
}
