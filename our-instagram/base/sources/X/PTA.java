package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* loaded from: classes9.dex */
public final class PTA implements Runnable {
    public final /* synthetic */ P0A A00;
    public final /* synthetic */ InterfaceC58147PqC A01;
    public final /* synthetic */ FilterGroupModel A02;
    public final /* synthetic */ EnumC53116NeT[] A03;

    public PTA(P0A p0a, InterfaceC58147PqC interfaceC58147PqC, FilterGroupModel filterGroupModel, EnumC53116NeT[] enumC53116NeTArr) {
        this.A00 = p0a;
        this.A02 = filterGroupModel;
        this.A03 = enumC53116NeTArr;
        this.A01 = interfaceC58147PqC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P0A p0a = this.A00;
        Context context = p0a.A0A;
        UserSession userSession = p0a.A0C;
        InterfaceC197178nn interfaceC197178nn = p0a.A0I;
        P0A.A00(new C55723Oop(context, userSession, p0a.A0H, this.A01, this.A02, interfaceC197178nn, this.A03), p0a);
    }
}
