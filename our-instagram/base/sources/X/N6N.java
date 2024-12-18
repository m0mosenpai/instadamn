package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.reels.store.ReelStore;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.util.List;

/* loaded from: classes9.dex */
public final class N6N extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, InterfaceC50521MRz, InterfaceC57916PmM, InterfaceC57917PmN, InterfaceC57919PmP {
    public static final String __redex_internal_original_name = "ManageHighlightsFragment";
    public HighlightReelTypeStr A00;
    public C55197Oe4 A01;
    public EnumC53200Nfw A02 = EnumC53200Nfw.A04;
    public InterfaceC56392iX A03;
    public C4NJ A04;
    public C64842wi A05;
    public C46080Kac A06;
    public boolean A07;
    public boolean A08;
    public List A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final boolean A0F;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C55197Oe4 c55197Oe4;
        java.util.Set keySet;
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131963606);
        interfaceC56362iU.EkS(true);
        if (AbstractC167007dF.A1Z(this.A0A) && (c55197Oe4 = this.A01) != null && (keySet = c55197Oe4.A05.keySet()) != null && keySet.isEmpty()) {
            interfaceC56362iU.AAC(2131961124);
        } else {
            interfaceC56362iU.AAF(new ViewOnClickListenerC55467OkM(this, 19), 2131961124);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        ImageUrl A0t;
        ReelType reelType;
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        C14360o3.A07(childFragmentManager);
        ViewPager viewPager = (ViewPager) AbstractC166997dE.A0S(view, R.id.tabs_viewpager);
        FixedTabBar fixedTabBar = (FixedTabBar) AbstractC166997dE.A0S(view, R.id.fixed_tabbar_view);
        List list = this.A09;
        if (list == null) {
            str = "tabModes";
        } else {
            this.A06 = new C46080Kac(childFragmentManager, viewPager, fixedTabBar, this, list, false, true);
            this.A03 = AbstractC31173DnH.A0U(view, R.id.qp_megaphone_stub);
            C64842wi c64842wi = this.A05;
            if (c64842wi == null) {
                str = "quickPromotionPresenter";
            } else {
                c64842wi.DiZ();
                C46080Kac c46080Kac = this.A06;
                if (c46080Kac != null) {
                    c46080Kac.A06(EnumC53200Nfw.A04);
                }
                this.A02 = EnumC53200Nfw.A04;
                InterfaceC09390do interfaceC09390do = this.A0C;
                Reel A0M = C1OU.A04(AbstractC166987dD.A0r(interfaceC09390do)).A0M(AbstractC25225BEi.A15(this.A0B));
                C55197Oe4 c55197Oe4 = this.A01;
                if (c55197Oe4 != null) {
                    c55197Oe4.A06.add(this);
                    c55197Oe4.A08(A0M);
                    ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.edit_highlights_metadata_container);
                    if (A0M != null && ((reelType = A0M.A0P) == ReelType.A0b || reelType == ReelType.A0d)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean A1X = AbstractC167007dF.A1X(this.A00, HighlightReelTypeStr.A05);
                    C54662OCo c54662OCo = c55197Oe4.A00;
                    if (c54662OCo != null) {
                        A0t = c54662OCo.A02;
                    } else {
                        A0t = AbstractC25225BEi.A0t("");
                    }
                    String str2 = c55197Oe4.A01;
                    boolean z2 = !z;
                    boolean z3 = this.A08;
                    C14360o3.A0A(A0t);
                    C14360o3.A0A(str2);
                    C14360o3.A0B(str2, 2);
                    View A0D = AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(A0C, 0), A0C, R.layout.layout_edit_highlights_metadata, false);
                    A0D.setTag(new C51345Mm6(A0D));
                    Context requireContext = requireContext();
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                    Object tag = A0D.getTag();
                    if (tag != null) {
                        C51345Mm6 c51345Mm6 = (C51345Mm6) tag;
                        int A07 = AbstractC25230BEn.A07(1, A0r, c51345Mm6);
                        AbstractC53792Nqi.A00(requireContext, c51345Mm6.A00, this, A0r, A0t, (C44376JjF) c51345Mm6.A06.A08.getValue(), c51345Mm6.A05);
                        C55197Oe4 A00 = C55197Oe4.A00(A0r);
                        C14360o3.A07(A00);
                        TextView textView = c51345Mm6.A04;
                        boolean z4 = !z3;
                        int i = 8;
                        textView.setVisibility(AbstractC167007dF.A05(z4 ? 1 : 0));
                        textView.setEnabled(MSW.A1b(A00.A05));
                        ViewOnClickListenerC55464OkJ.A01(c51345Mm6.A01, A07, A00, this);
                        View view2 = c51345Mm6.A02;
                        if (z2) {
                            i = 0;
                        }
                        view2.setVisibility(i);
                        if (z2) {
                            view2.setVisibility(0);
                            if (A1X) {
                                c51345Mm6.A03.setCompoundDrawablesWithIntrinsicBounds(AbstractC85953sP.A01(requireContext, R.drawable.instagram_crown_pano_filled_12, R.color.clips_gradient_redesign_color_4), (Drawable) null, (Drawable) null, (Drawable) null);
                            }
                            EditText editText = c51345Mm6.A03;
                            editText.setText(str2);
                            AbstractC167017dG.A18(editText);
                            editText.setFocusable(z4);
                            editText.setFocusableInTouchMode(z4);
                            if (z3) {
                                editText.setAlpha(0.5f);
                                ViewOnClickListenerC55467OkM.A00(editText, 1, requireContext);
                            } else {
                                editText.addTextChangedListener(new Oi8(editText, this));
                            }
                        }
                        A0C.addView(A0D);
                        new C35765Fr2(requireContext(), AbstractC31173DnH.A0G(view, R.id.shopping_autohighlight_setting_row_stub), this, AbstractC018607g.A00(this), this, AbstractC166987dD.A0r(interfaceC09390do), A0M);
                        View A0S = AbstractC166997dE.A0S(view, R.id.exclusive_autohighlight_setting_row);
                        C0fQ.A00(new LQ0(this, 47), A0S);
                        View A0S2 = AbstractC166997dE.A0S(view, R.id.exclusive_autohighlight_setting_divider);
                        C07S c07s = C07S.STARTED;
                        C07X viewLifecycleOwner = getViewLifecycleOwner();
                        AbstractC166987dD.A1Z(new JTH(A0S2, this, viewLifecycleOwner, A0S, c07s, (InterfaceC23621Ds) null, 14), C07Y.A00(viewLifecycleOwner));
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(N6N n6n) {
        C55197Oe4.A04(AbstractC166987dD.A0r(n6n.A0C));
        n6n.A01 = null;
        if (!AbstractC167007dF.A1Z(n6n.A0A)) {
            synchronized (OVW.class) {
                if (OVW.A01 != null) {
                    OVW.A01 = null;
                }
            }
        }
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ Fragment ALl(Object obj) {
        int A05 = AbstractC25227BEk.A05((EnumC53200Nfw) obj, 0);
        if (A05 != 0) {
            if (A05 == 1) {
                Bundle requireArguments = requireArguments();
                requireArguments.putSerializable("edit_highlights_reel_id", AbstractC25225BEi.A15(this.A0B));
                requireArguments.putSerializable("highlight_management_source", (EnumC53243Ngg) this.A0D.getValue());
                requireArguments.putBoolean("hide_privacy_footer", true);
                Fragment A00 = AbstractC55178Odj.A00(requireArguments, AbstractC166987dD.A0r(this.A0C));
                C14360o3.A0A(A00);
                return A00;
            }
            throw B4Z.A00();
        }
        N7V n7v = new N7V();
        n7v.setArguments(requireArguments());
        return n7v;
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ L5P ANJ(Object obj) {
        EnumC53200Nfw enumC53200Nfw = (EnumC53200Nfw) obj;
        C14360o3.A0B(enumC53200Nfw, 0);
        return AbstractC41372ISz.A00(enumC53200Nfw.A00);
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ void Dru(Object obj) {
        EnumC53200Nfw enumC53200Nfw;
        EnumC53200Nfw enumC53200Nfw2 = (EnumC53200Nfw) obj;
        C14360o3.A0B(enumC53200Nfw2, 0);
        if (isResumed() && enumC53200Nfw2 != (enumC53200Nfw = this.A02)) {
            C46080Kac c46080Kac = this.A06;
            if (c46080Kac != null) {
                InterfaceC08430c6 A03 = c46080Kac.A03(enumC53200Nfw);
                C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.base.fragment.ViewSwitcherChildFragment");
                ((JPR) A03).DXQ();
                this.A02 = enumC53200Nfw2;
                C46080Kac c46080Kac2 = this.A06;
                if (c46080Kac2 != null) {
                    InterfaceC08430c6 A032 = c46080Kac2.A03(enumC53200Nfw2);
                    C14360o3.A0C(A032, "null cannot be cast to non-null type com.instagram.base.fragment.ViewSwitcherChildFragment");
                    ((JPR) A032).DXZ();
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        if (this.A02 == EnumC53200Nfw.A04) {
            return "edit_reel_highlights";
        }
        return "reel_highlights_gallery";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    @Override // X.AbstractC59962oe
    public final boolean isContainerFragment() {
        return this.A0F;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C55197Oe4 c55197Oe4;
        if (!this.A07 && AbstractC167007dF.A1Z(this.A0A) && (c55197Oe4 = this.A01) != null) {
            C54661OCn A05 = c55197Oe4.A05();
            if (A05.A03.isEmpty() && A05.A04.isEmpty() && !A05.A02 && !A05.A01 && !A05.A00) {
                A00(this);
                return false;
            }
            C193328hC A0O = AbstractC31175DnJ.A0O(this);
            A0O.A0A(2131974898);
            A0O.A09(2131974895);
            A0O.A0I(DialogInterfaceOnClickListenerC55319Ogh.A00(this, 2), 2131974896);
            AbstractC31176DnK.A17(null, A0O, 2131974897);
            return true;
        }
        this.A07 = false;
        return false;
    }

    public N6N() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0B = AbstractC09440dt.A00(enumC09460dv, new DH6(this, "edit_highlights_reel_id", "edit_highlights_reel_id", 18));
        this.A0D = AbstractC09440dt.A00(enumC09460dv, new DH6(this, "highlight_management_source", "highlight_management_source", 19));
        this.A0A = AbstractC09440dt.A00(enumC09460dv, new C50253MHi(AbstractC166997dE.A0a(), this, AbstractC111324zv.A00(4350), 11));
        C57508Pfi c57508Pfi = new C57508Pfi(this, 36);
        InterfaceC09390do A00 = C57508Pfi.A00(new C57508Pfi(this, 33), enumC09460dv, 34);
        this.A0E = AbstractC25225BEi.A0a(new C57508Pfi(A00, 35), c57508Pfi, new MHV(1, (Object) null, A00), AbstractC25225BEi.A1D(C44490Jlw.class));
        this.A0C = AbstractC60492pY.A02(this);
        this.A0F = true;
    }

    @Override // X.InterfaceC57919PmP
    public final void AB2(String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A19 = AbstractC167027dH.A19(str, i2);
            if (!z) {
                if (!A19) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!A19) {
                break;
            } else {
                length--;
            }
        }
        String A0g = AbstractC31177DnL.A0g(str, length, i);
        if (A0g.length() == 0) {
            A0g = AbstractC25227BEk.A0v(this, 2131963609);
        }
        C55197Oe4.A00(AbstractC166987dD.A0r(this.A0C)).A01 = A0g;
        AbstractC31178DnM.A0v(this);
    }

    @Override // X.InterfaceC57917PmN
    public final void D9o() {
        requireActivity().setResult(-1);
        AbstractC25227BEk.A1B(this);
    }

    @Override // X.InterfaceC57916PmM
    public final void DSF() {
        AbstractC31178DnM.A0v(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        HighlightReelTypeStr highlightReelTypeStr;
        int A02 = C0f9.A02(-510116525);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A0C;
        ReelStore A03 = ReelStore.A03(AbstractC166987dD.A0r(interfaceC09390do));
        InterfaceC09390do interfaceC09390do2 = this.A0B;
        Reel A0M = A03.A0M(AbstractC25225BEi.A15(interfaceC09390do2));
        if (A0M != null) {
            highlightReelTypeStr = A0M.A09;
        } else {
            highlightReelTypeStr = null;
        }
        this.A00 = highlightReelTypeStr;
        Reel A0M2 = ReelStore.A03(AbstractC166987dD.A0r(interfaceC09390do)).A0M(AbstractC25225BEi.A15(interfaceC09390do2));
        boolean z = true;
        if (A0M2 == null || !A0M2.A0l()) {
            z = false;
        }
        this.A08 = z;
        C01L A1I = C0eM.A1I();
        A1I.add(EnumC53200Nfw.A04);
        if (this.A00 != HighlightReelTypeStr.A05) {
            A1I.add(EnumC53200Nfw.A03);
        }
        this.A09 = C0eM.A1J(A1I);
        C55197Oe4.A04(AbstractC166987dD.A0r(interfaceC09390do));
        this.A01 = C55197Oe4.A00(AbstractC166987dD.A0r(interfaceC09390do));
        C27961Xa A00 = AbstractC54912fq.A00();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0P;
        C54922fr A0S = AbstractC31175DnJ.A0S();
        P72.A00(A0S, this, 1);
        A0S.A08 = new MUU(this, 1);
        this.A05 = AbstractC31175DnJ.A0T(this, A0r, A0S, A00, quickPromotionSlot);
        C0f9.A09(384228140, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2122518221);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.archive_tabbed_fragment, viewGroup, false);
        C0f9.A09(1175930167, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-2051229930);
        super.onDestroyView();
        C55197Oe4 c55197Oe4 = this.A01;
        if (c55197Oe4 != null) {
            c55197Oe4.A06.remove(this);
        }
        this.A06 = null;
        C0f9.A09(2114966907, A02);
    }
}
