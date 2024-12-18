package X;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class V0H extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromoteSearchAddressFragment";
    public EditText A00;
    public RecyclerView A01;
    public C70399WUb A02;
    public C68955Vet A03;
    public UGa A04;
    public XAB A05;
    public final C69678VtN A08 = new C69678VtN();
    public final TextWatcher A06 = new WKU(this, 7);
    public final C70644WeP A07 = new C70644WeP(this);
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970507);
        AbstractC50523MSb.A1E(interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_search_address";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        EditText editText = (EditText) view.requireViewById(R.id.search_bar_edit_text);
        this.A00 = editText;
        String str = "searchEditText";
        if (editText != null) {
            editText.setHint(2131970507);
            EditText editText2 = this.A00;
            if (editText2 != null) {
                editText2.addTextChangedListener(this.A06);
                EditText editText3 = this.A00;
                if (editText3 != null) {
                    WNO.A00(editText3, 8, this);
                    this.A01 = (RecyclerView) view.findViewById(R.id.typeahead_recycler_view);
                    UGa uGa = new UGa(this.A07);
                    this.A04 = uGa;
                    RecyclerView recyclerView = this.A01;
                    if (recyclerView == null) {
                        str = "addressTypeaheadRecyclerView";
                    } else {
                        recyclerView.setAdapter(uGa);
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
        return (AbstractC18680vv) this.A09.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C68955Vet c68955Vet;
        int A02 = C0f9.A02(-1519717030);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A09;
        this.A02 = AbstractC43594JPz.A0N(interfaceC09390do);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            c68955Vet = new C68955Vet(activity, this, (UserSession) interfaceC09390do.getValue());
        } else {
            c68955Vet = null;
        }
        this.A03 = c68955Vet;
        C0f9.A09(1466500603, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1936267091);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_create_audience_search_address, viewGroup, false);
        C0f9.A09(-394619300, A02);
        return inflate;
    }
}
