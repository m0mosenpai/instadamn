package com.instagram.lockscreen;

import X.A1G;
import X.AbstractC167007dF;
import X.AbstractC172747mk;
import X.AbstractC18680vv;
import X.AbstractC25236BEt;
import X.AbstractC31171DnF;
import X.AbstractC31175DnJ;
import X.AbstractC43591JPw;
import X.C0f9;
import X.C12260kU;
import X.InterfaceC02590Ai;
import X.OTM;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.IgActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class LockScreenShortcutActivity extends IgActivity {
    @Override // com.instagram.base.activity.IgActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        InterfaceC02590Ai A0P;
        String str;
        AbstractC18680vv A0F;
        int A00 = C0f9.A00(-1290334641);
        super.onCreate(bundle);
        Intent A04 = AbstractC31171DnF.A04();
        A04.setClassName(this, AbstractC43591JPw.A00(71));
        A04.setAction("android.intent.action.VIEW");
        A04.setFlags(67108864);
        UserSession userSession = null;
        try {
            A0F = AbstractC31171DnF.A0F(this);
        } catch (IllegalStateException unused) {
        }
        if (A0F instanceof UserSession) {
            userSession = (UserSession) A0F;
            if (userSession != null) {
                boolean A1Z = AbstractC167007dF.A1Z(AbstractC172747mk.A00(this, userSession).A04);
                OTM A002 = A1G.A00(this, userSession);
                boolean A1Z2 = AbstractC167007dF.A1Z(A002.A00);
                if (A1Z) {
                    if (A1Z2) {
                        A0P = AbstractC25236BEt.A0P(A002);
                        if (A0P.isSampled()) {
                            str = "lss_launched";
                            AbstractC31175DnJ.A15(A0P, str);
                        }
                    }
                    A04.setData(Uri.parse("instagram://story-camera/"));
                } else {
                    if (A1Z2) {
                        A0P = AbstractC25236BEt.A0P(A002);
                        if (A0P.isSampled()) {
                            str = "lss_launched_organic";
                            AbstractC31175DnJ.A15(A0P, str);
                        }
                    }
                    A04.setData(Uri.parse("instagram://story-camera/"));
                }
            }
        }
        C12260kU.A0C(this, A04);
        finish();
        C0f9.A07(1402142158, A00);
    }
}
