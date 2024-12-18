package X;

import android.view.View;
import java.util.List;

/* renamed from: X.Lht, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48786Lht implements InterfaceC50478MQg {
    public final /* synthetic */ C44689JqY A00;
    public final /* synthetic */ KIV A01;
    public final /* synthetic */ C45204Jzk A02;

    public C48786Lht(C44689JqY c44689JqY, KIV kiv, C45204Jzk c45204Jzk) {
        this.A01 = kiv;
        this.A00 = c44689JqY;
        this.A02 = c45204Jzk;
    }

    @Override // X.InterfaceC50478MQg
    public final void DHh(View view, boolean z) {
        C45204Jzk c45204Jzk = this.A02;
        CharSequence charSequence = c45204Jzk.A00;
        if (charSequence == null || AbstractC001900j.A0T(charSequence)) {
            this.A01.A00.A00(c45204Jzk);
        }
    }

    @Override // X.InterfaceC50478MQg
    public final void Deu(View view) {
        this.A01.A00.A00(this.A02);
    }

    @Override // X.InterfaceC50478MQg
    public final void Dsb(View view, CharSequence charSequence) {
        KIV kiv = this.A01;
        L6H l6h = kiv.A00;
        C44689JqY c44689JqY = this.A00;
        int bindingAdapterPosition = c44689JqY.getBindingAdapterPosition();
        LJc lJc = l6h.A00;
        int max = Math.max((bindingAdapterPosition - lJc.A0C.size()) - 1, 0);
        List list = lJc.A0B;
        ((C45204Jzk) list.get(Math.min(max, AbstractC25226BEj.A05(list)))).A00 = charSequence;
        KIV.A00(c44689JqY, kiv, charSequence);
    }
}
