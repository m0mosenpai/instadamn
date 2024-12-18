package X;

import android.content.Context;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.VMk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68324VMk {
    public static void A00(Context context, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str) {
        if (str != null) {
            char c = 65535;
            switch (str.hashCode()) {
                case -2137403731:
                    if (str.equals("Header")) {
                        c = 0;
                        break;
                    }
                    break;
                case -565577257:
                    if (str.equals("Image Button")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2368538:
                    if (str.equals("Link")) {
                        c = 2;
                        break;
                    }
                    break;
                case 70760763:
                    if (str.equals("Image")) {
                        c = 3;
                        break;
                    }
                    break;
                case 109450440:
                    if (str.equals("Tab Bar")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1404906583:
                    if (str.equals("Selected Button")) {
                        c = 5;
                        break;
                    }
                    break;
                case 2001146706:
                    if (str.equals("Button")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            String str2 = "android.widget.Button";
            switch (c) {
                case 0:
                    accessibilityNodeInfoCompat.mInfo.setHeading(true);
                    if (view == null) {
                        return;
                    }
                    AbstractC010103p.A0I(view, true);
                    return;
                case 1:
                case 6:
                    break;
                case 2:
                    accessibilityNodeInfoCompat.setClassName("android.widget.Button");
                    accessibilityNodeInfoCompat.setRoleDescription(context.getString(2131952041));
                    return;
                case 3:
                    accessibilityNodeInfoCompat.setClassName("android.widget.ImageView");
                    accessibilityNodeInfoCompat.removeAction(C012804r.A0f);
                    return;
                case 4:
                    str2 = "android.widget.TabWidget";
                    break;
                case 5:
                    accessibilityNodeInfoCompat.setClassName("android.widget.Button");
                    accessibilityNodeInfoCompat.mInfo.setSelected(true);
                    return;
                default:
                    return;
            }
            accessibilityNodeInfoCompat.setClassName(str2);
        }
    }
}
