package X;

import android.content.Intent;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import org.json.JSONException;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.SjT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63398SjT {
    public static final int A00 = Runtime.getRuntime().availableProcessors();

    public static int A02(Bundle bundle, String str) {
        String concat;
        if (bundle == null) {
            concat = "Unexpected null bundle received!";
        } else {
            Object obj = bundle.get("RESPONSE_CODE");
            if (obj == null) {
                A09(str, "getResponseCodeFromBundle() got null response code, assuming OK");
                return 0;
            }
            if (obj instanceof Integer) {
                return AbstractC166987dD.A0H(obj);
            }
            concat = "Unexpected type for bundle response code: ".concat(String.valueOf(MSY.A0h(obj)));
        }
        A0A(str, concat);
        return 6;
    }

    public static Purchase A05(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return new Purchase(str, str2);
            } catch (JSONException e) {
                A0A("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
                return null;
            }
        }
        A09("BillingHelper", "Received a null purchase data.");
        return null;
    }

    public static void A09(String str, String str2) {
        if (android.util.Log.isLoggable(str, 2) && !str2.isEmpty()) {
            int i = 40000;
            while (!str2.isEmpty() && i > 0) {
                int min = Math.min(str2.length(), Math.min(CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS, i));
                str2.substring(0, min);
                str2 = str2.substring(min);
                i -= min;
            }
        }
    }

    public static void A0B(String str, String str2, Throwable th) {
        if (android.util.Log.isLoggable(str, 5)) {
            android.util.Log.w(str, str2, th);
        }
    }

    public static int A00(Intent intent) {
        if (intent == null) {
            A0A("ProxyBillingActivity", "Got null intent!");
            return 0;
        }
        return A01(intent.getExtras());
    }

    public static int A01(Bundle bundle) {
        if (bundle == null) {
            A0A("ProxyBillingActivity", "Unexpected null bundle received!");
            return 0;
        }
        return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SYG A04(Intent intent, String str) {
        int A02;
        String A07;
        SYG syg;
        if (intent == null) {
            A0A("BillingHelper", "Got null intent!");
            A07 = "An internal error occurred.";
            A02 = 6;
            syg = new Object();
        } else {
            A02 = A02(intent.getExtras(), str);
            A07 = A07(intent.getExtras(), str);
            syg = new Object();
        }
        syg.A00 = A02;
        syg.A01 = A07;
        return syg;
    }

    public static String A07(Bundle bundle, String str) {
        String concat;
        if (bundle == null) {
            concat = "Unexpected null bundle received!";
        } else {
            Object obj = bundle.get("DEBUG_MESSAGE");
            if (obj == null) {
                A09(str, "getDebugMessageFromBundle() got null response code, assuming OK");
                return "";
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            concat = "Unexpected type for debug message: ".concat(String.valueOf(MSY.A0h(obj)));
        }
        A0A(str, concat);
        return "";
    }

    public static ArrayList A08(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList A1E = AbstractC166987dD.A1E();
        if (stringArrayList != null && stringArrayList2 != null) {
            A09("BillingHelper", AnonymousClass001.A0c("Found purchase list of ", AbstractC111324zv.A00(559), stringArrayList.size()));
            for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
                Purchase A05 = A05(stringArrayList.get(i), stringArrayList2.get(i));
                if (A05 != null) {
                    A1E.add(A05);
                }
            }
        } else {
            Purchase A052 = A05(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (A052 == null) {
                A09("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            A1E.add(A052);
        }
        return A1E;
    }

    public static Bundle A03(String str, boolean z) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("playBillingLibraryVersion", str);
        if (z) {
            A0b.putBoolean("enablePendingPurchases", true);
        }
        return A0b;
    }

    public static String A06(int i) {
        return Rg1.A00(i).toString();
    }

    public static void A0A(String str, String str2) {
        AbstractC58320PtC.A1M(str, str2);
    }
}
