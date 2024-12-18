package X;

/* renamed from: X.4Vo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96534Vo {
    public final AbstractC29571bY A00;
    public final C1YP A01;
    public final AbstractC29601bb A02;

    public C96534Vo(final C1YP c1yp) {
        this.A01 = c1yp;
        this.A00 = new AbstractC29571bY(c1yp) { // from class: X.4Vp
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `user_reel_medias` (`id`,`media_ids`,`data`,`stored_time`) VALUES (?,?,?,?)";
            }

            @Override // X.AbstractC29571bY
            public final /* bridge */ /* synthetic */ void bind(InterfaceC37561ot interfaceC37561ot, Object obj) {
                C97084Xt c97084Xt = (C97084Xt) obj;
                interfaceC37561ot.ADp(1, c97084Xt.A01);
                interfaceC37561ot.ADp(2, c97084Xt.A02);
                interfaceC37561ot.ADc(3, c97084Xt.A03);
                interfaceC37561ot.ADi(4, c97084Xt.A00);
            }
        };
        this.A02 = new AbstractC29601bb(c1yp) { // from class: X.4Vq
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "\n    DELETE FROM user_reel_medias\n    WHERE id NOT IN (\n      SELECT id\n      FROM user_reel_medias\n      WHERE stored_time > ?\n      ORDER BY stored_time DESC\n      LIMIT ?\n    )\n  ";
            }
        };
    }

    public C96534Vo() {
    }
}
