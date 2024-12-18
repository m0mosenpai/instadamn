package com.instagram.urlhandlers.p2mincentive;

import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC31179DnN;
import X.AbstractC31180DnO;
import X.AbstractC31198Dnh;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C66277U6x;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.BitSet;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class P2mIncentiveUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C0f9.A00(317844858);
        super.onCreate(bundle);
        if (bundle != null) {
            i = -1759732490;
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
                            String queryParameter = A03.getQueryParameter("offer_id");
                            String A002 = AbstractC31198Dnh.A00();
                            String queryParameter2 = A03.getQueryParameter(A002);
                            String queryParameter3 = A03.getQueryParameter("is_buyer");
                            String queryParameter4 = A03.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                            if (queryParameter != null && queryParameter.length() != 0 && queryParameter3 != null && queryParameter3.length() != 0) {
                                boolean equals = queryParameter3.equals(RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                                IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(getSession());
                                A0C.A0R = "com.bloks.www.bloks.p2m.incentive.landing.page.screen";
                                A0C.A0R = "com.bloks.www.bloks.p2m.incentive.landing.page.screen";
                                HashMap A1G = AbstractC166987dD.A1G();
                                HashMap A1G2 = AbstractC166987dD.A1G();
                                HashMap A1G3 = AbstractC166987dD.A1G();
                                BitSet A0j = AbstractC31171DnF.A0j(2);
                                boolean A1Y = AbstractC31180DnO.A1Y("offer_id", queryParameter, A1G, A0j);
                                if (queryParameter2 == null) {
                                    queryParameter2 = AbstractC167017dG.A0j();
                                }
                                A1G.put(A002, queryParameter2);
                                A0j.set(1);
                                AbstractC31173DnH.A1Y("is_buyer", A1G, equals);
                                if (queryParameter4 == null) {
                                    queryParameter4 = "unknown";
                                }
                                A1G.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, queryParameter4);
                                if (A0j.nextClearBit(A1Y ? 1 : 0) >= 2) {
                                    C66277U6x A0H = AbstractC31179DnN.A0H("com.bloks.www.bloks.p2m.incentive.landing.page.screen", A1G, A1G2);
                                    A0H.A03 = null;
                                    A0H.A02 = null;
                                    A0H.A04 = null;
                                    A0H.A08(A1G3);
                                    AbstractC31180DnO.A16(null, A0H.A03(this, A0C), this, getSession(), A1Y);
                                } else {
                                    throw AbstractC31173DnH.A0f();
                                }
                            }
                        } catch (IllegalArgumentException | SecurityException unused) {
                            finish();
                        }
                    }
                    finish();
                }
                i = -273635136;
            } else {
                finish();
                i = 475155013;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
