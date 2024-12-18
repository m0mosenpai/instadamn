package X;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.V0g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67875V0g extends AbstractC59962oe implements XAF {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceLocationsRegionalFragment";
    public EditText A00;
    public TextView A01;
    public RecyclerView A02;
    public RecyclerView A03;
    public UGa A04;
    public UGb A05;
    public TextView A07;
    public final InterfaceC09390do A0E = X55.A00(this, 40);
    public final InterfaceC09390do A0F = X55.A00(this, 41);
    public final InterfaceC09390do A0G = X55.A00(this, 42);
    public final InterfaceC09390do A0C = X55.A00(this, 38);
    public final InterfaceC09390do A0D = X55.A00(this, 39);
    public List A06 = new ArrayList();
    public final C69678VtN A0B = new C69678VtN();
    public final TextWatcher A08 = new WKU(this, 5);
    public final XAA A09 = new C70642WeN(this);
    public final XAC A0A = new C70648WeU(this);

    @Override // X.XAF
    public final void Dc7(PromoteState promoteState, Integer num) {
        List list;
        List list2;
        C14360o3.A0B(num, 1);
        Integer num2 = C05F.A15;
        if (num == num2) {
            C70179WFe c70179WFe = VZI.A00;
            InterfaceC09390do interfaceC09390do = this.A0E;
            if (!C70179WFe.A04(((PromoteData) AbstractC166987dD.A17(interfaceC09390do)).A0q.A07) && (list2 = this.A06) != null && !list2.isEmpty()) {
                List list3 = ((PromoteData) AbstractC166987dD.A17(interfaceC09390do)).A0q.A07;
                if (list3 != null) {
                    List list4 = this.A06;
                    if (list4 != null) {
                        list3.removeAll(list4);
                        this.A06 = null;
                        PromoteState promoteState2 = (PromoteState) this.A0F.getValue();
                        PromoteData promoteData = (PromoteData) AbstractC166987dD.A17(interfaceC09390do);
                        C14360o3.A0B(promoteData, 0);
                        PromoteAudienceInfo promoteAudienceInfo = promoteData.A0q;
                        C14360o3.A06(promoteAudienceInfo);
                        C69649Vsq A00 = AbstractC68446VRc.A00(promoteAudienceInfo);
                        A00.A07 = list3;
                        promoteData.A0q = A00.A00();
                        PromoteState.A01(promoteState2, num2);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            return;
        }
        Integer num3 = C05F.A1F;
        if (num != num3) {
            return;
        }
        InterfaceC09390do interfaceC09390do2 = this.A0E;
        List list5 = ((PromoteData) AbstractC166987dD.A17(interfaceC09390do2)).A0p.A07;
        if (list5 == null || list5.isEmpty()) {
            return;
        }
        C70179WFe c70179WFe2 = VZI.A00;
        if (C70179WFe.A04(list5) || (list = this.A06) == null || list.isEmpty()) {
            return;
        }
        List list6 = this.A06;
        if (list6 != null) {
            list5.removeAll(list6);
            this.A06 = null;
            PromoteState promoteState3 = (PromoteState) this.A0F.getValue();
            PromoteData promoteData2 = (PromoteData) AbstractC166987dD.A17(interfaceC09390do2);
            C14360o3.A0B(promoteData2, 0);
            PromoteAudienceInfo promoteAudienceInfo2 = promoteData2.A0p;
            C14360o3.A06(promoteAudienceInfo2);
            C69649Vsq A002 = AbstractC68446VRc.A00(promoteAudienceInfo2);
            A002.A07 = list5;
            promoteData2.A0p = A002.A00();
            PromoteState.A01(promoteState3, num3);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_create_audience_locations_regional";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = (EditText) view.requireViewById(R.id.search_bar_edit_text);
        this.A01 = (TextView) view.requireViewById(R.id.search_empty_state_text_view);
        this.A03 = (RecyclerView) view.requireViewById(R.id.selected_locations_recycler_view);
        this.A02 = (RecyclerView) view.requireViewById(R.id.typeahead_recycler_view);
        UGa uGa = new UGa(this.A09);
        this.A04 = uGa;
        RecyclerView recyclerView = this.A02;
        if (recyclerView == null) {
            str = "locationsTypeaheadRecyclerView";
        } else {
            recyclerView.setAdapter(uGa);
            PromoteData promoteData = (PromoteData) AbstractC166987dD.A17(this.A0E);
            InterfaceC09390do interfaceC09390do = this.A0F;
            UGb uGb = new UGb(this.A0A, promoteData, (PromoteState) interfaceC09390do.getValue());
            this.A05 = uGb;
            RecyclerView recyclerView2 = this.A03;
            if (recyclerView2 == null) {
                str = "selectedLocationsRecyclerView";
            } else {
                recyclerView2.setAdapter(uGb);
                EditText editText = this.A00;
                if (editText != null) {
                    editText.setHint(2131970518);
                    EditText editText2 = this.A00;
                    if (editText2 != null) {
                        editText2.addTextChangedListener(this.A08);
                        TextView textView = this.A01;
                        if (textView == null) {
                            str = "searchEmptyStateTextView";
                        } else {
                            textView.setText(2131970517);
                            A01(this, new ArrayList());
                            this.A07 = (TextView) view.requireViewById(R.id.overlapping_location_warning_text);
                            if (this.mUserVisibleHint) {
                                PromoteState.A01((PromoteState) interfaceC09390do.getValue(), C05F.A1I);
                            }
                            ((PromoteState) interfaceC09390do.getValue()).A0A(this);
                            return;
                        }
                    }
                }
                C14360o3.A0F("searchEditText");
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r0.isEmpty() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C67875V0g r4) {
        /*
            java.util.List r0 = r4.A06
            r3 = 0
            if (r0 == 0) goto Lc
            boolean r0 = r0.isEmpty()
            r2 = 0
            if (r0 == 0) goto Ld
        Lc:
            r2 = 1
        Ld:
            java.lang.String r0 = "overlappingWarningTextView"
            android.widget.TextView r1 = r4.A07
            if (r2 != 0) goto L36
            if (r1 == 0) goto L3e
            r1.setVisibility(r3)
            android.widget.TextView r3 = r4.A07
            if (r3 == 0) goto L3e
            r2 = 2131952241(0x7f130271, float:1.954092E38)
            X.WFe r0 = X.VZI.A00
            android.content.Context r1 = r4.requireContext()
            java.util.List r0 = r4.A06
            if (r0 == 0) goto L31
            java.lang.String r0 = X.C70179WFe.A02(r1, r0)
            X.AbstractC31177DnL.A10(r3, r4, r0, r2)
            return
        L31:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        L36:
            if (r1 == 0) goto L3e
            r0 = 8
            r1.setVisibility(r0)
            return
        L3e:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67875V0g.A00(X.V0g):void");
    }

    public static final void A01(C67875V0g c67875V0g, List list) {
        String str;
        EditText editText = c67875V0g.A00;
        if (editText == null) {
            str = "searchEditText";
        } else {
            Editable text = editText.getText();
            C14360o3.A07(text);
            int i = 0;
            boolean A1N = AbstractC167007dF.A1N(text.length());
            TextView textView = c67875V0g.A01;
            if (textView == null) {
                str = "searchEmptyStateTextView";
            } else {
                int i2 = 8;
                if (A1N) {
                    i2 = 0;
                }
                textView.setVisibility(i2);
                RecyclerView recyclerView = c67875V0g.A03;
                if (recyclerView == null) {
                    str = "selectedLocationsRecyclerView";
                } else {
                    if (!A1N) {
                        i = 8;
                    }
                    recyclerView.setVisibility(i);
                    UGa uGa = c67875V0g.A04;
                    if (uGa == null) {
                        str = "locationTypeaheadAdapter";
                    } else {
                        if (A1N) {
                            list = C16930sl.A00;
                        }
                        uGa.A00 = list;
                        uGa.notifyDataSetChanged();
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return (AbstractC18680vv) AbstractC166987dD.A17(this.A0G);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(875642340);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_create_audience_locations_regional_view, viewGroup, false);
        C0f9.A09(-202946310, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(762708562);
        ((PromoteState) this.A0F.getValue()).A0B(this);
        super.onDestroyView();
        C0f9.A09(-837946533, A02);
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        super.onSetUserVisibleHint(z, z2);
        if (z) {
            PromoteState.A01((PromoteState) this.A0F.getValue(), C05F.A1I);
        }
    }
}
