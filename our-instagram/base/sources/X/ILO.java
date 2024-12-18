package X;

import android.content.Context;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.List;

/* loaded from: classes7.dex */
public final class ILO {
    public final C66362zD A00;
    public final Context A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.2zJ, java.lang.Object] */
    public ILO(Context context, InterfaceC60442pS interfaceC60442pS, JGS jgs) {
        C14360o3.A0B(jgs, 2);
        this.A01 = context;
        C66392zG A00 = C66362zD.A00(context);
        A00.A01(new Object());
        A00.A01(new Object());
        A00.A01(new Object());
        A00.A01(new Object());
        this.A00 = AbstractC31173DnH.A0R(A00, new HIN(interfaceC60442pS, jgs));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A00(C38680GzL c38680GzL) {
        InterfaceC66482zP c42287IoB;
        IDJ idj;
        String str;
        InterfaceC66482zP interfaceC66482zP;
        C14360o3.A0B(c38680GzL, 0);
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        if (c38680GzL.A04) {
            interfaceC66482zP = new C39088HIm(c38680GzL.A02);
        } else {
            List<C41643IbZ> list = (List) c38680GzL.A01;
            if (list.isEmpty()) {
                Context context = this.A01;
                interfaceC66482zP = new C39092HIq(AbstractC166997dE.A0p(context, 2131969980), context.getString(2131969979));
            } else {
                for (C41643IbZ c41643IbZ : list) {
                    EnumC39566Hdc A00 = I7Q.A00(c41643IbZ.A03());
                    if (A00 != null) {
                        int ordinal = A00.ordinal();
                        if (ordinal != 3) {
                            if (ordinal == 0 && (idj = c41643IbZ.A01().A03) != null && (str = idj.A00) != null) {
                                c42287IoB = new H7F(null, null, null, AbstractC13670mt.A06("%s_%s_%s:", str, null, null), str, null, null);
                            }
                        } else {
                            c42287IoB = new C42287IoB(c41643IbZ);
                        }
                        A0E.A00(c42287IoB);
                    }
                }
                if (c38680GzL.A03) {
                    interfaceC66482zP = new Object();
                }
                this.A00.A05(A0E);
            }
        }
        A0E.A00(interfaceC66482zP);
        this.A00.A05(A0E);
    }
}
