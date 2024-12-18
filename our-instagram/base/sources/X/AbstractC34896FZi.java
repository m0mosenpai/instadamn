package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* renamed from: X.FZi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34896FZi {
    public static C67027UfE A00;

    public static void A01(C1P1 c1p1, UserSession userSession, String str) {
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A04("identity_id", str);
        AbstractC40691uc.A01(userSession).A06(new PandoGraphQLRequest(AbstractC25227BEk.A0U(AbstractC167007dF.A1W(str)), "IGFxImBusinessReminderQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C67027UfE.class, false, null, 0, null, AbstractC111324zv.A00(4043), AbstractC166987dD.A1E()).setMaxToleratedCacheAgeMs(0L), c1p1);
    }

    public static C67542Ung A00() {
        C67027UfE c67027UfE = A00;
        if (c67027UfE != null && c67027UfE.A02(C67543Unh.class, "fx_identity_management", 139747998) != null) {
            return ((C67543Unh) c67027UfE.A02(C67543Unh.class, "fx_identity_management", 139747998)).A0E();
        }
        return null;
    }
}
