package com.instagram.urlhandlers.media;

import X.AbstractC31177DnL;
import X.AbstractC31178DnM;
import X.AbstractC31179DnN;
import X.AbstractC54852fj;
import X.C06090Tz;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes6.dex */
public final class MediaExternalUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (X.AbstractC31174DnI.A1U(r3, "open_like_count") != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (r1 == null) goto L24;
     */
    @Override // com.instagram.urlhandler.UserSessionUrlHandlerActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0n(android.os.Bundle r8, android.os.Bundle r9, com.instagram.common.session.UserSession r10) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.media.MediaExternalUrlHandlerActivity.A0n(android.os.Bundle, android.os.Bundle, com.instagram.common.session.UserSession):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Object A00;
        super.onBackPressed();
        if (AbstractC31178DnM.A1X(C06090Tz.A05, ((UserSessionUrlHandlerActivity) this).A00, 36322980804897587L) && (A00 = AbstractC54852fj.A00()) != null) {
            AbstractC31179DnN.A0w(AbstractC31177DnL.A0I((FragmentActivity) A00));
        }
        if (getSupportFragmentManager().A0U.A04().isEmpty()) {
            finish();
        }
    }
}
