package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.5Au, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC113575Au {
    public static final C113565At A00(String str) {
        C113565At c113565At = new C113565At(str, C113585Av.A00);
        c113565At.A00 = true;
        return c113565At;
    }

    public static final void A01(InterfaceC113515Ao interfaceC113515Ao) {
        interfaceC113515Ao.EOx(AbstractC113545Ar.A07, C0eB.A00);
    }

    public static final void A02(InterfaceC113515Ao interfaceC113515Ao, int i) {
        interfaceC113515Ao.EOx(AbstractC113545Ar.A0M, new C5XQ(i));
    }

    public static final void A03(InterfaceC113515Ao interfaceC113515Ao, String str) {
        C113565At c113565At = AbstractC113545Ar.A02;
        List singletonList = Collections.singletonList(str);
        C14360o3.A07(singletonList);
        interfaceC113515Ao.EOx(c113565At, singletonList);
    }

    public static final void A04(InterfaceC113515Ao interfaceC113515Ao, String str, InterfaceC16820sZ interfaceC16820sZ) {
        interfaceC113515Ao.EOx(AbstractC120875de.A0A, new C120895dg(str, interfaceC16820sZ));
    }
}
