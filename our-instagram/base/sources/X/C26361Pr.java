package X;

import android.os.SystemClock;
import android.view.View;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.proxygen.LigerSamplePolicy;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.WeakHashMap;

/* renamed from: X.1Pr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26361Pr implements InterfaceC13060ls {
    public static final String[] A03 = new String[13];
    public static final String[] A04 = new String[10];
    public final C13920nI A02;
    public final WeakHashMap A01 = new WeakHashMap();
    public final LinkedList A00 = new LinkedList();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        if (r1 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A00() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.WeakHashMap r0 = r6.A01     // Catch: java.lang.Throwable -> L58
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r5 = r0.iterator()     // Catch: java.lang.Throwable -> L58
        Lb:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L56
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L58
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L58
            java.lang.Object r4 = r0.getValue()     // Catch: java.lang.Throwable -> L58
            X.3GH r4 = (X.C3GH) r4     // Catch: java.lang.Throwable -> L58
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L58
            android.view.View r1 = (android.view.View) r1     // Catch: java.lang.Throwable -> L58
            int r0 = r1.getVisibility()     // Catch: java.lang.Throwable -> L58
            r3 = 0
        L28:
            if (r0 != 0) goto L46
            android.view.ViewParent r0 = r1.getParent()     // Catch: java.lang.Throwable -> L58
            boolean r0 = r0 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L58
            android.view.ViewParent r1 = r1.getParent()     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L43
            android.view.View r1 = (android.view.View) r1     // Catch: java.lang.Throwable -> L58
            android.view.View r0 = r1.getRootView()     // Catch: java.lang.Throwable -> L58
            if (r0 == r1) goto L45
            int r0 = r1.getVisibility()     // Catch: java.lang.Throwable -> L58
            goto L28
        L43:
            if (r1 == 0) goto L46
        L45:
            r3 = 1
        L46:
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L58
            boolean r0 = r4.A05     // Catch: java.lang.Throwable -> L58
            if (r3 == r0) goto Lb
            X.3GG r0 = X.C3GG.Unset     // Catch: java.lang.Throwable -> L58
            X.C3GH.A01(r0, r4, r1)     // Catch: java.lang.Throwable -> L58
            r4.A05 = r3     // Catch: java.lang.Throwable -> L58
            goto Lb
        L56:
            monitor-exit(r6)
            return
        L58:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26361Pr.A00():void");
    }

    public final synchronized void A01(View view) {
        WeakHashMap weakHashMap = this.A01;
        C3GH c3gh = (C3GH) weakHashMap.get(view);
        if (c3gh != null) {
            C3GG c3gg = C3GG.Unset;
            if (c3gg != c3gh.A04) {
                C3GH.A01(c3gg, c3gh, SystemClock.elapsedRealtime());
                c3gh.A04 = c3gg;
            }
            weakHashMap.remove(view);
            LinkedList linkedList = this.A00;
            if (linkedList.size() > 10) {
                linkedList.removeFirst();
            }
            if (c3gh.A03 > 10) {
                linkedList.offer(c3gh);
            }
        }
    }

    public final synchronized void A02(View view, C3GG c3gg) {
        C3GH c3gh = (C3GH) this.A01.get(view);
        if (c3gh != null && c3gg != c3gh.A04) {
            C3GH.A01(c3gg, c3gh, SystemClock.elapsedRealtime());
            c3gh.A04 = c3gg;
        }
    }

    public final synchronized void A03(View view, String str) {
        if (str != null) {
            WeakHashMap weakHashMap = this.A01;
            if (weakHashMap.size() < 15) {
                C3GH c3gh = (C3GH) weakHashMap.get(view);
                if (c3gh == null) {
                    c3gh = new C3GH(this, str);
                    weakHashMap.put(view, c3gh);
                }
                c3gh.A05 = true;
                c3gh.A04 = C3GG.Unset;
                c3gh.A03 = 0L;
                c3gh.A02 = SystemClock.elapsedRealtime();
                c3gh.A07 = new int[13];
                c3gh.A06 = new int[10];
                c3gh.A01 = 0;
                c3gh.A00 = 0;
            }
        }
    }

    @Override // X.InterfaceC13060ls
    public final void Cww(AbstractC12990ll abstractC12990ll) {
        synchronized (this) {
            boolean z = C218914p.A05;
            long now = AwakeTimeSinceBootClock.INSTANCE.now() - LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
            WeakHashMap weakHashMap = this.A01;
            for (C3GH c3gh : weakHashMap.values()) {
                if (false != c3gh.A05) {
                    C3GH.A01(C3GG.Unset, c3gh, now);
                    c3gh.A05 = false;
                }
            }
            try {
                StringWriter stringWriter = new StringWriter();
                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                A0A.A0c();
                Iterator it = weakHashMap.values().iterator();
                while (it.hasNext()) {
                    C3GH.A00(A0A, (C3GH) it.next());
                }
                LinkedList linkedList = this.A00;
                Iterator it2 = linkedList.iterator();
                while (it2.hasNext()) {
                    C3GH.A00(A0A, (C3GH) it2.next());
                }
                linkedList.clear();
                A0A.A0Z();
                A0A.close();
                stringWriter.toString();
            } catch (IOException unused) {
            }
        }
    }

    @Override // X.InterfaceC13060ls
    public final void Cwy(AbstractC12990ll abstractC12990ll) {
        synchronized (this) {
            SystemClock.elapsedRealtime();
            A00();
        }
    }

    public C26361Pr(C13920nI c13920nI) {
        Locale locale;
        int i;
        Locale locale2;
        Integer valueOf;
        this.A02 = c13920nI;
        String[] strArr = A03;
        if (strArr[0] == null) {
            int i2 = 0;
            int i3 = 0;
            do {
                int i4 = 10 << i2;
                locale2 = Locale.US;
                Integer valueOf2 = Integer.valueOf(i3);
                valueOf = Integer.valueOf(i4);
                strArr[i2] = String.format(locale2, "wait_time_%d_%d", valueOf2, valueOf);
                i2++;
                i3 = i4;
            } while (i2 < 12);
            strArr[12] = String.format(locale2, "wait_time_%d", valueOf);
        }
        String[] strArr2 = A04;
        if (strArr2[0] == null) {
            int i5 = 0;
            do {
                locale = Locale.US;
                i = i5 + 1;
                strArr2[i5] = String.format(locale, "scan_%d", Integer.valueOf(i));
                i5 = i;
            } while (i < 9);
            strArr2[9] = String.format(locale, "scan_%d+", 10);
        }
    }
}
