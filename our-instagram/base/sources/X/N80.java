package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class N80 extends AbstractC43842Ja5 implements InterfaceC71994XEi, GZU, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "IgLivePostLiveModeratorActionsFragment";
    public C105824pt A00;
    public String A01;
    public String A02;
    public final InterfaceC09390do A04 = C57555PgT.A00(this, 21);
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A03 = C57555PgT.A00(this, 20);

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void CuK(User user) {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void CvT(User user, String str) {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void D1s(User user) {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void DHz(String str) {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void DN5(User user, Integer num) {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void DOl() {
    }

    @Override // X.InterfaceC71994XEi
    public final void DTp(GZU gzu, User user) {
        View.OnClickListener viewOnClickListenerC42015Ijk;
        String str;
        C14360o3.A0B(user, 0);
        InterfaceC09390do interfaceC09390do = this.A05;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        Object value = this.A04.getValue();
        C54810OKj c54810OKj = new C54810OKj(this, AbstractC166987dD.A0r(interfaceC09390do));
        String str2 = this.A01;
        if (str2 == null) {
            str = "broadcastId";
        } else {
            String str3 = this.A02;
            if (str3 == null) {
                str = "mediaId";
            } else {
                C50674MYs c50674MYs = new C50674MYs(requireContext(), A0o);
                ArrayList A1E = AbstractC166987dD.A1E();
                boolean A1N = AbstractC167007dF.A1N(user.CQf() ? 1 : 0);
                Context requireContext = requireContext();
                int i = 2131965572;
                if (A1N) {
                    i = 2131965336;
                }
                String A0c = AbstractC31178DnM.A0c(requireContext, user, i);
                C14360o3.A07(A0c);
                A1E.add(A0c);
                if (user.A27()) {
                    A1E.add(AbstractC166997dE.A0p(requireContext(), 2131972215));
                }
                if (!user.A1t()) {
                    String A0c2 = AbstractC31178DnM.A0c(requireContext(), user, 2131966858);
                    C14360o3.A07(A0c2);
                    A1E.add(A0c2);
                }
                for (CharSequence charSequence : (CharSequence[]) A1E.toArray(new CharSequence[0])) {
                    if (C14360o3.A0K(charSequence, AbstractC31178DnM.A0c(requireContext(), user, 2131965336))) {
                        c50674MYs.A09(charSequence.toString(), new ViewOnClickListenerC55417OjS(8, this, user, A0o, this));
                    } else {
                        boolean A0K = C14360o3.A0K(charSequence, AbstractC31178DnM.A0c(requireContext(), user, 2131965572));
                        String obj = charSequence.toString();
                        if (A0K) {
                            viewOnClickListenerC42015Ijk = new ViewOnClickListenerC55417OjS(9, this, user, A0o, this);
                        } else {
                            viewOnClickListenerC42015Ijk = new ViewOnClickListenerC42015Ijk(charSequence, this, value, this, c54810OKj, user, A0o, str2, str3, 2);
                        }
                        c50674MYs.A0B(obj, viewOnClickListenerC42015Ijk);
                    }
                }
                new C31727DwY(c50674MYs).A07(requireContext());
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.GZU
    public final void Dda() {
    }

    @Override // X.GZU
    public final void Ddb(User user, boolean z) {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void Df6(User user) {
    }

    @Override // X.InterfaceC71994XEi
    public final void Dxl(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC09390do interfaceC09390do = this.A05;
        C31368DqX A01 = AbstractC31402Dr6.A01(AbstractC166987dD.A0r(interfaceC09390do), str, AbstractC111324zv.A00(2989), "IgLiveModeratorActionsFragment");
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        AbstractC31172DnG.A1M(this, AbstractC31174DnI.A0a(requireActivity(), AbstractC31364DqT.A00(A01, interfaceC09390do), A0o, ModalActivity.class, "IgLiveModeratorActionsFragment"));
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void E1r(C1P1 c1p1, AbstractC53633Nne abstractC53633Nne, User user, Integer num) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "IgLiveModeratorActionsFragment";
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        java.util.Set A06;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A05;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        String str2 = this.A01;
        if (str2 != null) {
            C14360o3.A0B(A0o, 0);
            C25621Ms A0M = AbstractC31177DnL.A0M(A0o);
            A0M.A0L("live/%s/moderator/get_summary/", str2);
            C1ON A0R = AbstractC31172DnG.A0R(null, A0M, C52098N2y.class, OQO.class, true);
            C50689MZh.A00(A0R, this, 29);
            schedule(A0R);
            C18920wW A01 = AbstractC12220kQ.A01(this, AbstractC25230BEn.A0k(interfaceC09390do, 1));
            String str3 = this.A01;
            java.util.Set set = null;
            if (str3 != null) {
                String A0t = AbstractC31173DnH.A0t(interfaceC09390do);
                String str4 = this.A02;
                if (str4 == null) {
                    str = "mediaId";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                C105824pt c105824pt = this.A00;
                if (c105824pt != null && (A06 = c105824pt.A06()) != null) {
                    ArrayList A0q = AbstractC167017dG.A0q(A06);
                    Iterator it = A06.iterator();
                    while (it.hasNext()) {
                        AbstractC167017dG.A1V(A0q, it);
                    }
                    set = AbstractC001800i.A0k(A0q);
                }
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, "ig_live_moderator_review");
                if (A0t == null) {
                    A0t = "0";
                }
                MSY.A16(A0f, A0t);
                AbstractC31171DnF.A1A(A0f, "impression");
                MSY.A12(A0f, AbstractC167027dH.A03(str3));
                AbstractC37300Gc1.A0l(A0f, str4);
                AbstractC37301Gc2.A15(A0f, this);
                MSX.A1D(A0f);
                MSY.A17(A0f, MSY.A0l(set));
                return;
            }
        }
        str = "broadcastId";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC16960so.A1Q(new C52350NEo(C57729PjI.A00), new V5U(this, AbstractC166987dD.A0r(this.A05), this, EnumC142806cg.A03, this, C57733PjM.A00));
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C57734PjN.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131965440);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1579101844);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = requireArguments.getString("moderator_broadcast_id", "0");
        this.A02 = requireArguments.getString("moderator_media_id", "0");
        ReelStore A04 = C1OU.A04(AbstractC166987dD.A0r(this.A05));
        String str = this.A01;
        if (str == null) {
            C14360o3.A0F("broadcastId");
            throw C00O.createAndThrow();
        }
        Reel A0M = A04.A0M(str);
        if (A0M != null) {
            this.A00 = A0M.A0H;
        }
        C0f9.A09(566661708, A02);
    }
}
