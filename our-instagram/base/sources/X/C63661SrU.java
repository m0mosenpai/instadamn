package X;

import java.lang.ref.WeakReference;

/* renamed from: X.SrU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63661SrU implements InterfaceC65307Thj {
    public final WeakReference A00;

    @Override // X.InterfaceC65307Thj
    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
        C58725Q5c c58725Q5c = (C58725Q5c) this.A00.get();
        if (c58725Q5c != null) {
            int i = c58725Q5c.A00;
            if (i != 0) {
                c58725Q5c.setImageResource(i);
            }
            InterfaceC65307Thj interfaceC65307Thj = c58725Q5c.A01;
            if (interfaceC65307Thj == null) {
                interfaceC65307Thj = C58725Q5c.A0D;
            }
            interfaceC65307Thj.onResult(obj);
        }
    }

    public C63661SrU(C58725Q5c c58725Q5c) {
        this.A00 = AbstractC25225BEi.A16(c58725Q5c);
    }
}
