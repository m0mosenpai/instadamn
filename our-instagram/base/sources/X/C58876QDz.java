package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import java.util.Arrays;

/* renamed from: X.QDz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58876QDz extends C63193Sev {
    public C58876QDz() {
        super("ACTION_OPEN_WITH");
    }

    public static Intent A00(InterfaceC172717mh interfaceC172717mh, InterfaceC172727mi interfaceC172727mi) {
        String str;
        Intent intent = interfaceC172717mh.getIntent();
        if (intent == null) {
            return null;
        }
        if (interfaceC172727mi.CWX()) {
            str = intent.getStringExtra("BrowserLiteIntent.OPEN_WITH_URL");
        } else {
            str = null;
        }
        QF6 C9a = interfaceC172727mi.C9a();
        if (C9a == null) {
            return null;
        }
        C63217SfN c63217SfN = C63217SfN.A06;
        if (c63217SfN != null && c63217SfN.A02()) {
            str = c63217SfN.A01.A02;
        } else if (str == null) {
            str = C9a.A05();
        }
        if (C9a.A0b) {
            str = C9a.A0M;
        }
        if (str == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra("BrowserLiteIntent.EXTRA_IAB_CLICKID");
        boolean booleanExtra = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOULD_ATTACH_CLICKID", false);
        if (stringExtra != null) {
            String stringExtra2 = intent.getStringExtra("BrowserLiteIntent.EXTRA_BROWSER_APP_SURFACE");
            if (("BrowserLiteIntent.BrowserAppSurfaceExtras.FB4A".equals(stringExtra2) || ("BrowserLiteIntent.BrowserAppSurfaceExtras.IG4A".equals(stringExtra2) && !interfaceC172727mi.CWX())) && booleanExtra) {
                str = AbstractC31174DnI.A0B(AbstractC31175DnJ.A04(str), "fbclid", stringExtra).toString();
            }
        }
        C63217SfN c63217SfN2 = C63217SfN.A06;
        if (c63217SfN2 != null) {
            C51758Mth c51758Mth = c63217SfN2.A00;
            if (c51758Mth.A01 && str != null) {
                str = AbstractC61742Rsx.A00((SFB) c51758Mth.A00, str);
            }
        }
        Intent A04 = AbstractC31171DnF.A04();
        A04.setAction("android.intent.action.VIEW");
        A04.setData(AbstractC58319PtB.A09(str));
        A04.putExtra("click_id", stringExtra);
        A04.putExtra("BrowserLiteIntent.EXTRA_IAB_CLICKID_STATUS", intent.getStringExtra("BrowserLiteIntent.EXTRA_IAB_CLICKID_STATUS"));
        A04.putExtra("BrowserLiteIntent.EXTRA_SHOULD_ATTACH_CLICKID", booleanExtra);
        return A04;
    }

    public static C58876QDz A01(Context context, InterfaceC172717mh interfaceC172717mh, InterfaceC172727mi interfaceC172727mi, int i) {
        ActivityInfo activityInfo;
        String string;
        Intent A00 = A00(interfaceC172717mh, interfaceC172727mi);
        if (A00 != null) {
            Boolean bool = AbstractC63262SgL.A01;
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(A00, Constants.LOAD_RESULT_PGO_ATTEMPTED);
            if (resolveActivity != null && (activityInfo = resolveActivity.activityInfo) != null && ((ComponentInfo) activityInfo).exported) {
                if (((PackageItemInfo) activityInfo).packageName.equalsIgnoreCase("android")) {
                    string = context.getString(R.string.res_0x7f130062_name_removed);
                } else {
                    string = context.getString(R.string.res_0x7f130063_name_removed, Arrays.copyOf(new Object[]{resolveActivity.loadLabel(context.getPackageManager())}, 1));
                }
                C14360o3.A07(string);
                C58876QDz c58876QDz = new C58876QDz();
                c58876QDz.A03 = string;
                if (i < 0) {
                    c58876QDz.A00 = 0;
                } else if (i > 0) {
                    c58876QDz.A00 = i;
                    return c58876QDz;
                }
                return c58876QDz;
            }
        }
        return null;
    }
}
