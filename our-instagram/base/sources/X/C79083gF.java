package X;

import android.graphics.Rect;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3gF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79083gF extends C2X7 implements C2X8, InterfaceC79103gH {
    public final boolean A00;
    public static final C79083gF A02 = new C79083gF(false);
    public static final C79083gF A01 = new C79083gF(true);

    public static void A03(C79073gE c79073gE, Object obj) {
        AbstractC79383gk.A02(null);
        C79063gD c79063gD = c79073gE.A00;
        C1LL c1ll = c79063gD.A07;
        boolean isTracing = c1ll.isTracing();
        if (isTracing) {
            c1ll.ADO("IncrementalMountExtension.recursivelyNotify");
        }
        if (!c79063gD.A02) {
            AbstractC87343us.A03(c1ll, obj);
        } else {
            c79063gD.A09.add(obj);
        }
        if (isTracing) {
            c1ll.ASb();
        }
    }

    @Override // X.C2X8
    public final void D0L(C2WC c2wc, C79073gE c79073gE, Object obj, Object obj2, boolean z) {
    }

    @Override // X.InterfaceC79103gH
    public final void E1F(final Rect rect, final C79073gE c79073gE) {
        Object obj;
        AbstractC79383gk.A02(null);
        C79063gD c79063gD = c79073gE.A00;
        C1LL c1ll = c79063gD.A07;
        boolean isTracing = c1ll.isTracing();
        if (isTracing) {
            c1ll.ADO("IncrementalMountExtension.onVisibleBoundsChanged");
        }
        C79183gP c79183gP = (C79183gP) c79073gE.A02;
        if (c79183gP.A02 != null && (!rect.isEmpty() || !c79183gP.A04.isEmpty())) {
            Rect rect2 = c79183gP.A04;
            if (!rect2.isEmpty() && !rect.isEmpty() && rect.left == rect2.left && rect.right == rect2.right) {
                if (c79183gP.A02 != null) {
                    boolean isTracing2 = c1ll.isTracing();
                    if (isTracing2) {
                        c1ll.ADO("performIncrementalMount");
                    }
                    AbstractC50692Uq.A07("RenderCore.IncrementalMount.Start", new InterfaceC16820sZ() { // from class: X.3lp
                        @Override // X.InterfaceC16820sZ
                        public final Object invoke() {
                            int i;
                            C79243gV c79243gV = C79073gE.this.A00.A06.A02;
                            if (c79243gV != null) {
                                i = c79243gV.A00;
                            } else {
                                i = -1;
                            }
                            return String.valueOf(i);
                        }
                    }, new InterfaceC16660sJ() { // from class: X.3lq
                        @Override // X.InterfaceC16660sJ
                        public final Object invoke(Object obj2) {
                            ((Map) obj2).put("visibleRect", rect);
                            return C0eB.A00;
                        }
                    });
                    C50882Vk c50882Vk = c79183gP.A02;
                    ArrayList arrayList = c50882Vk.A0O;
                    ArrayList arrayList2 = c50882Vk.A0N;
                    int size = c50882Vk.A0W.size();
                    if (rect.top >= 0 || rect2.top >= 0) {
                        while (true) {
                            int i = c79183gP.A00;
                            if (i >= size || rect.top < ((C79043gB) arrayList2.get(i)).A04.bottom) {
                                break;
                            }
                            C79043gB c79043gB = (C79043gB) arrayList2.get(c79183gP.A00);
                            long j = c79043gB.A03;
                            if (c79073gE.A03.contains(Long.valueOf(j)) && !c79043gB.A00 && !c79183gP.A03) {
                                c79073gE.A02(j, true);
                            }
                            c79183gP.A00++;
                        }
                        while (true) {
                            int i2 = c79183gP.A00;
                            if (i2 <= 0 || rect.top >= ((C79043gB) arrayList2.get(i2 - 1)).A04.bottom) {
                                break;
                            }
                            long j2 = ((C79043gB) arrayList2.get(c79183gP.A00 - 1)).A03;
                            if (rect.bottom >= ((C79043gB) arrayList2.get(c79183gP.A00 - 1)).A04.top) {
                                java.util.Set set = c79073gE.A03;
                                Long valueOf = Long.valueOf(j2);
                                if (!set.contains(valueOf)) {
                                    c79073gE.A01(j2, true);
                                    c79183gP.A06.add(valueOf);
                                }
                            }
                            c79183gP.A00--;
                        }
                    }
                    int height = c79063gD.A06.A07.getHeight();
                    if (rect.bottom < height || rect2.bottom < height) {
                        while (true) {
                            int i3 = c79183gP.A01;
                            if (i3 >= size || rect.bottom < ((C79043gB) arrayList.get(i3)).A04.top) {
                                break;
                            }
                            long j3 = ((C79043gB) arrayList.get(c79183gP.A01)).A03;
                            if (rect.top <= ((C79043gB) arrayList.get(c79183gP.A01)).A04.bottom) {
                                java.util.Set set2 = c79073gE.A03;
                                Long valueOf2 = Long.valueOf(j3);
                                if (!set2.contains(valueOf2)) {
                                    c79073gE.A01(j3, true);
                                    c79183gP.A06.add(valueOf2);
                                }
                            }
                            c79183gP.A01++;
                        }
                        while (true) {
                            int i4 = c79183gP.A01;
                            if (i4 <= 0 || rect.bottom >= ((C79043gB) arrayList.get(i4 - 1)).A04.top) {
                                break;
                            }
                            C79043gB c79043gB2 = (C79043gB) arrayList.get(c79183gP.A01 - 1);
                            long j4 = c79043gB2.A03;
                            if (c79073gE.A03.contains(Long.valueOf(j4)) && !c79043gB2.A00 && !c79183gP.A03) {
                                c79073gE.A02(j4, true);
                            }
                            c79183gP.A01--;
                        }
                    }
                    HashMap hashMap = c79183gP.A05;
                    for (Object obj2 : hashMap.keySet()) {
                        if (!c79183gP.A06.contains(obj2) && (obj = hashMap.get(obj2)) != null) {
                            A03(c79073gE, obj);
                        }
                    }
                    c79183gP.A06.clear();
                    if (isTracing2) {
                        c1ll.ASb();
                    }
                    AbstractC50692Uq.A07("RenderCore.IncrementalMount.End", new InterfaceC16820sZ() { // from class: X.3lr
                        @Override // X.InterfaceC16820sZ
                        public final Object invoke() {
                            int i5;
                            C79243gV c79243gV = C79073gE.this.A00.A06.A02;
                            if (c79243gV != null) {
                                i5 = c79243gV.A00;
                            } else {
                                i5 = -1;
                            }
                            return String.valueOf(i5);
                        }
                    }, new InterfaceC16660sJ() { // from class: X.3ls
                        @Override // X.InterfaceC16660sJ
                        public final Object invoke(Object obj3) {
                            Map map = (Map) obj3;
                            map.put("numItemsMounted", 0);
                            map.put("numItemsUnmounted", 0);
                            return C0eB.A00;
                        }
                    });
                }
            } else {
                C50882Vk c50882Vk2 = c79183gP.A02;
                if (c50882Vk2 != null) {
                    boolean z = C2V1.A01;
                    Collection values = c50882Vk2.A0W.values();
                    if (z) {
                        ArrayList arrayList3 = new ArrayList(values);
                        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                            A01(rect, c79073gE, (C79043gB) arrayList3.get(size2), true);
                        }
                    } else {
                        Iterator it = values.iterator();
                        while (it.hasNext()) {
                            A01(rect, c79073gE, (C79043gB) it.next(), true);
                        }
                    }
                    A02(rect, c79183gP);
                }
            }
            rect2.set(rect);
        }
        if (isTracing) {
            c1ll.ASb();
        }
    }

    @Override // X.C2X8
    public final boolean Ek6(C2WC c2wc, C2WC c2wc2, C79073gE c79073gE, Object obj, Object obj2) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r1 >= 30.0f) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.RunnableC104034mP A00(X.C79073gE r4) {
        /*
            X.3gD r1 = r4.A00
            X.2Wf r0 = r1.A06
            X.2WS r0 = r0.A07
            android.view.Display r0 = r0.getDisplay()
            X.1LL r4 = r1.A07
            if (r0 == 0) goto L26
            float r1 = r0.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L26
        L18:
            r0 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r0 = r0 / r1
            long r2 = (long) r0
            X.4mP r1 = X.RunnableC104034mP.A06
            if (r1 == 0) goto L29
            boolean r0 = X.C2V1.A00
            if (r0 == 0) goto L29
            return r1
        L26:
            r1 = 1114636288(0x42700000, float:60.0)
            goto L18
        L29:
            X.4mP r1 = new X.4mP
            r1.<init>(r4, r2)
            X.RunnableC104034mP.A06 = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79083gF.A00(X.3gE):X.4mP");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        if (r6.A00 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(android.graphics.Rect r4, X.C79073gE r5, X.C79043gB r6, boolean r7) {
        /*
            long r0 = r6.A03
            X.3gD r2 = r5.A00
            X.2Wf r2 = r2.A06
            X.01a r2 = r2.A06
            java.lang.Object r2 = r2.A05(r0)
            X.3h4 r2 = (X.C3h4) r2
            if (r2 == 0) goto L53
            java.lang.Object r3 = r2.A04
        L12:
            boolean r2 = r3 instanceof X.C2WS
            if (r2 == 0) goto L3f
            X.2WS r3 = (X.C2WS) r3
            int r2 = r3.getMountItemCount()
            if (r2 <= 0) goto L3f
        L1e:
            r4 = 1
        L1f:
            java.util.Set r3 = r5.A03
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            boolean r2 = r3.contains(r2)
            if (r4 == 0) goto L31
            if (r2 != 0) goto L30
            r5.A01(r0, r7)
        L30:
            return
        L31:
            if (r2 == 0) goto L30
            java.lang.Object r2 = r5.A02
            X.3gP r2 = (X.C79183gP) r2
            boolean r2 = r2.A03
            if (r2 != 0) goto L30
            r5.A02(r0, r7)
            return
        L3f:
            android.graphics.Rect r2 = r6.A04
            boolean r2 = android.graphics.Rect.intersects(r4, r2)
            if (r2 != 0) goto L1e
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L1e
            boolean r2 = r6.A00
            r4 = 0
            if (r2 == 0) goto L1f
            goto L1e
        L53:
            r3 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79083gF.A01(android.graphics.Rect, X.3gE, X.3gB, boolean):void");
    }

    @Override // X.C2X7
    public final /* bridge */ /* synthetic */ Object A0A() {
        return new C79183gP();
    }

    @Override // X.C2X7
    public final /* bridge */ /* synthetic */ void A0B(Rect rect, C79073gE c79073gE, Object obj) {
        C50882Vk c50882Vk = (C50882Vk) obj;
        C1LL c1ll = c79073gE.A00.A07;
        boolean isTracing = c1ll.isTracing();
        if (isTracing) {
            c1ll.ADO("IncrementalMountExtension.beforeMount");
        }
        C79183gP c79183gP = (C79183gP) c79073gE.A02;
        C50882Vk c50882Vk2 = c79183gP.A02;
        if (c50882Vk2 != null) {
            Iterator it = c50882Vk2.A0W.values().iterator();
            while (it.hasNext()) {
                long j = ((C79043gB) it.next()).A03;
                Map map = c50882Vk.A0W;
                Long valueOf = Long.valueOf(j);
                if (map.get(valueOf) == null && c79073gE.A03.contains(valueOf)) {
                    c79073gE.A02(j, false);
                }
            }
        }
        c79183gP.A02 = c50882Vk;
        Rect rect2 = c79183gP.A04;
        rect2.setEmpty();
        if (rect != null) {
            rect2.set(rect);
        }
        if (isTracing) {
            c1ll.ASb();
        }
    }

    @Override // X.C2X7
    public final void A0C(C79073gE c79073gE) {
        C1LL c1ll = c79073gE.A00.A07;
        boolean isTracing = c1ll.isTracing();
        if (isTracing) {
            c1ll.ADO("IncrementalMountExtension.afterMount");
        }
        C79183gP c79183gP = (C79183gP) c79073gE.A02;
        A02(c79183gP.A04, c79183gP);
        if (isTracing) {
            c1ll.ASb();
        }
    }

    @Override // X.C2X8
    public final void ADI(RenderTreeNode renderTreeNode, C79073gE c79073gE, int i) {
        C1LL c1ll = c79073gE.A00.A07;
        boolean isTracing = c1ll.isTracing();
        if (isTracing) {
            c1ll.ADO("IncrementalMountExtension.beforeMountItem");
        }
        long A0H = renderTreeNode.A06.A0H();
        C79183gP c79183gP = (C79183gP) c79073gE.A02;
        C50882Vk c50882Vk = c79183gP.A02;
        if (c50882Vk != null) {
            C79043gB c79043gB = (C79043gB) c50882Vk.A0W.get(Long.valueOf(A0H));
            if (c79043gB != null) {
                A01(c79183gP.A04, c79073gE, c79043gB, false);
                if (isTracing) {
                    c1ll.ASb();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(AnonymousClass001.A0e("Output with id=", " not found.", A0H));
        }
    }

    @Override // X.C2X8
    public final void Dw7(C2WC c2wc, C79073gE c79073gE, Object obj, Object obj2) {
        ((C79183gP) c79073gE.A02).A07.remove(Long.valueOf(c2wc.A0H()));
    }

    @Override // X.C2X8
    public final void Dwh(C2WC c2wc, C79073gE c79073gE, Object obj, Object obj2) {
        C79183gP c79183gP = (C79183gP) c79073gE.A02;
        long A0H = c2wc.A0H();
        if (A0H == 0 && c79073gE.A03.contains(Long.valueOf(A0H))) {
            c79073gE.A02(A0H, false);
        }
        c79183gP.A05.remove(Long.valueOf(A0H));
    }

    public C79083gF(boolean z) {
        this.A00 = z;
    }

    public static void A02(Rect rect, C79183gP c79183gP) {
        C50882Vk c50882Vk;
        int i;
        int i2;
        if (!rect.isEmpty() && (c50882Vk = c79183gP.A02) != null) {
            ArrayList arrayList = c50882Vk.A0O;
            ArrayList arrayList2 = c50882Vk.A0N;
            int size = c50882Vk.A0W.size();
            int i3 = rect.bottom;
            int i4 = size - 1;
            int i5 = i4;
            int i6 = 0;
            while (true) {
                if (i6 <= i4) {
                    i = ((i4 - i6) / 2) + i6;
                    if (i3 > ((C79043gB) arrayList.get(i)).A04.top) {
                        i6 = i + 1;
                    } else {
                        if (i > 0) {
                            int i7 = i - 1;
                            if (i3 <= ((C79043gB) arrayList.get(i7)).A04.top) {
                                i4 = i7;
                            }
                        } else if (i == 0) {
                            break;
                        }
                        if (i3 > ((C79043gB) arrayList.get(i - 1)).A04.top) {
                            break;
                        }
                    }
                } else {
                    i = size;
                    break;
                }
            }
            c79183gP.A01 = i;
            int i8 = rect.top;
            int i9 = 0;
            while (true) {
                if (i9 <= i5) {
                    i2 = ((i5 - i9) / 2) + i9;
                    if (i8 >= ((C79043gB) arrayList2.get(i2)).A04.bottom) {
                        i9 = i2 + 1;
                    } else {
                        if (i2 <= 0) {
                            if (i2 == 0) {
                                break;
                            }
                        } else {
                            int i10 = i2 - 1;
                            if (i8 < ((C79043gB) arrayList2.get(i10)).A04.bottom) {
                                i5 = i10;
                            }
                        }
                        if (i8 >= ((C79043gB) arrayList2.get(i2 - 1)).A04.bottom) {
                            break;
                        }
                    }
                } else {
                    i2 = size;
                    break;
                }
            }
            c79183gP.A00 = i2;
        }
    }

    @Override // X.C2X7
    public final void A0E(C79073gE c79073gE) {
        c79073gE.A00();
        C79183gP c79183gP = (C79183gP) c79073gE.A02;
        c79183gP.A04.setEmpty();
        c79183gP.A06.clear();
    }

    @Override // X.C2X8
    public final void CzR(C2WC c2wc, C79073gE c79073gE, Object obj, Object obj2) {
        if (c2wc.A0E()) {
            A03(c79073gE, obj);
        }
    }

    @Override // X.C2X8
    public final void DTt(C2WC c2wc, C79073gE c79073gE, Object obj, Object obj2) {
        long A0H = c2wc.A0H();
        if (A0H == 0 && !c79073gE.A03.contains(Long.valueOf(A0H))) {
            c79073gE.A01(A0H, false);
        }
        C79183gP c79183gP = (C79183gP) c79073gE.A02;
        C50882Vk c50882Vk = c79183gP.A02;
        if (c50882Vk != null) {
            java.util.Set set = c50882Vk.A0Z;
            Long valueOf = Long.valueOf(A0H);
            if (set.contains(valueOf)) {
                c79183gP.A07.add(valueOf);
                c79183gP.A05.put(valueOf, obj);
            }
        }
    }
}
