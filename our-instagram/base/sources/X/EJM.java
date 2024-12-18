package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.banner.IgdsBanner;

/* loaded from: classes6.dex */
public final class EJM extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DirectManageFoldersFragment";
    public View A00;
    public RecyclerView A01;
    public C66362zD A02;
    public C34924FaA A03;
    public IgdsBanner A04;
    public final C8SB A05;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);
    public final String A08 = "direct_manage_folders";

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String string;
        int i;
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131959844);
        if (((MUG) ((C31829Dyn) this.A07.getValue()).A05.getValue()).A01) {
            string = getString(2131959808);
            i = 61;
        } else {
            string = getString(2131959843);
            i = 62;
        }
        interfaceC56362iU.Ect(string, ViewOnClickListenerC35681FpG.A00(this, i));
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = AbstractC31172DnG.A0G(view, R.id.folder_list);
        this.A00 = view.requireViewById(R.id.folder_info_button);
        this.A04 = (IgdsBanner) view.requireViewById(R.id.folder_nux_banner);
        C66392zG A0R = AbstractC31174DnI.A0R(this);
        A0R.A01(new C32629EYd(requireContext(), new GWH(this, 32)));
        this.A02 = AbstractC31173DnH.A0R(A0R, new C67988V5d(new C37014GSt(this, 25)));
        RecyclerView recyclerView = this.A01;
        String str = "recyclerView";
        if (recyclerView != null) {
            AbstractC31178DnM.A0z(this, recyclerView);
            RecyclerView recyclerView2 = this.A01;
            if (recyclerView2 != null) {
                recyclerView2.A0S = true;
                C66362zD c66362zD = this.A02;
                if (c66362zD == null) {
                    str = "adapter";
                } else {
                    recyclerView2.setAdapter(c66362zD);
                    View view2 = this.A00;
                    if (view2 == null) {
                        str = "infoButton";
                    } else {
                        ViewOnClickListenerC35681FpG.A01(view2, 63, this);
                        IgdsBanner igdsBanner = this.A04;
                        if (igdsBanner == null) {
                            str = "nuxBanner";
                        } else {
                            G81.A00(igdsBanner, this, 1);
                            C07S c07s = C07S.STARTED;
                            C07X viewLifecycleOwner = getViewLifecycleOwner();
                            AbstractC166987dD.A1Z(new MCI(viewLifecycleOwner, c07s, this, null, 2), C07Y.A00(viewLifecycleOwner));
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    public EJM() {
        C37014GSt c37014GSt = new C37014GSt(this, 29);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37014GSt(new C37014GSt(this, 26), 27));
        this.A07 = AbstractC25225BEi.A0a(new C37014GSt(A00, 28), c37014GSt, new C50172MDz(37, null, A00), AbstractC25225BEi.A1D(C31829Dyn.class));
        this.A05 = new C8SB(new C31857DzP(new C30190DRv(this, 27)));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A08;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1961772100);
        super.onCreate(bundle);
        this.A03 = new C34924FaA(AbstractC166987dD.A0r(this.A06));
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A07);
        GSR.A02(A0Z, AbstractC141776au.A00(A0Z), 9);
        C34924FaA c34924FaA = this.A03;
        if (c34924FaA == null) {
            AbstractC31171DnF.A0s();
            throw C00O.createAndThrow();
        }
        String string = requireArguments().getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (string == null) {
            string = "unknown";
        }
        C34924FaA.A00(c34924FaA, "inbox_folders_manage_screen_impression", AbstractC167007dF.A0n(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, string));
        C0f9.A09(-1475660537, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1683674352);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_manage_folders_fragment, false);
        C0f9.A09(1696662934, A02);
        return A0R;
    }
}
