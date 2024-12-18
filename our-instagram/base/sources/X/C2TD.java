package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.SystemClock;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2TD, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2TD {
    public static long A00;
    public static BroadcastReceiver A01;
    public static Context A02;
    public static String A03;
    public static String A04;
    public static boolean A05;
    public static boolean A06;
    public static final C2TC A07;
    public static final C2TC A0A;
    public static volatile C2TC A0B;
    public static volatile String A0C;
    public static final Semaphore A09 = new Semaphore(1);
    public static final List A08 = new LinkedList();
    public static volatile String A0D = "https://graph.facebook.com/v2.2/maps_configs?fields=base_url,static_base_url,osm_config,url_override_config&pretty=0&access_token=";

    static {
        C2TC c2tc = new C2TC("https://www.facebook.com/maps/tile/?", "https://www.facebook.com/maps/static/?", null, null, null, Integer.MAX_VALUE);
        A0A = c2tc;
        A07 = new C2TC("https://maps.instagram.com/maps/tile/?", "https://maps.instagram.com/maps/static/?", null, null, null, Integer.MAX_VALUE);
        A0B = c2tc;
        A00();
    }

    public static void A01(boolean z) {
        if (!A06 && A0C != null && A02 != null) {
            Semaphore semaphore = A09;
            if (semaphore.availablePermits() > 0) {
                long j = A00;
                if (j == 0 || SystemClock.uptimeMillis() - j >= 3600000) {
                    A05 = z;
                    C70184WFm.A02(new C66532ULm(A02), "MapConfigUpdateDispatchable");
                    return;
                }
                return;
            }
            if (!z) {
                return;
            }
            try {
                if (!semaphore.tryAcquire(10L, TimeUnit.SECONDS)) {
                    return;
                }
                semaphore.release();
            } catch (InterruptedException e) {
                C42961yO.A09.A04(e);
            }
        }
    }

    public static void A00() {
        String str;
        String str2;
        String language = Locale.getDefault().getLanguage();
        if (language.length() == 2) {
            String country = Locale.getDefault().getCountry();
            if (country.length() == 2) {
                str2 = AnonymousClass001.A0R("_", country);
            } else {
                str2 = "";
            }
            str = AnonymousClass001.A0R(language, str2);
        } else {
            str = "en";
        }
        A03 = str;
        A04 = str.toLowerCase(Locale.US);
        try {
            Locale.getDefault().getISO3Language();
        } catch (MissingResourceException unused) {
        }
    }
}
