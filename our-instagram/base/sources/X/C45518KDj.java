package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KDj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45518KDj extends AbstractC43842Ja5 implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DirectClipsCardGalleryFragment";
    public C57012jc A00;
    public L1K A01;
    public InterfaceC164877Za A02;
    public InterfaceC165017Zq A03;
    public InterfaceC165297aI A04;
    public InterfaceC165227aB A05;
    public KB3 A06;
    public LnQ A07;
    public C3o9 A08;
    public InterfaceC08830cm A09;
    public AnonymousClass988 A0A;
    public C7IM A0B;
    public DirectThreadKey A0C;
    public List A0D;
    public final InterfaceC09390do A0I = AbstractC60492pY.A02(this);
    public final String A0E = "DirectClipsCardGalleryFragment.ITEM_ACTIONS_FRAGMENT_TAG";
    public final InterfaceC09390do A0G = AbstractC09440dt.A01(new C50153MDg(this, 19));
    public final InterfaceC09390do A0H = AbstractC09440dt.A01(C50198MFf.A00);
    public final InterfaceC09390do A0F = AbstractC09440dt.A01(C50197MFe.A00);
    public final InterfaceC165227aB A0L = new LnP(this);
    public final InterfaceC165017Zq A0K = new C49052Lme(this);
    public final InterfaceC164877Za A0J = new G4C(this, 1);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        int A09 = AbstractC167007dF.A09(requireContext(), R.attr.igds_color_primary_background);
        interfaceC56362iU.setTitle("");
        C35026Fbz c35026Fbz = new C35026Fbz(C05F.A00);
        c35026Fbz.A02(A09);
        interfaceC56362iU.Ehg(c35026Fbz.A01());
        AbstractC31179DnN.A1G(interfaceC56362iU);
        interfaceC56362iU.ARS(false);
        interfaceC56362iU.EkG(false);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_clips_card_gallery_fragment";
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewStub viewStub;
        C7U0 c7u0;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.card_gallery_empty_state_view_holder);
        if (findViewById instanceof ViewStub) {
            viewStub = (ViewStub) findViewById;
        } else {
            viewStub = null;
        }
        C57012jc c57012jc = new C57012jc(viewStub);
        this.A00 = c57012jc;
        c57012jc.A02();
        AbstractC166997dE.A0S(view, R.id.refreshable_container).setEnabled(false);
        C7Om c7Om = (C7Om) this.A0G.getValue();
        List list = this.A0D;
        if (list == null) {
            C14360o3.A0F("messageIds");
            throw C00O.createAndThrow();
        }
        List A00 = c7Om.A00((String) AbstractC001800i.A0O(list, 0));
        InterfaceC08830cm interfaceC08830cm = this.A09;
        if (interfaceC08830cm != null && (c7u0 = (C7U0) interfaceC08830cm.get()) != null) {
            this.A01 = new L1K(this, AbstractC166987dD.A0r(this.A0I), c7u0);
        }
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            KQ8 kq8 = new KQ8(AbstractC43592JPx.A0e(it), AbstractC31173DnH.A0t(this.A0I));
            AbstractC31171DnF.A0n(this.A0H).add(kq8);
            AbstractC31171DnF.A0n(this.A0F).add(kq8);
        }
        A0B(AbstractC31171DnF.A0n(this.A0H));
    }

    public final void A0C(String str) {
        InterfaceC09390do interfaceC09390do = this.A0H;
        List A0n = AbstractC31171DnF.A0n(interfaceC09390do);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A0n) {
            AbstractC43593JPy.A1R(((InterfaceC66482zP) obj).getKey(), str, obj, A1E);
        }
        InterfaceC09390do interfaceC09390do2 = this.A0F;
        List A0n2 = AbstractC31171DnF.A0n(interfaceC09390do2);
        ArrayList A1E2 = AbstractC166987dD.A1E();
        for (Object obj2 : A0n2) {
            AbstractC43593JPy.A1R(((KQ8) obj2).A00.A0i(), str, obj2, A1E2);
        }
        AbstractC31171DnF.A0n(interfaceC09390do).removeAll(A1E);
        AbstractC31171DnF.A0n(interfaceC09390do2).removeAll(A1E2);
        A0B(AbstractC31171DnF.A0n(interfaceC09390do));
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        InterfaceC163837Ux interfaceC163837Ux;
        Capabilities A00;
        Capabilities capabilities;
        C7U0 c7u0;
        InterfaceC08830cm interfaceC08830cm = this.A09;
        C7TT c7tt = null;
        if (interfaceC08830cm != null && (c7u0 = (C7U0) interfaceC08830cm.get()) != null) {
            interfaceC163837Ux = c7u0.C7r();
        } else {
            interfaceC163837Ux = null;
        }
        AnonymousClass989 anonymousClass989 = AnonymousClass988.A1Z;
        InterfaceC09390do interfaceC09390do = this.A0I;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        if (interfaceC163837Ux == null || (A00 = interfaceC163837Ux.AlV()) == null) {
            Parcelable.Creator creator = Capabilities.CREATOR;
            A00 = AbstractC2054797v.A00(C16930sl.A00);
        }
        this.A0A = anonymousClass989.A00(A0r, A00);
        Context requireContext = requireContext();
        AnonymousClass988 anonymousClass988 = this.A0A;
        String str = "experiments";
        if (anonymousClass988 != null) {
            this.A0B = AbstractC86593tX.A06(requireContext, anonymousClass988);
            FragmentActivity requireActivity = requireActivity();
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            DirectThreadKey directThreadKey = this.A0C;
            if (directThreadKey == null) {
                str = "threadKey";
            } else {
                C36401G4c c36401G4c = new C36401G4c(this, 1);
                C49094LnK c49094LnK = new C49094LnK(this);
                InterfaceC165017Zq interfaceC165017Zq = this.A0K;
                InterfaceC164877Za interfaceC164877Za = this.A0J;
                LnQ lnQ = this.A07;
                if (interfaceC163837Ux != null) {
                    c7tt = interfaceC163837Ux.C7W();
                    capabilities = interfaceC163837Ux.AlV();
                } else {
                    capabilities = null;
                }
                L5W l5w = new L5W(requireActivity, A0r2, capabilities, this, this, interfaceC164877Za, interfaceC165017Zq, c36401G4c, c49094LnK, lnQ, c7tt, directThreadKey);
                C49081Ln7 c49081Ln7 = new C49081Ln7(AbstractC166987dD.A0r(interfaceC09390do), this.A04, this.A0L);
                UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                Context requireContext2 = requireContext();
                AnonymousClass988 anonymousClass9882 = this.A0A;
                if (anonymousClass9882 != null) {
                    C7IM c7im = this.A0B;
                    if (c7im == null) {
                        str = "threadTheme";
                    } else {
                        return AbstractC166987dD.A1J(new KIG(requireContext2, A0r3, l5w, c49081Ln7, anonymousClass9882, c7im));
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(new GWH(this, 47));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0I);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-266080801);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        List stringArrayList = requireArguments.getStringArrayList("message_ids_list");
        if (stringArrayList == null) {
            stringArrayList = C16930sl.A00;
        }
        this.A0D = stringArrayList;
        C3o9 A00 = AbstractC43826JZo.A00(requireArguments, "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        if (A00 != null) {
            this.A08 = A00;
            this.A0C = JRE.A01(A00);
            C0f9.A09(1895489479, A02);
        } else {
            IllegalArgumentException A12 = AbstractC166987dD.A12("threadId can't be null");
            C0f9.A09(-1609385546, A02);
            throw A12;
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-136285970);
        super.onResume();
        C2UU c2uu = getRecyclerView().A0A;
        if (c2uu != null) {
            c2uu.notifyDataSetChanged();
        }
        C0f9.A09(2008436805, A02);
    }
}
