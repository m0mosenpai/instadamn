package X;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.8fq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192488fq extends C3TV implements C3R9 {
    public static final C192488fq A00 = new C192488fq();

    @Override // X.C3TV
    public final /* bridge */ /* synthetic */ Object A08() {
        return new short[0];
    }

    public C192488fq() {
        super(C192468fo.A00);
    }

    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ int A01(Object obj) {
        short[] sArr = (short[]) obj;
        C14360o3.A0B(sArr, 0);
        return sArr.length;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.BAu] */
    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        short[] sArr = (short[]) obj;
        C14360o3.A0B(sArr, 0);
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
        C25150BAu c25150BAu = (C25150BAu) obj;
        C14360o3.A0B(c3t8, 0);
        C14360o3.A0B(c25150BAu, 2);
        short AOI = c3t8.AOI(((C3TV) this).A00, i);
        int A002 = c25150BAu.A00() + 1;
        short[] sArr = c25150BAu.A01;
        int length = sArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            sArr = Arrays.copyOf(sArr, A002);
            C14360o3.A07(sArr);
            c25150BAu.A01 = sArr;
        }
        int i3 = c25150BAu.A00;
        c25150BAu.A00 = i3 + 1;
        sArr[i3] = AOI;
    }

    @Override // X.C3TV
    public final /* bridge */ /* synthetic */ void A09(Object obj, C4D8 c4d8, int i) {
        short[] sArr = (short[]) obj;
        C14360o3.A0B(c4d8, 0);
        C14360o3.A0B(sArr, 1);
        for (int i2 = 0; i2 < i; i2++) {
            SerialDescriptor serialDescriptor = ((C3TV) this).A00;
            short s = sArr[i2];
            C4DC c4dc = (C4DC) c4d8;
            C14360o3.A0B(serialDescriptor, 0);
            c4dc.A00(serialDescriptor, i2);
            c4dc.ASJ(s);
        }
    }
}
