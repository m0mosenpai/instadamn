package com.facebook.msys.mci;

import X.AbstractRunnableC94874Os;
import X.AnonymousClass001;
import X.C2NJ;
import X.C6Ej;
import X.InterfaceC49122Nj;
import com.facebook.msys.mci.NotificationCenterInternal;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class NotificationCenterInternal {
    public final Map A00;
    public final Map A01;
    public final Set A02;
    public NativeHolder mNativeHolder;

    /* loaded from: classes3.dex */
    public interface NotificationCallbackInternal {
        void onNewNotification(String str, InterfaceC49122Nj interfaceC49122Nj, Map map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d9, code lost:
    
        r4.A02.remove(r7);
        removeObserverNative(r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A00(X.InterfaceC49122Nj r5, com.facebook.msys.mci.NotificationCenterInternal.NotificationCallbackInternal r6, java.lang.String r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            r6.getClass()     // Catch: java.lang.Throwable -> Le3
            r7.getClass()     // Catch: java.lang.Throwable -> Le3
            java.util.Map r3 = r4.A01     // Catch: java.lang.Throwable -> Le3
            java.lang.Object r0 = r3.get(r6)     // Catch: java.lang.Throwable -> Le3
            X.6Ej r0 = (X.C6Ej) r0     // Catch: java.lang.Throwable -> Le3
            if (r0 == 0) goto Le1
            if (r5 != 0) goto L14
            goto L20
        L14:
            java.util.Map r0 = r0.A00     // Catch: java.lang.Throwable -> Le3
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> Le3
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> Le3
            if (r0 != 0) goto L22
            goto Le1
        L20:
            java.util.Set r0 = r0.A01     // Catch: java.lang.Throwable -> Le3
        L22:
            boolean r0 = r0.contains(r7)     // Catch: java.lang.Throwable -> Le3
            if (r0 == 0) goto Le1
            java.lang.Object r2 = r3.get(r6)     // Catch: java.lang.Throwable -> Le3
            X.6Ej r2 = (X.C6Ej) r2     // Catch: java.lang.Throwable -> Le3
            if (r2 == 0) goto L62
            if (r5 != 0) goto L33
            goto L4a
        L33:
            java.util.Map r1 = r2.A00     // Catch: java.lang.Throwable -> Le3
            java.lang.Object r0 = r1.get(r5)     // Catch: java.lang.Throwable -> Le3
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> Le3
            if (r0 == 0) goto L4f
            r0.remove(r7)     // Catch: java.lang.Throwable -> Le3
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Le3
            if (r0 == 0) goto L4f
            r1.remove(r5)     // Catch: java.lang.Throwable -> Le3
            goto L4f
        L4a:
            java.util.Set r0 = r2.A01     // Catch: java.lang.Throwable -> Le3
            r0.remove(r7)     // Catch: java.lang.Throwable -> Le3
        L4f:
            java.util.Set r0 = r2.A01     // Catch: java.lang.Throwable -> Le3
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Le3
            if (r0 == 0) goto L62
            java.util.Map r0 = r2.A00     // Catch: java.lang.Throwable -> Le3
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Le3
            if (r0 == 0) goto L62
            r3.remove(r6)     // Catch: java.lang.Throwable -> Le3
        L62:
            if (r5 == 0) goto L86
            java.util.Set r0 = r3.entrySet()     // Catch: java.lang.Throwable -> Le3
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> Le3
        L6c:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Le3
            if (r0 == 0) goto Lcb
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> Le3
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> Le3
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Le3
            X.6Ej r0 = (X.C6Ej) r0     // Catch: java.lang.Throwable -> Le3
            java.util.Map r0 = r0.A00     // Catch: java.lang.Throwable -> Le3
            boolean r0 = r0.containsKey(r5)     // Catch: java.lang.Throwable -> Le3
            if (r0 == 0) goto L6c
        L86:
            java.util.Set r0 = r3.entrySet()     // Catch: java.lang.Throwable -> Le3
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> Le3
        L8e:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> Le3
            if (r0 == 0) goto Ld9
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> Le3
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> Le3
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> Le3
            X.6Ej r1 = (X.C6Ej) r1     // Catch: java.lang.Throwable -> Le3
            java.util.Set r0 = r1.A01     // Catch: java.lang.Throwable -> Le3
            boolean r0 = r0.contains(r7)     // Catch: java.lang.Throwable -> Le3
            if (r0 != 0) goto Le1
            java.util.Map r0 = r1.A00     // Catch: java.lang.Throwable -> Le3
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> Le3
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> Le3
        Lb2:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Le3
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> Le3
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> Le3
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Le3
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> Le3
            boolean r0 = r0.contains(r7)     // Catch: java.lang.Throwable -> Le3
            if (r0 == 0) goto Lb2
            goto Le1
        Lcb:
            java.util.Map r2 = r4.A00     // Catch: java.lang.Throwable -> Le3
            long r0 = r5.getNativeReference()     // Catch: java.lang.Throwable -> Le3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> Le3
            r2.remove(r0)     // Catch: java.lang.Throwable -> Le3
            goto L86
        Ld9:
            java.util.Set r0 = r4.A02     // Catch: java.lang.Throwable -> Le3
            r0.remove(r7)     // Catch: java.lang.Throwable -> Le3
            r4.removeObserverNative(r7)     // Catch: java.lang.Throwable -> Le3
        Le1:
            monitor-exit(r4)
            return
        Le3:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.NotificationCenterInternal.A00(X.2Nj, com.facebook.msys.mci.NotificationCenterInternal$NotificationCallbackInternal, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        if (r0 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A01(X.InterfaceC49122Nj r5, com.facebook.msys.mci.NotificationCenterInternal.NotificationCallbackInternal r6, java.lang.String r7, int r8) {
        /*
            r4 = this;
            monitor-enter(r4)
            r6.getClass()     // Catch: java.lang.Throwable -> L70
            r7.getClass()     // Catch: java.lang.Throwable -> L70
            java.util.Map r3 = r4.A01     // Catch: java.lang.Throwable -> L70
            java.lang.Object r0 = r3.get(r6)     // Catch: java.lang.Throwable -> L70
            X.6Ej r0 = (X.C6Ej) r0     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L14
            if (r5 != 0) goto L17
            goto L3f
        L14:
            if (r5 == 0) goto L2e
            goto L21
        L17:
            java.util.Map r0 = r0.A00     // Catch: java.lang.Throwable -> L70
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L70
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L41
        L21:
            java.util.Map r2 = r4.A00     // Catch: java.lang.Throwable -> L70
            long r0 = r5.getNativeReference()     // Catch: java.lang.Throwable -> L70
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L70
            r2.put(r0, r5)     // Catch: java.lang.Throwable -> L70
        L2e:
            java.lang.Object r0 = r3.get(r6)     // Catch: java.lang.Throwable -> L70
            X.6Ej r0 = (X.C6Ej) r0     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L48
            X.6Ej r0 = new X.6Ej     // Catch: java.lang.Throwable -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L70
            r3.put(r6, r0)     // Catch: java.lang.Throwable -> L70
            goto L48
        L3f:
            java.util.Set r0 = r0.A01     // Catch: java.lang.Throwable -> L70
        L41:
            boolean r0 = r0.contains(r7)     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L14
            goto L6e
        L48:
            if (r5 != 0) goto L4b
            goto L5e
        L4b:
            java.util.Map r1 = r0.A00     // Catch: java.lang.Throwable -> L70
            java.lang.Object r0 = r1.get(r5)     // Catch: java.lang.Throwable -> L70
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L60
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L70
            r1.put(r5, r0)     // Catch: java.lang.Throwable -> L70
            goto L60
        L5e:
            java.util.Set r0 = r0.A01     // Catch: java.lang.Throwable -> L70
        L60:
            r0.add(r7)     // Catch: java.lang.Throwable -> L70
            java.util.Set r0 = r4.A02     // Catch: java.lang.Throwable -> L70
            boolean r0 = r0.add(r7)     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L6e
            r4.addObserverNative(r7, r8)     // Catch: java.lang.Throwable -> L70
        L6e:
            monitor-exit(r4)
            return
        L70:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.NotificationCenterInternal.A01(X.2Nj, com.facebook.msys.mci.NotificationCenterInternal$NotificationCallbackInternal, java.lang.String, int):void");
    }

    public abstract void addObserverNative(String str, int i);

    public void dispatchNotificationToCallbacks(final String str, Long l, Object obj) {
        int i;
        Set set;
        if (obj != null && !(obj instanceof Map)) {
            throw new RuntimeException(AnonymousClass001.A0R("Native layer of msys reported a notification whose payload could not be serialized into a Java Map. Instead, it's of type ", obj.getClass().getName()));
        }
        final Map map = (Map) obj;
        final ArrayList arrayList = new ArrayList();
        final InterfaceC49122Nj interfaceC49122Nj = null;
        synchronized (this) {
            if (l != null) {
                interfaceC49122Nj = (InterfaceC49122Nj) this.A00.get(l);
            }
            for (Map.Entry entry : this.A01.entrySet()) {
                C6Ej c6Ej = (C6Ej) entry.getValue();
                if (c6Ej.A01.contains(str) || ((set = (Set) c6Ej.A00.get(interfaceC49122Nj)) != null && set.contains(str))) {
                    arrayList.add((NotificationCallbackInternal) entry.getKey());
                }
            }
        }
        if (!arrayList.isEmpty()) {
            AbstractRunnableC94874Os abstractRunnableC94874Os = new AbstractRunnableC94874Os() { // from class: X.5yQ
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super("dispatchNotificationToCallbacks");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((NotificationCenterInternal.NotificationCallbackInternal) it.next()).onNewNotification(str, interfaceC49122Nj, map);
                    }
                }
            };
            AccountSession accountSession = getAccountSession();
            if (str.equals("MCIDatabaseCommitNotificationV2")) {
                i = Execution.getExecutionContext();
            } else {
                i = 1;
            }
            Execution.executePossiblySync(abstractRunnableC94874Os, accountSession, i);
        }
    }

    public abstract AccountSession getAccountSession();

    public abstract NativeHolder initNativeHolder();

    public abstract void postStrictNotificationNative(String str, int i);

    public abstract void removeObserverNative(String str);

    public void setNativeHolder(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    static {
        C2NJ.A00();
    }

    public NotificationCenterInternal(boolean z) {
        this.A00 = new HashMap();
        this.A01 = new HashMap();
        this.A02 = new HashSet();
        if (!z) {
            this.mNativeHolder = initNativeHolder();
        }
    }

    public NotificationCenterInternal() {
        this(false);
    }
}
