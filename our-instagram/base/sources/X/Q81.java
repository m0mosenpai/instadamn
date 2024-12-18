package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.facebook.R;

/* loaded from: classes10.dex */
public final class Q81 extends Fragment implements InterfaceC65384TjH {
    public SJO A00;
    public C58771Q8d A01;
    public C60609RDe A02;

    private void A00() {
        this.A00.A00.setVisibility(8);
        if (!requireArguments().getBoolean("AUTH_FLOW_UTIL_SHOULD_OPEN_PAYPAL_LOGIN_DIRECTLY", false)) {
            this.A00.A0A.setVisibility(0);
        }
        Fragment A0Q = getChildFragmentManager().A0Q("FBPAY_AUTH_PAYPAL_FRAGMENT_TAG");
        if (A0Q != null) {
            C14240no A0F = AbstractC43593JPy.A0F(this);
            A0F.A03(A0Q);
            A0F.A01();
        }
    }

    public static void A01(Q81 q81) {
        q81.A00.A00.setVisibility(0);
        q81.A00.A0A.setVisibility(4);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("WEB_FRAGMENT_LOAD_URL", AbstractC31173DnH.A0j(q81.A01.A00, "PAYPAL_LOGIN_URL"));
        A0b.putStringArray("WEB_FRAGMENT_INTERCEPT_URLS", new String[]{"fb://paypal_connect_success/", "fb://paypal_connect_fail/", "fb-messenger://paypal_connect_success/", "fb-messenger://paypal_connect_fail/", "https://www.instagram.com/payments/paypal_connect_success", "https://www.instagram.com/payments/paypal_connect_fail"});
        Fragment A01 = C2FP.A03().A04.A01(A0b, "AUTH_WEB_VIEW");
        A01.setTargetFragment(null, 1111);
        C14240no A0F = AbstractC43593JPy.A0F(q81);
        A0F.A0C(A01, "FBPAY_AUTH_PAYPAL_FRAGMENT_TAG", R.id.paypal_login_webview_container);
        A0F.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L18;
     */
    @Override // X.InterfaceC65384TjH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DIB(android.os.Bundle r6, int r7, boolean r8) {
        /*
            r5 = this;
            r0 = 1111(0x457, float:1.557E-42)
            if (r7 != r0) goto L36
            java.lang.String r4 = "WEB_FRAGMENT_INTERCEPTED_URL"
            java.lang.String r1 = r6.getString(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L67
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r0 = "access_token"
            java.lang.String r1 = r1.getQueryParameter(r0)
        L1a:
            r5.A00()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L38
            X.Q8d r2 = r5.A01
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L36
            r2.A02 = r1
            r1 = 0
            X.2li r0 = r2.A06
            r0.A0A(r1)
            X.C58771Q8d.A00(r2)
        L36:
            r0 = 0
            return r0
        L38:
            X.Q8d r3 = r5.A01
            java.lang.String r2 = ""
            java.lang.String r1 = r6.getString(r4, r2)
            boolean r0 = android.webkit.URLUtil.isValidUrl(r1)
            if (r0 == 0) goto L60
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r0 = "error_message"
            java.lang.String r1 = r1.getQueryParameter(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L60
        L56:
            java.lang.RuntimeException r1 = X.AbstractC166987dD.A18(r1)
            X.2li r0 = r3.A06
            r0.A0A(r1)
            goto L36
        L60:
            java.lang.String r0 = "ERROR_MESSAGE"
            java.lang.String r1 = r6.getString(r0, r2)
            goto L56
        L67:
            r1 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q81.DIB(android.os.Bundle, int, boolean):boolean");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        this.A00 = new SJO(view);
        C52942bb c52942bb = new C52942bb(C2FP.A03().A00(), this);
        C58771Q8d c58771Q8d = (C58771Q8d) c52942bb.A00(C58771Q8d.class);
        this.A01 = c58771Q8d;
        c58771Q8d.A02(requireArguments());
        this.A00.A01.setVisibility(8);
        this.A00.A09.setNavigationOnClickListener(ViewOnClickListenerC63508Sob.A00(this, 32));
        Drawable navigationIcon = this.A00.A09.getNavigationIcon();
        if (navigationIcon != null) {
            Toolbar toolbar = this.A00.A09;
            C2FP.A0A();
            AbstractC85953sP.A02(requireActivity(), navigationIcon, R.attr.glyphColorPrimary);
            toolbar.setNavigationIcon(navigationIcon);
        }
        int i = 0;
        this.A00.A03.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.A01.A01())});
        this.A00.A03.setInputType(18);
        C63480Snt.A00(this.A00.A03, this, 3);
        ViewOnClickListenerC63508Sob.A01(this.A00.A02, 31, this);
        C63628Sqa.A02(this, this.A01.A06, 35);
        C63628Sqa.A02(this, this.A01.A04, 36);
        C63627SqZ.A01(this, this.A01.A05, C63628Sqa.A00(this, 37), 44);
        this.A00.A01.setVisibility(0);
        Q8S q8s = (Q8S) c52942bb.A00(Q8S.class);
        q8s.A00 = AbstractC58319PtB.A0W(requireArguments());
        C58252li A0I = AbstractC58318PtA.A0I();
        C58252li A02 = C75M.A02(this.A01.A07, new TW1(2, q8s, this));
        A0I.A0E(this.A01.A06, new C63626SqY(9, this, A02, A0I));
        A0I.A0E(A02, new C63625SqX(8, A0I, this));
        C63628Sqa.A02(this, A0I, 38);
        A00();
        boolean A03 = this.A01.A03();
        TextView textView = this.A00.A07;
        if (A03) {
            i = 8;
        }
        textView.setVisibility(i);
        this.A00.A03.setVisibility(i);
        if (this.A01.A03()) {
            str = "fbpay_verify_paypal_display";
        } else {
            str = "fbpay_verify_cvv_display";
        }
        A02(this, str);
        if (requireArguments().getBoolean("AUTH_FLOW_UTIL_SHOULD_OPEN_PAYPAL_LOGIN_DIRECTLY", false)) {
            A01(this);
        }
    }

    public static void A02(Q81 q81, String str) {
        C2FP.A03().A01.Chz(str, SSA.A01(q81.requireArguments()));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(910701201);
        super.onCreate(bundle);
        this.A02 = (C60609RDe) C2FP.A03().A03(getActivity(), C60609RDe.class);
        C0f9.A09(-1720865477, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1976886797);
        C60609RDe c60609RDe = this.A02;
        InterfaceC65381TjE interfaceC65381TjE = c60609RDe.A01;
        View A0A = AbstractC31172DnG.A0A(((T34) interfaceC65381TjE).A00, viewGroup, c60609RDe.A00);
        C14360o3.A07(A0A);
        C0f9.A09(698431714, A02);
        return A0A;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(686483195);
        super.onDestroyView();
        SSC.A00(this.A00.A03);
        this.A00 = null;
        C0f9.A09(-548785408, A02);
    }
}
