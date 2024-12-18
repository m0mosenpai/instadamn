package com.instagram.urlhandlers.messaginghub;

import X.AbstractC06930Yk;
import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.AnonymousClass637;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.C16920sk;
import X.C18U;
import X.C63719SsZ;
import X.C66277U6x;
import X.C69421Vn6;
import X.VRA;
import X.W6d;
import X.WTY;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class MessagingHubUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C0f9.A00(-1492247491);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null && getSession() != null) {
            if (!AbstractC31172DnG.A1Y(this)) {
                AbstractC35178FfV.A03(A07, this);
            } else {
                String A0a = AbstractC31171DnF.A0a(A07);
                if (A0a == null) {
                    finish();
                    i = -1797563289;
                } else {
                    Uri A0B = AbstractC25227BEk.A0B(A0a);
                    String queryParameter = A0B.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    if (queryParameter == null) {
                        queryParameter = "unknown";
                    }
                    String queryParameter2 = A0B.getQueryParameter("messaging_guidance_hub_type");
                    if (queryParameter2 == null) {
                        queryParameter2 = "CTD";
                    }
                    String A0X = AbstractC31175DnJ.A0X(A0B, "media_id");
                    AbstractC18680vv session = getSession();
                    HashMap A12 = AbstractC31174DnI.A12(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, queryParameter);
                    A12.put("messaging_guidance_hub_type", queryParameter2);
                    A12.put("media_id", A0X);
                    if (C18U.A06(AbstractC25225BEi.A0j(session, 0), session, 36327052432914701L)) {
                        AnonymousClass637 A002 = VRA.A00(session, false);
                        LinkedHashMap A1I = AbstractC166987dD.A1I();
                        BitSet A0j = AbstractC31171DnF.A0j(2);
                        A1I.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, queryParameter);
                        A0j.set(0);
                        A1I.put("messaging_guidance_hub_type", queryParameter2);
                        A0j.set(1);
                        A1I.put("media_id", A0X);
                        if (A0j.nextClearBit(0) >= 2) {
                            C16920sk c16920sk = C16920sk.A00;
                            C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                            C63719SsZ c63719SsZ = new C63719SsZ("com.bloks.www.screen_query.BloksIGBoostMessagingHubScreenQuery", null, null, AbstractC06930Yk.A0B(A1I), c16920sk, 719983200, 0L, true);
                            WTY wty = new WTY(new C69421Vn6(null, null, null, null, "", null, null, false, false), null, null, null);
                            C14360o3.A0B(A002, 1);
                            c63719SsZ.E2V(this, wty, A002);
                        } else {
                            throw AbstractC31172DnG.A0v();
                        }
                    } else {
                        C140966Yy A0r = AbstractC25225BEi.A0r(this, session);
                        C66277U6x A01 = C66277U6x.A01(AbstractC111324zv.A00(369), A12);
                        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(session);
                        A0C.A0k = false;
                        A0r.A0B(null, W6d.A02(A0C, A01));
                        A0r.A0D = false;
                        A0r.A04();
                    }
                }
            }
            i = 1558290320;
        } else {
            finish();
            i = -196514653;
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
