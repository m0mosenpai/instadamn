package com.instagram.urlhandlers.interappidentityswitch;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.C08V;
import X.InterfaceC11380iw;
import com.instagram.base.activity.IgFragmentActivity;

/* loaded from: classes6.dex */
public final class InterAppIdentitySwitchUrlHandlerActivity extends IgFragmentActivity implements InterfaceC11380iw, C08V {
    public AbstractC18680vv A00;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "inter_app_identity_switch";
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f3, code lost:
    
        if ("instagram".equals(r5) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010c, code lost:
    
        if (r5.contains(r8) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02d4, code lost:
    
        if (r8 == false) goto L86;
     */
    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r53) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.interappidentityswitch.InterAppIdentitySwitchUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
