package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EJ0 extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DirectIntermediateViewerSheetFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Ehk(getString(2131959343));
        interfaceC56362iU.EPD(requireActivity().getDrawable(AbstractC53242c7.A02(getContext())));
        interfaceC56362iU.EkS(true);
        AbstractC31179DnN.A1G(interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_intermediate_viewer_sheet_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String A00;
        Integer A0X;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        String str4 = null;
        if (bundle2 != null) {
            str = bundle2.getString(AbstractC111324zv.A00(387));
        } else {
            str = null;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str2 = bundle3.getString(AbstractC111324zv.A00(388));
        } else {
            str2 = null;
        }
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str3 = bundle4.getString(AbstractC43591JPw.A00(76));
        } else {
            str3 = null;
        }
        Bundle bundle5 = this.mArguments;
        if (bundle5 != null) {
            str4 = bundle5.getString(AbstractC111324zv.A00(389));
        }
        Bundle bundle6 = this.mArguments;
        if (bundle6 != null && (A0X = AbstractC31179DnN.A0X(bundle6, (A00 = AbstractC111324zv.A00(18)))) != null) {
            int intValue = A0X.intValue();
            Bundle A0D = AbstractC31174DnI.A0D(AbstractC25230BEn.A0k(this.A00, 0));
            A0D.putString(AbstractC111324zv.A00(387), str);
            A0D.putString(AbstractC111324zv.A00(388), str2);
            A0D.putString(AbstractC43591JPw.A00(76), str3);
            A0D.putString(AbstractC111324zv.A00(389), str4);
            A0D.putInt(A00, intValue);
            A0D.putBoolean(AbstractC111324zv.A00(153), false);
            KDH kdh = new KDH();
            kdh.setArguments(A0D);
            kdh.A01 = new C36433G5i(this);
            C14240no c14240no = new C14240no(getChildFragmentManager());
            c14240no.A0A(kdh, R.id.child_fragment_container);
            c14240no.A00();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1762789968);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_intermediate_viewer_sheet_fragment, false);
        C0f9.A09(1103766130, A02);
        return A0R;
    }
}
