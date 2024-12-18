package com.instagram.settings.privacy.messages;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25226BEj;
import X.AbstractC25230BEn;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31178DnM;
import X.AbstractC31179DnN;
import X.AbstractC31180DnO;
import X.AbstractC33235ElU;
import X.AbstractC43591JPw;
import X.AbstractC43959Jc8;
import X.AbstractC54193NxX;
import X.AbstractC60492pY;
import X.AbstractC63260SgI;
import X.AbstractC63302u8;
import X.AnonymousClass773;
import X.C00O;
import X.C06090Tz;
import X.C0f9;
import X.C131995xZ;
import X.C14360o3;
import X.C17060sy;
import X.C18U;
import X.C196068lw;
import X.C1ON;
import X.C23031Ai;
import X.C2E7;
import X.C31335Dq0;
import X.C33248Eli;
import X.C34626FNj;
import X.C34945FaV;
import X.C34965Fap;
import X.C34966Faq;
import X.C34997FbU;
import X.C35119FeM;
import X.C35246Fgf;
import X.C35729FqC;
import X.C36731GHa;
import X.C4A4;
import X.C55174Odd;
import X.C56142Ow4;
import X.C66277U6x;
import X.C71163Hc;
import X.EPV;
import X.EnumC153216up;
import X.EnumC222416a;
import X.EnumC33470Er5;
import X.FHZ;
import X.FIP;
import X.InterfaceC02590Ai;
import X.InterfaceC09390do;
import X.InterfaceC37114GWz;
import X.InterfaceC56362iU;
import X.InterfaceC58070Pov;
import X.InterfaceC60122ou;
import X.MSV;
import X.NAF;
import X.O5T;
import X.OQ4;
import X.OQ5;
import X.ViewOnClickListenerC35689FpO;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class DirectMessagesOptionsFragment extends AbstractC33235ElU implements InterfaceC60122ou, InterfaceC58070Pov, CallerContextable, InterfaceC37114GWz {
    public static final CallerContext A04 = CallerContext.A00(DirectMessagesOptionsFragment.class);
    public FIP A00;
    public NAF A01;
    public boolean A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public EmptyStateView emptyStateView;

    @Override // X.InterfaceC58070Pov
    public final void CrL(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, Integer num, String str, DirectMessageInteropReachabilityOptions[] directMessageInteropReachabilityOptionsArr, int i, boolean z) {
        C14360o3.A0B(directMessageInteropReachabilityOptionsArr, 3);
        UserSession A0r = AbstractC166987dD.A0r(this.A03);
        OQ4.A00(this.mArguments, requireActivity(), A0r, directMessagesInteropOptionsViewModel, num, str, directMessageInteropReachabilityOptionsArr, i, z);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, getString(2131966409));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_messages_options";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View view2 = this.mEmptyView;
        C14360o3.A0C(view2, MSV.A00(14));
        EmptyStateView emptyStateView = (EmptyStateView) view2;
        C14360o3.A0B(emptyStateView, 0);
        this.emptyStateView = emptyStateView;
        emptyStateView.A0P(EnumC153216up.A06);
        NAF naf = this.A01;
        if (naf != null) {
            C56142Ow4 c56142Ow4 = naf.A0D;
            synchronized (c56142Ow4) {
                c56142Ow4.A08.add(naf);
            }
            O5T o5t = naf.A0B;
            synchronized (c56142Ow4) {
                C14360o3.A0B(o5t, 0);
                c56142Ow4.A07.add(o5t);
            }
            synchronized (c56142Ow4) {
                c56142Ow4.A04 = naf;
            }
        }
        EPV epv = (EPV) AbstractC31175DnJ.A0P(this);
        if (epv != null) {
            epv.switchItemViewPointDelegate = this;
        }
        FIP fip = this.A00;
        if (fip != null) {
            C71163Hc A00 = C71163Hc.A00(this);
            fip.A00.A06(AbstractC31174DnI.A0G(this), A00);
            return;
        }
        C14360o3.A0F("messageAccessToggleViewPointHelper");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58070Pov
    public final void Cqa() {
        IgBloksScreenConfig A0O = AbstractC31177DnL.A0O(this.A03);
        String A00 = MSV.A00(410);
        A0O.A0R = A00;
        A0O.A0S = A00;
        AbstractC31171DnF.A17(this, A0O, 2131953779);
        A0O.A0l = true;
        Context context = getContext();
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        HashMap A1G3 = AbstractC166987dD.A1G();
        BitSet A0j = AbstractC31171DnF.A0j(1);
        if (A0j.nextClearBit(AbstractC31180DnO.A1Y("entrypoint", AbstractC111324zv.A00(2719), A1G, A0j) ? 1 : 0) >= 1) {
            C66277U6x A0H = AbstractC31179DnN.A0H(A00, A1G, A1G2);
            A0H.A03 = null;
            A0H.A02 = null;
            AbstractC31174DnI.A18(context, A0O, A0H, A1G3);
            return;
        }
        throw AbstractC31173DnH.A0f();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public final void A00() {
        Boolean bool;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions;
        ArrayList A1E = AbstractC166987dD.A1E();
        NAF naf = this.A01;
        if (naf != null) {
            C34945FaV c34945FaV = naf.A0C;
            UserSession userSession = naf.A07;
            DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel = naf.A00;
            if (naf.A04) {
                C23031Ai c23031Ai = naf.A09;
                bool = (Boolean) AbstractC31171DnF.A0Y(c23031Ai, c23031Ai.A6K, C23031Ai.A8c, 263);
            } else {
                bool = null;
            }
            boolean z = naf.A02;
            ArrayList A12 = AbstractC166997dE.A12(userSession, 0);
            int i = 2131966411;
            if (c34945FaV.A01 == EnumC222416a.A07) {
                i = 2131966410;
            }
            C34965Fap c34965Fap = new C34965Fap(i);
            Context context = c34945FaV.A00;
            Resources resources = context.getResources();
            c34965Fap.A05 = new C34626FNj(0, resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material), 0, resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material), resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
            c34965Fap.A03 = R.style.DirectMessagesOptionsText;
            c34965Fap.A02 = 2;
            A12.add(c34965Fap);
            if (directMessagesInteropOptionsViewModel != null) {
                A12.add(C34945FaV.A00(directMessagesInteropOptionsViewModel.A05, naf, c34945FaV, MSV.A00(214), 2131966429, z));
                A12.add(C34945FaV.A00(directMessagesInteropOptionsViewModel.A08, naf, c34945FaV, MSV.A00(541), 2131966421, z));
                if ((C4A4.A01(userSession) && (AbstractC43959Jc8.A01(userSession) || AbstractC43959Jc8.A00(userSession))) || ((C18U.A06(C06090Tz.A05, userSession, 36312982120695375L) && AbstractC63302u8.A00(userSession).A05(UserMonetizationProductType.A08)) || AbstractC63302u8.A00(userSession).A05)) {
                    A12.add(C34945FaV.A00(null, naf, c34945FaV, MSV.A00(1143), 2131966414, z));
                }
                directMessageInteropReachabilityOptions = directMessagesInteropOptionsViewModel.A06;
            } else {
                directMessageInteropReachabilityOptions = null;
            }
            if (directMessageInteropReachabilityOptions != null && C18U.A06(C06090Tz.A06, userSession, 36316611367473700L)) {
                C35119FeM.A00(A12, true);
                A12.add(C31335Dq0.A01(context, 2131966431));
                A12.add(C34945FaV.A00(directMessagesInteropOptionsViewModel.A06, naf, c34945FaV, "ig_verified", 2131966407, z));
            }
            C35119FeM.A00(A12, true);
            A12.add(C31335Dq0.A01(context, 2131966432));
            C34966Faq c34966Faq = new C34966Faq(ViewOnClickListenerC35689FpO.A00(naf, 70), 2131966404);
            c34966Faq.A05 = !z;
            A12.add(c34966Faq);
            String A00 = AbstractC111324zv.A00(2458);
            String A0p = AbstractC166997dE.A0p(context, 2131966436);
            SpannableStringBuilder A07 = AbstractC31178DnM.A07(context, A0p, 2131966397);
            String A01 = AbstractC63260SgI.A01(context, A00);
            C14360o3.A07(A01);
            AnonymousClass773.A05(A07, new C33248Eli(context, userSession, null, A01, AbstractC31174DnI.A02(context)), A0p);
            A12.add(new C35246Fgf(A07));
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                C35119FeM.A00(A12, true);
                C31335Dq0.A03(A12, 2131966400);
                C36731GHa A02 = C36731GHa.A02(new C35729FqC(2, naf, z), 2131966401, booleanValue);
                if (!z) {
                    A02.A0E = true;
                    A02.A0D = false;
                }
                A12.add(A02);
                FHZ fhz = new FHZ(naf);
                String A002 = AbstractC111324zv.A00(2465);
                String A0p2 = AbstractC166997dE.A0p(context, 2131966398);
                SpannableStringBuilder A072 = AbstractC31178DnM.A07(context, A0p2, 2131966399);
                String A012 = AbstractC63260SgI.A01(context, A002);
                C14360o3.A07(A012);
                AnonymousClass773.A05(A072, new C33248Eli(context, userSession, fhz, A012, AbstractC31174DnI.A02(context)), A0p2);
                A12.add(new C35246Fgf(A072));
            }
            A1E.addAll(A12);
        }
        EmptyStateView emptyStateView = this.emptyStateView;
        if (emptyStateView != null) {
            emptyStateView.A0P(EnumC153216up.A05);
            setItems(A1E);
            if (this.A02) {
                getScrollingViewProxy().EmD(A1E.size() - 1);
                this.A02 = false;
                return;
            }
            return;
        }
        C14360o3.A0F("emptyStateView");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.FBO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.OQ5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v0, types: [X.OQ3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v0, types: [X.OQ5, java.lang.Object] */
    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean A1U;
        boolean A1U2;
        int A02 = C0f9.A02(867926910);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        InterfaceC09390do interfaceC09390do = this.A03;
        boolean z = false;
        if (C18U.A06(C06090Tz.A06, AbstractC166987dD.A0o(interfaceC09390do), 36311878313444137L) && requireArguments.getBoolean("scroll_to_message_access_toggle", false)) {
            z = true;
        }
        this.A02 = z;
        EnumC222416a A0I = AbstractC31176DnK.A0g(C17060sy.A01, interfaceC09390do).A0I();
        ?? obj = new Object();
        C34945FaV c34945FaV = new C34945FaV(requireContext(), new Object(), A0I);
        C56142Ow4 A00 = AbstractC54193NxX.A00(AbstractC166987dD.A0r(interfaceC09390do), AbstractC25230BEn.A0l(interfaceC09390do), new Object());
        ?? obj2 = new Object();
        String string = requireArguments.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        C34997FbU c34997FbU = new C34997FbU(this, AbstractC166987dD.A0r(interfaceC09390do), string);
        C131995xZ A002 = C196068lw.A00(AbstractC166987dD.A0r(interfaceC09390do)).A00(A04);
        boolean A03 = C196068lw.A03(A002);
        boolean A022 = C196068lw.A02(A002);
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C23031Ai A0l = AbstractC25230BEn.A0l(interfaceC09390do);
        C55174Odd c55174Odd = new C55174Odd(this, AbstractC31180DnO.A0M(interfaceC09390do), string);
        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
        if (!C2E7.A03(AbstractC31178DnM.A0T(A0r2))) {
            A1U = false;
        } else {
            A1U = AbstractC31177DnL.A1U(C06090Tz.A05, A0r2, 36311942737953609L);
        }
        UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
        if (!C2E7.A03(AbstractC31178DnM.A0T(A0r3))) {
            A1U2 = false;
        } else {
            A1U2 = AbstractC31177DnL.A1U(C06090Tz.A05, A0r3, 36311942738019146L);
        }
        this.A01 = new NAF(requireContext, (EnumC33470Er5) requireArguments.getSerializable(AbstractC43591JPw.A00(195)), A0r, c34997FbU, A0l, c55174Odd, obj2, c34945FaV, A00, this, this, obj, A0I, A03, A022, A1U, A1U2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c34997FbU.A00, "instagram_waverly_ig_event");
        AbstractC31171DnF.A1B(A0f, "start_step");
        A0f.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c34997FbU.A01);
        AbstractC31171DnF.A1A(A0f, "ig_message_settings");
        A0f.AAP("message_controls_settings_version", "v2");
        A0f.Cht();
        this.A00 = new FIP(c34997FbU);
        C0f9.A09(-940810256, A02);
    }

    @Override // X.AbstractC33235ElU, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1961963747);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_listview_with_empty_state, false);
        C0f9.A09(1478894261, A02);
        return A0R;
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1901321221);
        super.onDestroyView();
        NAF naf = this.A01;
        if (naf != null) {
            C56142Ow4 c56142Ow4 = naf.A0D;
            synchronized (c56142Ow4) {
                c56142Ow4.A04 = null;
            }
        }
        C0f9.A09(1798571806, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        boolean z;
        int A02 = C0f9.A02(-456181634);
        super.onResume();
        NAF naf = this.A01;
        if (naf != null) {
            C56142Ow4 c56142Ow4 = naf.A0D;
            synchronized (c56142Ow4) {
                if (c56142Ow4.A03 == null) {
                    z = false;
                    if (c56142Ow4.A02 != null) {
                    }
                }
                z = true;
            }
            if (!z) {
                C1ON A00 = OQ5.A00(naf.A07);
                A00.A00 = naf;
                naf.A0E.schedule(A00);
            } else {
                NAF.A01(naf);
                naf.A02 = false;
                naf.A0E.A00();
            }
            EnumC33470Er5 enumC33470Er5 = naf.A06;
            if (enumC33470Er5 != null) {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(naf.A0A.A00, "direct_reachability_settings_view");
                if (A0f.isSampled()) {
                    AbstractC31175DnJ.A17(A0f, enumC33470Er5.name());
                }
            }
        }
        C0f9.A09(1846816093, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1082417889);
        super.onStop();
        NAF naf = this.A01;
        if (naf != null) {
            C56142Ow4 c56142Ow4 = naf.A0D;
            synchronized (c56142Ow4) {
                c56142Ow4.A08.remove(naf);
            }
            O5T o5t = naf.A0B;
            synchronized (c56142Ow4) {
                C14360o3.A0B(o5t, 0);
                c56142Ow4.A07.remove(o5t);
            }
        }
        C0f9.A09(-1910617716, A02);
    }
}
