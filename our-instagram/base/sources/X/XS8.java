package X;

/* loaded from: classes12.dex */
public final class XS8 extends AbstractC72715Xln implements InterfaceC73601YNd {
    public static final Object A00 = InterfaceC73584YMg.class;
    public static final Object[] A01;
    public static final String[] A02;

    static {
        String[] strArr = {"expiration_time_millis"};
        A02 = strArr;
        A01 = new Object[]{"live_location_sessions.updaters.SoftDeleteObject", "live_location_sessions", strArr, 0, null, null, "_id = ?", 1, null, 0};
    }

    public XS8() {
        super(A01);
    }

    @Override // X.InterfaceC73601YNd
    public final /* bridge */ /* synthetic */ InterfaceC73583YMc Csk(YPZ ypz) {
        return new YA9(ypz);
    }
}
