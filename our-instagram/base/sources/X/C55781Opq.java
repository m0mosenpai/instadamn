package X;

import android.text.TextUtils;

/* renamed from: X.Opq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55781Opq implements InterfaceC57910PmG {
    public int A00;
    public int A01;
    public String A02;

    @Override // X.InterfaceC57910PmG
    public final boolean CTw(InterfaceC57910PmG interfaceC57910PmG) {
        if (!(interfaceC57910PmG instanceof C55781Opq)) {
            return false;
        }
        C55781Opq c55781Opq = (C55781Opq) interfaceC57910PmG;
        if (this.A00 != c55781Opq.A00 || this.A01 != c55781Opq.A01 || !TextUtils.equals(this.A02, c55781Opq.A02)) {
            return false;
        }
        return true;
    }
}
