package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IzC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42960IzC implements C32D {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C68033V7e A01;

    public C42960IzC(UserSession userSession, C68033V7e c68033V7e) {
        this.A00 = userSession;
        this.A01 = c68033V7e;
    }

    @Override // X.C32D
    public final /* bridge */ /* synthetic */ void D9r(Object obj) {
        Integer num;
        C206259Bi c206259Bi = (C206259Bi) obj;
        C14360o3.A0B(c206259Bi, 0);
        Object A05 = C127895qI.A05(this.A00, null, (C130455uq) c206259Bi.A02, false);
        C40861ut c40861ut = (C40861ut) c206259Bi.A04;
        if (c40861ut != null) {
            int A09 = c40861ut.A09();
            num = Integer.valueOf(A09);
            if (num != null && A09 >= 0) {
                C68033V7e c68033V7e = this.A01;
                if (A09 <= c68033V7e.A05()) {
                    if (A05 != null) {
                        c68033V7e.A08(A09, AbstractC37302Gc3.A02((Number) c206259Bi.A03), A05);
                        return;
                    }
                    return;
                }
            }
        } else {
            num = null;
        }
        int A052 = this.A01.A05();
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Attempted to inject a fallback section out of bounds at target position: ");
        A1C.append(num);
        A1C.append(", current grid section size is ");
        A1C.append(A052);
        C0w9.A04("grid_acp", A1C.toString(), 1000);
    }
}
