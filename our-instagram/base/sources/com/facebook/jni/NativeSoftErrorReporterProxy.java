package com.facebook.jni;

import X.AnonymousClass001;
import X.C03360Gh;
import X.C0Gd;
import X.C0Gf;
import X.C17450tg;
import com.facebook.common.util.TriState;
import com.facebook.jni.NativeSoftErrorReporterProxy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class NativeSoftErrorReporterProxy {
    public static boolean sDisabled;
    public static ExecutorService sErrorReportingExecutorService;
    public static C17450tg sErrorReportingGkReader;
    public static WeakReference sFbErrorReporterWeakReference;
    public static final LinkedList sSoftErrorCache = new LinkedList();

    public static native void generateNativeSoftError();

    public static void softReport(int i, String str, String str2, int i2) {
        softReport(i, str, str2, null, i2);
    }

    public static synchronized void flushSoftErrorCacheAsync() {
        final C0Gd c0Gd;
        synchronized (NativeSoftErrorReporterProxy.class) {
            WeakReference weakReference = sFbErrorReporterWeakReference;
            if (weakReference != null && (c0Gd = (C0Gd) weakReference.get()) != null && sErrorReportingGkReader != null) {
                LinkedList linkedList = sSoftErrorCache;
                if (!linkedList.isEmpty()) {
                    final ArrayList arrayList = new ArrayList();
                    synchronized (linkedList) {
                        arrayList.addAll(linkedList);
                        linkedList.clear();
                    }
                    if (!sDisabled) {
                        sErrorReportingExecutorService.execute(new Runnable() { // from class: X.0T1
                            @Override // java.lang.Runnable
                            public final void run() {
                                TriState triState;
                                if (NativeSoftErrorReporterProxy.sErrorReportingGkReader == null) {
                                    triState = TriState.UNSET;
                                } else {
                                    triState = TriState.YES;
                                }
                                if (triState == TriState.YES) {
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        c0Gd.EmM((C0Gf) it.next());
                                    }
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    public static void softReport(int i, String str, String str2, Throwable th, int i2) {
        String str3;
        if (i != 1) {
            if (i != 2) {
                str3 = "<level:unknown> ";
            } else {
                str3 = "<level:mustfix> ";
            }
        } else {
            str3 = "<level:warning> ";
        }
        String A0g = AnonymousClass001.A0g("[Native] ", str3, str);
        synchronized (NativeSoftErrorReporterProxy.class) {
            LinkedList linkedList = sSoftErrorCache;
            synchronized (linkedList) {
                C03360Gh c03360Gh = new C03360Gh();
                c03360Gh.A01 = A0g;
                c03360Gh.A02 = str2;
                c03360Gh.A03 = th;
                c03360Gh.A00 = i2;
                linkedList.addLast(new C0Gf(c03360Gh));
                while (linkedList.size() >= 50) {
                    linkedList.removeFirst();
                }
            }
        }
        flushSoftErrorCacheAsync();
    }
}
