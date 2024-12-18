package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EX3 extends AbstractC66412zI {
    public final FFI A00;

    public EX3(FFI ffi) {
        C14360o3.A0B(ffi, 1);
        this.A00 = ffi;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new E2I(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_broadcast_chat_activity_feed_v2_header_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C32080E8e c32080E8e = (C32080E8e) interfaceC66482zP;
        E2I e2i = (E2I) c3oo;
        AbstractC167017dG.A1N(c32080E8e, e2i);
        e2i.A02.setText(c32080E8e.A00);
        View view = e2i.A01;
        int i = 0;
        view.setVisibility(AbstractC167007dF.A05(c32080E8e.A01 ? 1 : 0));
        ViewOnClickListenerC35681FpG.A01(view, 39, this);
        View view2 = e2i.A00;
        if (!c32080E8e.A02) {
            i = 8;
        }
        view2.setVisibility(i);
        ViewOnClickListenerC35681FpG.A01(view2, 40, this);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32080E8e.class;
    }
}
