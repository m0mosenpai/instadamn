package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.achievements.modules.models.Badge;
import java.util.List;

/* renamed from: X.DcF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30532DcF extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ InterfaceC16660sJ A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30532DcF(UserSession userSession, List list, InterfaceC16660sJ interfaceC16660sJ, int i) {
        super(3);
        this.A02 = list;
        this.A00 = i;
        this.A01 = userSession;
        this.A03 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl c5Tl = (C5Tl) obj2;
        if (AbstractC25228BEl.A0E(obj3) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(962716395, "com.instagram.creator.achievements.modules.views.EarnedAchievementsRow.<anonymous>.<anonymous>.<anonymous> (EarnedAchievementsRow.kt:47)");
            }
            List list = this.A02;
            int i = this.A00;
            Badge badge = (Badge) AbstractC001800i.A0O(list, i);
            if (badge != null) {
                UserSession userSession = this.A01;
                C30183DRo c30183DRo = new C30183DRo(33, this.A03, badge);
                boolean z = true;
                boolean A1N = AbstractC167007dF.A1N(i);
                if (i != list.size() - 1) {
                    z = false;
                }
                AbstractC27649CHu.A00(c5Tl, null, userSession, badge, c30183DRo, 72, 8, A1N, z);
            }
            if (C0fH.A02()) {
                C0fH.A00(-1812436966);
            }
        }
        return C0eB.A00;
    }
}
