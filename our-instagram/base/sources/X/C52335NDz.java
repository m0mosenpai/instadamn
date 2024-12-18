package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.NDz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52335NDz extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C51269Mks c51269Mks = (C51269Mks) c3oo;
        AbstractC167017dG.A1N(interfaceC66482zP, c51269Mks);
        c51269Mks.A01.A02(AbstractC166997dE.A0p(c51269Mks.A00, 2131971541), false);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZ5.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        Context A04 = AbstractC31176DnK.A04(viewGroup);
        return new C51269Mks(A04, new C38311Gsx(A04));
    }
}
