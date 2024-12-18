package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class U6A extends AbstractC135366Al {
    public final /* synthetic */ C6FG A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U6A(C6FG c6fg, long j) {
        super(j);
        this.A00 = c6fg;
    }

    @Override // X.AbstractC135366Al
    public final /* bridge */ /* synthetic */ Object A00(Context context, View view, Object obj, Object obj2) {
        InterfaceC72039XGh interfaceC72039XGh;
        C102884kP c102884kP = (C102884kP) obj;
        C14360o3.A0B(c102884kP, 2);
        C102884kP A08 = c102884kP.A08(35);
        if (A08 != null && (interfaceC72039XGh = (InterfaceC72039XGh) this.A00.A01.get(R.id.bk_screen_container)) != null) {
            InterfaceC65469Tkm A04 = AbstractC86593tX.A04(A08, A08.A05);
            if (interfaceC72039XGh instanceof InterfaceC71944XBt) {
                A04 = new U6I(A04, obj2);
            }
            interfaceC72039XGh.D6r(A04);
        }
        return null;
    }

    @Override // X.AbstractC135366Al
    public final /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2, Object obj3, Object obj4) {
        C102884kP c102884kP = (C102884kP) obj;
        C102884kP c102884kP2 = (C102884kP) obj2;
        C14360o3.A0B(c102884kP, 0);
        C14360o3.A0B(c102884kP2, 1);
        InterfaceC72039XGh interfaceC72039XGh = (InterfaceC72039XGh) this.A00.A01.get(R.id.bk_screen_container);
        if (interfaceC72039XGh instanceof InterfaceC71944XBt) {
            return ((InterfaceC71944XBt) interfaceC72039XGh).Ek1(c102884kP, c102884kP2, obj3, obj4);
        }
        C102884kP A08 = c102884kP.A08(35);
        C102884kP A082 = c102884kP2.A08(35);
        if (A08 != null && A08.equals(A082) && obj3 == obj4) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
    }
}
