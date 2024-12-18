package com.instagram.analytics.eventlog;

import X.AbstractC05560Rg;
import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC60492pY;
import X.AbstractC68357VNr;
import X.C0f9;
import X.C106904rr;
import X.C19320xG;
import X.C38K;
import X.C67913V2d;
import X.C71104Wo1;
import X.GYX;
import X.GZS;
import X.InterfaceC56362iU;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.WNN;
import X.XA0;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class EventLogListFragment extends C38K implements InterfaceC60072op, GZS, InterfaceC60122ou, XA0 {
    public C67913V2d A00;
    public C19320xG A01;
    public AbstractC18680vv A02;
    public TypeaheadHeader A03;
    public String A04 = "";
    public final GYX A05 = new C71104Wo1(this, 0);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.EkS(true);
        interfaceC56362iU.setTitle("Events List");
        interfaceC56362iU.AAE("CLEAR LOGS", new WNN(this, 58));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "events_list";
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return this.A02;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        TypeaheadHeader typeaheadHeader = this.A03;
        if (typeaheadHeader != null) {
            typeaheadHeader.A01();
            return false;
        }
        return false;
    }

    @Override // X.GZS
    public final void registerTextViewLogging(TextView textView) {
        textView.addTextChangedListener(C106904rr.A00(this.A02));
    }

    @Override // X.GZS
    public final void searchTextChanged(String str) {
        C67913V2d c67913V2d;
        this.A04 = str;
        ArrayList arrayList = new ArrayList(this.A01.A00.A01());
        if (!TextUtils.isEmpty(this.A04)) {
            String[] split = str.toLowerCase().trim().split("\\s+");
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
            c67913V2d = this.A00;
            List list = c67913V2d.A00;
            list.clear();
            list.addAll(arrayList2);
        } else {
            c67913V2d = this.A00;
            List list2 = c67913V2d.A00;
            list2.clear();
            list2.addAll(arrayList);
        }
        C67913V2d.A00(c67913V2d);
    }

    @Override // X.XA0
    public final void DEY(AnalyticsEventDebugInfo analyticsEventDebugInfo) {
        AbstractC68357VNr.A00(getActivity(), analyticsEventDebugInfo, this.A02).A04();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1615736047);
        super.onCreate(bundle);
        this.A02 = (AbstractC18680vv) AbstractC60492pY.A01(this).getValue();
        this.A01 = C19320xG.A00();
        C67913V2d c67913V2d = new C67913V2d(requireContext(), this, this.A05, new ArrayList(this.A01.A00.A01()));
        this.A00 = c67913V2d;
        A0U(c67913V2d);
        C0f9.A09(-547921649, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1528049296);
        TypeaheadHeader typeaheadHeader = new TypeaheadHeader(layoutInflater.getContext());
        this.A03 = typeaheadHeader;
        typeaheadHeader.A01 = this;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C0f9.A09(1687399578, A02);
        return onCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1880443609);
        super.onPause();
        TypeaheadHeader typeaheadHeader = this.A03;
        if (typeaheadHeader != null) {
            typeaheadHeader.A01();
        }
        C0f9.A09(-382181437, A02);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-5564384);
        super.onResume();
        C67913V2d c67913V2d = this.A00;
        ArrayList arrayList = new ArrayList(this.A01.A00.A01());
        List list = c67913V2d.A00;
        list.clear();
        list.addAll(arrayList);
        C67913V2d.A00(c67913V2d);
        this.A03.A04(this.A04);
        C0f9.A09(1125711930, A02);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A03.A03(requireContext().getString(2131971480));
        AbstractC05560Rg.A00(this);
        ((AbstractC05560Rg) this).A04.setOnScrollListener(this.A03.A04);
        AbstractC05560Rg.A00(this);
        ((AbstractC05560Rg) this).A04.setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
    }
}
