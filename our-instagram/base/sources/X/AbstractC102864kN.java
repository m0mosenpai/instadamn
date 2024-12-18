package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4kN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC102864kN {
    /* JADX WARN: Type inference failed for: r2v2, types: [X.4kP, X.4kO] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.4kP] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    public static Object A01(C102814kI c102814kI, InterfaceC102764kD interfaceC102764kD) {
        ?? c102874kO;
        C103234ky c103234ky;
        ArrayList arrayList = new ArrayList();
        Integer E3x = interfaceC102764kD.E3x();
        Integer num = C05F.A0C;
        if (E3x == num) {
            Object obj = null;
            while (true) {
                Integer Csy = interfaceC102764kD.Csy();
                Integer num2 = C05F.A0N;
                if (Csy == num2) {
                    break;
                }
                String E3u = interfaceC102764kD.E3u();
                int A00 = AbstractC102804kH.A00(E3u);
                boolean z = false;
                if (A00 >= 32) {
                    z = true;
                }
                interfaceC102764kD.Csy();
                if (C1LZ.A0H == null || (c103234ky = C1LZ.A0H.A03) == null || (c102874kO = c103234ky.A00(interfaceC102764kD, E3u, z)) == 0) {
                    if (z && 13347 == A00) {
                        c102874kO = Q02.A00(interfaceC102764kD);
                    } else {
                        c102874kO = new C102874kO(A00);
                        if (!z) {
                            AbstractC25241Le.A02("BloksModelParser", String.format(AnonymousClass001.A0R("Unexpectedly attempting to parse\"\n              + \" an unminified payload: ", E3u), new Object[0]));
                        } else if (interfaceC102764kD.E3x() != num) {
                            interfaceC102764kD.EmB();
                            c102874kO = 0;
                        } else {
                            arrayList.add(Integer.valueOf(A00));
                            C102984kZ c102984kZ = new C102984kZ(c102814kI, new C102964kX(null, arrayList));
                            c102874kO.A01 = c102984kZ;
                            while (interfaceC102764kD.Csy() != num2) {
                                String E3u2 = interfaceC102764kD.E3u();
                                interfaceC102764kD.Csy();
                                AbstractC102994ka.A00(c102984kZ, c102874kO, interfaceC102764kD, E3u2);
                                interfaceC102764kD.EmB();
                            }
                        }
                        c102874kO.A0P();
                    }
                }
                interfaceC102764kD.EmB();
                obj = c102874kO;
            }
            if (obj == null) {
                AbstractC25241Le.A03("BloksParser", new IOException("unknown bloks data type"));
            }
            return obj;
        }
        interfaceC102764kD.EmB();
        throw new IOException("Token parsing error.");
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [X.4kP, X.4kO] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.4kP] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    public static Object A00(C103004kb c103004kb, InterfaceC102764kD interfaceC102764kD) {
        ?? c102874kO;
        C103234ky c103234ky;
        Integer E3x = interfaceC102764kD.E3x();
        Integer num = C05F.A0C;
        if (E3x == num) {
            Object obj = null;
            while (true) {
                Integer Csy = interfaceC102764kD.Csy();
                Integer num2 = C05F.A0N;
                if (Csy == num2) {
                    break;
                }
                String E3u = interfaceC102764kD.E3u();
                int A00 = AbstractC102804kH.A00(E3u);
                boolean z = false;
                if (A00 >= 32) {
                    z = true;
                }
                interfaceC102764kD.Csy();
                if (C1LZ.A0H == null || (c103234ky = C1LZ.A0H.A03) == null || (c102874kO = c103234ky.A00(interfaceC102764kD, E3u, z)) == 0) {
                    if (z && 13347 == A00) {
                        c102874kO = Q02.A00(interfaceC102764kD);
                    } else {
                        c102874kO = new C102874kO(A00);
                        if (!z) {
                            AbstractC25241Le.A02("BloksModelParser", String.format(AnonymousClass001.A0R("Unexpectedly attempting to parse\"\n              + \" an unminified payload: ", E3u), new Object[0]));
                        } else if (interfaceC102764kD.E3x() != num) {
                            interfaceC102764kD.EmB();
                            c102874kO = 0;
                        } else {
                            List list = c103004kb.A00;
                            list.add(Integer.valueOf(A00));
                            C102964kX c102964kX = new C102964kX(c103004kb.A01, list);
                            c102874kO.A01 = c102964kX;
                            while (interfaceC102764kD.Csy() != num2) {
                                String E3u2 = interfaceC102764kD.E3u();
                                interfaceC102764kD.Csy();
                                AbstractC102994ka.A00(c102964kX, c102874kO, interfaceC102764kD, E3u2);
                                interfaceC102764kD.EmB();
                            }
                        }
                        c102874kO.A0P();
                    }
                }
                interfaceC102764kD.EmB();
                obj = c102874kO;
            }
            if (obj == null) {
                AbstractC25241Le.A03("BloksParser", new IOException("unknown bloks data type"));
            }
            return obj;
        }
        interfaceC102764kD.EmB();
        throw new IOException("Token parsing error.");
    }
}
