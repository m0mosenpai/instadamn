package X;

import java.util.Arrays;

/* renamed from: X.8fj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192418fj extends C3TV implements C3R9 {
    public static final C192418fj A00 = new C192418fj();

    @Override // X.C3TV
    public final /* bridge */ /* synthetic */ Object A08() {
        return new int[0];
    }

    public C192418fj() {
        super(C192398fh.A00);
    }

    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ int A01(Object obj) {
        int[] iArr = (int[]) obj;
        C14360o3.A0B(iArr, 0);
        return iArr.length;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.BAs, java.lang.Object] */
    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        int[] iArr = (int[]) obj;
        C14360o3.A0B(iArr, 0);
        ?? obj2 = new Object();
        obj2.A01 = iArr;
        int length = iArr.length;
        obj2.A00 = length;
        if (length < 10) {
            int i = length * 2;
            int i2 = 10;
            if (10 < i) {
                i2 = i;
            }
            int[] copyOf = Arrays.copyOf(iArr, i2);
            C14360o3.A07(copyOf);
            obj2.A01 = copyOf;
        }
        return obj2;
    }

    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ void A06(Object obj, C3T8 c3t8, int i, boolean z) {
        C25148BAs c25148BAs = (C25148BAs) obj;
        C14360o3.A0B(c3t8, 0);
        C14360o3.A0B(c25148BAs, 2);
        int AO9 = c3t8.AO9(((C3TV) this).A00, i);
        int A002 = c25148BAs.A00() + 1;
        int[] iArr = c25148BAs.A01;
        int length = iArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            iArr = Arrays.copyOf(iArr, A002);
            C14360o3.A07(iArr);
            c25148BAs.A01 = iArr;
        }
        int i3 = c25148BAs.A00;
        c25148BAs.A00 = i3 + 1;
        iArr[i3] = AO9;
    }

    @Override // X.C3TV
    public final /* bridge */ /* synthetic */ void A09(Object obj, C4D8 c4d8, int i) {
        int[] iArr = (int[]) obj;
        C14360o3.A0B(c4d8, 0);
        C14360o3.A0B(iArr, 1);
        for (int i2 = 0; i2 < i; i2++) {
            c4d8.ASC(((C3TV) this).A00, i2, iArr[i2]);
        }
    }
}
