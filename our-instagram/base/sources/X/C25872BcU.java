package X;

import com.instagram.api.schemas.ChallengeButtonInfo;
import com.instagram.api.schemas.ChallengeName;
import com.instagram.api.schemas.ChallengeState;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;

/* renamed from: X.BcU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25872BcU extends AbstractC52922bZ {
    public final long A00;
    public final ChallengeState A01;
    public final UserSession A02;
    public final CUN A03;
    public final String A04;
    public final InterfaceC06180Ui A05;
    public final InterfaceC06180Ui A06;
    public final InterfaceC15070pN A07;
    public final InterfaceC15070pN A08;
    public final ChallengeName A09;

    public C25872BcU(ChallengeName challengeName, ChallengeState challengeState, UserSession userSession, CUN cun, String str, long j) {
        AbstractC25233BEq.A0w(1, userSession, challengeName, challengeState);
        this.A02 = userSession;
        this.A00 = j;
        this.A09 = challengeName;
        this.A01 = challengeState;
        this.A04 = str;
        this.A03 = cun;
        Integer num = C05F.A00;
        AnonymousClass057 A00 = C10M.A00(num, 1, 0);
        this.A06 = A00;
        this.A08 = new C06160Ug(null, A00);
        AnonymousClass057 A002 = C10M.A00(num, 0, 0);
        this.A05 = A002;
        this.A07 = new C06160Ug(null, A002);
        C141796aw A003 = AbstractC141776au.A00(this);
        AbstractC23641Du.A03(num, AnonymousClass191.A00, new D53(this, null, 7), A003);
    }

    public static final void A01(C25872BcU c25872BcU, String str) {
        C28458ChA c28458ChA = C28458ChA.A00;
        UserSession userSession = c25872BcU.A02;
        String str2 = c25872BcU.A04;
        List A1J = AbstractC166987dD.A1J(Long.valueOf(c25872BcU.A00));
        String obj = c25872BcU.A09.toString();
        c28458ChA.A03(userSession, null, "challenge_details", "challenges_fetch", str2, null, str, null, A1J, AbstractC166987dD.A1J(obj), AbstractC167007dF.A0n(obj, AbstractC167007dF.A0n(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, c25872BcU.A01.toString()).toString()), null);
    }

    public static final void A00(ChallengeButtonInfo challengeButtonInfo, C25872BcU c25872BcU) {
        InterfaceC16620sF d53;
        int i;
        int ordinal = challengeButtonInfo.Aiw().ordinal();
        C141796aw A00 = AbstractC141776au.A00(c25872BcU);
        switch (ordinal) {
            case 1:
                i = 26;
                d53 = D4z.A02(c25872BcU, null, i);
                break;
            case 2:
                i = 22;
                d53 = D4z.A02(c25872BcU, null, i);
                break;
            case 3:
                i = 23;
                d53 = D4z.A02(c25872BcU, null, i);
                break;
            case 4:
                d53 = new D53(challengeButtonInfo, c25872BcU, null, 8);
                break;
            case 5:
                i = 21;
                d53 = D4z.A02(c25872BcU, null, i);
                break;
            case 6:
            default:
                i = 24;
                d53 = D4z.A02(c25872BcU, null, i);
                break;
            case 7:
                d53 = new D53(c25872BcU, null, 9);
                break;
        }
        AbstractC166987dD.A1Z(d53, A00);
    }
}
