package X;

import com.facebook.msys.mci.SessionedNotificationCenter;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.6Ee, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Ee implements InterfaceC13050lr {
    public SessionedNotificationCenter A00;
    public final SettableFuture A02 = new Object();
    public final C6Eh A01 = new C6Eh() { // from class: X.6Eg
        @Override // com.facebook.msys.mci.NotificationCenterInternal.NotificationCallbackInternal
        public final void onNewNotification(String str, InterfaceC49122Nj interfaceC49122Nj, Map map) {
            C6Ee.this.A02.set(C0eB.A00);
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public /* synthetic */ C6Ee(SettableFuture settableFuture, DefaultConstructorMarker defaultConstructorMarker, int i) {
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        if (this.A02.cancel(true)) {
            C0K8.A0D("MEMEnabledAccountSession", "MEM Login cancelled before completion");
        }
        SessionedNotificationCenter sessionedNotificationCenter = this.A00;
        if (sessionedNotificationCenter == null) {
            C14360o3.A0F("sessionedNotificationCenter");
            throw C00O.createAndThrow();
        }
        sessionedNotificationCenter.removeObserver(this.A01, "MEMContextReadyNotification", null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public C6Ee() {
    }
}
