package X;

/* renamed from: X.87e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1823987e {
    public final AbstractC29571bY A00;
    public final C1YP A01;
    public final AbstractC29601bb A02;

    public C1823987e(final C1YP c1yp) {
        this.A01 = c1yp;
        this.A00 = new AbstractC29571bY(c1yp) { // from class: X.87f
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `mini_gallery_categories` (`miniGallerySurface`,`categoryId`,`displayName`,`syncedAt`,`id`,`isDefaultCategory`) VALUES (?,?,?,?,?,?)";
            }

            @Override // X.AbstractC29571bY
            public final /* bridge */ /* synthetic */ void bind(InterfaceC37561ot interfaceC37561ot, Object obj) {
                C172987nC c172987nC = (C172987nC) obj;
                interfaceC37561ot.ADp(1, c172987nC.A04);
                interfaceC37561ot.ADp(2, c172987nC.A01);
                interfaceC37561ot.ADp(3, c172987nC.A02);
                interfaceC37561ot.ADi(4, c172987nC.A00);
                interfaceC37561ot.ADp(5, c172987nC.A03);
                interfaceC37561ot.ADi(6, c172987nC.A05 ? 1L : 0L);
            }
        };
        this.A02 = new AbstractC29601bb(c1yp) { // from class: X.87g
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "DELETE FROM mini_gallery_categories";
            }
        };
    }

    public C1823987e() {
    }
}
