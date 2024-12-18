package X;

import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mes, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50923Mes extends AbstractC52922bZ {
    public final int A00;
    public final UserMonetizationProductType A01;
    public final String A02;
    public final C0UO A03;
    public final UserSession A04;
    public final C05A A05;

    public C50923Mes(UserMonetizationProductType userMonetizationProductType, UserSession userSession, String str) {
        int i;
        Object value;
        MUP mup;
        int A06 = AbstractC167007dF.A06(1, userSession, userMonetizationProductType);
        this.A04 = userSession;
        this.A01 = userMonetizationProductType;
        this.A02 = str;
        if (userMonetizationProductType == UserMonetizationProductType.A0D) {
            i = 2131963823;
            if (AbstractC54069NvT.A00(userSession)) {
                i = 2131963865;
            }
        } else {
            i = 2131963787;
        }
        this.A00 = i;
        C008002u A1H = AbstractC25225BEi.A1H(new MUP(2131969340, A06, false, false));
        this.A05 = A1H;
        this.A03 = AbstractC208910l.A02(A1H);
        do {
            value = A1H.getValue();
            if (!C14360o3.A0K(MonetizationEligibilityDecision.A05.A00, this.A02) && !C14360o3.A0K(MonetizationEligibilityDecision.A04.A00, this.A02)) {
                mup = new MUP(2131969340, A06, false, true);
            } else {
                mup = new MUP(2131969339, A06, true, false);
            }
        } while (!A1H.AIi(value, mup));
    }
}
