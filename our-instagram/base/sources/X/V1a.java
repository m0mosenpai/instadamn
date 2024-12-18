package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class V1a extends C38K implements InterfaceC60072op, GZS, InterfaceC60122ou, XA0 {
    public static final String __redex_internal_original_name = "MediaLoggerListFragment";
    public UserSession A00;
    public TypeaheadHeader A01;
    public C67913V2d A02;
    public C19320xG A03;
    public String A04;
    public final GYX A05 = new C71104Wo1(this, 1);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "media_logger";
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return this.A00;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        TypeaheadHeader typeaheadHeader = this.A01;
        if (typeaheadHeader != null) {
            typeaheadHeader.A01();
            return false;
        }
        return false;
    }

    @Override // X.GZS
    public final void registerTextViewLogging(TextView textView) {
        textView.addTextChangedListener(C106904rr.A00(this.A00));
    }

    @Override // X.GZS
    public final void searchTextChanged(String str) {
        C67913V2d c67913V2d;
        ArrayList A00;
        ArrayList arrayList = new ArrayList(this.A03.A00.A01());
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.toLowerCase().split("\\s+");
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnalyticsEventDebugInfo analyticsEventDebugInfo = (AnalyticsEventDebugInfo) it.next();
                int length = split.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        String str2 = split[i];
                        String str3 = analyticsEventDebugInfo.A00;
                        str3.getClass();
                        if (str3.contains(str2)) {
                            i++;
                        }
                    } else {
                        arrayList2.add(analyticsEventDebugInfo);
                        break;
                    }
                }
            }
            c67913V2d = this.A02;
            A00 = VTC.A00(this.A04, arrayList2);
        } else {
            c67913V2d = this.A02;
            A00 = VTC.A00(this.A04, arrayList);
        }
        List list = c67913V2d.A00;
        list.clear();
        list.addAll(A00);
        C67913V2d.A00(c67913V2d);
    }

    @Override // X.XA0
    public final void DEY(AnalyticsEventDebugInfo analyticsEventDebugInfo) {
        AbstractC68357VNr.A00(getActivity(), analyticsEventDebugInfo, this.A00).A04();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131966092);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(247775329);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = AbstractC31176DnK.A0S(this);
        this.A04 = requireArguments.getString("media_id", "");
        this.A03 = C19320xG.A00();
        C67913V2d c67913V2d = new C67913V2d(requireContext(), this, this.A05, VTC.A00(this.A04, new ArrayList(this.A03.A00.A01())));
        this.A02 = c67913V2d;
        A0U(c67913V2d);
        C0f9.A09(1105038240, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1942086546);
        this.A01 = new TypeaheadHeader(layoutInflater.getContext());
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C0f9.A09(575437395, A02);
        return onCreateView;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1148573713);
        super.onDestroyView();
        AbstractC05560Rg.A00(this);
        ((AbstractC05560Rg) this).A04.setOnScrollListener(null);
        this.A01 = null;
        C0f9.A09(-929485548, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-671342286);
        super.onPause();
        TypeaheadHeader typeaheadHeader = this.A01;
        if (typeaheadHeader != null) {
            typeaheadHeader.A01();
        }
        C0f9.A09(1717444162, A02);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1204976597);
        super.onResume();
        C67913V2d c67913V2d = this.A02;
        ArrayList A00 = VTC.A00(this.A04, new ArrayList(this.A03.A00.A01()));
        List list = c67913V2d.A00;
        list.clear();
        list.addAll(A00);
        C67913V2d.A00(c67913V2d);
        C0f9.A09(20135133, A02);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TypeaheadHeader typeaheadHeader = this.A01;
        typeaheadHeader.getClass();
        typeaheadHeader.A02();
        typeaheadHeader.A01 = this;
        typeaheadHeader.A03(requireContext().getString(2131971480));
        AbstractC05560Rg.A00(this);
        ((AbstractC05560Rg) this).A04.setOnScrollListener(typeaheadHeader.A04);
        AbstractC05560Rg.A00(this);
        ((AbstractC05560Rg) this).A04.setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
    }
}
