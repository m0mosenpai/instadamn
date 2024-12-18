package X;

import android.content.res.Resources;
import java.util.Locale;

/* loaded from: classes10.dex */
public abstract class S1L {
    public static final boolean A00(Resources resources) {
        Locale locale = resources.getConfiguration().locale;
        return AbstractC009903n.A0O(locale.getLanguage(), new String[]{new Locale("hi").getLanguage(), new Locale("th").getLanguage(), new Locale("uk").getLanguage()});
    }
}
