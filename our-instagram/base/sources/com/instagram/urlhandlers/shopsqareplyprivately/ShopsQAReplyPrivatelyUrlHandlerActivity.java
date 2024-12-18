package com.instagram.urlhandlers.shopsqareplyprivately;

import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC31179DnN;
import X.AbstractC31180DnO;
import X.AbstractC54852fj;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C66277U6x;
import X.InterfaceC11380iw;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class ShopsQAReplyPrivatelyUrlHandlerActivity extends BaseFragmentActivity implements InterfaceC11380iw {
    public AbstractC18680vv A00;
    public UserSession A01;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "manage_qa_private_reply";
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(462969872);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = 24027386;
        } else {
            C09Y c09y = C023409i.A0A;
            this.A00 = c09y.A04(A07);
            this.A01 = c09y.A06(A07);
            if (this.A00 != null) {
                String A0a = AbstractC31171DnF.A0a(A07);
                if (A0a != null && !TextUtils.isEmpty(A0a)) {
                    Uri A03 = AbstractC08820cl.A03(A0a);
                    if (this.A01 != null) {
                        String queryParameter = A03.getQueryParameter("ig_merchant_fbid");
                        Context context = (Context) AbstractC54852fj.A00();
                        if (queryParameter != null && context != null && this.A00 != null) {
                            HashMap A1G = AbstractC166987dD.A1G();
                            HashMap A1G2 = AbstractC166987dD.A1G();
                            HashMap A1G3 = AbstractC166987dD.A1G();
                            BitSet A0j = AbstractC31171DnF.A0j(1);
                            boolean A1Y = AbstractC31180DnO.A1Y("ig_merchant_fbid", queryParameter, A1G, A0j);
                            IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(this.A01);
                            A0C.A0R = "com.bloks.www.qa.private-reply.manage.bottom-sheet";
                            if (A0j.nextClearBit(A1Y ? 1 : 0) >= 1) {
                                C66277U6x A0H = AbstractC31179DnN.A0H("com.bloks.www.qa.private-reply.manage.bottom-sheet", A1G, A1G2);
                                A0H.A03 = null;
                                A0H.A02 = null;
                                A0H.A04 = null;
                                A0H.A08(A1G3);
                                A0H.A05(context, A0C);
                            } else {
                                throw AbstractC31173DnH.A0f();
                            }
                        }
                    }
                }
                finish();
                i = 557111538;
            } else {
                finish();
                i = 1758831755;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(1982405064);
        super.onResume();
        if (getWindow() != null && getWindow().getDecorView() != null) {
            AbstractC31172DnG.A1B(getApplicationContext(), getWindow().getDecorView(), R.color.igds_creation_menu_background);
        }
        C0f9.A07(-353362607, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
