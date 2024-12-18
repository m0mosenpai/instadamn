package X;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: X.04n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C012404n<E> extends AbstractC004801n<E>.SetWrapper implements java.util.Set<E>, InterfaceC019007k {
    public final /* synthetic */ C18570vk A00;

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        return this.A00.A08(collection);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (((r15 & ((r15 ^ (-1)) << 6)) & (-9187201950435737472L)) != 0) goto L31;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection r21) {
        /*
            r20 = this;
            r0 = 0
            r1 = r21
            X.C14360o3.A0B(r1, r0)
            r0 = r20
            X.0vk r8 = r0.A00
            int r7 = r8.A01
            java.util.Iterator r19 = r1.iterator()
        L10:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r6 = r19.next()
            if (r6 == 0) goto L94
            int r1 = r6.hashCode()
        L20:
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r5 = r1 & 127(0x7f, float:1.78E-43)
            int r4 = r8.A00
            int r18 = r1 >>> 7
            r18 = r18 & r4
            r17 = 0
        L31:
            long[] r3 = r8.A02
            int r2 = r18 >> 3
            r0 = r18 & 7
            int r1 = r0 << 3
            r9 = r3[r2]
            long r9 = r9 >>> r1
            int r0 = r2 + 1
            r15 = r3[r0]
            int r0 = 64 - r1
            long r15 = r15 << r0
            long r2 = (long) r1
            long r0 = -r2
            r2 = 63
            long r0 = r0 >> r2
            long r15 = r15 & r0
            long r15 = r15 | r9
            long r0 = (long) r5
            r9 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r0 = r0 * r9
            long r0 = r0 ^ r15
            long r2 = r0 - r9
            r13 = -1
            long r0 = r0 ^ r13
            long r0 = r0 & r2
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r11
        L5e:
            r9 = 0
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 == 0) goto L83
            int r2 = java.lang.Long.numberOfTrailingZeros(r0)
            int r3 = r2 >> 3
            int r3 = r3 + r18
            r3 = r3 & r4
            java.lang.Object[] r2 = r8.A03
            r2 = r2[r3]
            boolean r2 = X.C14360o3.A0K(r2, r6)
            if (r2 == 0) goto L7d
            if (r3 < 0) goto L10
            r8.A06(r3)
            goto L10
        L7d:
            r9 = 1
            long r2 = r0 - r9
            long r0 = r0 & r2
            goto L5e
        L83:
            long r1 = r15 ^ r13
            r0 = 6
            long r1 = r1 << r0
            long r15 = r15 & r1
            long r15 = r15 & r11
            int r0 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r0 != 0) goto L10
            int r17 = r17 + 8
            int r18 = r18 + r17
            r18 = r18 & r4
            goto L31
        L94:
            r1 = 0
            goto L20
        L96:
            int r1 = r8.A01
            r0 = 0
            if (r7 == r1) goto L9c
            r0 = 1
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C012404n.removeAll(java.util.Collection):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        C18570vk c18570vk = this.A00;
        long[] jArr = c18570vk.A02;
        int length = jArr.length - 2;
        boolean z = false;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (!collection.contains(c18570vk.A03[i4])) {
                                c18570vk.A06(i4);
                                z = true;
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
                }
                i++;
            }
        }
        return z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C012404n(C18570vk c18570vk) {
        super(c18570vk);
        this.A00 = c18570vk;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.A00.A09(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.A00.A05();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C12570l1(this.A00);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.A00.A0A(obj);
    }
}
