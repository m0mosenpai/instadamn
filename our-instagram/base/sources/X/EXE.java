package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EXE extends AbstractC66412zI {
    public final View.OnClickListener A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C32624EXy c32624EXy = (C32624EXy) interfaceC66482zP;
        C31954E2i c31954E2i = (C31954E2i) c3oo;
        C0fQ.A00(this.A00, c31954E2i.A00);
        c31954E2i.A02.setText(c32624EXy.A01);
        c31954E2i.A01.setText(c32624EXy.A00);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C31954E2i(AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.suggested_blocks_entry_point));
    }

    public EXE(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32624EXy.class;
    }
}
