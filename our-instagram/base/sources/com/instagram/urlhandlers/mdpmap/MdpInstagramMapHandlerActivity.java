package com.instagram.urlhandlers.mdpmap;

import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31176DnK;
import X.C023409i;
import X.C0f9;
import X.C0w9;
import X.C14360o3;
import X.W6l;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.intf.MapEntryPoint;

/* loaded from: classes11.dex */
public final class MdpInstagramMapHandlerActivity extends BaseFragmentActivity {
    public UserSession A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(-1589922069);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = 1652655427;
        } else {
            UserSession A06 = C023409i.A0A.A06(A07);
            this.A00 = A06;
            try {
                String string = A07.getString("original_url");
                if (string != null) {
                    Uri A03 = AbstractC08820cl.A03(string);
                    C14360o3.A0A(A03);
                    W6l.A00(A03, this, A06, MapEntryPoint.A06, AbstractC166997dE.A0n());
                    finish();
                    i = 1665546110;
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No URI provided");
                    C0f9.A07(1767933267, A00);
                    throw illegalArgumentException;
                }
            } catch (IllegalArgumentException e) {
                C0w9.A07("MdpInstagramMapHandlerActivity:InvalidQueryType", e);
                finish();
                C0f9.A07(-1724134100, A00);
                return;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return this.A00;
    }
}
