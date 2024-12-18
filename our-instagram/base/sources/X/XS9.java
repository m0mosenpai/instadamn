package X;

/* loaded from: classes12.dex */
public final class XS9 extends AbstractC72715Xln implements InterfaceC73601YNd {
    public static final Object A00;
    public static final Object[] A01;
    public static final String[] A02;

    static {
        String[] strArr = {"user_alias_id", AbstractC58461Pvm.A00(9, 10, 49), "optimistic_session_id", "start_time_millis", "expiration_time_millis", "message_id"};
        A02 = strArr;
        A01 = new Object[]{"live_location_sessions.updaters.UpdateObject", "live_location_sessions", strArr, 0, null, null, "_id = ?", 1, null, 0};
        A00 = InterfaceC73584YMg.class;
    }

    public XS9() {
        super(A01);
    }

    @Override // X.InterfaceC73601YNd
    public final /* bridge */ /* synthetic */ InterfaceC73583YMc Csk(YPZ ypz) {
        return new YA9(ypz);
    }
}
