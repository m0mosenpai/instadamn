package X;

import com.instagram.api.schemas.GrowthFrictionInfo;
import com.instagram.api.schemas.GrowthFrictionInterventionCategories;
import com.instagram.api.schemas.GrowthFrictionInterventionDetail;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public abstract class IAS {
    public static final GrowthFrictionInterventionDetail A00(User user, Integer num) {
        GrowthFrictionInfo BAl;
        GrowthFrictionInterventionCategories BJE;
        GrowthFrictionInfo BAl2 = user.A03.BAl();
        boolean z = false;
        if (BAl2 != null && BAl2.BB4()) {
            z = true;
        }
        if (!z || (BAl = user.A03.BAl()) == null || (BJE = BAl.BJE()) == null) {
            return null;
        }
        if (num.intValue() != 1) {
            return BJE.BSJ();
        }
        return BJE.C4w();
    }
}
