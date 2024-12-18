package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.V1j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67899V1j extends C53Z implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "QuickPromotionDebugPreviewMegaphoneFragment";
    public View A00;
    public C4NL A01;
    public QuickPromotionSlot A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "qp_debug_megaphone_preview";
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.setTitle(getString(2131958534));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int i2;
        int A02 = C0f9.A02(541886921);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31175DnJ.A07(layoutInflater, viewGroup, R.layout.quick_promotion_preview_megaphone_fragment, false);
        C27961Xa A00 = AbstractC54912fq.A00();
        requireContext();
        UserSession session = getSession();
        UserSession session2 = getSession();
        QuickPromotionSlot quickPromotionSlot = this.A02;
        if (quickPromotionSlot != null) {
            C66132yp A04 = A00.A04(this, session, new V9L(session2, this, quickPromotionSlot));
            C4NL c4nl = this.A01;
            if (c4nl != null) {
                C4NJ c4nj = (C4NJ) c4nl;
                String str = c4nj.A09.A00;
                C14360o3.A0A(c4nj);
                if (c4nj.A08.A00() != null) {
                    i2 = 3;
                } else {
                    i2 = AbstractC167007dF.A1M(MSV.A00(192).equals(str) ? 1 : 0);
                }
                View view = A04.getView(i2, null, viewGroup2, this.A01, null);
                this.A00 = view;
                if (view == null) {
                    C14360o3.A0F("megaphoneView");
                    throw C00O.createAndThrow();
                }
                viewGroup2.addView(view);
                C0f9.A09(1539221199, A02);
                return viewGroup2;
            }
            illegalStateException = new IllegalStateException("quickPromotion not set");
            i = 1352689425;
        } else {
            illegalStateException = new IllegalStateException("quickPromotionSlot not set");
            i = 331952951;
        }
        C0f9.A09(i, A02);
        throw illegalStateException;
    }
}
