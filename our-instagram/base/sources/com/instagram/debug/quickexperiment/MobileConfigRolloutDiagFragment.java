package com.instagram.debug.quickexperiment;

import X.AbstractC12960li;
import X.AbstractC166997dE;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC55160OdO;
import X.AnonymousClass001;
import X.C0f9;
import X.C11830jh;
import X.C18V;
import X.C19T;
import X.C19U;
import X.C19z;
import X.C1AC;
import X.C228319l;
import X.C229419w;
import X.C4G9;
import X.C53Z;
import X.C5F7;
import X.C5NW;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreManager;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes11.dex */
public class MobileConfigRolloutDiagFragment extends C53Z implements InterfaceC60122ou {
    public C229419w mDeviceMC;
    public C1AC mDeviceQEManager;
    public TextView mTextView;
    public C229419w mUserMC;
    public C1AC mUserQEManager;
    public final HashMap mDeviceInfo = new HashMap();
    public final HashMap mUserInfo = new HashMap();

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "mobile_config_rollout_diag";
    }

    public static void appendKeyValue(StringBuilder sb, String str, Object obj) {
        String str2;
        if (obj != null) {
            str2 = obj.toString();
        } else {
            str2 = "null";
        }
        sb.append(AnonymousClass001.A11("<b>", str, "</b>: ", str2, "<br/>"));
    }

    private void setContent() {
        String str;
        String upperCase;
        fillInfo(this.mDeviceQEManager, this.mDeviceMC, this.mDeviceInfo);
        fillInfo(this.mUserQEManager, this.mUserMC, this.mUserInfo);
        StringBuilder sb = new StringBuilder();
        sb.append("<h2>User</h2>");
        Iterator A14 = AbstractC166997dE.A14(this.mUserInfo);
        while (A14.hasNext()) {
            Map.Entry entry = (Map.Entry) A14.next();
            appendKeyValue(sb, (String) entry.getKey(), entry.getValue());
        }
        sb.append("<h2>Device</h2>");
        Iterator A142 = AbstractC166997dE.A14(this.mDeviceInfo);
        while (A142.hasNext()) {
            Map.Entry entry2 = (Map.Entry) A142.next();
            appendKeyValue(sb, (String) entry2.getKey(), entry2.getValue());
        }
        sb.append("<h2>Overrides</h2>");
        appendKeyValue(sb, "Override store class", AbstractC31173DnH.A0q(QuickExperimentDebugStoreManager.getOverrideStore(getSession())));
        appendKeyValue(sb, "MC folder", this.mUserMC.A0C);
        File file = new File(new File(this.mUserMC.A0C, MobileConfigBisection.BISECT_DIR), "mc_overrides.json");
        appendKeyValue(sb, "Has overrides file", Boolean.valueOf(file.exists()));
        appendKeyValue(sb, "MobileConfigJavaOverridesTable.hasOverridesFile", Boolean.valueOf(C19z.A01(file).A00));
        if (file.exists()) {
            appendKeyValue(sb, "Content", C4G9.A01(file));
        }
        sb.append("<h2>FDID</h2>");
        MobileConfigManagerHolderImpl A00 = C228319l.A00(this.mDeviceMC.A0A());
        if (A00 != null) {
            str = A00.getFamilyDeviceId();
        } else {
            str = "(null_manager)";
        }
        appendKeyValue(sb, "From current MC manager", str);
        C19U A01 = C11830jh.A04.A01(AbstractC12960li.A00).A01(C19T.A23);
        if (A01 == null) {
            upperCase = "";
        } else {
            upperCase = A01.A01.toUpperCase(Locale.ROOT);
        }
        appendKeyValue(sb, "From current InstagramPhoneIdPublicStore", upperCase);
        TextView textView = this.mTextView;
        String obj = sb.toString();
        if (obj == null) {
            obj = "";
        }
        textView.setText(Html.fromHtml(obj));
    }

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31175DnJ.A1I(interfaceC56362iU, "MobileConfig Rollout Diagnose");
    }

    private void fillInfo(C1AC c1ac, C229419w c229419w, HashMap hashMap) {
        C5F7 A0B = c229419w.A0B();
        if (A0B != null) {
            hashMap.put("params map configs", Integer.valueOf(A0B.A02().size()));
            int i = 0;
            List<C5NW> list = A0B.A03;
            for (C5NW c5nw : list) {
                if (AbstractC55160OdO.A03(c5nw.A00) && AbstractC55160OdO.A03(c5nw.A01)) {
                    i++;
                }
            }
            hashMap.put("params map names", AnonymousClass001.A0P("/", i, list.size()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-281987837);
        super.onCreate(bundle);
        C18V c18v = C18V.A01;
        this.mDeviceQEManager = c18v.A01();
        C1AC A022 = c18v.A02(getSession());
        this.mUserQEManager = A022;
        this.mDeviceMC = this.mDeviceQEManager.A01.A00;
        this.mUserMC = A022.A01.A00;
        C0f9.A09(-562861528, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(984163279);
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        scrollView.setPadding(25, 10, 25, 10);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        AbstractC31174DnI.A1D(linearLayout, -1, -2);
        TextView textView = new TextView(getContext());
        this.mTextView = textView;
        AbstractC31174DnI.A1D(textView, -1, -2);
        setContent();
        linearLayout.addView(this.mTextView);
        scrollView.addView(linearLayout);
        C0f9.A09(1515200521, A02);
        return scrollView;
    }
}
