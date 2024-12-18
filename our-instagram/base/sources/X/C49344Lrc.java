package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.Lrc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49344Lrc implements MQ6 {
    @Override // X.MQ6
    public final boolean AFU(Context context, UserSession userSession, C45093JxN c45093JxN) {
        C14360o3.A0B(c45093JxN, 1);
        return AbstractC167007dF.A1W(AbstractC50710Ma7.A00.A02(c45093JxN.A0P));
    }

    @Override // X.MQ6
    public final void ADY(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C45093JxN c45093JxN, C49574LvT c49574LvT, C47424KxF c47424KxF) {
        AbstractC167027dH.A13(c47424KxF, c45093JxN, userSession);
        MusicOverlayStickerModel A02 = AbstractC50710Ma7.A00.A02(c45093JxN.A0P);
        if (A02 != null) {
            C92594Ct.A04(userSession, A02, c47424KxF.A00.A0K);
        }
    }
}
