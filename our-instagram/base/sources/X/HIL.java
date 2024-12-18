package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.widget.pdp.cta.CustomCTAButton;

/* loaded from: classes7.dex */
public final class HIL extends AbstractC66412zI {
    public final UserSession A00;
    public final C41622IbC A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i;
        C14360o3.A0B(viewGroup, 0);
        boolean A06 = C18U.A06(C06090Tz.A06, this.A00, 36313488926312480L);
        LayoutInflater from = LayoutInflater.from(AbstractC166997dE.A0L(viewGroup));
        if (A06) {
            i = R.layout.cta_section_swap_experiment;
        } else {
            i = R.layout.cta_section;
        }
        View A0D = AbstractC25227BEk.A0D(from, viewGroup, i, false);
        return AbstractC37300Gc1.A03(AbstractC37303Gc4.A0Q(A0D, new C38473Gvu(A0D)), "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.cta.CheckoutCTASectionViewBinder.Holder");
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C42305IoT c42305IoT = (C42305IoT) interfaceC66482zP;
        C38473Gvu c38473Gvu = (C38473Gvu) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c42305IoT, c38473Gvu);
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 2);
        C38636Gyd c38636Gyd = c42305IoT.A00;
        C38643Gyk c38643Gyk = c38636Gyd.A00;
        boolean z = c38636Gyd.A05;
        CustomCTAButton customCTAButton = c38473Gvu.A02;
        customCTAButton.setLoading(c38643Gyk.A07);
        customCTAButton.setEnabled(c38643Gyk.A06);
        String str = c38643Gyk.A02;
        customCTAButton.setText(str);
        View view = c38473Gvu.A00;
        AbstractC37302Gc3.A0o(view.getContext(), customCTAButton, str, 2131954439);
        customCTAButton.setStyle(c38643Gyk.A01);
        AbstractC13880nE.A0U(view, AbstractC166997dE.A05(view.getResources()));
        AbstractC37303Gc4.A0Z(customCTAButton, C06090Tz.A05, userSession);
        C0fQ.A00(new ViewOnClickListenerC77633dn(userSession, null, J86.A00, new JEZ(c38643Gyk, 41), z), customCTAButton);
        C38643Gyk c38643Gyk2 = c38636Gyd.A01;
        CustomCTAButton customCTAButton2 = c38473Gvu.A03;
        if (c38643Gyk2 != null) {
            if (customCTAButton2 != null) {
                customCTAButton2.setVisibility(0);
                customCTAButton2.setStyle(c38643Gyk2.A01);
                AbstractC13880nE.A0f(customCTAButton2, c38643Gyk2.A00);
                customCTAButton2.setText(c38643Gyk2.A02);
                customCTAButton2.setEnabled(c38643Gyk2.A06);
                ViewOnClickListenerC42033Ik2.A00(customCTAButton2, 27, c38643Gyk2);
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            AbstractC167007dF.A0x(customCTAButton2);
        }
        TextView textView = c38473Gvu.A01;
        if (textView != null) {
            CharSequence charSequence = c38636Gyd.A02;
            if (charSequence != null || (c38636Gyd.A07 && (charSequence = textView.getContext().getString(2131968947)) != null)) {
                textView.setVisibility(0);
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
            }
        }
        C41622IbC c41622IbC = this.A01;
        String str2 = c38643Gyk.A03;
        boolean A1T = AbstractC31175DnJ.A1T(A1a ? 1 : 0, customCTAButton, str2);
        C57112jm c57112jm = c41622IbC.A02;
        C63622uj c63622uj = c41622IbC.A03;
        AbstractC37304Gc5.A0u(customCTAButton, c57112jm, c63622uj, str2);
        if (c38643Gyk2 != null) {
            C14360o3.A0A(customCTAButton2);
            String str3 = c38643Gyk2.A03;
            C14360o3.A0B(customCTAButton2, A1T ? 1 : 0);
            C14360o3.A0B(str3, A1a ? 1 : 0);
            AbstractC37304Gc5.A0u(customCTAButton2, c57112jm, c63622uj, str3);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42305IoT.class;
    }

    public HIL(UserSession userSession, C41622IbC c41622IbC) {
        this.A00 = userSession;
        this.A01 = c41622IbC;
    }
}
