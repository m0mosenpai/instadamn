package com.instagram.bwpclientauthmanager;

import X.AbstractC12220kQ;
import X.AbstractC12990ll;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC25229BEm;
import X.AbstractC31171DnF;
import X.AbstractC40691uc;
import X.AbstractC50523MSb;
import X.AbstractC58318PtA;
import X.AbstractC58322PtE;
import X.AbstractC58323PtF;
import X.C05F;
import X.C0f9;
import X.C14360o3;
import X.C2JM;
import X.C40701ud;
import X.C58510Pwe;
import X.C62779SQx;
import X.C63295Sgw;
import X.C64006Sxd;
import X.C64025Sxx;
import X.C64030Sy2;
import X.InterfaceC02550Ad;
import X.MSW;
import X.SQw;
import X.T8K;
import X.T8N;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes10.dex */
public final class AuthenticationActivity extends BaseFragmentActivity {
    public UserSession A00;
    public Bundle A01 = new Bundle(0);
    public InterfaceC02550Ad A02 = AbstractC12220kQ.A02(MSW.A0Q(this));
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        C14360o3.A0B(intent, 0);
        super.onNewIntent(intent);
        this.A03 = true;
        String stringExtra = intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        String stringExtra2 = intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
        String stringExtra3 = intent.getStringExtra("error");
        intent.getStringExtra("iab_session_id");
        if (stringExtra3 == null && stringExtra != null && stringExtra2 != null) {
            C63295Sgw c63295Sgw = C63295Sgw.A00;
            InterfaceC02550Ad interfaceC02550Ad = this.A02;
            c63295Sgw.A02(this.A01, interfaceC02550Ad, C05F.A0C, null);
            C40701ud A01 = AbstractC40691uc.A01(MSW.A0Q(this));
            Bundle bundle = this.A01;
            boolean z = this.A06;
            AbstractC167007dF.A1D(interfaceC02550Ad, 1, bundle);
            T8K t8k = new T8K(bundle, this, interfaceC02550Ad, z);
            try {
                Object A0l = AbstractC58323PtF.A0l(null, SQw.class, "create");
                C14360o3.A0C(A0l, "null cannot be cast to non-null type com.facebook.bwpclientauthmanager.shared.AmazonBwpAccessTokenQuery.BuilderForAuthCode");
                C64030Sy2 c64030Sy2 = (C64030Sy2) A0l;
                C2JM c2jm = c64030Sy2.A00;
                c2jm.A04("auth_code", stringExtra);
                c64030Sy2.A02 = true;
                c2jm.A04(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, stringExtra2);
                c64030Sy2.A03 = true;
                c2jm.A00(C63295Sgw.A00(this.A01), "extra_data");
                C64006Sxd.A00(new C58510Pwe(t8k, 5), c64030Sy2.A00().setMaxToleratedCacheAgeMs(0L).setEnsureCacheWrite(false), A01, t8k, 5);
                return;
            } catch (Exception e) {
                if (!(e instanceof ClassNotFoundException) && !(e instanceof IllegalAccessException) && !(e instanceof InstantiationException) && !(e instanceof InvocationTargetException) && !(e instanceof NoSuchMethodException)) {
                    throw e;
                }
                throw AbstractC58318PtA.A0f(e);
            }
        }
        if (C14360o3.A0K(stringExtra3, "access_denied")) {
            setResult(0, AbstractC31171DnF.A04().putExtra("error", "LOGIN_CANCELED_BY_USER"));
            C63295Sgw.A00.A02(this.A01, this.A02, C05F.A0Y, null);
        } else {
            setResult(0, AbstractC58322PtE.A0F("error", stringExtra3));
            C63295Sgw.A00.A02(this.A01, this.A02, C05F.A0j, stringExtra3);
        }
        finish();
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        Intent intent;
        int A00 = C0f9.A00(88029637);
        super.onCreate(bundle);
        Intent intent2 = getIntent();
        if (intent2 == null || (bundle2 = intent2.getBundleExtra("iab_session_params")) == null) {
            bundle2 = new Bundle(0);
        }
        this.A01 = bundle2;
        Intent intent3 = getIntent();
        if (intent3 != null) {
            intent = (Intent) intent3.getParcelableExtra("iab_browser_intent");
        } else {
            intent = null;
        }
        this.A06 = AbstractC25229BEm.A1Z(intent);
        UserSession A0Q = MSW.A0Q(this);
        this.A00 = A0Q;
        C40701ud A01 = AbstractC40691uc.A01(A0Q);
        InterfaceC02550Ad interfaceC02550Ad = this.A02;
        Bundle bundle3 = this.A01;
        boolean z = this.A06;
        AbstractC167017dG.A1Q(interfaceC02550Ad, bundle3);
        T8N t8n = new T8N(intent, bundle3, this, interfaceC02550Ad, A0Q, z);
        try {
            Object A0R = AbstractC50523MSb.A0R("create", C62779SQx.class);
            C14360o3.A0C(A0R, "null cannot be cast to non-null type com.facebook.bwpclientauthmanager.shared.AmazonBwpLoginUrlQuery.Builder");
            C64025Sxx c64025Sxx = (C64025Sxx) A0R;
            c64025Sxx.A00.A00(C63295Sgw.A00(this.A01), "extra_data");
            C64006Sxd.A00(new C58510Pwe(t8n, 4), c64025Sxx.A00().setMaxToleratedCacheAgeMs(0L).setEnsureCacheWrite(false), A01, t8n, 4);
            C0f9.A07(-615789974, A00);
        } catch (Exception e) {
            if (!(e instanceof ClassNotFoundException) && !(e instanceof IllegalAccessException) && !(e instanceof InstantiationException) && !(e instanceof InvocationTargetException) && !(e instanceof NoSuchMethodException)) {
                throw e;
            }
            throw AbstractC58318PtA.A0f(e);
        }
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        int A00 = C0f9.A00(337359291);
        super.onPause();
        this.A04 = true;
        C0f9.A07(-822359410, A00);
    }

    @Override // android.app.Activity
    public final void onRestart() {
        int A00 = C0f9.A00(-268039562);
        super.onRestart();
        this.A05 = true;
        C0f9.A07(-1207901917, A00);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(-509790402);
        super.onResume();
        if ((this.A05 || this.A04) && !this.A03) {
            setResult(0, AbstractC31171DnF.A04().putExtra("error", "LOGIN_CANCELED_BY_USER"));
            C63295Sgw.A00.A02(this.A01, this.A02, C05F.A0Y, null);
            finish();
        }
        C0f9.A07(1241681773, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return this.A00;
    }
}
