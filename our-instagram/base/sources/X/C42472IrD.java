package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.IrD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42472IrD implements InterfaceC76813cT {
    @Override // X.InterfaceC76813cT
    public final CharSequence Brc(Context context, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        Integer BF1;
        AbstractC167007dF.A1E(context, 0, c38321qM);
        InterfaceC43580JMo CHL = c38321qM.A0C.CHL();
        if (CHL == null || (BF1 = CHL.BF1()) == null || BF1.intValue() <= 0) {
            return null;
        }
        return AbstractC167007dF.A0f(context, BF1, 2131963684);
    }

    @Override // X.InterfaceC76813cT
    public final CharSequence C5v(Context context, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(context, 0);
        return AbstractC166997dE.A0p(context, 2131963683);
    }

    @Override // X.InterfaceC76813cT
    public final boolean EjR(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        return true;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ boolean Ejq() {
        return false;
    }

    @Override // X.InterfaceC76813cT
    public final Integer BEt() {
        return Integer.valueOf(R.drawable.instagram_app_horizon_pano_filled_16);
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ String BTZ(Context context, C38321qM c38321qM, C75113Zb c75113Zb) {
        return null;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ List Bre(C38321qM c38321qM, C75113Zb c75113Zb) {
        return null;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ boolean EjP(UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        return false;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ boolean EjQ(UserSession userSession, C38321qM c38321qM) {
        return false;
    }
}
