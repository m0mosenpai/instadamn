package X;

import java.util.List;

/* renamed from: X.WdM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70585WdM implements InterfaceC71974XDh {
    public final XA2 A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;

    @Override // X.InterfaceC71974XDh
    public final String AYz() {
        return this.A01;
    }

    @Override // X.InterfaceC71974XDh
    public final String B35() {
        return this.A02;
    }

    @Override // X.InterfaceC71974XDh
    public final List B6B() {
        return this.A03;
    }

    @Override // X.InterfaceC71974XDh
    public final boolean Ca7() {
        return this.A04;
    }

    public C70585WdM(XA2 xa2, String str, String str2, List list, boolean z) {
        AbstractC37302Gc3.A1U(str, str2);
        this.A00 = xa2;
        this.A04 = z;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = list;
    }
}
