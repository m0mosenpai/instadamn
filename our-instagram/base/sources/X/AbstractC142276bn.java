package X;

/* renamed from: X.6bn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC142276bn {
    public static final C1Ym A08 = new C1Ym() { // from class: X.6bo
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("\n          ALTER TABLE effects\n          ADD COLUMN useHandsFree INTEGER NOT NULL DEFAULT 0\n        ");
            interfaceC37481ol.ATG("\n          ALTER TABLE effects\n          ADD COLUMN handsFreeDurationMs INTEGER NOT NULL DEFAULT 0\n        ");
        }
    };
    public static final C1Ym A09 = new C1Ym() { // from class: X.6bp
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("\n          ALTER TABLE effects\n          ADD COLUMN isEncrypted INTEGER NOT NULL DEFAULT 0\n        ");
        }
    };
    public static final C1Ym A0A = new C1Ym() { // from class: X.6bq
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("\n          ALTER TABLE effect_collections\n          ADD COLUMN hasMore INTEGER NOT NULL DEFAULT 0\n        ");
        }
    };
    public static final C1Ym A0B = new C1Ym() { // from class: X.6br
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("\n          ALTER TABLE effects\n          ADD COLUMN syncedAt INTEGER NOT NULL DEFAULT 0\n        ");
        }
    };
    public static final C1Ym A0C = new C1Ym() { // from class: X.6bs
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("\n          ALTER TABLE effects\n          ADD COLUMN shaderPackMetadata TEXT\n        ");
        }
    };
    public static final C1Ym A0D = new C1Ym() { // from class: X.6bt
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("\n          ALTER TABLE effects\n          ADD COLUMN productCapabilities TEXT NOT NULL DEFAULT \"\"\n        ");
        }
    };
    public static final C1Ym A0E = new C1Ym() { // from class: X.6bu
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("\n          ALTER TABLE effects\n          ADD COLUMN transparentBackgroundThumbnailUrl TEXT\n        ");
        }
    };
    public static final C1Ym A0F = new C1Ym() { // from class: X.6bv
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("\n          ALTER TABLE effects\n          ADD COLUMN fanClubId TEXT\n        ");
        }
    };
    public static final C1Ym A0G = new C1Ym() { // from class: X.6bw
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("\n          ALTER TABLE effects\n          ADD COLUMN isCreativeTool INTEGER NOT NULL DEFAULT 0\n        ");
        }
    };
    public static final C1Ym A00 = new C1Ym() { // from class: X.6bx
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("\n          ALTER TABLE effects\n          ADD COLUMN isUserSafetyWarningRequired INTEGER NOT NULL DEFAULT 0\n        ");
        }
    };
    public static final C1Ym A01 = new C1Ym() { // from class: X.6by
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("\n          ALTER TABLE effects\n          ADD COLUMN usesFlmCapability INTEGER NOT NULL DEFAULT 0\n        ");
        }
    };
    public static final C1Ym A02 = new C1Ym() { // from class: X.6bz
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("\n          ALTER TABLE effects\n          ADD COLUMN creativeToolDescription TEXT\n        ");
        }
    };
    public static final C1Ym A03 = new C1Ym() { // from class: X.6c0
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("\n          ALTER TABLE effects\n          ADD COLUMN formattedMediaCount TEXT\n        ");
        }
    };
    public static final C1Ym A04 = new C1Ym() { // from class: X.6c1
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("\n          ALTER TABLE effects\n          ADD COLUMN formattedMediaCountAccessibility TEXT\n        ");
        }
    };
    public static final C1Ym A05 = new C1Ym() { // from class: X.6c2
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("\n          ALTER TABLE effects\n          ADD COLUMN avatarSdkPresetGlb TEXT\n        ");
        }
    };
    public static final C1Ym A06 = new C1Ym() { // from class: X.6c3
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("\n          ALTER TABLE effects\n          ADD COLUMN requiredSdkVersion TEXT\n        ");
            interfaceC37481ol.ATG("\n          ALTER TABLE effects\n          ADD COLUMN bestInstanceId TEXT\n        ");
        }
    };
    public static final C1Ym A07 = new C1Ym() { // from class: X.6c4
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("\n          ALTER TABLE effects\n          ADD COLUMN avatarType TEXT\n        ");
        }
    };
}
