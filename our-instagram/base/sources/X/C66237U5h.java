package X;

import java.util.List;

/* renamed from: X.U5h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66237U5h {
    public final C6FQ A00;
    public final InterfaceC103384lE A01;
    public final List A02;
    public final InterfaceC16660sJ A03;

    public C66237U5h(InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = null;
        this.A00 = null;
        this.A03 = interfaceC16660sJ;
        this.A02 = null;
    }

    public final Object A00(C6FQ c6fq, C6FW c6fw) {
        InterfaceC16660sJ interfaceC16660sJ = this.A03;
        if (interfaceC16660sJ != null) {
            return interfaceC16660sJ.invoke(c6fw);
        }
        InterfaceC103384lE interfaceC103384lE = this.A01;
        if (interfaceC103384lE != null) {
            C6FQ c6fq2 = this.A00;
            if (c6fq2 == null) {
                List list = this.A02;
                if (list != null && c6fq != null) {
                    c6fq2 = C6FQ.A02(c6fq, list);
                }
            }
            return C131845xK.A00(c6fq2, c6fw, interfaceC103384lE);
        }
        AbstractC25241Le.A02("BloksCallback", "An attempt to invoke an invalid callback");
        return null;
    }

    public C66237U5h(InterfaceC103384lE interfaceC103384lE, List list) {
        this.A01 = interfaceC103384lE;
        this.A00 = null;
        this.A03 = null;
        this.A02 = list;
    }

    public C66237U5h(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE) {
        this.A01 = interfaceC103384lE;
        this.A00 = c6fq;
        this.A03 = null;
        this.A02 = null;
    }
}
