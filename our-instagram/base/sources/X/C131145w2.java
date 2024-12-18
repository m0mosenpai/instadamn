package X;

import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* renamed from: X.5w2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131145w2 implements Database.SchemaDeployer {
    public final /* synthetic */ C131085vw A00;

    public C131145w2(C131085vw c131085vw) {
        this.A00 = c131085vw;
    }

    @Override // com.facebook.msys.mci.Database.SchemaDeployer
    public final int upgrade(SqliteHolder sqliteHolder) {
        return this.A00.A00.BHE().upgrade(sqliteHolder);
    }
}
