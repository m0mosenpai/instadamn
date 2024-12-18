package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* loaded from: classes11.dex */
public final class V0D extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "QuickPromotionDebugPreviewFloatingBannerFragment";
    public C4NJ A00;
    public C1571173q A01;
    public QuickPromotionSlot A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "qp_debug_floating_banner_preview";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A03.getValue();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.setTitle(getString(2131958533));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        int A02 = C0f9.A02(-774048738);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            i = bundle2.getInt("QP_SLOT");
        } else {
            i = 0;
        }
        this.A02 = QuickPromotionSlot.values()[i];
        C0f9.A09(-1167936093, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        String str;
        int A02 = C0f9.A02(708382353);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.quick_promotion_preview_floating_banner_fragment, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(1));
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        C4NJ c4nj = this.A00;
        if (c4nj == null) {
            i = -585075455;
        } else {
            AbstractC54912fq.A00();
            this.A01 = new C1571173q();
            UserSession userSession = (UserSession) this.A03.getValue();
            QuickPromotionSlot quickPromotionSlot = this.A02;
            if (quickPromotionSlot == null) {
                str = "slot";
            } else {
                V9K v9k = new V9K(userSession, this, quickPromotionSlot);
                C1571173q c1571173q = this.A01;
                if (c1571173q == null) {
                    str = "controller";
                } else {
                    c1571173q.A01(viewGroup2, c4nj, v9k, null);
                    i = -1417166429;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C0f9.A09(i, A02);
        return viewGroup2;
    }
}
