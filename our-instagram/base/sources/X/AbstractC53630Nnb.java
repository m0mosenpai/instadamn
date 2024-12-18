package X;

/* renamed from: X.Nnb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53630Nnb {
    public final AbstractC53630Nnb A00(String str, InterfaceC16660sJ interfaceC16660sJ) {
        if (this instanceof C51395Mn0) {
            C51395Mn0 c51395Mn0 = (C51395Mn0) this;
            Object obj = c51395Mn0.A02;
            if (!AbstractC25231BEo.A1a(obj, interfaceC16660sJ)) {
                return new C51396Mn1(c51395Mn0.A00, c51395Mn0.A01, obj, c51395Mn0.A03, str);
            }
            return c51395Mn0;
        }
        return this;
    }

    public final Object A01() {
        if (this instanceof C51395Mn0) {
            return ((C51395Mn0) this).A02;
        }
        C51396Mn1 c51396Mn1 = (C51396Mn1) this;
        int intValue = c51396Mn1.A01.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    throw B4Z.A00();
                }
                return null;
            }
            String str = c51396Mn1.A04;
            Object obj = c51396Mn1.A02;
            String str2 = c51396Mn1.A03;
            C14360o3.A0B(obj, 0);
            C14360o3.A0B(str2, 1);
            String A0n = AbstractC167017dG.A0n(obj, " value: ", AbstractC166997dE.A11(str2));
            C14360o3.A0B(str, 0);
            C14360o3.A0B(A0n, 1);
            return null;
        }
        throw c51396Mn1.A00;
    }
}
