package X;

import androidx.fragment.app.Fragment;
import com.instagram.nux.activity.SignedOutFragmentActivity;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.user.model.User;

/* renamed from: X.Eii, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33085Eii extends AbstractC32549EUz {
    public final /* synthetic */ C6FQ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33085Eii(Fragment fragment, C6FQ c6fq, C07270a1 c07270a1, RegFlowExtras regFlowExtras, Object obj) {
        super(fragment, c07270a1, null, regFlowExtras, (EnumC33445EqI) obj, null, null, false, false, true);
        this.A00 = c6fq;
    }

    @Override // X.AbstractC32549EUz
    public final void A03(User user) {
        super.A03(user);
        C1UC A04 = C6BQ.A04(this.A00);
        if (A04 instanceof InterfaceC37106GWr) {
            ((SignedOutFragmentActivity) ((InterfaceC37106GWr) A04)).A0A = true;
        }
    }
}
