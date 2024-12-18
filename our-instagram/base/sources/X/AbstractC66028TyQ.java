package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.TyQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66028TyQ {
    public final long A01;
    public final U7W A02;
    public final java.util.Set A05;
    public static final C71649Wxy A07 = new C71649Wxy(true);
    public static final C71649Wxy A06 = new C71649Wxy(false);
    public final List A03 = new ArrayList();
    public final Queue A04 = new PriorityQueue(16, A07);
    public long A00 = Long.MAX_VALUE;

    public final void A00() {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            String str = ((VK9) it.next()).A01;
            A02(str);
            A03(str);
        }
    }

    public final void A01(long j) {
        boolean z;
        if (j < this.A00) {
            Queue queue = this.A04;
            queue.clear();
            queue.addAll(this.A03);
        }
        while (true) {
            Queue queue2 = this.A04;
            if (queue2.isEmpty()) {
                break;
            }
            long j2 = this.A01 + j;
            C1125456i c1125456i = ((VK9) queue2.peek()).A00;
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            if (j2 < c1125456i.A03(timeUnit)) {
                break;
            }
            VK9 vk9 = (VK9) queue2.poll();
            if (j < vk9.A00.A02(timeUnit)) {
                java.util.Set set = this.A05;
                if (!set.contains(vk9)) {
                    set.add(vk9);
                    String str = vk9.A01;
                    if (this instanceof C67636Utr) {
                        WG8 wg8 = ((C67636Utr) this).A00;
                        int parseInt = Integer.parseInt(str);
                        MediaComposition mediaComposition = wg8.A08.A08;
                        if (mediaComposition != null) {
                            Map map = wg8.A0L;
                            Integer valueOf = Integer.valueOf(parseInt);
                            if (!map.containsKey(valueOf)) {
                                InterfaceC58019Po5 interfaceC58019Po5 = wg8.A0G;
                                C1125956n A04 = mediaComposition.A04(EnumC1125356h.AUDIO, parseInt);
                                A04.getClass();
                                Iterator A0n = AbstractC65702TsY.A0n(A04.A04);
                                while (A0n.hasNext()) {
                                    C1125756l c1125756l = (C1125756l) A0n.next();
                                    if (!c1125756l.A01(false)) {
                                        try {
                                            File file = c1125756l.A04;
                                            file.getClass();
                                            MYB AUI = interfaceC58019Po5.AUI(android.net.Uri.fromFile(file));
                                            if (AUI != null && !AUI.A0K) {
                                            }
                                        } catch (Exception unused) {
                                        }
                                        z = true;
                                        break;
                                    }
                                }
                                z = false;
                                AbstractC43592JPx.A1W(valueOf, map, z);
                            }
                            if (!((Boolean) map.get(valueOf)).booleanValue()) {
                            }
                        }
                        AbstractC25227BEk.A1O(wg8.A0M.submit(new CallableC71668WyL(parseInt, 0, wg8, mediaComposition)), wg8.A0K, parseInt);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        java.util.Set<VK9> set2 = this.A05;
        for (VK9 vk92 : set2) {
            C1125456i c1125456i2 = vk92.A00;
            TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
            if (!c1125456i2.A06(timeUnit2, j, this.A02.A1P())) {
                if (vk92.A02) {
                    arrayList3.add(vk92);
                }
            } else if (!vk92.A02) {
                arrayList.add(vk92);
            }
            long j3 = this.A01;
            if (j - j3 > c1125456i2.A02(timeUnit2) || j3 + j < c1125456i2.A03(timeUnit2)) {
                arrayList2.add(vk92);
            }
        }
        C71649Wxy c71649Wxy = A06;
        Collections.sort(arrayList3, c71649Wxy);
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            VK9 vk93 = (VK9) it.next();
            vk93.A02 = false;
            A02(vk93.A01);
        }
        Collections.sort(arrayList, A07);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            VK9 vk94 = (VK9) it2.next();
            vk94.A02 = true;
            String str2 = vk94.A01;
            if (this instanceof C67638Utt) {
                C67638Utt c67638Utt = (C67638Utt) this;
                Object obj = c67638Utt.A02.get(str2);
                obj.getClass();
                C69067VhI c69067VhI = (C69067VhI) obj;
                c67638Utt.A01.DRU(c69067VhI.A02, c69067VhI.A01);
            } else if (this instanceof C67637Uts) {
                C67637Uts c67637Uts = (C67637Uts) this;
                if (c67637Uts.A00 != 0) {
                    ((X9Z) c67637Uts.A02).DSO(Integer.parseInt(str2));
                } else {
                    Object obj2 = ((Map) c67637Uts.A02).get(str2);
                    obj2.getClass();
                    C69066VhH c69066VhH = (C69066VhH) obj2;
                    WG8 wg82 = (WG8) c67637Uts.A01;
                    Integer num = c69066VhH.A02;
                    MediaEffect mediaEffect = c69066VhH.A01;
                    int intValue = num.intValue();
                    InterfaceC71995XEj interfaceC71995XEj = wg82.A0F.A01;
                    if (intValue == -1) {
                        interfaceC71995XEj.addEffect(mediaEffect);
                    } else {
                        interfaceC71995XEj.addEffect(num, mediaEffect);
                    }
                }
            } else {
                C69377VmN c69377VmN = ((C67636Utr) this).A00.A0F;
                c69377VmN.A01.enableTrack(Integer.parseInt(str2));
            }
        }
        Collections.sort(arrayList2, c71649Wxy);
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            A03(((VK9) it3.next()).A01);
        }
        set2.removeAll(arrayList2);
        this.A00 = j;
    }

    public final void A02(String str) {
        if (this instanceof C67637Uts) {
            C67637Uts c67637Uts = (C67637Uts) this;
            if (c67637Uts.A00 != 0) {
                ((X9Y) c67637Uts.A01).DSN(Integer.parseInt(str));
                return;
            }
            Object obj = ((Map) c67637Uts.A02).get(str);
            obj.getClass();
            C69066VhH c69066VhH = (C69066VhH) obj;
            WG8 wg8 = (WG8) c67637Uts.A01;
            Integer num = c69066VhH.A02;
            MediaEffect mediaEffect = c69066VhH.A01;
            int intValue = num.intValue();
            InterfaceC71995XEj interfaceC71995XEj = wg8.A0F.A01;
            if (intValue == -1) {
                interfaceC71995XEj.removeEffect(mediaEffect);
                return;
            } else {
                interfaceC71995XEj.removeEffect(num, mediaEffect);
                return;
            }
        }
        if (this instanceof C67636Utr) {
            C69377VmN c69377VmN = ((C67636Utr) this).A00.A0F;
            c69377VmN.A01.disableTrack(Integer.parseInt(str));
        } else {
            C67638Utt c67638Utt = (C67638Utt) this;
            Object obj2 = c67638Utt.A02.get(str);
            obj2.getClass();
            C69067VhI c69067VhI = (C69067VhI) obj2;
            c67638Utt.A00.DRT(c69067VhI.A02, c69067VhI.A01);
        }
    }

    public final void A03(String str) {
        if (!(this instanceof C67637Uts) && (this instanceof C67636Utr)) {
            WG8 wg8 = ((C67636Utr) this).A00;
            Object remove = wg8.A0K.remove(Integer.valueOf(Integer.parseInt(str)));
            if (remove != null) {
                wg8.A0J.add(wg8.A0M.submit(new U7L(0, wg8, remove)));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.VK9, java.lang.Object] */
    public AbstractC66028TyQ(U7W u7w, Map map, long j) {
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            List list = this.A03;
            String str = (String) entry.getKey();
            C1125456i c1125456i = (C1125456i) entry.getValue();
            ?? obj = new Object();
            obj.A01 = str;
            obj.A00 = c1125456i;
            list.add(obj);
        }
        this.A01 = TimeUnit.MILLISECONDS.toMicros(j);
        this.A05 = new HashSet();
        this.A02 = u7w;
    }
}
