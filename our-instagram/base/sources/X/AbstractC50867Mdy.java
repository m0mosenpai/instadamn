package X;

import android.app.Application;
import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.Mdy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50867Mdy extends C193578hc {
    public final AbstractC55194Oe0 A00;
    public final Map A01;

    public final void A0E(C51754Mtd c51754Mtd) {
        C14360o3.A0B(c51754Mtd, 0);
        for (PublishScreenCategoryType publishScreenCategoryType : PublishScreenCategoryType.values()) {
            ArrayList A06 = this.A00.A06(publishScreenCategoryType, c51754Mtd);
            Map map = this.A01;
            Object obj = map.get(publishScreenCategoryType);
            if (obj == null) {
                obj = AbstractC31171DnF.A0o();
                map.put(publishScreenCategoryType, obj);
            }
            ((C05A) obj).Egh(A06);
        }
    }

    public AbstractC50867Mdy(Application application, AbstractC55194Oe0 abstractC55194Oe0) {
        super(application);
        this.A00 = abstractC55194Oe0;
        this.A01 = AbstractC166987dD.A1I();
    }

    public static C50569MUa A00(FollowersShareFragment followersShareFragment) {
        return (C50569MUa) FollowersShareFragment.A03(followersShareFragment).A0D.A06.getValue();
    }

    public static NKE A01(FollowersShareFragment followersShareFragment) {
        return FollowersShareFragment.A03(followersShareFragment).A0K;
    }

    public static boolean A02(FollowersShareFragment followersShareFragment) {
        return ((C50526MSf) FollowersShareFragment.A03(followersShareFragment).A0N.A05.getValue()).A00;
    }
}
