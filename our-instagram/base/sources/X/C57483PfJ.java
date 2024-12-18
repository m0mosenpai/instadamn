package X;

import java.util.Iterator;

/* renamed from: X.PfJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57483PfJ extends C0YY implements InterfaceC16820sZ {
    public static final C57483PfJ A00 = new C57483PfJ();

    public C57483PfJ() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object A1D;
        float f;
        InterfaceC09390do interfaceC09390do = O1C.A07;
        try {
            Iterator A1J = AbstractC25226BEj.A1J(AbstractC54346O0e.A00.getValue());
            int i = 0;
            while (A1J.hasNext()) {
                i += Integer.parseInt(((C54570O8w) A1J.next()).A01);
            }
            A1D = Float.valueOf(i / 1000000.0f);
        } catch (Throwable th) {
            A1D = MSW.A1D(th);
        }
        if (A1D instanceof C09540e5) {
            A1D = null;
        }
        Number number = (Number) A1D;
        if (number != null) {
            f = number.floatValue();
        } else {
            f = -1.0f;
        }
        return Float.valueOf(f);
    }
}
