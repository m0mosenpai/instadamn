package com.instagram.urlhandlers.permissionsmanagement;

import X.AbstractC1565371b;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC35176FfT;
import X.AbstractC54852fj;
import X.C26069Bfx;
import X.C35158Ff0;
import X.C35756Fqt;
import X.C3KD;
import X.F8D;
import X.GN0;
import X.RunnableC36878GMz;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes6.dex */
public final class PermissionsManagementUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    public final Handler A00 = AbstractC167007dF.A0J();

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.content.Context] */
    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        UserSession userSession;
        Handler handler;
        Runnable runnableC36878GMz;
        super.onPostCreate(bundle);
        C35756Fqt.A00(getSupportFragmentManager(), this, 20);
        AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
        PermissionsManagementUrlHandlerActivity permissionsManagementUrlHandlerActivity = null;
        if ((A0F instanceof UserSession) && (userSession = (UserSession) A0F) != null) {
            String stringExtra = getIntent().getStringExtra("surface");
            if (stringExtra == null) {
                stringExtra = "notification";
            }
            String stringExtra2 = getIntent().getStringExtra(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            if (stringExtra2 == null) {
                stringExtra2 = "deeplink";
            }
            C26069Bfx c26069Bfx = new C26069Bfx(stringExtra2, stringExtra, "management_surface", AbstractC167017dG.A0j(), 14);
            String A00 = UserSessionUrlHandlerActivity.A00(this, c26069Bfx, userSession);
            if (!AbstractC1565371b.A01(userSession)) {
                C3KD A01 = AbstractC35176FfT.A01(this, "not_in_gating");
                handler = this.A00;
                runnableC36878GMz = new GN0(A01);
            } else if (AbstractC1565371b.A00(userSession)) {
                C35158Ff0.A00.A02(c26069Bfx, userSession, A00, "feature_blocked_invalid_session");
                C3KD A002 = AbstractC35176FfT.A00(this, userSession, "ig_permissions_management_surface", null);
                handler = this.A00;
                runnableC36878GMz = new RunnableC36878GMz(A002);
            } else {
                Object A003 = AbstractC54852fj.A00();
                if (A003 instanceof FragmentActivity) {
                    permissionsManagementUrlHandlerActivity = (Context) A003;
                }
                C35158Ff0.A00.A01(c26069Bfx, userSession, A00);
                PermissionsManagementUrlHandlerActivity permissionsManagementUrlHandlerActivity2 = permissionsManagementUrlHandlerActivity;
                if (permissionsManagementUrlHandlerActivity == null) {
                    permissionsManagementUrlHandlerActivity2 = this;
                }
                F8D.A00(permissionsManagementUrlHandlerActivity2, c26069Bfx, userSession);
                if (permissionsManagementUrlHandlerActivity == null) {
                    return;
                }
                finish();
            }
            handler.postDelayed(runnableC36878GMz, 1000L);
            finish();
        }
    }
}
