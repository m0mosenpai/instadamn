package X;

import com.instagram.api.schemas.AchievementButtonInfo;
import com.instagram.api.schemas.AchievementIntf;
import com.instagram.api.schemas.EarnedOnMediaState;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.BcS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25871BcS extends AbstractC52922bZ {
    public final UserSession A00;
    public final CUN A01;
    public final String A02;
    public final String A03;
    public final InterfaceC06180Ui A04;
    public final InterfaceC06180Ui A05;
    public final InterfaceC15070pN A06;
    public final InterfaceC15070pN A07;
    public final InterfaceC11380iw A08;

    public C25871BcS(InterfaceC11380iw interfaceC11380iw, UserSession userSession, CUN cun, String str, String str2) {
        AbstractC25233BEq.A0v(1, userSession, interfaceC11380iw, str);
        this.A00 = userSession;
        this.A08 = interfaceC11380iw;
        this.A02 = str;
        this.A01 = cun;
        this.A03 = str2;
        Integer num = C05F.A00;
        AnonymousClass057 A00 = C10M.A00(num, 1, 0);
        this.A05 = A00;
        this.A07 = new C06160Ug(null, A00);
        AnonymousClass057 A002 = C10M.A00(num, 1, 0);
        this.A04 = A002;
        this.A06 = new C06160Ug(null, A002);
    }

    public static final void A00(C25871BcS c25871BcS, String str, String str2, String str3, String str4, String str5, List list, List list2) {
        C141796aw A00;
        InterfaceC16620sF A02;
        if (AbstractC166987dD.A1b(list) && AbstractC001900j.A0a(str, "instagram://view-grouped-achievement", false)) {
            A00 = AbstractC141776au.A00(c25871BcS);
            A02 = new C50122MBw(list2, list, c25871BcS, null, 21);
        } else if (AbstractC001900j.A0a(str, AbstractC111324zv.A00(1015), false)) {
            A00 = AbstractC141776au.A00(c25871BcS);
            A02 = D4z.A02(c25871BcS, null, 12);
        } else if (AbstractC001900j.A0a(str, "instagram://share-achievement", false) && str3 != null) {
            FVK.A01(c25871BcS.A00, C1GJ.A01(), new C29282Cvd(c25871BcS, str4, str5, str2), str3);
            return;
        } else {
            if (str == null) {
                return;
            }
            AbstractC166987dD.A1Z(new PYc(c25871BcS, str, null, 7), AbstractC141776au.A00(c25871BcS));
            return;
        }
        AbstractC166987dD.A1Z(A02, A00);
    }

    public final void A01(MUD mud, C26022BfB c26022BfB, String str) {
        LinkedHashMap A0p = AbstractC25233BEq.A0p("button_text", mud.A01, AbstractC166987dD.A1L("button_url", mud.A02));
        C28458ChA c28458ChA = C28458ChA.A00;
        UserSession userSession = this.A00;
        String str2 = this.A03;
        C51743MtS c51743MtS = c26022BfB.A03;
        c28458ChA.A08(userSession, "achievement_details", str, str2, c51743MtS != null ? c51743MtS.A04 : null, AbstractC166987dD.A1J(this.A02), null, null, A0p);
    }

    public final void A03(EarnedOnMediaState earnedOnMediaState, String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        FVK.A01(this.A00, C1GJ.A01(), new C29285Cvg(earnedOnMediaState, this, str, str2, str3), str);
    }

    public final void A02(AchievementButtonInfo achievementButtonInfo, AchievementIntf achievementIntf, String str) {
        C28458ChA.A00.A08(this.A00, "achievement_details", str, this.A03, achievementIntf.B0G(), AbstractC166987dD.A1J(this.A02), AbstractC166987dD.A1J(achievementIntf), null, AbstractC25233BEq.A0p("button_text", achievementButtonInfo.Aj7(), AbstractC166987dD.A1L("button_url", achievementButtonInfo.Aw9())));
    }
}
