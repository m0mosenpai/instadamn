package com.instagram.urlhandlers.permissionsremovedaccounts;

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
import X.GN1;
import X.GN2;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes6.dex */
public final class PermissionsRemovedAccountsUrlHandlerActivity extends UserSessionUrlHandlerActivity {
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
        Runnable gn1;
        super.onPostCreate(bundle);
        C35756Fqt.A00(getSupportFragmentManager(), this, 21);
        AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
        PermissionsRemovedAccountsUrlHandlerActivity permissionsRemovedAccountsUrlHandlerActivity = null;
        if ((A0F instanceof UserSession) && (userSession = (UserSession) A0F) != null) {
            String stringExtra = getIntent().getStringExtra("surface");
            if (stringExtra == null) {
                stringExtra = "notification";
            }
            String stringExtra2 = getIntent().getStringExtra(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            if (stringExtra2 == null) {
                stringExtra2 = "deeplink";
            }
            C26069Bfx c26069Bfx = new C26069Bfx(stringExtra2, stringExtra, "removed_accounts", AbstractC167017dG.A0j(), 14);
            String A00 = UserSessionUrlHandlerActivity.A00(this, c26069Bfx, userSession);
            if (!AbstractC1565371b.A01(userSession)) {
                C3KD A01 = AbstractC35176FfT.A01(this, "not_in_gating");
                handler = this.A00;
                gn1 = new GN2(A01);
            } else if (AbstractC1565371b.A00(userSession)) {
                C35158Ff0.A00.A02(c26069Bfx, userSession, A00, "feature_blocked_invalid_session");
                C3KD A002 = AbstractC35176FfT.A00(this, userSession, "ig_permissions_removed_accounts_surface", null);
                handler = this.A00;
                gn1 = new GN1(A002);
            } else {
                Object A003 = AbstractC54852fj.A00();
                if (A003 instanceof FragmentActivity) {
                    permissionsRemovedAccountsUrlHandlerActivity = (Context) A003;
                }
                C35158Ff0.A00.A01(c26069Bfx, userSession, A00);
                PermissionsRemovedAccountsUrlHandlerActivity permissionsRemovedAccountsUrlHandlerActivity2 = permissionsRemovedAccountsUrlHandlerActivity;
                if (permissionsRemovedAccountsUrlHandlerActivity == null) {
                    permissionsRemovedAccountsUrlHandlerActivity2 = this;
                }
                F8D.A00(permissionsRemovedAccountsUrlHandlerActivity2, c26069Bfx, userSession);
                if (permissionsRemovedAccountsUrlHandlerActivity == null) {
                    return;
                }
                finish();
            }
            handler.postDelayed(gn1, 1000L);
            finish();
        }
    }
}
