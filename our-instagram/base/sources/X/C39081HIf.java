package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.HIf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39081HIf extends AbstractC66412zI {
    public final C62862tP A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C3OO(ISA.A00(AbstractC166997dE.A0L(viewGroup), viewGroup));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
        Object tag = c3oo.itemView.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.interop.sharedshoppinghistory.ShoppingDataSignifierRowViewBinder.Holder");
        IIB iib = (IIB) tag;
        C14360o3.A0B(iib, 0);
        C6T7 c6t7 = iib.A00;
        if (c6t7 != null) {
            c6t7.A04();
            iib.A00 = null;
            iib.A01 = null;
        }
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        H7H h7h = (H7H) interfaceC66482zP;
        AbstractC167017dG.A1N(h7h, c3oo);
        Object tag = c3oo.itemView.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.interop.sharedshoppinghistory.ShoppingDataSignifierRowViewBinder.Holder");
        C1338462s c1338462s = h7h.A00;
        ISA.A01(this.A00, c1338462s, (IIB) tag);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return H7H.class;
    }

    public C39081HIf(C62862tP c62862tP) {
        this.A00 = c62862tP;
    }
}
