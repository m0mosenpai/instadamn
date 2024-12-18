package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.0kU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12260kU {
    public static final C0b3 A00;

    static {
        C0b3 c0b3;
        Integer num = C05F.A0C;
        InterfaceC08100bW interfaceC08100bW = new C1QF("IgSecureContext").A00;
        synchronized (C0b3.class) {
            if (C0b3.A0L == null) {
                C0b3.A0L = new C0b3();
            }
            C07970bH c07970bH = C0b3.A0N;
            synchronized (c07970bH) {
                c07970bH.A00 = num;
            }
            if (interfaceC08100bW != null) {
                C0P4 c0p4 = C0b3.A0M;
                synchronized (c0p4) {
                    c0p4.A00 = interfaceC08100bW;
                }
            }
            c0b3 = C0b3.A0L;
        }
        A00 = c0b3;
    }

    public static void A00(Context context, Intent intent) {
        C41451vu.A01.E4s(new C3KK(intent));
        A00.A04().A0G(context, intent);
    }

    public static void A01(Context context, Intent intent) {
        A00.A07().A05(context, intent);
    }

    public static void A02(Context context, Intent intent, Bundle bundle) {
        C05290Qb A07 = A00.A07();
        C08020bN A072 = A07.A07(context, intent);
        C0OK c0ok = A07.A01;
        Intent A0C = c0ok.A0C(context, intent, A07.A02);
        if (A0C != null) {
            C07980bI.A03(context, A07);
            if (C0P5.A01(context, A0C)) {
                c0ok.A01.EH9("Warning: launching intent with a non-Activity Context requires FLAG_ACTIVITY_NEW_TASK, or the Android Runtime will throw a AndroidRuntimeException. Adding the flag to prevent a crash. This might lead to unexpected behavior with the back button. Please pass in an Activity Context.");
            }
            A07.A0E(context, intent, A0C, A072);
            context.startActivity(A0C, C07980bI.A02(bundle, c0ok));
        }
    }

    public static void A06(Fragment fragment, Intent intent, int i) {
        A00.A07().A0H(intent, fragment, i);
    }

    public static void A07(Fragment fragment, Intent intent, int i) {
        C41451vu.A01.E4s(new C3KK(intent));
        A00.A0A().A0H(intent, fragment, i);
    }

    public static boolean A08(Activity activity, Intent intent, int i) {
        return A00.A07().A0F(activity, intent, i);
    }

    public static boolean A09(Activity activity, Intent intent, int i) {
        C41451vu.A01.E4s(new C3KK(intent));
        return A00.A0A().A0F(activity, intent, i);
    }

    public static boolean A0A(Context context, Intent intent) {
        C41451vu.A01.E4s(new C3KK(intent));
        return A00.A03().A0G(context, intent);
    }

    public static boolean A0B(Context context, Intent intent) {
        C41451vu.A01.E4s(new C3KK(intent));
        return A00.A06().A0G(context, intent);
    }

    public static boolean A0C(Context context, Intent intent) {
        return A00.A07().A0G(context, intent);
    }

    public static boolean A0D(Context context, Intent intent) {
        C41451vu.A01.E4s(new C3KK(intent));
        return A00.A09().A0G(context, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    public static boolean A0E(Context context, Intent intent) {
        C41451vu.A01.E4s(new C3KK(intent));
        int i = 0;
        try {
            i = A00.A0A().A0G(context, intent);
            return i;
        } catch (ActivityNotFoundException e) {
            C0K8.A07(C12260kU.class, "Caught ActivityNotFoundException", e, new Object[i]);
            return i;
        }
    }

    public static boolean A0F(Context context, Intent intent) {
        C41451vu.A01.E4s(new C3KK(intent));
        try {
            return A00.A0A().A0G(context, intent);
        } catch (ActivityNotFoundException e) {
            C0K8.A07(C12260kU.class, "Caught ActivityNotFoundException", e, new Object[0]);
            throw e;
        }
    }

    public static boolean A0G(Context context, android.net.Uri uri) {
        return A0E(context, new Intent("android.intent.action.VIEW", uri));
    }

    public static boolean A0J(Intent intent, Fragment fragment, int i) {
        C41451vu.A01.E4s(new C3KK(intent));
        return A00.A06().A0H(intent, fragment, i);
    }

    public static void A03(Intent intent, Fragment fragment) {
        FragmentActivity activity;
        if (fragment.isAdded() && (activity = fragment.getActivity()) != null) {
            A00(activity, intent);
        }
    }

    public static void A04(Intent intent, Fragment fragment) {
        FragmentActivity activity;
        if (fragment.isAdded() && (activity = fragment.getActivity()) != null) {
            A0B(activity, intent);
        }
    }

    public static void A05(android.net.Uri uri, Fragment fragment) {
        FragmentActivity activity;
        if (fragment.isAdded() && (activity = fragment.getActivity()) != null) {
            A0G(activity, uri);
        }
    }

    public static boolean A0H(Intent intent, Fragment fragment) {
        FragmentActivity activity;
        if (fragment.isAdded() && (activity = fragment.getActivity()) != null) {
            return A0D(activity, intent);
        }
        return false;
    }

    public static boolean A0I(Intent intent, Fragment fragment) {
        FragmentActivity activity;
        if (fragment.isAdded() && (activity = fragment.getActivity()) != null) {
            return A0E(activity, intent);
        }
        return false;
    }
}
