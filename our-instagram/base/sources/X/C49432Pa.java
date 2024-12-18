package X;

/* renamed from: X.2Pa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49432Pa {
    public final C1YP A00;
    public final AbstractC29601bb A01;
    public final AbstractC29571bY A02;
    public final AbstractC29601bb A03;
    public final AbstractC29601bb A04;

    public C49432Pa(final C1YP c1yp) {
        this.A00 = c1yp;
        this.A02 = new AbstractC29571bY(c1yp) { // from class: X.2Py
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `story_drafts` (`draft_id`,`revision_id`,`composition_id`,`date_created`,`date_modified`,`media_info`,`persisted_media_info`,`media_edits`,`cover_file_path`) VALUES (?,?,?,?,?,?,?,?,?)";
            }

            @Override // X.AbstractC29571bY
            public final /* bridge */ /* synthetic */ void bind(InterfaceC37561ot interfaceC37561ot, Object obj) {
                throw new NullPointerException("getId");
            }
        };
        this.A04 = new AbstractC29601bb(c1yp) { // from class: X.2Pz
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "UPDATE story_drafts SET date_created = ? WHERE draft_id = ?";
            }
        };
        this.A03 = new AbstractC29601bb(c1yp) { // from class: X.2Q0
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "DELETE FROM story_drafts WHERE draft_id = ?";
            }
        };
        this.A01 = new AbstractC29601bb(c1yp) { // from class: X.2Q1
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "DELETE FROM story_drafts WHERE 1";
            }
        };
    }

    public C49432Pa() {
    }
}
