package X;

import android.content.Intent;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;

/* renamed from: X.0f9, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0f9 {
    public static int A00(int i) {
        return ExternalProviders.A02.A07().A00(6, 25, i, 0L, 0);
    }

    public static int A01(int i) {
        return ExternalProviders.A02.A07().A00(6, 29, i, 0L, 0);
    }

    public static int A02(int i) {
        return ExternalProviders.A02.A07().A00(6, 33, i, 0L, 0);
    }

    public static int A03(int i) {
        return ExternalProviders.A07.A07().A00(6, 21, i, 0L, 0);
    }

    public static int A04(int i) {
        return ExternalProviders.A02.A07().A00(6, 27, i, 0L, 0);
    }

    public static int A05(int i) {
        return ExternalProviders.A02.A07().A00(6, 1, i, 0L, 0);
    }

    public static int A06(int i) {
        return ExternalProviders.A02.A07().A00(6, 35, i, 0L, 0);
    }

    public static void A07(int i, int i2) {
        ExternalProviders.A02.A07().A00(6, 26, i, 0L, i2);
    }

    public static void A08(int i, int i2) {
        ExternalProviders.A02.A07().A00(6, 24, i, 0L, i2);
    }

    public static void A09(int i, int i2) {
        ExternalProviders.A02.A07().A00(6, 34, i, 0L, i2);
    }

    public static void A0A(int i, int i2) {
        ExternalProviders.A07.A07().A00(6, 22, i, 0L, i2);
    }

    public static void A0B(int i, int i2) {
        ExternalProviders.A02.A07().A00(6, 28, i, 0L, i2);
    }

    public static void A0C(int i, int i2) {
        ExternalProviders.A02.A07().A00(6, 2, i, 0L, i2);
    }

    public static void A0D(int i, int i2) {
        ExternalProviders.A02.A07().A00(6, 36, i, 0L, i2);
    }

    public static void A0E(int i, int i2, Intent intent) {
        String action;
        ExternalProvider externalProvider = ExternalProviders.A02;
        if ((externalProvider.A01 & TraceEvents.sProviders) != 0) {
            if (intent != null && (action = intent.getAction()) != null) {
                externalProvider.A07().A01(0, 57, externalProvider.A07().A01(0, 56, externalProvider.A07().A00(6, 30, i, 0L, i2), "Intent action"), action);
            } else {
                externalProvider.A07().A00(6, 30, i, 0L, i2);
            }
        }
    }
}
