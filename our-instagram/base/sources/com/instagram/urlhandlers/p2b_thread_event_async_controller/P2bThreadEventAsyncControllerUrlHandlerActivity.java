package com.instagram.urlhandlers.p2b_thread_event_async_controller;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC191768eY;
import X.AbstractC192798gL;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC58317Pt9;
import X.AbstractC73763Sg;
import X.C0f9;
import X.C192108fB;
import X.C1GJ;
import X.C3RD;
import X.C3RL;
import X.C73773Sh;
import X.N88;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.base.activity.BaseFragmentActivity;
import java.net.URLDecoder;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class P2bThreadEventAsyncControllerUrlHandlerActivity extends BaseFragmentActivity {
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
        String string;
        String str;
        int A00 = C0f9.A00(1639611603);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null && (string = A07.getString("original_url")) != null) {
            Uri A0B = AbstractC25227BEk.A0B(string);
            String queryParameter = A0B.getQueryParameter("event_type");
            String A002 = AbstractC58317Pt9.A00(39);
            String queryParameter2 = A0B.getQueryParameter(A002);
            if (queryParameter2 != null) {
                str = URLDecoder.decode(queryParameter2, ReactWebViewManager.HTML_ENCODING);
            } else {
                str = null;
            }
            C73773Sh c73773Sh = AbstractC73763Sg.A03;
            if (str == null) {
                str = "{}";
            }
            C3RD c3rd = C3RD.A01;
            Object A003 = c73773Sh.A00(str, new C3RL(c3rd, c3rd));
            N88 n88 = new N88();
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setStatusBarColor(0);
            HashMap A12 = AbstractC31174DnI.A12("event_type", queryParameter);
            A12.put(A002, A003);
            AbstractC192798gL A05 = C192108fB.A05(AbstractC31171DnF.A0F(this), "com.bloks.www.person.to.business.thread.event.async.controller", AbstractC191768eY.A01(A12));
            A05.A00(n88);
            C1GJ.A06(A05, 187041991, 2, false, false);
            finish();
            i = -1534120709;
        } else {
            i = 236686241;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
