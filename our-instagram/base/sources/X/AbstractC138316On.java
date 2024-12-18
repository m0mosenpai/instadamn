package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.business.promote.activity.PromoteActivity;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.mediatype.ProductType;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6On, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC138316On {
    public static final void A02(Context context, UserSession userSession, String str, String str2, String str3, String str4, List list) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(list, 6);
        AbstractC69888VxF.A00();
        Intent intent = new Intent(context, (Class<?>) PromoteActivity.class);
        C09530e4 c09530e4 = new C09530e4("promote_launch_origin", PromoteLaunchOrigin.A03);
        C09530e4 c09530e42 = new C09530e4("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        C09530e4 c09530e43 = new C09530e4("media_id", AbstractC69888VxF.A01(str2));
        C09530e4 c09530e44 = new C09530e4(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        C09530e4 c09530e45 = new C09530e4("destination_cta", str3);
        C09530e4 c09530e46 = new C09530e4("political_ad_byline_text", str4);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AdsAPIInstagramPosition) it.next()).name());
        }
        ArrayList arrayList2 = new ArrayList();
        AbstractC001800i.A0r(arrayList, arrayList2);
        intent.putExtras(AbstractC61636Rr0.A00(c09530e4, c09530e42, c09530e43, c09530e44, c09530e45, c09530e46, new C09530e4("instagram_positions", arrayList2)));
        C12260kU.A0C(context, intent);
    }

    public static final void A03(Fragment fragment, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(fragmentActivity, 1);
        C14360o3.A0B(fragment, 3);
        C14360o3.A0B(c38321qM, 4);
        if (AbstractC151876sX.A07(userSession) && c38321qM.A5P() && !c38321qM.A5U() && c38321qM.A1x() != EnumC76383bi.A04 && c38321qM.A1x() != EnumC76383bi.A0C && c38321qM.A1x() != EnumC76383bi.A08) {
            String boostUnavailableReason = c38321qM.A0C.getBoostUnavailableReason();
            if (boostUnavailableReason == null || boostUnavailableReason.length() == 0) {
                String boostUnavailableIdentifier = c38321qM.A0C.getBoostUnavailableIdentifier();
                if ((boostUnavailableIdentifier == null || boostUnavailableIdentifier.length() == 0) && A05(userSession, c38321qM) && C18U.A06(C06090Tz.A05, userSession, 36319136808246279L)) {
                    C146106i8 c146106i8 = new C146106i8();
                    c146106i8.A04();
                    c146106i8.A01 = 5000;
                    c146106i8.A0D = fragmentActivity.getString(2131977187);
                    c146106i8.A0J = true;
                    if (c38321qM.A1S() != null) {
                        c146106i8.A03();
                        ImageUrl A1S = c38321qM.A1S();
                        if (A1S != null) {
                            c146106i8.A09 = A1S;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    String string = fragmentActivity.getString(2131971645);
                    C14360o3.A07(string);
                    c146106i8.A0G = string;
                    c146106i8.A0A(new P3L(fragment, interfaceC11380iw, userSession, c38321qM));
                    c146106i8.A0L = true;
                    C41451vu.A01.A01(new C3KD(c146106i8.A00()));
                }
            }
        }
    }

    public static final void A04(FragmentActivity fragmentActivity, XIGIGBoostCallToAction xIGIGBoostCallToAction, UserSession userSession, AudioOverlayTrack audioOverlayTrack, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(fragmentActivity, 1);
        C14360o3.A0B(str, 2);
        C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A21, userSession);
        String string = fragmentActivity.getString(W6g.A00(xIGIGBoostCallToAction));
        c116875Qr.A1D = str;
        c116875Qr.A0c = string;
        c116875Qr.A0d = str2;
        c116875Qr.A0L = audioOverlayTrack;
        c116875Qr.A1C = userSession.userId;
        c116875Qr.A1d = false;
        AbstractC86593tX.A0X(fragmentActivity, c116875Qr.A00(), userSession);
    }

    public static final boolean A05(UserSession userSession, C38321qM c38321qM) {
        int ordinal;
        User A01 = C17060sy.A01.A01(userSession);
        if (A01 != c38321qM.A2E(userSession) || !A01.A1J() || (ordinal = c38321qM.A1b().ordinal()) == 1 || ordinal == 4 || ordinal == 2 || ordinal == 6 || ordinal == 11) {
            return false;
        }
        return true;
    }

    public static final int A00(ProductType productType, boolean z) {
        if (productType != null) {
            int ordinal = productType.ordinal();
            if (ordinal != 9) {
                if (ordinal == 13) {
                    return 2131957281;
                }
            } else {
                return 2131957282;
            }
        }
        if (!z) {
            return 2131957279;
        }
        return 2131957280;
    }

    public static final String A01(Resources resources, C38321qM c38321qM) {
        int A00;
        if (c38321qM != null) {
            switch (c38321qM.A1b().ordinal()) {
                case 1:
                case 2:
                case 4:
                    A00 = 2131970879;
                    break;
                case 3:
                case 5:
                    A00 = 2131953994;
                    break;
                case 7:
                    A00 = 2131962624;
                    break;
                case 10:
                    A00 = 2131952256;
                    break;
            }
            String string = resources.getString(A00);
            C14360o3.A0A(string);
            return string;
        }
        A00 = A00(ProductType.CLIPS, false);
        String string2 = resources.getString(A00);
        C14360o3.A0A(string2);
        return string2;
    }
}
