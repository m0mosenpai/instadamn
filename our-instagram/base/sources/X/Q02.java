package X;

import java.io.IOException;

/* loaded from: classes10.dex */
public final class Q02 {
    public C102884kP A00;
    public InterfaceC103384lE A01;
    public InterfaceC103384lE A02;
    public String A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.Q02, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public static C102884kP A00(InterfaceC102764kD interfaceC102764kD) {
        String valueOf;
        Q02 obj = new Object();
        if (interfaceC102764kD.E3x() != C05F.A0C) {
            interfaceC102764kD.EmB();
            obj = 0;
        } else {
            while (interfaceC102764kD.Csy() != C05F.A0N) {
                int A00 = AbstractC102804kH.A00(interfaceC102764kD.E3u());
                interfaceC102764kD.Csy();
                if (35 == A00) {
                    obj.A00 = (C102884kP) AbstractC102864kN.A01(null, interfaceC102764kD);
                } else if (33 == A00) {
                    InterfaceC1120053p E3y = interfaceC102764kD.E3y();
                    Integer E3x = interfaceC102764kD.E3x();
                    int intValue = E3x.intValue();
                    if (intValue != 7) {
                        if (intValue == 5) {
                            valueOf = E3y.Ep1();
                        } else {
                            throw new IOException(AnonymousClass001.A0R("Bloks id only supports long and String types but got: ", AbstractC62263S4i.A00(E3x)));
                        }
                    } else {
                        valueOf = String.valueOf(E3y.Cmb());
                    }
                    obj.A03 = valueOf;
                } else if (38 == A00) {
                    obj.A02 = AbstractC58670Pzi.A00(null, interfaceC102764kD.E3y());
                } else if (43 == A00) {
                    obj.A01 = AbstractC58670Pzi.A00(null, interfaceC102764kD.E3y());
                }
                interfaceC102764kD.EmB();
            }
        }
        C102884kP c102884kP = obj.A00;
        if (c102884kP != null) {
            C102884kP c102884kP2 = new C102884kP(c102884kP, obj);
            obj.A00 = null;
            return c102884kP2;
        }
        throw new IOException("Shadow component should never be a leaf node");
    }
}
