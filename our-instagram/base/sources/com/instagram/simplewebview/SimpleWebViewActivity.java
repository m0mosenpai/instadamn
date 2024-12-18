package com.instagram.simplewebview;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31173DnH;
import X.AbstractC59962oe;
import X.C00O;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C14240no;
import X.C14360o3;
import X.C1H6;
import X.C35133Fea;
import X.MSY;
import android.content.Context;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes9.dex */
public final class SimpleWebViewActivity extends BaseFragmentActivity {
    public static final C35133Fea A02 = new Object();
    public AbstractC18680vv A00;
    public boolean A01;

    public static final void A00(Context context, AbstractC12990ll abstractC12990ll, SimpleWebViewConfig simpleWebViewConfig) {
        A02.A02(context, abstractC12990ll, simpleWebViewConfig);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        AbstractC18680vv abstractC18680vv = this.A00;
        if (abstractC18680vv != null) {
            return abstractC18680vv;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
        if (getSupportFragmentManager().A0O(R.id.layout_container_main) == null) {
            AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
            abstractC59962oe.setArguments(AbstractC31173DnH.A0A(this));
            C14240no A0G = MSY.A0G(this);
            A0G.A0A(abstractC59962oe, R.id.layout_container_main);
            A0G.A00();
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (!this.A01) {
            overridePendingTransition(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_right_exit);
        }
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A00 = C0f9.A00(1551431989);
        C1H6.A01(this);
        C09Y c09y = C023409i.A0A;
        Bundle A0A = AbstractC31173DnH.A0A(this);
        if (A0A != null) {
            AbstractC18680vv A04 = c09y.A04(A0A);
            C14360o3.A0B(A04, 0);
            this.A00 = A04;
            Bundle A0A2 = AbstractC31173DnH.A0A(this);
            if (A0A2 != null) {
                Object obj = A0A2.get("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG");
                if (obj instanceof SimpleWebViewConfig) {
                    this.A01 = ((SimpleWebViewConfig) obj).A04;
                }
                super.onCreate(bundle);
                if (!this.A01) {
                    overridePendingTransition(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_left_exit);
                }
                C0f9.A07(-1980268364, A00);
                return;
            }
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -1388582056;
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -953617384;
        }
        C0f9.A07(i, A00);
        throw A14;
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
