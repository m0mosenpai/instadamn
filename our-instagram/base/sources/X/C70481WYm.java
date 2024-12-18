package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WYm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70481WYm implements InterfaceC71995XEj {
    public InterfaceC71947XBy A02;
    public C69267Vkb A03;
    public W25 A04;
    public ByteBuffer A05;
    public boolean A06 = false;
    public final HashSet A0D = new HashSet();
    public final HashMap A08 = new HashMap();
    public final HashMap A09 = new HashMap();
    public final HashMap A07 = new HashMap();
    public final List A0B = new ArrayList();
    public final HashMap A0A = new HashMap();
    public final List A0C = new ArrayList();
    public int A00 = -1;
    public int A01 = -1;

    /* JADX WARN: Removed duplicated region for block: B:63:0x010d  */
    @Override // X.InterfaceC71995XEj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.nio.ByteBuffer process(java.nio.ByteBuffer[] r13, long r14) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70481WYm.process(java.nio.ByteBuffer[], long):java.nio.ByteBuffer");
    }

    @Override // X.InterfaceC71995XEj
    public final void warmup(ByteBuffer[] byteBufferArr, long j) {
    }

    @Override // X.InterfaceC71995XEj
    public final void addEffect(MediaEffect mediaEffect) {
        if (!(mediaEffect instanceof C23503AbJ)) {
            if (mediaEffect instanceof C23501AbH) {
                this.A0B.add(mediaEffect);
                Iterator A0l = AbstractC167007dF.A0l(this.A08);
                while (A0l.hasNext()) {
                    addEffect((Integer) A0l.next(), mediaEffect);
                }
                return;
            }
            return;
        }
        this.A0C.add(mediaEffect);
    }

    @Override // X.InterfaceC71995XEj
    public final void configure(C69065VhG c69065VhG) {
        this.A04 = c69065VhG.A01;
        int i = c69065VhG.A02.A00;
        boolean z = true;
        if (i != 2 && i != 1) {
            z = false;
        }
        AbstractC1126356r.A07(z, "FBA only supports mono or stereo audio output");
        int i2 = i * 1024 * 2;
        this.A03 = new C69267Vkb(r5.A01, 3, i2, i);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2);
        this.A05 = allocateDirect;
        this.A02 = new WUK(this, allocateDirect);
        int i3 = c69065VhG.A00;
        float[] fArr = new float[i3];
        long[] jArr = new long[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            HashMap hashMap = this.A07;
            Integer valueOf = Integer.valueOf(i4);
            hashMap.put(valueOf, new HashMap());
            this.A0A.put(valueOf, new ArrayList());
            fArr[i4] = 1.0f;
        }
        boolean z2 = false;
        int i5 = this.A04.A00;
        C69267Vkb c69267Vkb = this.A03;
        InterfaceC71947XBy interfaceC71947XBy = this.A02;
        if (c69267Vkb.A01 == 3) {
            c69267Vkb.A00 = interfaceC71947XBy;
            int createPushPCMMixingGraph = c69267Vkb.A03.createPushPCMMixingGraph(i3, 3, i5, fArr, new WUJ(c69267Vkb), jArr);
            if (createPushPCMMixingGraph != 0 && createPushPCMMixingGraph != 4) {
                c69267Vkb.A04 = false;
            } else {
                z2 = true;
                c69267Vkb.A04 = true;
            }
        }
        for (int i6 = 0; i6 < i3; i6++) {
            MSX.A1N(Integer.valueOf(i6), this.A08, jArr[i6]);
        }
        if (!z2) {
            throw new IllegalArgumentException("One or more FBA arguments were invalid.");
        }
    }

    @Override // X.InterfaceC71995XEj
    public final void disableTrack(int i) {
        HashSet hashSet = this.A0D;
        Integer valueOf = Integer.valueOf(i);
        if (hashSet.contains(valueOf)) {
            Object obj = this.A08.get(valueOf);
            obj.getClass();
            C69267Vkb c69267Vkb = this.A03;
            long longValue = ((Number) obj).longValue();
            if (c69267Vkb.A04 && c69267Vkb.A01 == 3) {
                c69267Vkb.A03.disconnectSource(longValue);
            }
            hashSet.remove(valueOf);
        }
    }

    @Override // X.InterfaceC71995XEj
    public final void enableTrack(int i) {
        long createQueueSource;
        HashSet hashSet = this.A0D;
        Integer valueOf = Integer.valueOf(i);
        if (!hashSet.contains(valueOf)) {
            HashMap hashMap = this.A08;
            if (!hashMap.containsKey(valueOf)) {
                C69267Vkb c69267Vkb = this.A03;
                String A0O = AnonymousClass001.A0O("Queue", i);
                int i2 = this.A04.A00;
                if (!c69267Vkb.A04) {
                    createQueueSource = 1003;
                } else if (c69267Vkb.A01 != 3) {
                    createQueueSource = 1002;
                } else {
                    createQueueSource = c69267Vkb.A03.createQueueSource(A0O, 3, i2);
                }
                MSX.A1N(valueOf, hashMap, createQueueSource);
                Iterator it = this.A0B.iterator();
                while (it.hasNext()) {
                    addEffect(valueOf, (MediaEffect) it.next());
                }
                this.A07.put(valueOf, new HashMap());
                this.A0A.put(valueOf, new ArrayList());
            }
            Object obj = hashMap.get(valueOf);
            obj.getClass();
            C69267Vkb c69267Vkb2 = this.A03;
            long longValue = ((Number) obj).longValue();
            if (c69267Vkb2.A04 && c69267Vkb2.A01 == 3) {
                c69267Vkb2.A03.connectSource(longValue);
            }
            hashSet.add(valueOf);
        }
    }

    @Override // X.InterfaceC71995XEj
    public final /* synthetic */ int getWarmupDurationInSec() {
        return 0;
    }

    @Override // X.InterfaceC71995XEj
    public final boolean isEffectSupported(MediaEffect mediaEffect) {
        if (!(mediaEffect instanceof C23501AbH) && !(mediaEffect instanceof C23503AbJ)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC71995XEj
    public final void removeEffect(MediaEffect mediaEffect) {
        if (!(mediaEffect instanceof C23503AbJ)) {
            if (mediaEffect instanceof C23501AbH) {
                this.A0B.remove(mediaEffect);
                Iterator A0l = AbstractC167007dF.A0l(this.A08);
                while (A0l.hasNext()) {
                    removeEffect((Integer) A0l.next(), mediaEffect);
                }
                return;
            }
            return;
        }
        this.A0C.remove(mediaEffect);
    }

    @Override // X.InterfaceC71995XEj
    public final void addEffect(Integer num, MediaEffect mediaEffect) {
        long loadEffect;
        if (num.intValue() != -1) {
            if (mediaEffect instanceof C23501AbH) {
                String str = ((C23501AbH) mediaEffect).A00;
                C69267Vkb c69267Vkb = this.A03;
                if (!c69267Vkb.A04) {
                    loadEffect = 1003;
                } else if (c69267Vkb.A01 != 3) {
                    loadEffect = 1002;
                } else {
                    loadEffect = c69267Vkb.A03.loadEffect(str);
                }
                MSX.A1N(str, (AbstractMap) this.A07.get(num), loadEffect);
                Object obj = this.A08.get(num);
                obj.getClass();
                C69267Vkb c69267Vkb2 = this.A03;
                long longValue = ((Number) obj).longValue();
                if (c69267Vkb2.A04 && c69267Vkb2.A01 == 3) {
                    c69267Vkb2.A03.addEffect(longValue, loadEffect);
                    return;
                }
                return;
            }
            if (!(mediaEffect instanceof C23503AbJ)) {
                return;
            }
            ((List) this.A0A.get(num)).add(mediaEffect);
        }
    }

    @Override // X.InterfaceC71995XEj
    public final void removeEffect(Integer num, MediaEffect mediaEffect) {
        int intValue = num.intValue();
        if (intValue != -1 && (mediaEffect instanceof C23501AbH)) {
            String str = ((C23501AbH) mediaEffect).A00;
            str.getClass();
            Object obj = this.A08.get(num);
            obj.getClass();
            HashMap hashMap = this.A07;
            Object obj2 = hashMap.get(num);
            obj2.getClass();
            Object obj3 = ((AbstractMap) obj2).get(str);
            obj3.getClass();
            C69267Vkb c69267Vkb = this.A03;
            long longValue = ((Number) obj).longValue();
            long longValue2 = ((Number) obj3).longValue();
            if (c69267Vkb.A04 && c69267Vkb.A01 == 3) {
                c69267Vkb.A03.removeEffect(longValue, longValue2);
            }
            ((AbstractMap) hashMap.get(num)).remove(str);
            return;
        }
        if (!(mediaEffect instanceof C23503AbJ)) {
            return;
        }
        HashMap hashMap2 = this.A0A;
        if (intValue == -1) {
            Iterator A14 = AbstractC166997dE.A14(hashMap2);
            while (A14.hasNext()) {
                ((List) AbstractC31176DnK.A0j(A14)).remove(mediaEffect);
            }
            return;
        }
        ((List) hashMap2.get(num)).remove(mediaEffect);
    }
}
