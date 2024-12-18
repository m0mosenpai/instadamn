package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.visual.model.DirectVisualMessageItemModel;

/* renamed from: X.Lrd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49345Lrd implements MQ6 {
    @Override // X.MQ6
    public final boolean AFU(Context context, UserSession userSession, C45093JxN c45093JxN) {
        String str;
        C14360o3.A0B(c45093JxN, 1);
        DirectVisualMessageItemModel.MediaFields.RemixMedia remixMedia = c45093JxN.A08;
        if (remixMedia != null && (str = remixMedia.A02) != null && str.length() != 0) {
            return true;
        }
        return false;
    }

    @Override // X.MQ6
    public final void ADY(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C45093JxN c45093JxN, C49574LvT c49574LvT, C47424KxF c47424KxF) {
        AbstractC167017dG.A1Q(c47424KxF, userSession);
        AbstractC47005KqO.A00(userSession, c47424KxF.A00.A0I);
    }
}
