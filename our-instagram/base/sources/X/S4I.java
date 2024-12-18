package X;

/* loaded from: classes10.dex */
public abstract class S4I {
    /* JADX WARN: Type inference failed for: r10v2, types: [X.QJk, X.QJl, X.RqH] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        boolean z;
        Integer num;
        Object A03 = c6fw.A03(0);
        String A00 = MSV.A00(10);
        C14360o3.A0C(A03, A00);
        C102884kP c102884kP = (C102884kP) A03;
        String A0F = c102884kP.A0F();
        if (A0F == null) {
            A0F = "";
        }
        String str = "0";
        String A0I = c102884kP.A0I();
        if (A0I != null) {
            str = A0I;
        }
        String A0J = c102884kP.A0J();
        if (A0J == null) {
            AbstractC25241Le.A02("instagram.BKBloksActionShopifysdkPrepareImpl", "payment type is null");
        } else {
            String A0H = c102884kP.A0H();
            C6FG c6fg = c6fq.A03;
            if (c6fg != null) {
                z = AbstractC72723Nt.A00(c6fg.A00);
            } else {
                z = false;
            }
            long A04 = c102884kP.A04(43, 0L);
            if (A0J.equals(C2O5.A0F.toString())) {
                num = C05F.A00;
            } else if (A0J.equals(C2O5.A0H.toString())) {
                num = C05F.A01;
            } else {
                num = C05F.A0N;
            }
            ?? qJl = new QJl(num, A0H, A0F, str, A04, z);
            qJl.A00 = A0J;
            Object A032 = c6fw.A03(0);
            C14360o3.A0C(A032, A00);
            InterfaceC103384lE A09 = ((C102884kP) A032).A09();
            if (A09 != null && c6fg != null) {
                synchronized (AbstractC62357S8e.A01) {
                    AbstractC62357S8e.A00 = qJl;
                }
                C131845xK.A00(c6fq, AbstractC58320PtC.A0g(c6fg), A09);
                return null;
            }
        }
        return null;
    }
}
