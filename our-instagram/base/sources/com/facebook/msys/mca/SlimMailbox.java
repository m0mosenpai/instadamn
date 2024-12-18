package com.facebook.msys.mca;

import X.C137306Jk;
import X.C73394YBf;
import X.InterfaceC124945kz;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class SlimMailbox {
    public static final SlimMailbox $redex_init_class = null;
    public final AccountSession mAccountSession;
    public final Executor mCallbackExecutor;
    public final NativeHolder mNativeHolder;
    public NotificationCenter mNotificationCenter;
    public InterfaceC124945kz mNotificationCenterCallbackManager;

    private native NotificationCenter getNotificationCenterNative();

    private native NativeHolder initNativeHolder(AccountSession accountSession, NotificationCenter notificationCenter, String str);

    private native boolean nativeEquals(SlimMailbox slimMailbox);

    public native void deployEarlyDatabaseConnection(String str, String str2, Database.OpenCallback openCallback, Database.SchemaDeployer schemaDeployer, Database.SchemaDeployer schemaDeployer2, boolean z, Map map, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7);

    public synchronized NotificationCenter getNotificationCenter() {
        NotificationCenter notificationCenter;
        notificationCenter = this.mNotificationCenter;
        if (notificationCenter == null) {
            notificationCenter = getNotificationCenterNative();
            this.mNotificationCenter = notificationCenter;
        }
        return notificationCenter;
    }

    public synchronized InterfaceC124945kz getNotificationCenterCallbackManager() {
        InterfaceC124945kz interfaceC124945kz;
        interfaceC124945kz = this.mNotificationCenterCallbackManager;
        if (interfaceC124945kz == null) {
            interfaceC124945kz = new C73394YBf(getNotificationCenter());
            this.mNotificationCenterCallbackManager = interfaceC124945kz;
        }
        return interfaceC124945kz;
    }

    public native int hashCode();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SlimMailbox) {
            return nativeEquals((SlimMailbox) obj);
        }
        return false;
    }

    static {
        C137306Jk.A00();
    }

    public SlimMailbox(AccountSession accountSession, NotificationCenter notificationCenter, String str, Executor executor) {
        this.mAccountSession = accountSession;
        this.mNotificationCenter = notificationCenter;
        this.mCallbackExecutor = executor;
        this.mNativeHolder = initNativeHolder(accountSession, notificationCenter, str);
    }
}
