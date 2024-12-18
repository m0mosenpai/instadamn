package X;

import android.content.res.Resources;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CII {
    public static InterfaceC30801Dgc A00(Resources resources, InterfaceC30822Dgx interfaceC30822Dgx) {
        InterfaceC30801Dgc interfaceC30801Dgc;
        if (interfaceC30822Dgx instanceof C26206BiW) {
            C5QE c5qe = ((C26206BiW) interfaceC30822Dgx).A00;
            C14360o3.A0B(c5qe, 1);
            return new C26179Bi4(c5qe.A01(resources).toString());
        }
        if (interfaceC30822Dgx instanceof C29247Cuq) {
            interfaceC30801Dgc = C29182Ctn.A00;
        } else if (interfaceC30822Dgx instanceof C29248Cur) {
            interfaceC30801Dgc = C29183Cto.A00;
        } else {
            throw B4Z.A00();
        }
        return interfaceC30801Dgc;
    }
}
