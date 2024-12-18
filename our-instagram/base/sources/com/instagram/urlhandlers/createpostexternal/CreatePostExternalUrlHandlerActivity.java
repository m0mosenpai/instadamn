package com.instagram.urlhandlers.createpostexternal;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.AbstractC69933Cc;
import X.AbstractC74053Tw;
import X.C06090Tz;
import X.C0f9;
import X.C0w9;
import X.C14360o3;
import X.C18U;
import X.C22P;
import X.C36324G0t;
import X.C43846JaA;
import X.C4JI;
import X.C69963Cf;
import X.EnumC33447EqK;
import X.EnumC69983Ch;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.creation.MediaCaptureConfig;

/* loaded from: classes6.dex */
public final class CreatePostExternalUrlHandlerActivity extends IgFragmentActivity {
    public AbstractC18680vv A00;

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(-1572622626);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A08 = AbstractC31172DnG.A08(intent);
        C14360o3.A0A(A08);
        AbstractC18680vv A0V = AbstractC31172DnG.A0V(A08);
        this.A00 = A0V;
        if (!(A0V instanceof UserSession)) {
            AbstractC35178FfV.A01(this, A08, A0V);
            i = 1246694084;
        } else {
            if (C18U.A06(C06090Tz.A05, A0V, 36324140445085619L)) {
                Intent A06 = AbstractC31176DnK.A06(this);
                Uri.Builder A04 = AbstractC31175DnJ.A04("instagram://share");
                C14360o3.A07(A04);
                A04.appendQueryParameter("new_feed_deeplink", "true");
                A06.setData(A04.build());
                AbstractC31174DnI.A14(this, A06);
            } else {
                String stringExtra = intent.getStringExtra("entrypoint");
                Bundle bundle2 = null;
                if (AbstractC74053Tw.A04(stringExtra)) {
                    try {
                        if (stringExtra != null) {
                            C22P A002 = C4JI.A00(Long.parseLong(stringExtra));
                            if (C22P.A5N != A002) {
                                bundle2 = AbstractC166987dD.A0b();
                                bundle2.putSerializable("cameraEntryPoint", A002);
                            }
                        } else {
                            IllegalStateException A0g = AbstractC166997dE.A0g();
                            C0f9.A07(-1591691607, A00);
                            throw A0g;
                        }
                    } catch (NumberFormatException e) {
                        C0w9.A07("create_post_external_url_handler", e);
                    }
                }
                C69963Cf A003 = AbstractC69933Cc.A00(this, (UserSession) A0V, new C36324G0t(this, 6));
                EnumC69983Ch enumC69983Ch = EnumC69983Ch.A02;
                MediaCaptureConfig mediaCaptureConfig = new MediaCaptureConfig(new C43846JaA(enumC69983Ch));
                if (bundle2 != null) {
                    C69963Cf.A03(bundle2, EnumC33447EqK.A09, A003, mediaCaptureConfig, enumC69983Ch, null, null, null, 0, 10001, true, false);
                } else {
                    A003.EoI(EnumC33447EqK.A09, mediaCaptureConfig, enumC69983Ch);
                }
            }
            finish();
            i = 1962915802;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
