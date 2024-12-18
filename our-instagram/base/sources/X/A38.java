package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.camera.DirectCameraViewModel;

/* loaded from: classes4.dex */
public abstract class A38 {
    public static final void A00(Activity activity, RectF rectF, C22P c22p, UserSession userSession, InterfaceC1119353f interfaceC1119353f, DirectCameraViewModel directCameraViewModel, C41551w4 c41551w4, Integer num, String str, float f, boolean z) {
        RectF rectF2;
        String A0i = AbstractC37301Gc2.A0i(c41551w4.A0H);
        int i = c41551w4.A01;
        if (z) {
            float A09 = AbstractC13880nE.A09(activity);
            rectF2 = new RectF(rectF.left, A09 - f, rectF.right, A09);
        } else {
            rectF2 = rectF;
        }
        AbstractC189688an.A00(c22p);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable(AbstractC43591JPw.A00(7), directCameraViewModel);
        A0b.putBoolean("DirectReplyCameraFragments.ARG_REPLY_THUMBNAIL_ENABLED", false);
        A0b.putString("DirectVisualReplyFragment.ARG_REPLY_REEL_ID", A0i);
        A0b.putInt("DirectVisualReplyFragment.ARG_REPLY_REEL_CURRENT_ITEM_INDEX", i);
        A0b.putString("DirectVisualReplyFragment.REPLY_CAM_ARG_REPLY_TYPE", str);
        A0b.putParcelable(AbstractC43591JPw.A00(24), rectF);
        A0b.putParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_EXIT_VIEW_BOUNDS", rectF2);
        A0b.putSerializable(AbstractC43591JPw.A00(10), c22p);
        A0b.putString(AbstractC43591JPw.A00(249), null);
        A0b.putString("DirectQuickReplyCameraFragment.REPLY_CAM_ARG_CAMERA_INITIAL_CANVAS_ELEMENT", null);
        C6XJ A02 = C6XJ.A02(activity, A0b, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(110));
        A02.A0E(interfaceC1119353f);
        if (num != null) {
            A02.A0A(activity, num.intValue());
        } else {
            A02.A0C(activity);
        }
        C41711wL.A01(userSession).A00.A07();
    }
}
