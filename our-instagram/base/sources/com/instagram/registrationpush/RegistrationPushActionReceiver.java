package com.instagram.registrationpush;

import X.AbstractC12220kQ;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31178DnM;
import X.AbstractC31179DnN;
import X.AbstractC35274Fh9;
import X.AbstractC58317Pt9;
import X.C0f9;
import X.C0fM;
import X.C12260kU;
import X.C1Q9;
import X.C36160Fxa;
import X.EnumC12920le;
import X.InterfaceC02590Ai;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes6.dex */
public class RegistrationPushActionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A01 = C0f9.A01(1560946096);
        C0fM.A01(this, context, intent);
        C36160Fxa A00 = C36160Fxa.A00(context);
        AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
        if ("com.instagram.registrationpush.ACTION_TAPPED".equals(intent.getAction())) {
            long currentTimeMillis = System.currentTimeMillis();
            long A002 = C1Q9.A00();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(A0F), "push_tapped");
            if (A0f.isSampled()) {
                double d = currentTimeMillis;
                double d2 = A002;
                AbstractC31177DnL.A1B(A0f, d, d2);
                AbstractC31179DnN.A1A(A0f, "containermodule", "waterfall_log_in", d2);
                AbstractC31176DnK.A1K(A0f, d);
                AbstractC31178DnM.A14(A0f);
                AbstractC35274Fh9.A0C(A0f, A0F, "release_channel", AbstractC31176DnK.A0r(EnumC12920le.A00()));
                A0f.AAP("fb_family_device_id", AbstractC35274Fh9.A02(A0F));
                AbstractC31178DnM.A13(A0f);
                A0f.Cht();
            }
            Intent A04 = AbstractC31171DnF.A04();
            Context context2 = A00.A02;
            A04.setClassName(context2, "com.instagram.mainactivity.InstagramMainActivity");
            A04.setAction(AbstractC58317Pt9.A00(8));
            A04.addCategory(AbstractC58317Pt9.A00(79));
            A04.addFlags(268435456);
            C12260kU.A0C(context2, A04);
        } else if ("com.instagram.registrationpush.ACTION_DELETED".equals(intent.getAction())) {
            long currentTimeMillis2 = System.currentTimeMillis();
            long A003 = C1Q9.A00();
            InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A02(A0F), "push_dismissed");
            if (A0f2.isSampled()) {
                double d3 = currentTimeMillis2;
                AbstractC31176DnK.A1K(A0f2, d3);
                AbstractC31179DnN.A17(A0f2, d3, A003);
                AbstractC31179DnN.A15(A0f2);
                AbstractC31178DnM.A13(A0f2);
                A0f2.A7v("is_internal_build", AbstractC166997dE.A0a());
                AbstractC35274Fh9.A0C(A0f2, A0F, "release_channel", AbstractC31176DnK.A0r(EnumC12920le.A00()));
                A0f2.Cht();
            }
        }
        C0f9.A0E(-1856757723, A01, intent);
    }
}
