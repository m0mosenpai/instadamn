package X;

/* renamed from: X.CgI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28412CgI {
    public static final InterfaceC31114Dlw A00 = new C28862CoW(C28148Cav.A00, 0, 0);

    public static final void A01(int i, int i2, int i3) {
        if (i >= 0 && i <= i2) {
            return;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("OffsetMapping.originalToTransformed returned invalid mapping: ");
        A1C.append(i3);
        A1C.append(" -> ");
        A1C.append(i);
        A1C.append(" is not in range of transformed text [0, ");
        A1C.append(i2);
        A1C.append(']');
        throw AbstractC166987dD.A14(A1C.toString());
    }

    public static final void A02(int i, int i2, int i3) {
        if (i >= 0 && i <= i2) {
            return;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("OffsetMapping.transformedToOriginal returned invalid mapping: ");
        A1C.append(i3);
        A1C.append(" -> ");
        A1C.append(i);
        A1C.append(" is not in range of original text [0, ");
        A1C.append(i2);
        A1C.append(']');
        throw AbstractC166987dD.A14(A1C.toString());
    }

    public static final CVF A00(C5C8 c5c8, InterfaceC31101Dlj interfaceC31101Dlj) {
        CVF AVH = interfaceC31101Dlj.AVH(c5c8);
        int length = c5c8.length();
        C5C8 c5c82 = AVH.A00;
        int length2 = c5c82.length();
        int min = Math.min(length, 100);
        for (int i = 0; i < min; i++) {
            A01(AVH.A01.E36(i), length2, i);
        }
        InterfaceC31114Dlw interfaceC31114Dlw = AVH.A01;
        A01(interfaceC31114Dlw.E36(length), length2, length);
        int min2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < min2; i2++) {
            A02(interfaceC31114Dlw.F8T(i2), length, i2);
        }
        A02(interfaceC31114Dlw.F8T(length2), length, length2);
        return new CVF(c5c82, new C28862CoW(interfaceC31114Dlw, length, length2));
    }
}
