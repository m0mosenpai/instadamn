package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* loaded from: classes8.dex */
public final class LU8 implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;

    public LU8(Object obj, long j, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = j;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final void onCompletion(Object obj) {
        Object obj2;
        if (this.A00 != 0) {
            AbstractC1351869s abstractC1351869s = (AbstractC1351869s) ((MailboxNullable) obj).value;
            if (abstractC1351869s != null) {
                long A05 = AbstractC43592JPx.A05(abstractC1351869s.mResultSet.getString(0, 1));
                String string = abstractC1351869s.mResultSet.getString(0, 2);
                String string2 = abstractC1351869s.mResultSet.getString(0, 3);
                long A0L = AbstractC166987dD.A0L(abstractC1351869s.mResultSet.getLong(0, 4));
                int integer = abstractC1351869s.mResultSet.getInteger(0, 6);
                byte[] blob = abstractC1351869s.mResultSet.getBlob(0, 5);
                C47934LFh c47934LFh = (C47934LFh) this.A02;
                long j = this.A01;
                C14360o3.A0A(string);
                C14360o3.A0A(string2);
                C47934LFh.A00(c47934LFh, string, string2, blob, integer, j, A05, A0L);
                return;
            }
            return;
        }
        C1346766r c1346766r = (C1346766r) this.A02;
        long j2 = this.A01;
        C137766Ly c137766Ly = C137766Ly.A0L;
        AbstractC1351869s abstractC1351869s2 = (AbstractC1351869s) ((MailboxNullable) obj).value;
        if (abstractC1351869s2 != null && AbstractC43592JPx.A02(abstractC1351869s2) > 0) {
            long j3 = abstractC1351869s2.mResultSet.getLong(0, 0);
            obj2 = new C4JL(new MsysThreadId(EnumC92794Ds.A04, Long.valueOf(j2), j3));
        } else {
            obj2 = C4JK.A00;
        }
        c1346766r.A02(obj2);
        c1346766r.A00();
    }
}
