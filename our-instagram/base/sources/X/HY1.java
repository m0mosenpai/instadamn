package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HY1 extends AbstractC72082XNa implements InterfaceC55612h1, InterfaceC74303Vl, InterfaceC57963Pn9 {
    public long A00;
    public long A01;
    public final UserSession A02;
    public final C38071Gp0 A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HY1(C37960Gn2 c37960Gn2, UserSession userSession) {
        super(c37960Gn2);
        C14360o3.A0B(c37960Gn2, 4);
        this.A02 = userSession;
        C39174HMc c39174HMc = (C39174HMc) super.A00.reinterpret(C39174HMc.class);
        C1DY A0b = AbstractC25235BEs.A0b(C1DS.A00(userSession));
        List<InterfaceC43511JJx> list = c39174HMc.A00;
        list = list == null ? c39174HMc.A0o(100526016, C39246HRj.class) : list;
        ArrayList A0i = AbstractC167007dF.A0i(list);
        for (InterfaceC43511JJx interfaceC43511JJx : list) {
            interfaceC43511JJx.E9b(A0b);
            A0i.add(interfaceC43511JJx);
        }
        c39174HMc.A00 = A0i;
        C38071Gp0 c38071Gp0 = new C38071Gp0();
        List A0o = A0i == null ? c39174HMc.A0o(100526016, C39246HRj.class) : A0i;
        ArrayList A0i2 = AbstractC167007dF.A0i(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            A0i2.add(new C38061Goo((InterfaceC43511JJx) it.next()));
        }
        c38071Gp0.A05 = A0i2;
        String str = c38071Gp0.A04;
        if (str != null) {
            AbstractC38076Gp5.A00(A0i2, str);
        }
        this.A03 = c38071Gp0;
        this.A00 = -1L;
        this.A01 = -1L;
    }

    @Override // X.InterfaceC55612h1
    public final /* synthetic */ void EQh(String str) {
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A01;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A00;
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQG() {
        return true;
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQT() {
        return false;
    }

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        return AbstractC167007dF.A1M((this.A00 > (-1L) ? 1 : (this.A00 == (-1L) ? 0 : -1)));
    }

    @Override // X.InterfaceC57963Pn9
    public final C38071Gp0 EqR() {
        C38071Gp0 c38071Gp0 = this.A03;
        c38071Gp0.A01 = this.A00;
        c38071Gp0.A00 = this.A01;
        return c38071Gp0;
    }

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        return super.A00.reinterpret(C39174HMc.class);
    }

    @Override // X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return null;
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A01 = j;
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        this.A00 = j;
    }
}
