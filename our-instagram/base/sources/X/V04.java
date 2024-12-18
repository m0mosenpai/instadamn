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
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class V04 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceLocationsRegionalFragmentV2";
    public EditText A00;
    public TextView A01;
    public RecyclerView A02;
    public TextView A03;
    public RecyclerView A04;
    public UGa A05;
    public final InterfaceC09390do A0B = new C60842q8(new X55(this, 45), new X55(this, 46), new C57253Pbb(30, null, this), new C0YZ(UFT.class));
    public final InterfaceC09390do A08 = X55.A00(this, 43);
    public final InterfaceC09390do A09 = X55.A00(this, 44);
    public final C69678VtN A07 = new C69678VtN();
    public final TextWatcher A0C = new WKU(this, 6);
    public final XAA A0D = new C70643WeO(this);
    public final XAC A06 = new C70649WeV(this);
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);

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
        this.A03 = (TextView) view.requireViewById(R.id.search_empty_state_text_view);
        this.A04 = (RecyclerView) view.requireViewById(R.id.selected_locations_recycler_view);
        this.A02 = (RecyclerView) view.requireViewById(R.id.typeahead_recycler_view);
        UGa uGa = new UGa(this.A0D);
        this.A05 = uGa;
        RecyclerView recyclerView = this.A02;
        if (recyclerView == null) {
            str = "locationsTypeaheadRecyclerView";
        } else {
            recyclerView.setAdapter(uGa);
            UGX ugx = new UGX(this, 0);
            RecyclerView recyclerView2 = this.A04;
            if (recyclerView2 == null) {
                str = "selectedLocationsRecyclerView";
            } else {
                recyclerView2.setAdapter(ugx);
                EditText editText = this.A00;
                str = "searchEditText";
                if (editText != null) {
                    editText.setHint(2131970518);
                    EditText editText2 = this.A00;
                    if (editText2 != null) {
                        editText2.addTextChangedListener(this.A0C);
                        TextView textView = this.A03;
                        if (textView == null) {
                            str = "searchEmptyStateTextView";
                        } else {
                            textView.setText(2131970517);
                            A00(this, new ArrayList());
                            this.A01 = (TextView) view.requireViewById(R.id.overlapping_location_warning_text);
                            C57312k6 A0a = AbstractC25229BEm.A0a(this);
                            AbstractC23641Du.A05(AnonymousClass191.A00, new MCK(ugx, this, (InterfaceC23621Ds) null, 10), A0a);
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(V04 v04, List list) {
        String str;
        EditText editText = v04.A00;
        if (editText == null) {
            str = "searchEditText";
        } else {
            Editable text = editText.getText();
            C14360o3.A07(text);
            int i = 0;
            boolean A1N = AbstractC167007dF.A1N(text.length());
            TextView textView = v04.A03;
            if (textView == null) {
                str = "searchEmptyStateTextView";
            } else {
                int i2 = 8;
                if (A1N) {
                    i2 = 0;
                }
                textView.setVisibility(i2);
                RecyclerView recyclerView = v04.A04;
                if (recyclerView == null) {
                    str = "selectedLocationsRecyclerView";
                } else {
                    if (!A1N) {
                        i = 8;
                    }
                    recyclerView.setVisibility(i);
                    UGa uGa = v04.A05;
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
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0A.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1860162213);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_create_audience_locations_regional_view, viewGroup, false);
        C0f9.A09(-1852370027, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-400661503);
        super.onDestroyView();
        C0f9.A09(1307784664, A02);
    }
}
