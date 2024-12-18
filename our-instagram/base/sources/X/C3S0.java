package X;

/* renamed from: X.3S0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3S0 {
    public final AbstractC29571bY A00;
    public final C1YP A01;
    public final AbstractC29601bb A02;
    public final AbstractC49502Ph A03;
    public final AbstractC49502Ph A04;
    public final AbstractC29601bb A05;
    public final AbstractC29601bb A06;
    public final AbstractC29601bb A07;

    public C3S0(final C1YP c1yp) {
        this.A01 = c1yp;
        this.A00 = new AbstractC29571bY(c1yp) { // from class: X.3S1
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `examples` (`id`,`example_id`,`use_case`,`use_case_version`,`model_version`,`label`,`features`,`timestamp`,`label_timestamp`,`context`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
            }

            @Override // X.AbstractC29571bY
            public final /* bridge */ /* synthetic */ void bind(InterfaceC37561ot interfaceC37561ot, Object obj) {
                C4DI c4di = (C4DI) obj;
                interfaceC37561ot.ADi(1, c4di.A02);
                interfaceC37561ot.ADp(2, c4di.A06);
                interfaceC37561ot.ADp(3, c4di.A08);
                interfaceC37561ot.ADp(4, c4di.A09);
                interfaceC37561ot.ADi(5, c4di.A03);
                interfaceC37561ot.ADi(6, c4di.A00);
                interfaceC37561ot.ADp(7, c4di.A07);
                interfaceC37561ot.ADi(8, c4di.A04);
                interfaceC37561ot.ADi(9, c4di.A01);
                interfaceC37561ot.ADp(10, c4di.A05);
            }
        };
        this.A03 = new AbstractC49502Ph(c1yp) { // from class: X.3S2
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "DELETE FROM `examples` WHERE `id` = ?";
            }

            @Override // X.AbstractC49502Ph
            public final /* bridge */ /* synthetic */ void A01(InterfaceC37561ot interfaceC37561ot, Object obj) {
                interfaceC37561ot.ADi(1, ((C4DI) obj).A02);
            }
        };
        this.A04 = new AbstractC49502Ph(c1yp) { // from class: X.3S3
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "UPDATE OR REPLACE `examples` SET `id` = ?,`example_id` = ?,`use_case` = ?,`use_case_version` = ?,`model_version` = ?,`label` = ?,`features` = ?,`timestamp` = ?,`label_timestamp` = ?,`context` = ? WHERE `id` = ?";
            }

            @Override // X.AbstractC49502Ph
            public final /* bridge */ /* synthetic */ void A01(InterfaceC37561ot interfaceC37561ot, Object obj) {
                C4DI c4di = (C4DI) obj;
                long j = c4di.A02;
                interfaceC37561ot.ADi(1, j);
                interfaceC37561ot.ADp(2, c4di.A06);
                interfaceC37561ot.ADp(3, c4di.A08);
                interfaceC37561ot.ADp(4, c4di.A09);
                interfaceC37561ot.ADi(5, c4di.A03);
                interfaceC37561ot.ADi(6, c4di.A00);
                interfaceC37561ot.ADp(7, c4di.A07);
                interfaceC37561ot.ADi(8, c4di.A04);
                interfaceC37561ot.ADi(9, c4di.A01);
                interfaceC37561ot.ADp(10, c4di.A05);
                interfaceC37561ot.ADi(11, j);
            }
        };
        this.A05 = new AbstractC29601bb(c1yp) { // from class: X.3S4
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "\n        UPDATE examples\n        SET label = ?,\n        label_timestamp = ?\n        WHERE context= ?\n        ";
            }
        };
        this.A06 = new AbstractC29601bb(c1yp) { // from class: X.3S5
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "\n        UPDATE examples\n        SET label = ?,\n        label_timestamp = ?\n        WHERE context != ?\n        AND label = -1\n        ";
            }
        };
        this.A02 = new AbstractC29601bb(c1yp) { // from class: X.3S6
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "\n        DELETE  FROM examples\n        WHERE use_case = ?\n        AND use_case_version = ?\n        ";
            }
        };
        this.A07 = new AbstractC29601bb(c1yp) { // from class: X.3S7
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "\n        DELETE  FROM examples\n        WHERE use_case = ?\n        AND use_case_version = ?\n        AND context = ?\n        ";
            }
        };
    }

    public C3S0() {
    }
}
