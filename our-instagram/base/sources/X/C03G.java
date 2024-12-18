package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: X.03G, reason: invalid class name */
/* loaded from: classes.dex */
public final class C03G implements C0LR {
    public static C03G A03;
    public static final Map A04 = Collections.synchronizedMap(new HashMap());
    public final Object A00 = new Object();
    public final Map A02 = new HashMap();
    public final Map A01 = new HashMap();

    public static synchronized C03G A00() {
        C03G c03g;
        synchronized (C03G.class) {
            c03g = A03;
            if (c03g == null) {
                c03g = new C03G();
                A03 = c03g;
            }
        }
        return c03g;
    }

    public static void A01(C0LE c0le) {
        A04.put(c0le.A00, c0le);
    }

    public final void A02(String str, String str2) {
        synchronized (this.A00) {
            if (A04.containsKey(str)) {
                this.A02.put(str, str2);
            }
        }
    }

    @Override // X.C0LR
    public final Integer BW4() {
        return C05F.A06;
    }

    @Override // X.C0LR
    public final /* synthetic */ boolean CKv(Integer num) {
        return false;
    }

    @Override // X.C0LR
    public final void E4h(C024209q c024209q, C0M6 c0m6) {
        HashMap hashMap;
        HashMap hashMap2;
        final Throwable th = c024209q.A02;
        if (th != null) {
            Object obj = this.A00;
            synchronized (obj) {
                hashMap2 = new HashMap(this.A01);
            }
            for (final Map.Entry entry : hashMap2.entrySet()) {
                final String str = (String) entry.getKey();
                try {
                    String str2 = (String) C04590Mb.A02().submit(new Callable() { // from class: X.0Lq
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Map.Entry entry2 = entry;
                            String str3 = str;
                            try {
                                return (String) ((C008703b) entry2.getValue()).A01.get();
                            } catch (Throwable th2) {
                                C0K8.A0M("lacrima", "Failed to apply lazy supplier: %s", th2, str3);
                                C0PC.A00().DEh("FbCustomReportDataSupplier", th2, null);
                                return "";
                            }
                        }
                    }).get(750L, TimeUnit.MILLISECONDS);
                    if (str2 == null) {
                        synchronized (obj) {
                            this.A02.remove(str);
                        }
                    } else {
                        A02(str, str2);
                    }
                } catch (Exception e) {
                    C0PC.A00().DEh("CustomPropLazySupplier", e, null);
                    A02(AnonymousClass001.A0R(str, "_error"), PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
                }
            }
        }
        synchronized (this.A00) {
            hashMap = new HashMap(this.A02);
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            c024209q.A05((String) entry2.getKey(), (String) entry2.getValue());
        }
    }
}
