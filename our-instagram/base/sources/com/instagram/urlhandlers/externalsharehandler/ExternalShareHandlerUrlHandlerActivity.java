package com.instagram.urlhandlers.externalsharehandler;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC25233BEq;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC31178DnM;
import X.AbstractC35178FfV;
import X.AbstractC35275FhA;
import X.C06090Tz;
import X.C0CA;
import X.C0f9;
import X.C14360o3;
import X.C18U;
import X.C2Fb;
import X.C2JM;
import X.C32530EUg;
import X.C32531EUh;
import X.C32537EUn;
import X.C60398Qym;
import X.C63397SjR;
import X.FLQ;
import X.InterfaceC11380iw;
import X.SW9;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class ExternalShareHandlerUrlHandlerActivity extends BaseFragmentActivity implements InterfaceC11380iw {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ExternalShareHandlerUrlHandlerActivity";
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(-832987701);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = -2119330937;
        } else {
            AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
            String A0a = AbstractC31171DnF.A0a(A07);
            if (A0a == null) {
                finish();
                i = -1440148377;
            } else {
                Uri A0B = AbstractC25227BEk.A0B(A0a);
                if (!(A0F instanceof UserSession)) {
                    AbstractC35178FfV.A01(this, A07, A0F);
                    finish();
                    i = -750524109;
                } else {
                    UserSession userSession = (UserSession) A0F;
                    C06090Tz A0j = AbstractC25225BEi.A0j(userSession, 0);
                    if (C18U.A06(A0j, userSession, 36329371715256618L)) {
                        if (C18U.A06(A0j, userSession, 36329371715453229L)) {
                            C63397SjR c63397SjR = new C63397SjR(this, userSession, C2Fb.A0i, A0a, false);
                            c63397SjR.A0S = "ExternalShareHandlerUrlHandlerActivity";
                            c63397SjR.A0A();
                        } else {
                            String stringExtra = getIntent().getStringExtra("share_id");
                            if (stringExtra != null) {
                                FLQ flq = new FLQ(userSession);
                                Intent intent = getIntent();
                                C14360o3.A07(intent);
                                C32537EUn c32537EUn = new C32537EUn(this, this, intent, A07, A0a);
                                Object BFG = flq.A01.A00.BFG(stringExtra);
                                if (BFG != null) {
                                    c32537EUn.onSuccess(BFG);
                                } else {
                                    SW9 sw9 = flq.A00;
                                    C32531EUh c32531EUh = new C32531EUh(c32537EUn, flq, stringExtra, 17);
                                    C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, stringExtra, "short_code");
                                    C2JM A0b = AbstractC25225BEi.A0b();
                                    sw9.A00.A06(new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "ResolveExternalShareUrl", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C60398Qym.class, false, null, 0, null, "xdt__resolve_share_url", AbstractC166987dD.A1E()), new C32530EUg(1, c32531EUh, sw9));
                                }
                            }
                        }
                    } else {
                        AbstractC31178DnM.A0q(A0B, A07, "mainfeed");
                        AbstractC35275FhA.A03(this, A07);
                    }
                    i = -1310305272;
                }
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
