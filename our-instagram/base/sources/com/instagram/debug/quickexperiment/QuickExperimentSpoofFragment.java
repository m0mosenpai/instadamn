package com.instagram.debug.quickexperiment;

import X.AbstractC18680vv;
import X.AbstractC31176DnK;
import X.AbstractC33235ElU;
import X.AbstractC68225VIl;
import X.AnonymousClass001;
import X.C0K8;
import X.C0f9;
import X.C17280tP;
import X.C18V;
import X.C31335Dq0;
import X.C35119FeM;
import X.C35473Fl9;
import X.C50676MYu;
import X.C9GR;
import X.GYP;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import X.MSX;
import X.X8R;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class QuickExperimentSpoofFragment extends AbstractC33235ElU implements InterfaceC60122ou {
    public UserSession mUserSession;
    public final TextView.OnEditorActionListener mTextDelegate = new TextView.OnEditorActionListener() { // from class: com.instagram.debug.quickexperiment.QuickExperimentSpoofFragment.1
        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            return false;
        }
    };
    public final GYP mEditDelegate = new GYP() { // from class: com.instagram.debug.quickexperiment.QuickExperimentSpoofFragment.2
        @Override // X.GYP
        public void onTextChanged(String str) {
        }
    };
    public final X8R mSpoofOverlayDelegate = new X8R() { // from class: com.instagram.debug.quickexperiment.QuickExperimentSpoofFragment.3
        public void onOperationStart() {
        }
    };

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "QuickExperimentSpoofFragment";
    }

    private List getDeviceSpoofOptions() {
        ArrayList arrayList = new ArrayList();
        final UserSession A0S = AbstractC31176DnK.A0S(this);
        final C17280tP A00 = C17280tP.A00();
        arrayList.add(new C31335Dq0("Device Spoof"));
        String A0j = MSX.A0j(A00, A00.A0N, C17280tP.A4G, 26);
        if (A0j == null) {
            A0j = "";
        }
        final C35473Fl9 c35473Fl9 = new C35473Fl9(this.mTextDelegate, this.mEditDelegate, Integer.valueOf(Constants.LOAD_RESULT_WITH_VDEX_ODEX), "Enter spoofed device's id", A0j, true);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.instagram.debug.quickexperiment.QuickExperimentSpoofFragment.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int A05 = C0f9.A05(1957219772);
                if (A00.A0O()) {
                    FragmentActivity activity = QuickExperimentSpoofFragment.this.getActivity();
                    C17280tP c17280tP = A00;
                    C9GR.A09(activity, AnonymousClass001.A0g("Already Spoofing on ", MSX.A0j(c17280tP, c17280tP.A0N, C17280tP.A4G, 26), ". Clear spoof before spoofing again."));
                } else {
                    C18V c18v = C18V.A01;
                    if (c18v != null) {
                        String str = c35473Fl9.A00;
                        c18v.A00 = QuickExperimentSpoofFragment.this.mSpoofOverlayDelegate;
                        c18v.A05(A0S, str, 1);
                    } else {
                        C0K8.A0C("QuickExperimentSpoofFragment", "QuickExperimentManagerFactory is null");
                    }
                }
                C0f9.A0C(766395888, A05);
            }
        };
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.instagram.debug.quickexperiment.QuickExperimentSpoofFragment.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int A05 = C0f9.A05(479793891);
                C17280tP A002 = C17280tP.A00();
                AbstractC68225VIl.A00 = null;
                A002.A0C(null);
                C17280tP.A00().A0C(null);
                C0f9.A0C(50143147, A05);
            }
        };
        C50676MYu c50676MYu = new C50676MYu(requireContext(), onClickListener, 2131974351);
        C50676MYu c50676MYu2 = new C50676MYu(requireContext(), onClickListener2, 2131955194);
        arrayList.add(c35473Fl9);
        arrayList.add(c50676MYu);
        arrayList.add(c50676MYu2);
        return arrayList;
    }

    private List getUserSpoofOptions() {
        ArrayList arrayList = new ArrayList();
        final C17280tP A00 = C17280tP.A00();
        String A0j = MSX.A0j(A00, A00.A0P, C17280tP.A4G, 25);
        arrayList.add(new C31335Dq0("User Spoof"));
        if (A0j == null) {
            A0j = "";
        }
        final C35473Fl9 c35473Fl9 = new C35473Fl9(this.mTextDelegate, this.mEditDelegate, 2, "Enter spoofed user's IGID", A0j, true);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.instagram.debug.quickexperiment.QuickExperimentSpoofFragment.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int A05 = C0f9.A05(-1135532999);
                if (A00.A0P()) {
                    FragmentActivity activity = QuickExperimentSpoofFragment.this.getActivity();
                    C17280tP c17280tP = A00;
                    C9GR.A09(activity, AnonymousClass001.A0g("Already Spoofing on ", MSX.A0j(c17280tP, c17280tP.A0P, C17280tP.A4G, 25), ". Clear spoof before spoofing again."));
                } else {
                    C18V c18v = C18V.A01;
                    if (c18v != null) {
                        String str = c35473Fl9.A00;
                        QuickExperimentSpoofFragment quickExperimentSpoofFragment = QuickExperimentSpoofFragment.this;
                        c18v.A00 = quickExperimentSpoofFragment.mSpoofOverlayDelegate;
                        c18v.A05(quickExperimentSpoofFragment.mUserSession, str, 2);
                    } else {
                        C0K8.A0C("QuickExperimentSpoofFragment", "QuickExperimentManagerFactory is null");
                    }
                }
                C0f9.A0C(-262103899, A05);
            }
        };
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.instagram.debug.quickexperiment.QuickExperimentSpoofFragment.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int A05 = C0f9.A05(2050375452);
                C17280tP A002 = C17280tP.A00();
                AbstractC68225VIl.A01 = null;
                A002.A0D(null);
                C17280tP.A00().A0D(null);
                C0f9.A0C(685853219, A05);
            }
        };
        C50676MYu c50676MYu = new C50676MYu(requireContext(), onClickListener, 2131974352);
        C50676MYu c50676MYu2 = new C50676MYu(requireContext(), onClickListener2, 2131955195);
        arrayList.add(c35473Fl9);
        arrayList.add(c50676MYu);
        arrayList.add(c50676MYu2);
        return arrayList;
    }

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.setTitle("Spoof menu");
    }

    @Override // X.AbstractC59962oe
    public AbstractC18680vv getSession() {
        return this.mUserSession;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-790715324);
        super.onCreate(bundle);
        this.mUserSession = AbstractC31176DnK.A0S(this);
        C0f9.A09(732412857, A02);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getUserSpoofOptions());
        C35119FeM.A00(arrayList, true);
        arrayList.addAll(getDeviceSpoofOptions());
        setItems(arrayList);
    }
}
