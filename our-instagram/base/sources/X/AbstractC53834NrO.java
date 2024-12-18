package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;

/* renamed from: X.NrO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53834NrO {
    public static final Object A00(C6FQ c6fq) {
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        InterfaceC19610xo ARD = AbstractC149676oK.A00(A0W).A01.ARD();
        ARD.E77("should_show_exclusive_story_button", true);
        ARD.apply();
        MonetizationRepository A00 = AbstractC63302u8.A00(A0W);
        A00.A0B.put(UserMonetizationProductType.A0C, true);
        MSY.A1M(A0W, AbstractC24771Iv.A00(), 8);
        AbstractC31176DnK.A0w(A04, AbstractC166987dD.A0b(), A0W, AbstractC111324zv.A00(51));
        return null;
    }
}
