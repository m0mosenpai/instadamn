package com.facebook.oauthaccountlinking;

import X.AbstractC12220kQ;
import X.AbstractC167007dF;
import X.AbstractC25234BEr;
import X.AbstractC31171DnF;
import X.AbstractC50523MSb;
import X.AbstractC58318PtA;
import X.AbstractC58322PtE;
import X.C05F;
import X.C0f9;
import X.C14360o3;
import X.C2JM;
import X.C64057SyT;
import X.C64065Syb;
import X.C64522THp;
import X.MSW;
import X.SRT;
import X.SRU;
import X.T8G;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes10.dex */
public class OAuthAccountLinkingActivity extends OAuthAccountLinkingActivityBase {
    public boolean A00;
    public boolean A01;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String str;
        C14360o3.A0B(intent, 0);
        super.onNewIntent(intent);
        String stringExtra = intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        String stringExtra2 = intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
        String stringExtra3 = intent.getStringExtra("error");
        if (stringExtra3 == null && stringExtra != null && stringExtra2 != null) {
            C64522THp c64522THp = this.A02;
            if (c64522THp != null) {
                try {
                    C64065Syb c64065Syb = (C64065Syb) AbstractC50523MSb.A0R("create", SRT.class);
                    C2JM c2jm = c64065Syb.A00;
                    c2jm.A04("authCode", stringExtra);
                    c64065Syb.A01 = true;
                    c2jm.A04(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, stringExtra2);
                    c64065Syb.A02 = true;
                    if (this.A02 != null) {
                        str = "IG";
                    } else {
                        str = null;
                    }
                    c2jm.A04("surface", str);
                    c64522THp.A00(this, c64065Syb.A00().setMaxToleratedCacheAgeMs(0L).setEnsureCacheWrite(false), new T8G(this, 0));
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw AbstractC58318PtA.A0f(e);
                }
            }
        } else {
            setResult(0, AbstractC58322PtE.A0F("error", stringExtra3));
            OAuthAccountLinkingActivityBase.A00(this, C05F.A0N, null, stringExtra3, null);
            finish();
        }
        this.A00 = true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        Bundle bundle2;
        String str;
        String str2;
        int A00 = C0f9.A00(1116836110);
        super.onCreate(bundle);
        A01();
        if (this.A02 != null) {
            super.A01 = AbstractC12220kQ.A02(MSW.A0Q(this));
            Intent intent = getIntent();
            if (intent == null || (bundle2 = intent.getBundleExtra("session_parameters")) == null) {
                bundle2 = new Bundle(0);
            }
            super.A00 = bundle2;
            Intent intent2 = getIntent();
            if (intent2 == null || (str = intent2.getStringExtra("oauth_integration_id")) == null) {
                str = "";
            }
            this.A03 = str;
            C64522THp c64522THp = this.A02;
            if (c64522THp != null) {
                try {
                    C64057SyT c64057SyT = (C64057SyT) AbstractC25234BEr.A0d(SRU.class);
                    String str3 = this.A03;
                    C2JM c2jm = c64057SyT.A00;
                    c2jm.A04("oauth_integration_id", str3);
                    c64057SyT.A01 = AbstractC167007dF.A1W(str3);
                    if (this.A02 != null) {
                        str2 = "IG";
                    } else {
                        str2 = null;
                    }
                    c2jm.A04("surface", str2);
                    PandoGraphQLRequest build = c64057SyT.build();
                    C14360o3.A07(build);
                    c64522THp.A00(this, build, new T8G(this, 1));
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw AbstractC58318PtA.A0f(e);
                }
            }
            i = 1132725407;
        } else {
            finish();
            i = -548617708;
        }
        C0f9.A07(i, A00);
    }

    @Override // android.app.Activity
    public final void onRestart() {
        int A00 = C0f9.A00(-367084873);
        super.onRestart();
        this.A01 = true;
        C0f9.A07(330901793, A00);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = C0f9.A00(-1096345688);
        super.onResume();
        if (this.A01 && !this.A00) {
            setResult(0, AbstractC31171DnF.A04().putExtra("error", "LOGIN_CANCELLED_BY_USER"));
            finish();
        }
        C0f9.A07(-487490173, A00);
    }
}
