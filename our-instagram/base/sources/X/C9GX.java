package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9GX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9GX implements InterfaceC08830cm {
    public final int A00;
    public final Object A01;

    public C9GX(InterfaceC16820sZ interfaceC16820sZ, int i) {
        this.A00 = i;
        if (7 - i != 0) {
            this.A01 = interfaceC16820sZ;
        } else {
            this.A01 = interfaceC16820sZ;
        }
    }

    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.A00) {
            case 0:
                C208769Lk c208769Lk = (C208769Lk) this.A01;
                return new C95334Qt(c208769Lk.A08, c208769Lk.A0H, c208769Lk.A0U);
            case 1:
                C23851Ah3 c23851Ah3 = (C23851Ah3) this.A01;
                UserSession userSession = c23851Ah3.A0C;
                return new C24150AnZ(c23851Ah3.A08, c23851Ah3.A0A, userSession, c23851Ah3, c23851Ah3.A0R);
            case 2:
                return new C23728Af1(((C23851Ah3) this.A01).A0R);
            case 3:
                C22925A8v c22925A8v = ((OK0) this.A01).A08;
                return new C72093XNn(c22925A8v.A01, c22925A8v.A00);
            case 4:
                return ((C7XQ) this.A01).A0d.getValue();
            case 5:
                InterfaceC163837Ux C7r = ((C7U0) ((C7XQ) this.A01).A0t.invoke()).C7r();
                if (C7r.CeQ()) {
                    return C7r.BSH();
                }
                return null;
            case 6:
                return ((C7U0) ((C7XQ) this.A01).A0t.invoke()).C7r().Afi();
            case 7:
                return Boolean.valueOf(AbstractC167007dF.A1W(((InterfaceC16820sZ) this.A01).invoke()));
            case 8:
                return ((C7U0) ((InterfaceC08830cm) this.A01).get()).C7r();
            case 9:
                InterfaceC69973Cg interfaceC69973Cg = ((C164197Wi) this.A01).A0E.A00;
                if (interfaceC69973Cg != null) {
                    return interfaceC69973Cg;
                }
                C14360o3.A0F("captureFlowHelper");
                throw C00O.createAndThrow();
            case 10:
                return ((C7U0) ((InterfaceC08830cm) this.A01).get()).BT6();
            case 11:
                return AbstractC54332en.A00((UserSession) this.A01);
            default:
                return ((InterfaceC16820sZ) this.A01).invoke();
        }
    }

    public C9GX(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
