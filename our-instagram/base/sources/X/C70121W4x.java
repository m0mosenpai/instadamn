package X;

import com.instagram.business.promote.model.PromoteAudienceInfo;
import java.util.Arrays;

/* renamed from: X.W4x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70121W4x {
    public static final C70121W4x A01 = new C70121W4x(null);
    public final PromoteAudienceInfo A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            C70121W4x c70121W4x = (C70121W4x) obj;
            PromoteAudienceInfo promoteAudienceInfo = this.A00;
            if (promoteAudienceInfo == null || !promoteAudienceInfo.equals(c70121W4x.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    public C70121W4x(PromoteAudienceInfo promoteAudienceInfo) {
        this.A00 = promoteAudienceInfo;
    }
}
