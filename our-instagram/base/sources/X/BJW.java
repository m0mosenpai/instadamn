package X;

import android.content.Context;
import android.view.View;

/* loaded from: classes5.dex */
public final class BJW implements InterfaceC77833eB {
    public final /* synthetic */ C6FG A00;
    public final /* synthetic */ C102884kP A01;
    public final /* synthetic */ InterfaceC103384lE A02;

    public BJW(C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE) {
        this.A01 = c102884kP;
        this.A02 = interfaceC103384lE;
        this.A00 = c6fg;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        C14360o3.A0B(view, 1);
        view.setOnClickListener(null);
        view.setClickable(false);
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        View A0S = AbstractC25228BEl.A0S(obj);
        final C102884kP c102884kP = this.A01;
        final InterfaceC103384lE interfaceC103384lE = this.A02;
        final C6FG c6fg = this.A00;
        C0fQ.A00(new View.OnClickListener() { // from class: X.5x9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-841538802);
                C102884kP c102884kP2 = c102884kP;
                InterfaceC103384lE interfaceC103384lE2 = interfaceC103384lE;
                C6FX c6fx = new C6FX();
                c6fx.A01(c102884kP2);
                C6FG c6fg2 = c6fg;
                c6fx.A02(c6fg2);
                C6FP.A03(c6fg2, c102884kP2, new C6FW(c6fx.A00), interfaceC103384lE2);
                C0f9.A0C(1582647647, A05);
            }
        }, A0S);
        return null;
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC25228BEl.A1B(this);
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
