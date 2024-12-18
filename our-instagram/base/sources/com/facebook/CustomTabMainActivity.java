package com.facebook;

import X.AbstractC166987dD;
import X.AbstractC58321PtD;
import X.AbstractC58323PtF;
import X.AbstractC62356S8d;
import X.AbstractC63349Si6;
import X.AnonymousClass001;
import X.C0f9;
import X.C41451vu;
import X.C62662SKw;
import X.C63165SeP;
import X.C64471TFh;
import X.C64473TFj;
import X.InterfaceC41501vz;
import X.SV2;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import java.util.Collection;

/* loaded from: classes10.dex */
public class CustomTabMainActivity extends Activity {
    public boolean A01 = true;
    public InterfaceC41501vz A00 = null;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        boolean z;
        int A09 = AbstractC58321PtD.A09(this, -1184881461);
        super.onCreate(bundle);
        if (!AbstractC58323PtF.A1W(this)) {
            finish();
        }
        if ("CustomTabActivity.action_customTabRedirect".equals(getIntent().getAction())) {
            setResult(0);
            finish();
            i = -1785440123;
        } else {
            if (bundle == null) {
                String stringExtra = getIntent().getStringExtra("CustomTabMainActivity.extra_action");
                Bundle bundleExtra = getIntent().getBundleExtra("CustomTabMainActivity.extra_params");
                String stringExtra2 = getIntent().getStringExtra("CustomTabMainActivity.extra_chromePackage");
                Bundle A0M = AbstractC58321PtD.A0M(bundleExtra, bundleExtra);
                Collection collection = AbstractC62356S8d.A01;
                Uri A00 = AbstractC63349Si6.A00(A0M, String.format("m.%s", IGPixelRequestBuffer.URL_PREFIX), AnonymousClass001.A0u("v2.3", "/", "dialog/", stringExtra));
                C62662SKw A01 = new C63165SeP(null).A01();
                A01.A00.setPackage(stringExtra2);
                try {
                    A01.A00(this, A00);
                    z = true;
                } catch (ActivityNotFoundException unused) {
                    z = false;
                }
                this.A01 = false;
                if (!z) {
                    setResult(0, getIntent().putExtra("CustomTabMainActivity.no_activity_exception", true));
                    finish();
                    i = -313143066;
                } else {
                    C64473TFj c64473TFj = new C64473TFj(this, 1);
                    this.A00 = c64473TFj;
                    C41451vu.A01.A02(c64473TFj, C64471TFh.class);
                }
            }
            i = -715104842;
        }
        C0f9.A07(i, A09);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        int A00 = C0f9.A00(2006141850);
        InterfaceC41501vz interfaceC41501vz = this.A00;
        if (interfaceC41501vz != null) {
            C41451vu.A01.A03(interfaceC41501vz, C64471TFh.class);
        }
        super.onDestroy();
        C0f9.A07(-1052043915, A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.1vw, java.lang.Object] */
    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        Bundle A0b;
        super.onNewIntent(intent);
        if ("CustomTabMainActivity.action_refresh".equals(intent.getAction())) {
            C41451vu.A01.E4s(new Object());
        } else if (!"CustomTabActivity.action_customTabRedirect".equals(intent.getAction())) {
            return;
        }
        String stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
        if (stringExtra != null) {
            A0b = AbstractC63349Si6.A01(stringExtra);
        } else {
            A0b = AbstractC166987dD.A0b();
        }
        Intent A00 = SV2.A00(getIntent(), A0b, null);
        if (A00 != null) {
            intent = A00;
        }
        setResult(-1, intent);
        finish();
    }

    @Override // android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(-2121318846);
        super.onResume();
        if (this.A01) {
            setResult(0, SV2.A00(getIntent(), AbstractC166987dD.A0b(), null));
            finish();
        }
        this.A01 = true;
        C0f9.A07(-223282094, A00);
    }
}
