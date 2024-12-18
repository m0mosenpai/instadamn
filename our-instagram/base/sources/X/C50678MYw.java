package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.MYw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50678MYw extends AbstractC66412zI {
    public final InterfaceC55362gb A00;
    public final C66122yo A01 = new Object();

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C52359NEx c52359NEx = (C52359NEx) interfaceC66482zP;
        C81383k8 c81383k8 = (C81383k8) c3oo;
        AbstractC167017dG.A1N(c52359NEx, c81383k8);
        this.A01.ADw(this.A00, c52359NEx.A00, c81383k8);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C52359NEx.class;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.2yo] */
    public C50678MYw(InterfaceC55362gb interfaceC55362gb) {
        this.A00 = interfaceC55362gb;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C81383k8(this.A01.Csl(layoutInflater, viewGroup));
    }
}
