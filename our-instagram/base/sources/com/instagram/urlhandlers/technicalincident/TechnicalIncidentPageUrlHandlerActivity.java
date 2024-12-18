package com.instagram.urlhandlers.technicalincident;

import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.C0f9;
import X.FDZ;
import X.InterfaceC08100bW;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class TechnicalIncidentPageUrlHandlerActivity extends BaseFragmentActivity {
    public final InterfaceC08100bW A00 = AbstractC31175DnJ.A0B();

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(-849631348);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = -1907382549;
        } else {
            String A0a = AbstractC31171DnF.A0a(A07);
            if (A0a == null) {
                finish();
                i = -1003927167;
            } else {
                Uri A01 = AbstractC08820cl.A01(this.A00, A0a);
                if (A01 != null) {
                    String scheme = A01.getScheme();
                    String host = A01.getHost();
                    if ("instagram".equalsIgnoreCase(scheme) && "technical_incident".equalsIgnoreCase(host)) {
                        Bundle A0b = AbstractC166987dD.A0b();
                        AbstractC31173DnH.A1A(A01, A0b, "timestamp");
                        if (!A0b.containsKey("timestamp")) {
                            finish();
                        } else {
                            String string = A0b.getString("timestamp");
                            AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
                            if (string == null) {
                                string = "";
                            }
                            FDZ.A00(this, A0F, string);
                        }
                        i = 1793851966;
                    }
                }
                finish();
                i = -1321389846;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
