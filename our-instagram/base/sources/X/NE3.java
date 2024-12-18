package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes9.dex */
public final class NE3 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56090OvA c56090OvA = (C56090OvA) interfaceC66482zP;
        C51243MkS c51243MkS = (C51243MkS) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c56090OvA, c51243MkS);
        C38311Gsx c38311Gsx = c51243MkS.A00;
        c38311Gsx.A00();
        CharSequence text = c38311Gsx.getResources().getText(c56090OvA.A00);
        C14360o3.A07(text);
        c38311Gsx.A02(text, A1a);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56090OvA.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C51243MkS(new C38311Gsx(AbstractC31176DnK.A04(viewGroup)));
    }
}
