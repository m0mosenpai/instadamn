package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.EkE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33167EkE extends Rb0 implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "FundraiserDonationWebViewFragment";
    public WebView A00;

    @Override // X.Rb0, X.InterfaceC60072op
    public final boolean onBackPressed() {
        WebView webView = this.A00;
        if (webView != null) {
            if (webView.getUrl() != null) {
                android.net.Uri A03 = AbstractC08820cl.A03(this.A00.getUrl());
                String host = A03.getHost();
                String path = A03.getPath();
                String queryParameter = A03.getQueryParameter("currentStep");
                if (host != null && path != null && queryParameter != null && host.equals("www.instagram.com") && path.equals("/donate/checkout/") && queryParameter.equals("confirmation")) {
                    A00(false);
                } else if (!super.onBackPressed()) {
                    FragmentActivity requireActivity = requireActivity();
                    Intent A04 = AbstractC31171DnF.A04();
                    A04.putExtra(AbstractC111324zv.A00(303), "DONATION_INCOMPLETE");
                    AbstractC31180DnO.A0y(requireActivity, A04);
                    return true;
                }
            }
            return true;
        }
        throw AbstractC166987dD.A14("WebView not yet initialized");
    }

    private void A00(boolean z) {
        FragmentActivity requireActivity = requireActivity();
        if (z) {
            AbstractC18680vv abstractC18680vv = this.A03;
            abstractC18680vv.getClass();
            AbstractC31177DnL.A0o(requireActivity, AbstractC166987dD.A0b(), abstractC18680vv, "fbpay_hub");
        }
        Intent A04 = AbstractC31171DnF.A04();
        A04.putExtra(AbstractC111324zv.A00(303), AbstractC111324zv.A00(1567));
        A04.putExtra(AbstractC111324zv.A00(1655), z);
        AbstractC31180DnO.A0y(requireActivity, A04);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        if (r2.equals("cancel") != false) goto L23;
     */
    @Override // X.Rb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03(android.net.Uri r8, android.webkit.WebView r9) {
        /*
            r7 = this;
            java.lang.String r3 = r8.getScheme()
            java.lang.String r5 = r8.getHost()
            java.lang.String r0 = "event"
            java.lang.String r2 = r8.getQueryParameter(r0)
            java.lang.String r0 = "currentStep"
            java.lang.String r1 = r8.getQueryParameter(r0)
            if (r3 == 0) goto L97
            if (r5 == 0) goto L97
            java.lang.String r0 = "instagram"
            boolean r6 = r3.equals(r0)
            r4 = 1
            if (r6 == 0) goto L2d
            java.lang.String r0 = "fbpay_hub"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L2d
            r7.A00(r4)
            return r4
        L2d:
            r3 = 0
            if (r1 == 0) goto L42
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "confirmation"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L42
        L3e:
            r7.A00(r3)
            return r4
        L42:
            java.lang.String r0 = "www.instagram.com"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L77
            java.lang.String r0 = r8.getPath()
            if (r0 == 0) goto L77
            java.lang.String r1 = r8.getPath()
            r0 = 441(0x1b9, float:6.18E-43)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L77
        L60:
            androidx.fragment.app.FragmentActivity r3 = r7.requireActivity()
            android.content.Intent r2 = X.AbstractC31171DnF.A04()
            r0 = 303(0x12f, float:4.25E-43)
            java.lang.String r1 = X.AbstractC111324zv.A00(r0)
            java.lang.String r0 = "DONATION_INCOMPLETE"
            r2.putExtra(r1, r0)
            X.AbstractC31180DnO.A0y(r3, r2)
            return r4
        L77:
            if (r2 == 0) goto L97
            java.lang.String r0 = "resume"
            if (r6 == 0) goto L97
            boolean r1 = r5.equals(r0)
            if (r1 == 0) goto L8c
            java.lang.String r0 = "done"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L8c
            goto L3e
        L8c:
            if (r1 == 0) goto L97
            java.lang.String r0 = "cancel"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L97
            goto L60
        L97:
            boolean r4 = super.A03(r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33167EkE.A03(android.net.Uri, android.webkit.WebView):boolean");
    }

    @Override // X.Rb0, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1290289225);
        super.onCreate(bundle);
        Activity rootActivity = getRootActivity();
        if (rootActivity != null) {
            AbstractC31180DnO.A0x(rootActivity);
            C0f9.A09(-1031031671, A02);
        } else {
            IllegalStateException A14 = AbstractC166987dD.A14("No Activity context found");
            C0f9.A09(332852573, A02);
            throw A14;
        }
    }

    @Override // X.Rb0
    public final void A02(WebView webView) {
        this.A00 = webView;
    }
}
