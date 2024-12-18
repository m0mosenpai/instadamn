package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository;
import java.io.Serializable;
import java.util.List;

/* renamed from: X.N4e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52106N4e extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ImmersiveCatchUpFilteredBottomSheetFragment";
    public C66362zD A00;
    public EnumC53161NfG A01;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final List A03 = AbstractC166987dD.A1E();
    public final InterfaceC81993lL A02 = new P8J(this, 0);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C66392zG A0R = AbstractC31174DnI.A0R(this);
        FragmentActivity requireActivity = requireActivity();
        InterfaceC09390do interfaceC09390do = this.A04;
        interfaceC09390do.getValue();
        this.A00 = AbstractC31173DnH.A0R(A0R, new NF3(requireActivity));
        RecyclerView A0B = AbstractC43592JPx.A0B(view, R.id.filtered_bottom_sheet_recycler_view);
        A0B.setLayoutManager(new GridLayoutManager(A0B.getContext(), 2));
        C66362zD c66362zD = this.A00;
        if (c66362zD == null) {
            C14360o3.A0F("itemAdapter");
            throw C00O.createAndThrow();
        }
        A0B.setAdapter(c66362zD);
        ImmersiveCatchUpRepository A00 = AbstractC54038Nuo.A00(AbstractC166987dD.A0r(interfaceC09390do));
        AbstractC166987dD.A1Z(new PZP(this, A00, null, 10), AbstractC25229BEm.A0a(this));
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        EnumC53161NfG enumC53161NfG;
        int A02 = C0f9.A02(-1167723030);
        super.onCreate(bundle);
        Serializable serializable = requireArguments().getSerializable("immersive_catch_up_filtered_content_type");
        if (serializable instanceof EnumC53161NfG) {
            enumC53161NfG = (EnumC53161NfG) serializable;
        } else {
            enumC53161NfG = null;
        }
        this.A01 = enumC53161NfG;
        C0f9.A09(1064250511, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1126383383);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.immersive_catch_up_filter_bottom_sheet_layout, false);
        C0f9.A09(-1728149072, A02);
        return A0R;
    }
}
