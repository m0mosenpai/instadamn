package X;

import android.util.LruCache;
import com.facebook.endtoend.EndToEnd;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.13x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C217113x implements InterfaceC217213y {
    public final InterfaceC08830cm A02;
    public final InterfaceC215913l A04;
    public static final Locale A06 = Locale.US;
    public static final Locale A05 = Locale.ENGLISH;
    public static final Locale A07 = new Locale("fb", "HA");
    public final LruCache A00 = new LruCache(5);
    public final LruCache A03 = new LruCache(5);
    public final AtomicReference A01 = new AtomicReference();

    @Override // X.InterfaceC217213y
    public final Locale AcP() {
        Locale locale = (Locale) this.A02.get();
        if (EndToEnd.isRunningEndToEndTest()) {
            String A00 = EndToEnd.A00("fb.e2e.e2e_locale", false, false);
            if (A00 == null) {
                A00 = AbstractC02650Ap.A03("fb.e2e.e2e_locale");
            }
            if (A00 != null) {
                Locale locale2 = A07;
                if (!locale2.toString().equals(A00)) {
                    String[] split = A00.split("_");
                    int length = split.length;
                    if (length == 1) {
                        locale2 = new Locale(split[0]);
                    } else if (length == 2) {
                        locale2 = new Locale(split[0], split[1]);
                    }
                }
                locale = locale2;
            }
        }
        java.util.Set AXW = this.A04.AXW();
        if (!AXW.isEmpty() && !AXW.contains(locale.getLanguage())) {
            LruCache lruCache = this.A00;
            Object obj = lruCache.get(locale);
            if (obj == null) {
                obj = new Locale(locale.getLanguage(), locale.getCountry());
                lruCache.put(locale, obj);
            }
            if (!AXW.contains(obj.toString()) && !locale.toString().equals(A07.toString())) {
                return A06;
            }
            return locale;
        }
        return locale;
    }

    @Override // X.InterfaceC217213y
    public final Locale C4D(Locale locale) {
        java.util.Set AXW = this.A04.AXW();
        if (!AXW.isEmpty()) {
            LruCache lruCache = this.A00;
            Locale locale2 = (Locale) lruCache.get(locale);
            if (locale2 == null) {
                locale2 = new Locale(locale.getLanguage(), locale.getCountry());
                lruCache.put(locale, locale2);
            }
            if (!AXW.contains(locale2.toString())) {
                String language = locale.getLanguage();
                if (AXW.contains(language)) {
                    LruCache lruCache2 = this.A03;
                    Locale locale3 = (Locale) lruCache2.get(language);
                    if (locale3 == null) {
                        Locale locale4 = new Locale(language);
                        lruCache2.put(language, locale4);
                        return locale4;
                    }
                    return locale3;
                }
                return A05;
            }
            return locale2;
        }
        return locale;
    }

    public C217113x(InterfaceC215913l interfaceC215913l, InterfaceC08830cm interfaceC08830cm) {
        this.A04 = interfaceC215913l;
        this.A02 = interfaceC08830cm;
    }

    @Override // X.InterfaceC217213y
    public final Locale AcO() {
        Locale C4D = C4D(AcP());
        if ("fil".equals(C4D.getLanguage())) {
            return new Locale("tl", C4D.getCountry());
        }
        return C4D;
    }
}
