package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class U1L extends AbstractC66412zI {
    public final InterfaceC71952XCe A00;

    public U1L(InterfaceC71952XCe interfaceC71952XCe) {
        C14360o3.A0B(interfaceC71952XCe, 1);
        this.A00 = interfaceC71952XCe;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        VA3 va3 = (VA3) interfaceC66482zP;
        UI4 ui4 = (UI4) c3oo;
        AbstractC167017dG.A1N(va3, ui4);
        AbstractC68488VSt.A00(va3.A00, this.A00, ui4);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return VA3.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.see_results_button, false);
        A0C.setTag(new UI4(A0C));
        return new UI4(A0C);
    }
}
