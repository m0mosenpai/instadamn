package X;

import java.util.List;

/* renamed from: X.ETq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32514ETq extends C1P1 {
    public final String A00;
    public final /* synthetic */ FQG A01;

    public C32514ETq(FQG fqg, String str) {
        C14360o3.A0B(str, 2);
        this.A01 = fqg;
        this.A00 = str;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String errorMessage;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -79650595);
        C40781ul c40781ul = (C40781ul) abstractC115105If.A00();
        if (c40781ul != null && (errorMessage = c40781ul.getErrorMessage()) != null) {
            this.A01.A02.DyH(errorMessage, C05F.A01);
        } else {
            FQG fqg = this.A01;
            fqg.A02.DyH(AbstractC166997dE.A0p(fqg.A00, 2131968430), C05F.A00);
        }
        C0f9.A0A(1435335790, A0N);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-149660278);
        this.A01.A02.DyI();
        C0f9.A0A(119458024, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list;
        C34681FPr c34681FPr;
        int i;
        int A03 = C0f9.A03(1053578685);
        C32200ECv c32200ECv = (C32200ECv) obj;
        int A0N = AbstractC167017dG.A0N(c32200ECv, -1603670531);
        String str = this.A00;
        FQG fqg = this.A01;
        if (!C14360o3.A0K(str, fqg.A03.invoke())) {
            i = 1278534716;
        } else {
            if (c32200ECv.A02) {
                fqg.A02.DyG();
            } else {
                InterfaceC37201GaC interfaceC37201GaC = fqg.A02;
                String str2 = c32200ECv.A01;
                if (str2 == null) {
                    str2 = "";
                }
                ECX ecx = c32200ECv.A00;
                if (ecx != null && (c34681FPr = ecx.A00) != null) {
                    list = c34681FPr.A00();
                } else {
                    list = null;
                }
                interfaceC37201GaC.DyK(str2, list);
            }
            i = -801855756;
        }
        C0f9.A0A(i, A0N);
        C0f9.A0A(1368940860, A03);
    }
}
