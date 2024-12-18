package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;

/* renamed from: X.QEz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58889QEz extends AbstractC63955Swf {
    public static final C0NO A01 = new Object();
    public static final ArrayList A00 = AbstractC58319PtB.A12(new String[]{"com.android.vending", "com.google.android.gms", "com.google.market"});

    public static boolean A00(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        for (String str3 : str.replace(" ", "").split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)) {
            if (str3.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A01(String str, String str2, String str3, String str4, boolean z) {
        C0NO c0no;
        android.net.Uri A002;
        android.net.Uri A003;
        if (!z) {
            if (!str.startsWith("https://play.google.com/store/apps/details?id=") || (A002 = AbstractC08820cl.A00((c0no = A01), str)) == null || (A003 = AbstractC08820cl.A00(c0no, AnonymousClass001.A0R("https://play.google.com/store/apps/details?", A002.getQueryParameter("referrer")))) == null) {
                return false;
            }
            String queryParameter = A003.getQueryParameter("ads_account");
            if (!A00(str2, A003.getQueryParameter("ads_set")) && !A00(str3, queryParameter)) {
                return C2I7.A00(A002.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID), str4);
            }
        }
        return true;
    }

    @Override // X.InterfaceC65539TmB
    public final boolean F8o(Context context, Bundle bundle) {
        String string = bundle.getString("package_name");
        if (string == null) {
            return false;
        }
        return AbstractC63955Swf.A02(context, AbstractC31174DnI.A0B(new Uri.Builder().scheme("market").authority("details"), PublicKeyCredentialControllerUtility.JSON_KEY_ID, string), bundle);
    }

    @Override // X.InterfaceC65539TmB
    public final Bundle ALk(String str, String str2, boolean z) {
        Bundle A0N = AbstractC58321PtD.A0N(str, str2, z);
        A0N.putStringArrayList("package_names", A00);
        return A0N;
    }

    @Override // X.InterfaceC65539TmB
    public final boolean F8p(Context context, Bundle bundle) {
        String string = bundle.getString("url");
        if (string == null || !string.startsWith("https://play.google.com/store/apps/details?id=")) {
            return false;
        }
        return AbstractC63955Swf.A02(context, AbstractC08820cl.A03(string), bundle);
    }
}
