package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Br6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26725Br6 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ReelsTuningFragment";
    public InterfaceC37264GbH A00;
    public final String A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(2997);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    public C26725Br6() {
        C57510Pfk c57510Pfk = new C57510Pfk(this, 12);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57510Pfk(new C57510Pfk(this, 9), 10));
        this.A03 = AbstractC25225BEi.A0a(new C57510Pfk(A00, 11), c57510Pfk, new C57531Pg5(48, null, A00), AbstractC25225BEi.A1D(C50893MeO.class));
        this.A02 = AbstractC60492pY.A02(this);
        this.A01 = AbstractC167017dG.A0j();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        InterfaceC37264GbH interfaceC37264GbH;
        int A02 = C0f9.A02(785325813);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.nux_reels_tuning_fragment, viewGroup, false);
        C1UC requireActivity = requireActivity();
        if (requireActivity instanceof InterfaceC37264GbH) {
            interfaceC37264GbH = (InterfaceC37264GbH) requireActivity;
        } else {
            interfaceC37264GbH = null;
        }
        this.A00 = interfaceC37264GbH;
        ((ViewGroup) AbstractC166997dE.A0R(inflate, R.id.reels_tuning_container)).addView(AbstractC25319BIo.A02(this, C5UA.A03(new C30496Dbf(this, 40), 492709886), false, false));
        C0f9.A09(-1710797989, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(821442037);
        super.onDestroyView();
        C0f9.A09(24591508, A02);
    }
}
