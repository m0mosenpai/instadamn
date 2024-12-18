package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.File;

/* renamed from: X.AGg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23096AGg {
    public static final C23096AGg A00 = new Object();

    public final void A00(final Activity activity, Fragment fragment, final C22P c22p, final UserSession userSession, final ReelsVisualRepliesModel reelsVisualRepliesModel, final ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel, final C38321qM c38321qM, final String str, boolean z) {
        AbstractC208269Jl.A00(userSession).A07(c22p, true);
        C08790ch c08790ch = null;
        final C6WQ c6wq = new C6WQ(activity, true);
        c6wq.A00(activity.getString(2131965660));
        if (fragment != null && fragment.isAdded() && !fragment.mDetached) {
            c08790ch = AbstractC018607g.A00(fragment);
        }
        C121275eQ A03 = AbstractC50633MWu.A03(activity, userSession, new OUQ(c38321qM.A2a(), "ClipsReshareToStoryHelper", true, false, false));
        A03.A00 = new C2AH() { // from class: X.9hF
            @Override // X.C2AH
            public final void onFail(Exception exc) {
                C14360o3.A0B(exc, 0);
                AbstractC208269Jl.A00(userSession).A08(exc.getMessage());
                C9GR.A0B(activity, "save_media_failed");
            }

            @Override // X.C2AH, X.C11R
            public final void onFinish() {
                if (!activity.isDestroyed()) {
                    c6wq.dismiss();
                }
            }

            @Override // X.C2AH, X.C11R
            public final void onStart() {
                C0fJ.A00(c6wq);
            }

            @Override // X.C2AH
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                ExtendedImageUrl A1q;
                File file = (File) obj;
                C14360o3.A0B(file, 0);
                UserSession userSession2 = userSession;
                C14360o3.A0B(userSession2, 0);
                boolean A06 = C18U.A06(C06090Tz.A05, userSession2, 36323161192541226L);
                Activity activity2 = activity;
                C38321qM c38321qM2 = c38321qM;
                C22P c22p2 = c22p;
                ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel2 = clipsCelebrationReshareViewModel;
                ReelsVisualRepliesModel reelsVisualRepliesModel2 = reelsVisualRepliesModel;
                String str2 = str;
                if (A06) {
                    ExtendedImageUrl A1n = c38321qM2.A1n();
                    if (A1n != null) {
                        String str3 = A1n.A0A;
                        C14360o3.A07(str3);
                        A1q = new ExtendedImageUrl(str3, A1n.getWidth(), A1n.getHeight());
                    } else {
                        A1q = c38321qM2.A1q(activity2);
                    }
                    Bundle A002 = AbstractC61636Rr0.A00(AbstractC166987dD.A1L(MSV.A00(152), c22p2), AbstractC166987dD.A1L(MSV.A00(154), c38321qM2.getId()), AbstractC166987dD.A1L(MSV.A00(153), file.getCanonicalPath()), AbstractC166987dD.A1L("ClipsConstants.ARG_CLIPS_SHARE_CELEBRATION_VIEW_MODEL", clipsCelebrationReshareViewModel2), AbstractC166987dD.A1L(MSV.A00(72), null), AbstractC166987dD.A1L("ClipsConstants.ARG_CLIPS_COMMENT_SHARE_MODEL", reelsVisualRepliesModel2), AbstractC166987dD.A1L("ClipsConstants.ARG_CLIPS_ACHIEVEMENTS_STICKER_URL", str2));
                    ExtendedImageUrl extendedImageUrl = A1q;
                    AbstractC70197WGf.A05(activity2, extendedImageUrl, new C23681AeG(activity2, A002, userSession2, 2), C50472Tr.A01(), activity2.getColor(R.color.black), true);
                    return;
                }
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putSerializable(MSV.A00(152), c22p2);
                A0b.putString(MSV.A00(154), c38321qM2.getId());
                A0b.putString(MSV.A00(153), file.getCanonicalPath());
                A0b.putParcelable("ClipsConstants.ARG_CLIPS_SHARE_CELEBRATION_VIEW_MODEL", clipsCelebrationReshareViewModel2);
                A0b.putParcelable(MSV.A00(72), null);
                A0b.putParcelable("ClipsConstants.ARG_CLIPS_COMMENT_SHARE_MODEL", reelsVisualRepliesModel2);
                A0b.putString("ClipsConstants.ARG_CLIPS_ACHIEVEMENTS_STICKER_URL", str2);
                C6XJ.A02(activity2, A0b, userSession2, TransparentModalActivity.class, "reel_clips_share").A0C(activity2);
            }
        };
        if (!z && c08790ch != null) {
            C1GJ.A00(activity, c08790ch, A03);
        } else {
            C1GJ.A03(A03);
        }
    }
}
