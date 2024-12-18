package X;

/* renamed from: X.87a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1823687a {
    public static final C1Ym A00 = new C1Ym() { // from class: X.87b
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("\n          ALTER TABLE mini_gallery_categories\n          ADD COLUMN isDefaultCategory INTEGER NOT NULL DEFAULT 0\n        ");
        }
    };
}
