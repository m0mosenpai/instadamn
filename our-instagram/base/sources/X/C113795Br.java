package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.5Br, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C113795Br extends AbstractC75003Yq {
    public static final Object A05 = new Object();
    public int A00;
    public int A01;
    public int A02;
    public AbstractC004001f A03;
    public Object A04;

    @Override // X.AbstractC75003Yq
    public final AbstractC75003Yq A00() {
        return new C113795Br();
    }

    @Override // X.AbstractC75003Yq
    public final void A01(AbstractC75003Yq abstractC75003Yq) {
        C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        C113795Br c113795Br = (C113795Br) abstractC75003Yq;
        this.A03 = c113795Br.A03;
        this.A04 = c113795Br.A04;
        this.A00 = c113795Br.A00;
    }

    public final int A02(InterfaceC113785Bq interfaceC113785Bq, Snapshot snapshot) {
        AbstractC004001f abstractC004001f;
        AbstractC75003Yq A04;
        synchronized (AbstractC75013Yr.A07) {
            abstractC004001f = this.A03;
        }
        boolean z = false;
        if (abstractC004001f.A01 != 0) {
            z = true;
        }
        int i = 7;
        if (z) {
            C57S A00 = C5U3.A00();
            int i2 = A00.A00;
            if (i2 > 0) {
                Object[] objArr = A00.A02;
                int i3 = 0;
                do {
                    ((InterfaceC117545Tp) objArr[i3]).Eme(interfaceC113785Bq);
                    i3++;
                } while (i3 < i2);
            }
            try {
                Object[] objArr2 = abstractC004001f.A04;
                int[] iArr = abstractC004001f.A02;
                long[] jArr = abstractC004001f.A03;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    int i5 = 7;
                    while (true) {
                        long j = jArr[i4];
                        if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - (((i4 - length) ^ (-1)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j & 255) < 128) {
                                    int i8 = (i4 << 3) + i7;
                                    InterfaceC74933Yj interfaceC74933Yj = (InterfaceC74933Yj) objArr2[i8];
                                    if (iArr[i8] == 1) {
                                        if (interfaceC74933Yj instanceof C113775Bp) {
                                            C113775Bp c113775Bp = (C113775Bp) interfaceC74933Yj;
                                            A04 = C113775Bp.A00((C113795Br) AbstractC75013Yr.A04(snapshot, c113775Bp.A00), c113775Bp, snapshot, c113775Bp.A02, false);
                                        } else {
                                            A04 = AbstractC75013Yr.A04(snapshot, interfaceC74933Yj.B6j());
                                        }
                                        i5 = (((i5 * 31) + System.identityHashCode(A04)) * 31) + A04.A00;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                    i = i5;
                }
                int i9 = A00.A00;
                if (i9 > 0) {
                    Object[] objArr3 = A00.A02;
                    int i10 = 0;
                    do {
                        ((InterfaceC117545Tp) objArr3[i10]).AQD(interfaceC113785Bq);
                        i10++;
                    } while (i10 < i9);
                }
            } catch (Throwable th) {
                int i11 = A00.A00;
                if (i11 > 0) {
                    Object[] objArr4 = A00.A02;
                    int i12 = 0;
                    do {
                        ((InterfaceC117545Tp) objArr4[i12]).AQD(interfaceC113785Bq);
                        i12++;
                    } while (i12 < i11);
                }
                throw th;
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r5.A02 != r7.A01()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03(X.InterfaceC113785Bq r6, androidx.compose.runtime.snapshots.Snapshot r7) {
        /*
            r5 = this;
            java.lang.Object r4 = X.AbstractC75013Yr.A07
            monitor-enter(r4)
            int r1 = r5.A01     // Catch: java.lang.Throwable -> L39
            int r0 = r7.A0F()     // Catch: java.lang.Throwable -> L39
            r3 = 0
            if (r1 != r0) goto L15
            int r1 = r5.A02     // Catch: java.lang.Throwable -> L39
            int r0 = r7.A01()     // Catch: java.lang.Throwable -> L39
            r2 = 0
            if (r1 == r0) goto L16
        L15:
            r2 = 1
        L16:
            monitor-exit(r4)
            java.lang.Object r1 = r5.A04
            java.lang.Object r0 = X.C113795Br.A05
            if (r1 == r0) goto L38
            if (r2 == 0) goto L27
            int r1 = r5.A00
            int r0 = r5.A02(r6, r7)
            if (r1 != r0) goto L38
        L27:
            r3 = 1
            if (r2 == 0) goto L38
            monitor-enter(r4)
            int r0 = r7.A0F()     // Catch: java.lang.Throwable -> L39
            r5.A01 = r0     // Catch: java.lang.Throwable -> L39
            int r0 = r7.A01()     // Catch: java.lang.Throwable -> L39
            r5.A02 = r0     // Catch: java.lang.Throwable -> L39
            monitor-exit(r4)
        L38:
            return r3
        L39:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113795Br.A03(X.5Bq, androidx.compose.runtime.snapshots.Snapshot):boolean");
    }

    public C113795Br() {
        C18630vq c18630vq = AbstractC004101g.A00;
        C14360o3.A0C(c18630vq, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.A03 = c18630vq;
        this.A04 = A05;
    }
}
