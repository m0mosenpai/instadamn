package com.instagram.urlhandlers.activepromotions;

import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C14360o3;
import X.C27391Ur;
import X.F0J;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes6.dex */
public final class ActivePromotionsUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-1582337933);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A08 = AbstractC31172DnG.A08(intent);
        C09Y c09y = C023409i.A0A;
        if (A08 != null) {
            this.A00 = c09y.A04(A08);
            String A0a = AbstractC31171DnF.A0a(A08);
            if (A0a != null) {
                Uri A0B = AbstractC25227BEk.A0B(A0a);
                AbstractC31173DnH.A1A(A0B, A08, "coupon_offer_id");
                AbstractC31173DnH.A1A(A0B, A08, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                AbstractC31173DnH.A1A(A0B, A08, "dummy_param_random_uuid");
                AbstractC31172DnG.A1I(A0B, A08, "has_relaunched_from_main_activity");
            }
            AbstractC18680vv abstractC18680vv = this.A00;
            if (!(abstractC18680vv instanceof UserSession)) {
                C27391Ur A002 = AbstractC35178FfV.A00();
                AbstractC18680vv abstractC18680vv2 = this.A00;
                C14360o3.A0A(abstractC18680vv2);
                A002.A00(this, A08, abstractC18680vv2);
            } else {
                AbstractC31171DnF.A1Q(abstractC18680vv);
                UserSession userSession = (UserSession) abstractC18680vv;
                String stringExtra = intent.getStringExtra("entrypoint");
                if (stringExtra == null) {
                    stringExtra = "DEEPLINK_UNKNOWN";
                }
                if ("inbox_tool".equals(stringExtra)) {
                    F0J.A00().A02(this, userSession, stringExtra, null, true);
                } else {
                    F0J.A00().A00(A08, this, userSession, stringExtra);
                }
            }
            C0f9.A07(1988256361, A00);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A07(-157344732, A00);
        throw A0g;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
