package X;

/* renamed from: X.Rrc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61662Rrc {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A10 = MSW.A10(c6fw, 0);
        AbstractC25225BEi.A1S(A10);
        String str = (String) A10;
        InterfaceC103384lE A0G = AbstractC31175DnJ.A0G(c6fw);
        C14360o3.A0C(A0G, AbstractC43591JPw.A00(1203));
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            InterfaceC136226Ez A03 = AnonymousClass634.A03(c6fg, "gs");
            if (A03 != null && (A03 instanceof C6Ey)) {
                C6Ex c6Ex = ((C6Ey) A03).A00;
                synchronized (c6Ex) {
                    Object obj = c6Ex.A00.get(str);
                    try {
                        obj = C6FY.A00(c6fq, AbstractC58320PtC.A0g(obj), A0G);
                    } catch (Exception unused) {
                    }
                    c6Ex.A01(str, obj);
                }
                return null;
            }
            AbstractC25241Le.A02("BloksLegacyDataModule", "Global State Module not found");
            return null;
        }
        throw AbstractC166997dE.A0g();
    }
}
