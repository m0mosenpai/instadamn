package X;

import android.view.View;
import android.widget.AdapterView;
import java.util.List;

/* loaded from: classes9.dex */
public final class P3A implements GZD, AdapterView.OnItemSelectedListener {
    public final /* synthetic */ NTP A00;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // X.GZD
    public final void onSearchCleared(String str) {
        C14360o3.A0B(str, 0);
        onSearchTextChanged(str);
    }

    @Override // X.GZD
    public final void onSearchTextChanged(String str) {
        C51891MwZ c51891MwZ;
        C14360o3.A0B(str, 0);
        NTP ntp = this.A00;
        ntp.A02 = str;
        C51891MwZ c51891MwZ2 = (C51891MwZ) ((AbstractC55206OeJ) ntp).A01;
        if (c51891MwZ2 != null) {
            List A00 = NTP.A00(ntp);
            String str2 = c51891MwZ2.A00;
            String str3 = c51891MwZ2.A01;
            List list = c51891MwZ2.A03;
            AbstractC167007dF.A1E(str2, 0, list);
            c51891MwZ = new C51891MwZ(str2, str3, A00, list);
        } else {
            c51891MwZ = null;
        }
        ntp.A0J(c51891MwZ);
    }

    public P3A(NTP ntp) {
        this.A00 = ntp;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C51891MwZ c51891MwZ;
        NTP ntp = this.A00;
        ntp.A00 = i;
        C51891MwZ c51891MwZ2 = (C51891MwZ) ((AbstractC55206OeJ) ntp).A01;
        if (c51891MwZ2 != null) {
            List A00 = NTP.A00(ntp);
            String str = c51891MwZ2.A00;
            String str2 = c51891MwZ2.A01;
            List list = c51891MwZ2.A03;
            AbstractC167007dF.A1E(str, 0, list);
            c51891MwZ = new C51891MwZ(str, str2, A00, list);
        } else {
            c51891MwZ = null;
        }
        ntp.A0J(c51891MwZ);
    }
}
