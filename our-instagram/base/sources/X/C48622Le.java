package X;

/* renamed from: X.2Le, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48622Le extends C1Ym {
    public static final C48622Le A00 = new C48622Le();

    @Override // X.C1Ym
    public final void migrate(InterfaceC37481ol interfaceC37481ol) {
        C14360o3.A0B(interfaceC37481ol, 0);
        interfaceC37481ol.ATG("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
        interfaceC37481ol.ATG("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
        interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
        interfaceC37481ol.ATG("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
        interfaceC37481ol.ATG("DROP TABLE `SystemIdInfo`");
        interfaceC37481ol.ATG("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
    }

    public C48622Le() {
        super(15, 16);
    }
}
