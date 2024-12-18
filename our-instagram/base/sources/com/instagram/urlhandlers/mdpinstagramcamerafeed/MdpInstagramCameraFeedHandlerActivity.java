package com.instagram.urlhandlers.mdpinstagramcamerafeed;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.AbstractC35178FfV;
import X.C06090Tz;
import X.C0f9;
import X.C128535rM;
import X.C18U;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class MdpInstagramCameraFeedHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C0f9.A00(2137996250);
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
        if (bundleExtra == null) {
            finish();
            i = -2091791763;
        } else {
            AbstractC18680vv A0V = AbstractC31172DnG.A0V(bundleExtra);
            if (A0V == null) {
                finish();
                i = 2094403112;
            } else {
                this.A00 = A0V;
                if (!(A0V instanceof UserSession)) {
                    AbstractC35178FfV.A00().A00(this, getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE"), A0V);
                } else {
                    String A0a = AbstractC31171DnF.A0a(bundleExtra);
                    if (A0a != null && A0a.length() != 0) {
                        Uri A0B = AbstractC25227BEk.A0B(A0a);
                        Intent A06 = AbstractC31176DnK.A06(this);
                        Uri.Builder appendQueryParameter = AbstractC31175DnJ.A04("instagram://story-camera").appendQueryParameter(DatePickerDialogModule.ARG_MODE, C128535rM.A00.A02);
                        if (A0B.getQueryParameter("close_friends") != null && C18U.A06(C06090Tz.A05, A0V, 36316065908133827L)) {
                            appendQueryParameter.appendQueryParameter("close_friends", "true");
                        }
                        AbstractC31180DnO.A0z(this, A06, appendQueryParameter);
                    }
                }
                finish();
                i = -522693786;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
