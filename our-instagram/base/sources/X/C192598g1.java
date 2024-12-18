package X;

import java.util.Arrays;

/* renamed from: X.8g1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192598g1 extends C3TV implements C3R9 {
    public static final C192598g1 A00 = new C192598g1();

    @Override // X.C3TV
    public final /* bridge */ /* synthetic */ Object A08() {
        return new C192588g0(new byte[0]);
    }

    public C192598g1() {
        super(C192578fz.A01);
    }

    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ int A01(Object obj) {
        return ((C192588g0) obj).A00.length;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.BAv] */
    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        byte[] bArr = ((C192588g0) obj).A00;
        ?? obj2 = new Object();
        obj2.A01 = bArr;
        int length = bArr.length;
        obj2.A00 = length;
        if (length < 10) {
            int i = length * 2;
            int i2 = 10;
            if (10 < i) {
                i2 = i;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i2);
            C14360o3.A07(copyOf);
            obj2.A01 = copyOf;
        }
        return obj2;
    }

    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ void A06(Object obj, C3T8 c3t8, int i, boolean z) {
        C25151BAv c25151BAv = (C25151BAv) obj;
        C14360o3.A0B(c3t8, 0);
        C14360o3.A0B(c25151BAv, 2);
        byte ANt = c3t8.AO7(((C3TV) this).A00, i).ANt();
        int A002 = c25151BAv.A00() + 1;
        byte[] bArr = c25151BAv.A01;
        int length = bArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            bArr = Arrays.copyOf(bArr, A002);
            C14360o3.A07(bArr);
            c25151BAv.A01 = bArr;
        }
        int i3 = c25151BAv.A00;
        c25151BAv.A00 = i3 + 1;
        bArr[i3] = ANt;
    }

    @Override // X.C3TV
    public final /* bridge */ /* synthetic */ void A09(Object obj, C4D8 c4d8, int i) {
        byte[] bArr = ((C192588g0) obj).A00;
        C14360o3.A0B(c4d8, 0);
        for (int i2 = 0; i2 < i; i2++) {
            c4d8.ASA(((C3TV) this).A00, i2).AS3(bArr[i2]);
        }
    }
}
