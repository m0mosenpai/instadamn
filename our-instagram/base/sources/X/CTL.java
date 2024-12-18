package X;

import com.meta.foa.session.FoaUserSession;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class CTL {
    public InterfaceC16820sZ A00;
    public final C07X A01;
    public final InterfaceC018407e A02;
    public final CWZ A03;
    public final InterfaceC30961DjI A04;
    public final C27987CVk A05;
    public final CVA A06;
    public final FoaUserSession A07;
    public final Object A08;
    public final Map A0D = AbstractC166987dD.A1G();
    public final List A0A = AbstractC166987dD.A1E();
    public final List A09 = AbstractC166987dD.A1E();
    public final List A0B = AbstractC166987dD.A1E();
    public final List A0C = AbstractC166987dD.A1E();

    public CTL(C07X c07x, InterfaceC018407e interfaceC018407e, CWZ cwz, InterfaceC30961DjI interfaceC30961DjI, C27987CVk c27987CVk, CVA cva, FoaUserSession foaUserSession, Object obj) {
        this.A03 = cwz;
        this.A06 = cva;
        this.A07 = foaUserSession;
        this.A01 = c07x;
        this.A02 = interfaceC018407e;
        this.A05 = c27987CVk;
        this.A08 = obj;
        this.A04 = interfaceC30961DjI;
        c07x.getLifecycle().A09(new C65968TxL(this, 2));
    }
}
