package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.Sbv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63073Sbv {
    public static int A05(int i) {
        return CodedOutputStream.A00(i << 3);
    }

    public static void A06(CodedOutputStream codedOutputStream, int i) {
        codedOutputStream.A07((i << 3) | 2);
    }

    public static void A07(SCD scd, InterfaceC65596Tnf interfaceC65596Tnf, Object obj, int i) {
        CodedOutputStream codedOutputStream = scd.A00;
        int i2 = i << 3;
        codedOutputStream.A07(i2 | 3);
        interfaceC65596Tnf.FEo(codedOutputStream.A00, obj);
        codedOutputStream.A07(i2 | 4);
    }
}
