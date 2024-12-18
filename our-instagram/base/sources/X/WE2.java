package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* loaded from: classes11.dex */
public abstract class WE2 {
    public static Bundle A00(Hashtag hashtag, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(AbstractC111324zv.A00(156), hashtag);
        bundle.putString(AbstractC111324zv.A00(640), str);
        bundle.putString("HashtagFeedFragment.ARGUMENT_ENTRY_TRIGGER", str2);
        return bundle;
    }

    public static void A03(C19280xC c19280xC, Hashtag hashtag) {
        c19280xC.A07(AbstractC129005sL.A02, hashtag.getId());
        c19280xC.A07(AbstractC129005sL.A03, hashtag.getName());
        c19280xC.A07(AbstractC129005sL.A01, AbstractC1120253r.A02(hashtag));
    }

    public static Fragment A01(UserSession userSession) {
        if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36322662976334218L)) {
            return new V0V();
        }
        return new V1R();
    }

    public static Fragment A02(UserSession userSession, Hashtag hashtag, String str, String str2) {
        Fragment A01 = A01(userSession);
        A01.setArguments(A00(hashtag, str, str2));
        return A01;
    }
}
