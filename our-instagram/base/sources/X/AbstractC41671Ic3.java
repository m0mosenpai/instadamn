package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* renamed from: X.Ic3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41671Ic3 {
    public static final void A00(Activity activity, Bundle bundle, Fragment fragment, C22P c22p, UserSession userSession) {
        A01(activity, bundle, fragment, c22p, userSession, false, false);
    }

    public static final void A01(Activity activity, Bundle bundle, Fragment fragment, C22P c22p, UserSession userSession, boolean z, boolean z2) {
        C6XJ A02;
        boolean A1a = AbstractC31175DnJ.A1a(userSession);
        if (bundle == null) {
            INH A0C = AbstractC86593tX.A0C(c22p);
            A0C.A0q = false;
            A0C.A0l = z2;
            bundle = A0C.A00();
        }
        if (fragment.getContext() == null) {
            AbstractC12120kG.A07("ClipsCameraLauncherHelper", AbstractC43591JPw.A00(629), null);
            return;
        }
        if (z) {
            A02 = C6XJ.A02(activity, bundle, userSession, TransparentModalActivity.class, "clips_camera");
            A02.A0D = A1a;
        } else {
            A02 = C6XJ.A02(activity, bundle, userSession, ModalActivity.class, "clips_camera");
        }
        AbstractC31179DnN.A1S(A02);
        A02.A0D(fragment, 9587);
    }

    public static final void A02(Activity activity, Fragment fragment, C22P c22p, UserSession userSession, C38321qM c38321qM, PromptStickerModel promptStickerModel) {
        AbstractC167027dH.A12(fragment, activity, userSession);
        INH A0C = AbstractC86593tX.A0C(c22p);
        PromptStickerModel A04 = promptStickerModel.A04();
        A04.A08(AbstractC166997dE.A0Y(userSession));
        A04.A09(null);
        A0C.A0C = A04;
        if (promptStickerModel.A0H() && C14360o3.A0K(promptStickerModel.A04, AbstractC111324zv.A00(2060))) {
            A0C.A08 = AbstractC41770Iem.A03(c38321qM);
            EffectPreviewIntf A02 = AbstractC41770Iem.A02(c38321qM);
            if (A02 != null && !AbstractC167007dF.A1W(A02.getFailureReason())) {
                String effectId = A02.getEffectId();
                if (effectId == null) {
                    effectId = A02.getId();
                }
                A0C.A0Q = effectId;
                A0C.A0R = A02.getName();
                A0C.A02 = AbstractC41732Ie4.A00(A02);
            }
        }
        C6XJ.A02(activity, A0C.A00(), userSession, TransparentModalActivity.class, "clips_camera").A0D(fragment, 9587);
    }
}
