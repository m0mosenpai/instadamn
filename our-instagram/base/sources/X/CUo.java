package X;

import android.content.Context;
import com.meta.foa.session.FoaUserSession;

/* loaded from: classes5.dex */
public final class CUo {
    public CTL A00;
    public final Context A01;
    public final CVA A02;
    public final FoaUserSession A03;
    public final InterfaceC018407e A04;
    public final java.util.Set A05;

    public CUo(Context context, InterfaceC018407e interfaceC018407e, CVA cva, FoaUserSession foaUserSession) {
        C14360o3.A0B(interfaceC018407e, 4);
        this.A01 = context;
        this.A02 = cva;
        this.A03 = foaUserSession;
        this.A04 = interfaceC018407e;
        this.A05 = AbstractC166987dD.A1H();
    }

    public final CWZ A00() {
        CTL ctl = this.A00;
        if (ctl != null) {
            return ctl.A03;
        }
        throw new RuntimeException("Can't access the container owner outside the Screen's content callback");
    }

    public final InterfaceC09390do A01(Object obj, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        CTL ctl = this.A00;
        if (ctl != null) {
            java.util.Set set = this.A05;
            if (!set.contains(obj)) {
                set.add(obj);
                return AbstractC09440dt.A00(EnumC09460dv.A02, C29901DGp.A00(interfaceC16660sJ, obj, ctl, interfaceC16820sZ, 38));
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Can't use contextScoped on the same key more than once per content creation (key=");
            A1C.append(obj);
            throw new RuntimeException(AbstractC166997dE.A0x("). If you need to use contextScoped to get multiple instances of the same class, use an explicit key to differentiate each call.", A1C));
        }
        throw new RuntimeException("Can't use contextScoped outside the Screen's content callback");
    }
}
