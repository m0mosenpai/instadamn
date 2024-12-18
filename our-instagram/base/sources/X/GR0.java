package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.BonusPromoDialogAudienceType;
import com.instagram.api.schemas.BonusPromoDialogType;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GR0 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ E6I A02;
    public final /* synthetic */ BonusPromoDialogType A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C56135Ovv A05;

    public GR0(Context context, FragmentActivity fragmentActivity, E6I e6i, BonusPromoDialogType bonusPromoDialogType, UserSession userSession, C56135Ovv c56135Ovv) {
        this.A00 = context;
        this.A02 = e6i;
        this.A05 = c56135Ovv;
        this.A03 = bonusPromoDialogType;
        this.A04 = userSession;
        this.A01 = fragmentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00;
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        AbstractC31173DnH.A15(context, A0I, R.drawable.ig_illustrations_illo_bonuses_refresh);
        A0I.A0A(2131963873);
        A0I.A09(2131963870);
        E6I e6i = this.A02;
        int i = 2131963869;
        if (e6i.A00 == BonusPromoDialogAudienceType.A04) {
            i = 2131963872;
        }
        C56135Ovv c56135Ovv = this.A05;
        BonusPromoDialogType bonusPromoDialogType = this.A03;
        UserSession userSession = this.A04;
        A0I.A0J(new DialogInterfaceOnClickListenerC35359Fia(5, this.A01, e6i, bonusPromoDialogType, c56135Ovv, userSession), i);
        A0I.A0I(new DialogInterfaceOnClickListenerC35448Fk5(14, bonusPromoDialogType, userSession, e6i, c56135Ovv), 2131963871);
        A0I.A0h(new DialogInterfaceOnShowListenerC35466FkN(e6i, bonusPromoDialogType, userSession, c56135Ovv));
        A0I.A0C(new DialogInterfaceOnCancelListenerC35298FhX(e6i, bonusPromoDialogType, userSession, c56135Ovv));
        AbstractC166987dD.A1W(A0I);
    }
}
