package com.instagram.urlhandlers.fbeappstore;

import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.AbstractC35178FfV;
import X.AbstractC54852fj;
import X.C0f9;
import X.C1QO;
import X.C34397FEn;
import X.C66277U6x;
import X.C6XJ;
import X.InterfaceC53722dB;
import X.W6d;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class FbeAppStoreUrlHandlerActivity extends BaseFragmentActivity {
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
        C66277U6x A01;
        C34397FEn c34397FEn;
        int i;
        int A00 = C0f9.A00(1801562154);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A08 = AbstractC31172DnG.A08(intent);
        if (A08 != null) {
            this.A00 = AbstractC31172DnG.A0V(A08);
        }
        AbstractC18680vv abstractC18680vv = this.A00;
        if (abstractC18680vv != null && !(abstractC18680vv instanceof UserSession)) {
            AbstractC35178FfV.A01(this, A08, abstractC18680vv);
        } else {
            String stringExtra = intent.getStringExtra("app_id");
            String stringExtra2 = intent.getStringExtra("app_name");
            String stringExtra3 = intent.getStringExtra("app_logo_url");
            String stringExtra4 = intent.getStringExtra("authentication_url");
            if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2) && !TextUtils.isEmpty(stringExtra3) && !TextUtils.isEmpty(stringExtra4)) {
                HashMap A12 = AbstractC31174DnI.A12("app_id", stringExtra);
                A12.put("app_name", stringExtra2);
                A12.put("app_logo_url", stringExtra3);
                A12.put("authentication_url", stringExtra4);
                A01 = C66277U6x.A01("com.instagram.fbe.screens.value_prop", A12);
                AbstractC18680vv abstractC18680vv2 = this.A00;
                abstractC18680vv2.getClass();
                c34397FEn = new C34397FEn(abstractC18680vv2);
                i = 2131956631;
            } else {
                A01 = C66277U6x.A01(AbstractC111324zv.A00(815), AbstractC166987dD.A1G());
                AbstractC18680vv abstractC18680vv3 = this.A00;
                abstractC18680vv3.getClass();
                c34397FEn = new C34397FEn(abstractC18680vv3);
                i = 2131955167;
            }
            String string = getString(i);
            IgBloksScreenConfig igBloksScreenConfig = c34397FEn.A00;
            igBloksScreenConfig.A0U = string;
            igBloksScreenConfig.A0i = true;
            Bundle A002 = W6d.A00(igBloksScreenConfig, A01);
            InterfaceC53722dB A003 = AbstractC54852fj.A00();
            A003.getClass();
            A003.EfI(C1QO.A0E);
            C6XJ.A06(getApplicationContext(), A002, ModalActivity.class, "bloks");
            finish();
        }
        C0f9.A07(1092999786, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        AbstractC18680vv abstractC18680vv = this.A00;
        abstractC18680vv.getClass();
        return abstractC18680vv;
    }
}
