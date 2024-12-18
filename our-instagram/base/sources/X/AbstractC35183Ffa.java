package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediatype.ProductType;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.io.File;

/* renamed from: X.Ffa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35183Ffa {
    public static final void A02(Activity activity, RectF rectF, RectF rectF2, UserSession userSession, ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel, C38321qM c38321qM, String str, String str2, int i, boolean z) {
        boolean A1b = AbstractC25233BEq.A1b(userSession, activity, c38321qM);
        C14360o3.A0B(rectF, 5);
        C38321qM c38321qM2 = c38321qM;
        if ((!c38321qM.A5M() || (c38321qM2 = c38321qM.A1e(i)) != null) && c38321qM2.Cff() == A1b && c38321qM.A1z() != ProductType.IGTV && c38321qM.A1z() != ProductType.CLIPS) {
            A01(activity, rectF, rectF2, C22P.A2o, userSession, null, c38321qM, str, str2, i, z);
        } else {
            A00(activity, rectF, rectF2, C22P.A2o, userSession, null, clipsCelebrationReshareViewModel, c38321qM, null, str, str2, i, z);
        }
    }

    public static final void A03(Activity activity, RectF rectF, UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        FVK.A01(userSession, C1GJ.A01(), new G7O(activity, rectF, userSession, str2, str), str);
    }

    public static final void A00(Activity activity, RectF rectF, RectF rectF2, C22P c22p, UserSession userSession, ReelsVisualRepliesModel reelsVisualRepliesModel, ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel, C38321qM c38321qM, File file, String str, String str2, int i, boolean z) {
        ExtendedImageUrl A1q;
        AbstractC167017dG.A1T(rectF, rectF2);
        C14360o3.A0B(c22p, 7);
        AbstractC208269Jl.A00(userSession).A07(c22p, true);
        MusicOverlayStickerModel A03 = AbstractC101614hW.A03(MusicProduct.A0G, c38321qM, 15000);
        if (A03 == null || !C18U.A06(C06090Tz.A05, userSession, 36326090360239756L)) {
            A03 = null;
        }
        if (c38321qM.A5M()) {
            C38321qM A1e = c38321qM.A1e(i);
            if (A1e != null) {
                A1q = A1e.A1q(activity);
            }
            C0w9.A03("ReelFeedPostShareHelper", "No url for media item");
            C9GR.A0B(activity, "sizedTypedUrl is null");
        }
        A1q = c38321qM.A1q(activity);
        if (A1q != null) {
            AbstractC70197WGf.A05(activity, A1q, new C23682AeH(activity, rectF, rectF2, c22p, userSession, reelsVisualRepliesModel, clipsCelebrationReshareViewModel, A03, file, c38321qM.getId(), str, str2, i, z), C50472Tr.A01(), AbstractC31173DnH.A02(activity), false);
            return;
        }
        C0w9.A03("ReelFeedPostShareHelper", "No url for media item");
        C9GR.A0B(activity, "sizedTypedUrl is null");
    }

    public static final void A01(Activity activity, RectF rectF, RectF rectF2, C22P c22p, UserSession userSession, ReelsVisualRepliesModel reelsVisualRepliesModel, C38321qM c38321qM, String str, String str2, int i, boolean z) {
        C38321qM c38321qM2 = c38321qM;
        if (c38321qM.A5M()) {
            c38321qM2 = c38321qM.A1e(i);
        }
        String str3 = null;
        C6WQ c6wq = new C6WQ(activity, true);
        AbstractC31176DnK.A13(activity, c6wq);
        if (c38321qM2 != null) {
            str3 = c38321qM2.A2a();
        }
        C121275eQ A03 = AbstractC50633MWu.A03(activity, userSession, new OUQ(str3, "ReelFeedPostShareHelper", true, false, false));
        A03.A00 = new EZA(activity, rectF, rectF2, c22p, userSession, reelsVisualRepliesModel, c38321qM, c6wq, str, str2, i, z);
        C1GJ.A03(A03);
    }
}
