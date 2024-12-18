package X;

import android.content.Context;

/* renamed from: X.Sg4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63248Sg4 {
    public static final void A00(Context context) {
        C193328hC c193328hC = new C193328hC(context);
        c193328hC.A0A(2131961880);
        c193328hC.A09(2131972429);
        AbstractC31176DnK.A17(null, c193328hC, 2131960994);
    }

    public static final void A01(AbstractC10360h2 abstractC10360h2) {
        C0SG c0sg;
        if (abstractC10360h2 != null && (c0sg = (C0SG) abstractC10360h2.A0Q("progressDialog")) != null) {
            c0sg.A08();
        }
    }

    public static final void A02(AbstractC10360h2 abstractC10360h2) {
        C67858Uzp c67858Uzp = new C67858Uzp();
        if (abstractC10360h2 != null) {
            c67858Uzp.A0L(abstractC10360h2, "progressDialog");
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static void A03(Rb2 rb2) {
        AbstractC10360h2 abstractC10360h2 = rb2.A07;
        C14360o3.A0A(abstractC10360h2);
        A01(abstractC10360h2);
        Context context = rb2.A00;
        C14360o3.A0A(context);
        C0fJ.A00(FYS.A00(context));
        TF9 tf9 = rb2.A0A;
        C14360o3.A0A(tf9);
        tf9.A00(EnumC61065Ree.A03, EnumC61067Reg.A02, rb2.A0B);
    }
}
