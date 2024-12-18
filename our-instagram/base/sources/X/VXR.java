package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

/* loaded from: classes11.dex */
public abstract class VXR {
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.fragment.app.Fragment, X.V1X, X.38K] */
    public static V1X A00(UserSession userSession, C189478aR c189478aR, User user, EnumC39619HeT enumC39619HeT, EnumC65855TvH enumC65855TvH, VG2 vg2, XEG xeg, C67844UzI c67844UzI, String str, String str2, String str3, String str4, HashMap hashMap, float f, boolean z, boolean z2, boolean z3) {
        userSession.getClass();
        str.getClass();
        str4.getClass();
        enumC39619HeT.getClass();
        enumC65855TvH.getClass();
        vg2.getClass();
        xeg.getClass();
        c189478aR.getClass();
        hashMap.getClass();
        ?? c38k = new C38K();
        c38k.A01 = 0;
        c38k.A0K = false;
        c38k.A05 = c189478aR;
        c38k.A0D = xeg;
        c38k.A07 = user;
        c38k.A0E = c67844UzI;
        Bundle bundle = new Bundle();
        String str5 = userSession.token;
        str5.getClass();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str5);
        bundle.putString("StartFRXReportV2BottomSheetFragment.analytics_module", str4);
        bundle.putString("StartFRXReportV2BottomSheetFragment.content_id", str);
        bundle.putSerializable("StartFRXReportV2BottomSheetFragment.entry_point", enumC39619HeT);
        bundle.putSerializable("StartFRXReportV2BottomSheetFragment.location", enumC65855TvH);
        bundle.putSerializable("StartFRXReportV2BottomSheetFragment.object_type", vg2);
        bundle.putString("StartFRXReportV2BottomSheetFragment.object", str3);
        bundle.putBoolean("StartFRXReportV2BottomSheetFragment.is_interop_thread", z3);
        bundle.putBoolean("StartFRXReportV2BottomSheetFragment.is_encrypted_thread", z);
        bundle.putString("StartFRXReportV2BottomSheetFragment.direct_thread_id", str2);
        bundle.putBoolean("StartFRXReportV2BottomSheetFragment.is_fullscreen_enabled", z2);
        bundle.putFloat("StartFRXReportV2BottomSheetFragment.initial_opening_height_ratio", f);
        bundle.putSerializable("StartFRXReportBottomSheetFragment.ARG_EXTRAS", hashMap);
        bundle.putInt("StartFRXReportBottomSheetFragment.ARG_THEME_OVERRIDE", 0);
        c38k.setArguments(bundle);
        return c38k;
    }
}
