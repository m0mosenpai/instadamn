package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.UserStoryTarget;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class AH3 {
    public final List A00;
    public final List A01;

    public static AH3 A00(ACA aca) {
        DirectShareTarget directShareTarget = aca.A00;
        if (directShareTarget != null) {
            return new AH3(Collections.singletonList(directShareTarget), null);
        }
        UserStoryTarget userStoryTarget = aca.A01;
        if (userStoryTarget != null) {
            return new AH3(null, Arrays.asList(userStoryTarget));
        }
        return new AH3(null, null);
    }

    public final boolean A01() {
        List list = this.A01;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean A02(UserStoryTarget userStoryTarget) {
        List list = this.A01;
        if (list != null && list.contains(userStoryTarget)) {
            return true;
        }
        return false;
    }

    public AH3(List list, List list2) {
        this.A00 = list;
        this.A01 = list2;
    }
}
