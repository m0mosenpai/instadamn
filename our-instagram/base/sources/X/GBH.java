package X;

import android.content.Context;
import java.util.List;

/* loaded from: classes6.dex */
public final class GBH implements C73R {
    public final C73S A00 = C73S.A0G;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ InterfaceC151446rm A02;
    public final /* synthetic */ List A03;

    @Override // X.C73R
    public final String AjD() {
        return "generic";
    }

    @Override // X.C73R
    public final /* synthetic */ Integer BEt() {
        return null;
    }

    @Override // X.C73R
    public final /* synthetic */ boolean DQZ() {
        return false;
    }

    public GBH(Context context, InterfaceC151446rm interfaceC151446rm, List list) {
        this.A01 = context;
        this.A03 = list;
        this.A02 = interfaceC151446rm;
    }

    @Override // X.C73R
    public final String Aj7() {
        return AbstractC166997dE.A0p(this.A01, 2131966888);
    }

    @Override // X.C73R
    public final void onClick() {
        C193328hC A0I = AbstractC31171DnF.A0I(this.A01);
        List list = this.A03;
        CharSequence[] charSequenceArr = new CharSequence[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            charSequenceArr[i] = ((C73R) list.get(i)).Aj7();
        }
        A0I.A0f(DialogInterfaceOnClickListenerC35454FkB.A00(list, 37), charSequenceArr);
        AbstractC31175DnJ.A1O(A0I);
        A0I.A0g(DialogInterfaceOnDismissListenerC35462FkJ.A00);
        this.A02.D0t(A0I);
    }

    @Override // X.C73R
    public final C73S AjB() {
        return this.A00;
    }
}
