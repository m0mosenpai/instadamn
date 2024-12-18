package com.instagram.urlhandlers.quicksnap;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31181DnP;
import X.AbstractC35178FfV;
import X.AbstractC54121NwJ;
import X.AbstractC54852fj;
import X.C0f9;
import X.C14360o3;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class QuickSnapUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String A0a;
        int A00 = C0f9.A00(-1492126556);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null && (A0a = AbstractC31171DnF.A0a(A07)) != null) {
            AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
            if (A0F instanceof UserSession) {
                UserSession userSession = (UserSession) A0F;
                Uri A0B = AbstractC25227BEk.A0B(A0a);
                String host = A0B.getHost();
                if (host != null && host.hashCode() == -1756943393 && host.equals("quick_snap_details")) {
                    if (AbstractC54852fj.A00() != null) {
                        String A0X = AbstractC31175DnJ.A0X(A0B, "media_id");
                        C14360o3.A0B(userSession, 1);
                        AbstractC54121NwJ.A00(this, userSession, A0X, true);
                    } else {
                        AbstractC31181DnP.A0N(this, A0B);
                    }
                }
            } else {
                AbstractC35178FfV.A01(this, A07, A0F);
                C0f9.A07(-1106007620, A00);
            }
        }
        finish();
        C0f9.A07(-1106007620, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
