package X;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.instagram.react.modules.base.IgNetworkingModule;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Locale;

/* renamed from: X.ShX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63323ShX {
    public static Locale A00;
    public static final C005001p A01 = new C005001p(0);

    public static String A03(Context context, String str) {
        Resources resources;
        C005001p c005001p = A01;
        synchronized (c005001p) {
            Locale locale = ((C53092bq) AbstractC61637Rr1.A00(AbstractC58319PtB.A08(context)).A00).A00.get(0);
            if (!locale.equals(A00)) {
                c005001p.clear();
                A00 = locale;
            }
            String str2 = (String) c005001p.get(str);
            if (str2 == null) {
                boolean z = GooglePlayServicesUtil.A00;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                str2 = null;
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, IgNetworkingModule.REQUEST_BODY_KEY_STRING, "com.google.android.gms");
                    if (identifier == 0) {
                        AbstractC58321PtD.A1P("Missing resource: ", str, "GoogleApiAvailability");
                    } else {
                        String string = resources.getString(identifier);
                        if (TextUtils.isEmpty(string)) {
                            AbstractC58321PtD.A1P("Got empty resource: ", str, "GoogleApiAvailability");
                        } else {
                            c005001p.put(str, string);
                            return string;
                        }
                    }
                }
            }
            return str2;
        }
    }

    public static String A00(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = C3U2.A00(context).A00;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = ((PackageItemInfo) context.getApplicationInfo()).name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String A01(Context context, int i) {
        int i2;
        String str;
        Resources resources = context.getResources();
        String A002 = A00(context);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 7) {
                            if (i != 9) {
                                if (i != 20) {
                                    switch (i) {
                                        case 16:
                                            str = "common_google_play_services_api_unavailable_text";
                                            break;
                                        case 17:
                                            str = "common_google_play_services_sign_in_failed_text";
                                            break;
                                        case 18:
                                            i2 = 2131956541;
                                            break;
                                        default:
                                            i2 = 2131956536;
                                            break;
                                    }
                                } else {
                                    str = "common_google_play_services_restricted_profile_text";
                                }
                            } else {
                                i2 = 2131956537;
                            }
                        } else {
                            str = "common_google_play_services_network_error_text";
                        }
                    } else {
                        str = "common_google_play_services_invalid_account_text";
                    }
                    Resources resources2 = context.getResources();
                    String A03 = A03(context, str);
                    if (A03 == null) {
                        A03 = resources2.getString(2131956536);
                    }
                    return String.format(resources2.getConfiguration().locale, A03, A002);
                }
                i2 = 2131956529;
            } else {
                if (DeviceProperties.A00(context)) {
                    return resources.getString(2131956542);
                }
                i2 = 2131956539;
            }
        } else {
            i2 = 2131956532;
        }
        return resources.getString(i2, A002);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    public static String A02(Context context, int i) {
        String str;
        int i2;
        String str2;
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                i2 = 2131956533;
                return resources.getString(i2);
            case 2:
                i2 = 2131956540;
                return resources.getString(i2);
            case 3:
                i2 = 2131956530;
                return resources.getString(i2);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                android.util.Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                str = "common_google_play_services_invalid_account_title";
                return A03(context, str);
            case 7:
                android.util.Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                str = "common_google_play_services_network_error_title";
                return A03(context, str);
            case 8:
                str2 = "Internal error occurred. Please see logs for detailed information";
                android.util.Log.e("GoogleApiAvailability", str2);
                return null;
            case 9:
                str2 = "Google Play services is invalid. Cannot recover.";
                android.util.Log.e("GoogleApiAvailability", str2);
                return null;
            case 10:
                str2 = "Developer error occurred. Please see logs for detailed information";
                android.util.Log.e("GoogleApiAvailability", str2);
                return null;
            case 11:
                str2 = "The application is not licensed to the user.";
                android.util.Log.e("GoogleApiAvailability", str2);
                return null;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case Process.SIGSTOP /* 19 */:
            default:
                str2 = AnonymousClass001.A0O("Unexpected error code ", i);
                android.util.Log.e("GoogleApiAvailability", str2);
                return null;
            case 16:
                str2 = "One of the API components you attempted to connect to is not available.";
                android.util.Log.e("GoogleApiAvailability", str2);
                return null;
            case 17:
                android.util.Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                str = "common_google_play_services_sign_in_failed_title";
                return A03(context, str);
            case 20:
                android.util.Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                str = "common_google_play_services_restricted_profile_title";
                return A03(context, str);
        }
    }
}
