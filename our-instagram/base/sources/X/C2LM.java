package X;

/* renamed from: X.2LM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2LM extends C1Ym {
    public static final C2LM A00 = new C2LM();

    public C2LM() {
        super(1, 2);
    }

    @Override // X.C1Ym
    public final void migrate(InterfaceC37481ol interfaceC37481ol) {
        C14360o3.A0B(interfaceC37481ol, 0);
        interfaceC37481ol.ATG("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        interfaceC37481ol.ATG("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        interfaceC37481ol.ATG("DROP TABLE IF EXISTS alarmInfo");
        interfaceC37481ol.ATG("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
