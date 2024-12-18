package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.KHq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45627KHq extends AbstractC66412zI {
    public final InterfaceC11380iw A00;

    public C45627KHq(InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(interfaceC11380iw, 1);
        this.A00 = interfaceC11380iw;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C14360o3.A0B(this.A00, AbstractC167017dG.A1a(null, c3oo) ? 1 : 0);
        throw AbstractC166987dD.A15("avatarUrl");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return AbstractC45179JzL.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        return new C44705Jqo(layoutInflater, viewGroup);
    }
}
