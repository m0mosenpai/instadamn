package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.facebook.R;
import com.instagram.appreciation.funding.AppreciationBuyAndSendViewModel;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes8.dex */
public final class KC4 extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "AppreciationBuyAndSendFragment";
    public Space A00;
    public C44360Jiz A01;
    public MO5 A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgImageView A06;
    public InterfaceC56392iX A07;
    public IgdsBottomButtonLayout A08;
    public SpinnerImageView A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "appreciation_buy_and_send";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A09 = (SpinnerImageView) view.requireViewById(R.id.loading);
        this.A06 = AbstractC31172DnG.A0Z(view, R.id.gift_image);
        this.A05 = AbstractC31172DnG.A0X(view, R.id.title);
        this.A03 = AbstractC31172DnG.A0X(view, R.id.current_balance);
        this.A04 = AbstractC31172DnG.A0X(view, R.id.explanation);
        this.A08 = AbstractC31172DnG.A0j(view, R.id.buy_and_send_button);
        this.A00 = (Space) view.requireViewById(R.id.space_terms);
        this.A07 = AbstractC37301Gc2.A0D(view, R.id.buy_send_banner_stub);
        Space space = this.A00;
        if (space == null) {
            C14360o3.A0F("termsPlaceHolder");
            throw C00O.createAndThrow();
        }
        space.getLayoutParams().height = (int) (AbstractC13880nE.A03(requireContext(), 12.0f) * 1.12f * 2.0f);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        MCQ mcq = new MCQ(viewLifecycleOwner, c07s, this, null, 10);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, mcq, A00);
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A0B);
        AbstractC23641Du.A05(anonymousClass191, new MCD(A0Z, null, 36), AbstractC141776au.A00(A0Z));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AppreciationBuyAndSendViewModel appreciationBuyAndSendViewModel = (AppreciationBuyAndSendViewModel) this.A0B.getValue();
        appreciationBuyAndSendViewModel.A03.A03(appreciationBuyAndSendViewModel.A00, C05F.A01);
        return false;
    }

    public KC4() {
        C50250MHf A01 = C50250MHf.A01(this, 10);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C50250MHf.A01(C50250MHf.A01(this, 7), 8));
        this.A0B = AbstractC25225BEi.A0a(C50250MHf.A01(A00, 9), A01, new C29897DGl(33, null, A00), AbstractC25225BEi.A1D(AppreciationBuyAndSendViewModel.class));
        this.A0A = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1478549947);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_appreciation_buy_and_send, viewGroup, false);
        C0f9.A09(-1622974445, A02);
        return inflate;
    }
}
