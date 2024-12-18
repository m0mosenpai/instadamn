package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.6WT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6WT {
    public InterfaceC143576dw A00;
    public final InterfaceC018407e A01;
    public final CR7 A02;

    public C6WT(View view, C07X c07x, InterfaceC018407e interfaceC018407e, C206329Bp c206329Bp, UserSession userSession, InterfaceC147266kB interfaceC147266kB, C147236jz c147236jz) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c147236jz, 4);
        C14360o3.A0B(c206329Bp, 5);
        C14360o3.A0B(interfaceC147266kB, 7);
        C55571Om7 c55571Om7 = new C55571Om7(interfaceC018407e.getViewModelStore(), c206329Bp, userSession, c147236jz);
        this.A01 = c55571Om7;
        CR7 cr7 = new CR7(view, c55571Om7, userSession);
        this.A02 = cr7;
        C07T lifecycle = c07x.getLifecycle();
        C14360o3.A0B(lifecycle, 1);
        OB1 ob1 = new OB1(view, lifecycle);
        int hashCode = lifecycle.hashCode();
        AbstractC47892LDm.A00.put(Integer.valueOf(hashCode), ob1);
        lifecycle.A09(new LRX(hashCode));
        Iterator it = cr7.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC16660sJ) it.next()).invoke(c07x);
        }
        interfaceC147266kB.A95(new C48550Ldn(c07x, interfaceC147266kB, this));
    }
}
