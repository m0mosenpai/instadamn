package com.facebook.oauthaccountlinking;

import X.AbstractC06930Yk;
import X.AbstractC25230BEn;
import X.C62920SXc;
import X.C64522THp;
import X.InterfaceC02550Ad;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public abstract class OAuthAccountLinkingActivityBase extends FragmentActivity {
    public InterfaceC02550Ad A01;
    public C64522THp A02;
    public String A03 = "";
    public Bundle A00 = new Bundle(0);

    public static final void A00(OAuthAccountLinkingActivityBase oAuthAccountLinkingActivityBase, Integer num, Long l, String str, String str2) {
        long j;
        String string = oAuthAccountLinkingActivityBase.A00.getString(CacheBehaviorLogger.SOURCE);
        String str3 = "";
        if (string == null) {
            string = "";
        }
        LinkedHashMap A07 = AbstractC06930Yk.A07(AbstractC25230BEn.A1b(CacheBehaviorLogger.SOURCE, string));
        String string2 = oAuthAccountLinkingActivityBase.A00.getString("token_source");
        if (string2 == null) {
            string2 = "";
        }
        A07.put("token_source", string2);
        String string3 = oAuthAccountLinkingActivityBase.A00.getString("ad_id");
        if (string3 != null) {
            str3 = string3;
        }
        A07.put("ad_id", str3);
        A07.put("app_session_id", String.valueOf(oAuthAccountLinkingActivityBase.A00.getString("app_session_id")));
        if (l != null) {
            j = l.longValue();
        } else {
            j = oAuthAccountLinkingActivityBase.A00.getLong("expiry_time", 0L);
        }
        C62920SXc.A00.A00(oAuthAccountLinkingActivityBase.A01, num, oAuthAccountLinkingActivityBase.A03, str, str2, A07, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if ((r1 instanceof X.C64522THp) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            r5 = this;
            int r4 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = "oauth_account_linking_provider"
            r2 = 0
            r0 = 33
            android.content.Intent r1 = r5.getIntent()
            if (r4 < r0) goto L1b
            if (r1 == 0) goto L18
            java.lang.Class<X.THp> r0 = X.C64522THp.class
            java.io.Serializable r1 = r1.getSerializableExtra(r3, r0)
        L15:
            r2 = r1
            X.THp r2 = (X.C64522THp) r2
        L18:
            r5.A02 = r2
            return
        L1b:
            if (r1 == 0) goto L26
            java.io.Serializable r1 = r1.getSerializableExtra(r3)
        L21:
            boolean r0 = r1 instanceof X.C64522THp
            if (r0 == 0) goto L18
            goto L15
        L26:
            r1 = r2
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase.A01():void");
    }
}
