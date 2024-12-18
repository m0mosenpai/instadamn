package com.instagram.urlhandlers.permissionsinvitation;

import X.AbstractC1565371b;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.AbstractC35176FfT;
import X.AbstractC40691uc;
import X.C26069Bfx;
import X.C2JM;
import X.C35158Ff0;
import X.C35756Fqt;
import X.C3KD;
import X.C59984Qs6;
import X.ETV;
import X.RunnableC36876GMx;
import X.RunnableC36877GMy;
import android.os.Bundle;
import android.os.Handler;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes6.dex */
public final class PermissionsInvitationUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    public final Handler A00 = AbstractC167007dF.A0J();

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        UserSession userSession;
        String str;
        Handler handler;
        Runnable runnableC36876GMx;
        super.onPostCreate(bundle);
        C35756Fqt.A00(getSupportFragmentManager(), this, 19);
        AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
        if ((A0F instanceof UserSession) && (userSession = (UserSession) A0F) != null) {
            String stringExtra = getIntent().getStringExtra("surface");
            if (stringExtra == null) {
                stringExtra = "notification";
            }
            String stringExtra2 = getIntent().getStringExtra(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            if (stringExtra2 == null) {
                stringExtra2 = "deeplink";
            }
            C26069Bfx c26069Bfx = new C26069Bfx(stringExtra2, stringExtra, "account_delegate_invite", AbstractC167017dG.A0j(), 14);
            String stringExtra3 = getIntent().getStringExtra("component");
            if (AbstractC16960so.A1Q("activity_feed", "push_notification").contains(c26069Bfx.A00)) {
                C35158Ff0.A00(c26069Bfx, userSession, "tap", "deeplink", stringExtra3, null);
            }
            if (!AbstractC1565371b.A01(userSession)) {
                str = "not_in_gating";
            } else {
                if (AbstractC1565371b.A00(userSession)) {
                    C35158Ff0.A00.A02(c26069Bfx, userSession, stringExtra3, "feature_blocked_invalid_session");
                    C3KD A00 = AbstractC35176FfT.A00(this, userSession, "ig_permissions_invitation", null);
                    handler = this.A00;
                    runnableC36876GMx = new RunnableC36876GMx(A00);
                    handler.postDelayed(runnableC36876GMx, 1000L);
                    finish();
                }
                String stringExtra4 = getIntent().getStringExtra(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                String stringExtra5 = getIntent().getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
                if (stringExtra4 != null && stringExtra4.length() != 0 && stringExtra5 != null && stringExtra5.length() != 0) {
                    C2JM A0b = AbstractC25225BEi.A0b();
                    C2JM A0b2 = AbstractC25225BEi.A0b();
                    A0b.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, stringExtra4);
                    AbstractC40691uc.A01(userSession).A06(new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IGPermissionsInviteValidityQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59984Qs6.class, false, null, 0, null, "xig_encrypted_shared_account_access_info", AbstractC166987dD.A1E()).setFreshCacheAgeMs(0L).setMaxToleratedCacheAgeMs(0L), new ETV(c26069Bfx, userSession, this, stringExtra4, stringExtra5, stringExtra3, 1));
                    return;
                }
                str = "missing_required_parameters";
                C35158Ff0.A00.A02(c26069Bfx, userSession, stringExtra3, "missing_required_parameters");
            }
            C3KD A01 = AbstractC35176FfT.A01(this, str);
            handler = this.A00;
            runnableC36876GMx = new RunnableC36877GMy(A01);
            handler.postDelayed(runnableC36876GMx, 1000L);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }
}
