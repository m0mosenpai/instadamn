package X;

/* renamed from: X.99y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2059699y extends AbstractC2059399u {
    public final C1YP A00;
    public final AbstractC29601bb A01;
    public final AbstractC29601bb A02;
    public final AbstractC29571bY A03;

    public C2059699y(final C1YP c1yp) {
        this.A00 = c1yp;
        this.A03 = new AbstractC29571bY(c1yp) { // from class: X.99z
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `messages_table` (`thread_jid`,`sender_jid`,`item_id`,`payload`,`payload_blob`,`hidden`,`shh`,`offline_threading_id`,`message_expiration_ts_sec`,`hidden_ts_sec`,`message_deletion_ts_sec`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // X.AbstractC29571bY
            public final /* bridge */ /* synthetic */ void bind(InterfaceC37561ot interfaceC37561ot, Object obj) {
                C9ZN c9zn = (C9ZN) obj;
                interfaceC37561ot.ADi(1, c9zn.A02);
                interfaceC37561ot.ADi(2, c9zn.A01);
                interfaceC37561ot.ADp(3, c9zn.A06);
                interfaceC37561ot.ADp(4, c9zn.A08);
                byte[] bArr = c9zn.A0A;
                if (bArr == null) {
                    interfaceC37561ot.ADj(5);
                } else {
                    interfaceC37561ot.ADc(5, bArr);
                }
                interfaceC37561ot.ADi(6, c9zn.A09 ? 1L : 0L);
                interfaceC37561ot.ADi(7, c9zn.A00);
                interfaceC37561ot.ADp(8, c9zn.A07);
                if (c9zn.A05 == null) {
                    interfaceC37561ot.ADj(9);
                } else {
                    interfaceC37561ot.ADi(9, r0.intValue());
                }
                if (c9zn.A03 == null) {
                    interfaceC37561ot.ADj(10);
                } else {
                    interfaceC37561ot.ADi(10, r0.intValue());
                }
                if (c9zn.A04 == null) {
                    interfaceC37561ot.ADj(11);
                } else {
                    interfaceC37561ot.ADi(11, r0.intValue());
                }
            }
        };
        this.A01 = new AbstractC29601bb(c1yp) { // from class: X.9A0
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "DELETE FROM messages_table WHERE thread_jid == ?";
            }
        };
        this.A02 = new AbstractC29601bb(c1yp) { // from class: X.9A1
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "UPDATE messages_table SET hidden = 1, hidden_ts_sec = ? WHERE thread_jid == ? AND item_id <= ? AND shh == 1 AND hidden == 0";
            }
        };
    }
}
