package X;

/* renamed from: X.5Te, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C117455Te {
    public final C18590vm A00;

    public final void A00(Object obj) {
        C18590vm c18590vm = this.A00;
        long[] jArr = c18590vm.A02;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = c18590vm.A04[i4];
                            if (obj2 instanceof C18570vk) {
                                C14360o3.A0C(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                                C18570vk c18570vk = (C18570vk) obj2;
                                c18570vk.A0A(obj);
                                if (c18570vk.A01 != 0) {
                                }
                                c18590vm.A06(i4);
                            } else {
                                if (obj2 != obj) {
                                }
                                c18590vm.A06(i4);
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
    }

    public final void A01(Object obj, Object obj2) {
        C18590vm c18590vm = this.A00;
        int A05 = c18590vm.A05(obj);
        if (A05 < 0) {
            A05 ^= -1;
            c18590vm.A03[A05] = obj;
        } else {
            Object obj3 = c18590vm.A04[A05];
            if (obj3 != null) {
                if (obj3 instanceof C18570vk) {
                    ((C18570vk) obj3).A09(obj2);
                } else if (obj3 != obj2) {
                    C18570vk c18570vk = new C18570vk(6);
                    c18570vk.A09(obj3);
                    c18570vk.A09(obj2);
                    obj2 = c18570vk;
                }
                obj2 = obj3;
            }
        }
        c18590vm.A04[A05] = obj2;
    }

    public final boolean A02(Object obj, Object obj2) {
        C18590vm c18590vm = this.A00;
        Object A03 = c18590vm.A03(obj);
        boolean z = false;
        if (A03 != null) {
            if (A03 instanceof C18570vk) {
                C18570vk c18570vk = (C18570vk) A03;
                z = c18570vk.A0A(obj2);
                if (z && c18570vk.A01 == 0) {
                    c18590vm.A07(obj);
                }
            } else if (A03.equals(obj2)) {
                c18590vm.A07(obj);
                return true;
            }
        }
        return z;
    }

    public C117455Te() {
        long[] jArr = AbstractC004701m.A00;
        this.A00 = new C18590vm(6);
    }
}
