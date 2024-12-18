package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class ELO extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, InterfaceC37165GZc, GYQ {
    public static final String __redex_internal_original_name = "ShortcutsAudiencePickerFragment";
    public IgSimpleImageView A00;
    public EQ6 A01;
    public C36685GFf A02;
    public IgdsButton A03;
    public String A04;
    public boolean A06;
    public final C34952Fac A07 = new C34952Fac();
    public List A05 = C16930sl.A00;
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);
    public final String A09 = "shortcuts_audience_picker";

    @Override // X.GYQ
    public final void Cuc(C31335Dq0 c31335Dq0) {
    }

    @Override // X.InterfaceC37165GZc
    public final void Cxl(E6V e6v, IgdsCheckBox igdsCheckBox) {
        E6V e6v2;
        C14360o3.A0B(igdsCheckBox, 1);
        if (e6v.A02) {
            boolean z = !igdsCheckBox.isChecked();
            igdsCheckBox.setChecked(z);
            C34952Fac c34952Fac = this.A07;
            C36685GFf c36685GFf = this.A02;
            String str = "searchController";
            if (c36685GFf != null) {
                boolean z2 = c36685GFf.A03;
                if (z) {
                    C34952Fac.A00(e6v, c34952Fac, z2);
                } else {
                    e6v.A04 = false;
                    java.util.Set set = c34952Fac.A03;
                    Iterator it = set.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C14360o3.A0K(it.next(), e6v)) {
                                e6v2 = e6v;
                                break;
                            }
                        } else {
                            e6v2 = null;
                            break;
                        }
                    }
                    C15500q5.A00(set).remove(e6v2);
                    FKK fkk = c34952Fac.A01;
                    DirectShareTarget directShareTarget = e6v.A07;
                    C14360o3.A0B(directShareTarget, 0);
                    fkk.A01.add(directShareTarget);
                    fkk.A00.remove(directShareTarget);
                    fkk.A02.remove(directShareTarget);
                    FIQ fiq = c34952Fac.A02;
                    C34701FQm c34701FQm = new C34701FQm(directShareTarget);
                    java.util.Set set2 = fiq.A00;
                    if (set2.contains(c34701FQm)) {
                        set2.remove(c34701FQm);
                    } else {
                        fiq.A01.add(c34701FQm);
                    }
                }
                EQ6 eq6 = this.A01;
                if (eq6 == null) {
                    str = "directListAdapter";
                } else {
                    java.util.Set set3 = c34952Fac.A03;
                    ImmutableList A0L = AbstractC31173DnH.A0L(set3);
                    List list = eq6.A0B;
                    list.clear();
                    list.addAll(A0L);
                    List list2 = eq6.A0C;
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator<E> it2 = A0L.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        E6V e6v3 = (E6V) next;
                        if (e6v3.A03 && !list2.contains(e6v3)) {
                            A1E.add(next);
                        }
                    }
                    list2.addAll(A1E);
                    if (eq6.A09 == C05F.A01) {
                        List list3 = eq6.A0D;
                        ArrayList A1E2 = AbstractC166987dD.A1E();
                        Iterator<E> it3 = A0L.iterator();
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            E6V e6v4 = (E6V) next2;
                            if (e6v4.A03 && !list3.contains(e6v4)) {
                                A1E2.add(next2);
                            }
                        }
                        list3.addAll(A1E2);
                    }
                    C36685GFf c36685GFf2 = this.A02;
                    if (c36685GFf2 != null) {
                        c36685GFf2.A06.setVisibility(8);
                        IgdsInlineSearchBox igdsInlineSearchBox = c36685GFf2.A0A;
                        igdsInlineSearchBox.A0E.setText("");
                        InterfaceC169357h9 interfaceC169357h9 = c36685GFf2.A00;
                        if (interfaceC169357h9 != null) {
                            interfaceC169357h9.Eby("");
                            igdsInlineSearchBox.A03();
                            int size = set3.size();
                            IgdsButton igdsButton = this.A03;
                            if (igdsButton != null) {
                                igdsButton.setEnabled(AbstractC167007dF.A1O(size));
                                return;
                            }
                            return;
                        }
                        str = "searchProvider";
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC37165GZc
    public final boolean EiP(E6V e6v) {
        Integer A03;
        UserSession A0r = AbstractC166987dD.A0r(this.A08);
        DirectShareTarget directShareTarget = e6v.A07;
        int i = requireArguments().getInt("DirectShareSheetConstants.message_request_limit");
        int i2 = requireArguments().getInt("DirectShareSheetConstants.message_request_count");
        if (!directShareTarget.A0N()) {
            if (directShareTarget.A0V() && !directShareTarget.A0G()) {
                if (i2 < i || !C18U.A06(AbstractC25225BEi.A0j(A0r, 0), A0r, 36315640704929233L)) {
                    boolean z = requireArguments().getBoolean("DirectShareSheetConstants.is_forwarding_restricted_content_type");
                    if (directShareTarget.A0V() && !directShareTarget.A0G()) {
                        if ((!z && (directShareTarget.A03() == null || (A03 = directShareTarget.A03()) == null || A03.intValue() != 5)) || !AbstractC1337462f.A00(A0r)) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        boolean z = this.A06;
        Resources A0N = AbstractC166997dE.A0N(this);
        int i = 2131974046;
        if (z) {
            i = 2131961650;
        }
        AbstractC31176DnK.A1C(ViewOnClickListenerC35691FpR.A00(this, 48), AbstractC31179DnN.A0B(interfaceC56362iU, AbstractC166997dE.A0q(A0N, i)), interfaceC56362iU);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A06 = requireArguments().getBoolean("is_edit_mode");
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A08;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        Integer num = C05F.A01;
        List<DirectShareTarget> list = null;
        EQ6 eq6 = new EQ6(requireContext, this, A0r, this, this, num, null);
        this.A01 = eq6;
        eq6.A00 = new C34624FNh(requireContext(), null, null, 0, false);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) AbstractC166997dE.A0R(view, R.id.search_box);
        igdsInlineSearchBox.setHint(2131974045);
        igdsInlineSearchBox.setTextsize(AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material));
        View A0S = AbstractC166997dE.A0S(view, R.id.search_exit_button);
        Context requireContext2 = requireContext();
        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
        C08790ch A00 = AbstractC018607g.A00(this);
        EQ6 eq62 = this.A01;
        if (eq62 != null) {
            this.A02 = new C36685GFf(requireContext2, AbstractC166987dD.A0b(), A0S, A00, this, A0r2, eq62, igdsInlineSearchBox, num);
            igdsInlineSearchBox.A00 = new ViewOnFocusChangeListenerC35693FpT(0, A0S, this);
            C0fQ.A00(new ViewOnClickListenerC35684FpJ(18, igdsInlineSearchBox, this, A0S), A0S);
            String string = requireArguments().getString("shortcut_emoji");
            if (string == null) {
                string = (String) AbstractC001800i.A0G(AbstractC16960so.A1Q("👯", "🤓", "🤘", "✨", "🤩", "🔥", "⭐", "😈", "🙃", "🫠", "🤡", "💀️", "💻", "🎮", "🏀", "⚽", "🎒", "📚️", "🍕"), AbstractC50712Us.A00);
            }
            this.A04 = string;
            View A0R = AbstractC166997dE.A0R(requireView(), R.id.emoji_picker_container);
            AbstractC166987dD.A1P(requireContext(), AbstractC167007dF.A0N(requireView(), R.id.shortcut_emoji_text), 2131974047);
            this.A00 = (IgSimpleImageView) requireView().requireViewById(R.id.shortcut_emoji_button);
            int A0F = AbstractC53242c7.A0F(requireContext(), R.attr.igds_color_elevated_highlight_background);
            IgSimpleImageView igSimpleImageView = this.A00;
            if (igSimpleImageView != null) {
                igSimpleImageView.setBackground(AMo.A03(A0F));
            }
            IgSimpleImageView igSimpleImageView2 = this.A00;
            if (igSimpleImageView2 != null) {
                AMo.A07(igSimpleImageView2, string);
            }
            ViewOnClickListenerC35691FpR.A01(A0R, 50, this);
            View A0R2 = AbstractC166997dE.A0R(view, R.id.search_box);
            RecyclerView A0D = AbstractC31178DnM.A0D(view);
            AbstractC31178DnM.A0z(this, A0D);
            EQ6 eq63 = this.A01;
            if (eq63 != null) {
                A0D.setAdapter(eq63);
                E0L.A00(A0D, A0R2, 11);
                TextView A0N = AbstractC167007dF.A0N(requireView(), R.id.audience_picker_disclaimer_text);
                AbstractC166987dD.A1P(requireContext(), A0N, 2131974044);
                A0N.setVisibility(0);
                ArrayList parcelableArrayList = requireArguments().getParcelableArrayList("DirectShareSheetConstants.selected_share_targets");
                if (parcelableArrayList != null) {
                    list = AbstractC001800i.A0X(parcelableArrayList);
                }
                this.A05 = list;
                if (list != null) {
                    EQ6 eq64 = this.A01;
                    if (eq64 != null) {
                        eq64.A01(list);
                        for (DirectShareTarget directShareTarget : list) {
                            C34952Fac c34952Fac = this.A07;
                            E6V e6v = new E6V(directShareTarget, num, 0, true, true, false, false);
                            C36685GFf c36685GFf = this.A02;
                            str = "searchController";
                            if (c36685GFf != null) {
                                C34952Fac.A00(e6v, c34952Fac, c36685GFf.A03);
                            } else {
                                C14360o3.A0F(str);
                                throw C00O.createAndThrow();
                            }
                        }
                    }
                }
                IgdsButton A0W = AbstractC31173DnH.A0W(requireView(), R.id.done_button);
                A0W.setEnabled(false);
                int i = 2131974043;
                if (this.A06) {
                    i = 2131972699;
                }
                A0W.setText(i);
                this.A03 = A0W;
                int size = this.A07.A03.size();
                IgdsButton igdsButton = this.A03;
                if (igdsButton != null) {
                    igdsButton.setEnabled(AbstractC167007dF.A1O(size));
                }
                IgdsButton igdsButton2 = this.A03;
                if (igdsButton2 != null) {
                    ViewOnClickListenerC35691FpR.A01(igdsButton2, 49, this);
                }
                IgdsButton igdsButton3 = this.A03;
                if (igdsButton3 != null) {
                    igdsButton3.setVisibility(0);
                    return;
                }
                return;
            }
        }
        str = "directListAdapter";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37165GZc
    public final void DAQ(E6V e6v) {
        Integer A03;
        DirectShareTarget directShareTarget = e6v.A07;
        int i = requireArguments().getInt("DirectShareSheetConstants.message_request_limit");
        int i2 = requireArguments().getInt("DirectShareSheetConstants.message_request_count");
        boolean z = requireArguments().getBoolean("DirectShareSheetConstants.is_forwarding");
        boolean z2 = requireArguments().getBoolean("DirectShareSheetConstants.is_forwarding_restricted_content_type");
        if (directShareTarget.A0N()) {
            Spanned A0B = AbstractC31173DnH.A0B(AbstractC166997dE.A0N(this), directShareTarget.A0A(), 2131964663);
            C14360o3.A07(A0B);
            AbstractC25233BEq.A1F(AbstractC31173DnH.A0X(A0B));
            return;
        }
        if (!directShareTarget.A0V() || directShareTarget.A0G()) {
            return;
        }
        CharSequence charSequence = "";
        if (i2 >= i) {
            charSequence = getString(2131966368);
            AbstractC35215Fg8.A04(this, AbstractC166987dD.A0r(this.A08), directShareTarget.A06(), z);
        } else if (directShareTarget.A03() != null && (A03 = directShareTarget.A03()) != null && A03.intValue() == 5) {
            Resources A0N = AbstractC166997dE.A0N(this);
            int i3 = 2131964662;
            if (z) {
                i3 = 2131964659;
            }
            String str = directShareTarget.A0I;
            if (str == null) {
                str = "";
            }
            charSequence = AbstractC31173DnH.A0B(A0N, str, i3);
            AbstractC35215Fg8.A03(this, AbstractC166987dD.A0r(this.A08), directShareTarget.A06(), z);
        } else if (z2) {
            Resources A0N2 = AbstractC166997dE.A0N(this);
            String str2 = directShareTarget.A0I;
            if (str2 == null) {
                str2 = "";
            }
            charSequence = AbstractC31173DnH.A0B(A0N2, str2, 2131966089);
            AbstractC35215Fg8.A02(this, AbstractC166987dD.A0r(this.A08), directShareTarget.A06());
        }
        Context requireContext = requireContext();
        int i4 = 2131973724;
        if (z) {
            i4 = 2131962815;
        }
        AbstractC35254Fgn.A05(requireContext, charSequence, getString(i4));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A09;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC25227BEk.A1B(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-88139081);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_shortcuts_audience_picker, viewGroup, false);
        C0f9.A09(-2098587848, A02);
        return inflate;
    }
}
