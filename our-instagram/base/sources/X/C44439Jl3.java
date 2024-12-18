package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Jl3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44439Jl3 extends C00H {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44439Jl3(InterfaceC74963Ym interfaceC74963Ym, boolean z) {
        super(z);
        this.A00 = 0;
        this.A01 = interfaceC74963Ym;
    }

    @Override // X.C00H
    public final void A01() {
        boolean z;
        switch (this.A00) {
            case 0:
                AbstractC166987dD.A1Y(AbstractC25226BEj.A1B(this.A01));
                return;
            case 1:
                K5C k5c = (K5C) this.A01;
                UserSession userSession = k5c.A00;
                if (userSession != null) {
                    z = false;
                    AbstractC25651Mw.A00(userSession).E4s(new C36106Fwg(AbstractC62241S3m.A00(k5c.A01), "fbap", false));
                    if (k5c.A00 == null) {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                break;
            case 2:
                if (((K5Y) this.A01).A06 != null) {
                    z = false;
                    break;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            case 3:
                A04(false);
                P1C p1c = (P1C) this.A01;
                p1c.A03.ClQ();
                AbstractC25226BEj.A1Q(p1c.A01);
                return;
            default:
                C32265EJa c32265EJa = (C32265EJa) this.A01;
                C006802i A00 = C32265EJa.A00(c32265EJa);
                int i = c32265EJa.A00;
                A00.markerPoint(i, "nux_cancel_click");
                C32265EJa.A00(c32265EJa).markerEnd(i, (short) 2);
                A04(false);
                AbstractC31177DnL.A13(c32265EJa);
                return;
        }
        A04(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44439Jl3(Object obj, int i) {
        super(true);
        this.A00 = i;
        this.A01 = obj;
    }
}
