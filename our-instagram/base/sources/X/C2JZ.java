package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.2JZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2JZ implements InterfaceC13000lm {
    public List A00;
    public final UserSession A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC16820sZ A03;
    public final InterfaceC16820sZ A04;
    public final InterfaceC16820sZ A05;
    public final InterfaceC16820sZ A06;

    public C2JZ(UserSession userSession, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC16820sZ2, 3);
        C14360o3.A0B(interfaceC16820sZ3, 4);
        this.A01 = userSession;
        this.A04 = interfaceC16820sZ;
        this.A03 = interfaceC16820sZ2;
        this.A06 = interfaceC16820sZ3;
        this.A05 = interfaceC16820sZ4;
        this.A02 = interfaceC16820sZ5;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        List<InterfaceC12870lZ> list = this.A00;
        if (list != null) {
            for (InterfaceC12870lZ interfaceC12870lZ : list) {
                this.A03.invoke();
                C218914p.A06(interfaceC12870lZ);
            }
        }
        this.A00 = null;
    }
}
