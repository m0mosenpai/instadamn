package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.5Bp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C113775Bp extends AbstractC74923Yi implements InterfaceC113785Bq {
    public C113795Br A00 = new C113795Br();
    public final InterfaceC74893Ye A01;
    public final InterfaceC16820sZ A02;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0175: IGET (r2 I:int) = (r9 I:X.57S) (LINE:373) X.57S.A00 int, block:B:97:0x0175 */
    /* JADX WARN: Type inference failed for: r12v4, types: [X.5U4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [X.5U4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.57S] */
    public static final C113795Br A00(C113795Br c113795Br, C113775Bp c113775Bp, Snapshot snapshot, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        ?? r9;
        InterfaceC74893Ye interfaceC74893Ye;
        C113795Br c113795Br2 = c113795Br;
        int i = 0;
        try {
            if (c113795Br2.A03(c113775Bp, snapshot)) {
                if (z) {
                    C57S A00 = C5U3.A00();
                    int i2 = A00.A00;
                    if (i2 > 0) {
                        Object[] objArr = A00.A02;
                        int i3 = 0;
                        do {
                            ((InterfaceC117545Tp) objArr[i3]).Eme(c113775Bp);
                            i3++;
                        } while (i3 < i2);
                    }
                    AbstractC004001f abstractC004001f = c113795Br2.A03;
                    C75033Yt c75033Yt = C5U3.A00;
                    C5U4 c5u4 = (C5U4) c75033Yt.A00();
                    C5U4 c5u42 = c5u4;
                    if (c5u4 == null) {
                        ?? obj = new Object();
                        obj.A00 = 0;
                        c75033Yt.A01(obj);
                        c5u42 = obj;
                    }
                    int i4 = c5u42.A00;
                    Object[] objArr2 = abstractC004001f.A04;
                    int[] iArr = abstractC004001f.A02;
                    long[] jArr = abstractC004001f.A03;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((j & ((j ^ (-1)) << 7) & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8 - (((i5 - length) ^ (-1)) >>> 31);
                                for (int i7 = 0; i7 < i6; i7++) {
                                    if ((j & 255) < 128) {
                                        int i8 = (i5 << 3) + i7;
                                        InterfaceC74933Yj interfaceC74933Yj = (InterfaceC74933Yj) objArr2[i8];
                                        c5u42.A00 = iArr[i8] + i4;
                                        InterfaceC16660sJ A03 = snapshot.A03();
                                        if (A03 != null) {
                                            A03.invoke(interfaceC74933Yj);
                                        }
                                    }
                                    j >>= 8;
                                }
                                if (i6 != 8) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    c5u42.A00 = i4;
                    int i9 = A00.A00;
                    if (i9 > 0) {
                        Object[] objArr3 = A00.A02;
                        int i10 = 0;
                        do {
                            ((InterfaceC117545Tp) objArr3[i10]).AQD(c113775Bp);
                            i10++;
                        } while (i10 < i9);
                    }
                }
            } else {
                C18630vq c18630vq = new C18630vq(6);
                C75033Yt c75033Yt2 = C5U3.A00;
                C5U4 c5u43 = (C5U4) c75033Yt2.A00();
                C5U4 c5u44 = c5u43;
                if (c5u43 == null) {
                    ?? obj2 = new Object();
                    obj2.A00 = 0;
                    c75033Yt2.A01(obj2);
                    c5u44 = obj2;
                }
                int i11 = c5u44.A00;
                C57S A002 = C5U3.A00();
                int i12 = A002.A00;
                if (i12 > 0) {
                    Object[] objArr4 = A002.A02;
                    int i13 = 0;
                    do {
                        ((InterfaceC117545Tp) objArr4[i13]).Eme(c113775Bp);
                        i13++;
                    } while (i13 < i12);
                }
                c5u44.A00 = i11 + 1;
                Object A04 = C3Z5.A04(interfaceC16820sZ, new C9FT(i11, 0, c113775Bp, c5u44, c18630vq));
                c5u44.A00 = i11;
                int i14 = A002.A00;
                if (i14 > 0) {
                    Object[] objArr5 = A002.A02;
                    int i15 = 0;
                    do {
                        ((InterfaceC117545Tp) objArr5[i15]).AQD(c113775Bp);
                        i15++;
                    } while (i15 < i14);
                }
                Object obj3 = AbstractC75013Yr.A07;
                synchronized (obj3) {
                    Snapshot A003 = AbstractC75013Yr.A00();
                    Object obj4 = c113795Br2.A04;
                    if (obj4 != C113795Br.A05 && (interfaceC74893Ye = c113775Bp.A01) != null && interfaceC74893Ye.AT1(A04, obj4)) {
                        c113795Br2.A03 = c18630vq;
                        c113795Br2.A00 = c113795Br2.A02(c113775Bp, A003);
                    } else {
                        C113795Br c113795Br3 = c113775Bp.A00;
                        AbstractC75003Yq A06 = AbstractC75013Yr.A06(c113775Bp, c113795Br3);
                        A06.A01(c113795Br3);
                        A06.A00 = A003.A0F();
                        c113795Br2 = (C113795Br) A06;
                        c113795Br2.A03 = c18630vq;
                        c113795Br2.A00 = c113795Br2.A02(c113775Bp, A003);
                        c113795Br2.A04 = A04;
                    }
                }
                C5U4 c5u45 = (C5U4) c75033Yt2.A00();
                if (c5u45 != null && c5u45.A00 == 0) {
                    AbstractC75013Yr.A00().A06();
                    synchronized (obj3) {
                        Snapshot A004 = AbstractC75013Yr.A00();
                        c113795Br2.A01 = A004.A0F();
                        c113795Br2.A02 = A004.A01();
                    }
                    return c113795Br2;
                }
            }
            return c113795Br2;
        } catch (Throwable th) {
            int i16 = r9.A00;
            if (i16 > 0) {
                Object[] objArr6 = r9.A02;
                do {
                    ((InterfaceC117545Tp) objArr6[i]).AQD(c113775Bp);
                    i++;
                } while (i < i16);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC74933Yj
    public final AbstractC75003Yq B6j() {
        return this.A00;
    }

    @Override // X.InterfaceC74933Yj
    public final void E5y(AbstractC75003Yq abstractC75003Yq) {
        C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.A00 = (C113795Br) abstractC75003Yq;
    }

    public final String toString() {
        String str;
        AbstractC75013Yr.A08(this.A00);
        C113795Br c113795Br = (C113795Br) AbstractC75013Yr.A08(this.A00);
        if (c113795Br.A03(this, AbstractC75013Yr.A00())) {
            str = String.valueOf(c113795Br.A04);
        } else {
            str = "<Not calculated>";
        }
        return AnonymousClass001.A07(hashCode(), "DerivedState(value=", str, ")@");
    }

    public C113775Bp(InterfaceC74893Ye interfaceC74893Ye, InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = interfaceC16820sZ;
        this.A01 = interfaceC74893Ye;
    }

    @Override // X.InterfaceC113785Bq
    public final C113795Br Aul() {
        Snapshot A00 = AbstractC75013Yr.A00();
        return A00((C113795Br) AbstractC75013Yr.A04(A00, this.A00), this, A00, this.A02, false);
    }

    @Override // X.InterfaceC74963Ym
    public final Object getValue() {
        InterfaceC16660sJ A03 = AbstractC75013Yr.A00().A03();
        if (A03 != null) {
            A03.invoke(this);
        }
        Snapshot A00 = AbstractC75013Yr.A00();
        return A00((C113795Br) AbstractC75013Yr.A04(A00, this.A00), this, A00, this.A02, true).A04;
    }
}
