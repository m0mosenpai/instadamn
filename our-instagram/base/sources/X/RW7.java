package X;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes10.dex */
public final class RW7 extends AbstractC62683SLw {
    public static boolean A04 = true;
    public final InterfaceC65551TmU A00;
    public final C63010SaY A01;
    public final C63281Sgg A02;
    public final SEY A03;
    public static final C62865SUn A06 = C62865SUn.A00;
    public static final C63175Sea A05 = new C63175Sea();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r5.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode < 204700000) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RW7(X.C63164SeO r7, X.C63010SaY r8) {
        /*
            r6 = this;
            java.lang.String r0 = r8.A00()
            X.Sgg r4 = X.S7K.A00(r0)
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.Object r5 = r7.A01(r3)
            android.content.Context r5 = (android.content.Context) r5
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtil.A00
            r2 = 0
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            int r1 = r0.versionCode
            r0 = 204700000(0xc337960, float:1.3826183E-31)
            if (r1 >= r0) goto L54
            goto L2c
        L25:
            java.lang.String r1 = "GooglePlayServicesUtil"
            java.lang.String r0 = "Google Play services is missing."
            android.util.Log.w(r1, r0)
        L2c:
            boolean r0 = r8.A01()
            if (r0 != 0) goto L54
            X.TEJ r1 = new X.TEJ
            r1.<init>(r5)
        L37:
            X.Sea r0 = X.RW7.A05
            r6.<init>(r0)
            r6.A02 = r4
            r6.A00 = r1
            X.SeO r0 = X.C63164SeO.A00()
            java.lang.Object r1 = r0.A01(r3)
            android.content.Context r1 = (android.content.Context) r1
            X.SEY r0 = new X.SEY
            r0.<init>(r1)
            r6.A03 = r0
            r6.A01 = r8
            return
        L54:
            X.TEK r1 = new X.TEK
            r1.<init>(r5, r8)
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RW7.<init>(X.SeO, X.SaY):void");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.SIT, java.lang.Object] */
    public static final void A00(EnumC61232Rit enumC61232Rit, C62552SGd c62552SGd, RW7 rw7, long j) {
        EnumC61231Ris enumC61231Ris;
        final long A0B = AbstractC58318PtA.A0B(j);
        final C63281Sgg c63281Sgg = rw7.A02;
        EnumC72440Xdk enumC72440Xdk = EnumC72440Xdk.A03;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Map map = c63281Sgg.A06;
        if (map.get(enumC72440Xdk) == null || elapsedRealtime - AbstractC166987dD.A0N(map.get(enumC72440Xdk)) > TimeUnit.SECONDS.toMillis(30L)) {
            AbstractC43592JPx.A1V(enumC72440Xdk, elapsedRealtime, map);
            Long valueOf = Long.valueOf(A0B & Long.MAX_VALUE);
            Boolean valueOf2 = Boolean.valueOf(A04);
            Boolean A0b = AbstractC166997dE.A0b();
            SIS sis = new SIS(enumC61232Rit, valueOf2, A0b, A0b, valueOf);
            Bitmap bitmap = c62552SGd.A02;
            C3U5.A02(bitmap);
            C62716SNf c62716SNf = new C62716SNf(EnumC61229Riq.BITMAP, Integer.valueOf(bitmap.getAllocationByteCount() & Integer.MAX_VALUE));
            C63010SaY c63010SaY = rw7.A01;
            SGW sgw = new SGW(c62716SNf, sis, new SNP(EnumC61230Rir.LATIN));
            ?? obj = new Object();
            if (c63010SaY.A01()) {
                enumC61231Ris = EnumC61231Ris.TYPE_THICK;
            } else {
                enumC61231Ris = EnumC61231Ris.TYPE_THIN;
            }
            obj.A01 = enumC61231Ris;
            obj.A03 = sgw;
            Rj8.A01.execute(new RunnableC64705TQm(enumC72440Xdk, c63281Sgg, new SGX(obj, 0), C63281Sgg.A01(c63281Sgg)));
        }
        Boolean valueOf3 = Boolean.valueOf(A04);
        C63010SaY c63010SaY2 = rw7.A01;
        final C62728SNs c62728SNs = new C62728SNs(enumC61232Rit, new SNP(EnumC61230Rir.LATIN), valueOf3);
        final SCC scc = new SCC(rw7);
        final EnumC72440Xdk enumC72440Xdk2 = EnumC72440Xdk.A02;
        Rj8.A01.execute(new Runnable() { // from class: X.TR5
            /* JADX WARN: Type inference failed for: r2v5, types: [X.SIT, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                EnumC61231Ris enumC61231Ris2;
                C63281Sgg c63281Sgg2 = c63281Sgg;
                EnumC72440Xdk enumC72440Xdk3 = enumC72440Xdk2;
                Object obj2 = c62728SNs;
                long j2 = A0B;
                SCC scc2 = scc;
                Map map2 = c63281Sgg2.A07;
                if (!map2.containsKey(enumC72440Xdk3)) {
                    map2.put(enumC72440Xdk3, new RNT());
                }
                InterfaceC65261Tgr interfaceC65261Tgr = (InterfaceC65663Tqt) map2.get(enumC72440Xdk3);
                Long valueOf4 = Long.valueOf(j2);
                AbstractC60698RNa abstractC60698RNa = (AbstractC60698RNa) interfaceC65261Tgr;
                Map map3 = abstractC60698RNa.A01;
                Collection collection = (Collection) map3.get(obj2);
                if (collection == null) {
                    ArrayList A17 = AbstractC25225BEi.A17(3);
                    if (A17.add(valueOf4)) {
                        abstractC60698RNa.A00++;
                        map3.put(obj2, A17);
                    } else {
                        throw AbstractC58318PtA.A0W(AbstractC111324zv.A00(3687));
                    }
                } else if (collection.add(valueOf4)) {
                    abstractC60698RNa.A00++;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                Map map4 = c63281Sgg2.A06;
                if (map4.get(enumC72440Xdk3) == null || elapsedRealtime2 - AbstractC166987dD.A0N(map4.get(enumC72440Xdk3)) > TimeUnit.SECONDS.toMillis(30L)) {
                    AbstractC43592JPx.A1V(enumC72440Xdk3, elapsedRealtime2, map4);
                    T6D t6d = (T6D) interfaceC65261Tgr;
                    java.util.Set set = t6d.A01;
                    if (set == null) {
                        AbstractC60698RNa abstractC60698RNa2 = (AbstractC60698RNa) t6d;
                        set = new C60711RNn(abstractC60698RNa2, abstractC60698RNa2.A01);
                        t6d.A01 = set;
                    }
                    for (Object obj3 : set) {
                        Collection collection2 = (Collection) abstractC60698RNa.A01.get(obj3);
                        if (collection2 == null) {
                            collection2 = AbstractC25225BEi.A17(3);
                        }
                        ArrayList A1F = AbstractC166987dD.A1F(abstractC60698RNa.A00(obj3, collection2));
                        Collections.sort(A1F);
                        Iterator it = A1F.iterator();
                        long j3 = 0;
                        while (it.hasNext()) {
                            j3 += MSY.A07(it);
                        }
                        Long valueOf5 = Long.valueOf((j3 / A1F.size()) & Long.MAX_VALUE);
                        Long valueOf6 = Long.valueOf(C63281Sgg.A00(A1F, 100.0d) & Long.MAX_VALUE);
                        Long valueOf7 = Long.valueOf(C63281Sgg.A00(A1F, 75.0d) & Long.MAX_VALUE);
                        C62609SIq c62609SIq = new C62609SIq(valueOf6, Long.valueOf(C63281Sgg.A00(A1F, 0.0d) & Long.MAX_VALUE), valueOf5, Long.valueOf(C63281Sgg.A00(A1F, 25.0d) & Long.MAX_VALUE), Long.valueOf(C63281Sgg.A00(A1F, 50.0d) & Long.MAX_VALUE), valueOf7);
                        int size = A1F.size();
                        RW7 rw72 = scc2.A00;
                        C62728SNs c62728SNs2 = (C62728SNs) obj3;
                        ?? obj4 = new Object();
                        if (rw72.A01.A01()) {
                            enumC61231Ris2 = EnumC61231Ris.TYPE_THICK;
                        } else {
                            enumC61231Ris2 = EnumC61231Ris.TYPE_THIN;
                        }
                        obj4.A01 = enumC61231Ris2;
                        obj4.A00 = new SGV(c62728SNs2, c62609SIq, Integer.valueOf(size & Integer.MAX_VALUE));
                        Rj8.A01.execute(new RunnableC64705TQm(enumC72440Xdk3, c63281Sgg2, new SGX(obj4, 0), C63281Sgg.A01(c63281Sgg2)));
                    }
                    map2.remove(enumC72440Xdk3);
                }
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        final SEY sey = rw7.A03;
        int i = 24306;
        if (c63010SaY2.A01()) {
            i = 24317;
        }
        int i2 = enumC61232Rit.A00;
        long j2 = currentTimeMillis - A0B;
        synchronized (sey) {
            final long elapsedRealtime2 = SystemClock.elapsedRealtime();
            AtomicLong atomicLong = sey.A01;
            if (atomicLong.get() == -1 || elapsedRealtime2 - atomicLong.get() > TimeUnit.MINUTES.toMillis(30L)) {
                sey.A00.Ci1(new TelemetryData(0, Arrays.asList(new MethodInvocation(null, null, i, i2, 0, 0, -1, j2, currentTimeMillis)))).A0A(new InterfaceC65424Tjv() { // from class: X.T73
                    @Override // X.InterfaceC65424Tjv
                    public final void onFailure(Exception exc) {
                        SEY sey2 = SEY.this;
                        sey2.A01.set(elapsedRealtime2);
                    }
                });
            }
        }
    }
}
