package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.tam.mca.MailboxTamJNI;
import com.facebook.tamreportingshim.mca.MailboxTamReportingShimJNI;
import com.facebook.urlblackhole.mca.MailboxUrlBlackholeJNI;

/* loaded from: classes8.dex */
public final class LVK implements MailboxFeature.DbConnectionResolutionCallback {
    public final int A00;
    public final Object A01;

    public LVK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxFeature.DbConnectionResolutionCallback
    public final /* bridge */ /* synthetic */ Object run(Mailbox mailbox, SqliteHolder sqliteHolder) {
        long j;
        String str;
        int i;
        long j2;
        int i2;
        Object abstractC1351869s;
        switch (this.A00) {
            case 0:
                LVI lvi = (LVI) this.A01;
                j = lvi.A02;
                str = lvi.A05;
                i = 73;
                return MailboxTamJNI.dispatchCqlOJOO(i, j, str, sqliteHolder);
            case 1:
                j2 = ((LVJ) this.A01).A02;
                i2 = 74;
                return MailboxTamJNI.dispatchCqlOJO(i2, j2, sqliteHolder);
            case 2:
                LVI lvi2 = (LVI) this.A01;
                j = lvi2.A02;
                str = lvi2.A05;
                i = 75;
                return MailboxTamJNI.dispatchCqlOJOO(i, j, str, sqliteHolder);
            case 3:
                j2 = ((LVJ) this.A01).A02;
                i2 = 79;
                return MailboxTamJNI.dispatchCqlOJO(i2, j2, sqliteHolder);
            case 4:
                j2 = ((LVJ) this.A01).A02;
                i2 = 82;
                return MailboxTamJNI.dispatchCqlOJO(i2, j2, sqliteHolder);
            case 5:
                j2 = ((LVJ) this.A01).A02;
                i2 = 87;
                return MailboxTamJNI.dispatchCqlOJO(i2, j2, sqliteHolder);
            case 6:
                j2 = ((LVJ) this.A01).A02;
                i2 = 88;
                return MailboxTamJNI.dispatchCqlOJO(i2, j2, sqliteHolder);
            case 7:
                LUH luh = (LUH) this.A01;
                CQLResultSet cQLResultSet = (CQLResultSet) MailboxTamReportingShimJNI.dispatchCqlOJOO(0, luh.A00, luh.A03, sqliteHolder);
                if (cQLResultSet == null) {
                    abstractC1351869s = null;
                } else {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet);
                }
                return new MailboxNullable(abstractC1351869s);
            case 8:
                C48200LUy c48200LUy = (C48200LUy) this.A01;
                abstractC1351869s = MailboxTamReportingShimJNI.dispatchCqlOIJJOOOO(1, c48200LUy.A00, c48200LUy.A02, c48200LUy.A01, c48200LUy.A06, c48200LUy.A05, c48200LUy.A07, sqliteHolder);
                return new MailboxNullable(abstractC1351869s);
            case 9:
                C48192LUq c48192LUq = (C48192LUq) this.A01;
                abstractC1351869s = MailboxTamReportingShimJNI.dispatchCqlOIJJOOOOOOOO(2, 30, c48192LUq.A01, c48192LUq.A00, c48192LUq.A06, null, c48192LUq.A04, null, null, c48192LUq.A05, null, sqliteHolder);
                return new MailboxNullable(abstractC1351869s);
            default:
                abstractC1351869s = MailboxUrlBlackholeJNI.dispatchCqlOO(0, sqliteHolder);
                return new MailboxNullable(abstractC1351869s);
        }
    }
}
