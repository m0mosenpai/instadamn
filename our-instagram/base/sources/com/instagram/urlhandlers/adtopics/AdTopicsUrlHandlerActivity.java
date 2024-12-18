package com.instagram.urlhandlers.adtopics;

import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC192798gL;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC31178DnM;
import X.AbstractC35178FfV;
import X.AbstractC35275FhA;
import X.C00O;
import X.C023409i;
import X.C06090Tz;
import X.C09Y;
import X.C0f9;
import X.C14360o3;
import X.C192108fB;
import X.C32392EOt;
import X.C62862tP;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes6.dex */
public final class AdTopicsUrlHandlerActivity extends BaseFragmentActivity {
    public UserSession A00;

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
        String str;
        int A00 = C0f9.A00(1235956759);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = -209499447;
        } else {
            if (AbstractC31172DnG.A1Y(this)) {
                UserSession A0G = AbstractC31171DnF.A0G(A07);
                this.A00 = A0G;
                if (A0G != null) {
                    C62862tP A0G2 = AbstractC31178DnM.A0G(this, A0G, "deep_link_util");
                    Map singletonMap = Collections.singletonMap("referer", "settings_ad_options");
                    UserSession userSession = this.A00;
                    if (userSession != null) {
                        if (AbstractC31178DnM.A1X(C06090Tz.A05, userSession, 36311465996648983L)) {
                            singletonMap = AbstractC35275FhA.A01();
                            str = AbstractC111324zv.A00(101);
                        } else {
                            str = "com.instagram.sensitive_topics.sensitive_topics.ad_topic_preferences_view";
                        }
                        UserSession userSession2 = this.A00;
                        if (userSession2 != null) {
                            AbstractC192798gL A05 = C192108fB.A05(userSession2, str, singletonMap);
                            C32392EOt.A00(A05, A0G2, 16);
                            schedule(A05);
                        }
                    }
                }
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            AbstractC35178FfV.A03(A07, this);
            finish();
            i = 1902399597;
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
