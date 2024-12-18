package com.instagram.debug.devoptions.zero;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AnonymousClass001;
import X.C0f9;
import X.C14360o3;
import X.C26661Qv;
import X.C53Z;
import X.C5J3;
import X.C62723SNn;
import X.C69571Vra;
import X.C71473Il;
import X.W2Y;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class CarrierSignalStatusFragment extends C53Z {
    public final String moduleName = "carrier_signal_status";

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return this.moduleName;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(2120152397);
        super.onCreate(bundle);
        C0f9.A09(1816446743, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        ArrayList arrayList;
        String str2;
        int A02 = C0f9.A02(161526065);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_carrier_signal_status, viewGroup, false);
        C5J3 AmU = C26661Qv.A00(getSession()).AmU();
        TextView A0N = AbstractC167007dF.A0N(inflate, R.id.pings);
        if (AmU != null) {
            synchronized (AmU) {
                arrayList = new ArrayList();
                Iterator A15 = AbstractC166997dE.A15(AmU.A05);
                while (A15.hasNext()) {
                    Map.Entry entry = (Map.Entry) A15.next();
                    W2Y w2y = ((C69571Vra) entry.getValue()).A01;
                    StringBuilder sb = new StringBuilder();
                    sb.append((String) entry.getKey());
                    if (w2y != null) {
                        long j = ((C69571Vra) entry.getValue()).A00;
                        C62723SNn c62723SNn = w2y.A01;
                        long now = (j + (c62723SNn.A00 * 1000)) - AmU.A03.A01.now();
                        sb.append(", cooldown = ");
                        sb.append(now / 1000);
                        sb.append(" sec");
                        sb.append(", url = ");
                        str2 = c62723SNn.A02;
                    } else {
                        str2 = ", idle";
                    }
                    sb.append(str2);
                    AbstractC166997dE.A1S(sb, arrayList);
                }
            }
            str = AnonymousClass001.A04(arrayList.size(), " pings: \n", C71473Il.A00('\n').A02(arrayList));
        } else {
            str = "Carrier Signal Controller is not initialized";
        }
        A0N.setText(str);
        C0f9.A09(1715187915, A02);
        return inflate;
    }
}
