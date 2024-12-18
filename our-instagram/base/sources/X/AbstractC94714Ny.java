package X;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.4Ny, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC94714Ny {
    public static final C116205Nz A01() {
        String group;
        String str;
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (!TextUtils.isEmpty(apiVersion) && apiVersion != null && !AbstractC001900j.A0T(apiVersion)) {
                Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(apiVersion);
                if (matcher.matches() && (group = matcher.group(1)) != null) {
                    int parseInt = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    if (group2 != null) {
                        int parseInt2 = Integer.parseInt(group2);
                        String group3 = matcher.group(3);
                        if (group3 != null) {
                            int parseInt3 = Integer.parseInt(group3);
                            if (matcher.group(4) != null) {
                                str = matcher.group(4);
                            } else {
                                str = "";
                            }
                            C14360o3.A09(str);
                            return new C116205Nz(parseInt, parseInt2, str, parseInt3);
                        }
                    }
                }
            }
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
        }
        return null;
    }

    public static final IBinder A00(Activity activity) {
        Window window;
        WindowManager.LayoutParams attributes;
        if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            return attributes.token;
        }
        return null;
    }

    public static final SidecarInterface A02(Context context) {
        return SidecarProvider.getSidecarImpl(context.getApplicationContext());
    }
}
