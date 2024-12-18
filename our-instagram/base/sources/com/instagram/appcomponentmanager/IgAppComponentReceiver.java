package com.instagram.appcomponentmanager;

import X.AbstractC12960li;
import X.AbstractC166987dD;
import X.AbstractC19730y1;
import X.AbstractC58318PtA;
import X.AnonymousClass028;
import X.C0eS;
import X.C0f9;
import X.C14360o3;
import X.C18720vz;
import X.MSW;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.appcomponentmanager.AppComponentManagerService;
import java.io.File;

/* loaded from: classes10.dex */
public final class IgAppComponentReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A04 = AbstractC58318PtA.A04(this, context, intent, -1383463471);
        intent.getAction();
        if ("android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            File A00 = C0eS.A00(context, 1436876361);
            A00.mkdirs();
            String[] list = MSW.A0w(A00, "versions").list();
            if (list == null || list.length == 0) {
                C14360o3.A0B(context, 0);
                Context A0O = AbstractC166987dD.A0O(context);
                C18720vz c18720vz = AbstractC12960li.A00;
                c18720vz.A00 = A0O;
                if (AbstractC19730y1.A00(c18720vz).A00.getString("current", null) == null) {
                    i = -1079568247;
                    C0f9.A0E(i, A04, intent);
                }
            }
            AnonymousClass028.enqueueWork(context, AppComponentManagerService.class, 137875812, AbstractC58318PtA.A0E("com.facebook.appcomponentmanager.ACTION_ENABLE_COMPONENTS"));
        }
        i = 202694452;
        C0f9.A0E(i, A04, intent);
    }
}
