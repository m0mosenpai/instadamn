package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.textcell.IgdsFooterCell;

/* renamed from: X.Bsd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26815Bsd extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CreatorAITermsNuxFragment";
    public InterfaceC56362iU A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final String A07;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        this.A00 = interfaceC56362iU;
        interfaceC56362iU.ETp(true);
        C3LO c3lo = new C3LO();
        c3lo.A0C = 2131954754;
        interfaceC56362iU.A8u(ViewOnClickListenerC28667ClF.A00(c3lo, this, 43));
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C28171CbI c28171CbI = (C28171CbI) this.A04.getValue();
        String A15 = AbstractC25225BEi.A15(this.A02);
        String A152 = AbstractC25225BEi.A15(this.A01);
        boolean A1Z = AbstractC167007dF.A1Z(this.A03);
        AbstractC167007dF.A1K(A15, A152);
        C28171CbI.A00(c28171CbI, "view_fan_onboarding_nux", A15, A152, A1Z);
        IgdsHeadline igdsHeadline = (IgdsHeadline) view.findViewById(R.id.creator_ai_nux_headline);
        IgdsBulletCell igdsBulletCell = (IgdsBulletCell) view.findViewById(R.id.creator_ai_nux_bullet_one);
        IgdsBulletCell igdsBulletCell2 = (IgdsBulletCell) view.findViewById(R.id.creator_ai_nux_bullet_two);
        IgdsBulletCell igdsBulletCell3 = (IgdsBulletCell) view.findViewById(R.id.creator_ai_nux_bullet_three);
        IgdsFooterCell igdsFooterCell = (IgdsFooterCell) view.findViewById(R.id.creator_ai_terms_footer);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view.findViewById(R.id.creator_ai_nux_bottom_button_layout);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new JQA(view, c07s, viewLifecycleOwner, this, igdsBottomButtonLayout, igdsBulletCell, igdsBulletCell2, igdsBulletCell3, igdsHeadline, igdsFooterCell, null), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C28171CbI c28171CbI = (C28171CbI) this.A04.getValue();
        String A15 = AbstractC25225BEi.A15(this.A02);
        String A152 = AbstractC25225BEi.A15(this.A01);
        boolean A1Z = AbstractC167007dF.A1Z(this.A03);
        AbstractC167017dG.A1N(A15, A152);
        C28171CbI.A00(c28171CbI, "cancel_fan_onboarding_nux", A15, A152, A1Z);
        ((C25848Bc3) this.A06.getValue()).A00();
        return false;
    }

    public C26815Bsd() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A01 = DH6.A01(this, "creator_ai_creator_igid", enumC09460dv, 30);
        this.A02 = DH6.A01(this, "creator_ai_entry_point_extra", enumC09460dv, 31);
        this.A03 = DH6.A01(this, "creator_ai_is_new_thread_extra", enumC09460dv, 32);
        this.A05 = AbstractC60492pY.A02(this);
        this.A04 = C29911DGz.A00(this, 16);
        C29911DGz A01 = C29911DGz.A01(this, 20);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, C29911DGz.A01(C29911DGz.A01(this, 17), 18));
        this.A06 = AbstractC25225BEi.A0a(C29911DGz.A01(A00, 19), A01, new C29894DGi(18, A00, null), AbstractC25225BEi.A1D(C25848Bc3.class));
        this.A07 = "creator_ai_nux";
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A07;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(557987280);
        super.onCreate(bundle);
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A06);
        C141796aw A00 = AbstractC141776au.A00(A0Z);
        D4z A022 = D4z.A02(A0Z, null, 27);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, D4z.A02(A0Z, null, 28), AbstractC25235BEs.A0W(A0Z, anonymousClass191, A022, A00));
        C0f9.A09(-2004017514, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2021020787);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.creator_ai_in_thread_nux, false);
        C0f9.A09(-807781549, A02);
        return A0R;
    }
}
