package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HIK extends AbstractC66412zI {
    public final Activity A00;
    public final UserSession A01;

    public HIK(Activity activity, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = activity;
        this.A01 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C42324Iom c42324Iom = (C42324Iom) interfaceC66482zP;
        C38448GvV c38448GvV = (C38448GvV) c3oo;
        AbstractC167017dG.A1N(c42324Iom, c38448GvV);
        C66479UJd c66479UJd = c38448GvV.A00;
        C42333Iov c42333Iov = c42324Iom.A00;
        AbstractC68577VWe.A00(c66479UJd, c42333Iov);
        InterfaceC16660sJ interfaceC16660sJ = c42333Iov.A01.A03;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(c66479UJd.A00);
        }
        C42333Iov c42333Iov2 = c42324Iom.A01;
        if (c42333Iov2 != null) {
            C66479UJd c66479UJd2 = c38448GvV.A01;
            AbstractC68577VWe.A00(c66479UJd2, c42333Iov2);
            InterfaceC16660sJ interfaceC16660sJ2 = c42333Iov2.A01.A03;
            if (interfaceC16660sJ2 != null) {
                interfaceC16660sJ2.invoke(c66479UJd2.A00);
            }
        }
        View view = c38448GvV.A01.A00;
        int i = 0;
        if (c42333Iov2 == null) {
            i = 4;
        }
        view.setVisibility(i);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        Activity activity = this.A00;
        C14360o3.A0B(activity, 0);
        boolean z = C50802Vb.A03;
        LayoutInflater layoutInflater2 = activity.getLayoutInflater();
        C14360o3.A07(layoutInflater2);
        return new C38448GvV(C50802Vb.A01(layoutInflater2, null, R.layout.product_tile_row));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42324Iom.class;
    }
}
