package X;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.8fx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192558fx extends C3TV implements C3R9 {
    public static final C192558fx A00 = new C192558fx();

    @Override // X.C3TV
    public final /* bridge */ /* synthetic */ Object A08() {
        return new byte[0];
    }

    public C192558fx() {
        super(C192538fv.A00);
    }

    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ int A01(Object obj) {
        byte[] bArr = (byte[]) obj;
        C14360o3.A0B(bArr, 0);
        return bArr.length;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.BAo, java.lang.Object] */
    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        byte[] bArr = (byte[]) obj;
        C14360o3.A0B(bArr, 0);
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
        C25144BAo c25144BAo = (C25144BAo) obj;
        C14360o3.A0B(c3t8, 0);
        C14360o3.A0B(c25144BAo, 2);
        byte ANu = c3t8.ANu(((C3TV) this).A00, i);
        int A002 = c25144BAo.A00() + 1;
        byte[] bArr = c25144BAo.A01;
        int length = bArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            bArr = Arrays.copyOf(bArr, A002);
            C14360o3.A07(bArr);
            c25144BAo.A01 = bArr;
        }
        int i3 = c25144BAo.A00;
        c25144BAo.A00 = i3 + 1;
        bArr[i3] = ANu;
    }

    @Override // X.C3TV
    public final /* bridge */ /* synthetic */ void A09(Object obj, C4D8 c4d8, int i) {
        byte[] bArr = (byte[]) obj;
        C14360o3.A0B(c4d8, 0);
        C14360o3.A0B(bArr, 1);
        for (int i2 = 0; i2 < i; i2++) {
            SerialDescriptor serialDescriptor = ((C3TV) this).A00;
            byte b = bArr[i2];
            C4DC c4dc = (C4DC) c4d8;
            C14360o3.A0B(serialDescriptor, 0);
            c4dc.A00(serialDescriptor, i2);
            c4dc.AS3(b);
        }
    }
}
