package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebookpay.logging.FBPayLoggerData;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public final class Q80 extends Fragment implements InterfaceC65382TjF, InterfaceC65387TjK {
    public View A00;
    public FBPayLoggerData A01;
    public Q8W A02;
    public Context A03;
    public View A04;
    public View A05;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r0.getVisibility() != 0) goto L6;
     */
    @Override // X.InterfaceC65387TjK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.SOB C8u() {
        /*
            r10 = this;
            r3 = 0
            android.view.View r0 = r10.A04
            if (r0 == 0) goto Lc
            int r0 = r0.getVisibility()
            r9 = 0
            if (r0 == 0) goto Ld
        Lc:
            r9 = 1
        Ld:
            r0 = 2131962333(0x7f1329dd, float:1.9561388E38)
            java.lang.String r4 = r10.getString(r0)
            android.content.Context r1 = r10.A03
            r0 = 2130969487(0x7f04038f, float:1.7547657E38)
            int r0 = X.W6b.A02(r1, r0)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r0)
            r0 = 44
            X.Sob r2 = X.ViewOnClickListenerC63508Sob.A00(r10, r0)
            r7 = 1
            r5 = 2131962338(0x7f1329e2, float:1.9561398E38)
            r6 = 2
            X.SOB r0 = new X.SOB
            r8 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q80.C8u():X.SOB");
    }

    public static void A00(Q80 q80) {
        LinkedHashMap A08 = AbstractC58442PvL.A08(q80.A01);
        C63307ShD.A02("target_name", "fbpay_education_info", A08).Chz("user_click_target_atomic", A08);
        if (q80.A04 == null) {
            View A0U = AbstractC167017dG.A0U(q80.requireView(), R.id.branding_view_stub);
            q80.A04 = A0U;
            ViewOnClickListenerC63508Sob.A01(A0U.requireViewById(R.id.close), 45, q80);
        }
        A01(q80, true);
    }

    public static void A01(Q80 q80, boolean z) {
        int i = 8;
        q80.A05.setVisibility(AbstractC31175DnJ.A01(z ? 1 : 0));
        View view = q80.A04;
        view.getClass();
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
        Fragment fragment = q80.mParentFragment;
        if (fragment instanceof C60958Rcg) {
            ((C60958Rcg) fragment).A00();
        }
    }

    @Override // X.InterfaceC65382TjF
    public final boolean onBackPressed() {
        View view = this.A04;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        A01(this, false);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        FBPayLoggerData A00;
        int A02 = C0f9.A02(1263525828);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && bundle2.getParcelable("logger_data") != null) {
            A00 = AbstractC58319PtB.A0W(this.mArguments);
        } else {
            A00 = AbstractC58442PvL.A00();
        }
        this.A01 = A00;
        if (bundle == null) {
            C2FP.A0E().A05().Chz("fbpay_home_page_init", AbstractC58442PvL.A08(this.A01));
            C2FP.A0E().A05().Chz("client_load_fbpayhubhome_init", AbstractC58442PvL.A08(this.A01));
            C63307ShD.A01().markerStart(110176278);
        }
        C0f9.A09(240295570, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-517618943);
        FragmentActivity activity = getActivity();
        C2FP.A0E();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(activity, R.style.Ig4aFbPay_HubHome);
        this.A03 = contextThemeWrapper;
        View A0A = AbstractC31172DnG.A0A(layoutInflater.cloneInContext(contextThemeWrapper), viewGroup, R.layout.fragment_hub_home);
        C0f9.A09(-1850086790, A02);
        return A0A;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        this.A05 = view.requireViewById(R.id.content_view);
        this.A00 = view.requireViewById(R.id.progress_bar);
        this.A04 = null;
        this.A02 = (Q8W) C63307ShD.A00(this).A00(Q8W.class);
        Q8X q8x = (Q8X) C63307ShD.A00(this).A00(RED.class);
        Q8X q8x2 = (Q8X) C63307ShD.A00(this).A00(REK.class);
        REG reg = (REG) C63307ShD.A00(this).A00(REG.class);
        Q8W q8w = this.A02;
        FBPayLoggerData fBPayLoggerData = this.A01;
        q8w.A00 = fBPayLoggerData;
        q8w.A08.Chz("fbpay_home_page_display", AbstractC58442PvL.A08(fBPayLoggerData));
        q8w.A03 = reg;
        q8w.A02 = q8x;
        q8w.A01 = q8x;
        C58252li c58252li = q8w.A05;
        C58252li c58252li2 = q8x.A03;
        InterfaceC58362lv interfaceC58362lv = q8w.A06;
        c58252li.A0E(c58252li2, interfaceC58362lv);
        c58252li.A0E(q8x2.A03, interfaceC58362lv);
        c58252li.A0E(((Q8X) reg).A03, interfaceC58362lv);
        C63627SqZ.A00(this, this.A02.A05, 8);
        C63627SqZ.A00(this, this.A02.A03.A02, 9);
        if (bundle == null && (bundle2 = this.mArguments) != null && bundle2.getBoolean("show_branding_page")) {
            A00(this);
        }
    }
}
