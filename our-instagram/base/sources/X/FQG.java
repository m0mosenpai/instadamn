package X;

import android.content.Context;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* loaded from: classes6.dex */
public final class FQG {
    public final Context A00;
    public final AbstractC12990ll A01;
    public final InterfaceC37201GaC A02;
    public final InterfaceC16820sZ A03;
    public final InterfaceC16660sJ A04;

    public final void A00() {
        String str = (String) this.A03.invoke();
        if (AbstractC25228BEl.A1A(str).length() != 0) {
            C1ON A00 = AbstractC152476ta.A00(this.A00, this.A01, str);
            A00.A00 = new C32514ETq(this, str);
            this.A04.invoke(A00);
        }
    }

    public FQG(Context context, AbstractC018607g abstractC018607g, AbstractC12990ll abstractC12990ll, InterfaceC37201GaC interfaceC37201GaC, SearchEditText searchEditText) {
        AbstractC167027dH.A13(searchEditText, abstractC12990ll, context);
        C57510Pfk c57510Pfk = new C57510Pfk(searchEditText, 13);
        C50362MLo c50362MLo = new C50362MLo(44, context, abstractC018607g);
        this.A03 = c57510Pfk;
        this.A01 = abstractC12990ll;
        this.A00 = context;
        this.A04 = c50362MLo;
        this.A02 = interfaceC37201GaC;
    }
}
