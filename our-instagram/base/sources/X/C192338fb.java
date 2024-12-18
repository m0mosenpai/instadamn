package X;

import java.util.Arrays;

/* renamed from: X.8fb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192338fb extends C3TV implements C3R9 {
    public static final C192338fb A00 = new C192338fb();

    @Override // X.C3TV
    public final /* bridge */ /* synthetic */ Object A08() {
        return new double[0];
    }

    public C192338fb() {
        super(C3RQ.A00);
    }

    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ int A01(Object obj) {
        double[] dArr = (double[]) obj;
        C14360o3.A0B(dArr, 0);
        return dArr.length;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.BAq, java.lang.Object] */
    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        double[] dArr = (double[]) obj;
        C14360o3.A0B(dArr, 0);
        ?? obj2 = new Object();
        obj2.A01 = dArr;
        int length = dArr.length;
        obj2.A00 = length;
        if (length < 10) {
            int i = length * 2;
            int i2 = 10;
            if (10 < i) {
                i2 = i;
            }
            double[] copyOf = Arrays.copyOf(dArr, i2);
            C14360o3.A07(copyOf);
            obj2.A01 = copyOf;
        }
        return obj2;
    }

    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ void A06(Object obj, C3T8 c3t8, int i, boolean z) {
        C25146BAq c25146BAq = (C25146BAq) obj;
        C14360o3.A0B(c3t8, 0);
        C14360o3.A0B(c25146BAq, 2);
        double ANy = c3t8.ANy(((C3TV) this).A00, i);
        int A002 = c25146BAq.A00() + 1;
        double[] dArr = c25146BAq.A01;
        int length = dArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            dArr = Arrays.copyOf(dArr, A002);
            C14360o3.A07(dArr);
            c25146BAq.A01 = dArr;
        }
        int i3 = c25146BAq.A00;
        c25146BAq.A00 = i3 + 1;
        dArr[i3] = ANy;
    }

    @Override // X.C3TV
    public final /* bridge */ /* synthetic */ void A09(Object obj, C4D8 c4d8, int i) {
        double[] dArr = (double[]) obj;
        C14360o3.A0B(c4d8, 0);
        C14360o3.A0B(dArr, 1);
        for (int i2 = 0; i2 < i; i2++) {
            c4d8.AS6(((C3TV) this).A00, dArr[i2], i2);
        }
    }
}
