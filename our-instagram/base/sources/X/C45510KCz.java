package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.KCz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45510KCz extends AbstractC59962oe implements InterfaceC60442pS, MQF {
    public static final String __redex_internal_original_name = "QuickSnapConsumptionViewerFragment";
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public ImageView A09;
    public TextView A0A;
    public C61792rg A0B;
    public RecyclerView A0C;
    public C66362zD A0D;
    public FO3 A0E;
    public final InterfaceC09390do A0J;
    public final InterfaceC41501vz A0M;
    public final InterfaceC09390do A0N;
    public final C3I9 A0F = C3I7.A01(this, false, true);
    public final InterfaceC09390do A0H = AMo.A05(this, new C57748Pjb(this, 49), R.id.quick_snap_consumption_animatable_preview);
    public final InterfaceC09390do A0K = AbstractC09440dt.A01(new C25027B5z(this, 3));
    public final InterfaceC09390do A0I = C1XM.A00(new C25027B5z(this, 0));
    public int A00 = -1;
    public final InterfaceC09390do A0L = AbstractC60492pY.A02(this);
    public final String A0G = AbstractC111324zv.A00(509);

    public static final C26086BgF A01(LZV lzv, C45510KCz c45510KCz) {
        Object obj = null;
        if (lzv == null) {
            return null;
        }
        Iterator it = lzv.A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C14360o3.A0B(((C26086BgF) next).A04, 0);
            if (!A03(c45510KCz).A04.A01.contains(r1)) {
                obj = next;
                break;
            }
        }
        return (C26086BgF) obj;
    }

    public static final void A04(View view, C45510KCz c45510KCz, String str) {
        C57312k6 A0S = AbstractC25235BEs.A0S(c45510KCz);
        PZQ pzq = new PZQ(view, c45510KCz, str, null, 9);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, pzq, A0S);
        C3CY A03 = A03(c45510KCz);
        C14360o3.A0B(str, 0);
        C26086BgF c26086BgF = (C26086BgF) ((C206209Bd) A03.A0A.getValue()).A00;
        if (c26086BgF != null) {
            C191138dB.A02(EnumC46286KeI.REACT, A03.A03, ((C38321qM) c26086BgF.A02).A38());
            AbstractC23641Du.A05(anonymousClass191, new PZQ(c26086BgF, A03, str, null, 11), AbstractC141776au.A00(A03));
        }
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
        ViewGroup viewGroup;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewOnClickListenerC48073LPy.A00(AbstractC166997dE.A0S(view, R.id.consumption_exit_button), 27, this);
        View requireViewById = view.requireViewById(R.id.consumption_more_button);
        this.A05 = requireViewById;
        if (requireViewById != null) {
            C0fQ.A00(new ViewOnClickListenerC31723DwS(this, 58), requireViewById);
        }
        View requireViewById2 = view.requireViewById(R.id.close_friends_badge);
        this.A03 = requireViewById2;
        if (requireViewById2 != null) {
            AbstractC166997dE.A0S(requireViewById2, R.id.close_friends_badge_star_icon).setVisibility(0);
            AbstractC166997dE.A0S(requireViewById2, R.id.close_friends_badge_chevron).setVisibility(0);
            ViewOnClickListenerC48073LPy.A00(requireViewById2, 28, this);
        }
        View requireViewById3 = view.requireViewById(R.id.audience_lists_badge);
        this.A06 = requireViewById3;
        if (requireViewById3 != null) {
            AbstractC166997dE.A0S(requireViewById3, R.id.private_story_badge_chevron).setVisibility(0);
            AbstractC31173DnH.A0I(requireViewById3, R.id.private_story_badge_icon).setImageResource(R.drawable.instagram_lock_pano_filled_24);
            ViewOnClickListenerC48073LPy.A00(requireViewById3, 29, this);
        }
        C66392zG A0R = AbstractC31174DnI.A0R(this);
        InterfaceC09390do interfaceC09390do = this.A0L;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) this.A0H.getValue();
        InterfaceC09390do interfaceC09390do2 = this.A0K;
        QuickSnapReactionEmitterView quickSnapReactionEmitterView = (QuickSnapReactionEmitterView) interfaceC09390do2.getValue();
        C57312k6 A0a = AbstractC25229BEm.A0a(this);
        InterfaceC09390do interfaceC09390do3 = this.A0I;
        A0R.A01(new C45674KJl(this, A0r, igSimpleImageView, this, quickSnapReactionEmitterView, A0a, AbstractC167027dH.A01(interfaceC09390do3)));
        this.A0D = AbstractC31173DnH.A0R(A0R, new KJO(AbstractC167027dH.A01(interfaceC09390do3)));
        final Context requireContext = requireContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext) { // from class: com.instagram.quicksnap.consumption.QuickSnapConsumptionViewerFragment$setupRecyclerView$layoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
            public final boolean A1Y() {
                return false;
            }
        };
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        this.A0C = A0F;
        String str = "recyclerView";
        if (A0F != null) {
            A0F.setLayoutManager(linearLayoutManager);
            RecyclerView recyclerView = this.A0C;
            if (recyclerView != null) {
                C66362zD c66362zD = this.A0D;
                if (c66362zD == null) {
                    str = "adapter";
                } else {
                    recyclerView.setAdapter(c66362zD);
                    RecyclerView recyclerView2 = this.A0C;
                    if (recyclerView2 != null) {
                        recyclerView2.A10(new JoC(requireContext(), AbstractC167027dH.A01(interfaceC09390do3)));
                        C61792rg c61792rg = new C61792rg();
                        this.A0B = c61792rg;
                        RecyclerView recyclerView3 = this.A0C;
                        if (recyclerView3 != null) {
                            c61792rg.A07(recyclerView3);
                            RecyclerView recyclerView4 = this.A0C;
                            if (recyclerView4 != null) {
                                recyclerView4.A14(new C44229JgZ(4, this, linearLayoutManager));
                                RecyclerView recyclerView5 = this.A0C;
                                if (recyclerView5 != null) {
                                    recyclerView5.A12(new C44326JiO(this, 2));
                                    this.A01 = view.requireViewById(R.id.sender_attribution_container);
                                    this.A09 = AbstractC31173DnH.A0I(view, R.id.sender_profile_picture);
                                    this.A0A = AbstractC166997dE.A0T(view, R.id.sender_attribution_text);
                                    View requireViewById4 = view.requireViewById(R.id.quick_snap_capture_button);
                                    this.A02 = requireViewById4;
                                    if (requireViewById4 != null) {
                                        ViewOnClickListenerC48073LPy.A00(requireViewById4, 30, this);
                                    }
                                    this.A07 = view.requireViewById(R.id.reaction_container);
                                    ImageView A0I = AbstractC31173DnH.A0I(view, R.id.emoji_view_1);
                                    C14360o3.A0A(A0I);
                                    AMo.A07(A0I, "😂");
                                    KKo.A00(AbstractC43592JPx.A0U(A0I), A0I, this, 13);
                                    ImageView A0I2 = AbstractC31173DnH.A0I(view, R.id.emoji_view_2);
                                    C14360o3.A0A(A0I2);
                                    AMo.A07(A0I2, "❤️");
                                    KKo.A00(AbstractC43592JPx.A0U(A0I2), A0I2, this, 14);
                                    ImageView A0I3 = AbstractC31173DnH.A0I(view, R.id.emoji_view_3);
                                    C14360o3.A0A(A0I3);
                                    AMo.A07(A0I3, "😍");
                                    KKo.A00(AbstractC43592JPx.A0U(A0I3), A0I3, this, 11);
                                    ImageView A0I4 = AbstractC31173DnH.A0I(view, R.id.emoji_view_4);
                                    C14360o3.A0A(A0I4);
                                    AMo.A07(A0I4, "🔥");
                                    KKo.A00(AbstractC43592JPx.A0U(A0I4), A0I4, this, 12);
                                    C3P9 A0U = AbstractC43592JPx.A0U(AbstractC166997dE.A0S(view, R.id.custom_emoji_view));
                                    A0U.A04 = new EZQ(this, 6);
                                    A0U.A00();
                                    View A0S = AbstractC166997dE.A0S(view, R.id.reply_bar_container);
                                    this.A04 = view.requireViewById(R.id.reply_bar_edit_text);
                                    this.A08 = view.requireViewById(R.id.send_message_container);
                                    boolean A06 = C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36325484770571374L);
                                    int i = 0;
                                    AbstractC166997dE.A0S(view, R.id.send_message_button).setVisibility(AbstractC167007dF.A05(!A06 ? 1 : 0));
                                    View A0S2 = AbstractC166997dE.A0S(view, R.id.send_message_bar);
                                    if (!A06) {
                                        i = 8;
                                    }
                                    A0S2.setVisibility(i);
                                    FO3 fo3 = new FO3(A0S, this.A0F, this);
                                    this.A0E = fo3;
                                    fo3.A07.addTextChangedListener(fo3.A03);
                                    fo3.A05.A9e(fo3.A04);
                                    View view2 = this.A08;
                                    if (view2 != null) {
                                        ViewOnClickListenerC48073LPy.A00(view2, 31, this);
                                    }
                                    C07S c07s = C07S.STARTED;
                                    C07X viewLifecycleOwner = getViewLifecycleOwner();
                                    C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
                                    C57165PZj c57165PZj = new C57165PZj(c07s, this, viewLifecycleOwner, null, 27);
                                    AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
                                    AbstractC23641Du.A05(anonymousClass191, c57165PZj, A00);
                                    C3CY A03 = A03(this);
                                    AbstractC23641Du.A05(anonymousClass191, new PZX(A03, new C43603JQj(this, 26), (InterfaceC23621Ds) null, 43), AbstractC141776au.A00(A03));
                                    View rootView = view.getRootView();
                                    if ((rootView instanceof ViewGroup) && (viewGroup = (ViewGroup) rootView) != null) {
                                        viewGroup.addView(AbstractC166987dD.A0d(interfaceC09390do2));
                                    }
                                    ViewOnTouchListenerC48084LQj.A01(view, 22, this.A0J.getValue());
                                    AbstractC31176DnK.A0Q(interfaceC09390do).A01(this.A0M, LYH.class);
                                    C191138dB.A02(EnumC46286KeI.OPEN_QUICKSNAP_CONSUMPTION, A03(this).A03, null);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final int A00(C45510KCz c45510KCz) {
        String str;
        RecyclerView recyclerView = c45510KCz.A0C;
        if (recyclerView == null) {
            str = "recyclerView";
        } else {
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            C14360o3.A0C(abstractC70663Fe, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            C61792rg c61792rg = c45510KCz.A0B;
            if (c61792rg == null) {
                str = "snapHelper";
            } else {
                View A03 = c61792rg.A03(abstractC70663Fe);
                if (A03 != null) {
                    return AbstractC70663Fe.A0C(A03);
                }
                return -1;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final C3CY A03(C45510KCz c45510KCz) {
        return (C3CY) c45510KCz.A0N.getValue();
    }

    public static final void A05(C45510KCz c45510KCz) {
        Object obj;
        LayerDrawable layerDrawable;
        C26086BgF c26086BgF = (C26086BgF) ((C206209Bd) A03(c45510KCz).A0A.getValue()).A00;
        if (c26086BgF != null && (obj = c26086BgF.A00) != null) {
            FragmentActivity requireActivity = c45510KCz.requireActivity();
            InterfaceC09390do interfaceC09390do = c45510KCz.A0L;
            new C684436h(requireActivity, AbstractC166987dD.A0r(interfaceC09390do));
            FragmentActivity requireActivity2 = c45510KCz.requireActivity();
            C14360o3.A0B(interfaceC09390do.getValue(), 2);
            User user = (User) c26086BgF.A01;
            DialogInterfaceOnShowListenerC48027LMw dialogInterfaceOnShowListenerC48027LMw = new DialogInterfaceOnShowListenerC48027LMw(c45510KCz, 8);
            DialogInterfaceOnDismissListenerC48025LMu dialogInterfaceOnDismissListenerC48025LMu = new DialogInterfaceOnDismissListenerC48025LMu(c45510KCz, 11);
            C14360o3.A0B(user, 1);
            Resources resources = requireActivity2.getResources();
            C193328hC A0H = AbstractC31171DnF.A0H(requireActivity2);
            A0H.A0I(null, 2131961124);
            A0H.A0h(dialogInterfaceOnShowListenerC48027LMw);
            A0H.A0g(dialogInterfaceOnDismissListenerC48025LMu);
            if (obj == EnumC76383bi.A04) {
                A0H.A05 = resources.getString(2131971308);
                A0H.A0r(AbstractC166997dE.A0r(resources, user.getUsername(), 2131971307));
                layerDrawable = AbstractC172497mJ.A01(requireActivity2);
            } else {
                A0H.A05 = resources.getString(2131971300);
                A0H.A0r(AbstractC166997dE.A0r(resources, user.getUsername(), 2131971299));
                ShapeDrawable A05 = AbstractC172497mJ.A05(requireActivity2.getColor(AbstractC53242c7.A02(requireActivity2)));
                ShapeDrawable A052 = AbstractC172497mJ.A05(AbstractC167007dF.A09(requireActivity2, R.attr.igds_color_creation_tools_green));
                Paint paint = C3LQ.A00;
                layerDrawable = new LayerDrawable(new Drawable[]{A05, A052, C3LQ.A05(requireActivity2, R.drawable.instagram_lock_pano_filled_24, requireActivity2.getColor(R.color.igds_icon_on_color))});
                int A02 = AbstractC43593JPy.A02(requireActivity2, 3);
                int A022 = AbstractC43593JPy.A02(requireActivity2, 18);
                layerDrawable.setLayerInset(0, 0, 0, 0, 0);
                layerDrawable.setLayerInset(1, A02, A02, A02, A02);
                layerDrawable.setLayerInset(2, A022, A022, A022, A022);
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            A1E.add(layerDrawable);
            A1E.add(new C89533yt(user.Bhu(), c45510KCz.A0G, AbstractC166987dD.A0C(requireActivity2, 58), AbstractC166987dD.A0C(requireActivity2, 2), requireActivity2.getColor(R.color.igds_elevated_background), requireActivity2.getColor(R.color.grey_1)));
            A0H.A0k(new C89553yv(requireActivity2, C05F.A00, A1E, 0.3f, AbstractC166987dD.A0C(requireActivity2, 58), true));
            AbstractC31178DnM.A1R(A0H, true);
        }
    }

    @Override // X.MQF
    public final boolean DrR() {
        String str;
        FO3 fo3 = this.A0E;
        if (fo3 == null) {
            str = "replyBarController";
        } else if (fo3.A00) {
            View view = this.A04;
            str = "editText";
            if (view != null) {
                view.clearFocus();
                View view2 = this.A04;
                if (view2 != null) {
                    AbstractC13880nE.A0O(view2);
                    return true;
                }
            }
        } else {
            AbstractC31177DnL.A12(this);
            return true;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.MQF
    public final boolean Dra() {
        String str;
        FO3 fo3 = this.A0E;
        if (fo3 == null) {
            str = "replyBarController";
        } else if (!fo3.A00) {
            View view = this.A04;
            str = "editText";
            if (view != null) {
                view.requestFocus();
                View view2 = this.A04;
                if (view2 != null) {
                    AbstractC13880nE.A0T(view2);
                    return true;
                }
            }
        } else {
            return true;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0G;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0L);
    }

    public C45510KCz() {
        C25027B5z c25027B5z = new C25027B5z(this, 2);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C25027B5z(new C25027B5z(this, 4), 5));
        this.A0N = AbstractC25225BEi.A0a(new C25027B5z(A00, 6), c25027B5z, new C57257Pbf(30, null, A00), AbstractC25225BEi.A1D(C3CY.class));
        this.A0J = AbstractC09440dt.A01(new C25027B5z(this, 1));
        this.A0M = new C44288Jhe(this, 21);
    }

    public static final C44761Jri A02(C45510KCz c45510KCz) {
        int A00 = A00(c45510KCz);
        RecyclerView recyclerView = c45510KCz.A0C;
        if (recyclerView == null) {
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        C3OO A0V = recyclerView.A0V(A00);
        if (!(A0V instanceof C44761Jri)) {
            return null;
        }
        return (C44761Jri) A0V;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(511999596);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.quick_snap_consumption_viewer_fragment, false);
        C0f9.A09(-780101061, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1949046470);
        super.onDestroy();
        this.A0F.onDestroy();
        C0f9.A09(1024386452, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1422352471);
        super.onDestroyView();
        ((QuickSnapReactionEmitterView) this.A0K.getValue()).A01();
        AbstractC31176DnK.A0Q(this.A0L).A02(this.A0M, LYH.class);
        FO3 fo3 = this.A0E;
        if (fo3 != null) {
            fo3.A07.removeTextChangedListener(fo3.A03);
            fo3.A05.EFx(fo3.A04);
        }
        C0f9.A09(-913853110, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1422778764);
        super.onPause();
        A03(this).A05(false);
        A03(this).A02();
        C0f9.A09(1649658441, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        C3DN A0r;
        int A02 = C0f9.A02(722133853);
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity == null || (A0r = AbstractC31172DnG.A0r(activity)) == null || !((C3DP) A0r).A0h) {
            A03(this).A05(true);
        }
        C0f9.A09(-1872900820, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(239893543);
        super.onStart();
        this.A0F.Dnr(requireActivity());
        C0f9.A09(1929375096, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1678451075);
        super.onStop();
        this.A0F.onStop();
        C0f9.A09(-1764341775, A02);
    }
}
