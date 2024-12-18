package X;

import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.NwX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54135NwX {
    public static final void A00(C47Z c47z, IllegalStateException illegalStateException) {
        UserStoryTarget userStoryTarget;
        String str;
        Iterator it = c47z.A0J(null, InterfaceC40171tl.class).iterator();
        String str2 = "[";
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                InterfaceC40171tl interfaceC40171tl = (InterfaceC40171tl) it.next();
                boolean z2 = interfaceC40171tl instanceof C122005fs;
                if (z2) {
                    userStoryTarget = ((C122005fs) interfaceC40171tl).A01();
                } else {
                    userStoryTarget = null;
                }
                Integer valueOf = Integer.valueOf(interfaceC40171tl.C3D());
                String str3 = "N/A";
                if (interfaceC40171tl.BuN() == null) {
                    str = "N/A";
                } else {
                    ShareType BuN = interfaceC40171tl.BuN();
                    C14360o3.A0A(BuN);
                    str = BuN.name();
                }
                Boolean valueOf2 = Boolean.valueOf(z2);
                if (userStoryTarget == null) {
                    z = false;
                }
                Boolean valueOf3 = Boolean.valueOf(z);
                if (userStoryTarget != null) {
                    str3 = userStoryTarget.CBn();
                }
                str2 = AnonymousClass001.A0R(str2, AbstractC166997dE.A0z("{subShareId: %s, shareType: %s, isMultiConfigStoryTarget: %s, hasUserStoryTarget: %s, UserStoryTargetType: %s}", Arrays.copyOf(new Object[]{valueOf, str, valueOf2, valueOf3, str3}, 5)));
            } else {
                C0w9.A03("LegacyReelShareMapper#mapUserReelShares", AbstractC166997dE.A0z("LegacyReelShareMapper#mapUserReelShares Exception: %s, ShareTargetList for PendingMedia: %s", MSX.A1b(illegalStateException.getMessage(), AnonymousClass001.A0C(str2, ']'), 2)));
                return;
            }
        }
    }
}
