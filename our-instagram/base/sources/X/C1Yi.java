package X;

/* renamed from: X.1Yi, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1Yi {
    public static final C1Ym A00 = new C1Ym() { // from class: X.1Yk
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            StringBuilder sb = new StringBuilder();
            sb.append("ALTER TABLE user_feed_items ADD COLUMN item_type TEXT NOT NULL DEFAULT '");
            sb.append(C1XV.A0Y);
            sb.append('\'');
            interfaceC37481ol.ATG(sb.toString());
            interfaceC37481ol.ATG("CREATE INDEX index_user_feed_items_item_type ON user_feed_items (item_type)");
        }
    };
}
