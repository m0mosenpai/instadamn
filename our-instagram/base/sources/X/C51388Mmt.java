package X;

/* renamed from: X.Mmt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51388Mmt extends AbstractC29601bb {
    public final /* synthetic */ C2PZ A00;

    @Override // X.AbstractC29601bb
    public final String createQuery() {
        return "UPDATE clips_remix_original_media SET last_used_time_ms = ? WHERE media_id = ?";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51388Mmt(C1YP c1yp, C2PZ c2pz) {
        super(c1yp);
        this.A00 = c2pz;
    }
}
