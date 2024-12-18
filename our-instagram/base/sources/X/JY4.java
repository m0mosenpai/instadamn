package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class JY4 extends AbstractC66412zI {
    public final UserSession A00;
    public final MR8 A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        MR8 mr8 = this.A01;
        UserSession userSession = this.A00;
        JY5.A01(userSession, mr8, (JYW) c3oo, (JTJ) interfaceC66482zP);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new JYW(JY5.A00(layoutInflater, viewGroup, this.A00));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return JTJ.class;
    }

    public JY4(UserSession userSession, MR8 mr8) {
        this.A01 = mr8;
        this.A00 = userSession;
    }
}
