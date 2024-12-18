package com.instagram.urlhandlers.directquickreplysettings;

import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31180DnO;
import X.AbstractC31270Dos;
import X.AbstractC35178FfV;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.C27391Ur;
import X.C28531Zo;
import X.C33232ElR;
import X.JUJ;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class DirectQuickReplySettingsUriHandlerActivity extends BaseFragmentActivity {
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
        int i;
        int A00 = C0f9.A00(-828914345);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra("com.instagram.url.extra.BUNDLE");
        if (bundleExtra == null) {
            i = -55011619;
        } else {
            AbstractC18680vv A0V = AbstractC31172DnG.A0V(bundleExtra);
            this.A00 = A0V;
            if (A0V == null) {
                i = 1402296090;
            } else {
                if (!(A0V instanceof UserSession)) {
                    C27391Ur A002 = AbstractC35178FfV.A00();
                    AbstractC18680vv abstractC18680vv = this.A00;
                    if (abstractC18680vv != null) {
                        A002.A00(this, getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE"), abstractC18680vv);
                    } else {
                        IllegalStateException A0g = AbstractC166997dE.A0g();
                        C0f9.A07(-236152466, A00);
                        throw A0g;
                    }
                } else {
                    AbstractC31171DnF.A1Q(A0V);
                    String stringExtra = intent.getStringExtra("entrypoint");
                    if (AbstractC31270Dos.A00((UserSession) A0V)) {
                        if (!"business_hub".equals(stringExtra) && !"pro_home".equals(stringExtra) && !"inbox_tool".equals(stringExtra)) {
                            C140966Yy A0D = AbstractC31180DnO.A0D(this, this.A00);
                            A0D.A0B(null, new C33232ElR());
                            A0D.A04();
                            C140966Yy A0P = AbstractC31173DnH.A0P(this, this.A00);
                            A0P.A0B(null, C28531Zo.A04.A02.A02(stringExtra, null));
                            A0P.A04();
                        } else {
                            UserSession userSession = (UserSession) this.A00;
                            C14360o3.A0A(userSession);
                            JUJ.A00(userSession).A05();
                            C140966Yy A0D2 = AbstractC31180DnO.A0D(this, this.A00);
                            A0D2.A0B(null, C28531Zo.A04.A02.A02(stringExtra, null));
                            A0D2.A04();
                        }
                    }
                }
                i = 329114205;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
