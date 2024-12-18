package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ActionButtonPartnerType;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.business.fragment.SupportLinksFragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Locale;

/* renamed from: X.EyK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33918EyK {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String A0e = AbstractC31177DnL.A0e(c6fw, 1);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        UserSession A0S = AbstractC31177DnL.A0S(c6fq);
        User A10 = AbstractC166987dD.A10(A0S);
        if (A10.A03.Bxx() == null) {
            ActionButtonPartnerType actionButtonPartnerType = ActionButtonPartnerType.A06;
            String A00 = AbstractC111324zv.A00(1639);
            A10.A03.EeW(new C111184zg(new C111184zg(actionButtonPartnerType, "0", null, null, null, null, A00, "").A00, "0", null, "", SMBPartnerType.A07.A00, null, A00, ""));
            AbstractC31172DnG.A1R(A0S, A10);
        }
        Locale locale = Locale.ROOT;
        String A16 = AbstractC31172DnG.A16(locale, A0e);
        if (AbstractC31180DnO.A1Z("STICKER", A16, locale)) {
            A04.finish();
            return null;
        }
        if (AbstractC31180DnO.A1Z("PROFILE", A16, locale)) {
            AbstractC10360h2 A05 = C6BQ.A05(c6fq);
            if (A05 != null && A05.A0L() > 0 && !A05.A0G) {
                A05.A0b();
            } else {
                A04.onBackPressed();
            }
            AbstractC25230BEn.A15(1, A04, A0S);
            if (C35226FgJ.A02(A04)) {
                AbstractC25225BEi.A0r(A04, A0S).A0G(SupportLinksFragment.A06, 1);
                C9GR.A09(A04, C55218Oeh.A01(A04, AbstractC166997dE.A0p(A04, 2131965005)));
                return null;
            }
        } else if (!AbstractC31180DnO.A1Z("FLAGGED_FORM", A16, locale)) {
            return null;
        }
        C14360o3.A0B(A04, 0);
        C35226FgJ.A00(A04);
        AbstractC25233BEq.A1F(AbstractC31173DnH.A0X(C55218Oeh.A01(A04, AbstractC166997dE.A0p(A04, 2131965005))));
        return null;
    }
}
