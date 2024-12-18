package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nxc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54198Nxc {
    public static final ImmutableList A00(UserSession userSession) {
        ImmutableList.Builder builder = ImmutableList.builder();
        if (!C31238DoL.A00(userSession)) {
            builder.add((Object) EnumC53382NjX.A05);
        }
        return AbstractC31172DnG.A0K(builder);
    }
}
