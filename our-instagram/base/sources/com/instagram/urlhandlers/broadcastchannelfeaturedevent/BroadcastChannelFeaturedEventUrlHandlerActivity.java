package com.instagram.urlhandlers.broadcastchannelfeaturedevent;

import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.AbstractC31181DnP;
import X.AbstractC35178FfV;
import X.AbstractC54852fj;
import X.C023409i;
import X.C06090Tz;
import X.C09Y;
import X.C0f9;
import X.C140966Yy;
import X.C18U;
import X.EOA;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class BroadcastChannelFeaturedEventUrlHandlerActivity extends BaseFragmentActivity {
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
        String str;
        Uri A03;
        int A00 = C0f9.A00(848989512);
        super.onCreate(bundle);
        if (!C18U.A06(C06090Tz.A05, getSession(), 36319377329233225L)) {
            finish();
            i = -560093611;
        } else {
            Bundle A07 = AbstractC31176DnK.A07(this);
            if (A07 != null && A07.getString("original_url") != null) {
                AbstractC18680vv session = getSession();
                if (session instanceof UserSession) {
                    String string = A07.getString("original_url");
                    if (string != null && string.length() != 0) {
                        Uri A0B = AbstractC25227BEk.A0B(string);
                        String queryParameter = A0B.getQueryParameter("identifier");
                        List<String> pathSegments = A0B.getPathSegments();
                        if (pathSegments.size() >= 2) {
                            str = (String) AbstractC25227BEk.A0t(pathSegments);
                        } else {
                            str = null;
                        }
                        if ((queryParameter != null && queryParameter.length() != 0) || (str != null && str.length() != 0)) {
                            if (AbstractC54852fj.A00() != null) {
                                if (queryParameter == null) {
                                    if (str != null) {
                                        queryParameter = str;
                                    } else {
                                        throw AbstractC166997dE.A0g();
                                    }
                                }
                                Bundle A0b = AbstractC166987dD.A0b();
                                A0b.putString("ChannelsFeaturedEventListFragment.ARGUMENT_EVENT_IDENTIFIER", queryParameter);
                                EOA eoa = new EOA();
                                eoa.setArguments(A0b);
                                C140966Yy A0D = AbstractC31180DnO.A0D(this, getSession());
                                A0D.A0D(eoa);
                                A0D.A04();
                            } else {
                                String string2 = A07.getString("original_url");
                                if (string2 != null && (A03 = AbstractC08820cl.A03(string2)) != null) {
                                    AbstractC31181DnP.A0N(this, A03);
                                }
                            }
                        }
                    }
                } else {
                    AbstractC35178FfV.A01(this, A07, session);
                }
                i = -410240031;
            }
            finish();
            i = -410240031;
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
