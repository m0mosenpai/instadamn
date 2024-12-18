package X;

import android.content.Context;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class U69 implements InterfaceC77833eB {
    public final /* synthetic */ C6FG A00;
    public final /* synthetic */ C102884kP A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ InterfaceC103384lE A03;

    public U69(C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2) {
        this.A00 = c6fg;
        this.A02 = interfaceC103384lE;
        this.A01 = c102884kP;
        this.A03 = interfaceC103384lE2;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        C6FG c6fg = this.A00;
        InterfaceC72039XGh interfaceC72039XGh = (InterfaceC72039XGh) c6fg.A01.get(R.id.bk_screen_container);
        if (interfaceC72039XGh != null) {
            interfaceC72039XGh.EZZ(new U7A(c6fg, this.A01, this.A02, this.A03));
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        InterfaceC72039XGh interfaceC72039XGh = (InterfaceC72039XGh) this.A00.A01.get(R.id.bk_screen_container);
        if (interfaceC72039XGh != null) {
            interfaceC72039XGh.EZZ(null);
        }
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC75733ae.A00(getClass());
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }
}
