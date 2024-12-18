package X;

import kotlin.Deprecated;

/* renamed from: X.1aI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC28801aI {
    public final int version;

    public abstract void createAllTables(InterfaceC37481ol interfaceC37481ol);

    public abstract void dropAllTables(InterfaceC37481ol interfaceC37481ol);

    public abstract void onCreate(InterfaceC37481ol interfaceC37481ol);

    public abstract void onOpen(InterfaceC37481ol interfaceC37481ol);

    public abstract void onPostMigrate(InterfaceC37481ol interfaceC37481ol);

    public abstract void onPreMigrate(InterfaceC37481ol interfaceC37481ol);

    public abstract A6Q onValidateSchema(InterfaceC37481ol interfaceC37481ol);

    public AbstractC28801aI(int i) {
        this.version = i;
    }

    @Deprecated(message = "Use [onValidateSchema(SupportSQLiteDatabase)]")
    public void validateMigration(InterfaceC37481ol interfaceC37481ol) {
        throw new UnsupportedOperationException("validateMigration is deprecated");
    }
}
