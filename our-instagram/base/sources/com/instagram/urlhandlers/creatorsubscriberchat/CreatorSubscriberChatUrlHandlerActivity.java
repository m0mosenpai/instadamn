package com.instagram.urlhandlers.creatorsubscriberchat;

import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC2051396d;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC35055FcS;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.EnumC33330EoP;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.channels.analytics.ChannelCreationSource;

/* loaded from: classes6.dex */
public final class CreatorSubscriberChatUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        C09Y c09y = C023409i.A0A;
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null) {
            return c09y.A04(A07);
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String A0a;
        int A00 = C0f9.A00(-467947809);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null && (A0a = AbstractC31171DnF.A0a(A07)) != null && A0a.length() != 0) {
            AbstractC18680vv session = getSession();
            if (!(session instanceof UserSession)) {
                AbstractC35178FfV.A01(this, A07, session);
            } else {
                UserSession userSession = (UserSession) session;
                if (AbstractC2051396d.A01(userSession)) {
                    AbstractC35055FcS.A02(userSession, ChannelCreationSource.A0B, EnumC33330EoP.A03).Cgf(this);
                }
            }
            i = -190932296;
        } else {
            finish();
            i = 1323313503;
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
