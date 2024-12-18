package X;

import android.util.Pair;
import android.util.SparseArray;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class WDG {
    public static final long A0I = (long) (Math.pow(10.0d, 6.0d) / 30.0d);
    public VJ9 A01;
    public AbstractC66028TyQ A02;
    public AbstractC66028TyQ A03;
    public boolean A04;
    public final InterfaceC58019Po5 A05;
    public final C70129W5q A06;
    public final U7X A07;
    public final C69489VoC A08;
    public final XCA A09;
    public final VK1 A0A;
    public final ExecutorService A0D;
    public final MediaComposition A0E;
    public final C69069VhK A0F;
    public final boolean A0G;
    public volatile boolean A0H;
    public final Map A0C = Collections.synchronizedMap(new HashMap());
    public long A00 = 0;
    public final Map A0B = new HashMap();

    /* JADX WARN: Type inference failed for: r0v5, types: [X.VIr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.Tyj, java.lang.Object] */
    private void A00(List list) {
        HashMap hashMap = new HashMap();
        Map map = this.A0C;
        hashMap.putAll(map);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap.remove(it.next());
        }
        ?? obj = new Object();
        Iterator A14 = AbstractC166997dE.A14(hashMap);
        while (A14.hasNext()) {
            C67628Uti c67628Uti = new C67628Uti((C66046Tyj) obj, (InterfaceC71998XEm) AbstractC31176DnK.A0j(A14));
            new Object().A00 = c67628Uti;
            c67628Uti.A00();
        }
        obj.A01();
        map.keySet().removeAll(hashMap.keySet());
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.VJ9, java.lang.Object] */
    public final void A01() {
        long j;
        AbstractC1808580n.A03("MultipleTrackCooridnator.demuxAndDecodeMediaPosition");
        try {
            final U7X u7x = this.A07;
            AbstractC1126356r.A07(AbstractC167007dF.A1W(u7x), "MultiOutputCoordinator cannot be null");
            MediaComposition mediaComposition = this.A0E;
            EnumC1125356h enumC1125356h = EnumC1125356h.VIDEO;
            InterfaceC58019Po5 interfaceC58019Po5 = this.A05;
            long A00 = AbstractC66047Tyk.A00(interfaceC58019Po5, enumC1125356h, mediaComposition);
            C69489VoC c69489VoC = this.A08;
            Map map = this.A0B;
            AbstractC70158WDt.A03(interfaceC58019Po5, enumC1125356h, c69489VoC, map);
            Object obj = map.get(enumC1125356h);
            obj.getClass();
            SparseArray sparseArray = (SparseArray) obj;
            ?? obj2 = new Object();
            obj2.A00 = new HashMap();
            obj2.A01 = new ArrayList();
            for (int i = 0; i < sparseArray.size(); i++) {
                int keyAt = sparseArray.keyAt(i);
                if (sparseArray.valueAt(i) != null) {
                    j = ((C1125456i) sparseArray.valueAt(i)).A03(TimeUnit.MICROSECONDS);
                } else {
                    j = -1;
                }
                obj2.A01.add(new Pair(Integer.valueOf(keyAt), Long.valueOf(j)));
            }
            Collections.sort(obj2.A01, new C71659WyA((Object) obj2, 3));
            for (int i2 = 0; i2 < obj2.A01.size(); i2++) {
                Pair pair = (Pair) obj2.A01.get(i2);
                AbstractC166997dE.A1U(pair.first, obj2.A00, i2);
            }
            this.A01 = obj2;
            u7x.getClass();
            X9Z x9z = new X9Z() { // from class: X.WZO
                @Override // X.X9Z
                public final void DSO(int i3) {
                    Object A0m = AbstractC166997dE.A0m(U7X.this.A01, 0);
                    A0m.getClass();
                    ((InterfaceC72000XEo) A0m).AAf(i3);
                }
            };
            X9Y x9y = new X9Y() { // from class: X.WZM
                @Override // X.X9Y
                public final void DSN(int i3) {
                    Object A0m = AbstractC166997dE.A0m(U7X.this.A01, 0);
                    A0m.getClass();
                    ((InterfaceC72000XEo) A0m).EGU(i3);
                }
            };
            U7W u7w = c69489VoC.A0B;
            this.A03 = AbstractC70158WDt.A00(x9y, x9z, u7w, map);
            MediaComposition mediaComposition2 = c69489VoC.A08;
            mediaComposition2.getClass();
            this.A02 = AbstractC70158WDt.A01(mediaComposition2, new WZH(u7x), new WZJ(u7x), u7w);
            A02(A00);
            int i3 = 0;
            while (true) {
                u7x.A00.getClass();
                if (i3 >= 1) {
                    break;
                }
                Object A0m = AbstractC166997dE.A0m(u7x.A01, i3);
                A0m.getClass();
                ((InterfaceC72000XEo) A0m).flush();
                i3 = 1;
            }
            int i4 = 0;
            while (true) {
                u7x.A00.getClass();
                if (i4 < 1) {
                    InterfaceC72000XEo interfaceC72000XEo = (InterfaceC72000XEo) AbstractC166997dE.A0m(u7x.A01, i4);
                    if (interfaceC72000XEo != null) {
                        interfaceC72000XEo.Em0();
                    }
                    i4 = 1;
                } else {
                    this.A00 = 0L;
                    A00(Collections.EMPTY_LIST);
                    AbstractC1808580n.A01();
                    return;
                }
            }
        } catch (Throwable th) {
            A00(Collections.EMPTY_LIST);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x016b, code lost:
    
        if (r9.A06(r15, r0, r0.A1P()) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016d, code lost:
    
        if (r16 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0172, code lost:
    
        if (r1 == false) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(long r36) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WDG.A02(long):void");
    }

    public WDG(C58647PzK c58647PzK, InterfaceC58019Po5 interfaceC58019Po5, C70129W5q c70129W5q, U7X u7x, C69489VoC c69489VoC, XCA xca, VK1 vk1) {
        int size;
        this.A07 = u7x;
        this.A08 = c69489VoC;
        this.A0A = vk1;
        this.A05 = interfaceC58019Po5;
        this.A06 = c70129W5q;
        this.A09 = xca;
        MediaComposition mediaComposition = c69489VoC.A08;
        mediaComposition.getClass();
        this.A0E = mediaComposition;
        U7W u7w = c69489VoC.A0B;
        this.A0G = u7w.A10();
        EnumC1125356h enumC1125356h = EnumC1125356h.VIDEO;
        if (mediaComposition.A07(enumC1125356h) == null) {
            size = 0;
        } else {
            size = mediaComposition.A07(enumC1125356h).size();
        }
        this.A0D = c58647PzK.A01(C05F.A0N, size);
        this.A0F = new C69069VhK(enumC1125356h, mediaComposition, u7w);
    }
}
