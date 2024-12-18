package X;

/* renamed from: X.BGo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC25274BGo {
    public static int A00(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, C5DW c5dw, int i) {
        Integer num = C05F.A01;
        return c5dw.CpE(new C25272BGm(interfaceC1131659e, num, num), C25273BGn.A00(interfaceC1131259a), AbstractC25231BEo.A0K(i)).getHeight();
    }

    public static int A01(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, C5DW c5dw, int i) {
        return c5dw.CpE(new C25272BGm(interfaceC1131659e, C05F.A01, C05F.A00), new C25273BGn(interfaceC1131259a, interfaceC1131259a.getLayoutDirection()), C5AU.A04(0, Integer.MAX_VALUE, 0, i)).getWidth();
    }

    public static int A02(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, C5DW c5dw, int i) {
        return c5dw.CpE(new C25272BGm(interfaceC1131659e, C05F.A00, C05F.A01), new C25273BGn(interfaceC1131259a, interfaceC1131259a.getLayoutDirection()), C5AU.A04(0, i, 0, Integer.MAX_VALUE)).getHeight();
    }

    public static int A03(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, C5DW c5dw, int i) {
        Integer num = C05F.A00;
        return c5dw.CpE(new C25272BGm(interfaceC1131659e, num, num), C25273BGn.A00(interfaceC1131259a), C5AU.A04(0, Integer.MAX_VALUE, 0, i)).getWidth();
    }
}
