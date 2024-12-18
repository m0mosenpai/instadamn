package X;

/* renamed from: X.4cR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99044cR {
    public final AbstractC29571bY A00;
    public final C1YP A01;
    public final AbstractC29601bb A02;

    public C99044cR(final C1YP c1yp) {
        this.A01 = c1yp;
        this.A00 = new AbstractC29571bY(c1yp) { // from class: X.4lm
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `screentime_sync` (`id`,`last_sync_time`,`tia_last_interval_end`) VALUES (nullif(?, 0),?,?)";
            }

            @Override // X.AbstractC29571bY
            public final /* bridge */ /* synthetic */ void bind(InterfaceC37561ot interfaceC37561ot, Object obj) {
                C116035Nh c116035Nh = (C116035Nh) obj;
                interfaceC37561ot.ADi(1, c116035Nh.A00);
                interfaceC37561ot.ADi(2, c116035Nh.A01);
                Long l = c116035Nh.A02;
                if (l == null) {
                    interfaceC37561ot.ADj(3);
                } else {
                    interfaceC37561ot.ADi(3, l.longValue());
                }
            }
        };
        this.A02 = new AbstractC29601bb(c1yp) { // from class: X.4ln
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "DELETE FROM screentime_sync";
            }
        };
    }
}
