package X;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.W4p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70117W4p {
    public static String A00(Resources resources, InterfaceC133175zj interfaceC133175zj, InterfaceC133165zi interfaceC133165zi, Integer num, String str) {
        String str2;
        float f = resources.getDisplayMetrics().density;
        C14360o3.A0B(str, 0);
        String A00 = VMH.A00(str, "_", "-");
        String obj = interfaceC133165zi.toString();
        Locale locale = Locale.US;
        String upperCase = obj.toUpperCase(locale);
        C14360o3.A0B(upperCase, 0);
        String A002 = VMH.A00(upperCase, "_", "-");
        try {
            if (1 - num.intValue() != 0) {
                str2 = "instagram";
            } else {
                str2 = "meta_brand_design_system_icons_raster";
            }
            String format = String.format(locale, "%s?set=%s&name=%s&density=%.1f&variant=%s&size=%d", "https://lookaside.facebook.com/assets/key/", str2, A00, Float.valueOf(f), A002, Integer.valueOf(interfaceC133175zj.Bxg()));
            if (!TextUtils.isEmpty(null)) {
                return AnonymousClass001.A0R(format, null);
            }
            return format;
        } catch (NullPointerException e) {
            C0K8.A07(AbstractC70117W4p.class, "caught float formatting bug with density == %s ", e, Float.valueOf(f).toString());
            throw e;
        }
    }

    public int A01(int i) {
        Iterator it = ((C65880Tvj) this).A00.iterator();
        while (it.hasNext()) {
            int A01 = ((AbstractC70117W4p) it.next()).A01(i);
            if (A01 != 0) {
                return A01;
            }
        }
        return 0;
    }

    public XC0 A02(Integer num, String str) {
        AbstractC167017dG.A1N(num, str);
        Iterator it = ((C65880Tvj) this).A00.iterator();
        while (it.hasNext()) {
            XC0 A02 = ((AbstractC70117W4p) it.next()).A02(num, str);
            if (A02 != null) {
                return A02;
            }
        }
        return null;
    }
}
