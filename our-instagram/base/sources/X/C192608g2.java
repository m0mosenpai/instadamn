package X;

import java.util.Arrays;

/* renamed from: X.8g2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192608g2 extends C3TV implements C3R9 {
    public static final C192608g2 A00 = new C192608g2();

    @Override // X.C3TV
    public final /* bridge */ /* synthetic */ Object A08() {
        return new boolean[0];
    }

    public C192608g2() {
        super(C3SL.A00);
    }

    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ int A01(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        C14360o3.A0B(zArr, 0);
        return zArr.length;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.BAn, java.lang.Object] */
    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        C14360o3.A0B(zArr, 0);
        ?? obj2 = new Object();
        obj2.A01 = zArr;
        int length = zArr.length;
        obj2.A00 = length;
        if (length < 10) {
            int i = length * 2;
            int i2 = 10;
            if (10 < i) {
                i2 = i;
            }
            boolean[] copyOf = Arrays.copyOf(zArr, i2);
            C14360o3.A07(copyOf);
            obj2.A01 = copyOf;
        }
        return obj2;
    }

    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ void A06(Object obj, C3T8 c3t8, int i, boolean z) {
        C25143BAn c25143BAn = (C25143BAn) obj;
        C14360o3.A0B(c3t8, 0);
        C14360o3.A0B(c25143BAn, 2);
        boolean ANs = c3t8.ANs(((C3TV) this).A00, i);
        int A002 = c25143BAn.A00() + 1;
        boolean[] zArr = c25143BAn.A01;
        int length = zArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            zArr = Arrays.copyOf(zArr, A002);
            C14360o3.A07(zArr);
            c25143BAn.A01 = zArr;
        }
        int i3 = c25143BAn.A00;
        c25143BAn.A00 = i3 + 1;
        zArr[i3] = ANs;
    }

    @Override // X.C3TV
    public final /* bridge */ /* synthetic */ void A09(Object obj, C4D8 c4d8, int i) {
        boolean[] zArr = (boolean[]) obj;
        C14360o3.A0B(c4d8, 0);
        C14360o3.A0B(zArr, 1);
        for (int i2 = 0; i2 < i; i2++) {
            c4d8.AS2(((C3TV) this).A00, i2, zArr[i2]);
        }
    }
}
