package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.ui.widget.loadmore2.LoadMoreButton;

/* renamed from: X.NEm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52348NEm extends AbstractC66412zI {
    public final GX0 A00;

    public final C51267Mkq A00(ViewGroup viewGroup) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        GX0 gx0 = this.A00;
        View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.load_more_container);
        ((LoadMoreButton) A0A.requireViewById(R.id.load_more_button)).A03 = gx0;
        return new C51267Mkq(A0A);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        ((C51267Mkq) c3oo).A00.setState(((C56120Ovf) interfaceC66482zP).A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56120Ovf.class;
    }

    public C52348NEm(GX0 gx0) {
        this.A00 = gx0;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return A00(viewGroup);
    }
}
