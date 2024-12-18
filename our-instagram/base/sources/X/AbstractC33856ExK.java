package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.FanClubNextStepsRecommendationsType;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.ExK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33856ExK {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        UserSession userSession = (UserSession) AbstractC31175DnJ.A0J(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C14360o3.A0C(A04, AbstractC58317Pt9.A00(7));
        IgFragmentActivity igFragmentActivity = (IgFragmentActivity) A04;
        Object A01 = c6fw.A01();
        AbstractC25225BEi.A1S(A01);
        C35024Fbx c35024Fbx = new C35024Fbx(null, igFragmentActivity, userSession, null, "guidance_recommendation", 56);
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType = (FanClubNextStepsRecommendationsType) FanClubNextStepsRecommendationsType.A01.get(A01);
        if (fanClubNextStepsRecommendationsType == null) {
            fanClubNextStepsRecommendationsType = FanClubNextStepsRecommendationsType.A0J;
        }
        c35024Fbx.A02(fanClubNextStepsRecommendationsType, C05F.A04);
        igFragmentActivity.registerOnActivityResultListener(new C42275Inz(1, c35024Fbx, igFragmentActivity));
        return null;
    }
}
