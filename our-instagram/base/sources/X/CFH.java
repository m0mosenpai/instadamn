package X;

/* loaded from: classes5.dex */
public abstract class CFH {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03;
        Object A01 = c6fw.A01();
        AbstractC25225BEi.A1S(A01);
        String str = (String) A01;
        if (c6fw.A00.get(1) == null) {
            A03 = c6fq.A03;
            if (A03 == null) {
                return null;
            }
        } else {
            A03 = c6fw.A03(1);
            C14360o3.A0C(A03, AbstractC43591JPw.A00(1));
        }
        InterfaceC103384lE interfaceC103384lE = ((C1344465q) c6fw.A00()).A00;
        return C35136Fed.A00(c6fq, str, new C57261Pbj(43, A03, interfaceC103384lE, c6fq), new C30172DRc(6, A03, interfaceC103384lE, c6fq));
    }
}
