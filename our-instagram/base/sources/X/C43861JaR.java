package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.JaR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43861JaR extends AbstractC66422zJ {
    public final C43888Jav A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C44756Jrd(AbstractC31173DnH.A0C(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.gallery_header, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        LZG lzg = (LZG) interfaceC66482zP;
        C44756Jrd c44756Jrd = (C44756Jrd) c3oo;
        AbstractC167017dG.A1N(lzg, c44756Jrd);
        c44756Jrd.A00(lzg.A00, this.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZG.class;
    }

    public C43861JaR(C43888Jav c43888Jav) {
        this.A00 = c43888Jav;
    }
}
