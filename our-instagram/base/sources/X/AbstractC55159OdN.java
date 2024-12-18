package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.base.VideoSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OdN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55159OdN {
    public static final ImageUrl A00(C47Z c47z) {
        String str = c47z.A33;
        if (str == null) {
            return null;
        }
        EnumC40111tc enumC40111tc = c47z.A1G;
        int ordinal = enumC40111tc.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            throw AbstractC43594JPz.A0o(enumC40111tc, "Unexpected media type: ", AbstractC166987dD.A1C());
        }
        return AbstractC81033jX.A01(AbstractC166987dD.A11(str));
    }

    public static final String A02(AnonymousClass841 anonymousClass841, C47Z c47z) {
        EnumC40111tc enumC40111tc = c47z.A1G;
        int ordinal = enumC40111tc.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                for (VideoSession videoSession : anonymousClass841.FDe()) {
                    String str = videoSession.A0G;
                    if (str != null && str.equals(c47z.A35)) {
                        return videoSession.A0H;
                    }
                }
                return null;
            }
            throw AbstractC43594JPz.A0o(enumC40111tc, "Unexpected media type: ", AbstractC166987dD.A1C());
        }
        return null;
    }

    public static final ExtendedImageUrl A01(Context context, C38321qM c38321qM) {
        int ordinal = c38321qM.BRp().ordinal();
        if (ordinal != 0 && ordinal != 1) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Unexpected media type: ");
            throw AbstractC166987dD.A14(AbstractC166997dE.A0v(c38321qM.BRp(), A1C));
        }
        return c38321qM.A1q(context);
    }

    public static final String A03(C38321qM c38321qM) {
        int ordinal = c38321qM.BRp().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return c38321qM.A2a();
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Unexpected media type: ");
            throw AbstractC166987dD.A14(AbstractC166997dE.A0v(c38321qM.BRp(), A1C));
        }
        return null;
    }

    public static final ArrayList A04(C47Z c47z) {
        String str;
        ArrayList A1E = AbstractC166987dD.A1E();
        BrandedContentTag A07 = c47z.A07();
        if (A07 != null && (str = A07.A01) != null) {
            A1E.add(str);
        }
        List list = c47z.A4C;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = MSW.A0n(it).A01;
                if (str2 != null) {
                    A1E.add(str2);
                }
            }
        }
        if (A1E.isEmpty()) {
            return null;
        }
        return A1E;
    }
}
