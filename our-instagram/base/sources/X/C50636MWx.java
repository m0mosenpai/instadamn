package X;

/* renamed from: X.MWx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50636MWx extends AbstractC29601bb {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50636MWx(C1YP c1yp, MXP mxp, int i) {
        super(c1yp);
        this.A00 = i;
        this.A01 = mxp;
    }

    @Override // X.AbstractC29601bb
    public final String createQuery() {
        switch (this.A00) {
            case 0:
                return "UPDATE drafts SET is_uploading = ? WHERE id = ?";
            case 1:
                return "DELETE FROM drafts WHERE id = ?";
            default:
                return "DELETE FROM drafts";
        }
    }
}
