package X;

import java.util.List;

/* renamed from: X.Nna, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53629Nna {
    public final void A00(int i, int i2) {
        if (this instanceof C51065MhL) {
            List list = ((C51065MhL) this).A00;
            MSX.A0u(0, list);
            MSX.A0u(i, list);
            MSX.A0u(i2, list);
            return;
        }
        InterfaceC65452xh interfaceC65452xh = ((C51064MhK) this).A00.A03;
        if (interfaceC65452xh != null) {
            interfaceC65452xh.D2j(i, i2, null);
        } else {
            C14360o3.A0F("updateCallback");
            throw C00O.createAndThrow();
        }
    }

    public final void A01(int i, int i2) {
        if (this instanceof C51065MhL) {
            List list = ((C51065MhL) this).A00;
            MSX.A0u(1, list);
            MSX.A0u(i, list);
            MSX.A0u(i2, list);
            return;
        }
        InterfaceC65452xh interfaceC65452xh = ((C51064MhK) this).A00.A03;
        if (interfaceC65452xh != null) {
            interfaceC65452xh.DMJ(i, i2);
        } else {
            C14360o3.A0F("updateCallback");
            throw C00O.createAndThrow();
        }
    }
}
