package X;

/* renamed from: X.3LT, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3LT {
    public static InterfaceC56512ik A00(InterfaceC56512ik interfaceC56512ik, InterfaceC56512ik interfaceC56512ik2, AbstractC1348868e abstractC1348868e, float f, float f2) {
        if (interfaceC56512ik == null) {
            if (abstractC1348868e == null) {
                return null;
            }
        } else if (abstractC1348868e == null) {
            return interfaceC56512ik;
        }
        float[] fArr = ((C68f) abstractC1348868e).A00;
        int length = fArr.length;
        int A02 = C3LU.A02(fArr, f, length);
        if (A02 >= 0) {
            return ((InterfaceC56512ik[]) abstractC1348868e.A00)[A02];
        }
        int i = -(A02 + 1);
        InterfaceC56512ik[] interfaceC56512ikArr = (InterfaceC56512ik[]) abstractC1348868e.A00;
        if (i == 0) {
            return interfaceC56512ikArr[0];
        }
        if (i == length) {
            return interfaceC56512ikArr[length - 1];
        }
        int i2 = i - 1;
        InterfaceC56512ik interfaceC56512ik3 = interfaceC56512ikArr[i2];
        InterfaceC56512ik interfaceC56512ik4 = interfaceC56512ikArr[i];
        float A00 = C3LU.A00(abstractC1348868e.A01[i2], fArr[i2], fArr[i], f, f2);
        if (A00 == 0.0f) {
            return interfaceC56512ik3;
        }
        interfaceC56512ik3.COt(A00, interfaceC56512ik4, interfaceC56512ik2);
        return interfaceC56512ik2;
    }
}
