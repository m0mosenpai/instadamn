package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.MediaVCRTappableData;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.modal.ModalActivity;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* renamed from: X.CgU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28422CgU {
    public static final C28422CgU A00 = new Object();

    public static final void A00(Activity activity, Context context, Fragment fragment, C22P c22p, UserSession userSession, C38321qM c38321qM, User user, String str, String str2) {
        C14360o3.A0B(activity, 0);
        AbstractC167027dH.A0a(1, context, userSession, fragment, str);
        AbstractC167007dF.A1I(str2, 5, c22p);
        boolean A5P = c38321qM.A5P();
        Float valueOf = Float.valueOf(Float.MAX_VALUE);
        Float valueOf2 = Float.valueOf(0.0f);
        if (A5P) {
            if (user != null) {
                String A0E = AbstractC13950nL.A0E(-1);
                String id = c38321qM.getId();
                if (id != null) {
                    C23096AGg.A00.A00(activity, fragment, c22p, userSession, new ReelsVisualRepliesModel(new MediaVCRTappableData(user, valueOf, valueOf2, A0E, str, str2, null, id, AbstractC13950nL.A0E(-1), null, false), true), null, c38321qM, null, false);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            return;
        }
        if ((!c38321qM.A5b() && !c38321qM.A5O() && !c38321qM.A5N()) || user == null) {
            return;
        }
        RectF rectF = new RectF(0.0f, 0.0f, AbstractC13890nF.A01(context), AbstractC13890nF.A00(context));
        String A0E2 = AbstractC13950nL.A0E(-1);
        String id2 = c38321qM.getId();
        if (id2 != null) {
            ReelsVisualRepliesModel reelsVisualRepliesModel = new ReelsVisualRepliesModel(new MediaVCRTappableData(user, valueOf, valueOf2, A0E2, str, str2, null, id2, AbstractC13950nL.A0E(-1), null, false), true);
            C38321qM c38321qM2 = c38321qM;
            if ((!c38321qM.A5M() || (c38321qM2 = c38321qM.A1e(0)) != null) && c38321qM2.Cff() && c38321qM.A1z() != ProductType.IGTV && c38321qM.A1z() != ProductType.CLIPS) {
                AbstractC35183Ffa.A01(activity, rectF, rectF, c22p, userSession, reelsVisualRepliesModel, c38321qM, "commentShare", null, 0, false);
                return;
            } else {
                AbstractC35183Ffa.A00(activity, rectF, rectF, c22p, userSession, reelsVisualRepliesModel, null, c38321qM, null, "commentShare", null, 0, false);
                return;
            }
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public final boolean A02(C169277h1 c169277h1, C166047bW c166047bW, C168497fj c168497fj, UserSession userSession, C115925Mi c115925Mi) {
        if (c166047bW != null) {
            boolean A06 = C2TN.A06(c166047bW.A0A);
            boolean A062 = C2TN.A06(AbstractC166987dD.A10(userSession));
            if (A06 && A062) {
                boolean z = c168497fj.A05;
                boolean A1W = AbstractC167007dF.A1W(c169277h1);
                boolean A1W2 = AbstractC167007dF.A1W(c115925Mi);
                if (!z && !A1W && !A1W2) {
                    if (c166047bW.A0Z || c166047bW.A0W) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, String str) {
        AbstractC167017dG.A1O(userSession, c38321qM);
        boolean A5P = c38321qM.A5P();
        String id = c38321qM.getId();
        if (A5P) {
            if (id != null) {
                if (fragmentActivity != null) {
                    C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A0m, userSession);
                    c116875Qr.A1D = id;
                    c116875Qr.A1I = str;
                    c116875Qr.A09 = EnumC120785dO.SHARED_COMMENT_ON_STORY;
                    AbstractC86593tX.A0X(fragmentActivity, c116875Qr.A00(), userSession);
                    return;
                }
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        if (id != null) {
            if (fragmentActivity == null) {
                return;
            }
            IgFragmentFactoryImpl.A00();
            C35028Fc1 c35028Fc1 = new C35028Fc1();
            c35028Fc1.A0B = id;
            c35028Fc1.A0N = true;
            c35028Fc1.A09 = str;
            c35028Fc1.A0G = str;
            C6XJ c6xj = new C6XJ(fragmentActivity, c35028Fc1.A01(), userSession, ModalActivity.class, "single_media_feed");
            c6xj.A08();
            c6xj.A0C(fragmentActivity);
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
