package com.instagram.notifications.local;

import X.AbstractC111324zv;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AnonymousClass970;
import X.AnonymousClass971;
import X.C08310bt;
import X.C0f9;
import X.C0fM;
import X.C14360o3;
import X.C1GJ;
import X.C1ON;
import X.C29900DGo;
import X.C30184DRp;
import X.C9F9;
import X.ESZ;
import X.FWU;
import X.FXB;
import X.S55;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class LocalNotificationBootReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = C0f9.A01(-992010558);
        C0fM.A01(this, context, intent);
        boolean A1a = AbstractC167017dG.A1a(context, intent);
        if (C08310bt.A02().A00(context, intent, this) && FWU.A01(intent.getAction())) {
            AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
            if (!(A0F instanceof UserSession)) {
                i = 30377340;
            } else {
                AnonymousClass970 anonymousClass970 = new AnonymousClass970(context);
                if (S55.A00(context) && System.currentTimeMillis() - AbstractC31175DnJ.A03(AbstractC31174DnI.A0f(), "last_unseen_like_local_notification_timestamp") >= 86400000) {
                    C14360o3.A0B(A0F, A1a ? 1 : 0);
                    AnonymousClass971 anonymousClass971 = (AnonymousClass971) A0F.A01(AnonymousClass971.class, new C29900DGo(34, context, A0F, anonymousClass970));
                    C30184DRp c30184DRp = new C30184DRp(13, anonymousClass970, A0F, this);
                    if (AnonymousClass971.A01(anonymousClass971)) {
                        ESZ esz = new ESZ(anonymousClass971, new C9F9(37, c30184DRp, anonymousClass971));
                        C1ON A00 = FXB.A00(anonymousClass971.A03, AbstractC111324zv.A00(2885));
                        A00.A00 = esz;
                        C1GJ.A03(A00);
                    }
                }
                i = -906028187;
            }
        } else {
            i = 1025048738;
        }
        C0f9.A0E(i, A01, intent);
    }
}
