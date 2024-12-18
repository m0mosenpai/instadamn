package X;

import com.instagram.api.schemas.FeedAfterPartyPromoteEligibilityStatusEnum;

/* loaded from: classes7.dex */
public final class H3J extends C0T6 implements InterfaceC43466JIe {
    public final FeedAfterPartyPromoteEligibilityStatusEnum A00;

    public H3J(FeedAfterPartyPromoteEligibilityStatusEnum feedAfterPartyPromoteEligibilityStatusEnum) {
        C14360o3.A0B(feedAfterPartyPromoteEligibilityStatusEnum, 1);
        this.A00 = feedAfterPartyPromoteEligibilityStatusEnum;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof H3J) && this.A00 == ((H3J) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
