package com.instagram.urlhandlers.fxcalimnamechangingreminder;

import X.AbstractC03270Dk;
import X.AbstractC12990ll;
import X.AbstractC13670mt;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.C0f9;
import X.C14360o3;
import X.C27391Ur;
import X.C66277U6x;
import X.C6XJ;
import X.W6d;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class FxCalIMNameChangingReminderUrlActivity extends BaseFragmentActivity {
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
        String A0a;
        int A00 = C0f9.A00(-138697269);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null) {
            this.A00 = AbstractC31172DnG.A0V(A07);
        }
        AbstractC18680vv abstractC18680vv = this.A00;
        if (!(abstractC18680vv instanceof UserSession)) {
            C27391Ur A002 = AbstractC35178FfV.A00();
            AbstractC18680vv abstractC18680vv2 = this.A00;
            C14360o3.A0A(abstractC18680vv2);
            A002.A00(this, A07, abstractC18680vv2);
        } else {
            C14360o3.A0A(abstractC18680vv);
            UserSession A003 = AbstractC03270Dk.A00(abstractC18680vv);
            if (A07 != null && (A0a = AbstractC31171DnF.A0a(A07)) != null) {
                String queryParameter = AbstractC25227BEk.A0B(A0a).getQueryParameter("central_profile_screen_id");
                if (AbstractC13670mt.A0B(queryParameter)) {
                    finish();
                    i = 1332879213;
                } else {
                    HashMap A1G = AbstractC166987dD.A1G();
                    JSONObject A0q = AbstractC31171DnF.A0q();
                    JSONObject A0q2 = AbstractC31171DnF.A0q();
                    try {
                        A0q.put("account_id", A003.userId);
                        A0q.put("central_profile_screen_id", queryParameter);
                        A0q.put("is_account_id_igid", "true");
                        A0q2.put("server_params", A0q);
                        A1G.put("params", A0q2.toString());
                        C66277U6x A01 = C66277U6x.A01("com.bloks.www.fxim.settings.aview", A1G);
                        C14360o3.A0A(A01);
                        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(A003);
                        A0C.A0i = true;
                        C6XJ.A06(getApplicationContext(), W6d.A00(A0C, A01), ModalActivity.class, "bloks");
                        finish();
                    } catch (JSONException e) {
                        RuntimeException runtimeException = new RuntimeException(e);
                        C0f9.A07(-345861012, A00);
                        throw runtimeException;
                    }
                }
            } else {
                finish();
                i = 1717342604;
            }
            C0f9.A07(i, A00);
        }
        i = 186076966;
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
