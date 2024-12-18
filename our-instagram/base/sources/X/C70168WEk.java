package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.security.MessageDigest;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.WEk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70168WEk {
    public ExecutorService A02;
    public Integer A03;
    public final Context A04;
    public final C58647PzK A05;
    public final InterfaceC58019Po5 A06;
    public final X9V A08;
    public final InterfaceC58105PpU A09;
    public final InterfaceC71972XDf A0A;
    public final C69489VoC A0B;
    public final InterfaceC71895X9c A0C;
    public final File A0D;
    public final XES A07 = new C55777Opm(this, 0);
    public final HashMap A0E = new HashMap();
    public final AtomicBoolean A0F = new AtomicBoolean();
    public List A00 = new ArrayList();
    public List A01 = new ArrayList();

    private C69489VoC A00(MYB myb, XES xes, MediaComposition mediaComposition) {
        int i;
        int i2;
        C69489VoC c69489VoC = this.A0B;
        WDI wdi = c69489VoC.A06;
        if (wdi != null) {
            i = Math.max(wdi.A0C, wdi.A0A);
            i2 = wdi.A01;
        } else {
            W94 w94 = W94.A05;
            i = w94.A01;
            i2 = w94.A00;
        }
        WDI A03 = WFb.A03(myb, new W94(i, i2), null);
        A03.A0F = new C68695VaV();
        W3N w3n = new W3N(c69489VoC);
        w3n.A06 = A03;
        w3n.A07 = xes;
        w3n.A08 = mediaComposition;
        w3n.A0J = false;
        return new C69489VoC(w3n);
    }

    private void A02(EnumC1125356h enumC1125356h, C1126256q c1126256q, MediaComposition mediaComposition) {
        AbstractMap hashMap;
        HashMap A07 = mediaComposition.A07(enumC1125356h);
        if (A07 != null) {
            int size = A07.size();
            for (int i = 0; i < size; i++) {
                C1125956n c1125956n = (C1125956n) AbstractC58319PtB.A0n(A07, i);
                if (c1125956n != null) {
                    C1125856m c1125856m = new C1125856m(c1125956n.A01, c1125956n.A02, c1125956n.A00);
                    Iterator A0n = AbstractC65702TsY.A0n(c1125956n.A04);
                    while (A0n.hasNext()) {
                        C1125756l c1125756l = (C1125756l) A0n.next();
                        File file = c1125756l.A04;
                        C1125456i c1125456i = c1125756l.A03;
                        HashMap hashMap2 = this.A0E;
                        if (hashMap2.containsKey(c1125956n)) {
                            file = (File) hashMap2.get(c1125956n);
                            if (this.A0B.A0N) {
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                long max = Math.max(0L, c1125456i.A03(timeUnit));
                                long A02 = c1125456i.A02(timeUnit);
                                long j = c1125756l.A01;
                                if (A02 < 0) {
                                    A02 = j;
                                }
                                long j2 = j - A02;
                                long j3 = j - max;
                                if (j2 == 0) {
                                    j2 = -1;
                                }
                                if (j3 == j) {
                                    j3 = -1;
                                }
                                c1125456i = new C1125456i(timeUnit, j2, j3);
                            } else {
                                c1125456i = new C1125456i(TimeUnit.SECONDS, -1L, -1L);
                            }
                        }
                        C1125656k c1125656k = new C1125656k(file);
                        c1125656k.A03 = c1125456i;
                        c1125656k.A02 = c1125756l.A02;
                        c1125656k.A00 = c1125756l.A00;
                        c1125656k.A01 = c1125756l.A01;
                        c1125656k.A05 = c1125756l.A05;
                        c1125856m.A02(c1125656k.A00());
                    }
                    Iterator A0n2 = AbstractC65702TsY.A0n(c1125956n.A07);
                    while (A0n2.hasNext()) {
                        C5JJ c5jj = (C5JJ) A0n2.next();
                        float f = c5jj.A00;
                        if (f >= 0.0f || this.A0B.A0N) {
                            c1125856m.A01(c5jj.A01, Math.abs(f));
                        }
                    }
                    Iterator A0n3 = AbstractC65702TsY.A0n(c1125956n.A06);
                    while (A0n3.hasNext()) {
                        A0n3.next();
                        c1125856m.A06.add(null);
                    }
                    c1125856m.A03.putAll(c1125956n.A03);
                    Iterator it = c1125956n.A05.iterator();
                    while (it.hasNext()) {
                        c1125856m.A03((C69688VtY) it.next(), null);
                    }
                    c1126256q.A04(new C1125956n(c1125856m));
                }
            }
            HashMap hashMap3 = mediaComposition.A01;
            if (hashMap3.containsKey(enumC1125356h)) {
                HashMap hashMap4 = c1126256q.A01;
                if (hashMap4.containsKey(enumC1125356h)) {
                    hashMap = (AbstractMap) hashMap4.get(enumC1125356h);
                } else {
                    hashMap = new HashMap();
                }
                hashMap.getClass();
                HashMap hashMap5 = (HashMap) hashMap3.get(enumC1125356h);
                hashMap5.getClass();
                hashMap.putAll(hashMap5);
                hashMap4.put(enumC1125356h, hashMap);
            }
            List<C69688VtY> list = (List) mediaComposition.A00.get(enumC1125356h);
            if (list != null) {
                for (C69688VtY c69688VtY : list) {
                    c1126256q.A01(c69688VtY.A00, enumC1125356h, c69688VtY.A01);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x02ce, code lost:
    
        if (r6.size() != r16.size()) goto L93;
     */
    /* JADX WARN: Type inference failed for: r1v22, types: [X.XD9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r32v0, types: [X.X9T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r32v1, types: [X.X9T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.videolite.transcoder.base.composition.MediaComposition A03(boolean r47) {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70168WEk.A03(boolean):com.facebook.videolite.transcoder.base.composition.MediaComposition");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r5.A01.isEmpty() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04() {
        /*
            r5 = this;
            java.util.List r4 = r5.A00
            boolean r0 = r4.isEmpty()
            r3 = 1
            if (r0 == 0) goto L12
            java.util.List r0 = r5.A01
            boolean r0 = r0.isEmpty()
            r2 = 1
            if (r0 != 0) goto L13
        L12:
            r2 = 0
        L13:
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.A0F
            boolean r0 = r1.get()
            if (r0 != 0) goto L50
            if (r2 != 0) goto L50
            r1.set(r3)
            java.util.Iterator r1 = r4.iterator()
        L24:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r1.next()
            X.XD7 r0 = (X.XD7) r0
            r0.cancel()
            goto L24
        L34:
            java.util.List r2 = r5.A01
            java.util.Iterator r1 = r2.iterator()
        L3a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r1.next()
            X.XD7 r0 = (X.XD7) r0
            r0.cancel()
            goto L3a
        L4a:
            r4.clear()
            r2.clear()
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70168WEk.A04():void");
    }

    public C70168WEk(Context context, C58647PzK c58647PzK, InterfaceC58019Po5 interfaceC58019Po5, X9V x9v, InterfaceC58105PpU interfaceC58105PpU, InterfaceC71972XDf interfaceC71972XDf, WZX wzx, C69489VoC c69489VoC, File file, Integer num) {
        this.A04 = context;
        this.A06 = interfaceC58019Po5;
        this.A0B = c69489VoC;
        this.A0A = interfaceC71972XDf;
        this.A08 = x9v;
        this.A09 = interfaceC58105PpU;
        this.A05 = c58647PzK;
        this.A0C = wzx;
        this.A0D = file;
        this.A03 = num;
    }

    public static File A01(C1125956n c1125956n, File file) {
        String obj = c1125956n.A01().toString();
        C14360o3.A0B(obj, 0);
        byte[] digest = MessageDigest.getInstance("MD5").digest(MSY.A1a(obj));
        C14360o3.A0A(digest);
        return new File(file, AnonymousClass001.A0R(AbstractC1126356r.A05(digest), ".mp4"));
    }
}
