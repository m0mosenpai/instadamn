package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class ELb extends AbstractC59962oe implements InterfaceC60072op, InterfaceC37165GZc {
    public static final String __redex_internal_original_name = "DirectShareSheetSearchFragment";
    public EQ6 A00;
    public C36685GFf A01;
    public String A02;
    public String A03;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);
    public ArrayList A04 = AbstractC166987dD.A1E();
    public ArrayList A05 = AbstractC166987dD.A1E();
    public final InterfaceC09390do A06 = C1XM.A00(new C50153MDg(this, 29));

    @Override // X.InterfaceC37165GZc
    public final void Cxl(E6V e6v, IgdsCheckBox igdsCheckBox) {
        C14360o3.A0B(igdsCheckBox, 1);
        igdsCheckBox.setChecked(!igdsCheckBox.isChecked());
        Intent putExtra = AbstractC31171DnF.A04().putExtra("bundle_extra_share_target", e6v.A07);
        C14360o3.A07(putExtra);
        AbstractC31176DnK.A18(putExtra, this);
        AbstractC25227BEk.A1B(this);
    }

    @Override // X.InterfaceC37165GZc
    public final void DAQ(E6V e6v) {
        Integer A03;
        Context requireContext;
        String string;
        Resources A0N;
        int i;
        CharSequence A0B;
        DirectShareTarget directShareTarget = e6v.A07;
        int i2 = requireArguments().getInt("DirectShareSheetConstants.message_request_limit");
        int i3 = requireArguments().getInt("DirectShareSheetConstants.message_request_count");
        boolean z = requireArguments().getBoolean("DirectShareSheetConstants.is_forwarding");
        boolean z2 = requireArguments().getBoolean("DirectShareSheetConstants.is_forwarding_restricted_content_type");
        if (A00()) {
            requireContext = requireContext();
            string = getString(2131962816);
            A0B = getString(2131962814);
        } else {
            if (directShareTarget.A0N()) {
                Spanned A0B2 = AbstractC31173DnH.A0B(AbstractC166997dE.A0N(this), directShareTarget.A0A(), 2131964663);
                C14360o3.A07(A0B2);
                AbstractC25233BEq.A1F(AbstractC31173DnH.A0X(A0B2));
                return;
            }
            if (directShareTarget.A0Q.size() == 1 && ((PendingRecipient) directShareTarget.A0Q.get(0)).A0Z && AbstractC31178DnM.A1a(this.A06)) {
                String A14 = AbstractC31172DnG.A14(directShareTarget);
                requireContext = requireContext();
                if (z) {
                    string = getString(2131962815);
                    A0N = AbstractC166997dE.A0N(this);
                    i = 2131959410;
                } else {
                    string = getString(2131973724);
                    A0N = AbstractC166997dE.A0N(this);
                    i = 2131960453;
                }
                A0B = AbstractC31173DnH.A0B(A0N, A14, i);
            } else {
                if (!directShareTarget.A0V() || directShareTarget.A0G()) {
                    return;
                }
                CharSequence charSequence = "";
                if (i3 >= i2) {
                    charSequence = getString(2131966368);
                    AbstractC35215Fg8.A04(this, AbstractC166987dD.A0r(this.A07), directShareTarget.A06(), z);
                } else if (directShareTarget.A03() != null && (A03 = directShareTarget.A03()) != null && A03.intValue() == 5) {
                    Resources A0N2 = AbstractC166997dE.A0N(this);
                    int i4 = 2131964662;
                    if (z) {
                        i4 = 2131964659;
                    }
                    String str = directShareTarget.A0I;
                    if (str == null) {
                        str = "";
                    }
                    charSequence = AbstractC31173DnH.A0B(A0N2, str, i4);
                    AbstractC35215Fg8.A03(this, AbstractC166987dD.A0r(this.A07), directShareTarget.A06(), z);
                } else if (z2) {
                    Resources A0N3 = AbstractC166997dE.A0N(this);
                    String str2 = directShareTarget.A0I;
                    if (str2 == null) {
                        str2 = "";
                    }
                    charSequence = AbstractC31173DnH.A0B(A0N3, str2, 2131966089);
                    AbstractC35215Fg8.A02(this, AbstractC166987dD.A0r(this.A07), directShareTarget.A06());
                }
                Context requireContext2 = requireContext();
                int i5 = 2131973724;
                if (z) {
                    i5 = 2131962815;
                }
                AbstractC35254Fgn.A05(requireContext2, charSequence, getString(i5));
                return;
            }
        }
        AbstractC35254Fgn.A05(requireContext, A0B, string);
    }

    @Override // X.InterfaceC37165GZc
    public final boolean EiP(E6V e6v) {
        Integer A03;
        if (!A00()) {
            UserSession A0r = AbstractC166987dD.A0r(this.A07);
            DirectShareTarget directShareTarget = e6v.A07;
            int i = requireArguments().getInt("DirectShareSheetConstants.message_request_limit");
            int i2 = requireArguments().getInt("DirectShareSheetConstants.message_request_count");
            if (!directShareTarget.A0N()) {
                if (directShareTarget.A0V() && !directShareTarget.A0G()) {
                    if (i2 < i || !C18U.A06(AbstractC25225BEi.A0j(A0r, 0), A0r, 36315640704929233L)) {
                        boolean z = requireArguments().getBoolean("DirectShareSheetConstants.is_forwarding_restricted_content_type");
                        if (directShareTarget.A0V() && !directShareTarget.A0G() && ((z || (directShareTarget.A03() != null && (A03 = directShareTarget.A03()) != null && A03.intValue() == 5)) && AbstractC1337462f.A00(A0r))) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
                if (directShareTarget.A0Q.size() == 1 && ((PendingRecipient) directShareTarget.A0Q.get(0)).A0Z && AbstractC31178DnM.A1a(this.A06)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_sharesheet_search_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A07;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        ArrayList arrayList = this.A04;
        Integer num = C05F.A00;
        EQ6 eq6 = new EQ6(requireContext, this, A0r, this, null, num, arrayList);
        this.A00 = eq6;
        ArrayList arrayList2 = this.A05;
        if (arrayList2 != null) {
            eq6.A01(arrayList2);
        }
        View A0S = AbstractC166997dE.A0S(view, R.id.search_exit_button);
        ViewOnClickListenerC35691FpR.A01(A0S, 47, this);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) AbstractC166997dE.A0S(view, R.id.search_box);
        igdsInlineSearchBox.setTextsize(AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material));
        igdsInlineSearchBox.setSearchGlyphColor(AbstractC167007dF.A09(requireContext(), R.attr.igds_color_secondary_text));
        igdsInlineSearchBox.setImeOptions(6);
        igdsInlineSearchBox.postDelayed(new GLG(igdsInlineSearchBox), 150L);
        Context requireContext2 = requireContext();
        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
        C08790ch A00 = AbstractC018607g.A00(this);
        EQ6 eq62 = this.A00;
        if (eq62 != null) {
            C36685GFf c36685GFf = new C36685GFf(requireContext2, requireArguments(), A0S, A00, this, A0r2, eq62, igdsInlineSearchBox, num);
            this.A01 = c36685GFf;
            c36685GFf.A01 = this.A02;
            c36685GFf.A02 = this.A03;
            View A0R = AbstractC166997dE.A0R(view, R.id.search_box);
            RecyclerView A0D = AbstractC31178DnM.A0D(view);
            AbstractC31178DnM.A0z(this, A0D);
            EQ6 eq63 = this.A00;
            if (eq63 != null) {
                A0D.setAdapter(eq63);
                E0L.A00(A0D, A0R, 10);
                return;
            }
        }
        AbstractC31171DnF.A0t();
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    private final boolean A00() {
        int i = requireArguments().getInt("DirectShareSheetConstants.forwarding_messages_limit");
        int i2 = requireArguments().getInt("DirectShareSheetConstants.forwarding_messages_count");
        if (requireArguments().getBoolean("DirectShareSheetConstants.is_forwarding") && i2 >= i) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        requireActivity().setResult(0, null);
        AbstractC25227BEk.A1B(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1287770203);
        super.onCreate(bundle);
        this.A04 = requireArguments().getParcelableArrayList("DirectShareSheetConstants.initial_share_targets");
        this.A05 = requireArguments().getParcelableArrayList("DirectShareSheetConstants.selected_share_targets");
        this.A02 = requireArguments().getString("DirectShareSheetConstants.session_id");
        this.A03 = requireArguments().getString("DirectShareSheetConstants.sub_session_id");
        C0f9.A09(-1365556932, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-282438333);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_sharesheet_search, viewGroup, false);
        C0f9.A09(-1165390879, A02);
        return inflate;
    }
}
