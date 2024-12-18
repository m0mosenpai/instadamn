package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.List;

/* renamed from: X.NEe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52340NEe extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final O62 A01;
    public final List A02 = AbstractC166987dD.A1E();

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56074Our c56074Our = (C56074Our) interfaceC66482zP;
        C51289MlC c51289MlC = (C51289MlC) c3oo;
        AbstractC167017dG.A1N(c56074Our, c51289MlC);
        c51289MlC.A01.A00(c56074Our);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56074Our.class;
    }

    public C52340NEe(InterfaceC11380iw interfaceC11380iw, O62 o62) {
        this.A00 = interfaceC11380iw;
        this.A01 = o62;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        InterfaceC11380iw interfaceC11380iw = this.A00;
        O62 o62 = this.A01;
        AbstractC167017dG.A1R(interfaceC11380iw, o62);
        View inflate = layoutInflater.inflate(R.layout.layout_snap_horizontal_recycler_view, viewGroup, false);
        O63 o63 = new O63(o62);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        C51289MlC c51289MlC = new C51289MlC(inflate, interfaceC11380iw, o63);
        C51198Mji.A00(c51289MlC.A00, o62, 13);
        Object A0Q = AbstractC37303Gc4.A0Q(inflate, c51289MlC);
        if (A0Q instanceof C51289MlC) {
            C51289MlC c51289MlC2 = (C51289MlC) A0Q;
            if (c51289MlC2 != null) {
                this.A02.add(c51289MlC2.A01);
            }
            return c51289MlC2;
        }
        return null;
    }
}
