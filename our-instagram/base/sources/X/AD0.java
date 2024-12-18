package X;

import android.app.LocaleManager;
import android.os.LocaleList;

/* loaded from: classes4.dex */
public abstract class AD0 {
    public static LocaleList A00(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void A01(LocaleList localeList, Object obj) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
