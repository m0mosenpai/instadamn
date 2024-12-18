package X;

import com.facebook.msys.mci.DatabaseConnection;

/* renamed from: X.M2p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49922M2p implements Runnable {
    public final /* synthetic */ DatabaseConnection.DatabaseRunnable A00;
    public final /* synthetic */ DatabaseConnection A01;

    public RunnableC49922M2p(DatabaseConnection.DatabaseRunnable databaseRunnable, DatabaseConnection databaseConnection) {
        this.A01 = databaseConnection;
        this.A00 = databaseRunnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.execute(this.A00);
    }
}
