package X;

import com.instagram.user.model.User;

/* renamed from: X.Iwe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42802Iwe implements InterfaceC58060Pol {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C42802Iwe(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.InterfaceC58060Pol
    public final void Dm6(User user) {
        switch (this.A00) {
            case 0:
                ((HDC) this.A02).E17((C38266GsB) this.A01);
                return;
            case 1:
                ((HDE) this.A02).E17((C38266GsB) this.A01);
                return;
            case 2:
                ((HDD) this.A02).E17((C38266GsB) this.A01);
                return;
            default:
                ((HDB) this.A01).E17((C38266GsB) this.A02);
                return;
        }
    }

    @Override // X.InterfaceC58060Pol
    public final void Dtb(User user) {
        switch (this.A00) {
            case 0:
                ((HDC) this.A02).DtX(user);
                return;
            case 1:
                ((HDE) this.A02).DtX(user);
                return;
            case 2:
                ((HDD) this.A02).DtX(user);
                return;
            default:
                ((HDB) this.A01).DtX(user);
                return;
        }
    }
}
