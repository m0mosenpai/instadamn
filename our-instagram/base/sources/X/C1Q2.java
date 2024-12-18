package X;

import android.content.res.Resources;
import java.util.Locale;

/* renamed from: X.1Q2, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1Q2 {
    public static final Locale A00 = new Locale("fb", "HA");

    public static final String A01() {
        return AbstractC19730y1.A00(AbstractC12960li.A00).A00.getString("fb_language_locale", null);
    }

    public static final Locale A02() {
        C11X c11x = C11X.A00;
        C18C.A07(c11x, "Must call setInstance() first");
        Locale locale = ((AbstractC215613i) c11x.A01()).A00.getConfiguration().locale;
        C14360o3.A07(locale);
        return locale;
    }

    public static final String A00() {
        String A01 = AbstractC27081Th.A01(A02());
        C14360o3.A07(A01);
        return A01;
    }

    public static final Locale A03() {
        Locale locale = Resources.getSystem().getConfiguration().locale;
        C14360o3.A06(locale);
        return locale;
    }

    public static final void A04() {
        Locale locale;
        String A01 = A01();
        synchronized (C1FO.class) {
            C1FO.A00 = null;
        }
        if (A01 != null && A01.length() != 0) {
            AbstractC15660qM.A00 = A01;
            if (AbstractC001900j.A0a(A01, "-", false)) {
                String substring = A01.substring(0, 2);
                C14360o3.A07(substring);
                String substring2 = A01.substring(3);
                C14360o3.A07(substring2);
                locale = new Locale(substring, substring2);
            } else {
                locale = new Locale(A01);
            }
            C11X c11x = C11X.A00;
            C18C.A07(c11x, "Must call setInstance() first");
            c11x.A01().A02(locale);
            return;
        }
        C11X c11x2 = C11X.A00;
        C18C.A07(c11x2, "Must call setInstance() first");
        c11x2.A01().A02(A03());
        AbstractC15660qM.A00 = null;
    }
}
