package X;

import com.instagram.api.schemas.ProfileTheme;
import com.instagram.api.schemas.ProfileThemeType;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class Hs7 {
    public static Map A00(ProfileTheme profileTheme) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (profileTheme.AbT() != null) {
            A1I.put("alternative_background_url", profileTheme.AbT());
        }
        if (profileTheme.AbU() != null) {
            A1I.put("alternative_thumbnail_url", profileTheme.AbU());
        }
        if (profileTheme.Af8() != null) {
            A1I.put("background_url", profileTheme.Af8());
        }
        if (profileTheme.BAF() != null) {
            A1I.put("gradient_colors", profileTheme.BAF());
        }
        if (profileTheme.C71() != null) {
            A1I.put("theme_id", profileTheme.C71());
        }
        if (profileTheme.C74() != null) {
            ProfileThemeType C74 = profileTheme.C74();
            C14360o3.A0B(C74, 0);
            A1I.put("theme_type", C74.A00);
        }
        if (profileTheme.C8B() != null) {
            A1I.put("thumbnail_url", profileTheme.C8B());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
