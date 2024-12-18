package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ENB extends AbstractC59962oe implements InterfaceC62602sz, InterfaceC37214GaP, InterfaceC60122ou, InterfaceC37204GaF {
    public static final String __redex_internal_original_name = "ThreadDetailsNicknamesFragment";
    public Capabilities A00;
    public InterfaceC37169GZg A01;
    public EQN A02;
    public E70 A03;
    public InterfaceC83733oI A04;
    public RecyclerView A05;
    public C25671My A06;
    public final C41761wQ A07 = AbstractC31174DnI.A0S();
    public final InterfaceC09390do A08 = C37052GUi.A00(this, 41);
    public final InterfaceC41501vz A0B = C31650DvG.A00(this, 28);
    public final InterfaceC41501vz A0A = C31650DvG.A00(this, 27);
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);
    public final String A0C = __redex_internal_original_name;

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        return true;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        return false;
    }

    @Override // X.InterfaceC37204GaF
    public final boolean Caq(User user) {
        return false;
    }

    @Override // X.InterfaceC37204GaF
    public final boolean Ccd(User user) {
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
    }

    @Override // X.InterfaceC37204GaF
    public final void Cub(User user) {
    }

    @Override // X.InterfaceC37214GaP
    public final void DT0(C32107E9f c32107E9f) {
    }

    @Override // X.InterfaceC37214GaP
    public final void Dev(C32107E9f c32107E9f) {
    }

    @Override // X.InterfaceC37214GaP
    public final void Djm(C32107E9f c32107E9f) {
    }

    @Override // X.InterfaceC37204GaF
    public final boolean Dxg(User user, boolean z) {
        return false;
    }

    @Override // X.InterfaceC37214GaP
    public final void Dy2(C32107E9f c32107E9f) {
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A05 = AbstractC31180DnO.A08(view);
        EQN eqn = new EQN(requireContext(), this, AbstractC166987dD.A0r(this.A09), this, C36733GHc.A00, C36735GHe.A00, this, this, false, true);
        this.A02 = eqn;
        RecyclerView recyclerView = this.A05;
        String str = "recyclerView";
        if (recyclerView != null) {
            recyclerView.setAdapter(eqn);
            RecyclerView recyclerView2 = this.A05;
            if (recyclerView2 != null) {
                AbstractC31174DnI.A16(getContext(), recyclerView2, 1, false);
                C19K A0w = AbstractC167017dG.A0w(C12L.A00, 632454757);
                MBo mBo = new MBo(this, null, 47);
                AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
                Integer num = C05F.A00;
                AbstractC23641Du.A03(num, anonymousClass191, mBo, A0w);
                InterfaceC37169GZg interfaceC37169GZg = this.A01;
                if (interfaceC37169GZg == null) {
                    str = "clientInfra";
                } else {
                    InterfaceC37279GbW.A00(interfaceC37169GZg);
                    A01(num, null);
                    C25671My c25671My = this.A06;
                    str = "igEventBus";
                    if (c25671My != null) {
                        c25671My.A01(this.A0B, C36098FwY.class);
                        C25671My c25671My2 = this.A06;
                        if (c25671My2 != null) {
                            c25671My2.A01(this.A0A, C36086FwM.class);
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final void A00(C32107E9f c32107E9f) {
        String str;
        User user = c32107E9f.A00;
        String B8y = user.B8y();
        InterfaceC09390do interfaceC09390do = this.A09;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        String str2 = c32107E9f.A01;
        InterfaceC83733oI interfaceC83733oI = this.A04;
        if (interfaceC83733oI == null) {
            str = "threadId";
        } else {
            String id = user.getId();
            Capabilities capabilities = this.A00;
            if (capabilities == null) {
                str = "threadCapabilities";
            } else {
                C14360o3.A0B(A0r, 0);
                C32329EMa c32329EMa = new C32329EMa();
                Bundle A0D = AbstractC31174DnI.A0D(A0r);
                A0D.putString("username_hint", B8y);
                A0D.putString(AbstractC31670Dva.A01(0, 8, 22), str2);
                AbstractC35077Fco.A02(A0D, interfaceC83733oI, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
                A0D.putString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, id);
                A0D.putString("nickname_change_entry_point", "thread_details");
                A0D.putParcelable("thread_capabilities", capabilities);
                c32329EMa.setArguments(A0D);
                String id2 = user.getId();
                AbstractC31173DnH.A1G(this, c32329EMa, AbstractC34089F2r.A00(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), new C50170MDx(7, c32107E9f, this), new C57262Pbk(c32329EMa, this, id2, 7)));
                A01(C05F.A01, user.getId());
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final void A01(Integer num, String str) {
        String str2;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A09);
        InterfaceC83733oI interfaceC83733oI = this.A04;
        if (interfaceC83733oI == null) {
            C14360o3.A0F("threadId");
            throw C00O.createAndThrow();
        }
        String str3 = ((C83693oE) interfaceC83733oI).A00;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0N(A0o), "direct_nickname_sheet");
        if (A0f.isSampled()) {
            if (num.intValue() != 0) {
                str2 = "tap";
            } else {
                str2 = "impression";
            }
            AbstractC31171DnF.A1C(A0f, str2);
            AbstractC31171DnF.A1G(A0f, "thread_details");
            A0f.A9K("target_user_id", AbstractC25233BEq.A0n(str));
            AbstractC31171DnF.A1H(A0f, str3);
            A0f.Cht();
        }
    }

    @Override // X.InterfaceC37214GaP
    public final void CxJ(C32107E9f c32107E9f) {
        if (c32107E9f.A06) {
            A00(c32107E9f);
        }
    }

    @Override // X.InterfaceC37214GaP
    public final void Dy7(C32107E9f c32107E9f) {
        if (c32107E9f.A06) {
            A00(c32107E9f);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131959121);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0C;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalArgumentException A12;
        int i;
        String str;
        int A02 = C0f9.A02(69423658);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Capabilities capabilities = (Capabilities) requireArguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
        if (capabilities != null) {
            this.A00 = capabilities;
            InterfaceC83733oI A00 = AbstractC35077Fco.A00(requireArguments, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
            if (A00 != null) {
                this.A04 = A00;
                Context requireContext = requireContext();
                InterfaceC09390do interfaceC09390do = this.A09;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                InterfaceC83733oI interfaceC83733oI = this.A04;
                if (interfaceC83733oI == null) {
                    str = "threadId";
                } else {
                    Capabilities capabilities2 = this.A00;
                    if (capabilities2 == null) {
                        str = "threadCapabilities";
                    } else {
                        InterfaceC37169GZg A01 = C7KH.A01(requireContext, A0r, capabilities2, interfaceC83733oI);
                        this.A01 = A01;
                        if (A01 == null) {
                            str = "clientInfra";
                        } else {
                            InterfaceC37279GbW.A01(A01);
                            this.A06 = AbstractC31176DnK.A0Q(interfaceC09390do);
                            C0f9.A09(-1298043770, A02);
                            return;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            A12 = AbstractC31172DnG.A0t();
            i = 1217311296;
        } else {
            A12 = AbstractC166987dD.A12("threadCapabilities can't be null");
            i = 1206301562;
        }
        C0f9.A09(i, A02);
        throw A12;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2137901701);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_thread_details_people_fragment, viewGroup, false);
        C0f9.A09(711445958, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-507912239);
        super.onDestroyView();
        this.A07.A01();
        C25671My c25671My = this.A06;
        if (c25671My != null) {
            c25671My.A02(this.A0B, C36098FwY.class);
            C25671My c25671My2 = this.A06;
            if (c25671My2 != null) {
                c25671My2.A02(this.A0A, C36086FwM.class);
                C0f9.A09(-1072141674, A02);
                return;
            }
        }
        C14360o3.A0F("igEventBus");
        throw C00O.createAndThrow();
    }
}
