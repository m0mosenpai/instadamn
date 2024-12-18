package X;

import android.content.Context;
import android.util.Patterns;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.net.MalformedURLException;
import java.util.ArrayList;

/* renamed from: X.LRx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48123LRx implements InterfaceC38441qY {
    public static final java.util.Set A06 = AbstractC16830sb.A07(307, 810, 13636, 485, 360);
    public final C18920wW A00;
    public final AbstractC12990ll A01;
    public final java.util.Set A02;
    public final Context A03;
    public final C48122LRw A04;
    public final java.util.Set A05;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (r8.length() <= 25) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        r6 = X.AbstractC47191KtQ.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        r4 = r6.A01;
        r4.readLock().lock();
        r2 = X.AbstractC166997dE.A14(r6.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        if (r2.hasNext() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        r1 = X.AbstractC166987dD.A1K(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        if (X.AbstractC001900j.A0a(r8, (java.lang.CharSequence) r1.getKey(), false) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
    
        r3 = (X.EnumC46144Kbi) r1.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
    
        r4.readLock().unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        if (r3 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bc, code lost:
    
        if (X.AbstractC47138KsX.A00[r3.ordinal()] == (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00be, code lost:
    
        r1 = X.C05F.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c5, code lost:
    
        r6.A01.readLock().unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ce, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c1, code lost:
    
        r1 = X.C05F.A0N;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C0CA r9, X.C48123LRx r10, java.lang.String r11) {
        /*
            java.util.Set r0 = r10.A05
            boolean r0 = r0.contains(r11)
            if (r0 != 0) goto L105
            java.util.ArrayList r0 = X.AbstractC166987dD.A1E()
            r10.A02(r9, r0)
            java.util.ArrayList r5 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r9 = r0.iterator()
        L17:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lcf
            java.lang.String r8 = X.AbstractC166987dD.A1B(r9)
            r7 = 0
            X.C14360o3.A0B(r8, r7)
            java.lang.String r0 = " "
            java.util.List r0 = X.AbstractC167007dF.A0m(r8, r0, r7)
            java.util.Iterator r4 = r0.iterator()
        L2f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L74
            java.lang.String r3 = X.AbstractC166987dD.A1B(r4)
            X.C14360o3.A0B(r3, r7)
            X.L74 r1 = X.AbstractC47191KtQ.A01
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = r1.A01
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.readLock()
            r0.lock()
            java.util.LinkedHashMap r0 = r1.A00
            java.lang.Object r1 = r0.get(r3)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.readLock()
            r0.unlock()
            if (r1 == 0) goto L2f
            java.util.regex.Pattern r0 = android.util.Patterns.WEB_URL
            boolean r0 = X.AbstractC31175DnJ.A1Z(r3, r0)
            if (r0 == 0) goto L69
            java.lang.Integer r1 = X.C05F.A0C
        L60:
            X.Ku2 r0 = new X.Ku2
            r0.<init>(r1)
            r5.add(r0)
            goto L17
        L69:
            java.util.regex.Pattern r0 = android.util.Patterns.EMAIL_ADDRESS
            boolean r0 = X.AbstractC31175DnJ.A1Z(r3, r0)
            if (r0 == 0) goto L2f
            java.lang.Integer r1 = X.C05F.A01
            goto L60
        L74:
            int r1 = r8.length()
            r0 = 25
            if (r1 <= r0) goto Lc1
            X.L74 r6 = X.AbstractC47191KtQ.A00
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r6.A01     // Catch: java.lang.Throwable -> Lc4
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.readLock()     // Catch: java.lang.Throwable -> Lc4
            r0.lock()     // Catch: java.lang.Throwable -> Lc4
            java.util.LinkedHashMap r0 = r6.A00     // Catch: java.lang.Throwable -> Lc4
            java.util.Iterator r2 = X.AbstractC166997dE.A14(r0)     // Catch: java.lang.Throwable -> Lc4
        L8d:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> Lc4
            r3 = 0
            if (r0 == 0) goto Laa
            java.util.Map$Entry r1 = X.AbstractC166987dD.A1K(r2)     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r0 = r1.getKey()     // Catch: java.lang.Throwable -> Lc4
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch: java.lang.Throwable -> Lc4
            boolean r0 = X.AbstractC001900j.A0a(r8, r0, r7)     // Catch: java.lang.Throwable -> Lc4
            if (r0 == 0) goto L8d
            java.lang.Object r3 = r1.getValue()     // Catch: java.lang.Throwable -> Lc4
            X.Kbi r3 = (X.EnumC46144Kbi) r3     // Catch: java.lang.Throwable -> Lc4
        Laa:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.readLock()
            r0.unlock()
            r2 = -1
            if (r3 == 0) goto Lc1
            int[] r1 = X.AbstractC47138KsX.A00
            int r0 = r3.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto Lc1
            java.lang.Integer r1 = X.C05F.A00
            goto L60
        Lc1:
            java.lang.Integer r1 = X.C05F.A0N
            goto L60
        Lc4:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r6.A01
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.unlock()
            throw r1
        Lcf:
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            java.util.Iterator r3 = r5.iterator()
        Ld7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lee
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.Ku2 r0 = (X.C47229Ku2) r0
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 == r0) goto Ld7
            r4.add(r2)
            goto Ld7
        Lee:
            java.util.Iterator r3 = r4.iterator()
        Lf2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L105
            r3.next()
            X.0wW r2 = r10.A00
            java.lang.String r1 = "igd_client_message_content_detection"
            X.0kM r0 = r2.A00
            r2.A00(r0, r1)
            goto Lf2
        L105:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48123LRx.A00(X.0CA, X.LRx, java.lang.String):void");
    }

    private final void A01(Object obj, ArrayList arrayList) {
        String obj2;
        if (obj instanceof AbstractC04050Jw) {
            A02((AbstractC04050Jw) obj, arrayList);
            return;
        }
        if (obj instanceof String) {
            if (((CharSequence) obj).length() == 0) {
                return;
            }
            String str = (String) obj;
            try {
                boolean contains = this.A02.contains(new java.net.URL(str).getHost());
                if (AbstractC31175DnJ.A1Z(str, Patterns.WEB_URL) && contains) {
                    return;
                }
            } catch (MalformedURLException unused) {
            }
        } else {
            if (!(obj instanceof CharSequence) || (obj2 = obj.toString()) == null || obj2.length() == 0) {
                return;
            }
            String obj3 = obj.toString();
            try {
                boolean contains2 = this.A02.contains(new java.net.URL(obj3).getHost());
                if (AbstractC31175DnJ.A1Z(obj3, Patterns.WEB_URL) && contains2) {
                    return;
                }
            } catch (MalformedURLException unused2) {
            }
            obj = obj.toString();
        }
        arrayList.add(obj);
    }

    public final void A02(AbstractC04050Jw abstractC04050Jw, ArrayList arrayList) {
        if (abstractC04050Jw != null) {
            int i = 0;
            if (abstractC04050Jw instanceof C0CA) {
                C0CA c0ca = (C0CA) abstractC04050Jw;
                int i2 = c0ca.A00;
                while (i < i2) {
                    A01(c0ca.A0C(i), arrayList);
                    i++;
                }
                return;
            }
            if (abstractC04050Jw instanceof C0CW) {
                ArrayList arrayList2 = ((C0CW) abstractC04050Jw).A00;
                int size = arrayList2.size();
                while (i < size) {
                    A01(arrayList2.get(i), arrayList);
                    i++;
                }
            }
        }
    }

    @Override // X.InterfaceC38441qY
    public final Integer AFQ() {
        int i = 0;
        if (C18U.A06(C06090Tz.A05, this.A01, 36325781122856297L)) {
            i = 20;
        }
        return Integer.valueOf(i);
    }

    @Override // X.InterfaceC38441qY
    public final InterfaceC38461qa BqD() {
        return this.A04;
    }

    public C48123LRx(Context context, AbstractC12990ll abstractC12990ll) {
        AbstractC167017dG.A1P(abstractC12990ll, context);
        this.A01 = abstractC12990ll;
        this.A03 = context;
        this.A00 = (C18920wW) abstractC12990ll.A01(C18920wW.class, new C50157MDk(this, 27));
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A05 = AnonymousClass090.A01("igd_client_message_content_detection", AbstractC001800i.A0k(AbstractC167007dF.A0m(C18U.A04(c06090Tz, abstractC12990ll, 36888731076068158L), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0)));
        this.A02 = AbstractC001800i.A0k(AbstractC167007dF.A0m(C18U.A04(c06090Tz, abstractC12990ll, 36888731076133695L), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0));
        this.A04 = new C48122LRw(this);
    }
}
