package X;

import java.util.List;

/* renamed from: X.CTe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27945CTe {
    public C28004CWb A00;
    public C5C3 A01;

    public final C5C3 A00(List list) {
        C5C2 c5c2;
        long A00;
        C5C2 c5c22;
        int i = 0;
        InterfaceC30912DiP interfaceC30912DiP = null;
        try {
            int size = list.size();
            while (i < size) {
                InterfaceC30912DiP interfaceC30912DiP2 = (InterfaceC30912DiP) list.get(i);
                try {
                    interfaceC30912DiP2.ACF(this.A00);
                    i++;
                    interfaceC30912DiP = interfaceC30912DiP2;
                } catch (Exception e) {
                    e = e;
                    interfaceC30912DiP = interfaceC30912DiP2;
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    StringBuilder A1C2 = AbstractC166987dD.A1C();
                    A1C2.append("Error while applying EditCommand batch to buffer (length=");
                    C28004CWb c28004CWb = this.A00;
                    A1C2.append(c28004CWb.A04.A00());
                    A1C2.append(AbstractC111324zv.A00(3359));
                    int i2 = c28004CWb.A01;
                    if (i2 != -1) {
                        c5c2 = new C5C2(C60Z.A00(i2, c28004CWb.A00));
                    } else {
                        c5c2 = null;
                    }
                    A1C2.append(c5c2);
                    A1C2.append(", selection=");
                    C28004CWb c28004CWb2 = this.A00;
                    A1C2.append((Object) C5C2.A02(C60Z.A00(c28004CWb2.A03, c28004CWb2.A02)));
                    A1C.append(AbstractC166997dE.A0x("):", A1C2));
                    A1C.append('\n');
                    AbstractC001800i.A0q(A1C, "\n", "", "", list, new C65076Td9(3, this, interfaceC30912DiP));
                    throw new RuntimeException(AbstractC166987dD.A19(A1C), e);
                }
            }
            String obj = this.A00.toString();
            C16930sl c16930sl = C16930sl.A00;
            C5C8 c5c8 = new C5C8(c16930sl, c16930sl, obj);
            C28004CWb c28004CWb3 = this.A00;
            long A002 = C60Z.A00(c28004CWb3.A03, c28004CWb3.A02);
            C5C2 c5c23 = new C5C2(A002);
            if (!C5C2.A04(this.A01.A00)) {
                A00 = c5c23.A00;
            } else {
                A00 = C60Z.A00(C5C2.A00(A002), C5C2.A01(A002));
            }
            int i3 = c28004CWb3.A01;
            if (i3 != -1) {
                c5c22 = new C5C2(C60Z.A00(i3, c28004CWb3.A00));
            } else {
                c5c22 = null;
            }
            C5C3 c5c3 = new C5C3(c5c8, c5c22, A00);
            this.A01 = c5c3;
            return c5c3;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public C27945CTe() {
        C5C3 c5c3 = new C5C3(AbstractC127005oe.A00, null, C5C2.A01);
        this.A01 = c5c3;
        this.A00 = new C28004CWb(c5c3.A01, c5c3.A00);
    }
}
