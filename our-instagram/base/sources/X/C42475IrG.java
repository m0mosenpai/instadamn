package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.text.SpannedString;
import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import java.util.List;

/* renamed from: X.IrG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42475IrG implements InterfaceC76813cT {
    @Override // X.InterfaceC76813cT
    public final CharSequence C5v(Context context, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        FundraiserCampaignTypeEnum B9C;
        Resources resources;
        int i;
        String[] strArr;
        String fundraiserTitle;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c38321qM, 1);
        InterfaceC39031rc B99 = c38321qM.A0C.B99();
        if (B99 != null && (B9C = B99.B9C()) != null) {
            int ordinal = B9C.ordinal();
            if (ordinal != 11) {
                if (ordinal == 9) {
                    resources = context.getResources();
                    i = 2131962459;
                    strArr = new String[1];
                    fundraiserTitle = B99.getBeneficiaryName();
                }
            } else {
                resources = context.getResources();
                i = 2131962476;
                if (AbstractC166997dE.A1Z(B99.BwP(), true)) {
                    i = 2131962525;
                }
                strArr = new String[1];
                fundraiserTitle = B99.getFundraiserTitle();
            }
            strArr[0] = fundraiserTitle;
            Spanned A01 = AbstractC07900bA.A01(resources, strArr, i);
            C14360o3.A0A(A01);
            return A01;
        }
        return new SpannedString("");
    }

    @Override // X.InterfaceC76813cT
    public final boolean EjR(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        return true;
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
