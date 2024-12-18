package com.instagram.urlhandlers.p2b_thread_event_bloks_controller;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC191768eY;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC31178DnM;
import X.AbstractC58317Pt9;
import X.AbstractC73763Sg;
import X.C35756Fqt;
import X.C3RD;
import X.C3RL;
import X.C66277U6x;
import X.C73773Sh;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.net.URLDecoder;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class P2bThreadEventBloksControllerUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        String string;
        String str;
        super.onPostCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null && (string = A07.getString("original_url")) != null) {
            Uri A0B = AbstractC25227BEk.A0B(string);
            String queryParameter = A0B.getQueryParameter("event_type");
            String A00 = AbstractC58317Pt9.A00(39);
            String queryParameter2 = A0B.getQueryParameter(A00);
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
            Map map = (Map) c73773Sh.A00(str, new C3RL(c3rd, c3rd));
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setStatusBarColor(0);
            getSupportFragmentManager().A0r(new C35756Fqt(this, 18));
            IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(AbstractC31171DnF.A0F(this));
            A0C.A0R = "com.bloks.www.person.to.business.thread.event.bloks.controller";
            HashMap A1G = AbstractC166987dD.A1G();
            HashMap A1G2 = AbstractC166987dD.A1G();
            HashMap A1G3 = AbstractC166987dD.A1G();
            BitSet bitSet = new BitSet(1);
            A1G.put("event_type", queryParameter);
            bitSet.set(0);
            if (map != null && !map.isEmpty()) {
                A1G.put(A00, map);
            }
            if (bitSet.nextClearBit(0) >= 1) {
                C66277U6x A02 = C66277U6x.A02("com.bloks.www.person.to.business.thread.event.bloks.controller", AbstractC191768eY.A01(A1G), A1G2);
                AbstractC31178DnM.A1M(A02, 719983200);
                A02.A03 = null;
                A02.A02 = null;
                A02.A04 = null;
                A02.A08(A1G3);
                A02.A05(this, A0C);
                return;
            }
            throw AbstractC166987dD.A14("Missing Required Props");
        }
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
