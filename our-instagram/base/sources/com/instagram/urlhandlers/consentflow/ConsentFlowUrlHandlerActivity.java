package com.instagram.urlhandlers.consentflow;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC31198Dnh;
import X.AbstractC61813Ru7;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C51974MyH;
import X.FPT;
import X.GUZ;
import X.OKB;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.HashSet;

/* loaded from: classes6.dex */
public final class ConsentFlowUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        AbstractC18680vv abstractC18680vv = this.A00;
        if (abstractC18680vv != null) {
            return abstractC18680vv;
        }
        AbstractC31171DnF.A0u();
        throw C00O.createAndThrow();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        OKB A00;
        String queryParameter;
        boolean z;
        int A002 = C0f9.A00(1230028072);
        AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
        C14360o3.A0B(A0F, 0);
        this.A00 = A0F;
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = 1766739556;
        } else {
            String A0a = AbstractC31171DnF.A0a(A07);
            if (A0a != null && A0a.length() != 0) {
                C51974MyH c51974MyH = null;
                Uri A0B = AbstractC25227BEk.A0B(A0a);
                String queryParameter2 = A0B.getQueryParameter("trigger_key");
                String A02 = AbstractC31198Dnh.A02(0, 9, 21);
                if (queryParameter2 != null) {
                    FPT fpt = (FPT) getSession().A01(FPT.class, GUZ.A00);
                    synchronized (fpt) {
                        HashSet hashSet = fpt.A00;
                        if (hashSet.contains(queryParameter2)) {
                            z = false;
                        } else {
                            hashSet.add(queryParameter2);
                            z = true;
                        }
                    }
                    if (z) {
                        c51974MyH = new C51974MyH(queryParameter2, fpt, 1);
                        A00 = AbstractC61813Ru7.A00(getSession());
                        queryParameter = A0B.getQueryParameter("flow_name");
                        if (queryParameter == null) {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                    finish();
                    i = 1868679772;
                } else {
                    A00 = AbstractC61813Ru7.A00(getSession());
                    queryParameter = A0B.getQueryParameter("flow_name");
                    if (queryParameter == null) {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                A00.A01(this, c51974MyH, queryParameter, A0B.getQueryParameter(CacheBehaviorLogger.SOURCE), A0B.getQueryParameter(A02), A0B.getQueryParameter("app_id"), A0B.getQueryParameter("extra_params"));
                finish();
                i = 1868679772;
            } else {
                finish();
                i = 1655808254;
            }
        }
        C0f9.A07(i, A002);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
