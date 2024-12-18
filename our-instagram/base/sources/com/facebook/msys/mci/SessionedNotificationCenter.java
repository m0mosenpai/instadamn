package com.facebook.msys.mci;

import X.C141786av;
import X.C6Eh;
import X.C6Ej;
import X.InterfaceC49122Nj;
import com.facebook.simplejni.NativeHolder;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class SessionedNotificationCenter extends NotificationCenterInternal {
    public final AccountSession mAccountSession;

    public SessionedNotificationCenter(AccountSession accountSession) {
        super(true);
        this.mAccountSession = accountSession;
    }

    public synchronized void addObserver(C6Eh c6Eh, String str, int i, InterfaceC49122Nj interfaceC49122Nj) {
        A01(interfaceC49122Nj, c6Eh, str, i);
    }

    @Override // com.facebook.msys.mci.NotificationCenterInternal
    public native void addObserverNative(String str, int i);

    @Override // com.facebook.msys.mci.NotificationCenterInternal
    public native void postStrictNotificationNative(String str, int i);

    public synchronized void removeEveryObserver(C6Eh c6Eh) {
        HashSet hashSet;
        HashMap hashMap;
        try {
            c6Eh.getClass();
            Map map = this.A01;
            C6Ej c6Ej = (C6Ej) map.get(c6Eh);
            if (c6Ej != null) {
                synchronized (c6Ej) {
                    hashSet = new HashSet(c6Ej.A01);
                    hashMap = new HashMap();
                    for (Map.Entry entry : c6Ej.A00.entrySet()) {
                        hashMap.put((InterfaceC49122Nj) entry.getKey(), new HashSet((Collection) entry.getValue()));
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    A00(null, c6Eh, (String) it.next());
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    InterfaceC49122Nj interfaceC49122Nj = (InterfaceC49122Nj) entry2.getKey();
                    Iterator it2 = ((Set) entry2.getValue()).iterator();
                    while (it2.hasNext()) {
                        A00(interfaceC49122Nj, c6Eh, (String) it2.next());
                    }
                }
                map.remove(c6Eh);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void removeObserver(C6Eh c6Eh, String str, InterfaceC49122Nj interfaceC49122Nj) {
        A00(interfaceC49122Nj, c6Eh, str);
    }

    @Override // com.facebook.msys.mci.NotificationCenterInternal
    public native void removeObserverNative(String str);

    @Override // com.facebook.msys.mci.NotificationCenterInternal
    public AccountSession getAccountSession() {
        return this.mAccountSession;
    }

    @Override // com.facebook.msys.mci.NotificationCenterInternal
    public NativeHolder initNativeHolder() {
        throw new C141786av("This method should never be called because only the account session can creates this object. You must use AccountSession#getSessionedNotificationCenter() instead.");
    }

    public synchronized void postStrictNotification(String str, int i, InterfaceC49122Nj interfaceC49122Nj) {
        try {
            postStrictNotificationNative("DGWSendPingNotification", 1);
        } catch (Throwable th) {
            throw th;
        }
    }
}
