package X;

import com.facebook.forker.Process;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.pendingmedia.model.constants.ShareType;

/* loaded from: classes4.dex */
public final class ACA {
    public final DirectShareTarget A00;
    public final UserStoryTarget A01;
    public final ShareType A02;

    public final boolean A00() {
        if (this.A00 != null && this.A02 == ShareType.A0E) {
            return true;
        }
        return false;
    }

    public final boolean A01() {
        if (this.A00 != null && this.A02 == ShareType.A0F) {
            return true;
        }
        return false;
    }

    public ACA(DirectShareTarget directShareTarget, UserStoryTarget userStoryTarget, ShareType shareType) {
        AbstractC226759zX abstractC226759zX = AbstractC226759zX.$redex_init_class;
        switch (shareType.ordinal()) {
            case 0:
            case 14:
            case 26:
                break;
            case 1:
            case 3:
            case Process.SIGTERM /* 15 */:
                directShareTarget.getClass();
                break;
            case 2:
            case 16:
            case 25:
                userStoryTarget.getClass();
                break;
            default:
                throw AbstractC166987dD.A12("Unhandled share type sent");
        }
        this.A00 = directShareTarget;
        this.A01 = userStoryTarget;
        this.A02 = shareType;
    }
}
