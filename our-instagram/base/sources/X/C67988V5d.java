package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.V5d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67988V5d extends AbstractC66422zJ {
    public final InterfaceC16820sZ A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new UI3(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_manage_folders_footer, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        E8Z e8z = (E8Z) interfaceC66482zP;
        UI3 ui3 = (UI3) c3oo;
        AbstractC167017dG.A1N(e8z, ui3);
        IgdsButton igdsButton = ui3.A00;
        igdsButton.setEnabled(e8z.A01);
        WNO.A00(igdsButton, 55, this);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return E8Z.class;
    }

    public C67988V5d(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }
}
