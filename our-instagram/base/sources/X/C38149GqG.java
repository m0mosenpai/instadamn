package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GqG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38149GqG implements C32D {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C38086GpF A01;
    public final /* synthetic */ C37934GmW A02;

    public C38149GqG(UserSession userSession, C38086GpF c38086GpF, C37934GmW c37934GmW) {
        this.A00 = userSession;
        this.A01 = c38086GpF;
        this.A02 = c37934GmW;
    }

    @Override // X.C32D
    public final /* bridge */ /* synthetic */ void D9r(Object obj) {
        Integer num;
        C206259Bi c206259Bi = (C206259Bi) obj;
        C14360o3.A0B(c206259Bi, 0);
        C130455uq c130455uq = (C130455uq) c206259Bi.A02;
        UserSession userSession = this.A00;
        Object A05 = C127895qI.A05(userSession, null, c130455uq, false);
        C40861ut c40861ut = (C40861ut) c206259Bi.A04;
        if (c40861ut != null) {
            int A09 = c40861ut.A09();
            num = Integer.valueOf(A09);
            if (num != null && A09 >= 0) {
                C38086GpF c38086GpF = this.A01;
                if (A09 <= c38086GpF.A01.A03.size()) {
                    if (A05 != null) {
                        String str = this.A02.A05;
                        if (str == null) {
                            str = "";
                        }
                        c38086GpF.A06(str, A05, A09);
                        return;
                    }
                    return;
                }
            }
        } else {
            num = null;
        }
        long A01 = C18U.A01(C06090Tz.A05, userSession, 36597356200528683L);
        int size = this.A01.A01.A03.size();
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Attempted to inject a fallback section out of bounds at target position: ");
        A1C.append(num);
        A1C.append(", current grid section size is ");
        A1C.append(size);
        C0w9.A04("grid_acp", A1C.toString(), (int) A01);
    }
}
