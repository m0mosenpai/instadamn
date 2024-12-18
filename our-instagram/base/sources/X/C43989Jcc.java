package X;

import com.instagram.api.schemas.BizUserInboxState;

/* renamed from: X.Jcc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43989Jcc implements InterfaceC41501vz {
    public final /* synthetic */ JR2 A00;

    public C43989Jcc(JR2 jr2) {
        this.A00 = jr2;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-394291131);
        LY2 ly2 = (LY2) obj;
        int A032 = C0f9.A03(576561610);
        C14360o3.A0B(ly2, 0);
        C43626JRj A0q = this.A00.A0q();
        BizUserInboxState bizUserInboxState = ly2.A00;
        C14360o3.A0B(bizUserInboxState, 0);
        C43970JcJ c43970JcJ = A0q.A0E;
        if (c43970JcJ.A01 != bizUserInboxState) {
            c43970JcJ.A01 = bizUserInboxState;
            EnumC44025JdC A00 = AbstractC43963JcC.A00(bizUserInboxState, A0q.A01);
            A0q.A01 = A00;
            c43970JcJ.A08 = C43626JRj.A00(A0q, A00);
            C43626JRj.A04(A0q);
            C2056398n A002 = AbstractC2056298m.A00(A0q.A0B);
            int i = A0q.A01.A02;
            A002.A0G.Egi(A002, Integer.valueOf(i), C2056398n.A0d[10]);
        }
        C0f9.A0A(-641876687, A032);
        C0f9.A0A(642473258, A03);
    }
}
