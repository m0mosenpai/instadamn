package com.instagram.urlhandlers.trendingaudio;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC31179DnN;
import X.AbstractC35178FfV;
import X.AbstractC43591JPw;
import X.C0f9;
import X.C140966Yy;
import X.C45507KCw;
import X.C8BO;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class TrendingAudioUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(-2083495636);
        super.onCreate(bundle);
        if (bundle != null) {
            i = -770582228;
        } else {
            Bundle A07 = AbstractC31176DnK.A07(this);
            if (A07 == null) {
                finish();
                i = 400275162;
            } else if (AbstractC31171DnF.A0a(A07) == null) {
                finish();
                i = 211402529;
            } else {
                AbstractC18680vv session = getSession();
                if (session != null) {
                    if (!(session instanceof UserSession)) {
                        AbstractC35178FfV.A01(this, A07, session);
                    } else {
                        C8BO c8bo = C8BO.A02;
                        Bundle A0b = AbstractC166987dD.A0b();
                        A0b.putString("referrer_audio_id", null);
                        A0b.putSerializable(AbstractC43591JPw.A00(41), c8bo);
                        C45507KCw c45507KCw = new C45507KCw();
                        c45507KCw.setArguments(A0b);
                        C140966Yy A0O = AbstractC31173DnH.A0O(null, c45507KCw, this, session);
                        A0O.A0F = true;
                        AbstractC31174DnI.A1L(A0O);
                    }
                }
                i = -528773288;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31179DnN.A0J(this);
    }
}
