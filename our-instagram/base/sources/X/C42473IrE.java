package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.api.schemas.AppInstallCTAInfoIntf;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.IrE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42473IrE implements InterfaceC76813cT {
    @Override // X.InterfaceC76813cT
    public final CharSequence C5v(Context context, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(context, 0);
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        A01.append((CharSequence) context.getString(2131964553));
        return A01;
    }

    @Override // X.InterfaceC76813cT
    public final boolean EjR(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c38321qM, 0);
        AppInstallCTAInfoIntf AcI = c38321qM.A0C.AcI();
        if (AcI != null) {
            return AbstractC25225BEi.A1Y(AcI.Abn());
        }
        return false;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ Integer BEt() {
        return null;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ boolean Ejq() {
        return false;
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

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ CharSequence Brc(Context context, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        return null;
    }
}
