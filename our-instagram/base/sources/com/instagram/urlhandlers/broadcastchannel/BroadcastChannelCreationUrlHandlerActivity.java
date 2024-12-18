package com.instagram.urlhandlers.broadcastchannel;

import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC35055FcS;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C14360o3;
import X.EnumC33330EoP;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.direct.channels.analytics.ChannelCreationSource;

/* loaded from: classes6.dex */
public final class BroadcastChannelCreationUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        Bundle A08;
        C09Y c09y = C023409i.A0A;
        Intent intent = getIntent();
        if (intent != null && (A08 = AbstractC31172DnG.A08(intent)) != null) {
            return c09y.A04(A08);
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        Bundle A08;
        ChannelCreationSource channelCreationSource;
        int A00 = C0f9.A00(1604506397);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && (A08 = AbstractC31172DnG.A08(intent)) != null) {
            String A0a = AbstractC31171DnF.A0a(A08);
            if (A0a != null && A0a.length() != 0) {
                if (!AbstractC31172DnG.A1Y(this)) {
                    AbstractC35178FfV.A03(A08, this);
                } else {
                    String queryParameter = AbstractC25227BEk.A0B(A0a).getQueryParameter(CacheBehaviorLogger.SOURCE);
                    if (queryParameter != null && queryParameter.hashCode() == 2591 && queryParameter.equals("QP")) {
                        channelCreationSource = ChannelCreationSource.A0B;
                    } else {
                        channelCreationSource = ChannelCreationSource.A09;
                    }
                    AbstractC18680vv session = getSession();
                    AbstractC31171DnF.A1Q(session);
                    UserSession userSession = (UserSession) session;
                    EnumC33330EoP enumC33330EoP = EnumC33330EoP.A02;
                    ChannelCreationFlowExtraArgs channelCreationFlowExtraArgs = new ChannelCreationFlowExtraArgs(null, null, null);
                    C14360o3.A0B(userSession, 0);
                    AbstractC35055FcS.A01(userSession, channelCreationFlowExtraArgs, channelCreationSource, enumC33330EoP, false).Cgf(this);
                }
            }
            finish();
            i = -211929985;
        } else {
            finish();
            i = -1654190606;
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
