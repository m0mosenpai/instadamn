package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import com.facebook.R;
import java.util.List;

/* loaded from: classes6.dex */
public final class ENm extends C53Z implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "EditAccountCategoryFragment";
    public int A00;
    public LayoutInflater A01;
    public RadioGroup A02;
    public List A03;
    public final List A05 = AbstractC166987dD.A1E();
    public final C31702Dw7 A04 = new C31702Dw7(this, 5);

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31176DnK.A1C(ViewOnClickListenerC31723DwS.A00(this, 13), AbstractC31176DnK.A0I(), interfaceC56362iU);
        ?? obj = new Object();
        C35197Ffp.A02(AbstractC166997dE.A0N(this), obj, 2131952058);
        C31722DwR.A01(ViewOnClickListenerC31723DwS.A00(this, 14), interfaceC56362iU, obj);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "edit_account_category";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1224697621);
        super.onCreate(bundle);
        registerLifecycleListener(new EVO(getActivity()));
        C25621Ms A0D = AbstractC31179DnN.A0D(getSession());
        A0D.A0B("hpi_accounts/get_account_category/");
        C1ON A0e = AbstractC25227BEk.A0e(A0D, C32179ECa.class, FWV.class);
        A0e.A00 = this.A04;
        schedule(A0e);
        C0f9.A09(900144949, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(785295039);
        C14360o3.A0B(layoutInflater, 0);
        this.A01 = layoutInflater;
        View inflate = layoutInflater.inflate(R.layout.account_category_list, viewGroup, false);
        RadioGroup radioGroup = (RadioGroup) inflate.requireViewById(R.id.edit_account_category_radio_group);
        this.A02 = radioGroup;
        if (radioGroup == null) {
            C14360o3.A0F("radioGroup");
            throw C00O.createAndThrow();
        }
        radioGroup.setOnCheckedChangeListener(new C35748Fqg(this, 2));
        C0f9.A09(1671610946, A02);
        return inflate;
    }
}
