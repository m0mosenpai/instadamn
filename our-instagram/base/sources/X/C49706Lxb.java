package X;

import com.facebook.msys.mca.MailboxNullable;
import java.util.HashMap;

/* renamed from: X.Lxb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49706Lxb implements InterfaceC42241xE {
    public final /* synthetic */ C4El A00;
    public final /* synthetic */ boolean A01;

    public C49706Lxb(C4El c4El, boolean z) {
        this.A00 = c4El;
        this.A01 = z;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        int A02;
        MailboxNullable mailboxNullable = (MailboxNullable) obj;
        C14360o3.A0B(mailboxNullable, 0);
        AbstractC1351869s abstractC1351869s = (AbstractC1351869s) mailboxNullable.value;
        if (abstractC1351869s != null && (A02 = AbstractC43592JPx.A02(abstractC1351869s)) != 0) {
            HashMap A1G = AbstractC166987dD.A1G();
            for (int i = 0; i < A02; i++) {
                String string = abstractC1351869s.mResultSet.getString(i, 1);
                String A0v = AbstractC43592JPx.A0v(abstractC1351869s, i, 1);
                C14360o3.A07(A0v);
                A1G.put(string, new C42321xM(A0v, null, abstractC1351869s.mResultSet.getString(i, 6), AbstractC31178DnM.A03(abstractC1351869s.mResultSet.getNullableLong(i, 3)), AbstractC25232BEp.A0t(abstractC1351869s.mResultSet.getNullableLong(i, 5)), AbstractC167007dF.A1P(abstractC1351869s.mResultSet.getInteger(i, 2), 2), false));
            }
            if (!A1G.isEmpty()) {
                abstractC1351869s.mResultSet.getCount();
                A1G.size();
                C4El.A03(this.A00, A1G, this.A01, false);
            }
        }
    }
}
