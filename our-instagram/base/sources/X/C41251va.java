package X;

import android.util.LruCache;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1va, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41251va {
    public static C41251va A02;
    public static final LruCache A03 = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public static final java.util.Set A04 = new LinkedHashSet(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public String A00;
    public boolean A01;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.1va] */
    public static synchronized C41251va A00() {
        C41251va c41251va;
        synchronized (C41251va.class) {
            C41251va c41251va2 = A02;
            c41251va = c41251va2;
            if (c41251va2 == null) {
                ?? obj = new Object();
                A02 = obj;
                c41251va = obj;
            }
        }
        return c41251va;
    }

    public final void A01(final int i, final String str, final long j) {
        if (C21A.A02() || this.A01) {
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.43T
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(9, 5, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Integer valueOf;
                    C41251va c41251va = C41251va.this;
                    int i2 = i;
                    String str2 = str;
                    long j2 = j;
                    LruCache lruCache = C41251va.A03;
                    if (C21A.A02() || c41251va.A01) {
                        LruCache lruCache2 = C41251va.A03;
                        synchronized (lruCache2) {
                            valueOf = Integer.valueOf(i2);
                            if (lruCache2.get(valueOf) != null) {
                                lruCache2.put(valueOf, true);
                            }
                        }
                        if (C006802i.A0p.isMarkerOn(25624577, i2)) {
                            if (str2.equals("DISK")) {
                                java.util.Set set = C41251va.A04;
                                synchronized (set) {
                                    Iterator it = set.iterator();
                                    if (set.size() > 300 && it.hasNext()) {
                                        it.next();
                                        it.remove();
                                    }
                                    set.add(valueOf);
                                    C006802i.A0p.markerPoint(25624577, i2, "DISK", j2, TimeUnit.MILLISECONDS);
                                }
                                return;
                            }
                            C006802i.A0p.markerAnnotate(25624577, i2, "SOURCE", str2);
                            C006802i.A0p.markerEnd(25624577, i2, (short) 467, j2, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            });
        }
    }

    public final void A02(final int i, final String str, final long j) {
        if (C21A.A02() || this.A01) {
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.43a
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(10, 5, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Integer valueOf;
                    C41251va c41251va = C41251va.this;
                    int i2 = i;
                    String str2 = str;
                    long j2 = j;
                    LruCache lruCache = C41251va.A03;
                    if (C21A.A02() || c41251va.A01) {
                        LruCache lruCache2 = C41251va.A03;
                        synchronized (lruCache2) {
                            valueOf = Integer.valueOf(i2);
                            lruCache2.remove(valueOf);
                        }
                        java.util.Set set = C41251va.A04;
                        synchronized (set) {
                            if (set.contains(valueOf) && str2 == "DISK") {
                                if (C006802i.A0p.isMarkerOn(25624577, i2)) {
                                    C006802i.A0p.markerAnnotate(25624577, i2, "SOURCE", "DISK");
                                    try {
                                        C006802i.A0p.markerEndAtPoint(25624577, i2, (short) 467, "DISK");
                                    } catch (C0XW unused) {
                                        C006802i.A0p.markerEnd(25624577, i2, (short) 3, j2, TimeUnit.MILLISECONDS);
                                    }
                                }
                                set.remove(valueOf);
                            }
                        }
                        if (C006802i.A0p.isMarkerOn(25624577, i2)) {
                            C006802i.A0p.markerDrop(25624577, i2);
                        }
                    }
                }
            });
        }
    }

    public final void A03(final String str, final String str2, final int i, final long j, final boolean z) {
        if (C21A.A02() || this.A01) {
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.43Z
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(8, 5, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Integer valueOf;
                    boolean z2;
                    boolean z3;
                    C41251va c41251va = C41251va.this;
                    int i2 = i;
                    String str3 = str;
                    boolean z4 = z;
                    String str4 = str2;
                    long j2 = j;
                    LruCache lruCache = C41251va.A03;
                    if (C21A.A02() || c41251va.A01) {
                        if (z4) {
                            String str5 = c41251va.A00;
                            if (!C006802i.A0p.isMarkerOn(i2)) {
                                LruCache lruCache2 = C41251va.A03;
                                synchronized (lruCache2) {
                                    valueOf = Integer.valueOf(i2);
                                    if (lruCache2.get(valueOf) != null) {
                                        z2 = true;
                                        z3 = true;
                                        if (!((Boolean) lruCache2.get(valueOf)).booleanValue()) {
                                        }
                                    } else {
                                        z2 = false;
                                    }
                                    z3 = false;
                                }
                                java.util.Set set = C41251va.A04;
                                synchronized (set) {
                                    set.remove(valueOf);
                                }
                                C006802i c006802i = C006802i.A0p;
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                c006802i.markerStart(25624577, i2, j2, timeUnit);
                                if (str4 == null) {
                                    str4 = "UNKNOWN";
                                }
                                C006802i.A0p.markerAnnotate(25624577, i2, "SOURCE_MODULE", str4);
                                C006802i.A0p.markerAnnotate(25624577, i2, CredentialProviderBaseController.TYPE_TAG, str3);
                                C006802i.A0p.markerAnnotate(25624577, i2, "BANDWIDTH_KBPS", C1BU.A00().A01());
                                C006802i.A0p.markerAnnotate(25624577, i2, "SAMPLE_TYPE", str5);
                                if (z2) {
                                    C006802i.A0p.markerAnnotate(25624577, i2, "PREFETCH", "ONGOING");
                                }
                                if (z3) {
                                    C006802i.A0p.markerAnnotate(25624577, i2, "SOURCE", "PREFETCH");
                                    C006802i.A0p.markerEnd(25624577, i2, (short) 467, j2, timeUnit);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        LruCache lruCache3 = C41251va.A03;
                        synchronized (lruCache3) {
                            lruCache3.put(Integer.valueOf(i2), false);
                        }
                    }
                }
            });
        }
    }
}
