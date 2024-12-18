package X;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* loaded from: classes10.dex */
public final class QAI extends AbstractRunnableC129135sZ {
    public final /* synthetic */ C2L1 A00;
    public final /* synthetic */ UUID A01;

    public QAI(final C2L1 val$workManagerImpl, final UUID val$id) {
        this.A00 = val$workManagerImpl;
        this.A01 = val$id;
    }

    @Override // X.AbstractRunnableC129135sZ
    public final void A00() {
        C2L1 c2l1 = this.A00;
        WorkDatabase workDatabase = c2l1.A04;
        workDatabase.beginTransaction();
        try {
            A01(c2l1, this.A01.toString());
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            C2VU.A00(workDatabase, c2l1.A07);
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}
