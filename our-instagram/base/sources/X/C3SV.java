package X;

/* renamed from: X.3SV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3SV {
    public final AbstractC29571bY A00;
    public final C1YP A01;
    public final AbstractC29601bb A02;

    public final void A00(long j) {
        C1YP c1yp = this.A01;
        c1yp.assertNotSuspendingTransaction();
        AbstractC29601bb abstractC29601bb = this.A02;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        acquire.ADi(1, j);
        try {
            c1yp.beginTransaction();
            try {
                acquire.ATb();
                c1yp.setTransactionSuccessful();
            } finally {
                c1yp.endTransaction();
            }
        } finally {
            abstractC29601bb.release(acquire);
        }
    }

    public C3SV(final C1YP c1yp) {
        this.A01 = c1yp;
        this.A00 = new AbstractC29571bY(c1yp) { // from class: X.3SW
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `signals` (`id`,`signal_id`,`timestamp`,`signal_component_id`,`context`,`type`,`long_value`,`float_value`,`text_value`,`expiration_timestamp`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
            }

            @Override // X.AbstractC29571bY
            public final /* bridge */ /* synthetic */ void bind(InterfaceC37561ot interfaceC37561ot, Object obj) {
                C73753Sd c73753Sd = (C73753Sd) obj;
                interfaceC37561ot.ADi(1, c73753Sd.A00);
                interfaceC37561ot.ADp(2, c73753Sd.A08);
                interfaceC37561ot.ADi(3, c73753Sd.A03);
                if (c73753Sd.A05 == null) {
                    interfaceC37561ot.ADj(4);
                } else {
                    interfaceC37561ot.ADi(4, r0.intValue());
                }
                String str = c73753Sd.A07;
                if (str == null) {
                    interfaceC37561ot.ADj(5);
                } else {
                    interfaceC37561ot.ADp(5, str);
                }
                interfaceC37561ot.ADi(6, c73753Sd.A01);
                Long l = c73753Sd.A06;
                if (l == null) {
                    interfaceC37561ot.ADj(7);
                } else {
                    interfaceC37561ot.ADi(7, l.longValue());
                }
                if (c73753Sd.A04 == null) {
                    interfaceC37561ot.ADj(8);
                } else {
                    interfaceC37561ot.ADg(8, r0.floatValue());
                }
                String str2 = c73753Sd.A09;
                if (str2 == null) {
                    interfaceC37561ot.ADj(9);
                } else {
                    interfaceC37561ot.ADp(9, str2);
                }
                interfaceC37561ot.ADi(10, c73753Sd.A02);
            }
        };
        this.A02 = new AbstractC29601bb(c1yp) { // from class: X.3SX
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "\n        DELETE FROM signals\n        WHERE expiration_timestamp < ?\n      ";
            }
        };
    }

    public C3SV() {
    }
}
