package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.GoJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38030GoJ {
    public static final boolean A01(String str) {
        String A00;
        C14360o3.A0B(str, 0);
        switch (str.hashCode()) {
            case -1946787665:
                A00 = AbstractC111324zv.A00(2375);
                break;
            case -1794471280:
                A00 = AbstractC111324zv.A00(2376);
                break;
            case -1305914996:
                A00 = "open_carousel_review_page";
                break;
            case 34007127:
                A00 = "feed_timeline_older";
                break;
            case 96419903:
                A00 = "feed_timeline_fan_club";
                break;
            case 227128404:
                if (!str.equals(AbstractC111324zv.A00(414))) {
                    return false;
                }
                return true;
            case 1287310483:
                A00 = AbstractC111324zv.A00(4450);
                break;
            case 1970940954:
                A00 = "feed_timeline_favorites";
                break;
            default:
                return false;
        }
        if (!str.equals(A00)) {
            return false;
        }
        return true;
    }

    public static final HY4 A00(Bundle bundle, Fragment fragment, FragmentActivity fragmentActivity, C62862tP c62862tP, C65672y3 c65672y3, C61142qc c61142qc, InterfaceC61352qx interfaceC61352qx, C155376yQ c155376yQ, C60972qL c60972qL, InterfaceC64612wK interfaceC64612wK, AnonymousClass341 anonymousClass341, InterfaceC63342uH interfaceC63342uH, C5GV c5gv, SearchContext searchContext, InterfaceC62602sz interfaceC62602sz, C1M1 c1m1, Integer num, String str, String str2, boolean z, boolean z2, boolean z3) {
        HY4 c38284GsT;
        AbstractC167007dF.A1I(c61142qc, 4, interfaceC61352qx);
        InterfaceC60442pS interfaceC60442pS = c60972qL.A02;
        if (!A01(interfaceC60442pS.getModuleName())) {
            if (!C18U.A06(C06090Tz.A05, c60972qL.A01, 36316740216492671L)) {
                bundle.getBoolean("ContextualFeedFragment.ARGUMENT_IS_EXPLORE_ATTRIBUTION_VISIBLE");
                c38284GsT = new C37432GeC(fragment, fragmentActivity, c62862tP, c65672y3, c61142qc, interfaceC61352qx, c155376yQ, c60972qL, anonymousClass341, c5gv, searchContext, C38U.A00, interfaceC62602sz, c1m1, num, str, str2, z, true, bundle.getBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_USE_BASE_DIFF_UTIL"), true, bundle.getBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_HIDE_UFI_BUTTONS"), z2, bundle.getBoolean("ContextualFeedFragment.ARGUMENTS_SHOULD_ADD_UNIVERSAL_CTA_GAP", false), z3);
                return c38284GsT;
            }
        }
        c38284GsT = new C38284GsT(fragment, fragmentActivity, c62862tP, c65672y3, c61142qc, c60972qL, interfaceC64612wK, anonymousClass341, interfaceC63342uH, new C42721IvG(), interfaceC62602sz, c1m1, new C3YR(c60972qL.A01, interfaceC60442pS.getModuleName()));
        return c38284GsT;
    }
}
