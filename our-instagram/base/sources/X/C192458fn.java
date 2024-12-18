package X;

import java.util.Arrays;

/* renamed from: X.8fn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192458fn extends C3TV implements C3R9 {
    public static final C192458fn A00 = new C192458fn();

    @Override // X.C3TV
    public final /* bridge */ /* synthetic */ Object A08() {
        return new C192448fm(new int[0]);
    }

    public C192458fn() {
        super(C192438fl.A01);
    }

    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ int A01(Object obj) {
        return ((C192448fm) obj).A00.length;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.BAw] */
    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        int[] iArr = ((C192448fm) obj).A00;
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
        C25152BAw c25152BAw = (C25152BAw) obj;
        C14360o3.A0B(c3t8, 0);
        C14360o3.A0B(c25152BAw, 2);
        int AO8 = c3t8.AO7(((C3TV) this).A00, i).AO8();
        int A002 = c25152BAw.A00() + 1;
        int[] iArr = c25152BAw.A01;
        int length = iArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            iArr = Arrays.copyOf(iArr, A002);
            C14360o3.A07(iArr);
            c25152BAw.A01 = iArr;
        }
        int i3 = c25152BAw.A00;
        c25152BAw.A00 = i3 + 1;
        iArr[i3] = AO8;
    }

    @Override // X.C3TV
    public final /* bridge */ /* synthetic */ void A09(Object obj, C4D8 c4d8, int i) {
        int[] iArr = ((C192448fm) obj).A00;
        C14360o3.A0B(c4d8, 0);
        for (int i2 = 0; i2 < i; i2++) {
            c4d8.ASA(((C3TV) this).A00, i2).ASB(iArr[i2]);
        }
    }
}
