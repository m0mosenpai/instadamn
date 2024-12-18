package com.instagram.urlhandlers.signalsplayground;

import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC31179DnN;
import X.AbstractC31181DnP;
import X.AbstractC35178FfV;
import X.AbstractC54852fj;
import X.C06090Tz;
import X.C0f9;
import X.C18U;
import X.C1QO;
import X.C6XJ;
import X.InterfaceC53722dB;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* loaded from: classes6.dex */
public final class CreatorInspirationSignalsPlaygroundUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(-1519627398);
        super.onCreate(bundle);
        if (bundle != null) {
            i = -505969630;
        } else {
            Bundle A07 = AbstractC31176DnK.A07(this);
            if (A07 == null) {
                finish();
                i = 1540928350;
            } else {
                String A0a = AbstractC31171DnF.A0a(A07);
                if (A0a == null) {
                    finish();
                    i = -1642489822;
                } else {
                    Uri A0B = AbstractC25227BEk.A0B(A0a);
                    AbstractC18680vv session = getSession();
                    if (session != null) {
                        if (!(session instanceof UserSession)) {
                            AbstractC35178FfV.A01(this, A07, session);
                        } else if (C18U.A06(C06090Tz.A05, session, 36328499836894792L)) {
                            InterfaceC53722dB A002 = AbstractC54852fj.A00();
                            if (A002 != null) {
                                A002.EfI(C1QO.A0C);
                                C6XJ A0L = AbstractC31171DnF.A0L(this, A07, getSession(), ModalActivity.class, AbstractC111324zv.A00(4208));
                                A0L.A0J = new int[]{R.anim.right_in, R.anim.left_out, R.anim.left_in, R.anim.right_out};
                                A0L.A08 = true;
                                A0L.A0C(this);
                            } else {
                                AbstractC31181DnP.A0N(this, A0B);
                            }
                            finish();
                        } else {
                            finish();
                            i = -2016312785;
                        }
                    }
                    i = -1461256795;
                }
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31179DnN.A0J(this);
    }
}
