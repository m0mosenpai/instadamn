package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.41w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC906141w {
    public static final String A00(Context context, String str, boolean z) {
        int i;
        C14360o3.A0B(str, 1);
        switch (str.hashCode()) {
            case -1485768866:
                if (str.equals("health_disclaimer")) {
                    i = 2131963474;
                    str = context.getString(i);
                    break;
                }
                break;
            case -1008182312:
                if (str.equals(MSV.A00(1655))) {
                    i = 2131975272;
                    str = context.getString(i);
                    break;
                }
                break;
            case -531705460:
                if (str.equals("medication_guide")) {
                    i = 2131966156;
                    str = context.getString(i);
                    break;
                }
                break;
            case -424992633:
                if (str.equals("prescription_information")) {
                    i = 2131969907;
                    str = context.getString(i);
                    break;
                }
                break;
            case 334460247:
                if (str.equals("prescribing_information")) {
                    i = 2131969906;
                    str = context.getString(i);
                    break;
                }
                break;
            case 529700703:
                if (str.equals(AbstractC58317Pt9.A00(892))) {
                    i = 2131968940;
                    str = context.getString(i);
                    break;
                }
                break;
            case 1688919676:
                if (str.equals("important_safety_information")) {
                    i = 2131964352;
                    str = context.getString(i);
                    break;
                }
                break;
        }
        if (z) {
            String string = context.getString(2131973181, str);
            C14360o3.A0A(string);
            return string;
        }
        return str;
    }

    public static final void A01(Activity activity, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C55772hI.A00(userSession).A09(activity, "about_ads");
        SimpleWebViewActivity.A02.A02(activity, userSession, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, true, false, false, true, false, false, false, activity.getString(2131951993), MSV.A00(1241)));
    }

    public static final boolean A03(AndroidLink androidLink) {
        Object obj;
        C14360o3.A0B(androidLink, 0);
        if (AbstractC114965Hm.A01(androidLink) == EnumC906041v.AD_DESTINATION_APP_STORE) {
            Integer AcK = androidLink.AcK();
            if (AcK == null || (obj = EnumC115235Iu.A01.get(AcK)) == null) {
                obj = EnumC115235Iu.A05;
            }
            if (obj == EnumC115235Iu.A04) {
                String CIt = androidLink.CIt();
                if (CIt == null) {
                    CIt = "";
                }
                if (AbstractC13180m4.A03(CIt)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A02(AndroidLink androidLink) {
        if (androidLink != null && "com.whatsapp".equals(androidLink.CIt())) {
            return true;
        }
        return false;
    }
}
