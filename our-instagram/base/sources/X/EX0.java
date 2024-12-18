package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class EX0 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C33603EtF c33603EtF = (C33603EtF) AbstractC31172DnG.A0x(c3oo.itemView);
        String str = ((C32620EXu) interfaceC66482zP).A00;
        C14360o3.A0B(c33603EtF, 0);
        c33603EtF.A01.setText(str);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C3OO(FC2.A00(layoutInflater, viewGroup));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32620EXu.class;
    }
}
