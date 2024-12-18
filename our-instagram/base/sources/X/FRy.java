package X;

import com.instagram.api.schemas.BonusPromoDialogAudienceType;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class FRy {
    /* JADX WARN: Type inference failed for: r5v0, types: [X.EAp, X.1um, X.1ul] */
    public static C32142EAp parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("active_deal_id".equals(A0s)) {
                    c40791um.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("creator_audience_type".equals(A0s)) {
                    BonusPromoDialogAudienceType bonusPromoDialogAudienceType = (BonusPromoDialogAudienceType) BonusPromoDialogAudienceType.A01.get(AbstractC167017dG.A0m(c16l));
                    if (bonusPromoDialogAudienceType == null) {
                        bonusPromoDialogAudienceType = BonusPromoDialogAudienceType.A06;
                    }
                    c40791um.A00 = bonusPromoDialogAudienceType;
                } else if ("deal_template_id".equals(A0s)) {
                    c40791um.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("should_show_dialog".equals(A0s)) {
                    c40791um.A02 = AbstractC166997dE.A0d(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            c40791um.A01 = new E6I(c40791um.A00, c40791um.A03, c40791um.A04, AbstractC31172DnG.A1b(c40791um.A02));
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
