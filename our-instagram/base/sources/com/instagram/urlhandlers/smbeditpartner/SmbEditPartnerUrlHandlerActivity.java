package com.instagram.urlhandlers.smbeditpartner;

import X.AbstractC018607g;
import X.AbstractC12990ll;
import X.AbstractC1566171j;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC31178DnM;
import X.AbstractC31179DnN;
import X.AbstractC31181DnP;
import X.AbstractC35178FfV;
import X.AbstractC59962oe;
import X.AbstractC81793ku;
import X.C08730cb;
import X.C0f9;
import X.C14360o3;
import X.C17060sy;
import X.C18C;
import X.C1ON;
import X.C25621Ms;
import X.C61972ry;
import X.EBI;
import X.ETS;
import X.FTO;
import X.InterfaceC111194zh;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public class SmbEditPartnerUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        AbstractC18680vv abstractC18680vv = this.A00;
        abstractC18680vv.getClass();
        return abstractC18680vv;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(1087118831);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A08 = AbstractC31172DnG.A08(intent);
        if (A08 != null) {
            this.A00 = AbstractC31172DnG.A0V(A08);
        }
        String A0n = AbstractC166997dE.A0n();
        String stringExtra = intent.getStringExtra("servicetype");
        stringExtra.getClass();
        SMBPartnerType A002 = AbstractC81793ku.A00(stringExtra);
        C18C.A07(A002, "service type in deep link should not be null");
        String stringExtra2 = intent.getStringExtra("entrypoint");
        AbstractC18680vv abstractC18680vv = this.A00;
        if (abstractC18680vv != null) {
            if (!(abstractC18680vv instanceof UserSession)) {
                AbstractC35178FfV.A00().A00(this, A08, this.A00);
                i = 1752060101;
            } else {
                UserSession userSession = (UserSession) abstractC18680vv;
                C08730cb c08730cb = C17060sy.A01;
                InterfaceC111194zh A003 = AbstractC1566171j.A00(A002, c08730cb.A01(userSession));
                if (A003 != null) {
                    AbstractC18680vv abstractC18680vv2 = this.A00;
                    abstractC18680vv2.getClass();
                    String AcH = A003.AcH();
                    String Bba = A003.Bba();
                    String url = A003.getUrl();
                    String url2 = A003.getUrl();
                    stringExtra2.getClass();
                    C14360o3.A0B(A0n, 3);
                    AbstractC31181DnP.A0a(AbstractC31174DnI.A0P().A06(A002, A0n, AcH, Bba, url, url2, stringExtra2), this, abstractC18680vv2);
                } else if (SMBPartnerType.A05 == A002) {
                    C61972ry c61972ry = new C61972ry(this, AbstractC018607g.A00(this));
                    ETS ets = new ETS(this, A002, this, A0n, stringExtra2, 2);
                    C25621Ms A0D = AbstractC31179DnN.A0D(userSession);
                    A0D.A0B("business/instant_experience/get_donation_button_partners_bundle/");
                    C1ON A0J = AbstractC31178DnM.A0J(A0D, EBI.class, FTO.class);
                    A0J.A00 = ets;
                    c61972ry.schedule(A0J);
                } else {
                    AbstractC18680vv abstractC18680vv3 = this.A00;
                    abstractC18680vv3.getClass();
                    stringExtra2.getClass();
                    User A01 = c08730cb.A01(userSession);
                    SMBPartnerType[] values = SMBPartnerType.values();
                    int length = values.length;
                    for (int i2 = 0; i2 < length && AbstractC1566171j.A00(values[i2], A01) == null; i2++) {
                    }
                    AbstractC167007dF.A1F(A0n, 3, stringExtra2);
                    AbstractC31173DnH.A0u();
                    Bundle A0b = AbstractC166987dD.A0b();
                    AbstractC31176DnK.A19(A0b, stringExtra2, A0n);
                    A0b.putSerializable("args_service_type", A002);
                    AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
                    abstractC59962oe.setArguments(A0b);
                    AbstractC31181DnP.A0a(abstractC59962oe, this, abstractC18680vv3);
                }
                i = -878286441;
            }
            C0f9.A07(i, A00);
            return;
        }
        IllegalStateException A14 = AbstractC166987dD.A14("Both UserSession and LoggedOutSession are null");
        C0f9.A07(651524962, A00);
        throw A14;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        AbstractC18680vv abstractC18680vv = this.A00;
        abstractC18680vv.getClass();
        return abstractC18680vv;
    }
}
