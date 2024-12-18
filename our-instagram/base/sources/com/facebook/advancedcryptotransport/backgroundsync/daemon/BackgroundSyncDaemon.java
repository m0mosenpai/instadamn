package com.facebook.advancedcryptotransport.backgroundsync.daemon;

import X.C09170dP;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mca.NativeMailboxCallback;
import com.facebook.msys.util.NativeRunnable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class BackgroundSyncDaemon {
    public static final Companion Companion = new Object();

    /* loaded from: classes12.dex */
    public final class CompleteLoginCallback {
        public final NativeMailboxCallback callback;

        public static /* synthetic */ void completeLogin$default(CompleteLoginCallback completeLoginCallback, Mailbox mailbox, Boolean bool, Double d, Double d2, int i, Object obj) {
            if ((i & 2) != 0) {
                bool = null;
            }
            if ((i & 4) != 0) {
                d = null;
            }
            if ((i & 8) != 0) {
                d2 = null;
            }
            completeLoginCallback.completeLogin(mailbox, bool, d, d2);
        }

        public final void completeLogin(Mailbox mailbox, Boolean bool, Double d, Double d2) {
            this.callback.onCompletion(new Object[]{new MailboxNullable(mailbox), bool, d, d2});
        }

        public CompleteLoginCallback(NativeMailboxCallback nativeMailboxCallback) {
            this.callback = nativeMailboxCallback;
        }

        public final NativeMailboxCallback getCallback() {
            return this.callback;
        }
    }

    /* loaded from: classes12.dex */
    public final class CompleteLogoutCallback {
        public final NativeRunnable callback;

        public final void completeLogout() {
            this.callback.run();
        }

        public CompleteLogoutCallback(NativeRunnable nativeRunnable) {
            this.callback = nativeRunnable;
        }

        public final NativeRunnable getCallback() {
            return this.callback;
        }
    }

    /* loaded from: classes12.dex */
    public interface HandlingCompletionCallback {
        void handlingCompletion(String str, Map map, int i, Object obj);
    }

    /* loaded from: classes12.dex */
    public interface LoginCallback {
        void startLogin(String str, CompleteLoginCallback completeLoginCallback, Map map);
    }

    /* loaded from: classes12.dex */
    public interface LogoutCallback {
        void startLogout(String str, CompleteLogoutCallback completeLogoutCallback);
    }

    public static final native void handlePushNotificationWithConfigs(String str, Map map, Object obj, Map map2);

    public static final native void initialize(String str, LoginCallback loginCallback, LogoutCallback logoutCallback, HandlingCompletionCallback handlingCompletionCallback);

    public static final native void setAppHandledNotificationsForAccount(Mailbox mailbox, boolean z);

    public static final native void setForegroundUserId(String str);

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.advancedcryptotransport.backgroundsync.daemon.BackgroundSyncDaemon$Companion, java.lang.Object] */
    static {
        C09170dP.A0C("actbackgroundsyncdaemonjni");
    }

    /* loaded from: classes12.dex */
    public final class Companion {
        public final void handlePushNotificationWithConfigs(String str, Map map, Object obj, Map map2) {
            BackgroundSyncDaemon.handlePushNotificationWithConfigs(str, map, obj, map2);
        }

        public final void initialize(String str, LoginCallback loginCallback, LogoutCallback logoutCallback, HandlingCompletionCallback handlingCompletionCallback) {
            BackgroundSyncDaemon.initialize(str, loginCallback, logoutCallback, handlingCompletionCallback);
        }

        public final void setAppHandledNotificationsForAccount(Mailbox mailbox, boolean z) {
            BackgroundSyncDaemon.setAppHandledNotificationsForAccount(mailbox, z);
        }

        public final void setForegroundUserId(String str) {
            BackgroundSyncDaemon.setForegroundUserId(str);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
