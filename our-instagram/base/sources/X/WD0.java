package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import androidx.fragment.app.FragmentActivity;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class WD0 {
    public final UserSession A00;

    public WD0(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final String A00(LocationPageInformation locationPageInformation, boolean z) {
        String str;
        if (z) {
            str = locationPageInformation.A08;
        } else {
            str = "";
        }
        List A1Q = AbstractC16960so.A1Q(str, locationPageInformation.A05, locationPageInformation.A07, locationPageInformation.A0B);
        ArrayList arrayList = new ArrayList();
        for (Object obj : A1Q) {
            String str2 = (String) obj;
            if (str2 != null && str2.length() != 0) {
                arrayList.add(obj);
            }
        }
        return AbstractC31175DnJ.A0a(" ", arrayList);
    }

    public static final void A01(FragmentActivity fragmentActivity, MediaMapPin mediaMapPin) {
        boolean z;
        StringBuilder A11;
        String str;
        LocationPageInformation locationPageInformation = mediaMapPin.A06;
        if (locationPageInformation != null) {
            String str2 = locationPageInformation.A05;
            String str3 = locationPageInformation.A07;
            String str4 = locationPageInformation.A0B;
            Double d = mediaMapPin.A0A;
            Double d2 = mediaMapPin.A0B;
            if (d != null && d2 != null) {
                double doubleValue = d.doubleValue();
                double doubleValue2 = d2.doubleValue();
                if ((str2 != null && str2.isEmpty()) || ((str3 != null && str3.isEmpty()) || (str4 != null && str4.isEmpty()))) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    A11 = new StringBuilder();
                } else {
                    A11 = AbstractC166997dE.A11(str2);
                    String str5 = "";
                    if (str3 == null || str3.isEmpty()) {
                        str = "";
                    } else {
                        str = AnonymousClass001.A0R(", ", str3);
                    }
                    A11.append(str);
                    if (str4 != null && !str4.isEmpty()) {
                        str5 = AnonymousClass001.A0R(", ", str4);
                    }
                    A11.append(str5);
                    A11.append("&center=");
                }
                A11.append(doubleValue);
                A11.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                A11.append(doubleValue2);
                C12260kU.A0E(fragmentActivity, AbstractC35180FfX.A00(fragmentActivity, C05F.A00, A11.toString()));
                return;
            }
            AbstractC35180FfX.A03(fragmentActivity, str2, str3, str4);
        }
    }

    public final void A02(FragmentActivity fragmentActivity, LocationPageInformation locationPageInformation, boolean z) {
        String A00 = A00(locationPageInformation, z);
        Object systemService = fragmentActivity.getSystemService("clipboard");
        C14360o3.A0C(systemService, AbstractC111324zv.A00(68));
        ClipData newPlainText = ClipData.newPlainText(A00, A00);
        C14360o3.A07(newPlainText);
        ((ClipboardManager) systemService).setPrimaryClip(newPlainText);
        C9GR.A07(fragmentActivity, 2131975312);
    }
}
