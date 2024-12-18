package com.instagram.registrationpush;

import X.AbstractC12220kQ;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31178DnM;
import X.AbstractC31179DnN;
import X.AbstractC35274Fh9;
import X.AbstractC53242c7;
import X.C04750Mt;
import X.C0f9;
import X.C0fM;
import X.C18920wW;
import X.C1Q9;
import X.C218914p;
import X.C35264Fgy;
import X.C36160Fxa;
import X.InterfaceC02590Ai;
import X.InterfaceC19610xo;
import X.MSV;
import X.XN9;
import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.R;

/* loaded from: classes6.dex */
public class RegistrationPushAlarmReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A01 = C0f9.A01(2008941914);
        C0fM.A01(this, context, intent);
        AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
        C36160Fxa A00 = C36160Fxa.A00(context);
        if (!C35264Fgy.A06() && !C35264Fgy.A05()) {
            if (C218914p.A08()) {
                synchronized (C35264Fgy.class) {
                    InterfaceC19610xo ARD = C35264Fgy.A01.A00.ARD();
                    ARD.E77("registration_push_sent_v2", true);
                    ARD.apply();
                }
                C18920wW A02 = AbstractC12220kQ.A02(A0F);
                long currentTimeMillis = System.currentTimeMillis();
                long A002 = C1Q9.A00();
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A02, "pushable");
                if (A0f.isSampled()) {
                    double d = currentTimeMillis;
                    AbstractC31176DnK.A1K(A0f, d);
                    AbstractC31179DnN.A17(A0f, d, A002);
                    AbstractC35274Fh9.A0D(A0f, "waterfall_id", C1Q9.A01());
                    AbstractC31178DnM.A14(A0f);
                    AbstractC35274Fh9.A0B(A0f, A0F);
                }
                Context context2 = A00.A02;
                XN9 xn9 = new XN9(context2, MSV.A00(474));
                xn9.A0E(true);
                int i = R.drawable.notification_icon;
                int A0H = AbstractC53242c7.A0H(context2, R.attr.defaultNotificationIcon);
                if (A0H != 0) {
                    i = A0H;
                }
                xn9.A04(i);
                xn9.A0C(context2.getString(R.string.res_0x7f130072_name_removed));
                xn9.A0B(context2.getString(2131965666));
                Intent intent2 = new Intent(context2, (Class<?>) RegistrationPushActionReceiver.class);
                intent2.setAction("com.instagram.registrationpush.ACTION_TAPPED");
                C04750Mt c04750Mt = new C04750Mt();
                c04750Mt.A0B(intent2, context2.getClassLoader());
                xn9.A0C = c04750Mt.A02(context2, 0, 0);
                Intent intent3 = new Intent(context2, (Class<?>) RegistrationPushActionReceiver.class);
                intent3.setAction("com.instagram.registrationpush.ACTION_DELETED");
                C04750Mt c04750Mt2 = new C04750Mt();
                c04750Mt2.A0B(intent3, context2.getClassLoader());
                xn9.A0A.deleteIntent = c04750Mt2.A02(context2, 0, 0);
                Notification A03 = xn9.A03();
                long currentTimeMillis2 = System.currentTimeMillis();
                long A003 = C1Q9.A00();
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A02(A0F), "pushed");
                if (A0f2.isSampled()) {
                    double d2 = currentTimeMillis2;
                    double d3 = A003;
                    AbstractC31177DnL.A1B(A0f2, d2, d3);
                    AbstractC31177DnL.A1G(A0f2, "containermodule", "waterfall_log_in", d3);
                    AbstractC31175DnJ.A0y(A0f2);
                    AbstractC31176DnK.A1K(A0f2, d2);
                    A0f2.A9K("time_variation", 30L);
                    AbstractC31178DnM.A14(A0f2);
                    AbstractC35274Fh9.A0D(A0f2, "release_channel", AbstractC35274Fh9.A01());
                    AbstractC35274Fh9.A0C(A0f2, A0F, "fb_family_device_id", AbstractC35274Fh9.A02(A0F));
                    A0f2.A7v("is_internal_build", false);
                    A0f2.Cht();
                }
                A00.A01.notify("registration", 64278, A03);
            }
        } else {
            C218914p.A06(A00);
        }
        C0f9.A0E(848135299, A01, intent);
    }
}
