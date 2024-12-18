package X;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.reels.smb.model.ProfileStickerAiAgentData;
import com.instagram.reels.smb.model.ProfileStickerModel;
import com.instagram.user.model.User;

/* loaded from: classes4.dex */
public abstract class A2E {
    public static final void A00(Activity activity, C22P c22p, UserSession userSession, ProfileStickerAiAgentData profileStickerAiAgentData, User user, Integer num) {
        C14360o3.A0B(userSession, 0);
        Bundle A0b = AbstractC166987dD.A0b();
        ProfileStickerModel profileStickerModel = new ProfileStickerModel(C148276lx.A1Z, profileStickerAiAgentData, user, ProfileStickerModel.A08, num);
        A0b.putParcelable("ReelProfileStickerConstants.ARGUMENTS_KEY_SUPPORT_BUSINESS_MODEL", profileStickerModel);
        A0b.putSerializable("ReelProfileStickerConstants.ARGUMENTS_KEY_CAMERA_ENTRY_POINT", c22p);
        A0b.putParcelable("ReelProfileStickerConstants.ARGUMENTS_KEY_TARGET_GROUP_PROFILE", null);
        if (num != C05F.A00) {
            ImageUrl Bhu = user.Bhu();
            String A01 = C50472Tr.A01();
            int color = activity.getColor(R.color.sticker_background);
            C23681AeG c23681AeG = new C23681AeG(activity, A0b, userSession, 0);
            int A09 = AbstractC167007dF.A09(activity, R.attr.igds_color_media_background);
            DisplayMetrics A0K = AbstractC167007dF.A0K(activity);
            C14360o3.A07(A0K);
            C14120nc.A00().ATO(new C217329jR(A0K, Bhu, c23681AeG, A01, 25, color, A09));
        } else {
            C6XJ.A02(activity, A0b, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(2988)).A0C(activity);
        }
        User user2 = profileStickerModel.A03;
        if (user2 != null && user2.A03.Aae() != null) {
            new C28484Chc(userSession).A07(user2.A03.Aah(), user2.A03.Aae(), true);
        }
    }
}
