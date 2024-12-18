package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.KnK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46825KnK {
    public static final C74P A00(Context context, UserSession userSession, GifUrlImpl gifUrlImpl, Integer num, String str) {
        C74V A01;
        boolean A1Y = AbstractC25229BEm.A1Y(context);
        if (num != null) {
            A01 = C74U.A00(AbstractC46673Kkq.A00(gifUrlImpl), num.intValue(), A1Y ? 1 : 0, -1);
        } else {
            A01 = C74U.A01(context, 0.711f, AbstractC46673Kkq.A00(gifUrlImpl), C7N9.A00(context, A1Y));
        }
        return new C74P(context, userSession, A01, gifUrlImpl, (GifUrlImpl) null, C05F.A01, str, AbstractC43594JPz.A04(context), AbstractC167007dF.A09(context, R.attr.stickerLoadingStartColor), AbstractC167007dF.A09(context, R.attr.stickerLoadingEndColor), A1Y);
    }
}
