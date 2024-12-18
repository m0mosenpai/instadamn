package X;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes10.dex */
public class SOC {
    public int A02 = Integer.MAX_VALUE;
    public int A01 = Integer.MAX_VALUE;
    public ImmutableList A07 = ImmutableList.of();
    public ImmutableList A04 = ImmutableList.of();
    public ImmutableList A05 = ImmutableList.of();
    public SNB A03 = SNB.A00;
    public ImmutableList A06 = ImmutableList.of();
    public int A00 = 0;
    public HashMap A08 = AbstractC166987dD.A1G();
    public HashSet A09 = AbstractC166987dD.A1H();

    public SOC A01(Context context, boolean z) {
        Display defaultDisplay;
        Point point;
        String str;
        String[] split;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null || (defaultDisplay = displayManager.getDisplay(0)) == null) {
            Object systemService = context.getSystemService("window");
            systemService.getClass();
            defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        }
        if (defaultDisplay.getDisplayId() == 0 && Util.A0D(context)) {
            try {
                Class<?> cls = Class.forName(AbstractC111324zv.A00(1914));
                str = (String) cls.getMethod("get", String.class).invoke(cls, "vendor.display-size");
            } catch (Exception e) {
                AbstractC63374Sil.A05("Util", AnonymousClass001.A0R("Failed to read system property ", "vendor.display-size"), e);
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    split = str.trim().split("x", -1);
                } catch (NumberFormatException unused) {
                }
                if (split.length == 2) {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt > 0 && parseInt2 > 0) {
                        point = new Point(parseInt, parseInt2);
                        int i = point.x;
                        int i2 = point.y;
                        this.A02 = i;
                        this.A01 = i2;
                        return this;
                    }
                }
                AbstractC63374Sil.A03("Util", AnonymousClass001.A0R("Invalid display size: ", str));
            }
            if ("Sony".equals(Util.A04) && Util.A05.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                int i3 = point.x;
                int i22 = point.y;
                this.A02 = i3;
                this.A01 = i22;
                return this;
            }
        }
        point = new Point();
        Display.Mode mode = defaultDisplay.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        int i32 = point.x;
        int i222 = point.y;
        this.A02 = i32;
        this.A01 = i222;
        return this;
    }

    public SOC A00(Context context) {
        CaptioningManager captioningManager = (CaptioningManager) context.getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            this.A00 = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.A06 = ImmutableList.of((Object) locale.toLanguageTag());
            }
        }
        return this;
    }

    @Deprecated
    public SOC() {
    }
}
