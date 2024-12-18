package com.instagram.urlhandlers.whatsapp;

import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC14490oL;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.AnonymousClass001;
import X.C023409i;
import X.C09Y;
import X.C0b3;
import X.C0f9;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class WhatsAppRedirectUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        C09Y c09y = C023409i.A0A;
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null) {
            return c09y.A04(A07);
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        Bundle A08;
        int A00 = C0f9.A00(893329252);
        super.onCreate(bundle);
        if (bundle != null) {
            i = 2063146631;
        } else {
            Intent intent = getIntent();
            if (intent != null && (A08 = AbstractC31172DnG.A08(intent)) != null) {
                if (!AbstractC31172DnG.A1Y(this)) {
                    AbstractC35178FfV.A03(A08, this);
                } else {
                    String A0a = AbstractC31171DnF.A0a(A08);
                    if (A0a != null && A0a.length() != 0) {
                        try {
                            Uri A03 = AbstractC08820cl.A03(A0a);
                            String queryParameter = A03.getQueryParameter("campaign");
                            if (queryParameter == null) {
                                queryParameter = "ig_unknown_campaign";
                            }
                            String queryParameter2 = A03.getQueryParameter("source_surface");
                            if (AbstractC14490oL.A0G(this)) {
                                Uri parse = Uri.parse("https://chat.whatsapp.com");
                                if (queryParameter2 != null && queryParameter2.length() != 0) {
                                    parse = Uri.parse(AnonymousClass001.A0R("https://chat.whatsapp.com?source_surface=", queryParameter2));
                                }
                                Intent intent2 = new Intent("android.intent.action.VIEW", parse);
                                intent2.setPackage("com.whatsapp");
                                C0b3.A00().A06().A0G(this, intent2);
                            } else {
                                AbstractC14490oL.A07(this, "com.whatsapp", AnonymousClass001.A0R("ig4a%26utm_campaign%3D", queryParameter));
                            }
                        } catch (IllegalArgumentException | SecurityException unused) {
                            finish();
                        }
                    }
                    finish();
                }
                i = -2070617190;
            } else {
                finish();
                i = -1710782075;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
