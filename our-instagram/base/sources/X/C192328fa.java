package X;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.8fa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192328fa extends C3TV implements C3R9 {
    public static final C192328fa A00 = new C192328fa();

    @Override // X.C3TV
    public final /* bridge */ /* synthetic */ Object A08() {
        return new char[0];
    }

    public C192328fa() {
        super(C192308fY.A00);
    }

    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ int A01(Object obj) {
        char[] cArr = (char[]) obj;
        C14360o3.A0B(cArr, 0);
        return cArr.length;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.BAp, java.lang.Object] */
    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        char[] cArr = (char[]) obj;
        C14360o3.A0B(cArr, 0);
        ?? obj2 = new Object();
        obj2.A01 = cArr;
        int length = cArr.length;
        obj2.A00 = length;
        if (length < 10) {
            int i = length * 2;
            int i2 = 10;
            if (10 < i) {
                i2 = i;
            }
            char[] copyOf = Arrays.copyOf(cArr, i2);
            C14360o3.A07(copyOf);
            obj2.A01 = copyOf;
        }
        return obj2;
    }

    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ void A06(Object obj, C3T8 c3t8, int i, boolean z) {
        C25145BAp c25145BAp = (C25145BAp) obj;
        C14360o3.A0B(c3t8, 0);
        C14360o3.A0B(c25145BAp, 2);
        char ANw = c3t8.ANw(((C3TV) this).A00, i);
        int A002 = c25145BAp.A00() + 1;
        char[] cArr = c25145BAp.A01;
        int length = cArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            cArr = Arrays.copyOf(cArr, A002);
            C14360o3.A07(cArr);
            c25145BAp.A01 = cArr;
        }
        int i3 = c25145BAp.A00;
        c25145BAp.A00 = i3 + 1;
        cArr[i3] = ANw;
    }

    @Override // X.C3TV
    public final /* bridge */ /* synthetic */ void A09(Object obj, C4D8 c4d8, int i) {
        char[] cArr = (char[]) obj;
        C14360o3.A0B(c4d8, 0);
        C14360o3.A0B(cArr, 1);
        for (int i2 = 0; i2 < i; i2++) {
            SerialDescriptor serialDescriptor = ((C3TV) this).A00;
            char c = cArr[i2];
            C4DC c4dc = (C4DC) c4d8;
            C14360o3.A0B(serialDescriptor, 0);
            c4dc.A00(serialDescriptor, i2);
            c4dc.AS4(c);
        }
    }
}
