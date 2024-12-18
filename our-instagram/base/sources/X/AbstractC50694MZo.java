package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* renamed from: X.MZo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50694MZo {
    public static final boolean A00(Context context, C22P c22p, UserSession userSession, C1810981l c1810981l, PromptStickerModel promptStickerModel) {
        int A06 = AbstractC167007dF.A06(0, userSession, c22p);
        if (AbstractC166997dE.A0t(userSession) == null) {
            AnonymousClass229.A00(context, userSession, null, null, null, null).A18(c22p, EnumC50631MWs.A0J, c1810981l, null, promptStickerModel, null, C56D.A00(context), A06);
            return true;
        }
        return false;
    }
}
