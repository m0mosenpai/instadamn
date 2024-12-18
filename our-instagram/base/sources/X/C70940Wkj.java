package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Wkj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70940Wkj implements InterfaceC199918sv {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C70940Wkj(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    @Override // X.InterfaceC199918sv
    public final void onClick() {
        int i = this.A00;
        C2046193v A00 = AbstractC2045993t.A00((UserSession) this.A03);
        if (i != 0) {
            Object obj = this.A02;
            synchronized (A00) {
                ((C195298kV) A00.A04.getValue()).A06(obj);
            }
            U1U u1u = ((U26) this.A01).A00.A06;
            if (u1u != null) {
                u1u.A01();
                u1u.A02();
                return;
            }
            return;
        }
        Object obj2 = this.A02;
        synchronized (A00) {
            InterfaceC09390do interfaceC09390do = A00.A04;
            ArrayList A0U = AbstractC001800i.A0U(((C195298kV) interfaceC09390do.getValue()).A04);
            A0U.add(0, obj2);
            ((C195298kV) interfaceC09390do.getValue()).A07(A0U.subList(0, Math.min(4, A0U.size())));
        }
        ((XLU) this.A01).DWI();
    }
}
