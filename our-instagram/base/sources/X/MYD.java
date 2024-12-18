package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class MYD extends AbstractC66412zI {
    public final InterfaceC55362gb A00;
    public final C66082yk A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C52360NEy c52360NEy = (C52360NEy) interfaceC66482zP;
        C81423kC c81423kC = (C81423kC) c3oo;
        AbstractC167017dG.A1N(c52360NEy, c81423kC);
        this.A01.ADw(this.A00, c52360NEy.A00, c81423kC);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C52360NEy.class;
    }

    public MYD(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC55362gb interfaceC55362gb) {
        this.A00 = interfaceC55362gb;
        this.A01 = new C66082yk(interfaceC11380iw, userSession);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C81423kC(this.A01.Csl(layoutInflater, viewGroup));
    }
}
