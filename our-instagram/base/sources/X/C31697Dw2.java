package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.Dw2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31697Dw2 extends AbstractC66412zI {
    public final XAq A00;
    public final GYH A01;
    public final Integer A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        int i;
        String string;
        C70789Wh2 c70789Wh2 = (C70789Wh2) interfaceC66482zP;
        C31946E2a c31946E2a = (C31946E2a) c3oo;
        AbstractC167017dG.A1N(c70789Wh2, c31946E2a);
        View view = c31946E2a.A00;
        Context A0L = AbstractC166997dE.A0L(view);
        String str = c70789Wh2.A01;
        Integer num = this.A02;
        if (num != null && (string = A0L.getString(num.intValue())) != null) {
            str = string;
        }
        c31946E2a.A01.setText(str);
        ViewOnClickListenerC35687FpM.A00(view, 32, c70789Wh2, this);
        boolean z = c70789Wh2.A00.A0I;
        CircularImageView circularImageView = c31946E2a.A02;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        circularImageView.setVisibility(i);
        XAq xAq = this.A00;
        if (xAq != null) {
            xAq.ECz(view, c70789Wh2);
        }
    }

    public C31697Dw2(XAq xAq, GYH gyh, Integer num) {
        this.A01 = gyh;
        this.A00 = xAq;
        this.A02 = num;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        Integer num = this.A02;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        int i2 = R.layout.row_search_echo;
        if (num == null) {
            i2 = R.layout.row_search_for_x_echo;
        }
        return new C31946E2a(AbstractC31176DnK.A0A(layoutInflater, viewGroup, i2));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C70789Wh2.class;
    }
}
