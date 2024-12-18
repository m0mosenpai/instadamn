package X;

/* renamed from: X.Iom, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42324Iom implements InterfaceC66482zP {
    public final C42333Iov A00;
    public final C42333Iov A01;
    public final String A02;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C42333Iov c42333Iov;
        UPZ upz;
        C42333Iov c42333Iov2;
        UPZ upz2;
        C42324Iom c42324Iom = (C42324Iom) obj;
        C42333Iov c42333Iov3 = this.A00;
        C42333Iov c42333Iov4 = null;
        if (c42324Iom != null) {
            c42333Iov = c42324Iom.A00;
        } else {
            c42333Iov = null;
        }
        UPZ upz3 = c42333Iov3.A00;
        if (c42333Iov != null) {
            upz = c42333Iov.A00;
        } else {
            upz = null;
        }
        if (C14360o3.A0K(upz3, upz) && (c42333Iov2 = this.A01) != null) {
            if (c42324Iom != null) {
                c42333Iov4 = c42324Iom.A01;
            }
            UPZ upz4 = c42333Iov2.A00;
            if (c42333Iov4 != null) {
                upz2 = c42333Iov4.A00;
            } else {
                upz2 = null;
            }
            if (C14360o3.A0K(upz4, upz2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C42324Iom(C42333Iov c42333Iov, C42333Iov c42333Iov2, String str) {
        this.A02 = str;
        this.A00 = c42333Iov;
        this.A01 = c42333Iov2;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A00.A02);
        A1C.append(" + ");
        C42333Iov c42333Iov = this.A01;
        if (c42333Iov != null) {
            str = c42333Iov.A02;
        } else {
            str = null;
        }
        A1C.append(str);
        A1C.append('_');
        return AbstractC166997dE.A0x(this.A02, A1C);
    }
}
