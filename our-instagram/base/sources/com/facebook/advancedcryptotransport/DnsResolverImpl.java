package com.facebook.advancedcryptotransport;

import X.AbstractC09800fd;
import X.C128835rx;
import X.C14360o3;
import X.C207429Fv;
import X.C99K;
import X.C99M;
import X.C99N;
import X.C99O;
import X.C9AD;
import com.facebook.simplejni.NativeHolder;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class DnsResolverImpl {
    public static final DnsResolverImpl $redex_init_class = null;

    public static native void dnsResolveAsyncCompletionHandler(List list, int i, NativeHolder nativeHolder);

    public static void dnsResolveAsync(String str, NativeHolder nativeHolder, int i) {
        AbstractC09800fd.A01("dnsResolveAsync", -176517551);
        C99O A00 = C99N.A00();
        C14360o3.A0B(str, 0);
        List list = A00.A03;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C99K c99k = ((C99M) it.next()).A00;
                C207429Fv c207429Fv = new C207429Fv(str, c99k, 0);
                if (c99k.A05) {
                    synchronized (c99k) {
                        c207429Fv.invoke();
                    }
                }
            }
        }
        new Thread(new C128835rx(str, nativeHolder, i)).start();
        AbstractC09800fd.A00(1508151821);
    }

    static {
        C9AD.A00();
    }
}
