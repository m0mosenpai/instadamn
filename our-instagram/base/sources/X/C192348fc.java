package X;

import java.util.Arrays;

/* renamed from: X.8fc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192348fc extends C3TV implements C3R9 {
    public static final C192348fc A00 = new C192348fc();

    @Override // X.C3TV
    public final /* bridge */ /* synthetic */ Object A08() {
        return new long[0];
    }

    public C192348fc() {
        super(C3RJ.A00);
    }

    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ int A01(Object obj) {
        long[] jArr = (long[]) obj;
        C14360o3.A0B(jArr, 0);
        return jArr.length;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.BAt, java.lang.Object] */
    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        long[] jArr = (long[]) obj;
        C14360o3.A0B(jArr, 0);
        ?? obj2 = new Object();
        obj2.A01 = jArr;
        int length = jArr.length;
        obj2.A00 = length;
        if (length < 10) {
            int i = length * 2;
            int i2 = 10;
            if (10 < i) {
                i2 = i;
            }
            long[] copyOf = Arrays.copyOf(jArr, i2);
            C14360o3.A07(copyOf);
            obj2.A01 = copyOf;
        }
        return obj2;
    }

    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ void A06(Object obj, C3T8 c3t8, int i, boolean z) {
        C25149BAt c25149BAt = (C25149BAt) obj;
        C14360o3.A0B(c3t8, 0);
        C14360o3.A0B(c25149BAt, 2);
        long AOC = c3t8.AOC(((C3TV) this).A00, i);
        int A002 = c25149BAt.A00() + 1;
        long[] jArr = c25149BAt.A01;
        int length = jArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            jArr = Arrays.copyOf(jArr, A002);
            C14360o3.A07(jArr);
            c25149BAt.A01 = jArr;
        }
        int i3 = c25149BAt.A00;
        c25149BAt.A00 = i3 + 1;
        jArr[i3] = AOC;
    }

    @Override // X.C3TV
    public final /* bridge */ /* synthetic */ void A09(Object obj, C4D8 c4d8, int i) {
        long[] jArr = (long[]) obj;
        C14360o3.A0B(c4d8, 0);
        C14360o3.A0B(jArr, 1);
        for (int i2 = 0; i2 < i; i2++) {
            c4d8.ASE(((C3TV) this).A00, i2, jArr[i2]);
        }
    }
}
