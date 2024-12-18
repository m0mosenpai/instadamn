package X;

import com.facebook.msys.mci.SessionedNotificationCenter;
import java.util.Map;

/* renamed from: X.AYb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23377AYb implements C6Eh {
    public final /* synthetic */ C201798w9 A00;
    public final /* synthetic */ SessionedNotificationCenter A01;

    public C23377AYb(C201798w9 c201798w9, SessionedNotificationCenter sessionedNotificationCenter) {
        this.A00 = c201798w9;
        this.A01 = sessionedNotificationCenter;
    }

    @Override // com.facebook.msys.mci.NotificationCenterInternal.NotificationCallbackInternal
    public final void onNewNotification(String str, InterfaceC49122Nj interfaceC49122Nj, Map map) {
        C201798w9 c201798w9 = this.A00;
        ACD acd = c201798w9.A00;
        acd.A01 = null;
        acd.A00 = null;
        acd.A02.set(false);
        c201798w9.A01.onCompletion(null);
        this.A01.removeObserver(this, AbstractC111324zv.A00(654), null);
    }
}
