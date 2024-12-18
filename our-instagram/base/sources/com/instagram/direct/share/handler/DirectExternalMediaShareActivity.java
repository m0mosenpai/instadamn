package com.instagram.direct.share.handler;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC34770FTt;
import X.C12260kU;
import X.C1XM;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.MHI;
import android.content.Intent;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes.dex */
public class DirectExternalMediaShareActivity extends IgFragmentActivity implements InterfaceC11380iw {
    public UserSession A00;
    public final InterfaceC09390do A01 = C1XM.A00(new MHI(this, 0));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_external_photo_share";
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A01.getValue();
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 4919 && i2 == -1) {
            C12260kU.A0C(this, AbstractC34770FTt.A00(this, "all", "direct-inbox", null, 67174400));
        }
        finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (java.lang.Boolean.valueOf(X.C18U.A06(X.C06090Tz.A05, r6, 36325085337891548L)).booleanValue() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        if (r11 != false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.share.handler.DirectExternalMediaShareActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
