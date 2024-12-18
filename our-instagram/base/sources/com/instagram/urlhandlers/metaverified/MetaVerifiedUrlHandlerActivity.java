package com.instagram.urlhandlers.metaverified;

import X.AbstractC111324zv;
import X.AbstractC12220kQ;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC191768eY;
import X.AbstractC192798gL;
import X.AbstractC25227BEk;
import X.AbstractC25233BEq;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC31181DnP;
import X.AbstractC35178FfV;
import X.C06090Tz;
import X.C06N;
import X.C0f9;
import X.C18U;
import X.C192108fB;
import X.C1GJ;
import X.C32392EOt;
import X.C35756Fqt;
import X.C62862tP;
import X.InterfaceC02590Ai;
import X.InterfaceC11380iw;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class MetaVerifiedUrlHandlerActivity extends IgFragmentActivity implements InterfaceC11380iw {
    public AbstractC18680vv A00;
    public final C06N A01 = new C35756Fqt(this, 16);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "MetaVerifiedUrlHandlerActivity";
    }

    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), AbstractC111324zv.A00(4955));
        if (A0f.isSampled()) {
            A0f.AAP("stage", "deeplink");
            A0f.AAP("substage", "landing");
            AbstractC31171DnF.A1B(A0f, str);
            AbstractC31171DnF.A1E(A0f, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0f.A9M("extra_data", AbstractC25233BEq.A0p("deeplink_params", str3, AbstractC166987dD.A1L("entrypoint", str2)));
            A0f.Cht();
        }
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(1055386000);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = -1522820162;
        } else {
            AbstractC18680vv A0V = AbstractC31172DnG.A0V(A07);
            this.A00 = A0V;
            if (A0V == null) {
                finish();
                i = 1990378070;
            } else if (!(A0V instanceof UserSession)) {
                AbstractC35178FfV.A01(this, A07, A0V);
                finish();
                i = 709504237;
            } else if (!C18U.A06(C06090Tz.A05, A0V, 36317401643684994L)) {
                finish();
                i = 1443307521;
            } else {
                String A0a = AbstractC31171DnF.A0a(A07);
                if (A0a == null) {
                    finish();
                    i = -1275730049;
                } else {
                    Uri A0B = AbstractC25227BEk.A0B(A0a);
                    HashMap A1G = AbstractC166987dD.A1G();
                    String queryParameter = A0B.getQueryParameter("entrypoint");
                    if (queryParameter == null) {
                        finish();
                        i = -347096709;
                    } else {
                        A1G.put("entrypoint", queryParameter);
                        String queryParameter2 = A0B.getQueryParameter("deeplink_params");
                        HashMap A1G2 = AbstractC166987dD.A1G();
                        if (queryParameter2 != null && queryParameter2.length() != 0) {
                            try {
                                JSONObject jSONObject = new JSONObject(queryParameter2);
                                Iterator<String> keys = jSONObject.keys();
                                while (keys.hasNext()) {
                                    String A1B = AbstractC166987dD.A1B(keys);
                                    A1G2.put(A1B, jSONObject.getString(A1B));
                                }
                                A1G.put("deeplink_params", A1G2);
                            } catch (JSONException unused) {
                                A00(this, (UserSession) A0V, "mv_deeplink_json_exception", queryParameter, queryParameter2);
                                finish();
                                C0f9.A07(-304819422, A00);
                                return;
                            }
                        }
                        HashMap A01 = AbstractC191768eY.A01(A1G);
                        AbstractC31181DnP.A0L(this, getWindow());
                        getSupportFragmentManager().A0r(this.A01);
                        A00(this, (UserSession) A0V, "mv_deeplink_navigation", queryParameter, null);
                        C62862tP A012 = C62862tP.A01(null, this, this, A0V);
                        AbstractC192798gL A02 = C192108fB.A02(null, A0V, AbstractC111324zv.A00(366), A01);
                        C32392EOt.A00(A02, A012, 20);
                        C1GJ.A03(A02);
                        i = -703322774;
                    }
                }
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
