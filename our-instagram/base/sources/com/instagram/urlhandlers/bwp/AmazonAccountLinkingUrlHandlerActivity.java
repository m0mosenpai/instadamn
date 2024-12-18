package com.instagram.urlhandlers.bwp;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31181DnP;
import X.AbstractC35178FfV;
import X.AbstractC54852fj;
import X.AbstractC58317Pt9;
import X.AbstractC61813Ru7;
import X.C023409i;
import X.C06090Tz;
import X.C09Y;
import X.C0f9;
import X.C14360o3;
import X.C18U;
import X.C67602UsN;
import android.os.Bundle;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.net.URLDecoder;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AmazonAccountLinkingUrlHandlerActivity extends BaseFragmentActivity {
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
        JSONObject A0q;
        int A00 = C0f9.A00(1070289);
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
        C09Y c09y = C023409i.A0A;
        AbstractC18680vv A05 = c09y.A05(this);
        if (A05 instanceof UserSession) {
            if (C18U.A06(C06090Tz.A05, c09y.A05(this), 36325527719523469L)) {
                if (AbstractC54852fj.A00() != null) {
                    String stringExtra = getIntent().getStringExtra("consent_flow_name");
                    String stringExtra2 = getIntent().getStringExtra("partnership_name");
                    if (stringExtra != null && stringExtra.length() != 0 && stringExtra2 != null && stringExtra2.length() != 0) {
                        try {
                            String stringExtra3 = getIntent().getStringExtra("extra_params");
                            if (stringExtra3 == null) {
                                stringExtra3 = "";
                            }
                            A0q = new JSONObject(URLDecoder.decode(stringExtra3, ReactWebViewManager.HTML_ENCODING));
                        } catch (Exception unused) {
                            A0q = AbstractC31171DnF.A0q();
                        }
                        A0q.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, AbstractC58317Pt9.A00(139));
                        AbstractC18680vv A052 = c09y.A05(this);
                        C14360o3.A0B(A052, 0);
                        AbstractC61813Ru7.A00(A052).A00(this, new C67602UsN(1, this, this), stringExtra, stringExtra2, A0q.toString());
                    }
                } else {
                    Bundle bundleExtra2 = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
                    if (bundleExtra2 != null && (A0a = AbstractC31171DnF.A0a(bundleExtra2)) != null) {
                        AbstractC31181DnP.A0N(this, AbstractC25227BEk.A0B(A0a));
                    }
                }
            }
            finish();
        } else {
            AbstractC35178FfV.A01(this, bundleExtra, A05);
        }
        C0f9.A07(-99648420, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
