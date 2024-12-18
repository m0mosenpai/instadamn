package com.instagram.debug.devoptions.zero;

import X.AbstractC103634lf;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC50523MSb;
import X.AnonymousClass001;
import X.C0f9;
import X.C14360o3;
import X.C1R0;
import X.C26661Qv;
import X.C3Q1;
import X.C53Z;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.zero.main.IgZeroMain;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;

/* loaded from: classes9.dex */
public final class ZeroTokenSummaryFragment extends C53Z {
    public static final Companion Companion = new Object();
    public final String moduleName = "zero_token_summary";

    /* loaded from: classes9.dex */
    public final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final String getCarrierSignalConfigText(C1R0 c1r0) {
            try {
                return AbstractC103634lf.A00(c1r0.A04).toString();
            } catch (JSONException unused) {
                return "<error>";
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return this.moduleName;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1870845742);
        super.onCreate(bundle);
        C0f9.A09(566652869, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1R0 C98;
        IgZeroMain igZeroMain;
        int A02 = C0f9.A02(-1934204546);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_zero_token_summary, viewGroup, false);
        TextView A0N = AbstractC167007dF.A0N(inflate, R.id.carrier_name);
        TextView A0N2 = AbstractC167007dF.A0N(inflate, R.id.token_hash);
        TextView A0N3 = AbstractC167007dF.A0N(inflate, R.id.token_ttl);
        TextView A0N4 = AbstractC167007dF.A0N(inflate, R.id.token_fetch_at);
        TextView A0N5 = AbstractC167007dF.A0N(inflate, R.id.token_remain);
        TextView A0N6 = AbstractC167007dF.A0N(inflate, R.id.token_features);
        TextView A0N7 = AbstractC167007dF.A0N(inflate, R.id.token_rewrite_rules);
        TextView A0N8 = AbstractC167007dF.A0N(inflate, R.id.carrier_id);
        TextView A0N9 = AbstractC167007dF.A0N(inflate, R.id.token_wallet_defs_keys);
        TextView A0N10 = AbstractC167007dF.A0N(inflate, R.id.carrier_signal_config);
        if (C3Q1.A00 != null && (igZeroMain = IgZeroMain.A09) != null && igZeroMain.A03) {
            C98 = igZeroMain.A02();
            if (C98 == null) {
                C98 = C1R0.A00();
            }
        } else {
            C98 = C26661Qv.A00(getSession()).C98();
        }
        AbstractC50523MSb.A0o(A0N, "Carrier Name: ", C98.A06);
        AbstractC50523MSb.A0o(A0N2, "Token Hash: ", C98.A09);
        A0N3.setText(AnonymousClass001.A0O("Token TTL: ", C98.A02));
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(C98.A03);
        AbstractC50523MSb.A0o(A0N4, "Token fetch at: ", new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(calendar.getTime()));
        A0N5.setText(AnonymousClass001.A0Q("Token remain msecs: ", C98.A02()));
        A0N6.setText(C98.A04());
        A0N7.setText(C98.A03());
        A0N8.setText(AnonymousClass001.A0O("Carrier ID: ", C98.A00));
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("\nToken Wallet Defs Keys: \n");
        Iterator it = C98.A0D.iterator();
        while (it.hasNext()) {
            A1C.append(AbstractC166987dD.A1B(it));
            A1C.append("\n");
        }
        A0N9.setText(A1C.toString());
        AbstractC50523MSb.A0o(A0N10, "Carrier Signal Config: \n", Companion.getCarrierSignalConfigText(C98));
        C0f9.A09(2021447197, A02);
        return inflate;
    }
}
