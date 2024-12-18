package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes8.dex */
public final class KD0 extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC43440JHe {
    public static final String __redex_internal_original_name = "CreatorInspirationHubAudioFragment";
    public Context A00;
    public FragmentActivity A01;
    public RecyclerView A02;
    public InterfaceC678133v A03;
    public C38337GtX A04;
    public SpinnerImageView A05;
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A08 = C1XM.A00(new D87(this, 9));
    public final InterfaceC09390do A06 = C1XM.A00(new D87(this, 4));
    public final InterfaceC09390do A07 = C1XM.A00(new D87(this, 8));
    public final C153756vk A0A = new C153756vk(C8JW.A0G, AbstractC167017dG.A0j());

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_creator_inspiration_hub_audio";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C07S c07s;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A05 = AbstractC31180DnO.A0V(view);
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.creator_inspiration_hub_audio_recycler_view);
        this.A02 = A0G;
        String str = "audioRecyclerView";
        if (A0G != null) {
            Context context = this.A00;
            if (context == null) {
                str = "context";
            } else {
                AbstractC31174DnI.A16(context, A0G, 1, false);
                RecyclerView recyclerView = this.A02;
                if (recyclerView != null) {
                    C38337GtX c38337GtX = this.A04;
                    if (c38337GtX == null) {
                        str = "audioAdapter";
                    } else {
                        recyclerView.setAdapter(c38337GtX);
                        if (AbstractC167007dF.A1Z(this.A08)) {
                            c07s = C07S.RESUMED;
                        } else {
                            c07s = C07S.STARTED;
                        }
                        C07X viewLifecycleOwner = getViewLifecycleOwner();
                        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
                        MCM mcm = new MCM(view, viewLifecycleOwner, c07s, this, null, 13);
                        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
                        AbstractC23641Du.A05(anonymousClass191, mcm, A00);
                        AbstractC23641Du.A05(anonymousClass191, new D4v(this, null, 14), AbstractC25235BEs.A0S(this));
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final C8JW A00(String str) {
        if (C14360o3.A0K(str, "trending")) {
            return C8JW.A0J;
        }
        if (C14360o3.A0K(str, "popular_with_your_followers")) {
            return C8JW.A0H;
        }
        return C8JW.A0G;
    }

    @Override // X.InterfaceC43440JHe
    public final void D1Q(HYM hym) {
        AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) AbstractC166987dD.A17(this.A06);
        AbstractC166987dD.A1Z(new C57156PZa(abstractC52922bZ, hym, (InterfaceC23621Ds) null, 20), AbstractC141776au.A00(abstractC52922bZ));
    }

    @Override // X.InterfaceC43440JHe
    public final void DNP(HYM hym) {
        AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) AbstractC166987dD.A17(this.A06);
        AbstractC166987dD.A1Z(new C57156PZa(abstractC52922bZ, hym, (InterfaceC23621Ds) null, 18), AbstractC141776au.A00(abstractC52922bZ));
    }

    @Override // X.InterfaceC43440JHe
    public final void Di9(HYM hym) {
        ((Gt5) AbstractC166987dD.A17(this.A06)).A0J(hym);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer num;
        int A02 = C0f9.A02(1126910063);
        super.onCreate(bundle);
        this.A00 = requireContext();
        this.A01 = requireActivity();
        Context context = this.A00;
        if (context != null) {
            InterfaceC09390do interfaceC09390do = this.A09;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            Context context2 = this.A00;
            if (context2 != null) {
                this.A03 = AbstractC677833s.A00(context, A0r, this, AbstractC43594JPz.A0h(context2, interfaceC09390do), "CreatorInspirationHubAudioTab", AbstractC677833s.A02(A0r));
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                InterfaceC678133v interfaceC678133v = this.A03;
                if (interfaceC678133v != null) {
                    C153756vk c153756vk = this.A0A;
                    AbstractC12990ll A0k = AbstractC25230BEn.A0k(interfaceC09390do, 0);
                    C06090Tz c06090Tz = C06090Tz.A05;
                    boolean A06 = C18U.A06(c06090Tz, A0k, 36328302268661186L);
                    if (C18U.A06(c06090Tz, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36328456887549481L)) {
                        num = C05F.A0Y;
                    } else {
                        num = C05F.A0N;
                    }
                    Context context3 = this.A00;
                    if (context3 != null) {
                        this.A04 = new C38337GtX(context3, c153756vk, this, A0r2, interfaceC678133v, this, num, AbstractC43592JPx.A18(this, 14), true, A06, false, false);
                        C0f9.A09(-1265700368, A02);
                        return;
                    }
                } else {
                    IllegalStateException A0g = AbstractC166997dE.A0g();
                    C0f9.A09(1813928357, A02);
                    throw A0g;
                }
            }
        }
        C14360o3.A0F("context");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1513247930);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.creator_inspiration_hub_audio_fragment, viewGroup, false);
        C0f9.A09(551207502, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(140378624);
        super.onDestroy();
        InterfaceC678133v interfaceC678133v = this.A03;
        if (interfaceC678133v != null) {
            interfaceC678133v.release();
        }
        this.A03 = null;
        C0f9.A09(1940842838, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1939328512);
        super.onPause();
        InterfaceC678133v interfaceC678133v = this.A03;
        if (interfaceC678133v != null) {
            interfaceC678133v.EJa(false);
        }
        C0f9.A09(-1618105195, A02);
    }
}
