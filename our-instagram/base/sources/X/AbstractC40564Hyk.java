package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Hyk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40564Hyk {
    public static final void A00(C19280xC c19280xC, UserSession userSession, C38321qM c38321qM, int i, int i2, boolean z) {
        if (z) {
            c19280xC.A0C("action", c38321qM.A0C.AZ3());
            c19280xC.A0C("tracking_token", AbstractC41071vF.A0F(userSession, c38321qM));
            c19280xC.A0C("ad_id", AbstractC41071vF.A07(userSession, c38321qM));
        }
        if (c38321qM.A5M() && i != -1) {
            c19280xC.A08(Integer.valueOf(i), "carousel_index");
            C38321qM A1e = c38321qM.A1e(0);
            if (A1e != null) {
                c19280xC.A0C("carousel_cover_media_id", A1e.getId());
                C38321qM A1e2 = c38321qM.A1e(i);
                if (A1e2 != null) {
                    c19280xC.A0C("carousel_media_id", A1e2.getId());
                    c19280xC.A0C("main_feed_carousel_starting_media_id", c38321qM.A0C.BPW());
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        List CAf = c38321qM.A0C.CAf();
        if (CAf != null && !CAf.isEmpty() && AbstractC75373a4.A07(userSession)) {
            c19280xC.A0C("translated_language", ((InterfaceC105674pe) CAf.get(0)).BL7());
            c19280xC.A0D("translation_delivery_method", AbstractC166987dD.A1J(EnumC37904Gm1.CLOSED_CAPTION.toString()));
        }
        if (i2 >= 0) {
            c19280xC.A08(Integer.valueOf(i2), "m_ix");
        }
    }
}
