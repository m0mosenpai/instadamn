package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.appreciation.funding.AppreciationFundingViewModel;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Collection;
import java.util.List;

/* renamed from: X.KDm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45521KDm extends AbstractC43842Ja5 implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "AppreciationFundingBottomSheetFragment";
    public C45647KIk A00;
    public SpinnerImageView A01;
    public boolean A02;
    public final List A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final C47242KuF A07;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "appreciation_funding";
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = (SpinnerImageView) view.requireViewById(R.id.loading);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        MCQ mcq = new MCQ(viewLifecycleOwner, c07s, this, null, 11);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, mcq, A00);
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A06);
        AbstractC23641Du.A05(anonymousClass191, new MCD(A0Z, null, 38), AbstractC141776au.A00(A0Z));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.KHp, X.2zI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.2zI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.2zI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.2zI, java.lang.Object] */
    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        obj4.A00 = null;
        return AbstractC16960so.A1Q(obj, obj2, obj3, obj4, new KHI(this.A07));
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(new C50356MLi(this, 25));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AppreciationFundingViewModel appreciationFundingViewModel = (AppreciationFundingViewModel) this.A06.getValue();
        int i = requireArguments().getInt("ext_balance");
        if (!this.A02) {
            appreciationFundingViewModel.A03.A03(i, C05F.A00);
            return false;
        }
        return false;
    }

    public C45521KDm() {
        C50250MHf A01 = C50250MHf.A01(this, 15);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C50250MHf.A01(C50250MHf.A01(this, 12), 13));
        this.A06 = AbstractC25225BEi.A0a(C50250MHf.A01(A00, 14), A01, new C29897DGl(34, null, A00), AbstractC25225BEi.A1D(AppreciationFundingViewModel.class));
        this.A03 = AbstractC166987dD.A1J(new KJ6(null, false));
        this.A07 = new C47242KuF(this);
        this.A04 = AbstractC09440dt.A01(C50250MHf.A01(this, 11));
        this.A05 = AbstractC60492pY.A02(this);
    }
}
