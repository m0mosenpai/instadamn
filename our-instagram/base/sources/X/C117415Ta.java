package X;

import androidx.compose.runtime.Recomposer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.5Ta, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C117415Ta implements C57Q, InterfaceC117425Tb, InterfaceC117435Tc {
    public C117455Te A00;
    public InterfaceC16620sF A01;
    public boolean A02;
    public boolean A03;
    public final C5TZ A04;
    public final C117505Tk A05;
    public final C57I A06;
    public final C117495Tj A07;
    public final C117445Td A08;
    public final C117465Tf A09;
    public final C117465Tf A0A;
    public final C117455Te A0B;
    public final C117455Te A0C;
    public final java.util.Set A0E;
    public final C18570vk A0G;
    public final C18570vk A0H;
    public final C117455Te A0I;
    public final AtomicReference A0F = new AtomicReference(null);
    public final Object A0D = new Object();

    /* JADX WARN: Type inference failed for: r0v11, types: [X.5Tj, java.lang.Object] */
    public C117415Ta(C5TZ c5tz, C57I c57i) {
        this.A06 = c57i;
        this.A04 = c5tz;
        C012404n c012404n = new C012404n(new C18570vk(6));
        this.A0E = c012404n;
        C117445Td c117445Td = new C117445Td();
        if (c57i.A0D()) {
            c117445Td.A04 = new C18750w2(6);
        }
        if (!(c57i instanceof Recomposer) && ((C117615Tw) c57i).A05) {
            c117445Td.A06 = new HashMap();
        }
        this.A08 = c117445Td;
        this.A0C = new C117455Te();
        this.A0H = new C18570vk(6);
        this.A0G = new C18570vk(6);
        this.A0B = new C117455Te();
        C117465Tf c117465Tf = new C117465Tf();
        this.A09 = c117465Tf;
        C117465Tf c117465Tf2 = new C117465Tf();
        this.A0A = c117465Tf2;
        this.A0I = new C117455Te();
        this.A00 = new C117455Te();
        this.A07 = new Object();
        C117505Tk c117505Tk = new C117505Tk(c5tz, c57i, this, c117445Td, c117465Tf, c117465Tf2, c012404n);
        if (c57i instanceof C117615Tw) {
            ((C117615Tw) c57i).A03.add(c117505Tk);
        }
        this.A05 = c117505Tk;
        this.A01 = AbstractC117625Tx.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A00() {
        boolean z;
        C18590vm c18590vm = this.A0B.A00;
        long[] jArr = c18590vm.A02;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((j & ((j ^ (-1)) << 7) & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((j & 255) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = c18590vm.A04[i4];
                            if (obj instanceof C18570vk) {
                                C14360o3.A0C(obj, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                C18570vk c18570vk = (C18570vk) obj;
                                Object[] objArr = c18570vk.A03;
                                long[] jArr2 = c18570vk.A02;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i5 = 0;
                                    while (true) {
                                        long j2 = jArr2[i5];
                                        if ((j2 & ((j2 ^ (-1)) << 7) & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i6 = 8 - (((i5 - length2) ^ (-1)) >>> 31);
                                            for (int i7 = 0; i7 < i6; i7++) {
                                                if ((j2 & 255) < 128) {
                                                    int i8 = (i5 << 3) + i7;
                                                    if (!this.A0C.A00.A04(objArr[i8])) {
                                                        c18570vk.A06(i8);
                                                    }
                                                }
                                                j2 >>= 8;
                                            }
                                            if (i6 != 8) {
                                                break;
                                            }
                                        }
                                        if (i5 == length2) {
                                            break;
                                        } else {
                                            i5++;
                                        }
                                    }
                                }
                                z = c18570vk.A01;
                            } else {
                                C14360o3.A0C(obj, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                z = this.A0C.A00.A04(obj);
                            }
                            if (!z) {
                                c18590vm.A06(i4);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        C18570vk c18570vk2 = this.A0G;
        if (c18570vk2.A01 != 0) {
            Object[] objArr2 = c18570vk2.A03;
            long[] jArr3 = c18570vk2.A02;
            int length3 = jArr3.length - 2;
            if (length3 >= 0) {
                int i9 = 0;
                while (true) {
                    long j3 = jArr3[i9];
                    if ((((j3 ^ (-1)) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - (((i9 - length3) ^ (-1)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((j3 & 255) < 128) {
                                int i12 = (i9 << 3) + i11;
                                if (((C5UU) objArr2[i12]).A03 == null) {
                                    c18570vk2.A06(i12);
                                }
                            }
                            j3 >>= 8;
                        }
                        if (i10 != 8) {
                            return;
                        }
                    }
                    if (i9 != length3) {
                        i9++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static final void A01(C117415Ta c117415Ta) {
        String str;
        AtomicReference atomicReference = c117415Ta.A0F;
        Object obj = C5UB.A00;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (!andSet.equals(obj)) {
                if (andSet instanceof java.util.Set) {
                    c117415Ta.A06((java.util.Set) andSet, true);
                    return;
                }
                if (andSet instanceof Object[]) {
                    for (java.util.Set set : (java.util.Set[]) andSet) {
                        c117415Ta.A06(set, true);
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("corrupt pendingModifications drain: ");
                sb.append(atomicReference);
                str = sb.toString();
            } else {
                str = "pending composition has not been applied";
            }
            C5UC.A04(str);
            throw C00O.createAndThrow();
        }
    }

    public static final void A02(C117415Ta c117415Ta) {
        String obj;
        AtomicReference atomicReference = c117415Ta.A0F;
        Object andSet = atomicReference.getAndSet(null);
        if (!C14360o3.A0K(andSet, C5UB.A00)) {
            if (andSet instanceof java.util.Set) {
                c117415Ta.A06((java.util.Set) andSet, false);
                return;
            }
            if (andSet instanceof Object[]) {
                for (java.util.Set set : (java.util.Set[]) andSet) {
                    c117415Ta.A06(set, false);
                }
                return;
            }
            if (andSet == null) {
                obj = "calling recordModificationsOf and applyChanges concurrently is not supported";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("corrupt pendingModifications drain: ");
                sb.append(atomicReference);
                obj = sb.toString();
            }
            C5UC.A04(obj);
            throw C00O.createAndThrow();
        }
    }

    private final void A03(C117465Tf c117465Tf) {
        C117595Tu c117595Tu;
        C117595Tu c117595Tu2;
        C5Z2 c5z2 = new C5Z2(this.A0E);
        try {
            C117485Th c117485Th = c117465Tf.A00;
            if (c117485Th.A02 != 0) {
                AbstractC09790fc.A01("Compose:applyChanges", 1854082573);
                try {
                    C5TZ c5tz = this.A04;
                    C117565Tr A01 = this.A08.A01();
                    int i = 0;
                    try {
                        c117485Th.A01(c5tz, c5z2, A01);
                        A01.A0P(true);
                        InterfaceC1128457r interfaceC1128457r = ((AnonymousClass599) ((C5TX) c5tz).A01).A0A;
                        if (interfaceC1128457r != null) {
                            interfaceC1128457r.DDZ();
                        }
                        AbstractC09790fc.A00(1166705813);
                        c5z2.A02();
                        List list = c5z2.A06;
                        if (!list.isEmpty()) {
                            AbstractC09790fc.A01("Compose:sideeffects", 1854082573);
                            try {
                                int size = list.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    ((InterfaceC16820sZ) list.get(i2)).invoke();
                                }
                                list.clear();
                                AbstractC09790fc.A00(1166705813);
                            } finally {
                                AbstractC09790fc.A00(1166705813);
                            }
                        }
                        if (this.A03) {
                            AbstractC09790fc.A01("Compose:unobserve", 1854082573);
                            this.A03 = false;
                            C18590vm c18590vm = this.A0C.A00;
                            long[] jArr = c18590vm.A02;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                while (true) {
                                    long j = jArr[i3];
                                    if ((((j ^ (-1)) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i4 = 8 - (((i3 - length) ^ (-1)) >>> 31);
                                        while (i < i4) {
                                            if ((j & 255) < 128) {
                                                int i5 = (i3 << 3) + i;
                                                Object obj = c18590vm.A04[i5];
                                                if (obj instanceof C18570vk) {
                                                    C14360o3.A0C(obj, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                                    C18570vk c18570vk = (C18570vk) obj;
                                                    Object[] objArr = c18570vk.A03;
                                                    long[] jArr2 = c18570vk.A02;
                                                    int length2 = jArr2.length - 2;
                                                    if (length2 >= 0) {
                                                        int i6 = 0;
                                                        while (true) {
                                                            long j2 = jArr2[i6];
                                                            if ((j2 & ((j2 ^ (-1)) << 7) & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i7 = 8 - (((i6 - length2) ^ (-1)) >>> 31);
                                                                for (int i8 = 0; i8 < i7; i8++) {
                                                                    if ((j2 & 255) < 128) {
                                                                        int i9 = (i6 << 3) + i8;
                                                                        C5UU c5uu = (C5UU) objArr[i9];
                                                                        if (c5uu.A05 == null || (c117595Tu2 = c5uu.A04) == null || c117595Tu2.A00 == Integer.MIN_VALUE) {
                                                                            c18570vk.A06(i9);
                                                                        }
                                                                    }
                                                                    j2 >>= 8;
                                                                }
                                                                if (i7 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i6 == length2) {
                                                                break;
                                                            } else {
                                                                i6++;
                                                            }
                                                        }
                                                    }
                                                    if (c18570vk.A01 != 0) {
                                                    }
                                                    c18590vm.A06(i5);
                                                } else {
                                                    C14360o3.A0C(obj, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                                    C5UU c5uu2 = (C5UU) obj;
                                                    if (c5uu2.A05 != null && (c117595Tu = c5uu2.A04) != null && c117595Tu.A00 != Integer.MIN_VALUE) {
                                                    }
                                                    c18590vm.A06(i5);
                                                }
                                            }
                                            j >>= 8;
                                            i++;
                                        }
                                        if (i4 != 8) {
                                            break;
                                        }
                                    }
                                    if (i3 == length) {
                                        break;
                                    }
                                    i3++;
                                    i = 0;
                                }
                            }
                            A00();
                        }
                    } catch (Throwable th) {
                        A01.A0P(false);
                        throw th;
                    }
                } catch (Throwable th2) {
                    AbstractC09790fc.A00(1166705813);
                    throw th2;
                }
            }
        } finally {
            if (this.A0A.A00.A02 == 0) {
                c5z2.A01();
            }
        }
    }

    private final void A04(Object obj) {
        Integer num;
        Integer num2;
        Object A03 = this.A0C.A00.A03(obj);
        if (A03 != null) {
            if (A03 instanceof C18570vk) {
                AbstractC004801n abstractC004801n = (AbstractC004801n) A03;
                Object[] objArr = abstractC004801n.A03;
                long[] jArr = abstractC004801n.A02;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    C5UU c5uu = (C5UU) objArr[(i << 3) + i3];
                                    InterfaceC117425Tb interfaceC117425Tb = c5uu.A05;
                                    if (interfaceC117425Tb != null) {
                                        num2 = interfaceC117425Tb.COv(c5uu, obj);
                                    } else {
                                        num2 = C05F.A00;
                                    }
                                    if (num2 == C05F.A0N) {
                                        this.A0I.A01(obj, c5uu);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                return;
                            }
                        }
                        if (i != length) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                C5UU c5uu2 = (C5UU) A03;
                InterfaceC117425Tb interfaceC117425Tb2 = c5uu2.A05;
                if (interfaceC117425Tb2 != null) {
                    num = interfaceC117425Tb2.COv(c5uu2, obj);
                } else {
                    num = C05F.A00;
                }
                if (num == C05F.A0N) {
                    this.A0I.A01(obj, c5uu2);
                }
            }
        }
    }

    private final void A05(Object obj, boolean z) {
        Integer num;
        C18570vk c18570vk;
        Integer num2;
        C18570vk c18570vk2;
        Object A03 = this.A0C.A00.A03(obj);
        if (A03 != null) {
            if (A03 instanceof C18570vk) {
                AbstractC004801n abstractC004801n = (AbstractC004801n) A03;
                Object[] objArr = abstractC004801n.A03;
                long[] jArr = abstractC004801n.A02;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    C5UU c5uu = (C5UU) objArr[(i << 3) + i3];
                                    if (!this.A0I.A02(obj, c5uu)) {
                                        InterfaceC117425Tb interfaceC117425Tb = c5uu.A05;
                                        if (interfaceC117425Tb != null) {
                                            num2 = interfaceC117425Tb.COv(c5uu, obj);
                                        } else {
                                            num2 = C05F.A00;
                                        }
                                        if (num2 != C05F.A00) {
                                            if (c5uu.A03 != null && !z) {
                                                c18570vk2 = this.A0G;
                                            } else {
                                                c18570vk2 = this.A0H;
                                            }
                                            c18570vk2.A09(c5uu);
                                        }
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                return;
                            }
                        }
                        if (i != length) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                C5UU c5uu2 = (C5UU) A03;
                if (!this.A0I.A02(obj, c5uu2)) {
                    InterfaceC117425Tb interfaceC117425Tb2 = c5uu2.A05;
                    if (interfaceC117425Tb2 != null) {
                        num = interfaceC117425Tb2.COv(c5uu2, obj);
                    } else {
                        num = C05F.A00;
                    }
                    if (num != C05F.A00) {
                        if (c5uu2.A03 != null && !z) {
                            c18570vk = this.A0G;
                        } else {
                            c18570vk = this.A0H;
                        }
                        c18570vk.A09(c5uu2);
                    }
                }
            }
        }
    }

    private final void A06(java.util.Set set, boolean z) {
        if (set instanceof C1127457f) {
            AbstractC004801n abstractC004801n = ((C1127457f) set).A00;
            Object[] objArr = abstractC004801n.A03;
            long[] jArr = abstractC004801n.A02;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((j & ((j ^ (-1)) << 7) & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((j & 255) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (obj instanceof C5UU) {
                                    C5UU c5uu = (C5UU) obj;
                                    InterfaceC117425Tb interfaceC117425Tb = c5uu.A05;
                                    if (interfaceC117425Tb != null) {
                                        interfaceC117425Tb.COv(c5uu, null);
                                    }
                                } else {
                                    A05(obj, z);
                                    Object A03 = this.A0B.A00.A03(obj);
                                    if (A03 != null) {
                                        if (A03 instanceof C18570vk) {
                                            AbstractC004801n abstractC004801n2 = (AbstractC004801n) A03;
                                            Object[] objArr2 = abstractC004801n2.A03;
                                            long[] jArr2 = abstractC004801n2.A02;
                                            int length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                int i4 = 0;
                                                while (true) {
                                                    long j2 = jArr2[i4];
                                                    if ((j2 & ((j2 ^ (-1)) << 7) & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i5 = 8 - (((i4 - length2) ^ (-1)) >>> 31);
                                                        for (int i6 = 0; i6 < i5; i6++) {
                                                            if ((j2 & 255) < 128) {
                                                                A05(objArr2[(i4 << 3) + i6], z);
                                                            }
                                                            j2 >>= 8;
                                                        }
                                                        if (i5 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i4 != length2) {
                                                        i4++;
                                                    }
                                                }
                                            }
                                        } else {
                                            A05(A03, z);
                                        }
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        } else {
            for (Object obj2 : set) {
                if (obj2 instanceof C5UU) {
                    C5UU c5uu2 = (C5UU) obj2;
                    InterfaceC117425Tb interfaceC117425Tb2 = c5uu2.A05;
                    if (interfaceC117425Tb2 != null) {
                        interfaceC117425Tb2.COv(c5uu2, null);
                    }
                } else {
                    A05(obj2, z);
                    Object A032 = this.A0B.A00.A03(obj2);
                    if (A032 != null) {
                        if (A032 instanceof C18570vk) {
                            AbstractC004801n abstractC004801n3 = (AbstractC004801n) A032;
                            Object[] objArr3 = abstractC004801n3.A03;
                            long[] jArr3 = abstractC004801n3.A02;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                int i7 = 0;
                                while (true) {
                                    long j3 = jArr3[i7];
                                    if ((((j3 ^ (-1)) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i8 = 8 - (((i7 - length3) ^ (-1)) >>> 31);
                                        for (int i9 = 0; i9 < i8; i9++) {
                                            if ((j3 & 255) < 128) {
                                                A05(objArr3[(i7 << 3) + i9], z);
                                            }
                                            j3 >>= 8;
                                        }
                                        if (i8 != 8) {
                                            break;
                                        }
                                    }
                                    if (i7 != length3) {
                                        i7++;
                                    }
                                }
                            }
                        } else {
                            A05(A032, z);
                        }
                    }
                }
            }
        }
        C18570vk c18570vk = this.A0G;
        C18570vk c18570vk2 = this.A0H;
        if (z && c18570vk.A01 != 0) {
            C18590vm c18590vm = this.A0C.A00;
            long[] jArr4 = c18590vm.A02;
            int length4 = jArr4.length - 2;
            if (length4 >= 0) {
                int i10 = 0;
                while (true) {
                    long j4 = jArr4[i10];
                    if ((((j4 ^ (-1)) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - (((i10 - length4) ^ (-1)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((j4 & 255) < 128) {
                                int i13 = (i10 << 3) + i12;
                                Object obj3 = c18590vm.A04[i13];
                                if (obj3 instanceof C18570vk) {
                                    C14360o3.A0C(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                    C18570vk c18570vk3 = (C18570vk) obj3;
                                    Object[] objArr4 = c18570vk3.A03;
                                    long[] jArr5 = c18570vk3.A02;
                                    int length5 = jArr5.length - 2;
                                    if (length5 >= 0) {
                                        int i14 = 0;
                                        while (true) {
                                            long j5 = jArr5[i14];
                                            if ((j5 & ((j5 ^ (-1)) << 7) & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i15 = 8 - (((i14 - length5) ^ (-1)) >>> 31);
                                                for (int i16 = 0; i16 < i15; i16++) {
                                                    if ((j5 & 255) < 128) {
                                                        int i17 = (i14 << 3) + i16;
                                                        Object obj4 = objArr4[i17];
                                                        if (c18570vk.A04(obj4) || c18570vk2.A04(obj4)) {
                                                            c18570vk3.A06(i17);
                                                        }
                                                    }
                                                    j5 >>= 8;
                                                }
                                                if (i15 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i14 == length5) {
                                                break;
                                            } else {
                                                i14++;
                                            }
                                        }
                                    }
                                    if (c18570vk3.A01 != 0) {
                                    }
                                    c18590vm.A06(i13);
                                } else {
                                    C14360o3.A0C(obj3, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                    if (!c18570vk.A04(obj3) && !c18570vk2.A04(obj3)) {
                                    }
                                    c18590vm.A06(i13);
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                    }
                    if (i10 == length4) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            c18570vk.A05();
            A00();
            return;
        }
        if (c18570vk2.A01 != 0) {
            C18590vm c18590vm2 = this.A0C.A00;
            long[] jArr6 = c18590vm2.A02;
            int length6 = jArr6.length - 2;
            if (length6 >= 0) {
                int i18 = 0;
                while (true) {
                    long j6 = jArr6[i18];
                    if ((((j6 ^ (-1)) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i19 = 8 - (((i18 - length6) ^ (-1)) >>> 31);
                        for (int i20 = 0; i20 < i19; i20++) {
                            if ((j6 & 255) < 128) {
                                int i21 = (i18 << 3) + i20;
                                Object obj5 = c18590vm2.A04[i21];
                                if (obj5 instanceof C18570vk) {
                                    C14360o3.A0C(obj5, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                    C18570vk c18570vk4 = (C18570vk) obj5;
                                    Object[] objArr5 = c18570vk4.A03;
                                    long[] jArr7 = c18570vk4.A02;
                                    int length7 = jArr7.length - 2;
                                    if (length7 >= 0) {
                                        int i22 = 0;
                                        while (true) {
                                            long j7 = jArr7[i22];
                                            if ((j7 & ((j7 ^ (-1)) << 7) & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i23 = 8 - (((i22 - length7) ^ (-1)) >>> 31);
                                                for (int i24 = 0; i24 < i23; i24++) {
                                                    if ((j7 & 255) < 128) {
                                                        int i25 = (i22 << 3) + i24;
                                                        if (c18570vk2.A04(objArr5[i25])) {
                                                            c18570vk4.A06(i25);
                                                        }
                                                    }
                                                    j7 >>= 8;
                                                }
                                                if (i23 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i22 == length7) {
                                                break;
                                            } else {
                                                i22++;
                                            }
                                        }
                                    }
                                    if (c18570vk4.A01 != 0) {
                                    }
                                    c18590vm2.A06(i21);
                                } else {
                                    C14360o3.A0C(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                    if (!c18570vk2.A04(obj5)) {
                                    }
                                    c18590vm2.A06(i21);
                                }
                            }
                            j6 >>= 8;
                        }
                        if (i19 != 8) {
                            break;
                        }
                    }
                    if (i18 == length6) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            A00();
            c18570vk2.A05();
        }
    }

    private final boolean A07(C5UU c5uu, Object obj) {
        C117595Tu c117595Tu;
        C117505Tk c117505Tk = this.A05;
        if (c117505Tk.A0L && (c117595Tu = c5uu.A04) != null) {
            C117555Tq c117555Tq = c117505Tk.A0B;
            if (!(!c117555Tq.A09.A07)) {
                C5UC.A03("Use active SlotWriter to determine anchor location instead");
            } else {
                int i = c117595Tu.A00;
                if (i != Integer.MIN_VALUE) {
                    if (i >= c117555Tq.A01) {
                        List list = c117505Tk.A0c;
                        int A00 = C5UC.A00(list, i);
                        C18570vk c18570vk = null;
                        if (A00 < 0) {
                            int i2 = -(A00 + 1);
                            if (!(obj instanceof InterfaceC113785Bq)) {
                                obj = null;
                            }
                            list.add(i2, new C128285qx(c5uu, obj, i));
                            return true;
                        }
                        C128285qx c128285qx = (C128285qx) list.get(A00);
                        if (obj instanceof InterfaceC113785Bq) {
                            Object obj2 = c128285qx.A00;
                            if (obj2 == null) {
                                c128285qx.A00 = obj;
                                return true;
                            }
                            if (obj2 instanceof C18570vk) {
                                ((C18570vk) obj2).A09(obj);
                                return true;
                            }
                            C18570vk c18570vk2 = AbstractC004901o.A00;
                            c18570vk = new C18570vk(2);
                            c18570vk.A03[C18570vk.A01(c18570vk, obj2)] = obj2;
                            c18570vk.A03[C18570vk.A01(c18570vk, obj)] = obj;
                        }
                        c128285qx.A00 = c18570vk;
                        return true;
                    }
                    return false;
                }
                SQP.A00("Anchor refers to a group that was removed");
            }
            throw C00O.createAndThrow();
        }
        return false;
    }

    @Override // X.C57Q
    public final void A72() {
        this.A0F.set(null);
        this.A09.A00.A00();
        this.A0A.A00.A00();
        java.util.Set set = this.A0E;
        if (!set.isEmpty()) {
            new C5Z2(set).A01();
        }
    }

    @Override // X.C57Q
    public final void AC3() {
        synchronized (this.A0D) {
            try {
                A03(this.A09);
                A02(this);
            } catch (Throwable th) {
                try {
                    java.util.Set set = this.A0E;
                    if (!set.isEmpty()) {
                        new C5Z2(set).A01();
                    }
                    throw th;
                } catch (Exception e) {
                    A72();
                    throw e;
                }
            }
        }
    }

    @Override // X.C57Q
    public final void ACA() {
        synchronized (this.A0D) {
            try {
                C117465Tf c117465Tf = this.A0A;
                if (c117465Tf.A00.A02 != 0) {
                    A03(c117465Tf);
                }
            } catch (Throwable th) {
                try {
                    java.util.Set set = this.A0E;
                    if (!set.isEmpty()) {
                        new C5Z2(set).A01();
                    }
                    throw th;
                } catch (Exception e) {
                    A72();
                    throw e;
                }
            }
        }
    }

    @Override // X.C57Q
    public final void AH7() {
        synchronized (this.A0D) {
            try {
                this.A05.A0I = null;
                java.util.Set set = this.A0E;
                if (!set.isEmpty()) {
                    new C5Z2(set).A01();
                }
            } catch (Throwable th) {
                try {
                    java.util.Set set2 = this.A0E;
                    if (!set2.isEmpty()) {
                        new C5Z2(set2).A01();
                    }
                    throw th;
                } catch (Exception e) {
                    A72();
                    throw e;
                }
            }
        }
    }

    @Override // X.InterfaceC117425Tb
    public final Integer COv(C5UU c5uu, Object obj) {
        int i = c5uu.A01;
        if ((i & 2) != 0) {
            c5uu.A01 = i | 4;
        }
        C117595Tu c117595Tu = c5uu.A04;
        if (c117595Tu != null) {
            int i2 = c117595Tu.A00;
            boolean z = false;
            if (i2 != Integer.MIN_VALUE) {
                z = true;
            }
            if (z) {
                C117445Td c117445Td = this.A08;
                boolean z2 = true;
                ArrayList arrayList = c117445Td.A05;
                int A01 = AbstractC117585Tt.A01(arrayList, i2, c117445Td.A00);
                if (A01 < 0 || !C14360o3.A0K(arrayList.get(A01), c117595Tu)) {
                    z2 = false;
                }
                if (!z2) {
                    synchronized (this.A0D) {
                    }
                } else if (c5uu.A06 != null) {
                    synchronized (this.A0D) {
                        if (A07(c5uu, obj)) {
                            return C05F.A0N;
                        }
                        if (obj == null) {
                            this.A00.A00.A09(c5uu, C128255qu.A00);
                        } else if (!(obj instanceof InterfaceC113785Bq)) {
                            this.A00.A00.A09(c5uu, C128255qu.A00);
                        } else {
                            Object A03 = this.A00.A00.A03(c5uu);
                            if (A03 != null) {
                                if (A03 instanceof C18570vk) {
                                    C18570vk c18570vk = (C18570vk) A03;
                                    Object[] objArr = c18570vk.A03;
                                    long[] jArr = c18570vk.A02;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i3 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i3];
                                            if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i4 = 8 - (((i3 - length) ^ (-1)) >>> 31);
                                                for (int i5 = 0; i5 < i4; i5++) {
                                                    if ((j & 255) < 128 && objArr[(i3 << 3) + i5] == C128255qu.A00) {
                                                        break loop0;
                                                    }
                                                    j >>= 8;
                                                }
                                                if (i4 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i3 == length) {
                                                break;
                                            }
                                            i3++;
                                        }
                                    }
                                } else if (A03 == C128255qu.A00) {
                                }
                            }
                            this.A00.A01(c5uu, obj);
                        }
                        this.A06.A09(this);
                        if (this.A05.A0L) {
                            return C05F.A0C;
                        }
                        return C05F.A01;
                    }
                }
            }
        }
        return C05F.A00;
    }

    @Override // X.C57Q, X.InterfaceC117425Tb
    public final void ECa(Object obj) {
        C5UU A0O;
        C117505Tk c117505Tk = this.A05;
        if (c117505Tk.A00 <= 0 && (A0O = c117505Tk.A0O()) != null) {
            int i = A0O.A01 | 1;
            A0O.A01 = i;
            if ((i & 32) == 0) {
                C18630vq c18630vq = A0O.A02;
                if (c18630vq == null) {
                    c18630vq = new C18630vq(6);
                    A0O.A02 = c18630vq;
                }
                int i2 = A0O.A00;
                int i3 = -1;
                int A01 = C18630vq.A01(c18630vq, obj);
                if (A01 < 0) {
                    A01 ^= -1;
                } else {
                    i3 = c18630vq.A02[A01];
                }
                c18630vq.A04[A01] = obj;
                c18630vq.A02[A01] = i2;
                if (i3 == A0O.A00) {
                    return;
                }
            }
            if (obj instanceof AbstractC74923Yi) {
                ((AbstractC74923Yi) obj).A01(1);
            }
            this.A0C.A01(obj, A0O);
            if (!(obj instanceof InterfaceC113785Bq)) {
                return;
            }
            InterfaceC113785Bq interfaceC113785Bq = (InterfaceC113785Bq) obj;
            C113795Br Aul = interfaceC113785Bq.Aul();
            C117455Te c117455Te = this.A0B;
            c117455Te.A00(obj);
            AbstractC004001f abstractC004001f = Aul.A03;
            Object[] objArr = abstractC004001f.A04;
            long[] jArr = abstractC004001f.A03;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j = jArr[i4];
                    if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - (((i4 - length) ^ (-1)) >>> 31);
                        for (int i6 = 0; i6 < i5; i6++) {
                            if ((j & 255) < 128) {
                                InterfaceC74933Yj interfaceC74933Yj = (InterfaceC74933Yj) objArr[(i4 << 3) + i6];
                                if (interfaceC74933Yj instanceof AbstractC74923Yi) {
                                    ((AbstractC74923Yi) interfaceC74933Yj).A01(1);
                                }
                                c117455Te.A01(interfaceC74933Yj, obj);
                            }
                            j >>= 8;
                        }
                        if (i5 != 8) {
                            break;
                        }
                    }
                    if (i4 == length) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            Object obj2 = Aul.A04;
            C18590vm c18590vm = A0O.A03;
            if (c18590vm == null) {
                c18590vm = new C18590vm(6);
                A0O.A03 = c18590vm;
            }
            c18590vm.A09(interfaceC113785Bq, obj2);
        }
    }

    @Override // X.C57Q
    public final void ECe(Object obj) {
        synchronized (this.A0D) {
            A04(obj);
            Object A03 = this.A0B.A00.A03(obj);
            if (A03 != null) {
                if (A03 instanceof C18570vk) {
                    C18570vk c18570vk = (C18570vk) A03;
                    Object[] objArr = c18570vk.A03;
                    long[] jArr = c18570vk.A02;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        A04((InterfaceC113785Bq) objArr[(i << 3) + i3]);
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                            }
                            if (i == length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                } else {
                    A04((InterfaceC113785Bq) A03);
                }
            }
        }
    }

    @Override // X.C57R
    public final void ES1(InterfaceC16620sF interfaceC16620sF) {
        if (!(!this.A02)) {
            SQP.A01("The composition is disposed");
            throw C00O.createAndThrow();
        }
        this.A01 = interfaceC16620sF;
        this.A06.A0C(this, interfaceC16620sF);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if ((!r9.A0E.isEmpty()) != false) goto L17;
     */
    @Override // X.C57R
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispose() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117415Ta.dispose():void");
    }
}
