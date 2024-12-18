package com.instagram.urlhandlers.smbselectpartner;

import X.AbstractC03270Dk;
import X.AbstractC12990ll;
import X.AbstractC1566171j;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC31181DnP;
import X.AbstractC35178FfV;
import X.AbstractC59962oe;
import X.AbstractC81793ku;
import X.C08730cb;
import X.C0f9;
import X.C14360o3;
import X.C17060sy;
import X.C27391Ur;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class SmbSelectPartnerUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        AbstractC18680vv abstractC18680vv = this.A00;
        if (abstractC18680vv != null) {
            return abstractC18680vv;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A00 = C0f9.A00(-752911788);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A08 = AbstractC31172DnG.A08(intent);
        if (A08 != null) {
            this.A00 = AbstractC31172DnG.A0V(A08);
        }
        AbstractC18680vv abstractC18680vv = this.A00;
        if (abstractC18680vv != null) {
            if (!(abstractC18680vv instanceof UserSession)) {
                C27391Ur A002 = AbstractC35178FfV.A00();
                AbstractC18680vv abstractC18680vv2 = this.A00;
                if (abstractC18680vv2 != null) {
                    A002.A00(this, A08, abstractC18680vv2);
                    C0f9.A07(1998788825, A00);
                    return;
                } else {
                    A14 = AbstractC166987dD.A14("Required value was null.");
                    i = 1236237289;
                }
            } else {
                String A0j = AbstractC167017dG.A0j();
                String stringExtra = intent.getStringExtra("servicetype");
                if (stringExtra != null) {
                    SMBPartnerType A003 = AbstractC81793ku.A00(stringExtra);
                    String stringExtra2 = intent.getStringExtra("entrypoint");
                    AbstractC18680vv abstractC18680vv3 = this.A00;
                    if (abstractC18680vv3 != null) {
                        C14360o3.A0A(stringExtra2);
                        C08730cb c08730cb = C17060sy.A01;
                        AbstractC18680vv abstractC18680vv4 = this.A00;
                        if (abstractC18680vv4 != null) {
                            User A01 = c08730cb.A01(AbstractC03270Dk.A00(abstractC18680vv4));
                            SMBPartnerType[] values = SMBPartnerType.values();
                            int length = values.length;
                            for (int i2 = 0; i2 < length && AbstractC1566171j.A00(values[i2], A01) == null; i2++) {
                            }
                            AbstractC167007dF.A1F(A0j, 3, stringExtra2);
                            AbstractC31173DnH.A0u();
                            Bundle A0b = AbstractC166987dD.A0b();
                            AbstractC31176DnK.A19(A0b, stringExtra2, A0j);
                            A0b.putSerializable("args_service_type", A003);
                            AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
                            abstractC59962oe.setArguments(A0b);
                            AbstractC31181DnP.A0a(abstractC59962oe, this, abstractC18680vv3);
                            C0f9.A07(1998788825, A00);
                            return;
                        }
                        A14 = AbstractC166987dD.A14("Required value was null.");
                        i = -1619316094;
                    } else {
                        A14 = AbstractC166987dD.A14("Required value was null.");
                        i = 1722141988;
                    }
                } else {
                    A14 = AbstractC166987dD.A14("Required value was null.");
                    i = 1456313598;
                }
            }
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -534265347;
        }
        C0f9.A07(i, A00);
        throw A14;
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
