package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.NFa */
/* loaded from: classes9.dex */
public final class C52362NFa extends IgFrameLayout {
    public final View A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final IgLinearLayout A03;
    public final IgSimpleImageView A04;
    public final IgSimpleImageView A05;
    public final IgSimpleImageView A06;
    public final IgTextView A07;
    public final IgTextView A08;
    public final EnumC53098NeB A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final InterfaceC09390do A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52362NFa(AbstractC59962oe abstractC59962oe, UserSession userSession, EnumC53098NeB enumC53098NeB, String str, String str2) {
        super(abstractC59962oe.requireContext());
        C14360o3.A0B(str2, 5);
        this.A02 = userSession;
        this.A01 = abstractC59962oe;
        this.A09 = enumC53098NeB;
        this.A0A = str;
        this.A0C = str2;
        View inflate = AbstractC25228BEl.A0P(this).inflate(R.layout.add_button_row, this);
        C14360o3.A07(inflate);
        this.A00 = inflate;
        this.A05 = AbstractC31176DnK.A0T(inflate, R.id.add_message_row_icon);
        this.A08 = AbstractC25231BEo.A0d(inflate, R.id.add_message_title_label);
        this.A03 = (IgLinearLayout) AbstractC166997dE.A0R(inflate, R.id.add_message_selected_layout);
        this.A07 = AbstractC25231BEo.A0d(inflate, R.id.add_message_selected_subtitle_label);
        this.A04 = AbstractC31176DnK.A0T(inflate, R.id.chevron_icon);
        this.A06 = AbstractC31176DnK.A0T(inflate, R.id.remove_icon);
        this.A0B = "add_button_row";
        B5y b5y = new B5y(this, 44);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new B5y(new B5y(abstractC59962oe, 41), 42));
        this.A0D = AbstractC25225BEi.A0a(new B5y(A00, 43), b5y, new C57256Pbe(42, null, A00), AbstractC25225BEi.A1D(C51019MgR.class));
    }

    public final C51019MgR getViewModel() {
        return (C51019MgR) this.A0D.getValue();
    }

    public static final /* synthetic */ C51019MgR A00(C52362NFa c52362NFa) {
        return c52362NFa.getViewModel();
    }

    public static final void A01(C52362NFa c52362NFa) {
        C51019MgR viewModel = c52362NFa.getViewModel();
        AbstractC166987dD.A1Z(new PYX(viewModel, null, 28), AbstractC141776au.A00(viewModel));
    }

    public final void A02() {
        C51019MgR viewModel = getViewModel();
        C2GT c2gt = viewModel.A00;
        AbstractC59962oe abstractC59962oe = this.A01;
        MY1.A00(abstractC59962oe.getViewLifecycleOwner(), c2gt, this, 9);
        JQ0.A11(abstractC59962oe, PZJ.A01(this, null, 49), viewModel.A06);
    }
}
