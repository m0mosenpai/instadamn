package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository;
import com.instagram.model.reels.Reel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.N4z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52126N4z extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ImmersiveCatchUpFragment";
    public C66362zD A00;
    public ImmersiveCatchUpRepository A01;
    public RecyclerView A02;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public final List A04 = AbstractC166987dD.A1E();
    public final InterfaceC81993lL A03 = new P8J(this, 1);
    public final O3O A06 = new O3O(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.2zP] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C51818MvM c51818MvM = new C51818MvM();
        ?? obj = new Object();
        List list = this.A04;
        list.add(c51818MvM);
        list.add(obj);
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        A0E.A00(c51818MvM);
        A0E.A00(obj);
        C66362zD c66362zD = this.A00;
        if (c66362zD == null) {
            str = "immersiveItemAdapter";
        } else {
            c66362zD.A05(A0E);
            C57312k6 A0a = AbstractC25229BEm.A0a(this);
            PYZ pyz = new PYZ(this, null, 15);
            AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
            AbstractC23641Du.A05(anonymousClass191, pyz, A0a);
            ImmersiveCatchUpRepository immersiveCatchUpRepository = this.A01;
            if (immersiveCatchUpRepository == null) {
                str = "repository";
            } else {
                Iterator A1J = AbstractC25226BEj.A1J(immersiveCatchUpRepository.A00().A00);
                while (A1J.hasNext()) {
                    String id = ((Reel) A1J.next()).getId();
                    if (id != null) {
                        InterfaceC09390do interfaceC09390do = this.A05;
                        AbstractC82003lM.A00(AbstractC166987dD.A0r(interfaceC09390do)).A05(this.A03, id, null, false);
                        AbstractC82003lM.A00(AbstractC166987dD.A0r(interfaceC09390do)).A02(C3G5.A0I, id, __redex_internal_original_name, null);
                    }
                }
                AbstractC23641Du.A05(anonymousClass191, new PYZ(this, null, 16), AbstractC25229BEm.A0a(this));
                super.onViewCreated(view, bundle);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(C52126N4z c52126N4z, EnumC53161NfG enumC53161NfG) {
        int i;
        C52106N4e c52106N4e = new C52106N4e();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putSerializable("immersive_catch_up_filtered_content_type", enumC53161NfG);
        c52106N4e.setArguments(A0b);
        C189448aO A0g = AbstractC25231BEo.A0g(c52126N4z.A05);
        A0g.A03 = 0.9f;
        AbstractC25225BEi.A1Q(A0g, true);
        int ordinal = enumC53161NfG.ordinal();
        Context requireContext = c52126N4z.requireContext();
        if (ordinal != 0) {
            i = 2131964321;
        } else {
            i = 2131964318;
        }
        A0g.A0d = AbstractC166997dE.A0p(requireContext, i);
        AbstractC31177DnL.A14(c52126N4z, c52106N4e, A0g);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1557822633);
        super.onCreate(bundle);
        this.A01 = AbstractC54038Nuo.A00(AbstractC166987dD.A0r(this.A05));
        C0f9.A09(1388651732, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-435251937);
        C14360o3.A0B(layoutInflater, 0);
        AbstractC31174DnI.A0H(this).getDecorView().setSystemUiVisibility(5126);
        View inflate = layoutInflater.inflate(R.layout.immersive_catch_up_fragment_layout, viewGroup, false);
        this.A02 = AbstractC43592JPx.A0B(inflate, R.id.catch_up_recycler_view);
        View A0c = AbstractC166987dD.A0c(inflate, R.id.exit_button);
        int width = A0c.getWidth() + AbstractC167017dG.A0B(requireActivity()) + AbstractC167017dG.A09(requireActivity());
        ViewOnClickListenerC55455Ok9.A01(A0c, 44, this);
        C66392zG A0R = AbstractC31174DnI.A0R(this);
        A0R.A01(new NF9(requireContext(), this.A06));
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A05;
        A0R.A01(new C45676KJn(requireContext, AbstractC166987dD.A0r(interfaceC09390do)));
        A0R.A01(new NFN(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), width));
        FragmentActivity requireActivity = requireActivity();
        interfaceC09390do.getValue();
        this.A00 = AbstractC31173DnH.A0R(A0R, new NF2(requireActivity));
        RecyclerView recyclerView = this.A02;
        String str = "recyclerView";
        if (recyclerView != null) {
            AbstractC31174DnI.A15(recyclerView.getContext(), recyclerView);
            C66362zD c66362zD = this.A00;
            if (c66362zD == null) {
                str = "immersiveItemAdapter";
            } else {
                recyclerView.setAdapter(c66362zD);
                C61792rg c61792rg = new C61792rg();
                RecyclerView recyclerView2 = this.A02;
                if (recyclerView2 != null) {
                    c61792rg.A07(recyclerView2);
                    C0f9.A09(905833473, A02);
                    return inflate;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
