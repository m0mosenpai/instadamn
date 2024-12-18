package X;

import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* renamed from: X.5w0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131125w0 implements Database.SchemaDeployer {
    public final /* synthetic */ C131085vw A00;

    public C131125w0(C131085vw c131085vw) {
        this.A00 = c131085vw;
    }

    @Override // com.facebook.msys.mci.Database.SchemaDeployer
    public final int upgrade(SqliteHolder sqliteHolder) {
        AbstractC09800fd.A01("InMemorySchemaDeployer.upgrade", -362784319);
        try {
            C131085vw c131085vw = this.A00;
            AbstractC136036Di abstractC136036Di = c131085vw.A01;
            abstractC136036Di.A0K();
            int upgrade = c131085vw.A00.BHF().upgrade(sqliteHolder);
            abstractC136036Di.A0O(upgrade);
            AbstractC09800fd.A00(-226781349);
            return upgrade;
        } catch (Throwable th) {
            AbstractC09800fd.A00(-1934660788);
            throw th;
        }
    }
}
