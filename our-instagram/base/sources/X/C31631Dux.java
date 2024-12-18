package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dux, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31631Dux extends AbstractC66412zI {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final C53N A03;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C31609Dub c31609Dub = (C31609Dub) interfaceC66482zP;
        C31549DtZ c31549DtZ = (C31549DtZ) c3oo;
        Context context = this.A01;
        UserSession userSession = this.A02;
        if (c31609Dub != null) {
            C31522Dt6 c31522Dt6 = c31609Dub.A00;
            if (c31549DtZ != null) {
                AbstractC31550Dta.A00(context, userSession, this.A03, c31549DtZ, c31522Dt6.A01, c31522Dt6.A02);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        boolean A1R = AbstractC167007dF.A1R(0, viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        int i2 = this.A00;
        View inflate = layoutInflater.inflate(R.layout.find_people_activation_list, viewGroup, false);
        inflate.setBackgroundResource(i2);
        inflate.setTag(new C31549DtZ(inflate, A1R));
        return new C31549DtZ(inflate, A1R);
    }

    public C31631Dux(Context context, UserSession userSession, C53N c53n, int i) {
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = c53n;
        this.A00 = i;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C31609Dub.class;
    }
}
