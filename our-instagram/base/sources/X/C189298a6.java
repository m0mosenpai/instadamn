package X;

/* renamed from: X.8a6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189298a6 implements InterfaceC189288a4 {
    public static final C189298a6 A00;
    public static final C8a5[] A01;
    public static final C8a5 A02;
    public static final String[] A03;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.8a6] */
    static {
        C8a5 c8a5 = new C8a5(1, "6b7603bffac240d4073c8a1b8f725fda0bbeb2a4", new String[]{"CREATE TABLE ig_meta_migrations\n(\nschema_name TEXT NOT NULL,\nsequence INTEGER NOT NULL,\nchecksum TEXT NOT NULL,\nPRIMARY KEY (schema_name, sequence)\n)"});
        A02 = c8a5;
        A00 = new Object();
        A01 = new C8a5[]{c8a5};
        A03 = new String[]{"ig_meta_migrations"};
    }

    @Override // X.InterfaceC189288a4
    public final String getName() {
        return "meta";
    }

    @Override // X.InterfaceC189288a4
    public final C8a5[] BTm() {
        return A01;
    }

    @Override // X.InterfaceC189288a4
    public final String[] C4v() {
        return A03;
    }
}
