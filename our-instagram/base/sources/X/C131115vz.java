package X;

import android.content.Context;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import java.io.IOException;

/* renamed from: X.5vz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131115vz implements Database.SchemaDeployer {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC136036Di A01;
    public final /* synthetic */ Database.SchemaDeployer A02;

    public C131115vz(Context context, AbstractC136036Di abstractC136036Di, Database.SchemaDeployer schemaDeployer) {
        this.A01 = abstractC136036Di;
        this.A00 = context;
        this.A02 = schemaDeployer;
    }

    @Override // com.facebook.msys.mci.Database.SchemaDeployer
    public final int upgrade(SqliteHolder sqliteHolder) {
        AbstractC09800fd.A01("PersistentSchemaDeployer.upgrade", 842197878);
        try {
            try {
                AbstractC136036Di abstractC136036Di = this.A01;
                abstractC136036Di.A0L();
                int upgrade = this.A02.upgrade(sqliteHolder);
                abstractC136036Di.A0P(upgrade);
                AbstractC09800fd.A00(-882965865);
                return upgrade;
            } catch (IOException e) {
                C0K8.A0F("MsysInfraDatabase", "Exception when performing schema upgrade", e);
                this.A01.A0P(1);
                AbstractC09800fd.A00(870966026);
                return 1;
            }
        } catch (Throwable th) {
            this.A01.A0P(1);
            AbstractC09800fd.A00(416973871);
            throw th;
        }
    }
}
