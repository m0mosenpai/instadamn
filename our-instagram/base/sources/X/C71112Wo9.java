package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Wo9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71112Wo9 implements InterfaceC161877Mx {
    public final int A00;
    public final Object A01;

    public C71112Wo9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC161877Mx
    public final boolean AJn(String str) {
        C68034V7f c68034V7f;
        UserSession A00;
        if (this.A00 != 0) {
            V1B v1b = (V1B) this.A01;
            c68034V7f = v1b.A07;
            A00 = v1b.A02;
        } else {
            C14360o3.A0B(str, 0);
            V1R v1r = (V1R) this.A01;
            c68034V7f = v1r.A08;
            if (c68034V7f == null) {
                C14360o3.A0F("dataSource");
                throw C00O.createAndThrow();
            }
            A00 = V1R.A00(v1r);
        }
        return c68034V7f.A0A(A00, str);
    }

    @Override // X.InterfaceC161877Mx
    public final void FAg() {
        C66095TzW c66095TzW;
        if (this.A00 != 0) {
            c66095TzW = ((V1B) this.A01).A05;
        } else {
            c66095TzW = ((V1R) this.A01).A06;
            if (c66095TzW == null) {
                C14360o3.A0F("adapter");
                throw C00O.createAndThrow();
            }
        }
        C66095TzW.A00(c66095TzW);
    }
}
