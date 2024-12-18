package X;

import java.util.Arrays;

/* renamed from: X.8fu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192528fu extends C3TV implements C3R9 {
    public static final C192528fu A00 = new C192528fu();

    @Override // X.C3TV
    public final /* bridge */ /* synthetic */ Object A08() {
        return new C192518ft(new short[0]);
    }

    public C192528fu() {
        super(C192508fs.A01);
    }

    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ int A01(Object obj) {
        return ((C192518ft) obj).A00.length;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.BAy, java.lang.Object] */
    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        short[] sArr = ((C192518ft) obj).A00;
        ?? obj2 = new Object();
        obj2.A01 = sArr;
        int length = sArr.length;
        obj2.A00 = length;
        if (length < 10) {
            int i = length * 2;
            int i2 = 10;
            if (10 < i) {
                i2 = i;
            }
            short[] copyOf = Arrays.copyOf(sArr, i2);
            C14360o3.A07(copyOf);
            obj2.A01 = copyOf;
        }
        return obj2;
    }

    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ void A06(Object obj, C3T8 c3t8, int i, boolean z) {
        C25154BAy c25154BAy = (C25154BAy) obj;
        C14360o3.A0B(c3t8, 0);
        C14360o3.A0B(c25154BAy, 2);
        short AOH = c3t8.AO7(((C3TV) this).A00, i).AOH();
        int A002 = c25154BAy.A00() + 1;
        short[] sArr = c25154BAy.A01;
        int length = sArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            sArr = Arrays.copyOf(sArr, A002);
            C14360o3.A07(sArr);
            c25154BAy.A01 = sArr;
        }
        int i3 = c25154BAy.A00;
        c25154BAy.A00 = i3 + 1;
        sArr[i3] = AOH;
    }

    @Override // X.C3TV
    public final /* bridge */ /* synthetic */ void A09(Object obj, C4D8 c4d8, int i) {
        short[] sArr = ((C192518ft) obj).A00;
        C14360o3.A0B(c4d8, 0);
        for (int i2 = 0; i2 < i; i2++) {
            c4d8.ASA(((C3TV) this).A00, i2).ASJ(sArr[i2]);
        }
    }
}
