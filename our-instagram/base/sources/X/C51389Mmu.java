package X;

/* renamed from: X.Mmu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51389Mmu extends AbstractC29601bb {
    public final /* synthetic */ C2PZ A00;

    @Override // X.AbstractC29601bb
    public final String createQuery() {
        return "DELETE FROM clips_remix_original_media WHERE media_id IN (SELECT media_id FROM (SELECT media_id, last_used_time_ms FROM clips_remix_original_media ORDER BY last_used_time_ms) LIMIT MAX(((SELECT COUNT(*) FROM clips_remix_original_media) - ?), 0))";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51389Mmu(C1YP c1yp, C2PZ c2pz) {
        super(c1yp);
        this.A00 = c2pz;
    }
}
