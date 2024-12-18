package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.onboarding.repository.OnboardingRepository;

/* loaded from: classes9.dex */
public final class N69 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "OnboardingTermsFragment";
    public ImageView A00;
    public C51043Mgu A01;
    public final InterfaceC09390do A02 = C57526Pg0.A00(this, 16);
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    public static final void A00(N69 n69) {
        C51043Mgu c51043Mgu = n69.A01;
        if (c51043Mgu != null) {
            FragmentActivity requireActivity = n69.requireActivity();
            UserSession A0r = AbstractC166987dD.A0r(n69.A03);
            C51043Mgu c51043Mgu2 = n69.A01;
            if (c51043Mgu2 != null) {
                C14360o3.A07(n69.getString(c51043Mgu2.A03()));
                c51043Mgu.A07(n69, requireActivity, A0r, __redex_internal_original_name, null);
                return;
            }
        }
        C14360o3.A0F("productOnboardingViewModel");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131968987);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x004c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b7  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            r1 = 0
            X.C14360o3.A0B(r8, r1)
            super.onViewCreated(r8, r9)
            r0 = 2131435676(0x7f0b209c, float:1.84932E38)
            android.widget.ImageView r0 = X.AbstractC31171DnF.A08(r8, r0)
            r7.A00 = r0
            r0 = 2131444061(0x7f0b415d, float:1.8510208E38)
            android.view.View r3 = X.AbstractC166997dE.A0R(r8, r0)
            android.webkit.WebView r3 = (android.webkit.WebView) r3
            r3.setScrollBarStyle(r1)
            android.webkit.WebSettings r5 = r3.getSettings()
            X.C14360o3.A07(r5)
            r0 = 1
            r5.setJavaScriptEnabled(r0)
            android.content.Context r0 = r7.getContext()
            r4 = 0
            if (r0 == 0) goto L37
            X.0do r0 = r7.A03
            X.0ll r0 = X.AbstractC166987dD.A0o(r0)
            X.C62817SSp.A00(r0, r4)
        L37:
            X.0do r0 = r7.A03
            X.0ll r6 = X.AbstractC166987dD.A0o(r0)
            X.Mgu r0 = r7.A01
            if (r0 == 0) goto Ld3
            com.instagram.api.schemas.UserMonetizationProductType r0 = r0.A04()
            X.C14360o3.A0B(r6, r1)
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L91;
                case 2: goto L94;
                case 10: goto L97;
                case 11: goto La3;
                case 13: goto La6;
                case 15: goto L8e;
                default: goto L4f;
            }
        L4f:
            r0 = 2131428914(0x7f0b0632, float:1.8479486E38)
            android.view.View r5 = r8.requireViewById(r0)
            X.64P r5 = (X.C64P) r5
            r0 = 2131968969(0x7f1343c9, float:1.9574848E38)
            java.lang.String r2 = X.AbstractC25227BEk.A0v(r7, r0)
            r1 = 5
            X.Ok6 r0 = new X.Ok6
            r0.<init>(r2, r7, r1)
            r5.setPrimaryAction(r2, r0)
            X.Mgu r0 = r7.A01
            if (r0 == 0) goto Ld3
            X.2GS r3 = r0.A02
            X.07X r2 = r7.getViewLifecycleOwner()
            r0 = 26
            X.PjY r1 = X.C57745PjY.A00(r5, r0)
            r0 = 55
            X.AbstractC31174DnI.A1E(r2, r3, r1, r0)
            X.2k6 r1 = X.AbstractC25235BEs.A0S(r7)
            r0 = 32
            X.PZF.A02(r7, r1, r0)
            java.lang.String r1 = "impression"
            java.lang.String r0 = "terms"
            A01(r7, r1, r0, r4)
            return
        L8e:
            java.lang.String r2 = "https://help.instagram.com/1322213587984073"
            goto Lb1
        L91:
            java.lang.String r2 = "https://help.instagram.com/2811706922479237"
            goto Lb1
        L94:
            java.lang.String r2 = "https://help.instagram.com/383069119533156"
            goto Lb1
        L97:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36878758162727112(0x830509000c00c8, double:3.385613388723845E-306)
            java.lang.String r2 = X.C18U.A04(r2, r6, r0)
            goto Lb1
        La3:
            java.lang.String r2 = "https://www.facebook.com/help/instagram/383069119533156"
            goto Lb1
        La6:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36878062377828505(0x83046700090099, double:3.385173371552265E-306)
            java.lang.String r2 = X.C18U.A04(r2, r6, r0)
        Lb1:
            boolean r0 = X.C1QD.A01(r2)
            if (r0 == 0) goto Lc5
            java.lang.String r0 = r5.getUserAgentString()
            X.C14360o3.A07(r0)
            java.lang.String r0 = X.C1FO.A01(r0)
            r5.setUserAgentString(r0)
        Lc5:
            r1 = 5
            X.Q4s r0 = new X.Q4s
            r0.<init>(r7, r1)
            r3.setWebViewClient(r0)
            r3.loadUrl(r2)
            goto L4f
        Ld3:
            java.lang.String r0 = "productOnboardingViewModel"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N69.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A01(N69 n69, String str, String str2, String str3) {
        C56136Ovw c56136Ovw = (C56136Ovw) n69.A02.getValue();
        C51043Mgu c51043Mgu = n69.A01;
        if (c51043Mgu != null) {
            String A01 = AbstractC35078Fcp.A01(c51043Mgu.A04());
            C51043Mgu c51043Mgu2 = n69.A01;
            if (c51043Mgu2 != null) {
                String A02 = AbstractC35078Fcp.A02(c51043Mgu2.A04());
                C51043Mgu c51043Mgu3 = n69.A01;
                if (c51043Mgu3 != null) {
                    c56136Ovw.A01(A01, A02, str, str2, __redex_internal_original_name, c51043Mgu3.A05(), str3);
                    return;
                }
            }
        }
        C14360o3.A0F("productOnboardingViewModel");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        A01(this, "back_button_clicked", "terms", __redex_internal_original_name);
        C51043Mgu c51043Mgu = this.A01;
        if (c51043Mgu != null) {
            OnboardingRepository onboardingRepository = c51043Mgu.A05;
            C51746MtV c51746MtV = (C51746MtV) onboardingRepository.A00.get(c51043Mgu.A04());
            if (c51746MtV != null && c51746MtV.A00 != 0) {
                C51043Mgu c51043Mgu2 = this.A01;
                if (c51043Mgu2 != null) {
                    c51043Mgu2.A06();
                    AbstractC25226BEj.A1P(this);
                    return true;
                }
            } else {
                C51043Mgu c51043Mgu3 = this.A01;
                if (c51043Mgu3 != null) {
                    F9C.A00(this, c51043Mgu3);
                    return true;
                }
            }
        }
        C14360o3.A0F("productOnboardingViewModel");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 8888) {
            if (intent != null && intent.getBooleanExtra("EXTRA_IS_ONBOARDING_COMPLETE", false)) {
                A00(this);
                OY3.A01(requireContext());
                A01(this, "finished", "payouts_onboarding", null);
            } else {
                C51043Mgu c51043Mgu = this.A01;
                if (c51043Mgu == null) {
                    C14360o3.A0F("productOnboardingViewModel");
                    throw C00O.createAndThrow();
                }
                c51043Mgu.A06();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-548828162);
        super.onCreate(bundle);
        this.A01 = C52332NDw.A00(requireActivity(), this.A03);
        C0f9.A09(421188006, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-914265951);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.partner_program_terms_page, viewGroup, false);
        C0f9.A09(-1406323495, A02);
        return inflate;
    }
}
