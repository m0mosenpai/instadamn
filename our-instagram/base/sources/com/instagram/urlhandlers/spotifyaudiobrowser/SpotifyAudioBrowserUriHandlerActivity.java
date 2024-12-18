package com.instagram.urlhandlers.spotifyaudiobrowser;

import X.AbstractC166987dD;
import X.C14360o3;
import X.C55083Oaf;
import X.InterfaceC09390do;
import X.MYT;
import X.OT7;
import android.content.Intent;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes9.dex */
public final class SpotifyAudioBrowserUriHandlerActivity extends UserSessionUrlHandlerActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.urlhandler.UserSessionUrlHandlerActivity
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        new C55083Oaf(userSession);
        C55083Oaf.A00(userSession, this, "instagram_recommendations");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        onBackPressed();
        MYT myt = OT7.A01.A00;
        if (myt != null) {
            ImmutableList immutableList = C55083Oaf.A01;
            InterfaceC09390do interfaceC09390do = myt.A0S;
            new C55083Oaf(AbstractC166987dD.A0r(interfaceC09390do)).A01(myt.requireActivity(), intent, myt.A0M, AbstractC166987dD.A0r(interfaceC09390do), i2);
        }
    }
}
